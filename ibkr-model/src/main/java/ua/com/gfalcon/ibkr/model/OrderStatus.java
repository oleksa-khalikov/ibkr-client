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
import java.util.Objects;

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

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Contains all the details of an order.
 */
@Validated
@ApiModel(description = "contains all the details of an order")
public class OrderStatus {

    /**
     * order sub-type.
     **/
    @ApiModelProperty(value = "order sub-type")
    @JsonProperty("sub_type")
    @SerializedName("sub_type")
    private String subType = null;

    /**
     * order request id.
     **/
    @ApiModelProperty(value = "order request id")
    @JsonProperty("request_id")
    @SerializedName("request_id")
    private String requestId = null;

    /**
     * system generated order id, unique per account.
     **/
    @ApiModelProperty(value = "system generated order id, unique per account")
    @JsonProperty("order_id")
    @SerializedName("order_id")
    private Integer orderId = null;

    /**
     * conid and exchange. Format supports conid or conid@exchange.
     **/
    @ApiModelProperty(value = "conid and exchange. Format supports conid or conid@exchange")
    @JsonProperty("conidex")
    @SerializedName("conidex")
    private String conidex = null;

    /**
     * Underlying symbol.
     **/
    @ApiModelProperty(value = "Underlying symbol")
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
            value = "The side of the market of the order."
                    + "   * B - Buy contract near posted ask price"
                    + "   * S - Sell contract near posted bid price"
                    + "   * X - Option expired ")
    @JsonProperty("side")
    @SerializedName("side")
    private SideEnum side = null;

    /**
     * Format contract name.
     **/
    @ApiModelProperty(example = "FB Stock (NASDAQ.NMS)", value = "Format contract name")
    @JsonProperty("contract_description_1")
    @SerializedName("contract_description_1")
    private String contractDescription1 = null;

    /**
     * Trading Exchange or Venue.
     **/
    @ApiModelProperty(example = "NASDAQ.NMS", value = "Trading Exchange or Venue")
    @JsonProperty("listing_exchange")
    @SerializedName("listing_exchange")
    private String listingExchange = null;

    @ApiModelProperty(value = "")
    @JsonProperty("option_acct")
    @SerializedName("option_acct")
    private String optionAcct = null;

    /**
     * Contracts company name.
     **/
    @ApiModelProperty(example = "APPLE INC", value = "Contracts company name")
    @JsonProperty("company_name")
    @SerializedName("company_name")
    private String companyName = null;

    /**
     * Quantity updated.
     **/
    @ApiModelProperty(value = "Quantity updated")
    @JsonProperty("size")
    @SerializedName("size")
    private String size = null;

    /**
     * Total quantity.
     **/
    @ApiModelProperty(value = "Total quantity")
    @JsonProperty("total_size")
    @SerializedName("total_size")
    private String totalSize = null;

    /**
     * Contract traded currency.
     **/
    @ApiModelProperty(value = "Contract traded currency")
    @JsonProperty("currency")
    @SerializedName("currency")
    private String currency = null;

    /**
     * account id.
     **/
    @ApiModelProperty(value = "account id")
    @JsonProperty("account")
    @SerializedName("account")
    private String account = null;

    /**
     * Types of orders.
     **/
    @ApiModelProperty(example = "LIMIT", value = "Types of orders")
    @JsonProperty("order_type")
    @SerializedName("order_type")
    private String orderType = null;

    /**
     * Limit price.
     **/
    @ApiModelProperty(value = "Limit price")
    @JsonProperty("limit_price")
    @SerializedName("limit_price")
    private String limitPrice = null;

    /**
     * Stop price.
     **/
    @ApiModelProperty(value = "Stop price")
    @JsonProperty("stop_price")
    @SerializedName("stop_price")
    private String stopPrice = null;

    /**
     * Cumulative fill.
     **/
    @ApiModelProperty(value = "Cumulative fill")
    @JsonProperty("cum_fill")
    @SerializedName("cum_fill")
    private String cumFill = null;

    /**
     * *  PendingSubmit - Indicates the order was sent, but confirmation has not been received that it has been
     * received by the destination. Occurs most commonly if an exchange is closed.
     * *  PendingCancel - Indicates that a request has been sent to cancel an order but confirmation has not been
     * received of its cancellation.
     * *  PreSubmitted - Indicates that a simulated order type has been accepted by the IBKR system and that this
     * order has yet to be elected. The order is held in the IBKR system until the election criteria are met. At that
     * time the order is transmitted to the order destination as specified.
     * *  Submitted - Indicates that the order has been accepted at the order destination and is working.
     * *  Cancelled - Indicates that the balance of the order has been confirmed cancelled by the IB system. This
     * could occur unexpectedly when IB or the destination has rejected the order.
     * *  Filled - Indicates that the order has been completely filled.
     * *  Inactive - Indicates the order is not working, for instance if the order was invalid and triggered
     * an error message, or if the order was to short a security and shares have not yet been located.
     **/
    @ApiModelProperty(
            value = "*  PendingSubmit - Indicates the order was sent, but confirmation has not been received that it"
                    + " has been received by the destination. Occurs most commonly if an exchange is closed."
                    + " *  PendingCancel - Indicates that a request has been sent to cancel an order but confirmation"
                    + " has not been received of its cancellation."
                    + " *  PreSubmitted - Indicates that a simulated order type has been accepted by the IBKR system"
                    + " and that this order has yet to be elected. The order is held in the IBKR system until the"
                    + " election criteria are met. At that time the order is transmitted to the order"
                    + " destination as specified."
                    + " *  Submitted - Indicates that the order has been accepted at the order"
                    + " destination and is working."
                    + " *  Cancelled - Indicates that the balance of the order has been confirmed cancelled by the"
                    + " IB system. This could occur unexpectedly when IB or the destination has rejected the order."
                    + " *  Filled - Indicates that the order has been completely filled."
                    + " *  Inactive - Indicates the order is not working, for instance if the order was invalid and"
                    + " triggered an error message, or if the order was to short a security and shares have"
                    + " not yet been located. ")
    @JsonProperty("order_status")
    @SerializedName("order_status")
    private String orderStatus = null;

    /**
     * Description of the order status.
     **/
    @ApiModelProperty(value = "Description of the order status")
    @JsonProperty("order_status_description")
    @SerializedName("order_status_description")
    private String orderStatusDescription = null;

    /**
     * Time-in-Force - length of time order will continue working before it is canceled.
     **/
    @ApiModelProperty(value = "Time-in-Force - length of time order will continue working before it is canceled.")
    @JsonProperty("tif")
    @SerializedName("tif")
    private String tif = null;

    /**
     * Foreground color in hex format.
     **/
    @ApiModelProperty(value = "Foreground color in hex format")
    @JsonProperty("fg_color")
    @SerializedName("fg_color")
    private String fgColor = null;

    /**
     * Background color in hex format.
     **/
    @ApiModelProperty(value = "Background color in hex format")
    @JsonProperty("bg_color")
    @SerializedName("bg_color")
    private String bgColor = null;

    /**
     * If true not allowed to modify order.
     **/
    @ApiModelProperty(value = "If true not allowed to modify order")
    @JsonProperty("order_not_editable")
    @SerializedName("order_not_editable")
    private Boolean orderNotEditable = null;

    /**
     * Fields that can be edited in escaped unicode characters.
     **/
    @ApiModelProperty(example = "\\u001E", value = "Fields that can be edited in escaped unicode characters")
    @JsonProperty("editable_fields")
    @SerializedName("editable_fields")
    private String editableFields = null;

    /**
     * If true not allowed to cancel order.
     **/
    @ApiModelProperty(value = "If true not allowed to cancel order")
    @JsonProperty("cannot_cancel_order")
    @SerializedName("cannot_cancel_order")
    private Boolean cannotCancelOrder = null;

    /**
     * If true order trades outside regular trading hours.
     **/
    @ApiModelProperty(value = "If true order trades outside regular trading hours")
    @JsonProperty("outside_rth")
    @SerializedName("outside_rth")
    private Boolean outsideRth = null;

    /**
     * If true order is de-activated.
     **/
    @ApiModelProperty(value = "If true order is de-activated")
    @JsonProperty("deactivate_order")
    @SerializedName("deactivate_order")
    private Boolean deactivateOrder = null;

    /**
     * If true price management algo is enabled, refer to https://www.interactivebrokers.com/en/index.php?f=43423
     **/
    @ApiModelProperty(
            value = "If true price management algo is enabled, refer"
                    + " to https://www.interactivebrokers.com/en/index.php?f=43423")
    @JsonProperty("use_price_mgmt_algo")
    @SerializedName("use_price_mgmt_algo")
    private Boolean usePriceMgmtAlgo = null;

    /**
     * Asset class.
     **/
    @ApiModelProperty(example = "STK", value = "Asset class")
    @JsonProperty("sec_type")
    @SerializedName("sec_type")
    private String secType = null;

    /**
     * List of available chart periods.
     **/
    @ApiModelProperty(value = "List of available chart periods")
    @JsonProperty("available_chart_periods")
    @SerializedName("available_chart_periods")
    private String availableChartPeriods = null;

    /**
     * Format description of order.
     **/
    @ApiModelProperty(example = "BUY 100 LIMIT 125.0 DAY", value = "Format description of order")
    @JsonProperty("order_description")
    @SerializedName("order_description")
    private String orderDescription = null;

    /**
     * order_description with the symbol.
     **/
    @ApiModelProperty(example = "BUY 100 AAPL LIMIT 125.0 DAY", value = "order_description with the symbol")
    @JsonProperty("order_description_with_contract")
    @SerializedName("order_description_with_contract")
    private String orderDescriptionWithContract = null;

    @ApiModelProperty(value = "")
    @JsonProperty("alert_active")
    @SerializedName("alert_active")
    private Integer alertActive = null;

    /**
     * type of the child order.
     **/
    @ApiModelProperty(example = "A=attached, B=beta-hedge, etc", value = "type of the child order")
    @JsonProperty("child_order_type")
    @SerializedName("child_order_type")
    private String childOrderType = null;

    /**
     * Format fillQuantity\\totalQuantity.
     **/
    @ApiModelProperty(example = "0/9", value = "Format fillQuantity\\totalQuantity")
    @JsonProperty("size_and_fills")
    @SerializedName("size_and_fills")
    private String sizeAndFills = null;

    /**
     * Position display price.
     **/
    @ApiModelProperty(value = "Position display price")
    @JsonProperty("exit_strategy_display_price")
    @SerializedName("exit_strategy_display_price")
    private String exitStrategyDisplayPrice = null;

    /**
     * Position description to display on chart.
     **/
    @ApiModelProperty(value = "Position description to display on chart")
    @JsonProperty("exit_strategy_chart_description")
    @SerializedName("exit_strategy_chart_description")
    private String exitStrategyChartDescription = null;

    /**
     * * 1: If your account has position or order for contract.
     * * 0: If your account has no position or order for contract.
     **/
    @ApiModelProperty(
            value = "* 1: If your account has position or order for contract"
                    + " * 0: If your account has no position or order for contract ")
    @JsonProperty("exit_strategy_tool_availability")
    @SerializedName("exit_strategy_tool_availability")
    private ExitStrategyToolAvailabilityEnum exitStrategyToolAvailability = null;

    /**
     * Returns true if contract supports duplicate/opposite side order.
     **/
    @ApiModelProperty(value = "Returns true if contract supports duplicate/opposite side order.")
    @JsonProperty("allowed_duplicate_opposite")
    @SerializedName("allowed_duplicate_opposite")
    private Boolean allowedDuplicateOpposite = null;

    /**
     * Time of status update in unix time.
     **/
    @ApiModelProperty(value = "Time of status update in unix time")
    @JsonProperty("order_time")
    @SerializedName("order_time")
    private String orderTime = null;

    /**
     * only exists for oca orders, oca orders in same group will have same id.
     **/
    @ApiModelProperty(value = "only exists for oca orders, oca orders in same group will have same id")
    @JsonProperty("oca_group_id")
    @SerializedName("oca_group_id")
    private String ocaGroupId = null;

    /**
     * account id.
     *
     * @return account
     **/
    @JsonProperty("account")
    @ApiModelProperty(value = "account id")
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * Get alertActive.
     *
     * @return alertActive
     **/
    @JsonProperty("alert_active")
    @ApiModelProperty(value = "")
    public Integer getAlertActive() {
        return alertActive;
    }

    public void setAlertActive(Integer alertActive) {
        this.alertActive = alertActive;
    }

    /**
     * List of available chart periods.
     *
     * @return availableChartPeriods
     **/
    @JsonProperty("available_chart_periods")
    @ApiModelProperty(value = "List of available chart periods")
    public String getAvailableChartPeriods() {
        return availableChartPeriods;
    }

    public void setAvailableChartPeriods(String availableChartPeriods) {
        this.availableChartPeriods = availableChartPeriods;
    }

    /**
     * Background color in hex format.
     *
     * @return bgColor
     **/
    @JsonProperty("bg_color")
    @ApiModelProperty(value = "Background color in hex format")
    public String getBgColor() {
        return bgColor;
    }

    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }

    /**
     * type of the child order.
     *
     * @return childOrderType
     **/
    @JsonProperty("child_order_type")
    @ApiModelProperty(example = "A=attached, B=beta-hedge, etc", value = "type of the child order")
    public String getChildOrderType() {
        return childOrderType;
    }

    public void setChildOrderType(String childOrderType) {
        this.childOrderType = childOrderType;
    }

    /**
     * Contracts company name.
     *
     * @return companyName
     **/
    @JsonProperty("company_name")
    @ApiModelProperty(example = "APPLE INC", value = "Contracts company name")
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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
     * Cumulative fill.
     *
     * @return cumFill
     **/
    @JsonProperty("cum_fill")
    @ApiModelProperty(value = "Cumulative fill")
    public String getCumFill() {
        return cumFill;
    }

    public void setCumFill(String cumFill) {
        this.cumFill = cumFill;
    }

    /**
     * Contract traded currency.
     *
     * @return currency
     **/
    @JsonProperty("currency")
    @ApiModelProperty(value = "Contract traded currency")
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Fields that can be edited in escaped unicode characters.
     *
     * @return editableFields
     **/
    @JsonProperty("editable_fields")
    @ApiModelProperty(example = "\\u001E", value = "Fields that can be edited in escaped unicode characters")
    public String getEditableFields() {
        return editableFields;
    }

    public void setEditableFields(String editableFields) {
        this.editableFields = editableFields;
    }

    /**
     * Position description to display on chart.
     *
     * @return exitStrategyChartDescription
     **/
    @JsonProperty("exit_strategy_chart_description")
    @ApiModelProperty(value = "Position description to display on chart")
    public String getExitStrategyChartDescription() {
        return exitStrategyChartDescription;
    }

    public void setExitStrategyChartDescription(String exitStrategyChartDescription) {
        this.exitStrategyChartDescription = exitStrategyChartDescription;
    }

    /**
     * Position display price.
     *
     * @return exitStrategyDisplayPrice
     **/
    @JsonProperty("exit_strategy_display_price")
    @ApiModelProperty(value = "Position display price")
    public String getExitStrategyDisplayPrice() {
        return exitStrategyDisplayPrice;
    }

    public void setExitStrategyDisplayPrice(String exitStrategyDisplayPrice) {
        this.exitStrategyDisplayPrice = exitStrategyDisplayPrice;
    }

    /**
     * * 1: If your account has position or order for contract.
     * * 0: If your account has no position or order for contract.
     *
     * @return exitStrategyToolAvailability
     **/
    @JsonProperty("exit_strategy_tool_availability")
    @ApiModelProperty(
            value = "* 1: If your account has position or order for contract"
                    + " * 0: If your account has no position or order for contract ")
    public ExitStrategyToolAvailabilityEnum getExitStrategyToolAvailability() {
        return exitStrategyToolAvailability;
    }

    public void setExitStrategyToolAvailability(ExitStrategyToolAvailabilityEnum exitStrategyToolAvailability) {
        this.exitStrategyToolAvailability = exitStrategyToolAvailability;
    }

    /**
     * Exit strategy tool availability as string.
     */
    public String getExitStrategyToolAvailabilityAsString() {
        if (exitStrategyToolAvailability == null) {
            return null;
        }
        return exitStrategyToolAvailability.value();
    }

    /**
     * Foreground color in hex format.
     *
     * @return fgColor
     **/
    @JsonProperty("fg_color")
    @ApiModelProperty(value = "Foreground color in hex format")
    public String getFgColor() {
        return fgColor;
    }

    public void setFgColor(String fgColor) {
        this.fgColor = fgColor;
    }

    /**
     * Limit price.
     *
     * @return limitPrice
     **/
    @JsonProperty("limit_price")
    @ApiModelProperty(value = "Limit price")
    public String getLimitPrice() {
        return limitPrice;
    }

    public void setLimitPrice(String limitPrice) {
        this.limitPrice = limitPrice;
    }

    /**
     * Trading Exchange or Venue.
     *
     * @return listingExchange
     **/
    @JsonProperty("listing_exchange")
    @ApiModelProperty(example = "NASDAQ.NMS", value = "Trading Exchange or Venue")
    public String getListingExchange() {
        return listingExchange;
    }

    public void setListingExchange(String listingExchange) {
        this.listingExchange = listingExchange;
    }

    /**
     * only exists for oca orders, oca orders in same group will have same id.
     *
     * @return ocaGroupId
     **/
    @JsonProperty("oca_group_id")
    @ApiModelProperty(value = "only exists for oca orders, oca orders in same group will have same id")
    public String getOcaGroupId() {
        return ocaGroupId;
    }

    public void setOcaGroupId(String ocaGroupId) {
        this.ocaGroupId = ocaGroupId;
    }

    /**
     * Get optionAcct.
     *
     * @return optionAcct
     **/
    @JsonProperty("option_acct")
    @ApiModelProperty(value = "")
    public String getOptionAcct() {
        return optionAcct;
    }

    public void setOptionAcct(String optionAcct) {
        this.optionAcct = optionAcct;
    }

    /**
     * Format description of order.
     *
     * @return orderDescription
     **/
    @JsonProperty("order_description")
    @ApiModelProperty(example = "BUY 100 LIMIT 125.0 DAY", value = "Format description of order")
    public String getOrderDescription() {
        return orderDescription;
    }

    public void setOrderDescription(String orderDescription) {
        this.orderDescription = orderDescription;
    }

    /**
     * order_description with the symbol.
     *
     * @return orderDescriptionWithContract
     **/
    @JsonProperty("order_description_with_contract")
    @ApiModelProperty(example = "BUY 100 AAPL LIMIT 125.0 DAY", value = "order_description with the symbol")
    public String getOrderDescriptionWithContract() {
        return orderDescriptionWithContract;
    }

    public void setOrderDescriptionWithContract(String orderDescriptionWithContract) {
        this.orderDescriptionWithContract = orderDescriptionWithContract;
    }

    /**
     * system generated order id, unique per account.
     *
     * @return orderId
     **/
    @JsonProperty("order_id")
    @ApiModelProperty(value = "system generated order id, unique per account")
    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * *  PendingSubmit - Indicates the order was sent, but confirmation has not been received that it has been
     * received by the destination. Occurs most commonly if an exchange is closed.
     * *  PendingCancel - Indicates that a request has been sent to cancel an order but confirmation has not been
     * received of its cancellation.
     * *  PreSubmitted - Indicates that a simulated order type has been accepted by the IBKR system and
     * that this order has yet to be elected. The order is held in the IBKR system until the election
     * criteria are met. At that time the order is transmitted to the order destination as specified.
     * *  Submitted - Indicates that the order has been accepted at the order destination and is working.
     * *  Cancelled - Indicates that the balance of the order has been confirmed cancelled by the IB system. This
     * could occur unexpectedly when IB or the destination has rejected the order.
     * *  Filled - Indicates that the order has been completely filled.
     * *  Inactive - Indicates the order is not working, for instance if the order was invalid and
     * triggered an error message, or if the order was to short a security and shares have not yet been
     * located.
     *
     * @return orderStatus
     **/
    @JsonProperty("order_status")
    @ApiModelProperty(
            value = "*  PendingSubmit - Indicates the order was sent, but confirmation has not been received that"
                    + " it has been received by the destination.                    "
                    + "Occurs most commonly if an exchange is closed."
                    + " *  PendingCancel - Indicates that a request has been sent to cancel an order but"
                    + " confirmation has not been received of its cancellation."
                    + " *  PreSubmitted - Indicates that a simulated order type has been accepted by the IBKR system"
                    + " and that this order has yet to be elected.                   "
                    + "The order is held in the IBKR system until the election criteria are met. At that time the"
                    + " order is transmitted to the order destination as specified."
                    + " *  Submitted - Indicates that the order has been accepted at the order destination and"
                    + " is working."
                    + " *  Cancelled - Indicates that the balance of the order has been confirmed cancelled"
                    + " by the IB system.                "
                    + "This could occur unexpectedly when IB or the destination has rejected the order."
                    + " *  Filled - Indicates that the order has been completely filled."
                    + " *  Inactive - Indicates the order is not working, for instance if the order was invalid and"
                    + " triggered an error message, or if the order was to short a security and shares have not"
                    + " yet been located. ")
    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * Description of the order status.
     *
     * @return orderStatusDescription
     **/
    @JsonProperty("order_status_description")
    @ApiModelProperty(value = "Description of the order status")
    public String getOrderStatusDescription() {
        return orderStatusDescription;
    }

    public void setOrderStatusDescription(String orderStatusDescription) {
        this.orderStatusDescription = orderStatusDescription;
    }

    /**
     * Time of status update in unix time.
     *
     * @return orderTime
     **/
    @JsonProperty("order_time")
    @ApiModelProperty(value = "Time of status update in unix time")
    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    /**
     * Types of orders.
     *
     * @return orderType
     **/
    @JsonProperty("order_type")
    @ApiModelProperty(example = "LIMIT", value = "Types of orders")
    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    /**
     * order request id.
     *
     * @return requestId
     **/
    @JsonProperty("request_id")
    @ApiModelProperty(value = "order request id")
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * Asset class.
     *
     * @return secType
     **/
    @JsonProperty("sec_type")
    @ApiModelProperty(example = "STK", value = "Asset class")
    public String getSecType() {
        return secType;
    }

    public void setSecType(String secType) {
        this.secType = secType;
    }

    /**
     * The side of the market of the order.
     * * B - Buy contract near posted ask price
     * * S - Sell contract near posted bid price
     * * X - Option expired
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
     * Side as string.
     */
    public String getSideAsString() {
        if (side == null) {
            return null;
        }
        return side.value();
    }

    /**
     * Quantity updated.
     *
     * @return size
     **/
    @JsonProperty("size")
    @ApiModelProperty(value = "Quantity updated")
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    /**
     * Format fillQuantity\\totalQuantity.
     *
     * @return sizeAndFills
     **/
    @JsonProperty("size_and_fills")
    @ApiModelProperty(example = "0/9", value = "Format fillQuantity\\totalQuantity")
    public String getSizeAndFills() {
        return sizeAndFills;
    }

    public void setSizeAndFills(String sizeAndFills) {
        this.sizeAndFills = sizeAndFills;
    }

    /**
     * Stop price.
     *
     * @return stopPrice
     **/
    @JsonProperty("stop_price")
    @ApiModelProperty(value = "Stop price")
    public String getStopPrice() {
        return stopPrice;
    }

    public void setStopPrice(String stopPrice) {
        this.stopPrice = stopPrice;
    }

    /**
     * order sub-type.
     *
     * @return subType
     **/
    @JsonProperty("sub_type")
    @ApiModelProperty(value = "order sub-type")
    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
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
     * Time-in-Force - length of time order will continue working before it is canceled.
     *
     * @return tif
     **/
    @JsonProperty("tif")
    @ApiModelProperty(value = "Time-in-Force - length of time order will continue working before it is canceled.")
    public String getTif() {
        return tif;
    }

    public void setTif(String tif) {
        this.tif = tif;
    }

    /**
     * Total quantity.
     *
     * @return totalSize
     **/
    @JsonProperty("total_size")
    @ApiModelProperty(value = "Total quantity")
    public String getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(String totalSize) {
        this.totalSize = totalSize;
    }

    public void setAllowedDuplicateOpposite(Boolean allowedDuplicateOpposite) {
        this.allowedDuplicateOpposite = allowedDuplicateOpposite;
    }

    public void setCannotCancelOrder(Boolean cannotCancelOrder) {
        this.cannotCancelOrder = cannotCancelOrder;
    }

    public void setDeactivateOrder(Boolean deactivateOrder) {
        this.deactivateOrder = deactivateOrder;
    }

    public void setOrderNotEditable(Boolean orderNotEditable) {
        this.orderNotEditable = orderNotEditable;
    }

    public void setOutsideRth(Boolean outsideRth) {
        this.outsideRth = outsideRth;
    }

    public void setUsePriceMgmtAlgo(Boolean usePriceMgmtAlgo) {
        this.usePriceMgmtAlgo = usePriceMgmtAlgo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(subType, requestId, orderId, conidex, symbol, side, contractDescription1, listingExchange,
                optionAcct, companyName, size, totalSize, currency, account, orderType, limitPrice, stopPrice, cumFill,
                orderStatus, orderStatusDescription, tif, fgColor, bgColor, orderNotEditable, editableFields,
                cannotCancelOrder, outsideRth, deactivateOrder, usePriceMgmtAlgo, secType, availableChartPeriods,
                orderDescription, orderDescriptionWithContract, alertActive, childOrderType, sizeAndFills,
                exitStrategyDisplayPrice, exitStrategyChartDescription, exitStrategyToolAvailability,
                allowedDuplicateOpposite, orderTime, ocaGroupId);
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrderStatus orderStatus = (OrderStatus) o;
        return Objects.equals(this.subType, orderStatus.subType) && Objects.equals(this.requestId,
                orderStatus.requestId) && Objects.equals(this.orderId, orderStatus.orderId) && Objects.equals(
                this.conidex, orderStatus.conidex) && Objects.equals(this.symbol, orderStatus.symbol) && Objects.equals(
                this.side, orderStatus.side) && Objects.equals(this.contractDescription1,
                orderStatus.contractDescription1) && Objects.equals(this.listingExchange, orderStatus.listingExchange)
                && Objects.equals(this.optionAcct, orderStatus.optionAcct) && Objects.equals(this.companyName,
                orderStatus.companyName) && Objects.equals(this.size, orderStatus.size) && Objects.equals(
                this.totalSize, orderStatus.totalSize) && Objects.equals(this.currency, orderStatus.currency)
                && Objects.equals(this.account, orderStatus.account) && Objects.equals(this.orderType,
                orderStatus.orderType) && Objects.equals(this.limitPrice, orderStatus.limitPrice) && Objects.equals(
                this.stopPrice, orderStatus.stopPrice) && Objects.equals(this.cumFill, orderStatus.cumFill)
                && Objects.equals(this.orderStatus, orderStatus.orderStatus) && Objects.equals(
                this.orderStatusDescription, orderStatus.orderStatusDescription) && Objects.equals(this.tif,
                orderStatus.tif) && Objects.equals(this.fgColor, orderStatus.fgColor) && Objects.equals(this.bgColor,
                orderStatus.bgColor) && Objects.equals(this.orderNotEditable, orderStatus.orderNotEditable)
                && Objects.equals(this.editableFields, orderStatus.editableFields) && Objects.equals(
                this.cannotCancelOrder, orderStatus.cannotCancelOrder) && Objects.equals(this.outsideRth,
                orderStatus.outsideRth) && Objects.equals(this.deactivateOrder, orderStatus.deactivateOrder)
                && Objects.equals(this.usePriceMgmtAlgo, orderStatus.usePriceMgmtAlgo) && Objects.equals(this.secType,
                orderStatus.secType) && Objects.equals(this.availableChartPeriods, orderStatus.availableChartPeriods)
                && Objects.equals(this.orderDescription, orderStatus.orderDescription) && Objects.equals(
                this.orderDescriptionWithContract, orderStatus.orderDescriptionWithContract) && Objects.equals(
                this.alertActive, orderStatus.alertActive) && Objects.equals(this.childOrderType,
                orderStatus.childOrderType) && Objects.equals(this.sizeAndFills, orderStatus.sizeAndFills)
                && Objects.equals(this.exitStrategyDisplayPrice, orderStatus.exitStrategyDisplayPrice)
                && Objects.equals(this.exitStrategyChartDescription, orderStatus.exitStrategyChartDescription)
                && Objects.equals(this.exitStrategyToolAvailability, orderStatus.exitStrategyToolAvailability)
                && Objects.equals(this.allowedDuplicateOpposite, orderStatus.allowedDuplicateOpposite)
                && Objects.equals(this.orderTime, orderStatus.orderTime) && Objects.equals(this.ocaGroupId,
                orderStatus.ocaGroupId);
    }

    @Override
    public String toString() {

        String sb = "class OrderStatus {\n" + "    subType: " + toIndentedString(subType) + "\n" + "    requestId: "
                + toIndentedString(requestId) + "\n" + "    orderId: " + toIndentedString(orderId) + "\n"
                + "    conidex: " + toIndentedString(conidex) + "\n" + "    symbol: " + toIndentedString(symbol) + "\n"
                + "    side: " + toIndentedString(side) + "\n" + "    contractDescription1: " + toIndentedString(
                contractDescription1) + "\n" + "    listingExchange: " + toIndentedString(listingExchange) + "\n"
                + "    optionAcct: " + toIndentedString(optionAcct) + "\n" + "    companyName: " + toIndentedString(
                companyName) + "\n" + "    size: " + toIndentedString(size) + "\n" + "    totalSize: "
                + toIndentedString(totalSize) + "\n" + "    currency: " + toIndentedString(currency) + "\n"
                + "    account: " + toIndentedString(account) + "\n" + "    orderType: " + toIndentedString(orderType)
                + "\n" + "    limitPrice: " + toIndentedString(limitPrice) + "\n" + "    stopPrice: "
                + toIndentedString(stopPrice) + "\n" + "    cumFill: " + toIndentedString(cumFill) + "\n"
                + "    orderStatus: " + toIndentedString(orderStatus) + "\n" + "    orderStatusDescription: "
                + toIndentedString(orderStatusDescription) + "\n" + "    tif: " + toIndentedString(tif) + "\n"
                + "    fgColor: " + toIndentedString(fgColor) + "\n" + "    bgColor: " + toIndentedString(bgColor)
                + "\n" + "    orderNotEditable: " + toIndentedString(orderNotEditable) + "\n" + "    editableFields: "
                + toIndentedString(editableFields) + "\n" + "    cannotCancelOrder: " + toIndentedString(
                cannotCancelOrder) + "\n" + "    outsideRth: " + toIndentedString(outsideRth) + "\n"
                + "    deactivateOrder: " + toIndentedString(deactivateOrder) + "\n" + "    usePriceMgmtAlgo: "
                + toIndentedString(usePriceMgmtAlgo) + "\n" + "    secType: " + toIndentedString(secType) + "\n"
                + "    availableChartPeriods: " + toIndentedString(availableChartPeriods) + "\n"
                + "    orderDescription: " + toIndentedString(orderDescription) + "\n"
                + "    orderDescriptionWithContract: " + toIndentedString(orderDescriptionWithContract) + "\n"
                + "    alertActive: " + toIndentedString(alertActive) + "\n" + "    childOrderType: "
                + toIndentedString(childOrderType) + "\n" + "    sizeAndFills: " + toIndentedString(sizeAndFills) + "\n"
                + "    exitStrategyDisplayPrice: " + toIndentedString(exitStrategyDisplayPrice) + "\n"
                + "    exitStrategyChartDescription: " + toIndentedString(exitStrategyChartDescription) + "\n"
                + "    exitStrategyToolAvailability: " + toIndentedString(exitStrategyToolAvailability) + "\n"
                + "    allowedDuplicateOpposite: " + toIndentedString(allowedDuplicateOpposite) + "\n"
                + "    orderTime: " + toIndentedString(orderTime) + "\n" + "    ocaGroupId: " + toIndentedString(
                ocaGroupId) + "\n" + "}";
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

    public OrderStatus account(String account) {
        this.account = account;
        return this;
    }

    public OrderStatus alertActive(Integer alertActive) {
        this.alertActive = alertActive;
        return this;
    }

    public OrderStatus allowedDuplicateOpposite(Boolean allowedDuplicateOpposite) {
        this.allowedDuplicateOpposite = allowedDuplicateOpposite;
        return this;
    }

    public OrderStatus availableChartPeriods(String availableChartPeriods) {
        this.availableChartPeriods = availableChartPeriods;
        return this;
    }

    public OrderStatus bgColor(String bgColor) {
        this.bgColor = bgColor;
        return this;
    }

    public OrderStatus cannotCancelOrder(Boolean cannotCancelOrder) {
        this.cannotCancelOrder = cannotCancelOrder;
        return this;
    }

    public OrderStatus childOrderType(String childOrderType) {
        this.childOrderType = childOrderType;
        return this;
    }

    public OrderStatus companyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public OrderStatus conidex(String conidex) {
        this.conidex = conidex;
        return this;
    }

    public OrderStatus contractDescription1(String contractDescription1) {
        this.contractDescription1 = contractDescription1;
        return this;
    }

    public OrderStatus cumFill(String cumFill) {
        this.cumFill = cumFill;
        return this;
    }

    public OrderStatus currency(String currency) {
        this.currency = currency;
        return this;
    }

    public OrderStatus deactivateOrder(Boolean deactivateOrder) {
        this.deactivateOrder = deactivateOrder;
        return this;
    }

    public OrderStatus editableFields(String editableFields) {
        this.editableFields = editableFields;
        return this;
    }

    public OrderStatus exitStrategyChartDescription(String exitStrategyChartDescription) {
        this.exitStrategyChartDescription = exitStrategyChartDescription;
        return this;
    }

    public OrderStatus exitStrategyDisplayPrice(String exitStrategyDisplayPrice) {
        this.exitStrategyDisplayPrice = exitStrategyDisplayPrice;
        return this;
    }

    public OrderStatus exitStrategyToolAvailability(ExitStrategyToolAvailabilityEnum exitStrategyToolAvailability) {
        this.exitStrategyToolAvailability = exitStrategyToolAvailability;
        return this;
    }

    public OrderStatus fgColor(String fgColor) {
        this.fgColor = fgColor;
        return this;
    }

    /**
     * Returns true if contract supports duplicate/opposite side order.
     *
     * @return allowedDuplicateOpposite
     **/
    @JsonProperty("allowed_duplicate_opposite")
    @ApiModelProperty(value = "Returns true if contract supports duplicate/opposite side order.")
    public Boolean isAllowedDuplicateOpposite() {
        return allowedDuplicateOpposite;
    }

    /**
     * If true not allowed to cancel order.
     *
     * @return cannotCancelOrder
     **/
    @JsonProperty("cannot_cancel_order")
    @ApiModelProperty(value = "If true not allowed to cancel order")
    public Boolean isCannotCancelOrder() {
        return cannotCancelOrder;
    }

    /**
     * If true order is de-activated.
     *
     * @return deactivateOrder
     **/
    @JsonProperty("deactivate_order")
    @ApiModelProperty(value = "If true order is de-activated")
    public Boolean isDeactivateOrder() {
        return deactivateOrder;
    }

    /**
     * If true not allowed to modify order.
     *
     * @return orderNotEditable
     **/
    @JsonProperty("order_not_editable")
    @ApiModelProperty(value = "If true not allowed to modify order")
    public Boolean isOrderNotEditable() {
        return orderNotEditable;
    }

    /**
     * If true order trades outside regular trading hours.
     *
     * @return outsideRth
     **/
    @JsonProperty("outside_rth")
    @ApiModelProperty(value = "If true order trades outside regular trading hours")
    public Boolean isOutsideRth() {
        return outsideRth;
    }

    /**
     * If true price management algo is enabled, refer to https://www.interactivebrokers.com/en/index.php?f=43423
     *
     * @return usePriceMgmtAlgo
     **/
    @JsonProperty("use_price_mgmt_algo")
    @ApiModelProperty(
            value = "If true price management algo is enabled, refer to https://www.interactivebrokers.com/en/index.php?f=43423")
    public Boolean isUsePriceMgmtAlgo() {
        return usePriceMgmtAlgo;
    }

    public OrderStatus limitPrice(String limitPrice) {
        this.limitPrice = limitPrice;
        return this;
    }

    public OrderStatus listingExchange(String listingExchange) {
        this.listingExchange = listingExchange;
        return this;
    }

    public OrderStatus ocaGroupId(String ocaGroupId) {
        this.ocaGroupId = ocaGroupId;
        return this;
    }

    public OrderStatus optionAcct(String optionAcct) {
        this.optionAcct = optionAcct;
        return this;
    }

    public OrderStatus orderDescription(String orderDescription) {
        this.orderDescription = orderDescription;
        return this;
    }

    public OrderStatus orderDescriptionWithContract(String orderDescriptionWithContract) {
        this.orderDescriptionWithContract = orderDescriptionWithContract;
        return this;
    }

    public OrderStatus orderId(Integer orderId) {
        this.orderId = orderId;
        return this;
    }

    public OrderStatus orderNotEditable(Boolean orderNotEditable) {
        this.orderNotEditable = orderNotEditable;
        return this;
    }

    public OrderStatus orderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }

    public OrderStatus orderStatusDescription(String orderStatusDescription) {
        this.orderStatusDescription = orderStatusDescription;
        return this;
    }

    public OrderStatus orderTime(String orderTime) {
        this.orderTime = orderTime;
        return this;
    }

    public OrderStatus orderType(String orderType) {
        this.orderType = orderType;
        return this;
    }

    public OrderStatus outsideRth(Boolean outsideRth) {
        this.outsideRth = outsideRth;
        return this;
    }

    public OrderStatus requestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public OrderStatus secType(String secType) {
        this.secType = secType;
        return this;
    }

    public OrderStatus side(SideEnum side) {
        this.side = side;
        return this;
    }

    public OrderStatus size(String size) {
        this.size = size;
        return this;
    }

    public OrderStatus sizeAndFills(String sizeAndFills) {
        this.sizeAndFills = sizeAndFills;
        return this;
    }

    public OrderStatus stopPrice(String stopPrice) {
        this.stopPrice = stopPrice;
        return this;
    }

    public OrderStatus subType(String subType) {
        this.subType = subType;
        return this;
    }

    public OrderStatus symbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    public OrderStatus tif(String tif) {
        this.tif = tif;
        return this;
    }

    public OrderStatus totalSize(String totalSize) {
        this.totalSize = totalSize;
        return this;
    }

    public OrderStatus usePriceMgmtAlgo(Boolean usePriceMgmtAlgo) {
        this.usePriceMgmtAlgo = usePriceMgmtAlgo;
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

        public String value() {
            return value;
        }

        /**
         * Side adapter.
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

    /**
     * ExitStrategyToolAvailability.
     * * 1: If your account has position or order for contract
     * * 0: If your account has no position or order for contract
     */
    @XmlType(name = "ExitStrategyToolAvailabilityEnum")
    @XmlEnum(String.class)
    @JsonAdapter(ExitStrategyToolAvailabilityEnum.Adapter.class)
    public enum ExitStrategyToolAvailabilityEnum {

        @XmlEnumValue("1") _1("1"),
        @XmlEnumValue("0") _0("0");


        private final String value;

        ExitStrategyToolAvailabilityEnum(String value) {
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
         * ExitStrategyToolAvailability.
         */
        @JsonCreator
        public static ExitStrategyToolAvailabilityEnum fromValue(String text) {
            for (ExitStrategyToolAvailabilityEnum b : ExitStrategyToolAvailabilityEnum.values()) {
                if (String.valueOf(b.value)
                        .equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public String value() {
            return value;
        }

        /**
         * ExitStrategyToolAvailability adapter.
         */
        public static class Adapter extends TypeAdapter<ExitStrategyToolAvailabilityEnum> {

            @Override
            public void write(final JsonWriter jsonWriter, final ExitStrategyToolAvailabilityEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ExitStrategyToolAvailabilityEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ExitStrategyToolAvailabilityEnum.fromValue(String.valueOf(value));
            }

        }
    }

}

