/*
 *   Copyright 2016-2022 Oleksii V. KHALIKOV
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package ua.com.gfalcon.ibkr.server.spring.configuration;

import java.io.IOException;
import java.math.BigDecimal;

import org.threeten.bp.DateTimeException;
import org.threeten.bp.Instant;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZonedDateTime;
import org.threeten.bp.format.DateTimeFormatter;
import org.threeten.bp.temporal.Temporal;
import org.threeten.bp.temporal.TemporalAccessor;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonTokenId;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.datatype.threetenbp.DecimalUtils;
import com.fasterxml.jackson.datatype.threetenbp.deser.ThreeTenDateTimeDeserializerBase;
import com.fasterxml.jackson.datatype.threetenbp.function.BiFunction;
import com.fasterxml.jackson.datatype.threetenbp.function.Function;

import ua.com.gfalcon.ibkr.server.spring.DateTimeUtils;

/**
 * Deserializer for ThreeTen temporal {@link Instant}s, {@link OffsetDateTime}, and {@link ZonedDateTime}s.
 * Adapted from the jackson threetenbp InstantDeserializer to add support for deserializing rfc822 format.
 *
 * @author Nick Williams
 */
public class CustomInstantDeserializer<T extends Temporal> extends ThreeTenDateTimeDeserializerBase<T> {

    public static final CustomInstantDeserializer<Instant> INSTANT = new CustomInstantDeserializer<>(Instant.class,
            DateTimeFormatter.ISO_INSTANT, Instant::from, a -> Instant.ofEpochMilli(a.value),
            a -> Instant.ofEpochSecond(a.integer, a.fraction), null);

    public static final CustomInstantDeserializer<OffsetDateTime> OFFSET_DATE_TIME = new CustomInstantDeserializer<>(
            OffsetDateTime.class, DateTimeFormatter.ISO_OFFSET_DATE_TIME, OffsetDateTime::from,
            a -> OffsetDateTime.ofInstant(Instant.ofEpochMilli(a.value), a.zoneId),
            a -> OffsetDateTime.ofInstant(Instant.ofEpochSecond(a.integer, a.fraction), a.zoneId),
            (d, z) -> d.withOffsetSameInstant(z.getRules()
                    .getOffset(d.toLocalDateTime())));

    public static final CustomInstantDeserializer<ZonedDateTime> ZONED_DATE_TIME = new CustomInstantDeserializer<>(
            ZonedDateTime.class, DateTimeFormatter.ISO_ZONED_DATE_TIME, ZonedDateTime::from,
            a -> ZonedDateTime.ofInstant(Instant.ofEpochMilli(a.value), a.zoneId),
            a -> ZonedDateTime.ofInstant(Instant.ofEpochSecond(a.integer, a.fraction), a.zoneId),
            ZonedDateTime::withZoneSameInstant);

    private static final long serialVersionUID = 1L;

    protected final Function<FromIntegerArguments, T> fromMilliseconds;

    protected final Function<FromDecimalArguments, T> fromNanoseconds;

    protected final Function<TemporalAccessor, T> parsedToValue;

    protected final BiFunction<T, ZoneId, T> adjust;

    protected CustomInstantDeserializer(Class<T> supportedType, DateTimeFormatter parser,
            Function<TemporalAccessor, T> parsedToValue, Function<FromIntegerArguments, T> fromMilliseconds,
            Function<FromDecimalArguments, T> fromNanoseconds, BiFunction<T, ZoneId, T> adjust) {
        super(supportedType, parser);
        this.parsedToValue = parsedToValue;
        this.fromMilliseconds = fromMilliseconds;
        this.fromNanoseconds = fromNanoseconds;
        this.adjust = adjust == null ? new BiFunction<T, ZoneId, T>() {
            @Override
            public T apply(T t, ZoneId zoneId) {
                return t;
            }
        } : adjust;
    }

    @SuppressWarnings("unchecked")
    protected CustomInstantDeserializer(CustomInstantDeserializer<T> base, DateTimeFormatter f) {
        super((Class<T>) base.handledType(), f);
        parsedToValue = base.parsedToValue;
        fromMilliseconds = base.fromMilliseconds;
        fromNanoseconds = base.fromNanoseconds;
        adjust = base.adjust;
    }

    @Override
    public T deserialize(JsonParser parser, DeserializationContext context) throws IOException {
        //NOTE: Timestamps contain no timezone info, and are always in configured TZ. Only
        //string values have to be adjusted to the configured TZ.
        int i = parser.currentTokenId();
        if (i == JsonTokenId.ID_NUMBER_FLOAT) {
            BigDecimal value = parser.getDecimalValue();
            long seconds = value.longValue();
            int nanoseconds = DecimalUtils.extractNanosecondDecimal(value, seconds);
            return fromNanoseconds.apply(new FromDecimalArguments(seconds, nanoseconds, getZone(context)));
        } else if (i == JsonTokenId.ID_NUMBER_INT) {
            long timestamp = parser.getLongValue();
            if (context.isEnabled(DeserializationFeature.READ_DATE_TIMESTAMPS_AS_NANOSECONDS)) {
                return this.fromNanoseconds.apply(new FromDecimalArguments(timestamp, 0, this.getZone(context)));
            }
            return this.fromMilliseconds.apply(new FromIntegerArguments(timestamp, this.getZone(context)));
        } else if (i == JsonTokenId.ID_STRING) {
            String string = parser.getText()
                    .trim();
            if (string.length() == 0) {
                return null;
            }
            if (string.endsWith("+0000")) {
                string = string.substring(0, string.length() - 5) + "Z";
            }
            T value;
            try {
                TemporalAccessor acc = _formatter.parse(string);
                value = parsedToValue.apply(acc);
                if (context.isEnabled(DeserializationFeature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE)) {
                    return adjust.apply(value, this.getZone(context));
                }
            } catch (DateTimeException e) {
                throw _peelDTE(e);
            }
            return value;
        }
        throw context.mappingException("Expected type float, integer, or string.");
    }

    private ZoneId getZone(DeserializationContext context) {
        // Instants are always in UTC, so don't waste compute cycles
        return (_valueClass == Instant.class) ? null : DateTimeUtils.timeZoneToZoneId(context.getTimeZone());
    }

    @Override
    protected ThreeTenDateTimeDeserializerBase<T> withDateFormat(DateTimeFormatter dtf) {
        if (dtf == _formatter) {
            return this;
        }
        return new CustomInstantDeserializer<T>(this, dtf);
    }

    @Override
    protected ThreeTenDateTimeDeserializerBase<T> withLeniency(Boolean aBoolean) {
        return null;
    }

    @Override
    protected ThreeTenDateTimeDeserializerBase<T> withShape(JsonFormat.Shape shape) {
        if (shape == _shape) {
            return this;
        }
        return null;
    }

    private static class FromIntegerArguments {

        public final long value;

        public final ZoneId zoneId;

        private FromIntegerArguments(long value, ZoneId zoneId) {
            this.value = value;
            this.zoneId = zoneId;
        }

    }

    private static class FromDecimalArguments {

        public final long integer;

        public final int fraction;

        public final ZoneId zoneId;

        private FromDecimalArguments(long integer, int fraction, ZoneId zoneId) {
            this.integer = integer;
            this.fraction = fraction;
            this.zoneId = zoneId;
        }

    }

}
