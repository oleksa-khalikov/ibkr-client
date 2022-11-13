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

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import lombok.Data;

/**
 * Parent account.
 */
@Data
public class ParentAccount {

    @JsonProperty("mmc")
    @SerializedName("mmc")
    private List<String> mmc;

    /**
     * Account Number for Money Manager Client.
     */
    @JsonProperty("accountId")
    @SerializedName("accountId")
    private String accountId;

    /**
     * Is MM a Parent Account.
     */
    @JsonProperty("isMParent")
    @SerializedName("isMParent")
    private Boolean parent;

    /**
     * Is MM a Child Account.
     */
    @JsonProperty("isMChild")
    @SerializedName("isMChild")
    private Boolean child;

    /**
     * Is a Multiplex Account.
     * These are account models with individual account being parent and managed account being child.
     */
    @JsonProperty("isMultiplex")
    @SerializedName("isMultiplex")
    private Boolean multiplex;

}
