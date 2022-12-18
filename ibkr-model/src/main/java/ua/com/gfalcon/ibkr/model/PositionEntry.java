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
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import lombok.Data;

/**
 * Position entry.
 */
@Data
@Validated
public class PositionEntry {

    @JsonProperty("acctId")
    @SerializedName("acctId")
    private String acctId;

    @JsonProperty("conid")
    @SerializedName("conid")
    private Integer conid;

    @JsonProperty("contractDesc")
    @SerializedName("contractDesc")
    private String contractDesc;

    @JsonProperty("assetClass")
    @SerializedName("assetClass")
    private String assetClass;

    @JsonProperty("position")
    @SerializedName("position")
    private BigDecimal position;

    @JsonProperty("mktPrice")
    @SerializedName("mktPrice")
    private BigDecimal mktPrice;

    @JsonProperty("mktValue")
    @SerializedName("mktValue")
    private BigDecimal mktValue;

    @JsonProperty("currency")
    @SerializedName("currency")
    private String currency;

    @JsonProperty("avgCost")
    @SerializedName("avgCost")
    private BigDecimal avgCost;

    @JsonProperty("avgPrice")
    @SerializedName("avgPrice")
    private BigDecimal avgPrice;

    @JsonProperty("realizedPnl")
    @SerializedName("realizedPnl")
    private BigDecimal realizedPnl;

    @JsonProperty("unrealizedPnl")
    @SerializedName("unrealizedPnl")
    private BigDecimal unrealizedPnl;

    @JsonProperty("exchs")
    @SerializedName("exchs")
    private String exchs;

    @JsonProperty("expiry")
    @SerializedName("expiry")
    private String expiry;

    @JsonProperty("putOrCall")
    @SerializedName("putOrCall")
    private String putOrCall;

    @JsonProperty("multiplier")
    @SerializedName("multiplier")
    private BigDecimal multiplier;

    @JsonProperty("strike")
    @SerializedName("strike")
    private BigDecimal strike;

    @JsonProperty("exerciseStyle")
    @SerializedName("exerciseStyle")
    private String exerciseStyle;

    @JsonProperty("undConid")
    @SerializedName("undConid")
    private Integer undConid;

    @JsonProperty("conExchMap")
    @SerializedName("conExchMap")
    @Valid
    private List<String> conExchMap = new ArrayList<>();

    @JsonProperty("baseMktValue")
    @SerializedName("baseMktValue")
    private BigDecimal baseMktValue;

    @JsonProperty("baseMktPrice")
    @SerializedName("baseMktPrice")
    private BigDecimal baseMktPrice;

    @JsonProperty("baseAvgCost")
    @SerializedName("baseAvgCost")
    private BigDecimal baseAvgCost;

    @JsonProperty("baseAvgPrice")
    @SerializedName("baseAvgPrice")
    private BigDecimal baseAvgPrice;

    @JsonProperty("baseRealizedPnl")
    @SerializedName("baseRealizedPnl")
    private BigDecimal baseRealizedPnl;

    @JsonProperty("baseUnrealizedPnl")
    @SerializedName("baseUnrealizedPnl")
    private BigDecimal baseUnrealizedPnl;

    @JsonProperty("name")
    @SerializedName("name")
    private String name;

    @JsonProperty("lastTradingDay")
    @SerializedName("lastTradingDay")
    private String lastTradingDay;

    @JsonProperty("group")
    @SerializedName("group")
    private String group;

    @JsonProperty("sector")
    @SerializedName("sector")
    private String sector;

    @JsonProperty("sectorGroup")
    @SerializedName("sectorGroup")
    private String sectorGroup;

    @JsonProperty("ticker")
    @SerializedName("ticker")
    private String ticker;

    @JsonProperty("undComp")
    @SerializedName("undComp")
    private String undComp;

    @JsonProperty("undSym")
    @SerializedName("undSym")
    private String undSym;

    @JsonProperty("fullName")
    @SerializedName("fullName")
    private String fullName;

    @JsonProperty("pageSize")
    @SerializedName("pageSize")
    private Integer pageSize;

    @JsonProperty("model")
    @SerializedName("model")
    private String model;
}
