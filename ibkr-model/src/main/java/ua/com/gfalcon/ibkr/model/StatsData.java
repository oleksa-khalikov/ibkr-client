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
 * Stats data.
 */
@Validated
public class StatsData {

    @ApiModelProperty(value = "")
    @JsonProperty("Conid")
    @SerializedName("Conid")
    private BigDecimal conid = null;

    @ApiModelProperty(value = "")
    @JsonProperty("Exchange")
    @SerializedName("Exchange")
    private String exchange = null;

    @ApiModelProperty(value = "")
    @JsonProperty("V")
    @SerializedName("V")
    private BigDecimal valueV = null;

    @ApiModelProperty(value = "")
    @JsonProperty("T")
    @SerializedName("T")
    private BigDecimal valueT = null;

    @ApiModelProperty(value = "")
    @JsonProperty("TT")
    @SerializedName("TT")
    private BigDecimal valueTt = null;

    /**
     * Object, payload depends on event type. See confluence page for IGEvntUpd.
     **/
    @ApiModelProperty(value = "Object, payload depends on event type. See confluence page for IGEvntUpd.")
    @JsonProperty("P")
    @SerializedName("P")
    private String valueP = null;

    /**
     * Get conid.
     *
     * @return conid
     **/
    @JsonProperty("Conid")
    @ApiModelProperty(value = "")
    @Valid
    public BigDecimal getConid() {
        return conid;
    }

    public void setConid(BigDecimal conid) {
        this.conid = conid;
    }

    /**
     * Get exchange.
     *
     * @return exchange
     **/
    @JsonProperty("Exchange")
    @ApiModelProperty(value = "")
    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    /**
     * Object, payload depends on event type. See confluence page for IGEvntUpd.
     *
     * @return P
     **/
    @JsonProperty("P")
    @ApiModelProperty(value = "Object, payload depends on event type. See confluence page for IGEvntUpd.")
    public String getP() {
        return valueP;
    }

    public void setP(String p) {
        this.valueP = p;
    }

    /**
     * Get T.
     *
     * @return T
     **/
    @JsonProperty("T")
    @ApiModelProperty(value = "")
    @Valid
    public BigDecimal getT() {
        return valueT;
    }

    public void setT(BigDecimal t) {
        this.valueT = t;
    }

    /**
     * Get TT.
     *
     * @return TT
     **/
    @JsonProperty("TT")
    @ApiModelProperty(value = "")
    @Valid
    public BigDecimal getTt() {
        return valueTt;
    }

    public void setTt(BigDecimal tt) {
        this.valueTt = tt;
    }

    /**
     * Get V.
     *
     * @return V
     **/
    @JsonProperty("V")
    @ApiModelProperty(value = "")
    @Valid
    public BigDecimal getV() {
        return valueV;
    }

    public void setV(BigDecimal v) {
        this.valueV = v;
    }

    @Override
    public int hashCode() {
        return Objects.hash(conid, exchange, valueV, valueT, valueTt, valueP);
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StatsData statsData = (StatsData) o;
        return Objects.equals(this.conid, statsData.conid) && Objects.equals(this.exchange, statsData.exchange)
                && Objects.equals(this.valueV, statsData.valueV) && Objects.equals(this.valueT, statsData.valueT)
                && Objects.equals(this.valueTt, statsData.valueTt) && Objects.equals(this.valueP, statsData.valueP);
    }

    @Override
    public String toString() {

        String sb = "class StatsData {\n" + "    conid: " + toIndentedString(conid) + "\n" + "    exchange: "
                + toIndentedString(exchange) + "\n" + "    V: " + toIndentedString(valueV) + "\n" + "    T: "
                + toIndentedString(valueT) + "\n" + "    TT: " + toIndentedString(valueTt) + "\n" + "    P: "
                + toIndentedString(valueP) + "\n" + "}";
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

    public StatsData withP(String p) {
        this.valueP = p;
        return this;
    }

    public StatsData withT(BigDecimal t) {
        this.valueT = t;
        return this;
    }

    public StatsData tt(BigDecimal tt) {
        this.valueTt = tt;
        return this;
    }

    public StatsData withV(BigDecimal v) {
        this.valueV = v;
        return this;
    }

    public StatsData conid(BigDecimal conid) {
        this.conid = conid;
        return this;
    }

    public StatsData exchange(String exchange) {
        this.exchange = exchange;
        return this;
    }

}

