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

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Symbol or Company Name to be searched.
 */
@ApiModel(description = "Symbol or Company Name to be searched")
@Validated
public class Symbol {

    /**
     * symbol or name to be searched.
     */
    @ApiModelProperty(value = "symbol or name to be searched")
    @JsonProperty("symbol")
    @SerializedName("symbol")
    @NotNull
    private String symbol = null;

    /**
     * should be true if the search is to be performed by name. false by default.
     */
    @ApiModelProperty(value = "should be true if the search is to be performed by name. false by default.")
    @JsonProperty("name")
    @SerializedName("name")
    private Boolean name = null;

    /**
     * If search is done by name, only the assets provided in this field will be returned.
     * Currently, only STK is supported.
     */
    @ApiModelProperty(
            value = "If search is done by name, only the assets provided in this field will be returned."
                    + " Currently, only STK is supported.")
    @JsonProperty("secType")
    @SerializedName("secType")
    private String secType = null;

    @Override
    public int hashCode() {
        return Objects.hash(getSymbol(), getName(), getSecType());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Symbol)) {
            return false;
        }
        Symbol symbol1 = (Symbol) o;
        return getSymbol().equals(symbol1.getSymbol()) && Objects.equals(getName(), symbol1.getName())
                && Objects.equals(getSecType(), symbol1.getSecType());
    }

    @Override
    public String toString() {
        String sb = "Symbol{" + "symbol='" + symbol + '\'' + ", name=" + name + ", secType='" + secType + '\'' + '}';
        return sb;
    }

    /**
     * symbol or name to be searched.
     */
    @ApiModelProperty(value = "symbol or name to be searched")
    @JsonProperty("symbol")
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    /**
     * should be true if the search is to be performed by name. false by default.
     */
    @ApiModelProperty(value = "should be true if the search is to be performed by name. false by default.")
    @JsonProperty("name")
    public Boolean getName() {
        return name;
    }

    public void setName(Boolean name) {
        this.name = name;
    }

    /**
     * If search is done by name, only the assets provided in this field will be returned.
     * Currently, only STK is supported.
     */
    @ApiModelProperty(
            value = "If search is done by name, only the assets provided in this field will be returned."
                    + " Currently, only STK is supported.")
    @JsonProperty("secType")
    public String getSecType() {
        return secType;
    }

    public void setSecType(String secType) {
        this.secType = secType;
    }

}
