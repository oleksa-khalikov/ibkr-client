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


import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * Calendar Request.
 */
@Validated
public class CalendarRequest {

    @JsonProperty("date")
    @ApiModelProperty(value = "")
    @SerializedName("date")
    private Object date = null;

    @JsonProperty("filters")
    @ApiModelProperty(value = "")
    @SerializedName("filters")
    private Object filters = null;

    /**
     * Get date.
     *
     * @return date
     **/
    @JsonProperty("date")
    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }

    /**
     * Get filters.
     *
     * @return filters
     **/
    @JsonProperty("filters")
    public Object getFilters() {
        return filters;
    }

    public void setFilters(Object filters) {
        this.filters = filters;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, filters);
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CalendarRequest calendarRequest = (CalendarRequest) o;
        return Objects.equals(this.date, calendarRequest.date) && Objects.equals(this.filters, calendarRequest.filters);
    }

    @Override
    public String toString() {

        String sb = "class CalendarRequest {\n" + "    date: " + toIndentedString(date) + "\n" + "    filters: "
                + toIndentedString(filters) + "\n" + "}";
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

    public CalendarRequest date(Object date) {
        this.date = date;
        return this;
    }

    public CalendarRequest filters(Object filters) {
        this.filters = filters;
        return this;
    }

}

