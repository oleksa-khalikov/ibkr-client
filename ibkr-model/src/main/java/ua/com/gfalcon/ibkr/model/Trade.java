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

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Objects;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.swagger.annotations.ApiModelProperty;

/**
 * Trade.
 */
@Validated
public class Trade {

    /**
     * execution identifier for the order.
     **/
    @ApiModelProperty(value = "execution identifier for the order")
    @JsonProperty("execution_id")
    @SerializedName("execution_id")
    private String executionId = null;

    /**
     * Underlying Symbol.
     **/
    @ApiModelProperty(value = "Underlying Symbol")
    @JsonProperty("symbol")
    @SerializedName("symbol")
    private String symbol = null;

    /**
     * The side of the market of the order.
     * * B - Buy contract near posted ask price
     * * S - Sell contract near posted bid price
     * * X - Option expired
     **/
    @ApiModelProperty(
            value = "The side of the market of the order.   "
                    + "* B - Buy contract near posted ask price   "
                    + "* S - Sell contract near posted bid price   "
                    + "* X - Option expired ")
    @JsonProperty("side")
    @SerializedName("side")
    private SideEnum side = null;

    /**
     * Formatted description of the order \"%side% %size% @ %price% on %exchange%\".
     **/
    @ApiModelProperty(value = "Formatted description of the order \"%side% %size% @ %price% on %exchange%\".")
    @JsonProperty("order_description")
    @SerializedName("order_description")
    private String orderDescription = null;

    /**
     * Time of Status update in format \"YYYYMMDD-hh:mm:ss\".
     **/
    @ApiModelProperty(value = "Time of Status update in format \"YYYYMMDD-hh:mm:ss\".")
    @JsonProperty("trade_time")
    @SerializedName("trade_time")
    private String tradeTime = null;

    /**
     * Time of status update in format unix time.
     **/
    @ApiModelProperty(value = "Time of status update in format unix time.")
    @JsonProperty("trade_time_r")
    @SerializedName("trade_time_r")
    private BigDecimal tradeTimeR = null;

    /**
     * Quantity of the order.
     **/
    @ApiModelProperty(value = "Quantity of the order")
    @JsonProperty("size")
    @SerializedName("size")
    private String size = null;

    /**
     * Average Price.
     **/
    @ApiModelProperty(value = "Average Price")
    @JsonProperty("price")
    @SerializedName("price")
    private String price = null;

    /**
     * User defined string used to identify the order. Value is set using \"cOID\" field while placing an order.
     **/
    @ApiModelProperty(
            value = "User defined string used to identify the order. Value is set using \"cOID\" "
                    + "field while placing an order.")
    @JsonProperty("order_ref")
    @SerializedName("order_ref")
    private String orderRef = null;

    /**
     * User that submitted order.
     **/
    @ApiModelProperty(value = "User that submitted order")
    @JsonProperty("submitter")
    @SerializedName("submitter")
    private String submitter = null;

    /**
     * Exchange or venue of order.
     **/
    @ApiModelProperty(value = "Exchange or venue of order")
    @JsonProperty("exchange")
    @SerializedName("exchange")
    private String exchange = null;

    /**
     * Commission of the order.
     **/
    @ApiModelProperty(value = "Commission of the order")
    @JsonProperty("commission")
    @SerializedName("commission")
    private BigDecimal commission = null;

    /**
     * Net cost of the order, including contract multiplier and quantity.
     **/
    @ApiModelProperty(value = "Net cost of the order, including contract multiplier and quantity.")
    @JsonProperty("net_amount")
    @SerializedName("net_amount")
    private BigDecimal netAmount = null;

    /**
     * accountCode.
     **/
    @ApiModelProperty(value = "accountCode")
    @JsonProperty("account")
    @SerializedName("account")
    private String account = null;

    /**
     * Account Number.
     **/
    @ApiModelProperty(value = "Account Number")
    @JsonProperty("acountCode")
    @SerializedName("acountCode")
    private String acountCode = null;

    /**
     * Contracts company name.
     **/
    @ApiModelProperty(value = "Contracts company name")
    @JsonProperty("company_name")
    @SerializedName("company_name")
    private String companyName = null;

    /**
     * Format contract name.
     **/
    @ApiModelProperty(example = "FB Stock (NASDAQ.NMS)", value = "Format contract name")
    @JsonProperty("contract_description_1")
    @SerializedName("contract_description_1")
    private String contractDescription1 = null;

    /**
     * Asset class.
     **/
    @ApiModelProperty(example = "STK, FUT, OPT", value = "Asset class")
    @JsonProperty("sec_type")
    @SerializedName("sec_type")
    private String secType = null;

    /**
     * IBKR's contract identifier.
     **/
    @ApiModelProperty(value = "IBKR's contract identifier")
    @JsonProperty("conid")
    @SerializedName("conid")
    private String conid = null;

    /**
     * conid and exchange. Format supports conid or conid@exchange
     **/
    @ApiModelProperty(value = "conid and exchange. Format supports conid or conid@exchange")
    @JsonProperty("conidex")
    @SerializedName("conidex")
    private String conidex = null;

    /**
     * Total quantity owned for this contract.
     **/
    @ApiModelProperty(value = "Total quantity owned for this contract")
    @JsonProperty("position")
    @SerializedName("position")
    private String position = null;

    /**
     * Firm which will settle the trade. For IBExecution customers only.
     **/
    @ApiModelProperty(value = "Firm which will settle the trade. For IBExecution customers only.")
    @JsonProperty("clearing_id")
    @SerializedName("clearing_id")
    private String clearingId = null;

    /**
     * Specifies the true beneficiary of the order. For IBExecution customers only.
     **/
    @ApiModelProperty(value = "Specifies the true beneficiary of the order. For IBExecution customers only.")
    @JsonProperty("clearing_name")
    @SerializedName("clearing_name")
    private String clearingName = null;

    /**
     * If order adds liquidity to the market.
     */
    @ApiModelProperty(value = "If order adds liquidity to the market.")
    @JsonProperty("liquidation_trade")
    @SerializedName("liquidation_trade")
    private BigDecimal liquidationTrade = null;

    /**
     * accountCode.
     *
     * @return account
     **/
    @JsonProperty("account")
    @ApiModelProperty(value = "accountCode")
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * Account Number.
     *
     * @return acountCode
     **/
    @JsonProperty("acountCode")
    @ApiModelProperty(value = "Account Number")
    public String getAcountCode() {
        return acountCode;
    }

    public void setAcountCode(String acountCode) {
        this.acountCode = acountCode;
    }

    /**
     * Firm which will settle the trade. For IBExecution customers only.
     *
     * @return clearingId
     **/
    @JsonProperty("clearing_id")
    @ApiModelProperty(value = "Firm which will settle the trade. For IBExecution customers only.")
    public String getClearingId() {
        return clearingId;
    }

    public void setClearingId(String clearingId) {
        this.clearingId = clearingId;
    }

    /**
     * Specifies the true beneficiary of the order. For IBExecution customers only.
     *
     * @return clearingName
     **/
    @JsonProperty("clearing_name")
    @ApiModelProperty(value = "Specifies the true beneficiary of the order. For IBExecution customers only.")
    public String getClearingName() {
        return clearingName;
    }

    public void setClearingName(String clearingName) {
        this.clearingName = clearingName;
    }

    /**
     * Commission of the order.
     *
     * @return commission
     **/
    @JsonProperty("commission")
    @ApiModelProperty(value = "Commission of the order")
    @Valid
    public BigDecimal getCommission() {
        return commission;
    }

    public void setCommission(BigDecimal commission) {
        this.commission = commission;
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
     * IBKR's contract identifier.
     *
     * @return conid
     **/
    @JsonProperty("conid")
    @ApiModelProperty(value = "IBKR's contract identifier")
    public String getConid() {
        return conid;
    }

    public void setConid(String conid) {
        this.conid = conid;
    }

    /**
     * conid and exchange. Format supports conid or conid@exchange
     *
     * @return conidex
     **/
    @JsonProperty("conidex")
    @ApiModelProperty(value = "conid and exchange. Format supports conid or conid@exchange")
    public String getConidex() {
        return conidex;
    }

    public void setConidex(String conidex) {
        this.conidex = conidex;
    }

    /**
     * Format contract name.
     *
     * @return contractDescription1
     **/
    @JsonProperty("contract_description_1")
    @ApiModelProperty(example = "FB Stock (NASDAQ.NMS)", value = "Format contract name")
    public String getContractDescription1() {
        return contractDescription1;
    }

    public void setContractDescription1(String contractDescription1) {
        this.contractDescription1 = contractDescription1;
    }

    /**
     * Exchange or venue of order.
     *
     * @return exchange
     **/
    @JsonProperty("exchange")
    @ApiModelProperty(value = "Exchange or venue of order")
    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    /**
     * execution identifier for the order.
     *
     * @return executionId
     **/
    @JsonProperty("execution_id")
    @ApiModelProperty(value = "execution identifier for the order")
    public String getExecutionId() {
        return executionId;
    }

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    /**
     * If order adds liquidity to the market.
     *
     * @return liquidationTrade
     **/
    @JsonProperty("liquidation_trade")
    @ApiModelProperty(value = "If order adds liquidity to the market.")
    @Valid
    public BigDecimal getLiquidationTrade() {
        return liquidationTrade;
    }

    public void setLiquidationTrade(BigDecimal liquidationTrade) {
        this.liquidationTrade = liquidationTrade;
    }

    /**
     * Net cost of the order, including contract multiplier and quantity.
     *
     * @return netAmount
     **/
    @JsonProperty("net_amount")
    @ApiModelProperty(value = "Net cost of the order, including contract multiplier and quantity.")
    @Valid
    public BigDecimal getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(BigDecimal netAmount) {
        this.netAmount = netAmount;
    }

    /**
     * Formatted description of the order \"%side% %size% @ %price% on %exchange%\".
     *
     * @return orderDescription
     **/
    @JsonProperty("order_description")
    @ApiModelProperty(value = "Formatted description of the order \"%side% %size% @ %price% on %exchange%\".")
    public String getOrderDescription() {
        return orderDescription;
    }

    public void setOrderDescription(String orderDescription) {
        this.orderDescription = orderDescription;
    }

    /**
     * User defined string used to identify the order. Value is set using \"cOID\" field while placing an order.
     *
     * @return orderRef
     **/
    @JsonProperty("order_ref")
    @ApiModelProperty(
            value = "User defined string used to identify the order. "
                    + "Value is set using \"cOID\" field while placing an order.")
    public String getOrderRef() {
        return orderRef;
    }

    public void setOrderRef(String orderRef) {
        this.orderRef = orderRef;
    }

    /**
     * Total quantity owned for this contract.
     *
     * @return position
     **/
    @JsonProperty("position")
    @ApiModelProperty(value = "Total quantity owned for this contract")
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * Average Price.
     *
     * @return price
     **/
    @JsonProperty("price")
    @ApiModelProperty(value = "Average Price")
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * Asset class.
     *
     * @return secType
     **/
    @JsonProperty("sec_type")
    @ApiModelProperty(example = "STK, FUT, OPT", value = "Asset class")
    public String getSecType() {
        return secType;
    }

    public void setSecType(String secType) {
        this.secType = secType;
    }

    /**
     * The side of the market of the order.   * B - Buy contract near posted ask price   * S - Sell contract near posted
     * bid price   * X - Option expired
     *
     * @return side
     **/
    @JsonProperty("side")
    @ApiModelProperty(
            value = "The side of the market of the order."
                    + "   * B - Buy contract near posted ask price"
                    + "   * S - Sell contract near posted bid price"
                    + "   * X - Option expired ")
    public SideEnum getSide() {
        return side;
    }

    public void setSide(SideEnum side) {
        this.side = side;
    }

    /**
     * The side of the market of the order.   * B - Buy contract near posted ask price   * S - Sell contract near posted
     * bid price   * X - Option expired
     *
     * @return side
     **/
    @JsonProperty("side")
    public String getSideAsString() {
        if (side == null) {
            return null;
        }
        return side.value();
    }

    /**
     * Quantity of the order.
     *
     * @return size
     **/
    @JsonProperty("size")
    @ApiModelProperty(value = "Quantity of the order")
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    /**
     * User that submitted order.
     *
     * @return submitter
     **/
    @JsonProperty("submitter")
    @ApiModelProperty(value = "User that submitted order")
    public String getSubmitter() {
        return submitter;
    }

    public void setSubmitter(String submitter) {
        this.submitter = submitter;
    }

    /**
     * Underlying Symbol.
     *
     * @return symbol
     **/
    @JsonProperty("symbol")
    @ApiModelProperty(value = "Underlying Symbol")
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    /**
     * Time of Status update in format \"YYYYMMDD-hh:mm:ss\".
     *
     * @return tradeTime
     **/
    @JsonProperty("trade_time")
    @ApiModelProperty(value = "Time of Status update in format \"YYYYMMDD-hh:mm:ss\".")
    public String getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(String tradeTime) {
        this.tradeTime = tradeTime;
    }

    /**
     * Time of status update in format unix time.
     *
     * @return tradeTimeR
     **/
    @JsonProperty("trade_time_r")
    @ApiModelProperty(value = "Time of status update in format unix time.")
    @Valid
    public BigDecimal getTradeTimeR() {
        return tradeTimeR;
    }

    public void setTradeTimeR(BigDecimal tradeTimeR) {
        this.tradeTimeR = tradeTimeR;
    }

    @Override
    public int hashCode() {
        return Objects.hash(executionId, symbol, side, orderDescription, tradeTime, tradeTimeR, size, price, orderRef,
                submitter, exchange, commission, netAmount, account, acountCode, companyName, contractDescription1,
                secType, conid, conidex, position, clearingId, clearingName, liquidationTrade);
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Trade trade = (Trade) o;
        return Objects.equals(this.executionId, trade.executionId) && Objects.equals(this.symbol, trade.symbol)
                && Objects.equals(this.side, trade.side) && Objects.equals(this.orderDescription,
                trade.orderDescription) && Objects.equals(this.tradeTime, trade.tradeTime) && Objects.equals(
                this.tradeTimeR, trade.tradeTimeR) && Objects.equals(this.size, trade.size) && Objects.equals(
                this.price, trade.price) && Objects.equals(this.orderRef, trade.orderRef) && Objects.equals(
                this.submitter, trade.submitter) && Objects.equals(this.exchange, trade.exchange) && Objects.equals(
                this.commission, trade.commission) && Objects.equals(this.netAmount, trade.netAmount) && Objects.equals(
                this.account, trade.account) && Objects.equals(this.acountCode, trade.acountCode) && Objects.equals(
                this.companyName, trade.companyName) && Objects.equals(this.contractDescription1,
                trade.contractDescription1) && Objects.equals(this.secType, trade.secType) && Objects.equals(this.conid,
                trade.conid) && Objects.equals(this.conidex, trade.conidex) && Objects.equals(this.position,
                trade.position) && Objects.equals(this.clearingId, trade.clearingId) && Objects.equals(
                this.clearingName, trade.clearingName) && Objects.equals(this.liquidationTrade, trade.liquidationTrade);
    }

    @Override
    public String toString() {

        String sb = "class Trade {\n" + "    executionId: " + toIndentedString(executionId) + "\n" + "    symbol: "
                + toIndentedString(symbol) + "\n" + "    side: " + toIndentedString(side) + "\n"
                + "    orderDescription: " + toIndentedString(orderDescription) + "\n" + "    tradeTime: "
                + toIndentedString(tradeTime) + "\n" + "    tradeTimeR: " + toIndentedString(tradeTimeR) + "\n"
                + "    size: " + toIndentedString(size) + "\n" + "    price: " + toIndentedString(price) + "\n"
                + "    orderRef: " + toIndentedString(orderRef) + "\n" + "    submitter: " + toIndentedString(submitter)
                + "\n" + "    exchange: " + toIndentedString(exchange) + "\n" + "    commission: " + toIndentedString(
                commission) + "\n" + "    netAmount: " + toIndentedString(netAmount) + "\n" + "    account: "
                + toIndentedString(account) + "\n" + "    acountCode: " + toIndentedString(acountCode) + "\n"
                + "    companyName: " + toIndentedString(companyName) + "\n" + "    contractDescription1: "
                + toIndentedString(contractDescription1) + "\n" + "    secType: " + toIndentedString(secType) + "\n"
                + "    conid: " + toIndentedString(conid) + "\n" + "    conidex: " + toIndentedString(conidex) + "\n"
                + "    position: " + toIndentedString(position) + "\n" + "    clearingId: " + toIndentedString(
                clearingId) + "\n" + "    clearingName: " + toIndentedString(clearingName) + "\n"
                + "    liquidationTrade: " + toIndentedString(liquidationTrade) + "\n" + "}";
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

    public Trade account(String account) {
        this.account = account;
        return this;
    }

    public Trade acountCode(String acountCode) {
        this.acountCode = acountCode;
        return this;
    }

    public Trade clearingId(String clearingId) {
        this.clearingId = clearingId;
        return this;
    }

    public Trade clearingName(String clearingName) {
        this.clearingName = clearingName;
        return this;
    }

    public Trade commission(BigDecimal commission) {
        this.commission = commission;
        return this;
    }

    public Trade companyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public Trade conid(String conid) {
        this.conid = conid;
        return this;
    }

    public Trade conidex(String conidex) {
        this.conidex = conidex;
        return this;
    }

    public Trade contractDescription1(String contractDescription1) {
        this.contractDescription1 = contractDescription1;
        return this;
    }

    public Trade exchange(String exchange) {
        this.exchange = exchange;
        return this;
    }

    public Trade executionId(String executionId) {
        this.executionId = executionId;
        return this;
    }

    public Trade liquidationTrade(BigDecimal liquidationTrade) {
        this.liquidationTrade = liquidationTrade;
        return this;
    }

    public Trade netAmount(BigDecimal netAmount) {
        this.netAmount = netAmount;
        return this;
    }

    public Trade orderDescription(String orderDescription) {
        this.orderDescription = orderDescription;
        return this;
    }

    public Trade orderRef(String orderRef) {
        this.orderRef = orderRef;
        return this;
    }

    public Trade position(String position) {
        this.position = position;
        return this;
    }

    public Trade price(String price) {
        this.price = price;
        return this;
    }

    public Trade secType(String secType) {
        this.secType = secType;
        return this;
    }

    public Trade side(SideEnum side) {
        this.side = side;
        return this;
    }

    public Trade size(String size) {
        this.size = size;
        return this;
    }

    public Trade submitter(String submitter) {
        this.submitter = submitter;
        return this;
    }

    public Trade symbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    public Trade tradeTime(String tradeTime) {
        this.tradeTime = tradeTime;
        return this;
    }

    public Trade tradeTimeR(BigDecimal tradeTimeR) {
        this.tradeTimeR = tradeTimeR;
        return this;
    }

    /**
     * The side of the market of the order.   * B - Buy contract near posted ask price   * S - Sell contract near posted
     * bid price   * X - Option expired
     */
    @XmlType(name = "SideEnum")
    @XmlEnum(String.class)
    @JsonAdapter(SideEnum.Adapter.class)
    public enum SideEnum {

        @XmlEnumValue("B") B("B"),

        @XmlEnumValue("S") S("S"),

        @XmlEnumValue("X") X("X");

        private final String value;

        SideEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        /**
         * Side.
         */
        @SuppressWarnings("checkstyle:MissingJavadocMethod")
        @JsonCreator
        public static SideEnum fromValue(String text) {
            for (SideEnum b : SideEnum.values()) {
                if (String.valueOf(b.value)
                        .equals(text)) {
                    return b;
                }
            }
            return null;
        }

        /**
         * value.
         */
        public String value() {
            return value;
        }

        /**
         * Adapter.
         */
        public static class Adapter extends TypeAdapter<SideEnum> {

            @Override
            public void write(final JsonWriter jsonWriter, final SideEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public SideEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return SideEnum.fromValue(String.valueOf(value));
            }

        }
    }

}

