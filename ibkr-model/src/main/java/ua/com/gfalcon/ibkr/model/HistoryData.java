/*
 * MIT License
 *
 * Copyright (c) 2015-2022 Oleksii Khalikov
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package ua.com.gfalcon.ibkr.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * HistoryData.
 */
@Validated
public class HistoryData {

    /**
     * Underlying symbol.
     **/
    @JsonProperty("symbol")
    @ApiModelProperty(value = "Underlying symbol")
    @SerializedName("symbol")
    private String symbol = null;

    /**
     * companyName.
     **/
    @JsonProperty("text")
    @ApiModelProperty(value = "companyName")
    @SerializedName("text")
    private String text = null;

    /**
     * priceFactor is price increment obtained from display rule.
     **/
    @JsonProperty("priceFactor")
    @ApiModelProperty(example = "100", value = "priceFactor is price increment obtained from display rule")
    @SerializedName("priceFactor")
    private Integer priceFactor = null;

    /**
     * start date time in the format YYYYMMDD-HH:mm:ss.
     **/
    @ApiModelProperty(value = "start date time in the format YYYYMMDD-HH:mm:ss")
    @JsonProperty("startTime")
    @SerializedName("startTime")
    private String startTime = null;

    /**
     * High value during this time series with format %h/%v/%t.
     * %h is the high price (scaled by priceFactor),
     * %v is volume (volume factor will always be 100 (reported volume = actual volume/100)) and
     * %t is minutes from start time of the chart
     **/
    @ApiModelProperty(
            value = "High value during this time series with format %h/%v/%t."
                    + " %h is the high price (scaled by priceFactor),"
                    + " %v is volume (volume factor will always be 100 (reported volume = actual volume/100)) and"
                    + " %t is minutes from start time of the chart ")
    @JsonProperty("high")
    @SerializedName("high")
    private String high = null;

    /**
     * Low value during this time series with format %l/%v/%t. %l is the low price (scaled by priceFactor),
     * %v is volume (volume factor will always be 100 (reported volume = actual volume/100)) and
     * %t is minutes from start time of the chart
     **/
    @ApiModelProperty(
            value = "Low value during this time series with format %l/%v/%t. %l is the low price"
                    + " (scaled by priceFactor), %v is volume (volume factor will always be 100"
                    + " (reported volume = actual volume/100)) and %t is minutes from start time of the chart ")
    @JsonProperty("low")
    @SerializedName("low")
    private String low = null;

    /**
     * The duration for the historical data request.
     **/
    @ApiModelProperty(value = "The duration for the historical data request")
    @JsonProperty("timePeriod")
    @SerializedName("timePeriod")
    private String timePeriod = null;

    /**
     * The number of seconds in a bar.
     **/
    @ApiModelProperty(value = "The number of seconds in a bar")
    @JsonProperty("barLength")
    @SerializedName("barLength")
    private Integer barLength = null;

    /**
     * Market Data Availability. The field may contain two chars.
     * The first char is the primary code: S = Streaming, R = Realtime, D = Delayed, Z = Frozen, Y = Frozen Delayed.
     * The second char is the secondary code: P = Snapshot Available, p = Consolidated.
     **/
    @ApiModelProperty(
            value = "Market Data Availability. The field may contain two chars. The first char is the primary code:"
                    + " S = Streaming, R = Realtime, D = Delayed, Z = Frozen, Y = Frozen Delayed."
                    + " The second char is the secondary code: P = Snapshot Available, p = Consolidated. ")
    @JsonProperty("mdAvailability")
    @SerializedName("mdAvailability")
    private String mdAvailability = null;

    /**
     * The time it takes, in milliseconds, to process the historical data request.
     **/
    @ApiModelProperty(value = "The time it takes, in milliseconds, to process the historical data request")
    @JsonProperty("mktDataDelay")
    @SerializedName("mktDataDelay")
    private Integer mktDataDelay = null;

    /**
     * The historical data returned includes outside of regular trading hours.
     **/
    @ApiModelProperty(value = "The historical data returned includes outside of regular trading hours ")
    @JsonProperty("outsideRth")
    @SerializedName("outsideRth")
    private Boolean outsideRth = null;

    /**
     * The number of seconds in the trading day.
     **/
    @ApiModelProperty(value = "The number of seconds in the trading day")
    @JsonProperty("tradingDayDuration")
    @SerializedName("tradingDayDuration")
    private Integer tradingDayDuration = null;

    @ApiModelProperty(value = "")
    @JsonProperty("volumeFactor")
    @SerializedName("volumeFactor")
    private Integer volumeFactor = null;

    @ApiModelProperty(value = "")
    @JsonProperty("priceDisplayRule")
    @SerializedName("priceDisplayRule")
    private Integer priceDisplayRule = null;

    @ApiModelProperty(value = "")
    @JsonProperty("priceDisplayValue")
    @SerializedName("priceDisplayValue")
    private String priceDisplayValue = null;

    @ApiModelProperty(value = "")
    @JsonProperty("negativeCapable")
    @SerializedName("negativeCapable")
    private Boolean negativeCapable = null;

    @ApiModelProperty(value = "")
    @JsonProperty("messageVersion")
    @SerializedName("messageVersion")
    private Integer messageVersion = null;

    @ApiModelProperty(value = "")
    @JsonProperty("data")
    @Valid
    @SerializedName("data")
    private List<Object> data = new ArrayList<Object>();

    /**
     * total number of points.
     **/
    @ApiModelProperty(value = "total number of points")
    @JsonProperty("points")
    @SerializedName("points")
    private Integer points = null;

    @ApiModelProperty(value = "")
    @JsonProperty("travelTime")
    @SerializedName("travelTime")
    private Integer travelTime = null;

    /**
     * The number of seconds in a bar.
     *
     * @return barLength
     **/
    @JsonProperty("barLength")
    @ApiModelProperty(value = "The number of seconds in a bar")
    public Integer getBarLength() {
        return barLength;
    }

    public void setBarLength(Integer barLength) {
        this.barLength = barLength;
    }

    /**
     * Get data.
     *
     * @return data
     **/
    @JsonProperty("data")
    @ApiModelProperty(value = "")
    public List<Object> getData() {
        return data;
    }

    public void setData(List<Object> data) {
        this.data = data;
    }

    /**
     * High value during this time series with format %h/%v/%t. %h is the high price (scaled by priceFactor), %v is
     * volume (volume factor will always be 100 (reported volume &#x3D; actual volume/100)) and %t is minutes from start
     * time of the chart
     *
     * @return high
     **/
    @JsonProperty("high")
    @ApiModelProperty(
            value = "High value during this time series with format %h/%v/%t. "
                    + "%h is the high price (scaled by priceFactor), "
                    + "%v is volume (volume factor will always be 100 (reported volume = actual volume/100)) and "
                    + "%t is minutes from start time of the chart ")
    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    /**
     * Low value during this time series with format %l/%v/%t. %l is the low price (scaled by priceFactor), %v is volume
     * (volume factor will always be 100 (reported volume &#x3D; actual volume/100)) and %t is minutes from start time
     * of the chart
     *
     * @return low
     **/
    @JsonProperty("low")
    @ApiModelProperty(
            value = "Low value during this time series with format %l/%v/%t. "
                    + "%l is the low price (scaled by priceFactor), "
                    + "%v is volume (volume factor will always be 100 (reported volume = actual volume/100)) and "
                    + "%t is minutes from start time of the chart ")
    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }

    /**
     * Market Data Availability. The field may contain two chars. The first char is the primary code: S &#x3D;
     * Streaming, R &#x3D; Realtime, D &#x3D; Delayed, Z &#x3D; Frozen, Y &#x3D; Frozen Delayed. The second char is the
     * secondary code: P &#x3D; Snapshot Available, p &#x3D; Consolidated.
     *
     * @return mdAvailability
     **/
    @JsonProperty("mdAvailability")
    @ApiModelProperty(
            value = "Market Data Availability. The field may contain two chars. The first char is the primary code:"
                    + " S = Streaming, R = Realtime, D = Delayed, Z = Frozen, Y = Frozen Delayed."
                    + " The second char is the secondary code: P = Snapshot Available, p = Consolidated. ")
    public String getMdAvailability() {
        return mdAvailability;
    }

    public void setMdAvailability(String mdAvailability) {
        this.mdAvailability = mdAvailability;
    }

    /**
     * Get messageVersion.
     *
     * @return messageVersion
     **/
    @JsonProperty("messageVersion")
    @ApiModelProperty(value = "")
    public Integer getMessageVersion() {
        return messageVersion;
    }

    public void setMessageVersion(Integer messageVersion) {
        this.messageVersion = messageVersion;
    }

    /**
     * The time it takes, in milliseconds, to process the historical data request.
     *
     * @return mktDataDelay
     **/
    @JsonProperty("mktDataDelay")
    @ApiModelProperty(value = "The time it takes, in milliseconds, to process the historical data request")
    public Integer getMktDataDelay() {
        return mktDataDelay;
    }

    public void setMktDataDelay(Integer mktDataDelay) {
        this.mktDataDelay = mktDataDelay;
    }

    /**
     * total number of points.
     *
     * @return points
     **/
    @JsonProperty("points")
    @ApiModelProperty(value = "total number of points")
    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    /**
     * Get priceDisplayRule.
     *
     * @return priceDisplayRule
     **/
    @JsonProperty("priceDisplayRule")
    @ApiModelProperty(value = "")
    public Integer getPriceDisplayRule() {
        return priceDisplayRule;
    }

    public void setPriceDisplayRule(Integer priceDisplayRule) {
        this.priceDisplayRule = priceDisplayRule;
    }

    /**
     * Get priceDisplayValue.
     *
     * @return priceDisplayValue
     **/
    @JsonProperty("priceDisplayValue")
    @ApiModelProperty(value = "")
    public String getPriceDisplayValue() {
        return priceDisplayValue;
    }

    public void setPriceDisplayValue(String priceDisplayValue) {
        this.priceDisplayValue = priceDisplayValue;
    }

    /**
     * priceFactor is price increment obtained from display rule.
     *
     * @return priceFactor
     **/
    @JsonProperty("priceFactor")
    @ApiModelProperty(example = "100", value = "priceFactor is price increment obtained from display rule")
    public Integer getPriceFactor() {
        return priceFactor;
    }

    public void setPriceFactor(Integer priceFactor) {
        this.priceFactor = priceFactor;
    }

    /**
     * start date time in the format YYYYMMDD-HH:mm:ss.
     *
     * @return startTime
     **/
    @JsonProperty("startTime")
    @ApiModelProperty(value = "start date time in the format YYYYMMDD-HH:mm:ss")
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * Underlying symbol.
     *
     * @return symbol
     **/
    @JsonProperty("symbol")
    @ApiModelProperty(value = "Underlying symbol")
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    /**
     * companyName.
     *
     * @return text
     **/
    @JsonProperty("text")
    @ApiModelProperty(value = "companyName")
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    /**
     * The duration for the historical data request.
     *
     * @return timePeriod
     **/
    @JsonProperty("timePeriod")
    @ApiModelProperty(value = "The duration for the historical data request")
    public String getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(String timePeriod) {
        this.timePeriod = timePeriod;
    }

    /**
     * The number of seconds in the trading day.
     *
     * @return tradingDayDuration
     **/
    @JsonProperty("tradingDayDuration")
    @ApiModelProperty(value = "The number of seconds in the trading day")
    public Integer getTradingDayDuration() {
        return tradingDayDuration;
    }

    public void setTradingDayDuration(Integer tradingDayDuration) {
        this.tradingDayDuration = tradingDayDuration;
    }

    /**
     * Get travelTime.
     *
     * @return travelTime
     **/
    @JsonProperty("travelTime")
    @ApiModelProperty(value = "")
    public Integer getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(Integer travelTime) {
        this.travelTime = travelTime;
    }

    /**
     * Get volumeFactor.
     *
     * @return volumeFactor
     **/
    @JsonProperty("volumeFactor")
    @ApiModelProperty(value = "")
    public Integer getVolumeFactor() {
        return volumeFactor;
    }

    public void setVolumeFactor(Integer volumeFactor) {
        this.volumeFactor = volumeFactor;
    }

    public void setNegativeCapable(Boolean negativeCapable) {
        this.negativeCapable = negativeCapable;
    }

    public void setOutsideRth(Boolean outsideRth) {
        this.outsideRth = outsideRth;
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, text, priceFactor, startTime, high, low, timePeriod, barLength, mdAvailability,
                mktDataDelay, outsideRth, tradingDayDuration, volumeFactor, priceDisplayRule, priceDisplayValue,
                negativeCapable, messageVersion, data, points, travelTime);
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HistoryData historyData = (HistoryData) o;
        return Objects.equals(this.symbol, historyData.symbol) && Objects.equals(this.text, historyData.text)
                && Objects.equals(this.priceFactor, historyData.priceFactor) && Objects.equals(this.startTime,
                historyData.startTime) && Objects.equals(this.high, historyData.high) && Objects.equals(this.low,
                historyData.low) && Objects.equals(this.timePeriod, historyData.timePeriod) && Objects.equals(
                this.barLength, historyData.barLength) && Objects.equals(this.mdAvailability,
                historyData.mdAvailability) && Objects.equals(this.mktDataDelay, historyData.mktDataDelay)
                && Objects.equals(this.outsideRth, historyData.outsideRth) && Objects.equals(this.tradingDayDuration,
                historyData.tradingDayDuration) && Objects.equals(this.volumeFactor, historyData.volumeFactor)
                && Objects.equals(this.priceDisplayRule, historyData.priceDisplayRule) && Objects.equals(
                this.priceDisplayValue, historyData.priceDisplayValue) && Objects.equals(this.negativeCapable,
                historyData.negativeCapable) && Objects.equals(this.messageVersion, historyData.messageVersion)
                && Objects.equals(this.data, historyData.data) && Objects.equals(this.points, historyData.points)
                && Objects.equals(this.travelTime, historyData.travelTime);
    }

    @Override
    public String toString() {

        String sb = "class HistoryData {\n" + "    symbol: " + toIndentedString(symbol) + "\n" + "    text: "
                + toIndentedString(text) + "\n" + "    priceFactor: " + toIndentedString(priceFactor) + "\n"
                + "    startTime: " + toIndentedString(startTime) + "\n" + "    high: " + toIndentedString(high) + "\n"
                + "    low: " + toIndentedString(low) + "\n" + "    timePeriod: " + toIndentedString(timePeriod) + "\n"
                + "    barLength: " + toIndentedString(barLength) + "\n" + "    mdAvailability: " + toIndentedString(
                mdAvailability) + "\n" + "    mktDataDelay: " + toIndentedString(mktDataDelay) + "\n"
                + "    outsideRth: " + toIndentedString(outsideRth) + "\n" + "    tradingDayDuration: "
                + toIndentedString(tradingDayDuration) + "\n" + "    volumeFactor: " + toIndentedString(volumeFactor)
                + "\n" + "    priceDisplayRule: " + toIndentedString(priceDisplayRule) + "\n"
                + "    priceDisplayValue: " + toIndentedString(priceDisplayValue) + "\n" + "    negativeCapable: "
                + toIndentedString(negativeCapable) + "\n" + "    messageVersion: " + toIndentedString(messageVersion)
                + "\n" + "    data: " + toIndentedString(data) + "\n" + "    points: " + toIndentedString(points) + "\n"
                + "    travelTime: " + toIndentedString(travelTime) + "\n" + "}";
        return sb;
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString()
                .replace("\n", "\n    ");
    }

    /**
     * Add data item.
     */
    public HistoryData addDataItem(Object dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<Object>();
        }
        this.data.add(dataItem);
        return this;
    }

    public HistoryData barLength(Integer barLength) {
        this.barLength = barLength;
        return this;
    }

    public HistoryData data(List<Object> data) {
        this.data = data;
        return this;
    }

    public HistoryData high(String high) {
        this.high = high;
        return this;
    }

    /**
     * Get negativeCapable.
     *
     * @return negativeCapable
     **/
    @JsonProperty("negativeCapable")
    @ApiModelProperty(value = "")
    public Boolean isNegativeCapable() {
        return negativeCapable;
    }

    /**
     * The historical data returned includes outside of regular trading hours.
     *
     * @return outsideRth
     **/
    @JsonProperty("outsideRth")
    @ApiModelProperty(value = "The historical data returned includes outside of regular trading hours ")
    public Boolean isOutsideRth() {
        return outsideRth;
    }

    public HistoryData low(String low) {
        this.low = low;
        return this;
    }

    public HistoryData mdAvailability(String mdAvailability) {
        this.mdAvailability = mdAvailability;
        return this;
    }

    public HistoryData messageVersion(Integer messageVersion) {
        this.messageVersion = messageVersion;
        return this;
    }

    public HistoryData mktDataDelay(Integer mktDataDelay) {
        this.mktDataDelay = mktDataDelay;
        return this;
    }

    public HistoryData negativeCapable(Boolean negativeCapable) {
        this.negativeCapable = negativeCapable;
        return this;
    }

    public HistoryData outsideRth(Boolean outsideRth) {
        this.outsideRth = outsideRth;
        return this;
    }

    public HistoryData points(Integer points) {
        this.points = points;
        return this;
    }

    public HistoryData priceDisplayRule(Integer priceDisplayRule) {
        this.priceDisplayRule = priceDisplayRule;
        return this;
    }

    public HistoryData priceDisplayValue(String priceDisplayValue) {
        this.priceDisplayValue = priceDisplayValue;
        return this;
    }

    public HistoryData priceFactor(Integer priceFactor) {
        this.priceFactor = priceFactor;
        return this;
    }

    public HistoryData startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public HistoryData symbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    public HistoryData text(String text) {
        this.text = text;
        return this;
    }

    public HistoryData timePeriod(String timePeriod) {
        this.timePeriod = timePeriod;
        return this;
    }

    public HistoryData tradingDayDuration(Integer tradingDayDuration) {
        this.tradingDayDuration = tradingDayDuration;
        return this;
    }

    public HistoryData travelTime(Integer travelTime) {
        this.travelTime = travelTime;
        return this;
    }

    public HistoryData volumeFactor(Integer volumeFactor) {
        this.volumeFactor = volumeFactor;
        return this;
    }

}

