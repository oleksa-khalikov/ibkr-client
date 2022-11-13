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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * Auth status.
 */
@Validated
public class AuthStatus {

    /**
     * Brokerage session is authenticated.
     **/
    @ApiModelProperty(value = "Brokerage session is authenticated")
    @JsonProperty("authenticated")
    @SerializedName("authenticated")
    private Boolean authenticated = null;

    /**
     * Connected to backend.
     **/
    @ApiModelProperty(value = "Connected to backend")
    @JsonProperty("connected")
    @SerializedName("connected")
    private Boolean connected = null;

    /**
     * Brokerage session is competing, e.g. user is logged in to IBKR Mobile, WebTrader, TWS or other trading platforms.
     **/
    @ApiModelProperty(
            value = "Brokerage session is competing, e.g. user is logged in to IBKR Mobile, WebTrader,"
                    + " TWS or other trading platforms.")
    @JsonProperty("competing")
    @SerializedName("competing")
    private Boolean competing = null;

    /**
     * Authentication failed, why.
     **/
    @ApiModelProperty(value = "Authentication failed, why.")
    @JsonProperty("fail")
    @SerializedName("fail")
    private String fail = null;

    /**
     * System messages that may affect trading.
     **/
    @ApiModelProperty(value = "System messages that may affect trading")
    @JsonProperty("message")
    @SerializedName("message")
    private String message = null;

    /**
     * Prompt messages that may affect trading or the account.
     **/
    @ApiModelProperty(value = "Prompt messages that may affect trading or the account")
    @JsonProperty("prompts")
    @Valid
    @SerializedName("prompts")
    private List<String> prompts = null;

    /**
     * Authentication failed, why.
     *
     * @return fail
     **/
    @ApiModelProperty(value = "Authentication failed, why.")
    @JsonProperty("fail")
    public String getFail() {
        return fail;
    }

    public void setFail(String fail) {
        this.fail = fail;
    }

    /**
     * System messages that may affect trading.
     *
     * @return message
     **/
    @ApiModelProperty(value = "System messages that may affect trading")
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Prompt messages that may affect trading or the account.
     *
     * @return prompts
     **/
    @ApiModelProperty(value = "Prompt messages that may affect trading or the account")
    @JsonProperty("prompts")
    public List<String> getPrompts() {
        return prompts;
    }

    public void setPrompts(List<String> prompts) {
        this.prompts = prompts;
    }

    public void setAuthenticated(Boolean authenticated) {
        this.authenticated = authenticated;
    }

    public void setCompeting(Boolean competing) {
        this.competing = competing;
    }

    public void setConnected(Boolean connected) {
        this.connected = connected;
    }

    @Override
    public int hashCode() {
        return Objects.hash(authenticated, connected, competing, fail, message, prompts);
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AuthStatus authStatus = (AuthStatus) o;
        return Objects.equals(authenticated, authStatus.authenticated) && Objects.equals(connected,
                authStatus.connected) && Objects.equals(competing, authStatus.competing) && Objects.equals(fail,
                authStatus.fail) && Objects.equals(message, authStatus.message) && Objects.equals(prompts,
                authStatus.prompts);
    }

    @Override
    public String toString() {

        String sb = "class AuthStatus {\n" + "    authenticated: " + toIndentedString(authenticated) + "\n"
                + "    connected: " + toIndentedString(connected) + "\n" + "    competing: " + toIndentedString(
                competing) + "\n" + "    fail: " + toIndentedString(fail) + "\n" + "    message: " + toIndentedString(
                message) + "\n" + "    prompts: " + toIndentedString(prompts) + "\n" + "}";
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
     * Add prompts item.
     */
    public AuthStatus addPromptsItem(String promptsItem) {
        if (this.prompts == null) {
            this.prompts = new ArrayList<String>();
        }
        this.prompts.add(promptsItem);
        return this;
    }

    public AuthStatus authenticated(Boolean authenticated) {
        this.authenticated = authenticated;
        return this;
    }

    public AuthStatus competing(Boolean competing) {
        this.competing = competing;
        return this;
    }

    public AuthStatus connected(Boolean connected) {
        this.connected = connected;
        return this;
    }

    public AuthStatus fail(String fail) {
        this.fail = fail;
        return this;
    }

    /**
     * Brokerage session is authenticated.
     *
     * @return authenticated
     **/
    @ApiModelProperty(value = "Brokerage session is authenticated")
    @JsonProperty("authenticated")
    public Boolean isAuthenticated() {
        return authenticated;
    }

    /**
     * Brokerage session is competing, e.g. user is logged in to IBKR Mobile, WebTrader, TWS or other trading platforms.
     *
     * @return competing
     **/
    @ApiModelProperty(
            value = "Brokerage session is competing, e.g. user is logged in to IBKR Mobile, WebTrader, "
                    + "TWS or other trading platforms.")
    @JsonProperty("competing")
    public Boolean isCompeting() {
        return competing;
    }

    /**
     * Connected to backend.
     *
     * @return connected
     **/
    @ApiModelProperty(value = "Connected to backend")
    @JsonProperty("connected")
    public Boolean isConnected() {
        return connected;
    }

    public AuthStatus message(String message) {
        this.message = message;
        return this;
    }

    public AuthStatus prompts(List<String> prompts) {
        this.prompts = prompts;
        return this;
    }

}

