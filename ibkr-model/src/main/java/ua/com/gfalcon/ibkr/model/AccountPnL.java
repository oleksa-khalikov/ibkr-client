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

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PnL for the selected account and its models (if any).
 */
@Validated
@ApiModel(description = "PnL for the selected account and its models (if any)")
public class AccountPnL {

    /**
     * Account and model(s) pnl.
     */
    @ApiModelProperty(value = "Account and model(s) pnl.")
    @JsonProperty("acctId")
    @SerializedName("acctId")
    private Object acctId;

    @Override
    public int hashCode() {
        return Objects.hash(getAcctId());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AccountPnL)) {
            return false;
        }
        AccountPnL that = (AccountPnL) o;
        return Objects.equals(getAcctId(), that.getAcctId());
    }

    @Override
    public String toString() {
        String sb = "AccountPnL{" + "acctId=" + acctId + '}';
        return sb;
    }

    public Object getAcctId() {
        return acctId;
    }

    public void setAcctId(Object acctId) {
        this.acctId = acctId;
    }

}
