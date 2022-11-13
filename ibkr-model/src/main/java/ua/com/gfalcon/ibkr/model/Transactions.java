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
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * account transactions.
 **/
@ApiModel(description = "account transactions")
@Validated
public class Transactions {

    /**
     * will always be getTransactions.
     **/
    @ApiModelProperty(value = "will always be getTransactions")
    @JsonProperty("id")
    @SerializedName("id")
    private String id = null;

    /**
     * same as request.
     **/
    @ApiModelProperty(value = "same as request")
    @JsonProperty("currency")
    @SerializedName("currency")
    private String currency = null;

    /**
     * Indicates whether current day and realtime data is included in the result.
     **/
    @ApiModelProperty(value = "Indicates whether current day and realtime data is included in the result")
    @JsonProperty("includesRealTime")
    @SerializedName("includesRealTime")
    private Boolean includesRealTime = null;

    /**
     * Period start date. Epoch time, GMT
     **/
    @ApiModelProperty(value = "Period start date. Epoch time, GMT")
    @JsonProperty("from")
    @SerializedName("from")
    private BigDecimal from = null;

    /**
     * Period end date. Epoch time, GMT
     **/
    @ApiModelProperty(value = "Period end date. Epoch time, GMT")
    @JsonProperty("to")
    @SerializedName("to")
    private BigDecimal to = null;

    /**
     * Sorted by date descending.
     */
    @ApiModelProperty(value = "Sorted by date descending")
    @JsonProperty("transactions")
    @Valid
    @SerializedName("transactions")
    private List<Object> transactions = new ArrayList<Object>();

    /**
     * same as request.
     *
     * @return currency
     **/
    @JsonProperty("currency")
    @ApiModelProperty(value = "same as request")
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Period start date. Epoch time, GMT
     *
     * @return from
     **/
    @JsonProperty("from")
    @ApiModelProperty(value = "Period start date. Epoch time, GMT")
    @Valid
    public BigDecimal getFrom() {
        return from;
    }

    public void setFrom(BigDecimal from) {
        this.from = from;
    }

    /**
     * will always be getTransactions.
     *
     * @return id
     **/
    @JsonProperty("id")
    @ApiModelProperty(value = "will always be getTransactions")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Period end date. Epoch time, GMT
     *
     * @return to
     **/
    @JsonProperty("to")
    @ApiModelProperty(value = "Period end date. Epoch time, GMT")
    @Valid
    public BigDecimal getTo() {
        return to;
    }

    public void setTo(BigDecimal to) {
        this.to = to;
    }

    /**
     * Sorted by date descending.
     *
     * @return transactions
     **/
    @JsonProperty("transactions")
    @ApiModelProperty(value = "Sorted by date descending")
    public List<Object> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Object> transactions) {
        this.transactions = transactions;
    }

    public void setIncludesRealTime(Boolean includesRealTime) {
        this.includesRealTime = includesRealTime;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, currency, includesRealTime, from, to, transactions);
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Transactions transactions = (Transactions) o;
        return Objects.equals(this.id, transactions.id) && Objects.equals(this.currency, transactions.currency)
                && Objects.equals(this.includesRealTime, transactions.includesRealTime) && Objects.equals(this.from,
                transactions.from) && Objects.equals(this.to, transactions.to) && Objects.equals(this.transactions,
                transactions.transactions);
    }

    @Override
    public String toString() {

        String sb = "class Transactions {\n" + "    id: " + toIndentedString(id) + "\n" + "    currency: "
                + toIndentedString(currency) + "\n" + "    includesRealTime: " + toIndentedString(includesRealTime)
                + "\n" + "    from: " + toIndentedString(from) + "\n" + "    to: " + toIndentedString(to) + "\n"
                + "    transactions: " + toIndentedString(transactions) + "\n" + "}";
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

    /**
     * Add transactions item.
     */
    public Transactions addTransactionsItem(Object transactionsItem) {
        if (this.transactions == null) {
            this.transactions = new ArrayList<Object>();
        }
        this.transactions.add(transactionsItem);
        return this;
    }

    public Transactions currency(String currency) {
        this.currency = currency;
        return this;
    }

    public Transactions from(BigDecimal from) {
        this.from = from;
        return this;
    }

    public Transactions id(String id) {
        this.id = id;
        return this;
    }

    public Transactions includesRealTime(Boolean includesRealTime) {
        this.includesRealTime = includesRealTime;
        return this;
    }

    /**
     * Indicates whether current day and realtime data is included in the result.
     *
     * @return includesRealTime
     **/
    @JsonProperty("includesRealTime")
    @ApiModelProperty(value = "Indicates whether current day and realtime data is included in the result")
    public Boolean isIncludesRealTime() {
        return includesRealTime;
    }

    public Transactions to(BigDecimal to) {
        this.to = to;
        return this;
    }

    public Transactions transactions(List<Object> transactions) {
        this.transactions = transactions;
        return this;
    }

}

