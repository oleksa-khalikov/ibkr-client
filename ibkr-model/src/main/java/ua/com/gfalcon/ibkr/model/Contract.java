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

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Contains all details of the contract, including rules you can use when placing orders.
 **/
@ApiModel(description = "Contains all details of the contract, including rules you can use when placing orders")
@Validated
public class Contract {

    /**
     * true means you can trade outside RTH(regular trading hours).
     **/
    @JsonProperty("r_t_h")
    @ApiModelProperty(value = "true means you can trade outside RTH(regular trading hours)")
    @SerializedName("r_t_h")
    private Boolean regularTradingHours = null;

    /**
     * same as that in request.
     **/
    @JsonProperty("con_id")
    @ApiModelProperty(value = "same as that in request")
    @SerializedName("con_id")
    private String conId = null;

    /**
     * Contracts company name.
     **/
    @JsonProperty("company_name")
    @ApiModelProperty(value = "Contracts company name")
    @SerializedName("company_name")
    private String companyName = null;

    @JsonProperty("exchange")
    @ApiModelProperty(value = "")
    @SerializedName("exchange")
    private String exchange = null;

    /**
     * for exmple FB.
     **/
    @JsonProperty("local_symbol")
    @ApiModelProperty(value = "for exmple FB")
    @SerializedName("local_symbol")
    private String localSymbol = null;

    /**
     * for example STK.
     **/
    @JsonProperty("instrument_type")
    @ApiModelProperty(value = "for example STK")
    @SerializedName("instrument_type")
    private String instrumentType = null;

    @JsonProperty("currency")
    @ApiModelProperty(value = "")
    @SerializedName("currency")
    private String currency = null;

    @JsonProperty("companyName")
    @ApiModelProperty(value = "")
    @SerializedName("companyName")
    private String companyName2 = null;

    @JsonProperty("category")
    @ApiModelProperty(value = "")
    @SerializedName("category")
    private String category = null;

    @JsonProperty("industry")
    @ApiModelProperty(value = "")
    @SerializedName("industry")
    private String industry = null;

    @JsonProperty("rules")
    @ApiModelProperty(value = "")
    @SerializedName("rules")
    private Object rules = null;

    /**
     * Get category.
     *
     * @return category
     **/
    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Contracts company name.
     *
     * @return companyName
     **/
    @JsonProperty("company_name")
    @ApiModelProperty(value = "Contracts company name")
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * Get companyName.
     *
     * @return companyName
     **/
    @JsonProperty("companyName")
    public String getCompanyName2() {
        return companyName2;
    }

    public void setCompanyName2(String companyName) {
        this.companyName = companyName;
    }

    /**
     * same as that in request.
     *
     * @return conId
     **/
    @JsonProperty("con_id")
    @ApiModelProperty(value = "same as that in request")
    public String getConId() {
        return conId;
    }

    public void setConId(String conId) {
        this.conId = conId;
    }

    /**
     * Get currency.
     *
     * @return currency
     **/
    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Get exchange.
     *
     * @return exchange
     **/
    @JsonProperty("exchange")
    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    /**
     * Get industry.
     *
     * @return industry
     **/
    @JsonProperty("industry")
    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    /**
     * for example STK.
     *
     * @return instrumentType
     **/
    @JsonProperty("instrument_type")
    @ApiModelProperty(value = "for example STK")
    public String getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(String instrumentType) {
        this.instrumentType = instrumentType;
    }

    /**
     * for example FB.
     *
     * @return localSymbol
     **/
    @JsonProperty("local_symbol")
    @ApiModelProperty(value = "for example FB")
    public String getLocalSymbol() {
        return localSymbol;
    }

    public void setLocalSymbol(String localSymbol) {
        this.localSymbol = localSymbol;
    }

    /**
     * Get rules.
     *
     * @return rules
     **/
    @JsonProperty("rules")
    public Object getRules() {
        return rules;
    }

    public void setRules(Object rules) {
        this.rules = rules;
    }

    public void setRegularTradingHours(Boolean regularTradingHours) {
        this.regularTradingHours = regularTradingHours;
    }

    @Override
    public int hashCode() {
        return Objects.hash(regularTradingHours, conId, companyName, exchange,
                localSymbol, instrumentType, currency, companyName,
                category, industry, rules);
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Contract contract = (Contract) o;
        return Objects.equals(this.regularTradingHours, contract.regularTradingHours)
                && Objects.equals(this.conId, contract.conId) && Objects.equals(
                this.companyName, contract.companyName) && Objects.equals(this.exchange, contract.exchange)
                && Objects.equals(this.localSymbol, contract.localSymbol) && Objects.equals(this.instrumentType,
                contract.instrumentType) && Objects.equals(this.currency, contract.currency) && Objects.equals(
                this.companyName, contract.companyName) && Objects.equals(this.category, contract.category)
                && Objects.equals(this.industry, contract.industry) && Objects.equals(this.rules, contract.rules);
    }

    @Override
    public String toString() {

        String sb = "class Contract {\n" + "    rTH: " + toIndentedString(regularTradingHours) + "\n" + "    conId: "
                + toIndentedString(conId) + "\n" + "    companyName: " + toIndentedString(companyName) + "\n"
                + "    exchange: " + toIndentedString(exchange) + "\n" + "    localSymbol: " + toIndentedString(
                localSymbol) + "\n" + "    instrumentType: " + toIndentedString(instrumentType) + "\n"
                + "    currency: " + toIndentedString(currency) + "\n" + "    companyName: " + toIndentedString(
                companyName) + "\n" + "    category: " + toIndentedString(category) + "\n" + "    industry: "
                + toIndentedString(industry) + "\n" + "    rules: " + toIndentedString(rules) + "\n" + "}";
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

    public Contract category(String category) {
        this.category = category;
        return this;
    }

    public Contract companyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public Contract companyName2(String companyName) {
        this.companyName2 = companyName;
        return this;
    }

    public Contract conId(String conId) {
        this.conId = conId;
        return this;
    }

    public Contract currency(String currency) {
        this.currency = currency;
        return this;
    }

    public Contract exchange(String exchange) {
        this.exchange = exchange;
        return this;
    }

    public Contract industry(String industry) {
        this.industry = industry;
        return this;
    }

    public Contract instrumentType(String instrumentType) {
        this.instrumentType = instrumentType;
        return this;
    }

    /**
     * true means you can trade outside RTH(regular trading hours).
     *
     * @return rTH
     **/
    @JsonProperty("r_t_h")
    @ApiModelProperty(value = "true means you can trade outside RTH(regular trading hours)")
    public Boolean isRegularTradingHours() {
        return regularTradingHours;
    }

    public Contract localSymbol(String localSymbol) {
        this.localSymbol = localSymbol;
        return this;
    }

    public Contract regularTradingHours(Boolean regularTradingHours) {
        this.regularTradingHours = regularTradingHours;
        return this;
    }

    public Contract rules(Object rules) {
        this.rules = rules;
        return this;
    }

}

