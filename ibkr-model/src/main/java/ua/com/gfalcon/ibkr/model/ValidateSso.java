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

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * The current session for the SSO user.
 */
@Data
public class ValidateSso {

    /**
     * 1 for Live, 2 for Paper.
     */
    @ApiModelProperty(value = "1 for Live, 2 for Paper.")
    @JsonProperty("LOGIN_TYPE")
    @SerializedName("LOGIN_TYPE")
    private Integer loginType;

    /**
     * Username.
     */
    @ApiModelProperty(value = "Username.")
    @JsonProperty("USER_NAME")
    @SerializedName("USER_NAME")
    private String userName;

    /**
     * User ID.
     */
    @ApiModelProperty(value = "User ID.")
    @JsonProperty("USER_ID")
    @SerializedName("USER_ID")
    private Integer userId;

    /**
     * Time in milliseconds until session expires. Caller needs to call the again to re-validate session.
     */
    @ApiModelProperty(
            value = "Time in milliseconds until session expires. "
                    + "Caller needs to call the again to re-validate session.")
    @JsonProperty("expire")
    @SerializedName("expire")
    private BigDecimal expire;

    /**
     * true if session was validated; false if not.
     */
    @ApiModelProperty(value = "true if session was validated; false if not.")
    @JsonProperty("RESULT")
    @SerializedName("RESULT")
    private Boolean result;

    /**
     * Time of session validation.
     */
    @ApiModelProperty(value = "Time of session validation.")
    @JsonProperty("AUTH_TIME")
    @SerializedName("AUTH_TIME")
    private BigDecimal authTime;

}
