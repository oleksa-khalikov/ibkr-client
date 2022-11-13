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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * Asset class allocation detail.
 */
public class AssetClassAllocationDetail {

    @ApiModelProperty(value = "")
    @JsonProperty("STK")
    @SerializedName("STK")
    private BigDecimal stk;

    @ApiModelProperty(value = "")
    @JsonProperty("OPT")
    @SerializedName("OPT")
    private BigDecimal opt;

    @ApiModelProperty(value = "")
    @JsonProperty("FUT")
    @SerializedName("FUT")
    private BigDecimal fut;

    @ApiModelProperty(value = "")
    @JsonProperty("WAR")
    @SerializedName("WAR")
    private BigDecimal war;

    @ApiModelProperty(value = "")
    @JsonProperty("BOND")
    @SerializedName("BOND")
    private BigDecimal bond;

    @ApiModelProperty(value = "")
    @JsonProperty("CASH")
    @SerializedName("CASH")
    private BigDecimal cash;

    @Override
    public int hashCode() {
        return Objects.hash(getStk(), getOpt(), getFut(), getWar(), getBond(), getCash());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AssetClassAllocationDetail)) {
            return false;
        }
        AssetClassAllocationDetail that = (AssetClassAllocationDetail) o;
        return Objects.equals(getStk(), that.getStk()) && Objects.equals(getOpt(), that.getOpt()) && Objects.equals(
                getFut(), that.getFut()) && Objects.equals(getWar(), that.getWar()) && Objects.equals(getBond(),
                that.getBond()) && Objects.equals(getCash(), that.getCash());
    }

    @Override
    public String toString() {
        String sb = "LongAssetClassAllocation{" + "stk=" + stk + ", opt=" + opt + ", fut=" + fut + ", war=" + war
                + ", bond=" + bond + ", cash=" + cash + '}';
        return sb;
    }

    public BigDecimal getStk() {
        return stk;
    }

    public void setStk(BigDecimal stk) {
        this.stk = stk;
    }

    public BigDecimal getOpt() {
        return opt;
    }

    public void setOpt(BigDecimal opt) {
        this.opt = opt;
    }

    public BigDecimal getFut() {
        return fut;
    }

    public void setFut(BigDecimal fut) {
        this.fut = fut;
    }

    public BigDecimal getWar() {
        return war;
    }

    public void setWar(BigDecimal war) {
        this.war = war;
    }

    public BigDecimal getBond() {
        return bond;
    }

    public void setBond(BigDecimal bond) {
        this.bond = bond;
    }

    public BigDecimal getCash() {
        return cash;
    }

    public void setCash(BigDecimal cash) {
        this.cash = cash;
    }

}
