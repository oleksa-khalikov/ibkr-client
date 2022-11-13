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

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Contains some basic info of contract.
 */
@ApiModel(description = "Contains some basic info of contract")
@Validated
public class SecdefInfo {

    @ApiModelProperty(value = "")
    @JsonProperty("conid")
    @SerializedName("conid")
    private BigDecimal conid = null;

    /**
     * Underlying symbol.
     **/
    @ApiModelProperty(value = "Underlying symbol")
    @JsonProperty("symbol")
    @SerializedName("symbol")
    private String symbol = null;

    @ApiModelProperty(value = "")
    @JsonProperty("secType")
    @SerializedName("secType")
    private String secType = null;

    @ApiModelProperty(value = "")
    @JsonProperty("exchange")
    @SerializedName("exchange")
    private String exchange = null;

    @ApiModelProperty(value = "")
    @JsonProperty("listingExchange")
    @SerializedName("listingExchange")
    private String listingExchange = null;

    /**
     * C = Call Option, P = Put Option.
     **/
    @ApiModelProperty(value = "C = Call Option, P = Put Option")
    @JsonProperty("right")
    @SerializedName("right")
    private String right = null;

    /**
     * The strike price also known as exercise price.
     **/
    @ApiModelProperty(value = "The strike price also known as exercise price")
    @JsonProperty("strike")
    @SerializedName("strike")
    private String strike = null;

    /**
     * Currency the contract trades in.
     **/
    @ApiModelProperty(value = "Currency the contract trades in")
    @JsonProperty("currency")
    @SerializedName("currency")
    private String currency = null;

    /**
     * Committee on Uniform Securities Identification Procedures number.
     **/
    @ApiModelProperty(value = "Committee on Uniform Securities Identification Procedures number")
    @JsonProperty("cusip")
    @SerializedName("cusip")
    private String cusip = null;

    /**
     * Annual interest rate paid on a bond.
     **/
    @ApiModelProperty(value = "Annual interest rate paid on a bond")
    @JsonProperty("coupon")
    @SerializedName("coupon")
    private String coupon = null;

    /**
     * Formatted symbol.
     **/
    @ApiModelProperty(value = "Formatted symbol")
    @JsonProperty("desc1")
    @SerializedName("desc1")
    private String desc1 = null;

    /**
     * Formatted expiration, strike and right.
     **/
    @ApiModelProperty(value = "Formatted expiration, strike and right")
    @JsonProperty("desc2")
    @SerializedName("desc2")
    private String desc2 = null;

    /**
     * Format YYYYMMDD, the date on which the underlying transaction settles if the option is exercised.
     **/
    @ApiModelProperty(
            value = "Format YYYYMMDD, the date on which the underlying transaction settles if the option is exercised")
    @JsonProperty("maturityDate")
    @SerializedName("maturityDate")
    private String maturityDate = null;

    /**
     * total premium paid or received for an option contract.
     **/
    @ApiModelProperty(value = "total premium paid or received for an option contract")
    @JsonProperty("multiplier")
    @SerializedName("multiplier")
    private String multiplier = null;

    @ApiModelProperty(value = "")
    @JsonProperty("tradingClass")
    @SerializedName("tradingClass")
    private String tradingClass = null;

    @ApiModelProperty(value = "")
    @JsonProperty("validExchanges")
    @SerializedName("validExchanges")
    private String validExchanges = null;

    /**
     * Get conid.
     *
     * @return conid
     **/
    @JsonProperty("conid")
    @ApiModelProperty(value = "")
    @Valid
    public BigDecimal getConid() {
        return conid;
    }

    public void setConid(BigDecimal conid) {
        this.conid = conid;
    }

    /**
     * Annual interest rate paid on a bond.
     *
     * @return coupon
     **/
    @JsonProperty("coupon")
    @ApiModelProperty(value = "Annual interest rate paid on a bond")
    public String getCoupon() {
        return coupon;
    }

    public void setCoupon(String coupon) {
        this.coupon = coupon;
    }

    /**
     * Currency the contract trades in.
     *
     * @return currency
     **/
    @JsonProperty("currency")
    @ApiModelProperty(value = "Currency the contract trades in")
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Committee on Uniform Securities Identification Procedures number.
     *
     * @return cusip
     **/
    @JsonProperty("cusip")
    @ApiModelProperty(value = "Committee on Uniform Securities Identification Procedures number")
    public String getCusip() {
        return cusip;
    }

    public void setCusip(String cusip) {
        this.cusip = cusip;
    }

    /**
     * Formatted symbol.
     *
     * @return desc1
     **/
    @JsonProperty("desc1")
    @ApiModelProperty(value = "Formatted symbol")
    public String getDesc1() {
        return desc1;
    }

    public void setDesc1(String desc1) {
        this.desc1 = desc1;
    }

    /**
     * Formatted expiration, strike and right.
     *
     * @return desc2
     **/
    @JsonProperty("desc2")
    @ApiModelProperty(value = "Formatted expiration, strike and right")
    public String getDesc2() {
        return desc2;
    }

    public void setDesc2(String desc2) {
        this.desc2 = desc2;
    }

    /**
     * Get exchange.
     *
     * @return exchange
     **/
    @JsonProperty("exchange")
    @ApiModelProperty(value = "")
    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    /**
     * Get listingExchange.
     *
     * @return listingExchange
     **/
    @JsonProperty("listingExchange")
    @ApiModelProperty(value = "")
    public String getListingExchange() {
        return listingExchange;
    }

    public void setListingExchange(String listingExchange) {
        this.listingExchange = listingExchange;
    }

    /**
     * Format YYYYMMDD, the date on which the underlying transaction settles if the option is exercised.
     *
     * @return maturityDate
     **/
    @JsonProperty("maturityDate")
    @ApiModelProperty(
            value = "Format YYYYMMDD, the date on which the underlying transaction settles if the option is exercised")
    public String getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate(String maturityDate) {
        this.maturityDate = maturityDate;
    }

    /**
     * total premium paid or received for an option contract.
     *
     * @return multiplier
     **/
    @JsonProperty("multiplier")
    @ApiModelProperty(value = "total premium paid or received for an option contract")
    public String getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(String multiplier) {
        this.multiplier = multiplier;
    }

    /**
     * C = Call Option, P = Put Option.
     *
     * @return right
     **/
    @JsonProperty("right")
    @ApiModelProperty(value = "C = Call Option, P = Put Option")
    public String getRight() {
        return right;
    }

    public void setRight(String right) {
        this.right = right;
    }

    /**
     * Get secType.
     *
     * @return secType
     **/
    @JsonProperty("secType")
    @ApiModelProperty(value = "")
    public String getSecType() {
        return secType;
    }

    public void setSecType(String secType) {
        this.secType = secType;
    }

    /**
     * The strike price also known as exercise price.
     *
     * @return strike
     **/
    @JsonProperty("strike")
    @ApiModelProperty(value = "The strike price also known as exercise price")
    public String getStrike() {
        return strike;
    }

    public void setStrike(String strike) {
        this.strike = strike;
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
     * Get tradingClass.
     *
     * @return tradingClass
     **/
    @JsonProperty("tradingClass")
    @ApiModelProperty(value = "")
    public String getTradingClass() {
        return tradingClass;
    }

    public void setTradingClass(String tradingClass) {
        this.tradingClass = tradingClass;
    }

    /**
     * Get validExchanges.
     *
     * @return validExchanges
     **/
    @JsonProperty("validExchanges")
    @ApiModelProperty(value = "")
    public String getValidExchanges() {
        return validExchanges;
    }

    public void setValidExchanges(String validExchanges) {
        this.validExchanges = validExchanges;
    }

    @Override
    public int hashCode() {
        return Objects.hash(conid, symbol, secType, exchange, listingExchange, right, strike, currency, cusip, coupon,
                desc1, desc2, maturityDate, multiplier, tradingClass, validExchanges);
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SecdefInfo secdefInfo = (SecdefInfo) o;
        return Objects.equals(this.conid, secdefInfo.conid) && Objects.equals(this.symbol, secdefInfo.symbol)
                && Objects.equals(this.secType, secdefInfo.secType) && Objects.equals(this.exchange,
                secdefInfo.exchange) && Objects.equals(this.listingExchange, secdefInfo.listingExchange)
                && Objects.equals(this.right, secdefInfo.right) && Objects.equals(this.strike, secdefInfo.strike)
                && Objects.equals(this.currency, secdefInfo.currency) && Objects.equals(this.cusip, secdefInfo.cusip)
                && Objects.equals(this.coupon, secdefInfo.coupon) && Objects.equals(this.desc1, secdefInfo.desc1)
                && Objects.equals(this.desc2, secdefInfo.desc2) && Objects.equals(this.maturityDate,
                secdefInfo.maturityDate) && Objects.equals(this.multiplier, secdefInfo.multiplier) && Objects.equals(
                this.tradingClass, secdefInfo.tradingClass) && Objects.equals(this.validExchanges,
                secdefInfo.validExchanges);
    }

    @Override
    public String toString() {

        String sb = "class SecdefInfo {\n" + "    conid: " + toIndentedString(conid) + "\n" + "    symbol: "
                + toIndentedString(symbol) + "\n" + "    secType: " + toIndentedString(secType) + "\n"
                + "    exchange: " + toIndentedString(exchange) + "\n" + "    listingExchange: " + toIndentedString(
                listingExchange) + "\n" + "    right: " + toIndentedString(right) + "\n" + "    strike: "
                + toIndentedString(strike) + "\n" + "    currency: " + toIndentedString(currency) + "\n" + "    cusip: "
                + toIndentedString(cusip) + "\n" + "    coupon: " + toIndentedString(coupon) + "\n" + "    desc1: "
                + toIndentedString(desc1) + "\n" + "    desc2: " + toIndentedString(desc2) + "\n" + "    maturityDate: "
                + toIndentedString(maturityDate) + "\n" + "    multiplier: " + toIndentedString(multiplier) + "\n"
                + "    tradingClass: " + toIndentedString(tradingClass) + "\n" + "    validExchanges: "
                + toIndentedString(validExchanges) + "\n" + "}";
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

    public SecdefInfo conid(BigDecimal conid) {
        this.conid = conid;
        return this;
    }

    public SecdefInfo coupon(String coupon) {
        this.coupon = coupon;
        return this;
    }

    public SecdefInfo currency(String currency) {
        this.currency = currency;
        return this;
    }

    public SecdefInfo cusip(String cusip) {
        this.cusip = cusip;
        return this;
    }

    public SecdefInfo desc1(String desc1) {
        this.desc1 = desc1;
        return this;
    }

    public SecdefInfo desc2(String desc2) {
        this.desc2 = desc2;
        return this;
    }

    public SecdefInfo exchange(String exchange) {
        this.exchange = exchange;
        return this;
    }

    public SecdefInfo listingExchange(String listingExchange) {
        this.listingExchange = listingExchange;
        return this;
    }

    public SecdefInfo maturityDate(String maturityDate) {
        this.maturityDate = maturityDate;
        return this;
    }

    public SecdefInfo multiplier(String multiplier) {
        this.multiplier = multiplier;
        return this;
    }

    public SecdefInfo right(String right) {
        this.right = right;
        return this;
    }

    public SecdefInfo secType(String secType) {
        this.secType = secType;
        return this;
    }

    public SecdefInfo strike(String strike) {
        this.strike = strike;
        return this;
    }

    public SecdefInfo symbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    public SecdefInfo tradingClass(String tradingClass) {
        this.tradingClass = tradingClass;
        return this;
    }

    public SecdefInfo validExchanges(String validExchanges) {
        this.validExchanges = validExchanges;
        return this;
    }

}

