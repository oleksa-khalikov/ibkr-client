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

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Security definitions for the given conids.
 */
@ApiModel(description = "Security definitions for the given conids.")
public class SecurityDefinitions {

    /**
     * IBKR contract identifier.
     */
    @ApiModelProperty(value = "IBKR contract identifier.")
    @JsonProperty("conid")
    @SerializedName("conid")
    private Integer conid;

    /**
     * Currency contract trades in.
     */
    @ApiModelProperty(value = "Currency contract trades in.")
    @JsonProperty("currency")
    @SerializedName("currency")
    private String currency;

    /**
     * Defines if a derivative contract has a different currency.
     */
    @ApiModelProperty(value = "")
    @JsonProperty("crossCurrency")
    @SerializedName("crossCurrency")
    private Boolean crossCurrency;

    @ApiModelProperty(value = "")
    @JsonProperty("time")
    @SerializedName("time")
    private Integer time;

    /**
     * HTML encoded company description in Chinese.
     */
    @ApiModelProperty(value = "")
    @JsonProperty("chineseName")
    @SerializedName("chineseName")
    private String chineseName;

    /**
     * List of exchanges and venues contract trades.
     */
    @ApiModelProperty(value = "")
    @JsonProperty("allExchanges")
    @SerializedName("allExchanges")
    private String allExchanges;

    /**
     * Main trading venue.
     */
    @ApiModelProperty(value = "")
    @JsonProperty("listingExchange")
    @SerializedName("listingExchange")
    private String listingExchange;

    /**
     * Company Name.
     */
    @ApiModelProperty(value = "")
    @JsonProperty("name")
    @SerializedName("name")
    private String name;

    /**
     * Group of financial instruments which have similar financial characteristics and behave similar in the
     * marketplace.
     */
    @ApiModelProperty(value = "")
    @JsonProperty("assetClass")
    @SerializedName("assetClass")
    private String assetClass;

    /**
     * Specific data contract expires.
     */
    @ApiModelProperty(value = "")
    @JsonProperty("expiry")
    @SerializedName("expiry")
    private String expiry;

    /**
     * Final day derivative contract can be traded before delivery of the underlying asset or cash settlement.
     */
    @ApiModelProperty(value = "")
    @JsonProperty("lastTradingDay")
    @SerializedName("lastTradingDay")
    private String lastTradingDay;

    /**
     * Potential characteristic of each product.
     */
    @ApiModelProperty(value = "")
    @JsonProperty("group")
    @SerializedName("group")
    private String group;

    /**
     * Defines the right to buy or sell of the underlying security.
     */
    @ApiModelProperty(value = "")
    @JsonProperty("putOrCall")
    @SerializedName("putOrCall")
    private String putOrCall;

    /**
     * The category of the economy.
     */
    @ApiModelProperty(value = "")
    @JsonProperty("sector")
    @SerializedName("sector")
    private String sector;

    /**
     * Stock Group contract belongs too.
     */
    @ApiModelProperty(value = "")
    @JsonProperty("sectorGroup")
    @SerializedName("sectorGroup")
    private String sectorGroup;

    /**
     * Set price at which a derivative contract can be bought or sold.
     */
    @ApiModelProperty(value = "")
    @JsonProperty("strike")
    @SerializedName("strike")
    private BigDecimal strike;

    /**
     * Contract symbol.
     */
    @ApiModelProperty(value = "")
    @JsonProperty("ticker")
    @SerializedName("ticker")
    private String ticker;

    /**
     * Underlying contract identifier.
     */
    @ApiModelProperty(value = "")
    @JsonProperty("undConid")
    @SerializedName("undConid")
    private Integer undConid;

    /**
     * Multiplier for total premium paid or received for derivative contract.
     */
    @ApiModelProperty(value = "")
    @JsonProperty("multiplier")
    @SerializedName("multiplier")
    private Integer multiplier;

    /**
     * Stock type.
     */
    @ApiModelProperty(value = "Stock type.")
    @JsonProperty("type")
    @SerializedName("type")
    private String type;

    /**
     * Company name for underlying contract.
     */
    @ApiModelProperty(value = "Company name for underlying contract.")
    @JsonProperty("undComp")
    @SerializedName("undComp")
    private String undComp;

    /**
     * IBKR Symbol for underlying contract.
     */
    @ApiModelProperty(value = "IBKR Symbol for underlying contract.")
    @JsonProperty("undSym")
    @SerializedName("undSym")
    private String undSym;

    /**
     * If contract has an option.
     */
    @ApiModelProperty(value = "If contract has an option.")
    @JsonProperty("hasOptions")
    @SerializedName("hasOptions")
    private Boolean hasOptions;

    /**
     * Formatted company name with underlying symbol, expiration, strike, right.
     */
    @ApiModelProperty(value = "Formatted company name with underlying symbol, expiration, strike, right.")
    @JsonProperty("fullName")
    @SerializedName("fullName")
    private String fullName;

    /**
     * If contract is a US contract. Currently supported for stocks, options and warrants.
     */
    @ApiModelProperty(value = "If contract is a US contract. Currently supported for stocks, options and warrants.")
    @JsonProperty("isUS")
    @SerializedName("isUS")
    private Boolean isUS;

    /**
     * Price increment value contract trades.
     */
    @ApiModelProperty(value = "Price increment value contract trades.")
    @JsonProperty("incrementRules")
    @SerializedName("incrementRules")
    private IncrementRules incrementRules;

    public Boolean getUS() {
        return isUS;
    }

    public void setUS(Boolean us) {
        isUS = us;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getConid(), getCurrency(), getCrossCurrency(), getTime(), getChineseName(),
                getAllExchanges(), getListingExchange(), getName(), getAssetClass(), getExpiry(), getLastTradingDay(),
                getGroup(), getPutOrCall(), getSector(), getSectorGroup(), getStrike(), getTicker(), getUndConid(),
                getMultiplier(), getType(), getUndComp(), getUndSym(), getHasOptions(), getFullName(), isUS,
                getIncrementRules());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SecurityDefinitions)) {
            return false;
        }
        SecurityDefinitions that = (SecurityDefinitions) o;
        return Objects.equals(getConid(), that.getConid()) && Objects.equals(getCurrency(), that.getCurrency())
                && Objects.equals(getCrossCurrency(), that.getCrossCurrency()) && Objects.equals(getTime(),
                that.getTime()) && Objects.equals(getChineseName(), that.getChineseName()) && Objects.equals(
                getAllExchanges(), that.getAllExchanges()) && Objects.equals(getListingExchange(),
                that.getListingExchange()) && Objects.equals(getName(), that.getName()) && Objects.equals(
                getAssetClass(), that.getAssetClass()) && Objects.equals(getExpiry(), that.getExpiry())
                && Objects.equals(getLastTradingDay(), that.getLastTradingDay()) && Objects.equals(getGroup(),
                that.getGroup()) && Objects.equals(getPutOrCall(), that.getPutOrCall()) && Objects.equals(getSector(),
                that.getSector()) && Objects.equals(getSectorGroup(), that.getSectorGroup()) && Objects.equals(
                getStrike(), that.getStrike()) && Objects.equals(getTicker(), that.getTicker()) && Objects.equals(
                getUndConid(), that.getUndConid()) && Objects.equals(getMultiplier(), that.getMultiplier())
                && Objects.equals(getType(), that.getType()) && Objects.equals(getUndComp(), that.getUndComp())
                && Objects.equals(getUndSym(), that.getUndSym()) && Objects.equals(getHasOptions(),
                that.getHasOptions()) && Objects.equals(getFullName(), that.getFullName()) && Objects.equals(isUS,
                that.isUS) && Objects.equals(getIncrementRules(), that.getIncrementRules());
    }

    @Override
    public String toString() {
        String sb = "SecurityDefinitions{" + "conid=" + conid + ", currency='" + currency + '\'' + ", crossCurrency="
                + crossCurrency + ", time=" + time + ", chineseName='" + chineseName + '\'' + ", allExchanges='"
                + allExchanges + '\'' + ", listingExchange='" + listingExchange + '\'' + ", name='" + name + '\''
                + ", assetClass='" + assetClass + '\'' + ", expiry='" + expiry + '\'' + ", lastTradingDay='"
                + lastTradingDay + '\'' + ", group='" + group + '\'' + ", putOrCall='" + putOrCall + '\'' + ", sector='"
                + sector + '\'' + ", sectorGroup='" + sectorGroup + '\'' + ", strike=" + strike + ", ticker='" + ticker
                + '\'' + ", undConid=" + undConid + ", multiplier=" + multiplier + ", type='" + type + '\''
                + ", undComp='" + undComp + '\'' + ", undSym='" + undSym + '\'' + ", hasOptions=" + hasOptions
                + ", fullName='" + fullName + '\'' + ", isUS=" + isUS + ", incrementRules=" + incrementRules + '}';
        return sb;
    }

    public Integer getConid() {
        return conid;
    }

    public void setConid(Integer conid) {
        this.conid = conid;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Boolean getCrossCurrency() {
        return crossCurrency;
    }

    public void setCrossCurrency(Boolean crossCurrency) {
        this.crossCurrency = crossCurrency;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public String getChineseName() {
        return chineseName;
    }

    public void setChineseName(String chineseName) {
        this.chineseName = chineseName;
    }

    public String getAllExchanges() {
        return allExchanges;
    }

    public void setAllExchanges(String allExchanges) {
        this.allExchanges = allExchanges;
    }

    public String getListingExchange() {
        return listingExchange;
    }

    public void setListingExchange(String listingExchange) {
        this.listingExchange = listingExchange;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAssetClass() {
        return assetClass;
    }

    public void setAssetClass(String assetClass) {
        this.assetClass = assetClass;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public String getLastTradingDay() {
        return lastTradingDay;
    }

    public void setLastTradingDay(String lastTradingDay) {
        this.lastTradingDay = lastTradingDay;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getPutOrCall() {
        return putOrCall;
    }

    public void setPutOrCall(String putOrCall) {
        this.putOrCall = putOrCall;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getSectorGroup() {
        return sectorGroup;
    }

    public void setSectorGroup(String sectorGroup) {
        this.sectorGroup = sectorGroup;
    }

    public BigDecimal getStrike() {
        return strike;
    }

    public void setStrike(BigDecimal strike) {
        this.strike = strike;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public Integer getUndConid() {
        return undConid;
    }

    public void setUndConid(Integer undConid) {
        this.undConid = undConid;
    }

    public Integer getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(Integer multiplier) {
        this.multiplier = multiplier;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUndComp() {
        return undComp;
    }

    public void setUndComp(String undComp) {
        this.undComp = undComp;
    }

    public String getUndSym() {
        return undSym;
    }

    public void setUndSym(String undSym) {
        this.undSym = undSym;
    }

    public Boolean getHasOptions() {
        return hasOptions;
    }

    public void setHasOptions(Boolean hasOptions) {
        this.hasOptions = hasOptions;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public IncrementRules getIncrementRules() {
        return incrementRules;
    }

    public void setIncrementRules(IncrementRules incrementRules) {
        this.incrementRules = incrementRules;
    }

}
