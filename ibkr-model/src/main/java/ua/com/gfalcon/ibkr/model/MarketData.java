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
 * Market Data.
 */
@Validated
public class MarketData {

    /**
     * Last Price - The last price at which the contract traded.
     * May contain one of the following prefixes:
     * * C - Previous day's closing price.
     * * H - Trading has halted.
     **/
    @ApiModelProperty(
            value = "Last Price - The last price at which the contract traded."
                    + " May contain one of the following prefixes:"
                    + "   * C - Previous day's closing price."
                    + "   * H - Trading has halted. ")
    @JsonProperty("31")
    @SerializedName("31")
    private String v31 = null;

    /**
     * High - Current day high price.
     **/
    @ApiModelProperty(value = "High - Current day high price")
    @JsonProperty("70")
    @SerializedName("70")
    private BigDecimal v70 = null;

    /**
     * Low - Current day low price.
     **/
    @ApiModelProperty(value = "Low - Current day low price")
    @JsonProperty("71")
    @SerializedName("71")
    private BigDecimal v71 = null;

    /**
     * Change - The difference between the last price and the close on the previous trading day.
     **/
    @ApiModelProperty(
            value = "Change - The difference between the last price and the close on the previous trading day")
    @JsonProperty("82")
    @SerializedName("82")
    private String v82 = null;

    /**
     * Change % - The difference between the last price and the close on the previous trading day in percentage.
     **/
    @ApiModelProperty(
            value = "Change % - The difference between the last price and the close on the previous trading day"
                    + " in percentage.")
    @JsonProperty("83")
    @SerializedName("83")
    private BigDecimal v83 = null;

    /**
     * Bid Price - The highest-priced bid on the contract.
     **/
    @ApiModelProperty(value = "Bid Price - The highest-priced bid on the contract.")
    @JsonProperty("84")
    @SerializedName("84")
    private String v84 = null;

    /**
     * Ask Size - The number of contracts or shares offered at the ask price. For US stocks, the number displayed is
     * divided by 100.
     **/
    @ApiModelProperty(
            value = "Ask Size - The number of contracts or shares offered at the ask price. For US stocks, the number"
                    + " displayed is divided by 100.")
    @JsonProperty("85")
    @SerializedName("85")
    private String v85 = null;

    /**
     * Ask Price - The lowest-priced offer on the contract.
     **/
    @ApiModelProperty(value = "Ask Price - The lowest-priced offer on the contract.")
    @JsonProperty("86")
    @SerializedName("86")
    private String v86 = null;

    /**
     * Volume - Volume for the day, formatted with 'K' for thousands or 'M' for millions. For higher precision volume
     * refer to field 7762.
     **/
    @ApiModelProperty(
            value = "Volume - Volume for the day, formatted with 'K' for thousands or 'M' for millions."
                    + " For higher precision volume refer to field 7762.")
    @JsonProperty("87")
    @SerializedName("87")
    private String v87 = null;

    /**
     * Bid Size - The number of contracts or shares bid for at the bid price. For US stocks, the number displayed is
     * divided by 100.
     **/
    @ApiModelProperty(
            value = "Bid Size - The number of contracts or shares bid for at the bid price. For US stocks, the number"
                    + " displayed is divided by 100.")
    @JsonProperty("88")
    @SerializedName("88")
    private String v88 = null;

    /**
     * Market Data Availability. The field may contain three chars.
     * First char defines:
     * R = RealTime,
     * D = Delayed,
     * Z = Frozen,
     * Y = Frozen Delayed,
     * N = Not Subscribed.
     * Second char defines: P = Snapshot, p = Consolidated.
     * Third char defines: B = Book
     * * RealTime - Data is relayed back in real time without delay, market data subscription(s) are required.
     * * Delayed - Data is relayed back 15-20 min delayed.
     * * Frozen - Last recorded data at market close, relayed back in real time.
     * * Frozen Delayed - Last recorded data at market close, relayed back delayed.
     * * Not Subscribed - User does not have the required market data subscription(s) to relay back either real time
     * or delayed data.
     * * Snapshot - Snapshot request is available for contract.
     * * Consolidated - Market data is aggregated across multiple exchanges or venues.
     * * Book - Top of the book data is available for contract.
     **/
    @ApiModelProperty(
            value = "Market Data Availability. The field may contain three chars. First char defines: R = RealTime,"
                    + " D = Delayed, Z = Frozen, Y = Frozen Delayed, N = Not Subscribed."
                    + " Second char defines: P = Snapshot, p = Consolidated."
                    + " Third char defines: B = Book"
                    + "   * RealTime - Data is relayed back in real time without delay, market data subscription(s)"
                    + " are required."
                    + "   * Delayed - Data is relayed back 15-20 min delayed."
                    + "   * Frozen - Last recorded data at market close, relayed back in real time."
                    + "   * Frozen Delayed - Last recorded data at market close, relayed back delayed."
                    + "   * Not Subscribed - User does not have the required market data subscription(s) to relay"
                    + " back either real time or delayed data."
                    + "   * Snapshot - Snapshot request is available for contract."
                    + "   * Consolidated - Market data is aggregated across multiple exchanges or venues."
                    + "   * Book - Top of the book data is available for contract. ")
    @JsonProperty("6509")
    @SerializedName("6509")
    private String v6509 = null;

    /**
     * Ask Exch - Displays the exchange(s) offering the SMART price. A=AMEX, C=CBOE, I=ISE, X=PHLX, N=PSE, B=BOX,
     * Q=NASDAQOM, Z=BATS, W=CBOE2, T=NASDAQBX, M=MIAX, H=GEMINI, E=EDGX, J=MERCURY
     **/
    @ApiModelProperty(
            value = "Ask Exch - Displays the exchange(s) offering the SMART price. A=AMEX, C=CBOE, I=ISE, X=PHLX,"
                    + " N=PSE, B=BOX, Q=NASDAQOM, Z=BATS, W=CBOE2, T=NASDAQBX, M=MIAX, H=GEMINI, E=EDGX, J=MERCURY")
    @JsonProperty("7057")
    @SerializedName("7057")
    private String v7057 = null;

    /**
     * Last Exch - Displays the exchange(s) offering the SMART price. A=AMEX, C=CBOE, I=ISE, X=PHLX, N=PSE, B=BOX,
     * Q=NASDAQOM, Z=BATS, W=CBOE2, T=NASDAQBX, M=MIAX, H=GEMINI, E=EDGX, J=MERCURY
     **/
    @ApiModelProperty(
            value = "Last Exch - Displays the exchange(s) offering the SMART price. A=AMEX, C=CBOE, I=ISE, X=PHLX,"
                    + " N=PSE, B=BOX, Q=NASDAQOM, Z=BATS, W=CBOE2, T=NASDAQBX, M=MIAX, H=GEMINI, E=EDGX, J=MERCURY")
    @JsonProperty("7058")
    @SerializedName("7058")
    private String v7058 = null;

    /**
     * Last Size - The number of unites traded at the last price.
     **/
    @ApiModelProperty(value = "Last Size - The number of unites traded at the last price")
    @JsonProperty("7059")
    @SerializedName("7059")
    private BigDecimal v7059 = null;

    /**
     * Bid Exch - Displays the exchange(s) offering the SMART price. A=AMEX, C=CBOE, I=ISE, X=PHLX, N=PSE, B=BOX,
     * Q=NASDAQOM, Z=BATS, W=CBOE2, T=NASDAQBX, M=MIAX, H=GEMINI, E=EDGX, J=MERCURY
     **/
    @ApiModelProperty(
            value = "Bid Exch - Displays the exchange(s) offering the SMART price. A=AMEX, C=CBOE, I=ISE, X=PHLX,"
                    + " N=PSE, B=BOX, Q=NASDAQOM, Z=BATS, W=CBOE2, T=NASDAQBX, M=MIAX, H=GEMINI, E=EDGX, J=MERCURY")
    @JsonProperty("7068")
    @SerializedName("7068")
    private String v7068 = null;

    /**
     * IV Rank.
     **/
    @ApiModelProperty(value = "IV Rank")
    @JsonProperty("7195")
    @SerializedName("7195")
    private String v7195 = null;

    /**
     * IV Rank.
     **/
    @ApiModelProperty(value = "IV Rank")
    @JsonProperty("7196")
    @SerializedName("7196")
    private String v7196 = null;

    /**
     * IV Rank.
     **/
    @ApiModelProperty(value = "IV Rank")
    @JsonProperty("7197")
    @SerializedName("7197")
    private String v7197 = null;

    /**
     * IV Percentile.
     **/
    @ApiModelProperty(value = "IV Percentile")
    @JsonProperty("7198")
    @SerializedName("7198")
    private String v7198 = null;

    /**
     * IV Percentile.
     **/
    @ApiModelProperty(value = "IV Percentile")
    @JsonProperty("7199")
    @SerializedName("7199")
    private String v7199 = null;

    /**
     * IV Percentile.
     **/
    @ApiModelProperty(value = "IV Percentile")
    @JsonProperty("7200")
    @SerializedName("7200")
    private String v7200 = null;

    /**
     * IV High Low.
     **/
    @ApiModelProperty(value = "IV High Low")
    @JsonProperty("7201")
    @SerializedName("7201")
    private String v7201 = null;

    /**
     * IV High Low.
     **/
    @ApiModelProperty(value = "IV High Low")
    @JsonProperty("7202")
    @SerializedName("7202")
    private String v7202 = null;

    /**
     * IV High Low.
     **/
    @ApiModelProperty(value = "IV High Low")
    @JsonProperty("7203")
    @SerializedName("7203")
    private String v7203 = null;

    /**
     * IV High Low.
     **/
    @ApiModelProperty(value = "IV High Low")
    @JsonProperty("7204")
    @SerializedName("7204")
    private String v7204 = null;

    /**
     * IV High Low.
     **/
    @ApiModelProperty(value = "IV High Low")
    @JsonProperty("7205")
    @SerializedName("7205")
    private String v7205 = null;

    /**
     * IV High Low.
     **/
    @ApiModelProperty(value = "IV High Low")
    @JsonProperty("7206")
    @SerializedName("7206")
    private String v7206 = null;

    /**
     * HV Rank.
     **/
    @ApiModelProperty(value = "HV Rank")
    @JsonProperty("7207")
    @SerializedName("7207")
    private String v7207 = null;

    /**
     * HV Rank.
     **/
    @ApiModelProperty(value = "HV Rank")
    @JsonProperty("7208")
    @SerializedName("7208")
    private String v7208 = null;

    /**
     * HV Rank.
     **/
    @ApiModelProperty(value = "HV Rank")
    @JsonProperty("7209")
    @SerializedName("7209")
    private String v7209 = null;

    /**
     * HV Percentile.
     **/
    @ApiModelProperty(value = "HV Percentile")
    @JsonProperty("7210")
    @SerializedName("7210")
    private String v7210 = null;

    /**
     * HV Percentile.
     **/
    @ApiModelProperty(value = "HV Percentile")
    @JsonProperty("7211")
    @SerializedName("7211")
    private String v7211 = null;

    /**
     * HV Percentile.
     **/
    @ApiModelProperty(value = "HV Percentile")
    @JsonProperty("7212")
    @SerializedName("7212")
    private String v7212 = null;

    /**
     * HV High Low.
     **/
    @ApiModelProperty(value = "HV High Low")
    @JsonProperty("7245")
    @SerializedName("7245")
    private String v7245 = null;

    /**
     * HV High Low.
     **/
    @ApiModelProperty(value = "HV High Low")
    @JsonProperty("7246")
    @SerializedName("7246")
    private String v7246 = null;

    /**
     * HV High Low.
     **/
    @ApiModelProperty(value = "HV High Low")
    @JsonProperty("7247")
    @SerializedName("7247")
    private String v7247 = null;

    /**
     * HV High Low.
     **/
    @ApiModelProperty(value = "HV High Low")
    @JsonProperty("7248")
    @SerializedName("7248")
    private String v7248 = null;

    /**
     * HV High Low.
     **/
    @ApiModelProperty(value = "HV High Low")
    @JsonProperty("7249")
    @SerializedName("7249")
    private String v7249 = null;

    /**
     * HV High Low.
     **/
    @ApiModelProperty(value = "HV High Low")
    @JsonProperty("7263")
    @SerializedName("7263")
    private String v7263 = null;

    /**
     * ESG.
     **/
    @ApiModelProperty(value = "ESG")
    @JsonProperty("7264")
    @SerializedName("7264")
    private String v7264 = null;

    /**
     * ESG.
     **/
    @ApiModelProperty(value = "ESG")
    @JsonProperty("7265")
    @SerializedName("7265")
    private String v7265 = null;

    /**
     * ESG.
     **/
    @ApiModelProperty(value = "ESG")
    @JsonProperty("7266")
    @SerializedName("7266")
    private String v7266 = null;

    /**
     * ESG.
     **/
    @ApiModelProperty(value = "ESG")
    @JsonProperty("7267")
    @SerializedName("7267")
    private String v7267 = null;

    /**
     * ESG.
     **/
    @ApiModelProperty(value = "ESG")
    @JsonProperty("7268")
    @SerializedName("7268")
    private String v7268 = null;

    /**
     * ESG.
     **/
    @ApiModelProperty(value = "ESG")
    @JsonProperty("7269")
    @SerializedName("7269")
    private String v7269 = null;

    /**
     * ESG.
     **/
    @ApiModelProperty(value = "ESG")
    @JsonProperty("7271")
    @SerializedName("7271")
    private String v7271 = null;

    /**
     * ESG.
     **/
    @ApiModelProperty(value = "ESG")
    @JsonProperty("7272")
    @SerializedName("7272")
    private String v7272 = null;

    /**
     * ESG.
     **/
    @ApiModelProperty(value = "ESG")
    @JsonProperty("7273")
    @SerializedName("7273")
    private String v7273 = null;

    /**
     * ESG.
     **/
    @ApiModelProperty(value = "ESG")
    @JsonProperty("7274")
    @SerializedName("7274")
    private String v7274 = null;

    /**
     * ESG.
     **/
    @ApiModelProperty(value = "ESG")
    @JsonProperty("7275")
    @SerializedName("7275")
    private String v7275 = null;

    /**
     * ESG.
     **/
    @ApiModelProperty(value = "ESG")
    @JsonProperty("7276")
    @SerializedName("7276")
    private String v7276 = null;

    /**
     * ESG.
     **/
    @ApiModelProperty(value = "ESG")
    @JsonProperty("7277")
    @SerializedName("7277")
    private String v7277 = null;

    /**
     * Average Volume - The average daily trading volume over 90 days.
     **/
    @ApiModelProperty(value = "Average Volume - The average daily trading volume over 90 days.")
    @JsonProperty("7282")
    @SerializedName("7282")
    private String v7282 = null;

    /**
     * Option Implied Vol. % - A prediction of how volatile an underlying will be in the future. At the market
     * volatility estimated for a maturity thirty calendar days forward of the current trading day, and based on
     * option prices from two consecutive expiration months.
     **/
    @ApiModelProperty(
            value = "Option Implied Vol. % - A prediction of how volatile an underlying will be in the future."
                    + " At the market volatility estimated for a maturity thirty calendar days forward of the current"
                    + " trading day, and based on option prices from two consecutive expiration months.      ")
    @JsonProperty("7283")
    @SerializedName("7283")
    private String v7283 = null;

    /**
     * Historic Volume (30d).
     **/
    @ApiModelProperty(value = "Historic Volume (30d)")
    @JsonProperty("7284")
    @SerializedName("7284")
    private String v7284 = null;

    /**
     * Dividend Amount - Displays the amount of the next dividend.
     **/
    @ApiModelProperty(value = "Dividend Amount - Displays the amount of the next dividend.")
    @JsonProperty("7286")
    @SerializedName("7286")
    private BigDecimal v7286 = null;

    /**
     * Dividend Yield % - This value is the toal of the expected dividend payments over the next twelve months per
     * share divided by the Current Price and is expressed as a percentage. For derivatives, this displays the total
     * of the expected dividend payments over the expiry date.
     **/
    @ApiModelProperty(
            value = "Dividend Yield % - This value is the toal of the expected dividend payments over the next twelve"
                    + " months per share divided by the Current Price and is expressed as a percentage."
                    + " For derivatives, this displays the total of the expected dividend payments over the"
                    + " expiry date. ")
    @JsonProperty("7287")
    @SerializedName("7287")
    private String v7287 = null;

    /**
     * Ex-date of the dividend.
     **/
    @ApiModelProperty(value = "Ex-date of the dividend")
    @JsonProperty("7288")
    @SerializedName("7288")
    private String v7288 = null;

    /**
     * Market Cap.
     **/
    @ApiModelProperty(value = "Market Cap")
    @JsonProperty("7289")
    @SerializedName("7289")
    private String v7289 = null;

    /**
     * P/E.
     **/
    @ApiModelProperty(value = "P/E")
    @JsonProperty("7290")
    @SerializedName("7290")
    private String v7290 = null;

    /**
     * 52 Week High - The highest price for the past 52 weeks.
     **/
    @ApiModelProperty(value = "52 Week High - The highest price for the past 52 weeks.")
    @JsonProperty("7293")
    @SerializedName("7293")
    private String v7293 = null;

    /**
     * 52 Week Low - The lowest price for the past 52 weeks.
     **/
    @ApiModelProperty(value = "52 Week Low - The lowest price for the past 52 weeks.")
    @JsonProperty("7294")
    @SerializedName("7294")
    private String v7294 = null;

    /**
     * Open - Today's opening price.
     **/
    @ApiModelProperty(value = "Open - Today's opening price.")
    @JsonProperty("7295")
    @SerializedName("7295")
    private BigDecimal v7295 = null;

    /**
     * Close - Today's closing price.
     **/
    @ApiModelProperty(value = "Close - Today's closing price.")
    @JsonProperty("7296")
    @SerializedName("7296")
    private BigDecimal v7296 = null;

    /**
     * Reuters Fundamentals.
     **/
    @ApiModelProperty(value = "Reuters Fundamentals")
    @JsonProperty("7331")
    @SerializedName("7331")
    private String v7331 = null;

    /**
     * ESG.
     **/
    @ApiModelProperty(value = "ESG")
    @JsonProperty("7370")
    @SerializedName("7370")
    private String v7370 = null;

    /**
     * ESG.
     **/
    @ApiModelProperty(value = "ESG")
    @JsonProperty("7371")
    @SerializedName("7371")
    private String v7371 = null;

    /**
     * ESG.
     **/
    @ApiModelProperty(value = "ESG")
    @JsonProperty("7372")
    @SerializedName("7372")
    private String v7372 = null;

    /**
     * Mark - The mark price is, the ask price if ask is less than last price, the bid price if bid is more than the
     * last price, otherwise it's equal to last price.
     **/
    @ApiModelProperty(
            value = "Mark - The mark price is, the ask price if ask is less than last price, the bid price if bid is"
                    + " more than the last price, otherwise it's equal to last price")
    @JsonProperty("7635")
    @SerializedName("7635")
    private String v7635 = null;

    /**
     * shortable invetory.
     **/
    @ApiModelProperty(value = "shortable invetory")
    @JsonProperty("7636")
    @SerializedName("7636")
    private BigDecimal v7636 = null;

    /**
     * Fee rebate rate.
     **/
    @ApiModelProperty(value = "Fee rebate rate")
    @JsonProperty("7637")
    @SerializedName("7637")
    private String v7637 = null;

    /**
     * Shortable - Describes the level of difficulty with which the security can be sold short.
     **/
    @ApiModelProperty(
            value = "Shortable - Describes the level of difficulty with which the security can be sold short.")
    @JsonProperty("7644")
    @SerializedName("7644")
    private String v7644 = null;

    /**
     * EMA(200) - Exponential moving average (N=200).
     **/
    @ApiModelProperty(value = "EMA(200) - Exponential moving average (N=200).")
    @JsonProperty("7674")
    @SerializedName("7674")
    private String v7674 = null;

    /**
     * EMA(100) - Exponential moving average (N=100).
     **/
    @ApiModelProperty(value = "EMA(100) - Exponential moving average (N=100).")
    @JsonProperty("7675")
    @SerializedName("7675")
    private String v7675 = null;

    /**
     * EMA(50) - Exponential moving average (N=50).
     **/
    @ApiModelProperty(value = "EMA(50) - Exponential moving average (N=50).")
    @JsonProperty("7676")
    @SerializedName("7676")
    private String v7676 = null;

    /**
     * EMA(20) - Exponential moving average (N=20).
     **/
    @ApiModelProperty(value = "EMA(20) - Exponential moving average (N=20).")
    @JsonProperty("7677")
    @SerializedName("7677")
    private String v7677 = null;

    /**
     * Price/EMA(20) - Price to Exponential moving average (N=20) ratio -1, displayed in percents.
     **/
    @ApiModelProperty(
            value = "Price/EMA(20) - Price to Exponential moving average (N=20) ratio -1, displayed in percents.")
    @JsonProperty("7681")
    @SerializedName("7681")
    private String v7681 = null;

    /**
     * Last Yield - Implied yield of the bond if it is purchased at the current last price. Last yield is calculated
     * using the Last price on all possible call dates. It is assumed that prepayment occurs if the bond has call or
     * put provisions and the issuer can offer a lower coupon rate based on current market rates. The yield to worst
     * will be the lowest of the yield to maturity or yield to call (if the bond has prepayment provisions). Yield to
     * worse may be the same as yield to maturity but never higher.
     **/
    @ApiModelProperty(
            value = "Last Yield - Implied yield of the bond if it is purchased at the current last price. Last yield"
                    + " is calculated using the Last price on all possible call dates. It is assumed that prepayment"
                    + " occurs if the bond has call or put provisions and the issuer can offer a lower coupon rate"
                    + " based on current market rates. The yield to worst will be the lowest of the yield to maturity"
                    + " or yield to call (if the bond has prepayment provisions). Yield to worse may be the same as"
                    + " yield to maturity but never higher. ")
    @JsonProperty("7698")
    @SerializedName("7698")
    private String v7698 = null;

    /**
     * Bid Yield - Implied yield of the bond if it is purchased at the current bid price.
     * Bid yield is calculated using the Ask on all possible call dates. It is assumed that prepayment occurs if
     * the bond has call or put provisions and the issuer can offer a lower coupon rate based on current market rates.
     * The yield to worst will be the lowest of the yield to maturity or yield to call (if the bond has prepayment
     * provisions). Yield to worse may be the same as yield to maturity but never higher.
     **/
    @ApiModelProperty(
            value = "Bid Yield - Implied yield of the bond if it is purchased at the current bid price."
                    + " Bid yield is calculated using the Ask on all possible call dates. It is assumed that"
                    + " prepayment occurs if the bond has call or put provisions and the issuer can offer a lower"
                    + " coupon rate based on current market rates. The yield to worst will be the lowest of the"
                    + " yield to maturity or yield to call (if the bond has prepayment provisions). Yield to worse"
                    + " may be the same as yield to maturity but never higher. ")
    @JsonProperty("7699")
    @SerializedName("7699")
    private String v7699 = null;

    /**
     * Beta - Beta is against standard index.
     **/
    @ApiModelProperty(value = "Beta - Beta is against standard index.")
    @JsonProperty("7718")
    @SerializedName("7718")
    private String v7718 = null;


    /**
     * Ask Yield - Implied yield of the bond if it is purchased at the current offer.
     * Ask yield is calculated using the Bid on all possible call dates. It is assumed that prepayment occurs if
     * the bond has call or put provisions and the issuer can offer a lower coupon rate based on current market rates.
     * The yield to worst will be the lowest of the yield to maturity or yield to call (if the bond has prepayment
     * provisions). Yield to worse may be the same as yield to maturity but never higher.
     **/
    @ApiModelProperty(
            value = "Ask Yield - Implied yield of the bond if it is purchased at the current offer."
                    + " Ask yield is calculated using the Bid on all possible call dates."
                    + " It is assumed that prepayment occurs if the bond has call or put provisions and the"
                    + " issuer can offer a lower coupon rate"
                    + " based on current market rates. The yield to worst will be the lowest of the yield to maturity"
                    + " or yield to call (if the bond has prepayment provisions). Yield to worse may be the same"
                    + " as yield to maturity but never higher. ")
    @JsonProperty("7720")
    @SerializedName("7720")
    private String v7720 = null;

    /**
     * Reuters Fundamentals.
     **/
    @ApiModelProperty(value = "Reuters Fundamentals")
    @JsonProperty("7743")
    @SerializedName("7743")
    private String v7743 = null;

    /**
     * ESG.
     **/
    @ApiModelProperty(value = "ESG")
    @JsonProperty("7761")
    @SerializedName("7761")
    private String v7761 = null;

    /**
     * 26 Week High - The highest price for the past 26 weeks.
     **/
    @ApiModelProperty(value = "26 Week High - The highest price for the past 26 weeks.")
    @JsonProperty("7992")
    @SerializedName("7992")
    private String v7992 = null;

    /**
     * 26 Week Low - The lowest price for the past 26 weeks.
     **/
    @ApiModelProperty(value = "26 Week Low - The lowest price for the past 26 weeks.")
    @JsonProperty("7993")
    @SerializedName("7993")
    private String v7993 = null;

    /**
     * 13 Week High - The highest price for the past 13 weeks.
     **/
    @ApiModelProperty(value = "13 Week High - The highest price for the past 13 weeks.")
    @JsonProperty("7994")
    @SerializedName("7994")
    private String v7994 = null;

    /**
     * 13 Week Low - The lowest price for the past 13 weeks.
     **/
    @ApiModelProperty(value = "13 Week Low - The lowest price for the past 13 weeks.")
    @JsonProperty("7995")
    @SerializedName("7995")
    private String v7995 = null;

    /**
     * IBKR Contract identifier.
     **/
    @ApiModelProperty(value = "IBKR Contract identifier")
    @JsonProperty("conid")
    @SerializedName("conid")
    private Integer conid = null;

    /**
     * minimum price increment.
     **/
    @ApiModelProperty(value = "minimum price increment")
    @JsonProperty("minTick")
    @SerializedName("minTick")
    private BigDecimal minTick = null;

    /**
     * Color for Best Bid/Offer Exchange in hex code.
     **/
    @ApiModelProperty(value = "Color for Best Bid/Offer Exchange in hex code")
    @JsonProperty("BboExchange")
    @SerializedName("BboExchange")
    private String bboExchange = null;

    /**
     * If market data field values return delayed.
     **/
    @ApiModelProperty(value = "If market data field values return delayed")
    @JsonProperty("HasDelayed")
    @SerializedName("HasDelayed")
    private Boolean hasDelayed = null;

    /**
     * minimum size increment.
     **/
    @ApiModelProperty(value = "minimum size increment")
    @JsonProperty("sizeMinTick")
    @SerializedName("sizeMinTick")
    private Integer sizeMinTick = null;

    @ApiModelProperty(value = "")
    @JsonProperty("BestEligible")
    @SerializedName("BestEligible")
    private Integer bestEligible = null;

    @ApiModelProperty(value = "")
    @JsonProperty("BestBidExch")
    @SerializedName("BestBidExch")
    private Integer bestBidExch = null;

    @ApiModelProperty(value = "")
    @JsonProperty("BestAskExch")
    @SerializedName("BestAskExch")
    private Integer bestAskExch = null;

    @ApiModelProperty(value = "")
    @JsonProperty("PreOpenBid")
    @SerializedName("PreOpenBid")
    private Integer preOpenBid = null;

    @ApiModelProperty(value = "")
    @JsonProperty("LastAttribs")
    @SerializedName("LastAttribs")
    private Integer lastAttribs = null;

    /**
     * Base time stamp for last update in format YYYYMMDD.
     **/
    @ApiModelProperty(value = "Base time stamp for last update in format YYYYMMDD")
    @JsonProperty("TimestampBase")
    @SerializedName("TimestampBase")
    private Integer timestampBase = null;

    @ApiModelProperty(value = "")
    @JsonProperty("TimestampDelta")
    @SerializedName("TimestampDelta")
    private Integer timestampDelta = null;

    @ApiModelProperty(value = "")
    @JsonProperty("LastExch")
    @SerializedName("LastExch")
    private Integer lastExch = null;

    @ApiModelProperty(value = "")
    @JsonProperty("CloseAttribs")
    @SerializedName("CloseAttribs")
    private Integer closeAttribs = null;

    /**
     * Last Price - The last price at which the contract traded. May contain one of the following prefixes:   * C -
     * Previous day's closing price.   * H - Trading has halted.
     *
     * @return v31
     **/
    @JsonProperty("31")
    @ApiModelProperty(
            value = "Last Price - The last price at which the contract traded."
                    + " May contain one of the following prefixes:"
                    + "   * C - Previous day's closing price."
                    + "   * H - Trading has halted. ")
    public String get31() {
        return v31;
    }

    public void set31(String v31) {
        this.v31 = v31;
    }

    /**
     * Market Data Availability. The field may contain three chars. First char defines: R = RealTime, D = Delayed, Z =
     * Frozen, Y = Frozen Delayed, N = Not Subscribed. Second char defines: P = Snapshot, p = Consolidated. Third char
     * defines: B = Book   * RealTime - Data is relayed back in real time without delay, market data subscription(s) are
     * required.   * Delayed - Data is relayed back 15-20 min delayed.   * Frozen - Last recorded data at market close,
     * relayed back in real time.   * Frozen Delayed - Last recorded data at market close, relayed back delayed.   * Not
     * Subscribed - User does not have the required market data subscription(s) to relay back either real time or
     * delayed data.   * Snapshot - Snapshot request is available for contract.   * Consolidated - Market data is
     * aggregated across multiple exchanges or venues.   * Book - Top of the book data is available for contract.
     *
     * @return v6509
     **/
    @JsonProperty("6509")
    @ApiModelProperty(
            value = "Market Data Availability. The field may contain three chars. First char defines:"
                    + " R = RealTime, D = Delayed, Z = Frozen, Y = Frozen Delayed, N = Not Subscribed."
                    + " Second char defines: P = Snapshot, p = Consolidated."
                    + " Third char defines: B = Book"
                    + "   * RealTime - Data is relayed back in real time without delay, market data subscription(s)"
                    + " are required."
                    + "   * Delayed - Data is relayed back 15-20 min delayed."
                    + "   * Frozen - Last recorded data at market close, relayed back in real time."
                    + "   * Frozen Delayed - Last recorded data at market close, relayed back delayed."
                    + "   * Not Subscribed - User does not have the required market data subscription(s) to relay back"
                    + " either real time or delayed data."
                    + "   * Snapshot - Snapshot request is available for contract."
                    + "   * Consolidated - Market data is aggregated across multiple exchanges or venues."
                    + "   * Book - Top of the book data is available for contract. ")
    public String get6509() {
        return v6509;
    }

    public void set6509(String v6509) {
        this.v6509 = v6509;
    }

    /**
     * High - Current day high price.
     *
     * @return v70
     **/
    @JsonProperty("70")
    @ApiModelProperty(value = "High - Current day high price")
    @Valid
    public BigDecimal get70() {
        return v70;
    }

    public void set70(BigDecimal v70) {
        this.v70 = v70;
    }

    /**
     * Ask Exch - Displays the exchange(s) offering the SMART price. A=AMEX, C=CBOE, I=ISE, X=PHLX, N=PSE, B=BOX,
     * Q=NASDAQOM, Z=BATS, W=CBOE2, T=NASDAQBX, M=MIAX, H=GEMINI, E=EDGX, J=MERCURY
     *
     * @return v7057
     **/
    @JsonProperty("7057")
    @ApiModelProperty(
            value = "Ask Exch - Displays the exchange(s) offering the SMART price. A=AMEX, C=CBOE, I=ISE, X=PHLX,"
                    + " N=PSE, B=BOX, Q=NASDAQOM, Z=BATS, W=CBOE2, T=NASDAQBX, M=MIAX, H=GEMINI, E=EDGX, J=MERCURY")
    public String get7057() {
        return v7057;
    }

    public void set7057(String v7057) {
        this.v7057 = v7057;
    }

    /**
     * Last Exch - Displays the exchange(s) offering the SMART price. A=AMEX, C=CBOE, I=ISE, X=PHLX, N=PSE, B=BOX,
     * Q=NASDAQOM, Z=BATS, W=CBOE2, T=NASDAQBX, M=MIAX, H=GEMINI, E=EDGX, J=MERCURY
     *
     * @return v7058
     **/
    @JsonProperty("7058")
    @ApiModelProperty(
            value = "Last Exch - Displays the exchange(s) offering the SMART price. A=AMEX, C=CBOE, I=ISE, X=PHLX,"
                    + " N=PSE, B=BOX, Q=NASDAQOM, Z=BATS, W=CBOE2, T=NASDAQBX, M=MIAX, H=GEMINI, E=EDGX, J=MERCURY")
    public String get7058() {
        return v7058;
    }

    public void set7058(String v7058) {
        this.v7058 = v7058;
    }

    /**
     * Last Size - The number of unites traded at the last price.
     *
     * @return v7059
     **/
    @JsonProperty("7059")
    @ApiModelProperty(value = "Last Size - The number of unites traded at the last price")
    @Valid
    public BigDecimal get7059() {
        return v7059;
    }

    public void set7059(BigDecimal v7059) {
        this.v7059 = v7059;
    }

    /**
     * Bid Exch - Displays the exchange(s) offering the SMART price. A=AMEX, C=CBOE, I=ISE, X=PHLX, N=PSE, B=BOX,
     * Q=NASDAQOM, Z=BATS, W=CBOE2, T=NASDAQBX, M=MIAX, H=GEMINI, E=EDGX, J=MERCURY
     *
     * @return v7068
     **/
    @JsonProperty("7068")
    @ApiModelProperty(
            value = "Bid Exch - Displays the exchange(s) offering the SMART price. A=AMEX, C=CBOE, I=ISE, X=PHLX,"
                    + " N=PSE, B=BOX, Q=NASDAQOM, Z=BATS, W=CBOE2, T=NASDAQBX, M=MIAX, H=GEMINI, E=EDGX, J=MERCURY")
    public String get7068() {
        return v7068;
    }

    public void set7068(String v7068) {
        this.v7068 = v7068;
    }

    /**
     * Low - Current day low price.
     *
     * @return v71
     **/
    @JsonProperty("71")
    @ApiModelProperty(value = "Low - Current day low price")
    @Valid
    public BigDecimal get71() {
        return v71;
    }

    public void set71(BigDecimal v71) {
        this.v71 = v71;
    }

    /**
     * IV Rank.
     *
     * @return v7195
     **/
    @JsonProperty("7195")
    @ApiModelProperty(value = "IV Rank")
    public String get7195() {
        return v7195;
    }

    public void set7195(String v7195) {
        this.v7195 = v7195;
    }

    /**
     * IV Rank.
     *
     * @return v7196
     **/
    @JsonProperty("7196")
    @ApiModelProperty(value = "IV Rank")
    public String get7196() {
        return v7196;
    }

    public void set7196(String v7196) {
        this.v7196 = v7196;
    }

    /**
     * IV Rank.
     *
     * @return v7197
     **/
    @JsonProperty("7197")
    @ApiModelProperty(value = "IV Rank")
    public String get7197() {
        return v7197;
    }

    public void set7197(String v7197) {
        this.v7197 = v7197;
    }

    /**
     * IV Percentile.
     *
     * @return v7198
     **/
    @JsonProperty("7198")
    @ApiModelProperty(value = "IV Percentile")
    public String get7198() {
        return v7198;
    }

    public void set7198(String v7198) {
        this.v7198 = v7198;
    }

    /**
     * IV Percentile.
     *
     * @return v7199
     **/
    @JsonProperty("7199")
    @ApiModelProperty(value = "IV Percentile")
    public String get7199() {
        return v7199;
    }

    public void set7199(String v7199) {
        this.v7199 = v7199;
    }

    /**
     * IV Percentile.
     *
     * @return v7200
     **/
    @JsonProperty("7200")
    @ApiModelProperty(value = "IV Percentile")
    public String get7200() {
        return v7200;
    }

    public void set7200(String v7200) {
        this.v7200 = v7200;
    }

    /**
     * IV High Low.
     *
     * @return v7201
     **/
    @JsonProperty("7201")
    @ApiModelProperty(value = "IV High Low")
    public String get7201() {
        return v7201;
    }

    public void set7201(String v7201) {
        this.v7201 = v7201;
    }

    /**
     * IV High Low.
     *
     * @return v7202
     **/
    @JsonProperty("7202")
    @ApiModelProperty(value = "IV High Low")
    public String get7202() {
        return v7202;
    }

    public void set7202(String v7202) {
        this.v7202 = v7202;
    }

    /**
     * IV High Low.
     *
     * @return v7203
     **/
    @JsonProperty("7203")
    @ApiModelProperty(value = "IV High Low")
    public String get7203() {
        return v7203;
    }

    public void set7203(String v7203) {
        this.v7203 = v7203;
    }

    /**
     * IV High Low.
     *
     * @return v7204
     **/
    @JsonProperty("7204")
    @ApiModelProperty(value = "IV High Low")
    public String get7204() {
        return v7204;
    }

    public void set7204(String v7204) {
        this.v7204 = v7204;
    }

    /**
     * IV High Low.
     *
     * @return v7205
     **/
    @JsonProperty("7205")
    @ApiModelProperty(value = "IV High Low")
    public String get7205() {
        return v7205;
    }

    public void set7205(String v7205) {
        this.v7205 = v7205;
    }

    /**
     * IV High Low.
     *
     * @return v7206
     **/
    @JsonProperty("7206")
    @ApiModelProperty(value = "IV High Low")
    public String get7206() {
        return v7206;
    }

    public void set7206(String v7206) {
        this.v7206 = v7206;
    }

    /**
     * HV Rank.
     *
     * @return v7207
     **/
    @JsonProperty("7207")
    @ApiModelProperty(value = "HV Rank")
    public String get7207() {
        return v7207;
    }

    public void set7207(String v7207) {
        this.v7207 = v7207;
    }

    /**
     * HV Rank.
     *
     * @return v7208
     **/
    @JsonProperty("7208")
    @ApiModelProperty(value = "HV Rank")
    public String get7208() {
        return v7208;
    }

    public void set7208(String v7208) {
        this.v7208 = v7208;
    }

    /**
     * HV Rank.
     *
     * @return v7209
     **/
    @JsonProperty("7209")
    @ApiModelProperty(value = "HV Rank")
    public String get7209() {
        return v7209;
    }

    public void set7209(String v7209) {
        this.v7209 = v7209;
    }

    /**
     * HV Percentile.
     *
     * @return v7210
     **/
    @JsonProperty("7210")
    @ApiModelProperty(value = "HV Percentile")
    public String get7210() {
        return v7210;
    }

    public void set7210(String v7210) {
        this.v7210 = v7210;
    }

    /**
     * HV Percentile.
     *
     * @return v7211
     **/
    @JsonProperty("7211")
    @ApiModelProperty(value = "HV Percentile")
    public String get7211() {
        return v7211;
    }

    public void set7211(String v7211) {
        this.v7211 = v7211;
    }

    /**
     * HV Percentile.
     *
     * @return v7212
     **/
    @JsonProperty("7212")
    @ApiModelProperty(value = "HV Percentile")
    public String get7212() {
        return v7212;
    }

    public void set7212(String v7212) {
        this.v7212 = v7212;
    }

    /**
     * HV High Low.
     *
     * @return v7245
     **/
    @JsonProperty("7245")
    @ApiModelProperty(value = "HV High Low")
    public String get7245() {
        return v7245;
    }

    public void set7245(String v7245) {
        this.v7245 = v7245;
    }

    /**
     * HV High Low.
     *
     * @return v7246
     **/
    @JsonProperty("7246")
    @ApiModelProperty(value = "HV High Low")
    public String get7246() {
        return v7246;
    }

    public void set7246(String v7246) {
        this.v7246 = v7246;
    }

    /**
     * HV High Low.
     *
     * @return v7247
     **/
    @JsonProperty("7247")
    @ApiModelProperty(value = "HV High Low")
    public String get7247() {
        return v7247;
    }

    public void set7247(String v7247) {
        this.v7247 = v7247;
    }

    /**
     * HV High Low.
     *
     * @return v7248
     **/
    @JsonProperty("7248")
    @ApiModelProperty(value = "HV High Low")
    public String get7248() {
        return v7248;
    }

    public void set7248(String v7248) {
        this.v7248 = v7248;
    }

    /**
     * HV High Low.
     *
     * @return v7249
     **/
    @JsonProperty("7249")
    @ApiModelProperty(value = "HV High Low")
    public String get7249() {
        return v7249;
    }

    public void set7249(String v7249) {
        this.v7249 = v7249;
    }

    /**
     * HV High Low.
     *
     * @return v7263
     **/
    @JsonProperty("7263")
    @ApiModelProperty(value = "HV High Low")
    public String get7263() {
        return v7263;
    }

    public void set7263(String v7263) {
        this.v7263 = v7263;
    }

    /**
     * ESG.
     *
     * @return v7264
     **/
    @JsonProperty("7264")
    @ApiModelProperty(value = "ESG")
    public String get7264() {
        return v7264;
    }

    public void set7264(String v7264) {
        this.v7264 = v7264;
    }

    /**
     * ESG.
     *
     * @return v7265
     **/
    @JsonProperty("7265")
    @ApiModelProperty(value = "ESG")
    public String get7265() {
        return v7265;
    }

    public void set7265(String v7265) {
        this.v7265 = v7265;
    }

    /**
     * ESG.
     *
     * @return v7266
     **/
    @JsonProperty("7266")
    @ApiModelProperty(value = "ESG")
    public String get7266() {
        return v7266;
    }

    public void set7266(String v7266) {
        this.v7266 = v7266;
    }

    /**
     * ESG.
     *
     * @return v7267
     **/
    @JsonProperty("7267")
    @ApiModelProperty(value = "ESG")
    public String get7267() {
        return v7267;
    }

    public void set7267(String v7267) {
        this.v7267 = v7267;
    }

    /**
     * ESG.
     *
     * @return v7268
     **/
    @JsonProperty("7268")
    @ApiModelProperty(value = "ESG")
    public String get7268() {
        return v7268;
    }

    public void set7268(String v7268) {
        this.v7268 = v7268;
    }

    /**
     * ESG.
     *
     * @return v7269
     **/
    @JsonProperty("7269")
    @ApiModelProperty(value = "ESG")
    public String get7269() {
        return v7269;
    }

    public void set7269(String v7269) {
        this.v7269 = v7269;
    }

    /**
     * ESG.
     *
     * @return v7271
     **/
    @JsonProperty("7271")
    @ApiModelProperty(value = "ESG")
    public String get7271() {
        return v7271;
    }

    public void set7271(String v7271) {
        this.v7271 = v7271;
    }

    /**
     * ESG.
     *
     * @return v7272
     **/
    @JsonProperty("7272")
    @ApiModelProperty(value = "ESG")
    public String get7272() {
        return v7272;
    }

    public void set7272(String v7272) {
        this.v7272 = v7272;
    }

    /**
     * ESG.
     *
     * @return v7273
     **/
    @JsonProperty("7273")
    @ApiModelProperty(value = "ESG")
    public String get7273() {
        return v7273;
    }

    public void set7273(String v7273) {
        this.v7273 = v7273;
    }

    /**
     * ESG.
     *
     * @return v7274
     **/
    @JsonProperty("7274")
    @ApiModelProperty(value = "ESG")
    public String get7274() {
        return v7274;
    }

    public void set7274(String v7274) {
        this.v7274 = v7274;
    }

    /**
     * ESG.
     *
     * @return v7275
     **/
    @JsonProperty("7275")
    @ApiModelProperty(value = "ESG")
    public String get7275() {
        return v7275;
    }

    public void set7275(String v7275) {
        this.v7275 = v7275;
    }

    /**
     * ESG.
     *
     * @return v7276
     **/
    @JsonProperty("7276")
    @ApiModelProperty(value = "ESG")
    public String get7276() {
        return v7276;
    }

    public void set7276(String v7276) {
        this.v7276 = v7276;
    }

    /**
     * ESG.
     *
     * @return v7277
     **/
    @JsonProperty("7277")
    @ApiModelProperty(value = "ESG")
    public String get7277() {
        return v7277;
    }

    public void set7277(String v7277) {
        this.v7277 = v7277;
    }

    /**
     * Average Volume - The average daily trading volume over 90 days.
     *
     * @return v7282
     **/
    @JsonProperty("7282")
    @ApiModelProperty(value = "Average Volume - The average daily trading volume over 90 days.")
    public String get7282() {
        return v7282;
    }

    public void set7282(String v7282) {
        this.v7282 = v7282;
    }

    /**
     * Option Implied Vol. % - A prediction of how volatile an underlying will be in the future. At the market
     * volatility estimated for a maturity thirty calendar days forward of the current trading day, and based on option
     * prices from two consecutive expiration months.
     *
     * @return v7283
     **/
    @JsonProperty("7283")
    @ApiModelProperty(
            value = "Option Implied Vol. % - A prediction of how volatile an underlying will be in the future."
                    + " At the market volatility estimated for a maturity thirty calendar days forward of the"
                    + " current trading day, and based on option prices from two consecutive expiration months.")
    public String get7283() {
        return v7283;
    }

    public void set7283(String v7283) {
        this.v7283 = v7283;
    }

    /**
     * Historic Volume (30d).
     *
     * @return v7284
     **/
    @JsonProperty("7284")
    @ApiModelProperty(value = "Historic Volume (30d)")
    public String get7284() {
        return v7284;
    }

    public void set7284(String v7284) {
        this.v7284 = v7284;
    }

    /**
     * Dividend Amount - Displays the amount of the next dividend.
     *
     * @return v7286
     **/
    @JsonProperty("7286")
    @ApiModelProperty(value = "Dividend Amount - Displays the amount of the next dividend.")
    @Valid
    public BigDecimal get7286() {
        return v7286;
    }

    public void set7286(BigDecimal v7286) {
        this.v7286 = v7286;
    }

    /**
     * Dividend Yield % - This value is the toal of the expected dividend payments over the next twelve months per share
     * divided by the Current Price and is expressed as a percentage. For derivatives, this displays the total of the
     * expected dividend payments over the expiry date.
     *
     * @return v7287
     **/
    @JsonProperty("7287")
    @ApiModelProperty(
            value = "Dividend Yield % - This value is the toal of the expected dividend payments over the next twelve"
                    + " months per share divided by the Current Price and is expressed as a percentage."
                    + " For derivatives, this displays the total of the expected dividend payments over the"
                    + " expiry date. ")
    public String get7287() {
        return v7287;
    }

    public void set7287(String v7287) {
        this.v7287 = v7287;
    }

    /**
     * Ex-date of the dividend.
     *
     * @return v7288
     **/
    @JsonProperty("7288")
    @ApiModelProperty(value = "Ex-date of the dividend")
    public String get7288() {
        return v7288;
    }

    public void set7288(String v7288) {
        this.v7288 = v7288;
    }

    /**
     * Market Cap.
     *
     * @return v7289
     **/
    @JsonProperty("7289")
    @ApiModelProperty(value = "Market Cap")
    public String get7289() {
        return v7289;
    }

    public void set7289(String v7289) {
        this.v7289 = v7289;
    }

    /**
     * P/E.
     *
     * @return v7290
     **/
    @JsonProperty("7290")
    @ApiModelProperty(value = "P/E")
    public String get7290() {
        return v7290;
    }

    public void set7290(String v7290) {
        this.v7290 = v7290;
    }

    /**
     * 52 Week High - The highest price for the past 52 weeks.
     *
     * @return v7293
     **/
    @JsonProperty("7293")
    @ApiModelProperty(value = "52 Week High - The highest price for the past 52 weeks.")
    public String get7293() {
        return v7293;
    }

    public void set7293(String v7293) {
        this.v7293 = v7293;
    }

    /**
     * 52 Week Low - The lowest price for the past 52 weeks.
     *
     * @return v7294
     **/
    @JsonProperty("7294")
    @ApiModelProperty(value = "52 Week Low - The lowest price for the past 52 weeks.")
    public String get7294() {
        return v7294;
    }

    public void set7294(String v7294) {
        this.v7294 = v7294;
    }

    /**
     * Open - Today's opening price.
     *
     * @return v7295
     **/
    @JsonProperty("7295")
    @ApiModelProperty(value = "Open - Today's opening price.")
    @Valid
    public BigDecimal get7295() {
        return v7295;
    }

    public void set7295(BigDecimal v7295) {
        this.v7295 = v7295;
    }

    /**
     * Close - Today's closing price.
     *
     * @return v7296
     **/
    @JsonProperty("7296")
    @ApiModelProperty(value = "Close - Today's closing price.")
    @Valid
    public BigDecimal get7296() {
        return v7296;
    }

    public void set7296(BigDecimal v7296) {
        this.v7296 = v7296;
    }

    /**
     * Reuters Fundamentals.
     *
     * @return v7331
     **/
    @JsonProperty("7331")
    @ApiModelProperty(value = "Reuters Fundamentals")
    public String get7331() {
        return v7331;
    }

    public void set7331(String v7331) {
        this.v7331 = v7331;
    }

    /**
     * ESG.
     *
     * @return v7370
     **/
    @JsonProperty("7370")
    @ApiModelProperty(value = "ESG")
    public String get7370() {
        return v7370;
    }

    public void set7370(String v7370) {
        this.v7370 = v7370;
    }

    /**
     * ESG.
     *
     * @return v7371
     **/
    @JsonProperty("7371")
    @ApiModelProperty(value = "ESG")
    public String get7371() {
        return v7371;
    }

    public void set7371(String v7371) {
        this.v7371 = v7371;
    }

    /**
     * ESG.
     *
     * @return v7372
     **/
    @JsonProperty("7372")
    @ApiModelProperty(value = "ESG")
    public String get7372() {
        return v7372;
    }

    public void set7372(String v7372) {
        this.v7372 = v7372;
    }

    /**
     * Mark - The mark price is, the ask price if ask is less than last price, the bid price if bid is more than the
     * last price, otherwise it's equal to last price.
     *
     * @return v7635
     **/
    @JsonProperty("7635")
    @ApiModelProperty(
            value = "Mark - The mark price is, the ask price if ask is less than last price, the bid price if bid"
                    + " is more than the last price, otherwise it's equal to last price")
    public String get7635() {
        return v7635;
    }

    public void set7635(String v7635) {
        this.v7635 = v7635;
    }

    /**
     * shortable invetory.
     *
     * @return v7636
     **/
    @JsonProperty("7636")
    @ApiModelProperty(value = "shortable invetory")
    @Valid
    public BigDecimal get7636() {
        return v7636;
    }

    public void set7636(BigDecimal v7636) {
        this.v7636 = v7636;
    }

    /**
     * Fee rebate rate.
     *
     * @return v7637
     **/
    @JsonProperty("7637")
    @ApiModelProperty(value = "Fee rebate rate")
    public String get7637() {
        return v7637;
    }

    public void set7637(String v7637) {
        this.v7637 = v7637;
    }

    /**
     * Shortable - Describes the level of difficulty with which the security can be sold short.
     *
     * @return v7644
     **/
    @JsonProperty("7644")
    @ApiModelProperty(
            value = "Shortable - Describes the level of difficulty with which the security can be sold short.")
    public String get7644() {
        return v7644;
    }

    public void set7644(String v7644) {
        this.v7644 = v7644;
    }

    /**
     * EMA(200) - Exponential moving average (N=200).
     *
     * @return v7674
     **/
    @JsonProperty("7674")
    @ApiModelProperty(value = "EMA(200) - Exponential moving average (N=200).")
    public String get7674() {
        return v7674;
    }

    public void set7674(String v7674) {
        this.v7674 = v7674;
    }

    /**
     * EMA(100) - Exponential moving average (N=100).
     *
     * @return v7675
     **/
    @JsonProperty("7675")
    @ApiModelProperty(value = "EMA(100) - Exponential moving average (N=100).")
    public String get7675() {
        return v7675;
    }

    public void set7675(String v7675) {
        this.v7675 = v7675;
    }

    /**
     * EMA(50) - Exponential moving average (N=50).
     *
     * @return v7676
     **/
    @JsonProperty("7676")
    @ApiModelProperty(value = "EMA(50) - Exponential moving average (N=50).")
    public String get7676() {
        return v7676;
    }

    public void set7676(String v7676) {
        this.v7676 = v7676;
    }

    /**
     * EMA(20) - Exponential moving average (N=20).
     *
     * @return v7677
     **/
    @JsonProperty("7677")
    @ApiModelProperty(value = "EMA(20) - Exponential moving average (N=20).")
    public String get7677() {
        return v7677;
    }

    public void set7677(String v7677) {
        this.v7677 = v7677;
    }

    /**
     * Price/EMA(20) - Price to Exponential moving average (N=20) ratio -1, displayed in percents.
     *
     * @return v7681
     **/
    @JsonProperty("7681")
    @ApiModelProperty(
            value = "Price/EMA(20) - Price to Exponential moving average (N=20) ratio -1, displayed in percents.")
    public String get7681() {
        return v7681;
    }

    public void set7681(String v7681) {
        this.v7681 = v7681;
    }

    /**
     * Last Yield - Implied yield of the bond if it is purchased at the current last price. Last yield is calculated
     * using the Last price on all possible call dates. It is assumed that prepayment occurs if the bond has call or put
     * provisions and the issuer can offer a lower coupon rate based on current market rates. The yield to worst will be
     * the lowest of the yield to maturity or yield to call (if the bond has prepayment provisions). Yield to worse may
     * be the same as yield to maturity but never higher.
     *
     * @return v7698
     **/
    @JsonProperty("7698")
    @ApiModelProperty(
            value = "Last Yield - Implied yield of the bond if it is purchased at the current last price. Last yield"
                    + " is calculated using the Last price on all possible call dates. It is assumed that prepayment"
                    + " occurs if the bond has call or put provisions and the issuer can offer a lower coupon rate"
                    + " based on current market rates. The yield to worst will be the lowest of the yield to maturity"
                    + " or yield to call (if the bond has prepayment provisions). Yield to worse may be the same as"
                    + " yield to maturity but never higher. ")
    public String get7698() {
        return v7698;
    }

    public void set7698(String v7698) {
        this.v7698 = v7698;
    }

    /**
     * Bid Yield - Implied yield of the bond if it is purchased at the current bid price. Bid yield is calculated using
     * the Ask on all possible call dates. It is assumed that prepayment occurs if the bond has call or put provisions
     * and the issuer can offer a lower coupon rate based on current market rates. The yield to worst will be the lowest
     * of the yield to maturity or yield to call (if the bond has prepayment provisions). Yield to worse may be the same
     * as yield to maturity but never higher.
     *
     * @return v7699
     **/
    @JsonProperty("7699")
    @ApiModelProperty(
            value = "Bid Yield - Implied yield of the bond if it is purchased at the current bid price. Bid yield"
                    + " is calculated using the Ask on all possible call dates. It is assumed that prepayment occurs"
                    + " if the bond has call or put provisions and the issuer can offer a lower coupon rate based on"
                    + " current market rates. The yield to worst will be the lowest of the yield to maturity or yield"
                    + " to call (if the bond has prepayment provisions). Yield to worse may be the same as yield to"
                    + " maturity but never higher. ")
    public String get7699() {
        return v7699;
    }

    public void set7699(String v7699) {
        this.v7699 = v7699;
    }

    /**
     * Beta - Beta is against standard index.
     *
     * @return v7718
     **/
    @JsonProperty("7718")
    @ApiModelProperty(value = "Beta - Beta is against standard index.")
    public String get7718() {
        return v7718;
    }

    public void set7718(String v7718) {
        this.v7718 = v7718;
    }

    /**
     * Ask Yield - Implied yield of the bond if it is purchased at the current offer. Ask yield is calculated using the
     * Bid on all possible call dates. It is assumed that prepayment occurs if the bond has call or put provisions and
     * the issuer can offer a lower coupon rate based on current market rates. The yield to worst will be the lowest of
     * the yield to maturity or yield to call (if the bond has prepayment provisions). Yield to worse may be the same as
     * yield to maturity but never higher.
     *
     * @return v7720
     **/
    @JsonProperty("7720")
    @ApiModelProperty(
            value = "Ask Yield - Implied yield of the bond if it is purchased at the current offer."
                    + " Ask yield is calculated using the Bid on all possible call dates. It is assumed that"
                    + " prepayment occurs if the bond has call or put provisions and the issuer can offer a lower"
                    + " coupon rate based on current market rates. The yield to worst will be the lowest of the"
                    + " yield to maturity or yield to call (if the bond has prepayment provisions). Yield to worse"
                    + " may be the same as yield to maturity but never higher. ")
    public String get7720() {
        return v7720;
    }

    public void set7720(String v7720) {
        this.v7720 = v7720;
    }

    /**
     * Reuters Fundamentals.
     *
     * @return v7743
     **/
    @JsonProperty("7743")
    @ApiModelProperty(value = "Reuters Fundamentals")
    public String get7743() {
        return v7743;
    }

    public void set7743(String v7743) {
        this.v7743 = v7743;
    }

    /**
     * ESG.
     *
     * @return v7761
     **/
    @JsonProperty("7761")
    @ApiModelProperty(value = "ESG")
    public String get7761() {
        return v7761;
    }

    public void set7761(String v7761) {
        this.v7761 = v7761;
    }

    /**
     * 26 Week High - The highest price for the past 26 weeks.
     *
     * @return v7992
     **/
    @JsonProperty("7992")
    @ApiModelProperty(value = "26 Week High - The highest price for the past 26 weeks.")
    public String get7992() {
        return v7992;
    }

    public void set7992(String v7992) {
        this.v7992 = v7992;
    }

    /**
     * 26 Week Low - The lowest price for the past 26 weeks.
     *
     * @return v7993
     **/
    @JsonProperty("7993")
    @ApiModelProperty(value = "26 Week Low - The lowest price for the past 26 weeks.")
    public String get7993() {
        return v7993;
    }

    public void set7993(String v7993) {
        this.v7993 = v7993;
    }

    /**
     * 13 Week High - The highest price for the past 13 weeks.
     *
     * @return v7994
     **/
    @JsonProperty("7994")
    @ApiModelProperty(value = "13 Week High - The highest price for the past 13 weeks.")
    public String get7994() {
        return v7994;
    }

    public void set7994(String v7994) {
        this.v7994 = v7994;
    }

    /**
     * 13 Week Low - The lowest price for the past 13 weeks.
     *
     * @return v7995
     **/
    @JsonProperty("7995")
    @ApiModelProperty(value = "13 Week Low - The lowest price for the past 13 weeks.")
    public String get7995() {
        return v7995;
    }

    public void set7995(String v7995) {
        this.v7995 = v7995;
    }

    /**
     * Change - The difference between the last price and the close on the previous trading day.
     *
     * @return v82
     **/
    @JsonProperty("82")
    @ApiModelProperty(
            value = "Change - The difference between the last price and the close on the previous trading day")
    public String get82() {
        return v82;
    }

    public void set82(String v82) {
        this.v82 = v82;
    }

    /**
     * Change % - The difference between the last price and the close on the previous trading day in percentage.
     *
     * @return v83
     **/
    @JsonProperty("83")
    @ApiModelProperty(
            value = "Change % - The difference between the last price and the close on the previous trading"
                    + " day in percentage.")
    @Valid
    public BigDecimal get83() {
        return v83;
    }

    public void set83(BigDecimal v83) {
        this.v83 = v83;
    }

    /**
     * Bid Price - The highest-priced bid on the contract.
     *
     * @return v84
     **/
    @JsonProperty("84")
    @ApiModelProperty(value = "Bid Price - The highest-priced bid on the contract.")
    public String get84() {
        return v84;
    }

    public void set84(String v84) {
        this.v84 = v84;
    }

    /**
     * Ask Size - The number of contracts or shares offered at the ask price. For US stocks, the number displayed is
     * divided by 100.
     *
     * @return v85
     **/
    @JsonProperty("85")
    @ApiModelProperty(
            value = "Ask Size - The number of contracts or shares offered at the ask price."
                    + " For US stocks, the number displayed is divided by 100.")
    public String get85() {
        return v85;
    }

    public void set85(String v85) {
        this.v85 = v85;
    }

    /**
     * Ask Price - The lowest-priced offer on the contract.
     *
     * @return v86
     **/
    @JsonProperty("86")
    @ApiModelProperty(value = "Ask Price - The lowest-priced offer on the contract.")
    public String get86() {
        return v86;
    }

    public void set86(String v86) {
        this.v86 = v86;
    }

    /**
     * Volume - Volume for the day, formatted with 'K' for thousands or 'M' for millions. For higher precision volume
     * refer to field 7762.
     *
     * @return v87
     **/
    @JsonProperty("87")
    @ApiModelProperty(
            value = "Volume - Volume for the day, formatted with 'K' for thousands or 'M' for millions."
                    + " For higher precision volume refer to field 7762.")
    public String get87() {
        return v87;
    }

    public void set87(String v87) {
        this.v87 = v87;
    }

    /**
     * Bid Size - The number of contracts or shares bid for at the bid price. For US stocks, the number displayed is
     * divided by 100.
     *
     * @return v88
     **/
    @JsonProperty("88")
    @ApiModelProperty(
            value = "Bid Size - The number of contracts or shares bid for at the bid price. For US stocks,"
                    + " the number displayed is divided by 100.")
    public String get88() {
        return v88;
    }

    public void set88(String v88) {
        this.v88 = v88;
    }

    /**
     * Color for Best Bid/Offer Exchange in hex code.
     *
     * @return bboExchange
     **/
    @JsonProperty("BboExchange")
    @ApiModelProperty(value = "Color for Best Bid/Offer Exchange in hex code")
    public String getBboExchange() {
        return bboExchange;
    }

    public void setBboExchange(String bboExchange) {
        this.bboExchange = bboExchange;
    }

    /**
     * Get bestAskExch.
     *
     * @return bestAskExch
     **/
    @JsonProperty("BestAskExch")
    @ApiModelProperty(value = "")
    public Integer getBestAskExch() {
        return bestAskExch;
    }

    public void setBestAskExch(Integer bestAskExch) {
        this.bestAskExch = bestAskExch;
    }

    /**
     * Get bestBidExch.
     *
     * @return bestBidExch
     **/
    @JsonProperty("BestBidExch")
    @ApiModelProperty(value = "")
    public Integer getBestBidExch() {
        return bestBidExch;
    }

    public void setBestBidExch(Integer bestBidExch) {
        this.bestBidExch = bestBidExch;
    }

    /**
     * Get bestEligible.
     *
     * @return bestEligible
     **/
    @JsonProperty("BestEligible")
    @ApiModelProperty(value = "")
    public Integer getBestEligible() {
        return bestEligible;
    }

    public void setBestEligible(Integer bestEligible) {
        this.bestEligible = bestEligible;
    }

    /**
     * Get closeAttribs.
     *
     * @return closeAttribs
     **/
    @JsonProperty("CloseAttribs")
    @ApiModelProperty(value = "")
    public Integer getCloseAttribs() {
        return closeAttribs;
    }

    public void setCloseAttribs(Integer closeAttribs) {
        this.closeAttribs = closeAttribs;
    }

    /**
     * IBKR Contract identifier.
     *
     * @return conid
     **/
    @JsonProperty("conid")
    @ApiModelProperty(value = "IBKR Contract identifier")
    public Integer getConid() {
        return conid;
    }

    public void setConid(Integer conid) {
        this.conid = conid;
    }

    /**
     * Get lastAttribs.
     *
     * @return lastAttribs
     **/
    @JsonProperty("LastAttribs")
    @ApiModelProperty(value = "")
    public Integer getLastAttribs() {
        return lastAttribs;
    }

    public void setLastAttribs(Integer lastAttribs) {
        this.lastAttribs = lastAttribs;
    }

    /**
     * Get lastExch.
     *
     * @return lastExch
     **/
    @JsonProperty("LastExch")
    @ApiModelProperty(value = "")
    public Integer getLastExch() {
        return lastExch;
    }

    public void setLastExch(Integer lastExch) {
        this.lastExch = lastExch;
    }

    /**
     * minimum price increment.
     *
     * @return minTick
     **/
    @JsonProperty("minTick")
    @ApiModelProperty(value = "minimum price increment")
    @Valid
    public BigDecimal getMinTick() {
        return minTick;
    }

    public void setMinTick(BigDecimal minTick) {
        this.minTick = minTick;
    }

    /**
     * Get preOpenBid.
     *
     * @return preOpenBid
     **/
    @JsonProperty("PreOpenBid")
    @ApiModelProperty(value = "")
    public Integer getPreOpenBid() {
        return preOpenBid;
    }

    public void setPreOpenBid(Integer preOpenBid) {
        this.preOpenBid = preOpenBid;
    }

    /**
     * minimum size increment.
     *
     * @return sizeMinTick
     **/
    @JsonProperty("sizeMinTick")
    @ApiModelProperty(value = "minimum size increment")
    public Integer getSizeMinTick() {
        return sizeMinTick;
    }

    public void setSizeMinTick(Integer sizeMinTick) {
        this.sizeMinTick = sizeMinTick;
    }

    /**
     * Base time stamp for last update in format YYYYMMDD.
     *
     * @return timestampBase
     **/
    @JsonProperty("TimestampBase")
    @ApiModelProperty(value = "Base time stamp for last update in format YYYYMMDD")
    public Integer getTimestampBase() {
        return timestampBase;
    }

    public void setTimestampBase(Integer timestampBase) {
        this.timestampBase = timestampBase;
    }

    /**
     * Get timestampDelta.
     *
     * @return timestampDelta
     **/
    @JsonProperty("TimestampDelta")
    @ApiModelProperty(value = "")
    public Integer getTimestampDelta() {
        return timestampDelta;
    }

    public void setTimestampDelta(Integer timestampDelta) {
        this.timestampDelta = timestampDelta;
    }

    public void setHasDelayed(Boolean hasDelayed) {
        this.hasDelayed = hasDelayed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(v31, v70, v71, v82, v83, v84, v85, v86, v87, v88, v6509, v7057, v7058, v7059, v7068, v7195,
                v7196, v7197, v7198, v7199, v7200, v7201, v7202, v7203, v7204, v7205, v7206, v7207, v7208, v7209, v7210,
                v7211, v7212, v7245, v7246, v7247, v7248, v7249, v7263, v7264, v7265, v7266, v7267, v7268, v7269, v7271,
                v7272, v7273, v7274, v7275, v7276, v7277, v7282, v7283, v7284, v7286, v7287, v7288, v7289, v7290, v7293,
                v7294, v7295, v7296, v7331, v7370, v7371, v7372, v7635, v7636, v7637, v7644, v7674, v7675, v7676, v7677,
                v7681, v7698, v7699, v7718, v7720, v7743, v7761, v7992, v7993, v7994, v7995, conid, minTick,
                bboExchange, hasDelayed, sizeMinTick, bestEligible, bestBidExch, bestAskExch, preOpenBid, lastAttribs,
                timestampBase, timestampDelta, lastExch, closeAttribs);
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MarketData marketData = (MarketData) o;
        return Objects.equals(this.v31, marketData.v31) && Objects.equals(this.v70, marketData.v70) && Objects.equals(
                this.v71, marketData.v71) && Objects.equals(this.v82, marketData.v82) && Objects.equals(this.v83,
                marketData.v83) && Objects.equals(this.v84, marketData.v84) && Objects.equals(this.v85, marketData.v85)
                && Objects.equals(this.v86, marketData.v86) && Objects.equals(this.v87, marketData.v87)
                && Objects.equals(this.v88, marketData.v88) && Objects.equals(this.v6509, marketData.v6509)
                && Objects.equals(this.v7057, marketData.v7057) && Objects.equals(this.v7058, marketData.v7058)
                && Objects.equals(this.v7059, marketData.v7059) && Objects.equals(this.v7068, marketData.v7068)
                && Objects.equals(this.v7195, marketData.v7195) && Objects.equals(this.v7196, marketData.v7196)
                && Objects.equals(this.v7197, marketData.v7197) && Objects.equals(this.v7198, marketData.v7198)
                && Objects.equals(this.v7199, marketData.v7199) && Objects.equals(this.v7200, marketData.v7200)
                && Objects.equals(this.v7201, marketData.v7201) && Objects.equals(this.v7202, marketData.v7202)
                && Objects.equals(this.v7203, marketData.v7203) && Objects.equals(this.v7204, marketData.v7204)
                && Objects.equals(this.v7205, marketData.v7205) && Objects.equals(this.v7206, marketData.v7206)
                && Objects.equals(this.v7207, marketData.v7207) && Objects.equals(this.v7208, marketData.v7208)
                && Objects.equals(this.v7209, marketData.v7209) && Objects.equals(this.v7210, marketData.v7210)
                && Objects.equals(this.v7211, marketData.v7211) && Objects.equals(this.v7212, marketData.v7212)
                && Objects.equals(this.v7245, marketData.v7245) && Objects.equals(this.v7246, marketData.v7246)
                && Objects.equals(this.v7247, marketData.v7247) && Objects.equals(this.v7248, marketData.v7248)
                && Objects.equals(this.v7249, marketData.v7249) && Objects.equals(this.v7263, marketData.v7263)
                && Objects.equals(this.v7264, marketData.v7264) && Objects.equals(this.v7265, marketData.v7265)
                && Objects.equals(this.v7266, marketData.v7266) && Objects.equals(this.v7267, marketData.v7267)
                && Objects.equals(this.v7268, marketData.v7268) && Objects.equals(this.v7269, marketData.v7269)
                && Objects.equals(this.v7271, marketData.v7271) && Objects.equals(this.v7272, marketData.v7272)
                && Objects.equals(this.v7273, marketData.v7273) && Objects.equals(this.v7274, marketData.v7274)
                && Objects.equals(this.v7275, marketData.v7275) && Objects.equals(this.v7276, marketData.v7276)
                && Objects.equals(this.v7277, marketData.v7277) && Objects.equals(this.v7282, marketData.v7282)
                && Objects.equals(this.v7283, marketData.v7283) && Objects.equals(this.v7284, marketData.v7284)
                && Objects.equals(this.v7286, marketData.v7286) && Objects.equals(this.v7287, marketData.v7287)
                && Objects.equals(this.v7288, marketData.v7288) && Objects.equals(this.v7289, marketData.v7289)
                && Objects.equals(this.v7290, marketData.v7290) && Objects.equals(this.v7293, marketData.v7293)
                && Objects.equals(this.v7294, marketData.v7294) && Objects.equals(this.v7295, marketData.v7295)
                && Objects.equals(this.v7296, marketData.v7296) && Objects.equals(this.v7331, marketData.v7331)
                && Objects.equals(this.v7370, marketData.v7370) && Objects.equals(this.v7371, marketData.v7371)
                && Objects.equals(this.v7372, marketData.v7372) && Objects.equals(this.v7635, marketData.v7635)
                && Objects.equals(this.v7636, marketData.v7636) && Objects.equals(this.v7637, marketData.v7637)
                && Objects.equals(this.v7644, marketData.v7644) && Objects.equals(this.v7674, marketData.v7674)
                && Objects.equals(this.v7675, marketData.v7675) && Objects.equals(this.v7676, marketData.v7676)
                && Objects.equals(this.v7677, marketData.v7677) && Objects.equals(this.v7681, marketData.v7681)
                && Objects.equals(this.v7698, marketData.v7698) && Objects.equals(this.v7699, marketData.v7699)
                && Objects.equals(this.v7718, marketData.v7718) && Objects.equals(this.v7720, marketData.v7720)
                && Objects.equals(this.v7743, marketData.v7743) && Objects.equals(this.v7761, marketData.v7761)
                && Objects.equals(this.v7992, marketData.v7992) && Objects.equals(this.v7993, marketData.v7993)
                && Objects.equals(this.v7994, marketData.v7994) && Objects.equals(this.v7995, marketData.v7995)
                && Objects.equals(this.conid, marketData.conid) && Objects.equals(this.minTick, marketData.minTick)
                && Objects.equals(this.bboExchange, marketData.bboExchange) && Objects.equals(this.hasDelayed,
                marketData.hasDelayed) && Objects.equals(this.sizeMinTick, marketData.sizeMinTick) && Objects.equals(
                this.bestEligible, marketData.bestEligible) && Objects.equals(this.bestBidExch, marketData.bestBidExch)
                && Objects.equals(this.bestAskExch, marketData.bestAskExch) && Objects.equals(this.preOpenBid,
                marketData.preOpenBid) && Objects.equals(this.lastAttribs, marketData.lastAttribs) && Objects.equals(
                this.timestampBase, marketData.timestampBase) && Objects.equals(this.timestampDelta,
                marketData.timestampDelta) && Objects.equals(this.lastExch, marketData.lastExch) && Objects.equals(
                this.closeAttribs, marketData.closeAttribs);
    }

    @Override
    public String toString() {

        String sb = "class MarketData {\n" + "    v31: " + toIndentedString(v31) + "\n" + "    v70: "
                + toIndentedString(v70) + "\n" + "    v71: " + toIndentedString(v71) + "\n" + "    v82: "
                + toIndentedString(v82) + "\n" + "    v83: " + toIndentedString(v83) + "\n" + "    v84: "
                + toIndentedString(v84) + "\n" + "    v85: " + toIndentedString(v85) + "\n" + "    v86: "
                + toIndentedString(v86) + "\n" + "    v87: " + toIndentedString(v87) + "\n" + "    v88: "
                + toIndentedString(v88) + "\n" + "    v6509: " + toIndentedString(v6509) + "\n" + "    v7057: "
                + toIndentedString(v7057) + "\n" + "    v7058: " + toIndentedString(v7058) + "\n" + "    v7059: "
                + toIndentedString(v7059) + "\n" + "    v7068: " + toIndentedString(v7068) + "\n" + "    v7195: "
                + toIndentedString(v7195) + "\n" + "    v7196: " + toIndentedString(v7196) + "\n" + "    v7197: "
                + toIndentedString(v7197) + "\n" + "    v7198: " + toIndentedString(v7198) + "\n" + "    v7199: "
                + toIndentedString(v7199) + "\n" + "    v7200: " + toIndentedString(v7200) + "\n" + "    v7201: "
                + toIndentedString(v7201) + "\n" + "    v7202: " + toIndentedString(v7202) + "\n" + "    v7203: "
                + toIndentedString(v7203) + "\n" + "    v7204: " + toIndentedString(v7204) + "\n" + "    v7205: "
                + toIndentedString(v7205) + "\n" + "    v7206: " + toIndentedString(v7206) + "\n" + "    v7207: "
                + toIndentedString(v7207) + "\n" + "    v7208: " + toIndentedString(v7208) + "\n" + "    v7209: "
                + toIndentedString(v7209) + "\n" + "    v7210: " + toIndentedString(v7210) + "\n" + "    v7211: "
                + toIndentedString(v7211) + "\n" + "    v7212: " + toIndentedString(v7212) + "\n" + "    v7245: "
                + toIndentedString(v7245) + "\n" + "    v7246: " + toIndentedString(v7246) + "\n" + "    v7247: "
                + toIndentedString(v7247) + "\n" + "    v7248: " + toIndentedString(v7248) + "\n" + "    v7249: "
                + toIndentedString(v7249) + "\n" + "    v7263: " + toIndentedString(v7263) + "\n" + "    v7264: "
                + toIndentedString(v7264) + "\n" + "    v7265: " + toIndentedString(v7265) + "\n" + "    v7266: "
                + toIndentedString(v7266) + "\n" + "    v7267: " + toIndentedString(v7267) + "\n" + "    v7268: "
                + toIndentedString(v7268) + "\n" + "    v7269: " + toIndentedString(v7269) + "\n" + "    v7271: "
                + toIndentedString(v7271) + "\n" + "    v7272: " + toIndentedString(v7272) + "\n" + "    v7273: "
                + toIndentedString(v7273) + "\n" + "    v7274: " + toIndentedString(v7274) + "\n" + "    v7275: "
                + toIndentedString(v7275) + "\n" + "    v7276: " + toIndentedString(v7276) + "\n" + "    v7277: "
                + toIndentedString(v7277) + "\n" + "    v7282: " + toIndentedString(v7282) + "\n" + "    v7283: "
                + toIndentedString(v7283) + "\n" + "    v7284: " + toIndentedString(v7284) + "\n" + "    v7286: "
                + toIndentedString(v7286) + "\n" + "    v7287: " + toIndentedString(v7287) + "\n" + "    v7288: "
                + toIndentedString(v7288) + "\n" + "    v7289: " + toIndentedString(v7289) + "\n" + "    v7290: "
                + toIndentedString(v7290) + "\n" + "    v7293: " + toIndentedString(v7293) + "\n" + "    v7294: "
                + toIndentedString(v7294) + "\n" + "    v7295: " + toIndentedString(v7295) + "\n" + "    v7296: "
                + toIndentedString(v7296) + "\n" + "    v7331: " + toIndentedString(v7331) + "\n" + "    v7370: "
                + toIndentedString(v7370) + "\n" + "    v7371: " + toIndentedString(v7371) + "\n" + "    v7372: "
                + toIndentedString(v7372) + "\n" + "    v7635: " + toIndentedString(v7635) + "\n" + "    v7636: "
                + toIndentedString(v7636) + "\n" + "    v7637: " + toIndentedString(v7637) + "\n" + "    v7644: "
                + toIndentedString(v7644) + "\n" + "    v7674: " + toIndentedString(v7674) + "\n" + "    v7675: "
                + toIndentedString(v7675) + "\n" + "    v7676: " + toIndentedString(v7676) + "\n" + "    v7677: "
                + toIndentedString(v7677) + "\n" + "    v7681: " + toIndentedString(v7681) + "\n" + "    v7698: "
                + toIndentedString(v7698) + "\n" + "    v7699: " + toIndentedString(v7699) + "\n" + "    v7718: "
                + toIndentedString(v7718) + "\n" + "    v7720: " + toIndentedString(v7720) + "\n" + "    v7743: "
                + toIndentedString(v7743) + "\n" + "    v7761: " + toIndentedString(v7761) + "\n" + "    v7992: "
                + toIndentedString(v7992) + "\n" + "    v7993: " + toIndentedString(v7993) + "\n" + "    v7994: "
                + toIndentedString(v7994) + "\n" + "    v7995: " + toIndentedString(v7995) + "\n" + "    conid: "
                + toIndentedString(conid) + "\n" + "    minTick: " + toIndentedString(minTick) + "\n"
                + "    bboExchange: " + toIndentedString(bboExchange) + "\n" + "    hasDelayed: " + toIndentedString(
                hasDelayed) + "\n" + "    sizeMinTick: " + toIndentedString(sizeMinTick) + "\n" + "    bestEligible: "
                + toIndentedString(bestEligible) + "\n" + "    bestBidExch: " + toIndentedString(bestBidExch) + "\n"
                + "    bestAskExch: " + toIndentedString(bestAskExch) + "\n" + "    preOpenBid: " + toIndentedString(
                preOpenBid) + "\n" + "    lastAttribs: " + toIndentedString(lastAttribs) + "\n" + "    timestampBase: "
                + toIndentedString(timestampBase) + "\n" + "    timestampDelta: " + toIndentedString(timestampDelta)
                + "\n" + "    lastExch: " + toIndentedString(lastExch) + "\n" + "    closeAttribs: " + toIndentedString(
                closeAttribs) + "\n" + "}";
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

    public MarketData v31(String v31) {
        this.v31 = v31;
        return this;
    }

    public MarketData v6509(String v6509) {
        this.v6509 = v6509;
        return this;
    }

    public MarketData v70(BigDecimal v70) {
        this.v70 = v70;
        return this;
    }

    public MarketData v7057(String v7057) {
        this.v7057 = v7057;
        return this;
    }

    public MarketData v7058(String v7058) {
        this.v7058 = v7058;
        return this;
    }

    public MarketData v7059(BigDecimal v7059) {
        this.v7059 = v7059;
        return this;
    }

    public MarketData v7068(String v7068) {
        this.v7068 = v7068;
        return this;
    }

    public MarketData v71(BigDecimal v71) {
        this.v71 = v71;
        return this;
    }

    public MarketData v7195(String v7195) {
        this.v7195 = v7195;
        return this;
    }

    public MarketData v7196(String v7196) {
        this.v7196 = v7196;
        return this;
    }

    public MarketData v7197(String v7197) {
        this.v7197 = v7197;
        return this;
    }

    public MarketData v7198(String v7198) {
        this.v7198 = v7198;
        return this;
    }

    public MarketData v7199(String v7199) {
        this.v7199 = v7199;
        return this;
    }

    public MarketData v7200(String v7200) {
        this.v7200 = v7200;
        return this;
    }

    public MarketData v7201(String v7201) {
        this.v7201 = v7201;
        return this;
    }

    public MarketData v7202(String v7202) {
        this.v7202 = v7202;
        return this;
    }

    public MarketData v7203(String v7203) {
        this.v7203 = v7203;
        return this;
    }

    public MarketData v7204(String v7204) {
        this.v7204 = v7204;
        return this;
    }

    public MarketData v7205(String v7205) {
        this.v7205 = v7205;
        return this;
    }

    public MarketData v7206(String v7206) {
        this.v7206 = v7206;
        return this;
    }

    public MarketData v7207(String v7207) {
        this.v7207 = v7207;
        return this;
    }

    public MarketData v7208(String v7208) {
        this.v7208 = v7208;
        return this;
    }

    public MarketData v7209(String v7209) {
        this.v7209 = v7209;
        return this;
    }

    public MarketData v7210(String v7210) {
        this.v7210 = v7210;
        return this;
    }

    public MarketData v7211(String v7211) {
        this.v7211 = v7211;
        return this;
    }

    public MarketData v7212(String v7212) {
        this.v7212 = v7212;
        return this;
    }

    public MarketData v7245(String v7245) {
        this.v7245 = v7245;
        return this;
    }

    public MarketData v7246(String v7246) {
        this.v7246 = v7246;
        return this;
    }

    public MarketData v7247(String v7247) {
        this.v7247 = v7247;
        return this;
    }

    public MarketData v7248(String v7248) {
        this.v7248 = v7248;
        return this;
    }

    public MarketData v7249(String v7249) {
        this.v7249 = v7249;
        return this;
    }

    public MarketData v7263(String v7263) {
        this.v7263 = v7263;
        return this;
    }

    public MarketData v7264(String v7264) {
        this.v7264 = v7264;
        return this;
    }

    public MarketData v7265(String v7265) {
        this.v7265 = v7265;
        return this;
    }

    public MarketData v7266(String v7266) {
        this.v7266 = v7266;
        return this;
    }

    public MarketData v7267(String v7267) {
        this.v7267 = v7267;
        return this;
    }

    public MarketData v7268(String v7268) {
        this.v7268 = v7268;
        return this;
    }

    public MarketData v7269(String v7269) {
        this.v7269 = v7269;
        return this;
    }

    public MarketData v7271(String v7271) {
        this.v7271 = v7271;
        return this;
    }

    public MarketData v7272(String v7272) {
        this.v7272 = v7272;
        return this;
    }

    public MarketData v7273(String v7273) {
        this.v7273 = v7273;
        return this;
    }

    public MarketData v7274(String v7274) {
        this.v7274 = v7274;
        return this;
    }

    public MarketData v7275(String v7275) {
        this.v7275 = v7275;
        return this;
    }

    public MarketData v7276(String v7276) {
        this.v7276 = v7276;
        return this;
    }

    public MarketData v7277(String v7277) {
        this.v7277 = v7277;
        return this;
    }

    public MarketData v7282(String v7282) {
        this.v7282 = v7282;
        return this;
    }

    public MarketData v7283(String v7283) {
        this.v7283 = v7283;
        return this;
    }

    public MarketData v7284(String v7284) {
        this.v7284 = v7284;
        return this;
    }

    public MarketData v7286(BigDecimal v7286) {
        this.v7286 = v7286;
        return this;
    }

    public MarketData v7287(String v7287) {
        this.v7287 = v7287;
        return this;
    }

    public MarketData v7288(String v7288) {
        this.v7288 = v7288;
        return this;
    }

    public MarketData v7289(String v7289) {
        this.v7289 = v7289;
        return this;
    }

    public MarketData v7290(String v7290) {
        this.v7290 = v7290;
        return this;
    }

    public MarketData v7293(String v7293) {
        this.v7293 = v7293;
        return this;
    }

    public MarketData v7294(String v7294) {
        this.v7294 = v7294;
        return this;
    }

    public MarketData v7295(BigDecimal v7295) {
        this.v7295 = v7295;
        return this;
    }

    public MarketData v7296(BigDecimal v7296) {
        this.v7296 = v7296;
        return this;
    }

    public MarketData v7331(String v7331) {
        this.v7331 = v7331;
        return this;
    }

    public MarketData v7370(String v7370) {
        this.v7370 = v7370;
        return this;
    }

    public MarketData v7371(String v7371) {
        this.v7371 = v7371;
        return this;
    }

    public MarketData v7372(String v7372) {
        this.v7372 = v7372;
        return this;
    }

    public MarketData v7635(String v7635) {
        this.v7635 = v7635;
        return this;
    }

    public MarketData v7636(BigDecimal v7636) {
        this.v7636 = v7636;
        return this;
    }

    public MarketData v7637(String v7637) {
        this.v7637 = v7637;
        return this;
    }

    public MarketData v7644(String v7644) {
        this.v7644 = v7644;
        return this;
    }

    public MarketData v7674(String v7674) {
        this.v7674 = v7674;
        return this;
    }

    public MarketData v7675(String v7675) {
        this.v7675 = v7675;
        return this;
    }

    public MarketData v7676(String v7676) {
        this.v7676 = v7676;
        return this;
    }

    public MarketData v7677(String v7677) {
        this.v7677 = v7677;
        return this;
    }

    public MarketData v7681(String v7681) {
        this.v7681 = v7681;
        return this;
    }

    public MarketData v7698(String v7698) {
        this.v7698 = v7698;
        return this;
    }

    public MarketData v7699(String v7699) {
        this.v7699 = v7699;
        return this;
    }

    public MarketData v7718(String v7718) {
        this.v7718 = v7718;
        return this;
    }

    public MarketData v7720(String v7720) {
        this.v7720 = v7720;
        return this;
    }

    public MarketData v7743(String v7743) {
        this.v7743 = v7743;
        return this;
    }

    public MarketData v7761(String v7761) {
        this.v7761 = v7761;
        return this;
    }

    public MarketData v7992(String v7992) {
        this.v7992 = v7992;
        return this;
    }

    public MarketData v7993(String v7993) {
        this.v7993 = v7993;
        return this;
    }

    public MarketData v7994(String v7994) {
        this.v7994 = v7994;
        return this;
    }

    public MarketData v7995(String v7995) {
        this.v7995 = v7995;
        return this;
    }

    public MarketData v82(String v82) {
        this.v82 = v82;
        return this;
    }

    public MarketData v83(BigDecimal v83) {
        this.v83 = v83;
        return this;
    }

    public MarketData v84(String v84) {
        this.v84 = v84;
        return this;
    }

    public MarketData v85(String v85) {
        this.v85 = v85;
        return this;
    }

    public MarketData v86(String v86) {
        this.v86 = v86;
        return this;
    }

    public MarketData v87(String v87) {
        this.v87 = v87;
        return this;
    }

    public MarketData v88(String v88) {
        this.v88 = v88;
        return this;
    }

    public MarketData bboExchange(String bboExchange) {
        this.bboExchange = bboExchange;
        return this;
    }

    public MarketData bestAskExch(Integer bestAskExch) {
        this.bestAskExch = bestAskExch;
        return this;
    }

    public MarketData bestBidExch(Integer bestBidExch) {
        this.bestBidExch = bestBidExch;
        return this;
    }

    public MarketData bestEligible(Integer bestEligible) {
        this.bestEligible = bestEligible;
        return this;
    }

    public MarketData closeAttribs(Integer closeAttribs) {
        this.closeAttribs = closeAttribs;
        return this;
    }

    public MarketData conid(Integer conid) {
        this.conid = conid;
        return this;
    }

    public MarketData hasDelayed(Boolean hasDelayed) {
        this.hasDelayed = hasDelayed;
        return this;
    }

    /**
     * If market data field values return delayed.
     *
     * @return hasDelayed
     **/
    @JsonProperty("HasDelayed")
    @ApiModelProperty(value = "If market data field values return delayed")
    public Boolean isHasDelayed() {
        return hasDelayed;
    }

    public MarketData lastAttribs(Integer lastAttribs) {
        this.lastAttribs = lastAttribs;
        return this;
    }

    public MarketData lastExch(Integer lastExch) {
        this.lastExch = lastExch;
        return this;
    }

    public MarketData minTick(BigDecimal minTick) {
        this.minTick = minTick;
        return this;
    }

    public MarketData preOpenBid(Integer preOpenBid) {
        this.preOpenBid = preOpenBid;
        return this;
    }

    public MarketData sizeMinTick(Integer sizeMinTick) {
        this.sizeMinTick = sizeMinTick;
        return this;
    }

    public MarketData timestampBase(Integer timestampBase) {
        this.timestampBase = timestampBase;
        return this;
    }

    public MarketData timestampDelta(Integer timestampDelta) {
        this.timestampDelta = timestampDelta;
        return this;
    }

}

