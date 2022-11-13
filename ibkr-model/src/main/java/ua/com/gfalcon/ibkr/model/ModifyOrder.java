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
 * ModifyOrder.
 */
@Validated
public class ModifyOrder {

    @ApiModelProperty(value = "")
    @JsonProperty("acctId")
    @SerializedName("acctId")
    private String acctId = null;

    @ApiModelProperty(value = "")
    @JsonProperty("conid")
    @SerializedName("conid")
    private Integer conid = null;

    /**
     * for example LMT.
     **/
    @ApiModelProperty(value = "for example LMT")
    @JsonProperty("orderType")
    @SerializedName("orderType")
    private String orderType = null;

    @ApiModelProperty(value = "")
    @JsonProperty("outsideRTH")
    @SerializedName("outsideRTH")
    private Boolean outsideRTH = null;

    @ApiModelProperty(value = "")
    @JsonProperty("price")
    @SerializedName("price")
    private BigDecimal price = null;

    @ApiModelProperty(value = "")
    @JsonProperty("auxPrice")
    @SerializedName("auxPrice")
    private BigDecimal auxPrice = null;

    /**
     * SELL or BUY.
     **/
    @ApiModelProperty(value = "SELL or BUY")
    @JsonProperty("side")
    @SerializedName("side")
    private String side = null;

    /**
     * optional, not required.
     **/
    @ApiModelProperty(value = "optional, not required")
    @JsonProperty("listingExchange")
    @SerializedName("listingExchange")
    private String listingExchange = null;

    /**
     * The ticker symbol of the original place order.
     **/
    @ApiModelProperty(value = "The ticker symbol of the original place order")
    @JsonProperty("ticker")
    @SerializedName("ticker")
    private String ticker = null;

    /**
     * Specify a time in force to change how long your order will continue to work in the market.
     **/
    @ApiModelProperty(
            example = "tif = DAY to tif = GTC",
            value = "Specify a time in force to change how long your order will continue to work in the market")
    @JsonProperty("tif")
    @SerializedName("tif")
    private String tif = null;

    /**
     * usually integer, for some special cases can be float numbers.
     **/
    @ApiModelProperty(value = "usually integer, for some special cases can be float numbers")
    @JsonProperty("quantity")
    @SerializedName("quantity")
    private BigDecimal quantity = null;

    /**
     * Set to true if you want to pause a working order. For details refer to the
     * [TWS Users' Guide:]
     * (https://guides.interactivebrokers.com/tws/twsguide.html#usersguidebook/getstarted/pause_execution.htm)
     **/
    @ApiModelProperty(value = "Set to true if you want to pause a working order. For details refer to the")
    @JsonProperty("deactivated")
    @SerializedName("deactivated")
    private Boolean deactivated = null;

    /**
     * Get acctId.
     *
     * @return acctId
     **/
    @JsonProperty("acctId")
    @ApiModelProperty(value = "")
    public String getAcctId() {
        return acctId;
    }

    public void setAcctId(String acctId) {
        this.acctId = acctId;
    }

    /**
     * Get auxPrice.
     *
     * @return auxPrice
     **/
    @JsonProperty("auxPrice")
    @ApiModelProperty(value = "")
    @Valid
    public BigDecimal getAuxPrice() {
        return auxPrice;
    }

    public void setAuxPrice(BigDecimal auxPrice) {
        this.auxPrice = auxPrice;
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
     * optional, not required.
     *
     * @return listingExchange
     **/
    @JsonProperty("listingExchange")
    @ApiModelProperty(value = "optional, not required")
    public String getListingExchange() {
        return listingExchange;
    }

    public void setListingExchange(String listingExchange) {
        this.listingExchange = listingExchange;
    }

    /**
     * for example LMT.
     *
     * @return orderType
     **/
    @JsonProperty("orderType")
    @ApiModelProperty(value = "for example LMT")
    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
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
     * usually integer, for some special cases can be float numbers.
     *
     * @return quantity
     **/
    @JsonProperty("quantity")
    @ApiModelProperty(value = "usually integer, for some special cases can be float numbers")
    @Valid
    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
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
     * The ticker symbol of the original place order.
     *
     * @return ticker
     **/
    @JsonProperty("ticker")
    @ApiModelProperty(value = "The ticker symbol of the original place order")
    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    /**
     * Specify a time in force to change how long your order will continue to work in the market.
     *
     * @return tif
     **/
    @JsonProperty("tif")
    @ApiModelProperty(
            example = "tif = DAY to tif = GTC",
            value = "Specify a time in force to change how long your order will continue to work in the market")
    public String getTif() {
        return tif;
    }

    public void setTif(String tif) {
        this.tif = tif;
    }

    public void setDeactivated(Boolean deactivated) {
        this.deactivated = deactivated;
    }

    public void setOutsideRTH(Boolean outsideRTH) {
        this.outsideRTH = outsideRTH;
    }

    @Override
    public int hashCode() {
        return Objects.hash(acctId, conid, orderType, outsideRTH, price, auxPrice, side, listingExchange, ticker, tif,
                quantity, deactivated);
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModifyOrder modifyOrder = (ModifyOrder) o;
        return Objects.equals(this.acctId, modifyOrder.acctId) && Objects.equals(this.conid, modifyOrder.conid)
                && Objects.equals(this.orderType, modifyOrder.orderType) && Objects.equals(this.outsideRTH,
                modifyOrder.outsideRTH) && Objects.equals(this.price, modifyOrder.price) && Objects.equals(
                this.auxPrice, modifyOrder.auxPrice) && Objects.equals(this.side, modifyOrder.side) && Objects.equals(
                this.listingExchange, modifyOrder.listingExchange) && Objects.equals(this.ticker, modifyOrder.ticker)
                && Objects.equals(this.tif, modifyOrder.tif) && Objects.equals(this.quantity, modifyOrder.quantity)
                && Objects.equals(this.deactivated, modifyOrder.deactivated);
    }

    @Override
    public String toString() {

        String sb = "class ModifyOrder {\n" + "    acctId: " + toIndentedString(acctId) + "\n" + "    conid: "
                + toIndentedString(conid) + "\n" + "    orderType: " + toIndentedString(orderType) + "\n"
                + "    outsideRTH: " + toIndentedString(outsideRTH) + "\n" + "    price: " + toIndentedString(price)
                + "\n" + "    auxPrice: " + toIndentedString(auxPrice) + "\n" + "    side: " + toIndentedString(side)
                + "\n" + "    listingExchange: " + toIndentedString(listingExchange) + "\n" + "    ticker: "
                + toIndentedString(ticker) + "\n" + "    tif: " + toIndentedString(tif) + "\n" + "    quantity: "
                + toIndentedString(quantity) + "\n" + "    deactivated: " + toIndentedString(deactivated) + "\n" + "}";
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

    public ModifyOrder acctId(String acctId) {
        this.acctId = acctId;
        return this;
    }

    public ModifyOrder auxPrice(BigDecimal auxPrice) {
        this.auxPrice = auxPrice;
        return this;
    }

    public ModifyOrder conid(Integer conid) {
        this.conid = conid;
        return this;
    }

    public ModifyOrder deactivated(Boolean deactivated) {
        this.deactivated = deactivated;
        return this;
    }

    /**
     * Set to true if you want to pause a working order. For details refer to the [TWS Users'
     * Guide:](https://guides.interactivebrokers.com/tws/twsguide.html#usersguidebook/getstarted/pause_execution.htm).
     *
     * @return deactivated
     **/
    @JsonProperty("deactivated")
    @ApiModelProperty(
            value = "Set to true if you want to pause a working order. For details refer to the [TWS Users' Guide:](https://guides.interactivebrokers.com/tws/twsguide.html#usersguidebook/getstarted/pause_execution.htm) ")
    public Boolean isDeactivated() {
        return deactivated;
    }

    /**
     * Get outsideRTH.
     *
     * @return outsideRTH
     **/
    @JsonProperty("outsideRTH")
    @ApiModelProperty(value = "")
    public Boolean isOutsideRTH() {
        return outsideRTH;
    }

    public ModifyOrder listingExchange(String listingExchange) {
        this.listingExchange = listingExchange;
        return this;
    }

    public ModifyOrder orderType(String orderType) {
        this.orderType = orderType;
        return this;
    }

    public ModifyOrder outsideRTH(Boolean outsideRTH) {
        this.outsideRTH = outsideRTH;
        return this;
    }

    public ModifyOrder price(BigDecimal price) {
        this.price = price;
        return this;
    }

    public ModifyOrder quantity(BigDecimal quantity) {
        this.quantity = quantity;
        return this;
    }

    public ModifyOrder side(String side) {
        this.side = side;
        return this;
    }

    public ModifyOrder ticker(String ticker) {
        this.ticker = ticker;
        return this;
    }

    public ModifyOrder tif(String tif) {
        this.tif = tif;
        return this;
    }

}

