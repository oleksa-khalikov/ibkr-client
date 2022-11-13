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

import java.math.BigDecimal;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * Scanner result.
 */
@Validated
public class ScannerDirectResult {

    @ApiModelProperty(value = "")
    @JsonProperty("total")
    @SerializedName("total")
    private Integer total = null;

    @ApiModelProperty(value = "")
    @JsonProperty("size")
    @SerializedName("size")
    private Integer size = null;

    @ApiModelProperty(value = "")
    @JsonProperty("offset")
    @SerializedName("offset")
    private Integer offset = null;

    @ApiModelProperty(value = "")
    @JsonProperty("scanTime")
    @SerializedName("scanTime")
    private String scanTime = null;

    @ApiModelProperty(value = "")
    @JsonProperty("id")
    @SerializedName("id")
    private BigDecimal id = null;

    @ApiModelProperty(value = "")
    @JsonProperty("position")
    @SerializedName("position")
    private String position = null;

    /**
     * Contains list of contracts matching the scanner query.
     **/
    @ApiModelProperty(value = "Contains list of contracts matching the scanner query")
    @JsonProperty("Contracts")
    @SerializedName("Contracts")
    private ScannerContracts contracts = null;

    /**
     * Contains list of contracts matching the scanner query.
     *
     * @return contracts
     **/
    @JsonProperty("Contracts")
    @ApiModelProperty(value = "Contains list of contracts matching the scanner query")
    public ScannerContracts getContracts() {
        return contracts;
    }

    public void setContracts(ScannerContracts contracts) {
        this.contracts = contracts;
    }

    /**
     * Get id.
     *
     * @return id
     **/
    @JsonProperty("id")
    @ApiModelProperty(value = "")
    @Valid
    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * Get offset.
     *
     * @return offset
     **/
    @JsonProperty("offset")
    @ApiModelProperty(value = "")
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * Get position.
     *
     * @return position
     **/
    @JsonProperty("position")
    @ApiModelProperty(value = "")
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * Get scanTime.
     *
     * @return scanTime
     **/
    @JsonProperty("scanTime")
    @ApiModelProperty(value = "")
    public String getScanTime() {
        return scanTime;
    }

    public void setScanTime(String scanTime) {
        this.scanTime = scanTime;
    }

    /**
     * Get size.
     *
     * @return size
     **/
    @JsonProperty("size")
    @ApiModelProperty(value = "")
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * Get total.
     *
     * @return total
     **/
    @JsonProperty("total")
    @ApiModelProperty(value = "")
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, size, offset, scanTime, id, position, contracts);
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ScannerDirectResult scannerResult = (ScannerDirectResult) o;
        return Objects.equals(this.total, scannerResult.total) && Objects.equals(this.size, scannerResult.size)
                && Objects.equals(this.offset, scannerResult.offset) && Objects.equals(this.scanTime,
                scannerResult.scanTime) && Objects.equals(this.id, scannerResult.id) && Objects.equals(this.position,
                scannerResult.position) && Objects.equals(this.contracts, scannerResult.contracts);
    }

    @Override
    public String toString() {

        String sb = "class ScannerResult {\n" + "    total: " + toIndentedString(total) + "\n" + "    size: "
                + toIndentedString(size) + "\n" + "    offset: " + toIndentedString(offset) + "\n" + "    scanTime: "
                + toIndentedString(scanTime) + "\n" + "    id: " + toIndentedString(id) + "\n" + "    position: "
                + toIndentedString(position) + "\n" + "    contracts: " + toIndentedString(contracts) + "\n" + "}";
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

    public ScannerDirectResult contracts(ScannerContracts contracts) {
        this.contracts = contracts;
        return this;
    }

    public ScannerDirectResult id(BigDecimal id) {
        this.id = id;
        return this;
    }

    public ScannerDirectResult offset(Integer offset) {
        this.offset = offset;
        return this;
    }

    public ScannerDirectResult position(String position) {
        this.position = position;
        return this;
    }

    public ScannerDirectResult scanTime(String scanTime) {
        this.scanTime = scanTime;
        return this;
    }

    public ScannerDirectResult size(Integer size) {
        this.size = size;
        return this;
    }

    public ScannerDirectResult total(Integer total) {
        this.total = total;
        return this;
    }

}

