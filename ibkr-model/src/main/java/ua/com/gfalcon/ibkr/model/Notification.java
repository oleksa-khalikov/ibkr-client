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

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Notification.
 */
@Data
@Validated
public class Notification {

    /**
     * notification date.
     */
    @ApiModelProperty(value = "notification date")
    @JsonProperty("D")
    @SerializedName("D")
    private String date;

    /**
     * unique way to reference this notification.
     */
    @ApiModelProperty(value = "unique way to reference this notification")
    @JsonProperty("ID")
    @SerializedName("ID")
    private String id;

    /**
     * FYI code, we can use it to find whether the disclaimer is accepted or not in settings.
     */
    @ApiModelProperty(value = "FYI code, we can use it to find whether the disclaimer is accepted or not in settings")
    @JsonProperty("FC")
    @SerializedName("FC")
    private String fyiCode;

    /**
     * content of notification.
     */
    @ApiModelProperty(value = "content of notification")
    @JsonProperty("MD")
    @SerializedName("MD")
    private String content;

    /**
     * title of notification.
     */
    @ApiModelProperty(value = "title of notification")
    @JsonProperty("MS")
    @SerializedName("MS")
    private String title;

    /**
     * 0-unread, 1-read
     */
    @ApiModelProperty(value = "0-unread, 1-read")
    @JsonProperty("R")
    @SerializedName("R")
    private String read;
}
