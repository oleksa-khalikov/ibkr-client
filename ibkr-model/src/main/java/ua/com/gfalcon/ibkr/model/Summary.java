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
 * Summary.
 */
@Validated
public class Summary {

    @ApiModelProperty(value = "")
    @JsonProperty("amount")
    @SerializedName("amount")
    private BigDecimal amount = null;

    @ApiModelProperty(value = "")
    @JsonProperty("currency")
    @SerializedName("currency")
    private String currency = null;

    @ApiModelProperty(value = "")
    @JsonProperty("isNull")
    @SerializedName("isNull")
    private Boolean isNull = null;

    @ApiModelProperty(value = "")
    @JsonProperty("timestamp")
    @SerializedName("timestamp")
    private Integer timestamp = null;

    @ApiModelProperty(value = "")
    @JsonProperty("value")
    @SerializedName("value")
    private String value = null;

    /**
     * Get amount.
     *
     * @return amount
     **/
    @JsonProperty("amount")
    @ApiModelProperty(value = "")
    @Valid
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * Get currency.
     *
     * @return currency
     **/
    @JsonProperty("currency")
    @ApiModelProperty(value = "")
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Get timestamp.
     *
     * @return timestamp
     **/
    @JsonProperty("timestamp")
    @ApiModelProperty(value = "")
    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Get value.
     *
     * @return value
     **/
    @JsonProperty("value")
    @ApiModelProperty(value = "")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setIsNull(Boolean isNull) {
        this.isNull = isNull;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, currency, isNull, timestamp, value);
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Summary summary = (Summary) o;
        return Objects.equals(this.amount, summary.amount) && Objects.equals(this.currency, summary.currency)
                && Objects.equals(this.isNull, summary.isNull) && Objects.equals(this.timestamp, summary.timestamp)
                && Objects.equals(this.value, summary.value);
    }

    @Override
    public String toString() {

        String sb = "class Summary {\n" + "    amount: " + toIndentedString(amount) + "\n" + "    currency: "
                + toIndentedString(currency) + "\n" + "    isNull: " + toIndentedString(isNull) + "\n"
                + "    timestamp: " + toIndentedString(timestamp) + "\n" + "    value: " + toIndentedString(value)
                + "\n" + "}";
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

    public Summary amount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    public Summary currency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Get isNull.
     *
     * @return isNull
     **/
    @JsonProperty("isNull")
    @ApiModelProperty(value = "")
    public Boolean isIsNull() {
        return isNull;
    }

    public Summary isNull(Boolean isNull) {
        this.isNull = isNull;
        return this;
    }

    public Summary timestamp(Integer timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public Summary value(String value) {
        this.value = value;
        return this;
    }

}

