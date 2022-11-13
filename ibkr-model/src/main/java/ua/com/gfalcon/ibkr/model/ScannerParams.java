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
 * Scanner params.
 */
@Validated
public class ScannerParams {

    /**
     * for example-STK.
     **/
    @ApiModelProperty(value = "for example-STK")
    @JsonProperty("instrument")
    @SerializedName("instrument")
    private String instrument = null;

    /**
     * for example-TOP_PERC_GAIN.
     **/
    @ApiModelProperty(value = "for example-TOP_PERC_GAIN")
    @JsonProperty("type")
    @SerializedName("type")
    private String type = null;

    @ApiModelProperty(value = "")
    @JsonProperty("filter")
    @Valid
    @SerializedName("filter")
    private List<Object> filter = new ArrayList<Object>();

    @ApiModelProperty(value = "")
    @JsonProperty("location")
    @SerializedName("location")
    private String location = null;

    @ApiModelProperty(value = "")
    @JsonProperty("size")
    @SerializedName("size")
    private String size = null;

    /**
     * Get filter.
     *
     * @return filter
     **/
    @JsonProperty("filter")
    @ApiModelProperty(value = "")
    public List<Object> getFilter() {
        return filter;
    }

    public void setFilter(List<Object> filter) {
        this.filter = filter;
    }

    /**
     * for example-STK.
     *
     * @return instrument
     **/
    @JsonProperty("instrument")
    @ApiModelProperty(value = "for example-STK")
    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    /**
     * Get location.
     *
     * @return location
     **/
    @JsonProperty("location")
    @ApiModelProperty(value = "")
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Get size.
     *
     * @return size
     **/
    @JsonProperty("size")
    @ApiModelProperty(value = "")
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    /**
     * for example-TOP_PERC_GAIN.
     *
     * @return type
     **/
    @JsonProperty("type")
    @ApiModelProperty(value = "for example-TOP_PERC_GAIN")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(instrument, type, filter, location, size);
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ScannerParams scannerParams = (ScannerParams) o;
        return Objects.equals(this.instrument, scannerParams.instrument) && Objects.equals(this.type,
                scannerParams.type) && Objects.equals(this.filter, scannerParams.filter) && Objects.equals(
                this.location, scannerParams.location) && Objects.equals(this.size, scannerParams.size);
    }

    @Override
    public String toString() {

        String sb = "class ScannerParams {\n" + "    instrument: " + toIndentedString(instrument) + "\n" + "    type: "
                + toIndentedString(type) + "\n" + "    filter: " + toIndentedString(filter) + "\n" + "    location: "
                + toIndentedString(location) + "\n" + "    size: " + toIndentedString(size) + "\n" + "}";
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
     * Add filter item.
     */
    public ScannerParams addFilterItem(Object filterItem) {
        if (this.filter == null) {
            this.filter = new ArrayList<Object>();
        }
        this.filter.add(filterItem);
        return this;
    }

    public ScannerParams filter(List<Object> filter) {
        this.filter = filter;
        return this;
    }

    public ScannerParams instrument(String instrument) {
        this.instrument = instrument;
        return this;
    }

    public ScannerParams location(String location) {
        this.location = location;
        return this;
    }

    public ScannerParams size(String size) {
        this.size = size;
        return this;
    }

    public ScannerParams type(String type) {
        this.type = type;
        return this;
    }

}

