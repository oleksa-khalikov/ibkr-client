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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import lombok.Data;

/**
 * Scanner result.
 */
@Data
public class ScannerResult {

    @JsonProperty("server_id")
    @SerializedName("server_id")
    private String serverId;

    @JsonProperty("column_name")
    @SerializedName("column_name")
    private String columnName;

    /**
     * Underlying symbol.
     */
    @JsonProperty("symbol")
    @SerializedName("symbol")
    private String symbol;

    /**
     * conid and exchange. Format supports conid or conid@exchange.
     */
    @JsonProperty("conidex")
    @SerializedName("conidex")
    private String conidex;

    @JsonProperty("con_id")
    @SerializedName("con_id")
    private BigDecimal conId;

    /**
     * List of available chart periods.
     */
    @JsonProperty("available_chart_periods")
    @SerializedName("available_chart_periods")
    private String availableChartPeriods;

    /**
     * Contracts company name.
     */
    @JsonProperty("company_name")
    @SerializedName("company_name")
    private String companyName;

    /**
     * Format contract name.
     */
    @JsonProperty("contract_description_1")
    @SerializedName("contract_description_1")
    private String contractDescription;

    @JsonProperty("listing_exchange")
    @SerializedName("listing_exchange")
    private String listingExchange;

    @JsonProperty("sec_type")
    @SerializedName("sec_type")
    private String secType;

}
