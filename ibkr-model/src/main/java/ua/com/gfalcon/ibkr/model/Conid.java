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

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * Con id.
 */
public class Conid {

    /**
     * IBKR contract identifier.
     */
    @ApiModelProperty(value = "IBKR contract identifier.")
    @JsonProperty("conid")
    @SerializedName("conid")
    @NotNull
    private String conid = null;

    /**
     * Side of the market rules apply too. Set to true for Buy Orders, set to false for Sell Orders.
     */
    @ApiModelProperty(
            value = "Side of the market rules apply too. Set to true for Buy Orders, set to false for Sell Orders.")
    @JsonProperty("isBuy")
    @SerializedName("isBuy")
    @NotNull
    private Boolean isBuy = null;

    /**
     * Side of the market rules apply too. Set to true for Buy Orders, set to false for Sell Orders.
     */
    @ApiModelProperty(
            value = "Side of the market rules apply too. Set to true for Buy Orders, set to false for Sell Orders.")
    @JsonProperty("isBuy")
    public Boolean getBuy() {
        return isBuy;
    }

    public void setBuy(Boolean buy) {
        isBuy = buy;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getConid(), isBuy);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Conid)) {
            return false;
        }
        Conid conid1 = (Conid) o;
        return getConid().equals(conid1.getConid()) && isBuy.equals(conid1.isBuy);
    }

    @Override
    public String toString() {
        String sb = "Conid{" + "conid='" + conid + '\'' + ", isBuy=" + isBuy + '}';
        return sb;
    }

    /**
     * IBKR contract identifier.
     */
    @ApiModelProperty(value = "IBKR contract identifier.")
    @JsonProperty("conid")
    public String getConid() {
        return conid;
    }

    public void setConid(String conid) {
        this.conid = conid;
    }

}
