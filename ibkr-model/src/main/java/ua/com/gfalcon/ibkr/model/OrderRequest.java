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
 * Order Request.
 */
@Validated
public class OrderRequest {

    /**
     * acctId is optional. It should be one of the accounts returned by /iserver/accounts.
     * If not passed, the first one in the list is selected.
     **/
    @ApiModelProperty(
            value = "acctId is optional. It should be one of the accounts returned by /iserver/accounts."
                    + " If not passed, the first one in the list is selected. ")
    @JsonProperty("acctId")
    @SerializedName("acctId")
    private String acctId = null;

    /**
     * conid is the identifier of the security you want to trade, you can find the conid with /iserver/secdef/search.
     **/
    @ApiModelProperty(
            value = "conid is the identifier of the security you want to trade,"
                    + " you can find the conid with /iserver/secdef/search. ")
    @JsonProperty("conid")
    @SerializedName("conid")
    private Integer conid = null;

    /**
     * Conid and Exchange - Can be used instead of conid when specifying the contract identifier of a security.
     **/
    @ApiModelProperty(
            example = "conidex = 265598",
            value = "Conid and Exchange - Can be used instead of conid when specifying the contract"
                    + " identifier of a security. ")
    @JsonProperty("conidex")
    @SerializedName("conidex")
    private String conidex = null;

    /**
     * The contract-identifier (conid) and security type (type) specified as a concatenated value, conid:type.
     **/
    @ApiModelProperty(
            example = "secType = 265598:STK",
            value = "The contract-identifier (conid) and security type (type) specified"
                    + " as a concatenated value, conid:type")
    @JsonProperty("secType")
    @SerializedName("secType")
    private String secType = null;

    /**
     * Customer Order ID. An arbitrary string that can be used to identify the order, e.g \"my-fb-order\".
     * The value must be unique for a 24h span.
     * Please do not set this value for child orders when placing a bracket order.
     **/
    @ApiModelProperty(
            value = "Customer Order ID. An arbitrary string that can be used to identify the order,"
                    + " e.g \"my-fb-order\". The value must be unique for a 24h span. Please do not set this value"
                    + " for child orders when placing a bracket order. ")
    @JsonProperty("cOID")
    @SerializedName("cOID")
    private String customerOrderId = null;

    /**
     * Only specify for child orders when placing bracket orders. The parentId for the child order(s) must be equal
     * to the cOId (customer order id) of the parent.
     **/
    @ApiModelProperty(
            value = "Only specify for child orders when placing bracket orders. The parentId for the child order(s)"
                    + " must be equal to the cOId (customer order id) of the parent. ")
    @JsonProperty("parentId")
    @SerializedName("parentId")
    private String parentId = null;

    /**
     * The order-type determines what type of order you want to send.
     * * LMT - A limit order is an order to buy or sell at the specified price or better.
     * * MKT - A market order is an order to buy or sell at the markets current NBBO.
     * * STP - A stop order becomes a market order once the specified stop price is attained or penetrated.
     * * STOP_LIMIT - A stop limit order becomes a limit order once the specified stop price is attained or penetrated.
     * * MIDPRICE - A MidPrice order attempts to fill at the current midpoint of the NBBO or better.
     **/
    @ApiModelProperty(
            value = "The order-type determines what type of order you want to send."
                    + "   * LMT - A limit order is an order to buy or sell at the specified price or better."
                    + "   * MKT - A market order is an order to buy or sell at the markets current NBBO."
                    + "   * STP - A stop order becomes a market order once the specified stop price is"
                    + " attained or penetrated."
                    + "   * STOP_LIMIT - A stop limit order becomes a limit order once the specified stop price"
                    + " is attained or penetrated."
                    + "   * MIDPRICE - A MidPrice order attempts to fill at the current midpoint"
                    + " of the NBBO or better. ")
    @JsonProperty("orderType")
    @SerializedName("orderType")
    private String orderType = null;

    /**
     * listingExchange is optional. By default we use \"SMART\" routing. Possible values are available
     * via the endpoint: /iserver/contract/{conid}/info, see **valid_exchange** e.g: SMART,AMEX,NYSE,CBOE,ISE,CHX,
     * ARCA,ISLAND,DRCTEDGE,BEX,BATS,EDGEA,CSFBALGO,JE FFALGO,BYX,IEX,FOXRIVER,TPLUS1,NYSENAT,PSX
     **/
    @ApiModelProperty(
            value = "listingExchange is optional. By default we use \"SMART\" routing. Possible values are available"
                    + " via the endpoint: /iserver/contract/{conid}/info,"
                    + " see **valid_exchange** e.g: SMART,AMEX,NYSE,CBOE,ISE,CHX,ARCA,ISLAND,DRCTEDGE,BEX,BATS,EDGEA,"
                    + "CSFBALGO,JE FFALGO,BYX,IEX,FOXRIVER,TPLUS1,NYSENAT,PSX ")
    @JsonProperty("listingExchange")
    @SerializedName("listingExchange")
    private String listingExchange = null;

    /**
     * set to true if you want to place a single group orders(OCA).
     **/
    @ApiModelProperty(value = "set to true if you want to place a single group orders(OCA) ")
    @JsonProperty("isSingleGroup")
    @SerializedName("isSingleGroup")
    private Boolean isSingleGroup = null;

    /**
     * set to true if the order can be executed outside regular trading hours.
     **/
    @ApiModelProperty(value = "set to true if the order can be executed outside regular trading hours. ")
    @JsonProperty("outsideRTH")
    @SerializedName("outsideRTH")
    private Boolean outsideRTH = null;

    /**
     * optional if order is LMT, or STOP_LIMIT, this is the limit price. For STP this is the stop price.
     * For MIDPRICE this is the option price cap.
     **/
    @ApiModelProperty(
            value = "optional if order is LMT, or STOP_LIMIT, this is the limit price. For STP this is the stop price."
                    + " For MIDPRICE this is the option price cap. ")
    @JsonProperty("price")
    @SerializedName("price")
    private BigDecimal price = null;

    /**
     * optional if order is STOP_LIMIT, this is the stop price. You must specify both price and auxPrice
     * for STOP_LIMIT orders.
     **/
    @ApiModelProperty(
            value = "optional if order is STOP_LIMIT, this is the stop price. You must specify both price and"
                    + " auxPrice for STOP_LIMIT orders. ")
    @JsonProperty("auxPrice")
    @SerializedName("auxPrice")
    private Object auxPrice = null;

    /**
     * SELL or BUY.
     **/
    @ApiModelProperty(value = "SELL or BUY")
    @JsonProperty("side")
    @SerializedName("side")
    private String side = null;

    /**
     * This is the  underlying symbol for the contract.
     **/
    @ApiModelProperty(value = "This is the  underlying symbol for the contract. ")
    @JsonProperty("ticker")
    @SerializedName("ticker")
    private String ticker = null;

    /**
     * The Time-In-Force determines how long the order remains active on the market.
     * * GTC - use Good-Till-Cancel for orders to remain active until it executes or cancelled.
     * * OPG - use Open-Price-Guarantee for Limit-On-Open (LOO) or Market-On-Open (MOO) orders.
     * * DAY - if not executed a Day order will automatically cancel at the end of the markets regular trading hours.
     * * IOC - any portion of an Immediate-or-Cancel order that is not filled as soon as it becomes available in
     * the market is cancelled.
     **/
    @ApiModelProperty(
            value = "The Time-In-Force determines how long the order remains active on the market."
                    + "   * GTC - use Good-Till-Cancel for orders to remain active until it executes or cancelled."
                    + "   * OPG - use Open-Price-Guarantee for Limit-On-Open (LOO) or Market-On-Open (MOO) orders."
                    + "   * DAY - if not executed a Day order will automatically cancel at the end of the markets"
                    + " regular trading hours."
                    + "   * IOC - any portion of an Immediate-or-Cancel order that is not filled as soon as it"
                    + " becomes available in the market is cancelled. ")
    @JsonProperty("tif")
    @SerializedName("tif")
    private String tif = null;

    /**
     * Custom order reference.
     **/
    @ApiModelProperty(example = "QuickTrade", value = "Custom order reference ")
    @JsonProperty("referrer")
    @SerializedName("referrer")
    private String referrer = null;

    /**
     * Usually integer, for some special cases such as fractional orders can specify as a float,
     * e.g. quantity = 0.001. In some special cases quantity is not specified, such as when using 'cashQty' or 'fxQty'.
     **/
    @ApiModelProperty(
            value = "Usually integer, for some special cases such as fractional orders can specify as a float,"
                    + " e.g. quantity = 0.001. In some special cases quantity is not specified, such as when"
                    + " using 'cashQty' or 'fxQty'. ")
    @JsonProperty("quantity")
    @SerializedName("quantity")
    private BigDecimal quantity = null;

    /**
     * Cash Quantity - used to specify the monetary value of an order instead of the number of shares. When using
     * 'cashQty' don't specify 'quantity' Orders that express size using a monetary value, e.g. cash quantity can
     * result in fractional shares and are provided on a non-guaranteed basis. The system simulates the order by
     * canceling it once the specified amount is spent (for buy orders) or collected (for sell orders). In addition
     * to the monetary value, the order uses a maximum size that is calculated using
     * the Cash Quantity Estimated Factor, which can be modified in Order Presets.
     **/
    @ApiModelProperty(
            value = "Cash Quantity - used to specify the monetary value of an order instead of the number of shares."
                    + " When using 'cashQty' don't specify 'quantity' Orders that express size using a monetary value,"
                    + " e.g. cash quantity can result in fractional shares and are provided on a non-guaranteed basis."
                    + " The system simulates the order by canceling it once the specified amount is spent"
                    + " (for buy orders) or collected (for sell orders). In addition to the monetary value, the order"
                    + " uses a maximum size that is calculated using the Cash Quantity Estimated Factor, which can be"
                    + " modified in Order Presets.   ")
    @JsonProperty("cashQty")
    @SerializedName("cashQty")
    private BigDecimal cashQty = null;

    /**
     * double number, this is the cash quantity field which can only be used for Currency Conversion Orders.
     * When using 'fxQty' don't specify 'quantity'.
     **/
    @ApiModelProperty(
            value = "double number, this is the cash quantity field which can only be used for"
                    + " Currency Conversion Orders. When using 'fxQty' don't specify 'quantity'. ")
    @JsonProperty("fxQty")
    @SerializedName("fxQty")
    private BigDecimal fxQty = null;

    /**
     * If true, the system will use the Price Management Algo to submit the order.
     * https://www.interactivebrokers.com/en/index.php?f=43423
     **/
    @ApiModelProperty(
            value = "If true, the system will use the Price Management Algo to submit the order."
                    + " https://www.interactivebrokers.com/en/index.php?f=43423 ")
    @JsonProperty("useAdaptive")
    @SerializedName("useAdaptive")
    private Boolean useAdaptive = null;

    /**
     * set to true if the order is a FX conversion order.
     **/
    @ApiModelProperty(value = "set to true if the order is a FX conversion order ")
    @JsonProperty("isCcyConv")
    @SerializedName("isCcyConv")
    private Boolean isCcyConv = null;

    /**
     * Set the allocation method when placing an order using an FA account for a group Possible allocation methods
     * are \"NetLiquidity\", \"AvailableEquity\", \"EqualQuantity\" and \"PctChange\".
     **/
    @ApiModelProperty(
            value = "Set the allocation method when placing an order using an FA account for a group Possible"
                    + " allocation methods are \"NetLiquidity\", \"AvailableEquity\", \"EqualQuantity\""
                    + " and \"PctChange\". ")
    @JsonProperty("allocationMethod")
    @SerializedName("allocationMethod")
    private String allocationMethod = null;

    /**
     * Specify which IB Algo algorithm to use for this order.
     **/
    @ApiModelProperty(value = "Specify which IB Algo algorithm to use for this order. ")
    @JsonProperty("strategy")
    @SerializedName("strategy")
    private String strategy = null;

    /**
     * The IB Algo parameters for the specified algorithm.
     **/
    @ApiModelProperty(value = "The IB Algo parameters for the specified algorithm. ")
    @JsonProperty("strategyParameters")
    @SerializedName("strategyParameters")
    private Object strategyParameters = null;

    /**
     * acctId is optional. It should be one of the accounts returned by /iserver/accounts. If not passed, the first one
     * in the list is selected.
     *
     * @return acctId
     **/
    @JsonProperty("acctId")
    @ApiModelProperty(
            value = "acctId is optional. It should be one of the accounts returned by /iserver/accounts."
                    + " If not passed, the first one in the list is selected. ")
    public String getAcctId() {
        return acctId;
    }

    public void setAcctId(String acctId) {
        this.acctId = acctId;
    }

    /**
     * Set the allocation method when placing an order using an FA account for a group Possible allocation methods are
     * \"NetLiquidity\", \"AvailableEquity\", \"EqualQuantity\" and \"PctChange\".
     *
     * @return allocationMethod
     **/
    @JsonProperty("allocationMethod")
    @ApiModelProperty(
            value = "Set the allocation method when placing an order using an FA account for a group Possible"
                    + " allocation methods are \"NetLiquidity\", \"AvailableEquity\", \"EqualQuantity\""
                    + " and \"PctChange\". ")
    public String getAllocationMethod() {
        return allocationMethod;
    }

    public void setAllocationMethod(String allocationMethod) {
        this.allocationMethod = allocationMethod;
    }

    /**
     * optional if order is STOP_LIMIT, this is the stop price. You must specify both price and auxPrice for STOP_LIMIT
     * orders.
     *
     * @return auxPrice
     **/
    @JsonProperty("auxPrice")
    @ApiModelProperty(
            value = "optional if order is STOP_LIMIT, this is the stop price. You must specify both price and"
                    + " auxPrice for STOP_LIMIT orders. ")
    public Object getAuxPrice() {
        return auxPrice;
    }

    public void setAuxPrice(Object auxPrice) {
        this.auxPrice = auxPrice;
    }

    /**
     * Customer Order ID. An arbitrary string that can be used to identify the order, e.g \"my-fb-order\". The value
     * must be unique for a 24h span. Please do not set this value for child orders when placing a bracket order.
     *
     * @return cOID
     **/
    @JsonProperty("cOID")
    @ApiModelProperty(
            value = "Customer Order ID. An arbitrary string that can be used to identify the order,"
                    + " e.g \"my-fb-order\". The value must be unique for a 24h span. Please do not set this value"
                    + " for child orders when placing a bracket order. ")
    public String getCustomerOrderId() {
        return customerOrderId;
    }

    public void setCustomerOrderId(String customerOrderId) {
        this.customerOrderId = customerOrderId;
    }

    /**
     * Cash Quantity - used to specify the monetary value of an order instead of the number of shares. When using
     * 'cashQty' don't specify 'quantity' Orders that express size using a monetary value, e.g. cash quantity can result
     * in fractional shares and are provided on a non-guaranteed basis. The system simulates the order by canceling it
     * once the specified amount is spent (for buy orders) or collected (for sell orders). In addition to the monetary
     * value, the order uses a maximum size that is calculated using the Cash Quantity Estimated Factor, which can be
     * modified in Order Presets.
     *
     * @return cashQty
     **/
    @JsonProperty("cashQty")
    @ApiModelProperty(
            value = "Cash Quantity - used to specify the monetary value of an order instead of the number of shares."
                    + " When using 'cashQty' don't specify 'quantity' Orders that express size using a monetary value,"
                    + " e.g. cash quantity can result in fractional shares and are provided on a non-guaranteed basis."
                    + " The system simulates the order by canceling it once the specified amount is spent"
                    + " (for buy orders) or collected (for sell orders). In addition to the monetary value, the order"
                    + " uses a maximum size that is calculated using the Cash Quantity Estimated Factor, which can be"
                    + " modified in Order Presets.   ")
    @Valid
    public BigDecimal getCashQty() {
        return cashQty;
    }

    public void setCashQty(BigDecimal cashQty) {
        this.cashQty = cashQty;
    }

    /**
     * conid is the identifier of the security you want to trade, you can find the conid with /iserver/secdef/search.
     *
     * @return conid
     **/
    @JsonProperty("conid")
    @ApiModelProperty(
            value = "conid is the identifier of the security you want to trade, you can find the conid"
                    + " with /iserver/secdef/search. ")
    public Integer getConid() {
        return conid;
    }

    public void setConid(Integer conid) {
        this.conid = conid;
    }

    /**
     * Conid and Exchange - Can be used instead of conid when specifying the contract identifier of a security.
     *
     * @return conidex
     **/
    @JsonProperty("conidex")
    @ApiModelProperty(
            example = "conidex = 265598",
            value = "Conid and Exchange - Can be used instead of conid when specifying the contract identifier"
                    + " of a security. ")
    public String getConidex() {
        return conidex;
    }

    public void setConidex(String conidex) {
        this.conidex = conidex;
    }

    /**
     * double number, this is the cash quantity field which can only be used for Currency Conversion Orders. When using
     * 'fxQty' don't specify 'quantity'.
     *
     * @return fxQty
     **/
    @JsonProperty("fxQty")
    @ApiModelProperty(
            value = "double number, this is the cash quantity field which can only be used for Currency Conversion"
                    + " Orders. When using 'fxQty' don't specify 'quantity'. ")
    @Valid
    public BigDecimal getFxQty() {
        return fxQty;
    }

    public void setFxQty(BigDecimal fxQty) {
        this.fxQty = fxQty;
    }

    /**
     * listingExchange is optional. By default we use \"SMART\" routing. Possible values are available via the endpoint:
     * /iserver/contract/{conid}/info, see **valid_exchange** e.g:
     * SMART,AMEX,NYSE,CBOE,ISE,CHX,ARCA,ISLAND,DRCTEDGE,BEX,BATS,EDGEA,CSFBALGO,JE
     * FFALGO,BYX,IEX,FOXRIVER,TPLUS1,NYSENAT,PSX
     *
     * @return listingExchange
     **/
    @JsonProperty("listingExchange")
    @ApiModelProperty(
            value = "listingExchange is optional. By default we use \"SMART\" routing. Possible values are available"
                    + " via the endpoint: /iserver/contract/{conid}/info,"
                    + " see **valid_exchange** e.g: SMART,AMEX,NYSE,CBOE,ISE,CHX,ARCA,ISLAND,DRCTEDGE,BEX,BATS,"
                    + "EDGEA,CSFBALGO,JE FFALGO,BYX,IEX,FOXRIVER,TPLUS1,NYSENAT,PSX ")
    public String getListingExchange() {
        return listingExchange;
    }

    public void setListingExchange(String listingExchange) {
        this.listingExchange = listingExchange;
    }

    /**
     * The order-type determines what type of order you want to send.   * LMT - A limit order is an order to buy or sell
     * at the specified price or better.   * MKT - A market order is an order to buy or sell at the markets current
     * NBBO.   * STP - A stop order becomes a market order once the specified stop price is attained or penetrated.   *
     * STOP_LIMIT - A stop limit order becomes a limit order once the specified stop price is attained or penetrated.
     * * MIDPRICE - A MidPrice order attempts to fill at the current midpoint of the NBBO or better.
     *
     * @return orderType
     **/
    @JsonProperty("orderType")
    @ApiModelProperty(
            value = "The order-type determines what type of order you want to send."
                    + "   * LMT - A limit order is an order to buy or sell at the specified price or better."
                    + "   * MKT - A market order is an order to buy or sell at the markets current NBBO."
                    + "   * STP - A stop order becomes a market order once the specified stop price is attained"
                    + " or penetrated."
                    + "   * STOP_LIMIT - A stop limit order becomes a limit order once the specified stop price"
                    + " is attained or penetrated."
                    + "   * MIDPRICE - A MidPrice order attempts to fill at the current midpoint"
                    + " of the NBBO or better. ")
    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    /**
     * Only specify for child orders when placing bracket orders. The parentId for the child order(s) must be equal to
     * the cOId (customer order id) of the parent.
     *
     * @return parentId
     **/
    @JsonProperty("parentId")
    @ApiModelProperty(
            value = "Only specify for child orders when placing bracket orders. The parentId for the child order(s)"
                    + " must be equal to the cOId (customer order id) of the parent. ")
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * optional if order is LMT, or STOP_LIMIT, this is the limit price. For STP this is the stop price. For MIDPRICE
     * this is the option price cap.
     *
     * @return price
     **/
    @JsonProperty("price")
    @ApiModelProperty(
            value = "optional if order is LMT, or STOP_LIMIT, this is the limit price. For STP this is the stop price."
                    + " For MIDPRICE this is the option price cap. ")
    @Valid
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * Usually integer, for some special cases such as fractional orders can specify as a float, e.g. quantity = 0.001.
     * In some special cases quantity is not specified, such as when using 'cashQty' or 'fxQty'.
     *
     * @return quantity
     **/
    @JsonProperty("quantity")
    @ApiModelProperty(
            value = "Usually integer, for some special cases such as fractional orders can specify as a float,"
                    + " e.g. quantity = 0.001. In some special cases quantity is not specified, such as when"
                    + " using 'cashQty' or 'fxQty'. ")
    @Valid
    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    /**
     * Custom order reference.
     *
     * @return referrer
     **/
    @JsonProperty("referrer")
    @ApiModelProperty(example = "QuickTrade", value = "Custom order reference ")
    public String getReferrer() {
        return referrer;
    }

    public void setReferrer(String referrer) {
        this.referrer = referrer;
    }

    /**
     * The contract-identifier (conid) and security type (type) specified as a concatenated value, conid:type.
     *
     * @return secType
     **/
    @JsonProperty("secType")
    @ApiModelProperty(
            example = "secType = 265598:STK",
            value = "The contract-identifier (conid) and security type (type) specified"
                    + " as a concatenated value, conid:type")
    public String getSecType() {
        return secType;
    }

    public void setSecType(String secType) {
        this.secType = secType;
    }

    /**
     * SELL or BUY.
     *
     * @return side
     **/
    @JsonProperty("side")
    @ApiModelProperty(value = "SELL or BUY")
    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    /**
     * Specify which IB Algo algorithm to use for this order.
     *
     * @return strategy
     **/
    @JsonProperty("strategy")
    @ApiModelProperty(value = "Specify which IB Algo algorithm to use for this order. ")
    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    /**
     * The IB Algo parameters for the specified algorithm.
     *
     * @return strategyParameters
     **/
    @JsonProperty("strategyParameters")
    @ApiModelProperty(value = "The IB Algo parameters for the specified algorithm. ")
    public Object getStrategyParameters() {
        return strategyParameters;
    }

    public void setStrategyParameters(Object strategyParameters) {
        this.strategyParameters = strategyParameters;
    }

    /**
     * This is the  underlying symbol for the contract.
     *
     * @return ticker
     **/
    @JsonProperty("ticker")
    @ApiModelProperty(value = "This is the  underlying symbol for the contract. ")
    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    /**
     * The Time-In-Force determines how long the order remains active on the market.   * GTC - use Good-Till-Cancel for
     * orders to remain active until it executes or cancelled.   * OPG - use Open-Price-Guarantee for Limit-On-Open
     * (LOO) or Market-On-Open (MOO) orders.   * DAY - if not executed a Day order will automatically cancel at the end
     * of the markets regular trading hours.   * IOC - any portion of an Immediate-or-Cancel order that is not filled as
     * soon as it becomes available in the market is cancelled.
     *
     * @return tif
     **/
    @JsonProperty("tif")
    @ApiModelProperty(
            value = "The Time-In-Force determines how long the order remains active on the market."
                    + "   * GTC - use Good-Till-Cancel for orders to remain active until it executes or cancelled."
                    + "   * OPG - use Open-Price-Guarantee for Limit-On-Open (LOO) or Market-On-Open (MOO) orders."
                    + "   * DAY - if not executed a Day order will automatically cancel at the end of the markets"
                    + " regular trading hours."
                    + "   * IOC - any portion of an Immediate-or-Cancel order that is not filled as soon as it"
                    + " becomes available in the market is cancelled. ")
    public String getTif() {
        return tif;
    }

    public void setTif(String tif) {
        this.tif = tif;
    }

    public void setIsCcyConv(Boolean isCcyConv) {
        this.isCcyConv = isCcyConv;
    }

    public void setIsSingleGroup(Boolean isSingleGroup) {
        this.isSingleGroup = isSingleGroup;
    }

    public void setOutsideRTH(Boolean outsideRTH) {
        this.outsideRTH = outsideRTH;
    }

    public void setUseAdaptive(Boolean useAdaptive) {
        this.useAdaptive = useAdaptive;
    }

    @Override
    public int hashCode() {
        return Objects.hash(acctId, conid, conidex, secType, customerOrderId, parentId,
                orderType, listingExchange, isSingleGroup,
                outsideRTH, price, auxPrice, side, ticker, tif, referrer, quantity, cashQty, fxQty, useAdaptive,
                isCcyConv, allocationMethod, strategy, strategyParameters);
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrderRequest orderRequest = (OrderRequest) o;
        return Objects.equals(this.acctId, orderRequest.acctId) && Objects.equals(this.conid, orderRequest.conid)
                && Objects.equals(this.conidex, orderRequest.conidex) && Objects.equals(this.secType,
                orderRequest.secType) && Objects.equals(this.customerOrderId, orderRequest.customerOrderId)
                && Objects.equals(this.parentId,
                orderRequest.parentId) && Objects.equals(this.orderType, orderRequest.orderType) && Objects.equals(
                this.listingExchange, orderRequest.listingExchange) && Objects.equals(this.isSingleGroup,
                orderRequest.isSingleGroup) && Objects.equals(this.outsideRTH, orderRequest.outsideRTH)
                && Objects.equals(this.price, orderRequest.price) && Objects.equals(this.auxPrice,
                orderRequest.auxPrice) && Objects.equals(this.side, orderRequest.side) && Objects.equals(this.ticker,
                orderRequest.ticker) && Objects.equals(this.tif, orderRequest.tif) && Objects.equals(this.referrer,
                orderRequest.referrer) && Objects.equals(this.quantity, orderRequest.quantity) && Objects.equals(
                this.cashQty, orderRequest.cashQty) && Objects.equals(this.fxQty, orderRequest.fxQty) && Objects.equals(
                this.useAdaptive, orderRequest.useAdaptive) && Objects.equals(this.isCcyConv, orderRequest.isCcyConv)
                && Objects.equals(this.allocationMethod, orderRequest.allocationMethod) && Objects.equals(this.strategy,
                orderRequest.strategy) && Objects.equals(this.strategyParameters, orderRequest.strategyParameters);
    }

    @Override
    public String toString() {

        String sb = "class OrderRequest {\n" + "    acctId: " + toIndentedString(acctId) + "\n" + "    conid: "
                + toIndentedString(conid) + "\n" + "    conidex: " + toIndentedString(conidex) + "\n" + "    secType: "
                + toIndentedString(secType) + "\n" + "    cOID: " + toIndentedString(customerOrderId) + "\n"
                + "    parentId: "
                + toIndentedString(parentId) + "\n" + "    orderType: " + toIndentedString(orderType) + "\n"
                + "    listingExchange: " + toIndentedString(listingExchange) + "\n" + "    isSingleGroup: "
                + toIndentedString(isSingleGroup) + "\n" + "    outsideRTH: " + toIndentedString(outsideRTH) + "\n"
                + "    price: " + toIndentedString(price) + "\n" + "    auxPrice: " + toIndentedString(auxPrice) + "\n"
                + "    side: " + toIndentedString(side) + "\n" + "    ticker: " + toIndentedString(ticker) + "\n"
                + "    tif: " + toIndentedString(tif) + "\n" + "    referrer: " + toIndentedString(referrer) + "\n"
                + "    quantity: " + toIndentedString(quantity) + "\n" + "    cashQty: " + toIndentedString(cashQty)
                + "\n" + "    fxQty: " + toIndentedString(fxQty) + "\n" + "    useAdaptive: " + toIndentedString(
                useAdaptive) + "\n" + "    isCcyConv: " + toIndentedString(isCcyConv) + "\n" + "    allocationMethod: "
                + toIndentedString(allocationMethod) + "\n" + "    strategy: " + toIndentedString(strategy) + "\n"
                + "    strategyParameters: " + toIndentedString(strategyParameters) + "\n" + "}";
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

    public OrderRequest acctId(String acctId) {
        this.acctId = acctId;
        return this;
    }

    public OrderRequest allocationMethod(String allocationMethod) {
        this.allocationMethod = allocationMethod;
        return this;
    }

    public OrderRequest auxPrice(Object auxPrice) {
        this.auxPrice = auxPrice;
        return this;
    }

    public OrderRequest customerOrderId(String customerOrderId) {
        this.customerOrderId = customerOrderId;
        return this;
    }

    public OrderRequest cashQty(BigDecimal cashQty) {
        this.cashQty = cashQty;
        return this;
    }

    public OrderRequest conid(Integer conid) {
        this.conid = conid;
        return this;
    }

    public OrderRequest conidex(String conidex) {
        this.conidex = conidex;
        return this;
    }

    public OrderRequest fxQty(BigDecimal fxQty) {
        this.fxQty = fxQty;
        return this;
    }

    public OrderRequest isCcyConv(Boolean isCcyConv) {
        this.isCcyConv = isCcyConv;
        return this;
    }

    /**
     * set to true if the order is a FX conversion order.
     *
     * @return isCcyConv
     **/
    @JsonProperty("isCcyConv")
    @ApiModelProperty(value = "set to true if the order is a FX conversion order ")
    public Boolean isIsCcyConv() {
        return isCcyConv;
    }

    /**
     * set to true if you want to place a single group orders(OCA).
     *
     * @return isSingleGroup
     **/
    @JsonProperty("isSingleGroup")
    @ApiModelProperty(value = "set to true if you want to place a single group orders(OCA) ")
    public Boolean isIsSingleGroup() {
        return isSingleGroup;
    }

    /**
     * set to true if the order can be executed outside regular trading hours.
     *
     * @return outsideRTH
     **/
    @JsonProperty("outsideRTH")
    @ApiModelProperty(value = "set to true if the order can be executed outside regular trading hours. ")
    public Boolean isOutsideRTH() {
        return outsideRTH;
    }

    public OrderRequest isSingleGroup(Boolean isSingleGroup) {
        this.isSingleGroup = isSingleGroup;
        return this;
    }

    /**
     * If true, the system will use the Price Management Algo to submit the order.
     * https://www.interactivebrokers.com/en/index.php?f=43423
     *
     * @return useAdaptive
     **/
    @JsonProperty("useAdaptive")
    @ApiModelProperty(
            value = "If true, the system will use the Price Management Algo to submit the order. https://www.interactivebrokers.com/en/index.php?f=43423 ")
    public Boolean isUseAdaptive() {
        return useAdaptive;
    }

    public OrderRequest listingExchange(String listingExchange) {
        this.listingExchange = listingExchange;
        return this;
    }

    public OrderRequest orderType(String orderType) {
        this.orderType = orderType;
        return this;
    }

    public OrderRequest outsideRTH(Boolean outsideRTH) {
        this.outsideRTH = outsideRTH;
        return this;
    }

    public OrderRequest parentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    public OrderRequest price(BigDecimal price) {
        this.price = price;
        return this;
    }

    public OrderRequest quantity(BigDecimal quantity) {
        this.quantity = quantity;
        return this;
    }

    public OrderRequest referrer(String referrer) {
        this.referrer = referrer;
        return this;
    }

    public OrderRequest secType(String secType) {
        this.secType = secType;
        return this;
    }

    public OrderRequest side(String side) {
        this.side = side;
        return this;
    }

    public OrderRequest strategy(String strategy) {
        this.strategy = strategy;
        return this;
    }

    public OrderRequest strategyParameters(Object strategyParameters) {
        this.strategyParameters = strategyParameters;
        return this;
    }

    public OrderRequest ticker(String ticker) {
        this.ticker = ticker;
        return this;
    }

    public OrderRequest tif(String tif) {
        this.tif = tif;
        return this;
    }

    public OrderRequest useAdaptive(Boolean useAdaptive) {
        this.useAdaptive = useAdaptive;
        return this;
    }

}

