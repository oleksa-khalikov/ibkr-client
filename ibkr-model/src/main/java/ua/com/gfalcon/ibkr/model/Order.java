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
 * contains all the order related info.
 */
@ApiModel(description = "contains all the order related info")
@Validated
public class Order {

    /**
     * account id.
     **/
    @ApiModelProperty(value = "account id")
    @JsonProperty("acct")
    @SerializedName("acct")
    private String acct = null;

    @ApiModelProperty(value = "")
    @JsonProperty("conid")
    @SerializedName("conid")
    private Integer conid = null;

    @ApiModelProperty(value = "")
    @JsonProperty("orderDesc")
    @SerializedName("orderDesc")
    private String orderDesc = null;

    @ApiModelProperty(value = "")
    @JsonProperty("description1")
    @SerializedName("description1")
    private String description1 = null;

    /**
     * for example FB.
     **/
    @ApiModelProperty(value = "for example FB")
    @JsonProperty("ticker")
    @SerializedName("ticker")
    private String ticker = null;

    /**
     * for example STK.
     **/
    @ApiModelProperty(value = "for example STK")
    @JsonProperty("secType")
    @SerializedName("secType")
    private String secType = null;

    /**
     * for example NASDAQ.NMS.
     **/
    @ApiModelProperty(value = "for example NASDAQ.NMS")
    @JsonProperty("listingExchange")
    @SerializedName("listingExchange")
    private String listingExchange = null;

    @ApiModelProperty(value = "")
    @JsonProperty("remainingQuantity")
    @SerializedName("remainingQuantity")
    private String remainingQuantity = null;

    @ApiModelProperty(value = "")
    @JsonProperty("filledQuantity")
    @SerializedName("filledQuantity")
    private String filledQuantity = null;

    @ApiModelProperty(value = "")
    @JsonProperty("companyName")
    @SerializedName("companyName")
    private String companyName = null;

    /**
     * * PendingSubmit - Indicates the order was sent, but confirmation has not been received that it has been received
     * by the destination. Occurs most commonly if an exchange is closed.
     * * PendingCancel - Indicates that a request has been sent to cancel an order but confirmation has not been
     * received of its cancellation.
     * * PreSubmitted - Indicates that a simulated order type has been accepted by the IBKR system and that this order
     * has yet to be elected. The order is held in the IBKR system until the election criteria are met. At that time
     * the order is transmitted to the order destination as specified.
     * * Submitted - Indicates that the order has been accepted at the order destination and is working.
     * * Cancelled - Indicates that the balance of the order has been confirmed cancelled by the IB system. This could
     * occur unexpectedly when IB or the destination has rejected the order.
     * * Filled - Indicates that the order has been completely filled.
     * * Inactive - Indicates the order is not working, for instance if the order was invalid and triggered
     * an error message, or if the order was to short a security and shares have not yet been located.
     **/
    @ApiModelProperty(
            value = "* PendingSubmit - Indicates the order was sent, but confirmation has not been received that it"
                    + " has been received by the destination. Occurs most commonly if an exchange is closed."
                    + " * PendingCancel - Indicates that a request has been sent to cancel an order but confirmation"
                    + " has not been received of its cancellation."
                    + " * PreSubmitted - Indicates that a simulated order type has been accepted by the IBKR system"
                    + " and that this order has yet to be elected. The order is held in the IBKR system until the"
                    + " election criteria are met. At that time the order is transmitted to the order destination"
                    + " as specified."
                    + " * Submitted - Indicates that the order has been accepted at the order destination"
                    + " and is working."
                    + " * Cancelled - Indicates that the balance of the order has been confirmed cancelled by the"
                    + " IB system. This could occur unexpectedly when IB or the destination has rejected the order."
                    + " * Filled - Indicates that the order has been completely filled."
                    + " * Inactive - Indicates the order is not working, for instance if the order was invalid and"
                    + " triggered an error message, or if the order was to short a security and shares have not yet"
                    + " been located. ")
    @JsonProperty("status")
    @SerializedName("status")
    private String status = null;

    /**
     * for example Limit.
     **/
    @ApiModelProperty(value = "for example Limit")
    @JsonProperty("origOrderType")
    @SerializedName("origOrderType")
    private String origOrderType = null;

    /**
     * BUY or SELL.
     **/
    @ApiModelProperty(value = "BUY or SELL")
    @JsonProperty("side")
    @SerializedName("side")
    private String side = null;

    @ApiModelProperty(value = "")
    @JsonProperty("price")
    @SerializedName("price")
    private BigDecimal price = null;

    /**
     * back-ground color.
     **/
    @ApiModelProperty(value = "back-ground color")
    @JsonProperty("bgColor")
    @SerializedName("bgColor")
    private String bgColor = null;

    @ApiModelProperty(value = "")
    @JsonProperty("fgColor")
    @SerializedName("fgColor")
    private String fgColor = null;

    @ApiModelProperty(value = "")
    @JsonProperty("orderId")
    @SerializedName("orderId")
    private Integer orderId = null;

    /**
     * Only exists in child order of bracket.
     **/
    @ApiModelProperty(value = "Only exists in child order of bracket")
    @JsonProperty("parentId")
    @SerializedName("parentId")
    private Integer parentId = null;

    /**
     * User defined string used to identify the order. Value is set using \"cOID\" field while placing an order.
     **/
    @ApiModelProperty(
            value = "User defined string used to identify the order. Value is set using \"cOID\""
                    + " field while placing an order.")
    @JsonProperty("order_ref")
    @SerializedName("order_ref")
    private String orderRef = null;

    /**
     * account id.
     *
     * @return acct
     **/
    @JsonProperty("acct")
    @ApiModelProperty(value = "account id")
    public String getAcct() {
        return acct;
    }

    public void setAcct(String acct) {
        this.acct = acct;
    }

    /**
     * back-ground color.
     *
     * @return bgColor
     **/
    @JsonProperty("bgColor")
    @ApiModelProperty(value = "back-ground color")
    public String getBgColor() {
        return bgColor;
    }

    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }

    /**
     * Get companyName.
     *
     * @return companyName
     **/
    @JsonProperty("companyName")
    @ApiModelProperty(value = "")
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * Get conid.
     *
     * @return conid
     **/
    @JsonProperty("conid")
    @ApiModelProperty(value = "")
    public Integer getConid() {
        return conid;
    }

    public void setConid(Integer conid) {
        this.conid = conid;
    }

    /**
     * Get description1.
     *
     * @return description1
     **/
    @JsonProperty("description1")
    @ApiModelProperty(value = "")
    public String getDescription1() {
        return description1;
    }

    public void setDescription1(String description1) {
        this.description1 = description1;
    }

    /**
     * Get fgColor.
     *
     * @return fgColor
     **/
    @JsonProperty("fgColor")
    @ApiModelProperty(value = "")
    public String getFgColor() {
        return fgColor;
    }

    public void setFgColor(String fgColor) {
        this.fgColor = fgColor;
    }

    /**
     * Get filledQuantity.
     *
     * @return filledQuantity
     **/
    @JsonProperty("filledQuantity")
    @ApiModelProperty(value = "")
    public String getFilledQuantity() {
        return filledQuantity;
    }

    public void setFilledQuantity(String filledQuantity) {
        this.filledQuantity = filledQuantity;
    }

    /**
     * for example NASDAQ.NMS
     *
     * @return listingExchange
     **/
    @JsonProperty("listingExchange")
    @ApiModelProperty(value = "for example NASDAQ.NMS")
    public String getListingExchange() {
        return listingExchange;
    }

    public void setListingExchange(String listingExchange) {
        this.listingExchange = listingExchange;
    }

    /**
     * Get orderDesc.
     *
     * @return orderDesc
     **/
    @JsonProperty("orderDesc")
    @ApiModelProperty(value = "")
    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }

    /**
     * Get orderId.
     *
     * @return orderId
     **/
    @JsonProperty("orderId")
    @ApiModelProperty(value = "")
    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * User defined string used to identify the order. Value is set using \"cOID\" field while placing an order.
     *
     * @return orderRef
     **/
    @JsonProperty("order_ref")
    @ApiModelProperty(
            value = "User defined string used to identify the order. Value is set using \"cOID\""
                    + " field while placing an order.")
    public String getOrderRef() {
        return orderRef;
    }

    public void setOrderRef(String orderRef) {
        this.orderRef = orderRef;
    }

    /**
     * for example Limit.
     *
     * @return origOrderType
     **/
    @JsonProperty("origOrderType")
    @ApiModelProperty(value = "for example Limit")
    public String getOrigOrderType() {
        return origOrderType;
    }

    public void setOrigOrderType(String origOrderType) {
        this.origOrderType = origOrderType;
    }

    /**
     * Only exists in child order of bracket.
     *
     * @return parentId
     **/
    @JsonProperty("parentId")
    @ApiModelProperty(value = "Only exists in child order of bracket")
    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * Get price.
     *
     * @return price
     **/
    @JsonProperty("price")
    @ApiModelProperty(value = "")
    @Valid
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * Get remainingQuantity.
     *
     * @return remainingQuantity
     **/
    @JsonProperty("remainingQuantity")
    @ApiModelProperty(value = "")
    public String getRemainingQuantity() {
        return remainingQuantity;
    }

    public void setRemainingQuantity(String remainingQuantity) {
        this.remainingQuantity = remainingQuantity;
    }

    /**
     * for example STK.
     *
     * @return secType
     **/
    @JsonProperty("secType")
    @ApiModelProperty(value = "for example STK")
    public String getSecType() {
        return secType;
    }

    public void setSecType(String secType) {
        this.secType = secType;
    }

    /**
     * BUY or SELL.
     *
     * @return side
     **/
    @JsonProperty("side")
    @ApiModelProperty(value = "BUY or SELL")
    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    /**
     * * PendingSubmit - Indicates the order was sent, but confirmation has not been received that it has been received
     * by the destination. Occurs most commonly if an exchange is closed.
     * * PendingCancel - Indicates that a request has been sent to cancel an order but confirmation has not been
     * received of its cancellation.
     * * PreSubmitted - Indicates that a simulated order type has been accepted by the IBKR system and that this
     * order has yet to be elected. The order is held in the IBKR system until the election criteria are met. At
     * that time the order is transmitted to the order destination as specified.
     * * Submitted - Indicates that the order has been accepted at the order destination and is working.
     * * Cancelled - Indicates that the balance of the order has been confirmed cancelled by the IB system. This could
     * occur unexpectedly when IB or the destination has rejected the order.
     * * Filled - Indicates that the order has been completely filled.
     * * Inactive - Indicates the order is not working, for instance if the order was invalid and triggered an error
     * message, or if the order was to short a security and shares have not yet been located.
     *
     * @return status
     **/
    @JsonProperty("status")
    @ApiModelProperty(
            value = "* PendingSubmit - Indicates the order was sent, but confirmation has not been received that it"
                    + " has been received by the destination. Occurs most commonly if an exchange is closed."
                    + " * PendingCancel - Indicates that a request has been sent to cancel an order but confirmation"
                    + " has not been received of its cancellation."
                    + " * PreSubmitted - Indicates that a simulated order type has been accepted by the IBKR system"
                    + " and that this order has yet to be elected. The order is held in the IBKR system until the"
                    + " election criteria are met. At that time the order is transmitted to the order destination"
                    + " as specified."
                    + " * Submitted - Indicates that the order has been accepted at the order destination"
                    + " and is working."
                    + " * Cancelled - Indicates that the balance of the order has been confirmed cancelled"
                    + " by the IB system. This could occur unexpectedly when IB or the destination"
                    + " has rejected the order."
                    + " * Filled - Indicates that the order has been completely filled."
                    + " * Inactive - Indicates the order is not working, for instance if the order was invalid"
                    + " and triggered an error message, or if the order was to short a security and shares have"
                    + " not yet been located. ")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * for example FB.
     *
     * @return ticker
     **/
    @JsonProperty("ticker")
    @ApiModelProperty(value = "for example FB")
    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    @Override
    public int hashCode() {
        return Objects.hash(acct, conid, orderDesc, description1, ticker, secType, listingExchange, remainingQuantity,
                filledQuantity, companyName, status, origOrderType, side, price, bgColor, fgColor, orderId, parentId,
                orderRef);
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Order order = (Order) o;
        return Objects.equals(this.acct, order.acct) && Objects.equals(this.conid, order.conid) && Objects.equals(
                this.orderDesc, order.orderDesc) && Objects.equals(this.description1, order.description1)
                && Objects.equals(this.ticker, order.ticker) && Objects.equals(this.secType, order.secType)
                && Objects.equals(this.listingExchange, order.listingExchange) && Objects.equals(this.remainingQuantity,
                order.remainingQuantity) && Objects.equals(this.filledQuantity, order.filledQuantity) && Objects.equals(
                this.companyName, order.companyName) && Objects.equals(this.status, order.status) && Objects.equals(
                this.origOrderType, order.origOrderType) && Objects.equals(this.side, order.side) && Objects.equals(
                this.price, order.price) && Objects.equals(this.bgColor, order.bgColor) && Objects.equals(this.fgColor,
                order.fgColor) && Objects.equals(this.orderId, order.orderId) && Objects.equals(this.parentId,
                order.parentId) && Objects.equals(this.orderRef, order.orderRef);
    }

    @Override
    public String toString() {

        String sb = "class Order {\n" + "    acct: " + toIndentedString(acct) + "\n" + "    conid: " + toIndentedString(
                conid) + "\n" + "    orderDesc: " + toIndentedString(orderDesc) + "\n" + "    description1: "
                + toIndentedString(description1) + "\n" + "    ticker: " + toIndentedString(ticker) + "\n"
                + "    secType: " + toIndentedString(secType) + "\n" + "    listingExchange: " + toIndentedString(
                listingExchange) + "\n" + "    remainingQuantity: " + toIndentedString(remainingQuantity) + "\n"
                + "    filledQuantity: " + toIndentedString(filledQuantity) + "\n" + "    companyName: "
                + toIndentedString(companyName) + "\n" + "    status: " + toIndentedString(status) + "\n"
                + "    origOrderType: " + toIndentedString(origOrderType) + "\n" + "    side: " + toIndentedString(side)
                + "\n" + "    price: " + toIndentedString(price) + "\n" + "    bgColor: " + toIndentedString(bgColor)
                + "\n" + "    fgColor: " + toIndentedString(fgColor) + "\n" + "    orderId: " + toIndentedString(
                orderId) + "\n" + "    parentId: " + toIndentedString(parentId) + "\n" + "    orderRef: "
                + toIndentedString(orderRef) + "\n" + "}";
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

    public Order acct(String acct) {
        this.acct = acct;
        return this;
    }

    public Order bgColor(String bgColor) {
        this.bgColor = bgColor;
        return this;
    }

    public Order companyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public Order conid(Integer conid) {
        this.conid = conid;
        return this;
    }

    public Order description1(String description1) {
        this.description1 = description1;
        return this;
    }

    public Order fgColor(String fgColor) {
        this.fgColor = fgColor;
        return this;
    }

    public Order filledQuantity(String filledQuantity) {
        this.filledQuantity = filledQuantity;
        return this;
    }

    public Order listingExchange(String listingExchange) {
        this.listingExchange = listingExchange;
        return this;
    }

    public Order orderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
        return this;
    }

    public Order orderId(Integer orderId) {
        this.orderId = orderId;
        return this;
    }

    public Order orderRef(String orderRef) {
        this.orderRef = orderRef;
        return this;
    }

    public Order origOrderType(String origOrderType) {
        this.origOrderType = origOrderType;
        return this;
    }

    public Order parentId(Integer parentId) {
        this.parentId = parentId;
        return this;
    }

    public Order price(BigDecimal price) {
        this.price = price;
        return this;
    }

    public Order remainingQuantity(String remainingQuantity) {
        this.remainingQuantity = remainingQuantity;
        return this;
    }

    public Order secType(String secType) {
        this.secType = secType;
        return this;
    }

    public Order side(String side) {
        this.side = side;
        return this;
    }

    public Order status(String status) {
        this.status = status;
        return this;
    }

    public Order ticker(String ticker) {
        this.ticker = ticker;
        return this;
    }

}

