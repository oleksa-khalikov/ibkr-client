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
 * Ledger.
 */
@Validated
public class Ledger {

    @JsonProperty("commoditymarketvalue")
    @SerializedName("commoditymarketvalue")
    private BigDecimal commoditymarketvalue = null;

    @ApiModelProperty(value = "")
    @JsonProperty("futuremarketvalue")
    @SerializedName("futuremarketvalue")
    private BigDecimal futuremarketvalue = null;

    @ApiModelProperty(value = "")
    @JsonProperty("settledcash")
    @SerializedName("settledcash")
    private BigDecimal settledcash = null;

    @ApiModelProperty(value = "")
    @JsonProperty("exchangerate")
    @SerializedName("exchangerate")
    private BigDecimal exchangerate = null;

    @ApiModelProperty(value = "")
    @JsonProperty("sessionid")
    @SerializedName("sessionid")
    private Integer sessionid = null;

    @ApiModelProperty(value = "")
    @JsonProperty("cashbalance")
    @SerializedName("cashbalance")
    private BigDecimal cashbalance = null;

    @ApiModelProperty(value = "")
    @JsonProperty("corporatebondsmarketvalue")
    @SerializedName("corporatebondsmarketvalue")
    private BigDecimal corporatebondsmarketvalue = null;

    @ApiModelProperty(value = "")
    @JsonProperty("warrantsmarketvalue")
    @SerializedName("warrantsmarketvalue")
    private BigDecimal warrantsmarketvalue = null;

    @ApiModelProperty(value = "")
    @JsonProperty("netliquidationvalue")
    @SerializedName("netliquidationvalue")
    private BigDecimal netliquidationvalue = null;

    @ApiModelProperty(value = "")
    @JsonProperty("interest")
    @SerializedName("interest")
    private BigDecimal interest = null;

    @ApiModelProperty(value = "")
    @JsonProperty("unrealizedpnl")
    @SerializedName("unrealizedpnl")
    private BigDecimal unrealizedpnl = null;

    @ApiModelProperty(value = "")
    @JsonProperty("stockmarketvalue")
    @SerializedName("stockmarketvalue")
    private BigDecimal stockmarketvalue = null;

    @ApiModelProperty(value = "")
    @JsonProperty("moneyfunds")
    @SerializedName("moneyfunds")
    private BigDecimal moneyfunds = null;

    @ApiModelProperty(value = "")
    @JsonProperty("currency")
    @SerializedName("currency")
    private String currency = null;

    @ApiModelProperty(value = "")
    @JsonProperty("realizedpnl")
    @SerializedName("realizedpnl")
    private BigDecimal realizedpnl = null;

    @ApiModelProperty(value = "")
    @JsonProperty("funds")
    @SerializedName("funds")
    private BigDecimal funds = null;

    @ApiModelProperty(value = "")
    @JsonProperty("acctcode")
    @SerializedName("acctcode")
    private String acctcode = null;

    @ApiModelProperty(value = "")
    @JsonProperty("issueroptionsmarketvalue")
    @SerializedName("issueroptionsmarketvalue")
    private BigDecimal issueroptionsmarketvalue = null;

    @ApiModelProperty(value = "")
    @JsonProperty("key")
    @SerializedName("key")
    private String key = null;

    @ApiModelProperty(value = "")
    @JsonProperty("timestamp")
    @SerializedName("timestamp")
    private Integer timestamp = null;

    @ApiModelProperty(value = "")
    @JsonProperty("severity")
    @SerializedName("severity")
    private Integer severity = null;

    /**
     * Get acctcode.
     *
     * @return acctcode
     **/
    @JsonProperty("acctcode")
    @ApiModelProperty(value = "")
    public String getAcctcode() {
        return acctcode;
    }

    public void setAcctcode(String acctcode) {
        this.acctcode = acctcode;
    }

    /**
     * Get cashbalance.
     *
     * @return cashbalance
     **/
    @JsonProperty("cashbalance")
    @ApiModelProperty(value = "")
    @Valid
    public BigDecimal getCashbalance() {
        return cashbalance;
    }

    public void setCashbalance(BigDecimal cashbalance) {
        this.cashbalance = cashbalance;
    }

    /**
     * Get commoditymarketvalue.
     *
     * @return commoditymarketvalue
     **/
    @JsonProperty("commoditymarketvalue")
    @ApiModelProperty(value = "")
    @Valid
    public BigDecimal getCommoditymarketvalue() {
        return commoditymarketvalue;
    }

    public void setCommoditymarketvalue(BigDecimal commoditymarketvalue) {
        this.commoditymarketvalue = commoditymarketvalue;
    }

    /**
     * Get corporatebondsmarketvalue.
     *
     * @return corporatebondsmarketvalue
     **/
    @JsonProperty("corporatebondsmarketvalue")
    @ApiModelProperty(value = "")
    @Valid
    public BigDecimal getCorporatebondsmarketvalue() {
        return corporatebondsmarketvalue;
    }

    public void setCorporatebondsmarketvalue(BigDecimal corporatebondsmarketvalue) {
        this.corporatebondsmarketvalue = corporatebondsmarketvalue;
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
     * Get exchangerate.
     *
     * @return exchangerate
     **/
    @JsonProperty("exchangerate")
    @ApiModelProperty(value = "")
    @Valid
    public BigDecimal getExchangerate() {
        return exchangerate;
    }

    public void setExchangerate(BigDecimal exchangerate) {
        this.exchangerate = exchangerate;
    }

    /**
     * Get funds.
     *
     * @return funds
     **/
    @JsonProperty("funds")
    @ApiModelProperty(value = "")
    @Valid
    public BigDecimal getFunds() {
        return funds;
    }

    public void setFunds(BigDecimal funds) {
        this.funds = funds;
    }

    /**
     * Get futuremarketvalue.
     *
     * @return futuremarketvalue
     **/
    @JsonProperty("futuremarketvalue")
    @ApiModelProperty(value = "")
    @Valid
    public BigDecimal getFuturemarketvalue() {
        return futuremarketvalue;
    }

    public void setFuturemarketvalue(BigDecimal futuremarketvalue) {
        this.futuremarketvalue = futuremarketvalue;
    }

    /**
     * Get interest.
     *
     * @return interest
     **/
    @JsonProperty("interest")
    @ApiModelProperty(value = "")
    @Valid
    public BigDecimal getInterest() {
        return interest;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    /**
     * Get issueroptionsmarketvalue.
     *
     * @return issueroptionsmarketvalue
     **/
    @JsonProperty("issueroptionsmarketvalue")
    @ApiModelProperty(value = "")
    @Valid
    public BigDecimal getIssueroptionsmarketvalue() {
        return issueroptionsmarketvalue;
    }

    public void setIssueroptionsmarketvalue(BigDecimal issueroptionsmarketvalue) {
        this.issueroptionsmarketvalue = issueroptionsmarketvalue;
    }

    /**
     * Get key.
     *
     * @return key
     **/
    @JsonProperty("key")
    @ApiModelProperty(value = "")
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Get moneyfunds.
     *
     * @return moneyfunds
     **/
    @JsonProperty("moneyfunds")
    @ApiModelProperty(value = "")
    @Valid
    public BigDecimal getMoneyfunds() {
        return moneyfunds;
    }

    public void setMoneyfunds(BigDecimal moneyfunds) {
        this.moneyfunds = moneyfunds;
    }

    /**
     * Get netliquidationvalue.
     *
     * @return netliquidationvalue
     **/
    @JsonProperty("netliquidationvalue")
    @ApiModelProperty(value = "")
    @Valid
    public BigDecimal getNetliquidationvalue() {
        return netliquidationvalue;
    }

    public void setNetliquidationvalue(BigDecimal netliquidationvalue) {
        this.netliquidationvalue = netliquidationvalue;
    }

    /**
     * Get realizedpnl.
     *
     * @return realizedpnl
     **/
    @JsonProperty("realizedpnl")
    @ApiModelProperty(value = "")
    @Valid
    public BigDecimal getRealizedpnl() {
        return realizedpnl;
    }

    public void setRealizedpnl(BigDecimal realizedpnl) {
        this.realizedpnl = realizedpnl;
    }

    /**
     * Get sessionid.
     *
     * @return sessionid
     **/
    @JsonProperty("sessionid")
    @ApiModelProperty(value = "")
    public Integer getSessionid() {
        return sessionid;
    }

    public void setSessionid(Integer sessionid) {
        this.sessionid = sessionid;
    }

    /**
     * Get settledcash.
     *
     * @return settledcash
     **/
    @JsonProperty("settledcash")
    @ApiModelProperty(value = "")
    @Valid
    public BigDecimal getSettledcash() {
        return settledcash;
    }

    public void setSettledcash(BigDecimal settledcash) {
        this.settledcash = settledcash;
    }

    /**
     * Get severity.
     *
     * @return severity
     **/
    @JsonProperty("severity")
    @ApiModelProperty(value = "")
    public Integer getSeverity() {
        return severity;
    }

    public void setSeverity(Integer severity) {
        this.severity = severity;
    }

    /**
     * Get stockmarketvalue.
     *
     * @return stockmarketvalue
     **/
    @JsonProperty("stockmarketvalue")
    @ApiModelProperty(value = "")
    @Valid
    public BigDecimal getStockmarketvalue() {
        return stockmarketvalue;
    }

    public void setStockmarketvalue(BigDecimal stockmarketvalue) {
        this.stockmarketvalue = stockmarketvalue;
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
     * Get unrealizedpnl.
     *
     * @return unrealizedpnl
     **/
    @JsonProperty("unrealizedpnl")
    @ApiModelProperty(value = "")
    @Valid
    public BigDecimal getUnrealizedpnl() {
        return unrealizedpnl;
    }

    public void setUnrealizedpnl(BigDecimal unrealizedpnl) {
        this.unrealizedpnl = unrealizedpnl;
    }

    /**
     * Get warrantsmarketvalue.
     *
     * @return warrantsmarketvalue
     **/
    @JsonProperty("warrantsmarketvalue")
    @ApiModelProperty(value = "")
    @Valid
    public BigDecimal getWarrantsmarketvalue() {
        return warrantsmarketvalue;
    }

    public void setWarrantsmarketvalue(BigDecimal warrantsmarketvalue) {
        this.warrantsmarketvalue = warrantsmarketvalue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(commoditymarketvalue, futuremarketvalue, settledcash, exchangerate, sessionid, cashbalance,
                corporatebondsmarketvalue, warrantsmarketvalue, netliquidationvalue, interest, unrealizedpnl,
                stockmarketvalue, moneyfunds, currency, realizedpnl, funds, acctcode, issueroptionsmarketvalue, key,
                timestamp, severity);
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Ledger ledger = (Ledger) o;
        return Objects.equals(this.commoditymarketvalue, ledger.commoditymarketvalue) && Objects.equals(
                this.futuremarketvalue, ledger.futuremarketvalue) && Objects.equals(this.settledcash,
                ledger.settledcash) && Objects.equals(this.exchangerate, ledger.exchangerate) && Objects.equals(
                this.sessionid, ledger.sessionid) && Objects.equals(this.cashbalance, ledger.cashbalance)
                && Objects.equals(this.corporatebondsmarketvalue, ledger.corporatebondsmarketvalue) && Objects.equals(
                this.warrantsmarketvalue, ledger.warrantsmarketvalue) && Objects.equals(this.netliquidationvalue,
                ledger.netliquidationvalue) && Objects.equals(this.interest, ledger.interest) && Objects.equals(
                this.unrealizedpnl, ledger.unrealizedpnl) && Objects.equals(this.stockmarketvalue,
                ledger.stockmarketvalue) && Objects.equals(this.moneyfunds, ledger.moneyfunds) && Objects.equals(
                this.currency, ledger.currency) && Objects.equals(this.realizedpnl, ledger.realizedpnl)
                && Objects.equals(this.funds, ledger.funds) && Objects.equals(this.acctcode, ledger.acctcode)
                && Objects.equals(this.issueroptionsmarketvalue, ledger.issueroptionsmarketvalue) && Objects.equals(
                this.key, ledger.key) && Objects.equals(this.timestamp, ledger.timestamp) && Objects.equals(
                this.severity, ledger.severity);
    }

    @Override
    public String toString() {

        String sb = "class Ledger {\n" + "    commoditymarketvalue: " + toIndentedString(commoditymarketvalue) + "\n"
                + "    futuremarketvalue: " + toIndentedString(futuremarketvalue) + "\n" + "    settledcash: "
                + toIndentedString(settledcash) + "\n" + "    exchangerate: " + toIndentedString(exchangerate) + "\n"
                + "    sessionid: " + toIndentedString(sessionid) + "\n" + "    cashbalance: " + toIndentedString(
                cashbalance) + "\n" + "    corporatebondsmarketvalue: " + toIndentedString(corporatebondsmarketvalue)
                + "\n" + "    warrantsmarketvalue: " + toIndentedString(warrantsmarketvalue) + "\n"
                + "    netliquidationvalue: " + toIndentedString(netliquidationvalue) + "\n" + "    interest: "
                + toIndentedString(interest) + "\n" + "    unrealizedpnl: " + toIndentedString(unrealizedpnl) + "\n"
                + "    stockmarketvalue: " + toIndentedString(stockmarketvalue) + "\n" + "    moneyfunds: "
                + toIndentedString(moneyfunds) + "\n" + "    currency: " + toIndentedString(currency) + "\n"
                + "    realizedpnl: " + toIndentedString(realizedpnl) + "\n" + "    funds: " + toIndentedString(funds)
                + "\n" + "    acctcode: " + toIndentedString(acctcode) + "\n" + "    issueroptionsmarketvalue: "
                + toIndentedString(issueroptionsmarketvalue) + "\n" + "    key: " + toIndentedString(key) + "\n"
                + "    timestamp: " + toIndentedString(timestamp) + "\n" + "    severity: " + toIndentedString(severity)
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

    public Ledger acctcode(String acctcode) {
        this.acctcode = acctcode;
        return this;
    }

    public Ledger cashbalance(BigDecimal cashbalance) {
        this.cashbalance = cashbalance;
        return this;
    }

    public Ledger commoditymarketvalue(BigDecimal commoditymarketvalue) {
        this.commoditymarketvalue = commoditymarketvalue;
        return this;
    }

    public Ledger corporatebondsmarketvalue(BigDecimal corporatebondsmarketvalue) {
        this.corporatebondsmarketvalue = corporatebondsmarketvalue;
        return this;
    }

    public Ledger currency(String currency) {
        this.currency = currency;
        return this;
    }

    public Ledger exchangerate(BigDecimal exchangerate) {
        this.exchangerate = exchangerate;
        return this;
    }

    public Ledger funds(BigDecimal funds) {
        this.funds = funds;
        return this;
    }

    public Ledger futuremarketvalue(BigDecimal futuremarketvalue) {
        this.futuremarketvalue = futuremarketvalue;
        return this;
    }

    public Ledger interest(BigDecimal interest) {
        this.interest = interest;
        return this;
    }

    public Ledger issueroptionsmarketvalue(BigDecimal issueroptionsmarketvalue) {
        this.issueroptionsmarketvalue = issueroptionsmarketvalue;
        return this;
    }

    public Ledger key(String key) {
        this.key = key;
        return this;
    }

    public Ledger moneyfunds(BigDecimal moneyfunds) {
        this.moneyfunds = moneyfunds;
        return this;
    }

    public Ledger netliquidationvalue(BigDecimal netliquidationvalue) {
        this.netliquidationvalue = netliquidationvalue;
        return this;
    }

    public Ledger realizedpnl(BigDecimal realizedpnl) {
        this.realizedpnl = realizedpnl;
        return this;
    }

    public Ledger sessionid(Integer sessionid) {
        this.sessionid = sessionid;
        return this;
    }

    public Ledger settledcash(BigDecimal settledcash) {
        this.settledcash = settledcash;
        return this;
    }

    public Ledger severity(Integer severity) {
        this.severity = severity;
        return this;
    }

    public Ledger stockmarketvalue(BigDecimal stockmarketvalue) {
        this.stockmarketvalue = stockmarketvalue;
        return this;
    }

    public Ledger timestamp(Integer timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public Ledger unrealizedpnl(BigDecimal unrealizedpnl) {
        this.unrealizedpnl = unrealizedpnl;
        return this;
    }

    public Ledger warrantsmarketvalue(BigDecimal warrantsmarketvalue) {
        this.warrantsmarketvalue = warrantsmarketvalue;
        return this;
    }

}

