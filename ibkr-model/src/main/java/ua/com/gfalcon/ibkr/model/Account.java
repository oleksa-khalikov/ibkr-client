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

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Objects;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * account information.
 */
@ApiModel(description = "account information")
@Validated
public class Account {

    /**
     * The account identification value.
     */
    @ApiModelProperty(value = "The account identification value")
    @JsonProperty("id")
    @SerializedName("id")
    private String id = null;

    /**
     * The account number.
     */
    @ApiModelProperty(
            example = "U12345678 for Individual Live Accounts, DU12345678 for Individual Paper Accounts",
            value = "The account number")
    @JsonProperty("accountId")
    @SerializedName("accountId")
    private String accountId = null;

    /**
     * The accountAlias.
     */
    @ApiModelProperty(value = "The accountAlias")
    @JsonProperty("accountVan")
    @SerializedName("accountVan")
    private String accountVan = null;

    /**
     * Title of the account.
     */
    @ApiModelProperty(value = "Title of the account")
    @JsonProperty("accountTitle")
    @SerializedName("accountTitle")
    private String accountTitle = null;

    /**
     * Whichever value is not null in this priority.
     */
    @ApiModelProperty(value = "Whichever value is not null in this priority")
    @JsonProperty("displayName")
    @SerializedName("displayName")
    private DisplayNameEnum displayName = null;

    /**
     * User customizable account alias. Refer to [Configure Account
     * Alias](https://guides.interactivebrokers.com/cp/cp.htm#am/settings/accountalias.htm) for details.
     */
    @ApiModelProperty(
            value = "User customizable account alias. Refer to [Configure Account Alias](https://guides.interactivebrokers.com/cp/cp.htm#am/settings/accountalias.htm) for details.")
    @JsonProperty("accountAlias")
    @SerializedName("accountAlias")
    private String accountAlias = null;

    /**
     * When the account was opened in unix time.
     */
    @ApiModelProperty(value = "When the account was opened in unix time.")
    @JsonProperty("accountStatus")
    @SerializedName("accountStatus")
    private BigDecimal accountStatus = null;

    /**
     * Base currency of the account.
     */
    @ApiModelProperty(value = "Base currency of the account.")
    @JsonProperty("currency")
    @SerializedName("currency")
    private CurrencyEnum currency = null;

    /**
     * Account Type.
     */
    @ApiModelProperty(value = "Account Type")
    @JsonProperty("type")
    @SerializedName("type")
    private TypeEnum type = null;

    /**
     * UNI - Deprecated property.
     */
    @ApiModelProperty(value = "UNI - Deprecated property")
    @JsonProperty("tradingType")
    @SerializedName("tradingType")
    private String tradingType = null;

    /**
     * If an account is a sub-account to a Financial Advisor.
     */
    @ApiModelProperty(value = "If an account is a sub-account to a Financial Advisor.")
    @JsonProperty("faclient")
    @SerializedName("faclient")
    private Boolean faclient = null;

    /**
     * Status of the Account   * O = Open   * P or N = Pending   * A = Abandoned   * R = Rejected   * C = Closed.
     */
    @ApiModelProperty(
            value = "Status of the Account"
                    + "   * O = Open   * P or N = Pending   * A = Abandoned   * R = Rejected   * C = Closed ")
    @JsonProperty("clearingStatus")
    @SerializedName("clearingStatus")
    private ClearingStatusEnum clearingStatus = null;

    /**
     * Is a Covestor Account.
     */
    @ApiModelProperty(value = "Is a Covestor Account")
    @JsonProperty("covestor")
    @SerializedName("covestor")
    private Boolean covestor = null;

    @ApiModelProperty(value = "")
    @JsonProperty("parent")
    @SerializedName("parent")
    private ParentAccount parent = null;

    /**
     * Formatted \"accountId - accountAlias\".
     */
    @ApiModelProperty(value = "Formatted \"accountId - accountAlias\"")
    @JsonProperty("desc")
    @SerializedName("desc")
    private String desc = null;

    /**
     * User customizable account alias. Refer to [Configure Account
     * Alias](https://guides.interactivebrokers.com/cp/cp.htm#am/settings/accountalias.htm) for details.
     *
     * @return accountAlias
     */
    @ApiModelProperty(
            value = "User customizable account alias. Refer to [Configure Account Alias](https://guides.interactivebrokers.com/cp/cp.htm#am/settings/accountalias.htm) for details.")
    @JsonProperty("accountAlias")
    public String getAccountAlias() {
        return accountAlias;
    }

    public void setAccountAlias(String accountAlias) {
        this.accountAlias = accountAlias;
    }

    /**
     * The account number.
     *
     * @return accountId
     */
    @ApiModelProperty(
            example = "U12345678 for Individual Live Accounts, DU12345678 for Individual Paper Accounts",
            value = "The account number")
    @JsonProperty("accountId")
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * When the account was opened in unix time.
     *
     * @return accountStatus
     */
    @ApiModelProperty(value = "When the account was opened in unix time.")
    @JsonProperty("accountStatus")
    @Valid
    public BigDecimal getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(BigDecimal accountStatus) {
        this.accountStatus = accountStatus;
    }

    /**
     * Title of the account.
     *
     * @return accountTitle
     */
    @ApiModelProperty(value = "Title of the account")
    @JsonProperty("accountTitle")
    public String getAccountTitle() {
        return accountTitle;
    }

    public void setAccountTitle(String accountTitle) {
        this.accountTitle = accountTitle;
    }

    /**
     * The accountAlias.
     *
     * @return accountVan
     */
    @ApiModelProperty(value = "The accountAlias")
    @JsonProperty("accountVan")
    public String getAccountVan() {
        return accountVan;
    }

    public void setAccountVan(String accountVan) {
        this.accountVan = accountVan;
    }

    /**
     * Status of the Account   * O = Open   * P or N = Pending   * A = Abandoned   * R = Rejected   * C = Closed.
     *
     * @return clearingStatus
     */
    @ApiModelProperty(
            value = "Status of the Account"
                    + "   * O = Open"
                    + "   * P or N = Pending"
                    + "   * A = Abandoned"
                    + "   * R = Rejected"
                    + "   * C = Closed ")
    @JsonProperty("clearingStatus")
    public ClearingStatusEnum getClearingStatus() {
        return clearingStatus;
    }

    public void setClearingStatus(ClearingStatusEnum clearingStatus) {
        this.clearingStatus = clearingStatus;
    }

    /**
     * Get clearing status as string.
     */
    public String getClearingStatusStr() {
        if (clearingStatus == null) {
            return null;
        }
        return clearingStatus.value();
    }

    /**
     * Base currency of the account.
     *
     * @return currency
     */
    @ApiModelProperty(value = "Base currency of the account.")
    @JsonProperty("currency")
    public CurrencyEnum getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyEnum currency) {
        this.currency = currency;
    }

    /**
     * Get currency as string.
     */
    public String getCurrencyStr() {
        if (currency == null) {
            return null;
        }
        return currency.value();
    }

    /**
     * Formatted \"accountId - accountAlias\".
     *
     * @return desc
     */
    @ApiModelProperty(value = "Formatted \"accountId - accountAlias\"")
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * Whichever value is not null in this priority.
     *
     * @return displayName
     */
    @ApiModelProperty(value = "Whichever value is not null in this priority")
    @JsonProperty("displayName")
    public DisplayNameEnum getDisplayName() {
        return displayName;
    }

    public void setDisplayName(DisplayNameEnum displayName) {
        this.displayName = displayName;
    }

    /**
     * Get display name as string.
     */
    public String getDisplayNameStr() {
        if (displayName == null) {
            return null;
        }
        return displayName.value();
    }

    /**
     * The account identification value.
     *
     * @return id
     */
    @ApiModelProperty(value = "The account identification value")
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Get parent.
     *
     * @return parent
     */
    @JsonProperty("parent")
    public ParentAccount getParent() {
        return parent;
    }

    public void setParent(ParentAccount parent) {
        this.parent = parent;
    }

    /**
     * UNI - Deprecated property.
     *
     * @return tradingType
     */
    @ApiModelProperty(value = "UNI - Deprecated property")
    @JsonProperty("tradingType")
    public String getTradingType() {
        return tradingType;
    }

    public void setTradingType(String tradingType) {
        this.tradingType = tradingType;
    }

    /**
     * Account Type.
     *
     * @return type
     */
    @ApiModelProperty(value = "Account Type")
    @JsonProperty("type")
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * Get type as String.
     */
    public String getTypeStr() {
        if (type == null) {
            return null;
        }
        return type.value();
    }

    public void setCovestor(Boolean covestor) {
        this.covestor = covestor;
    }

    public void setFaclient(Boolean faclient) {
        this.faclient = faclient;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accountId, accountVan, accountTitle, displayName, accountAlias, accountStatus, currency,
                type, tradingType, faclient, clearingStatus, covestor, parent, desc);
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(this.id, account.id) && Objects.equals(this.accountId, account.accountId)
                && Objects.equals(this.accountVan, account.accountVan) && Objects.equals(this.accountTitle,
                account.accountTitle) && Objects.equals(this.displayName, account.displayName) && Objects.equals(
                this.accountAlias, account.accountAlias) && Objects.equals(this.accountStatus, account.accountStatus)
                && Objects.equals(this.currency, account.currency) && Objects.equals(this.type, account.type)
                && Objects.equals(this.tradingType, account.tradingType) && Objects.equals(this.faclient,
                account.faclient) && Objects.equals(this.clearingStatus, account.clearingStatus) && Objects.equals(
                this.covestor, account.covestor) && Objects.equals(this.parent, account.parent) && Objects.equals(
                this.desc, account.desc);
    }

    @Override
    public String toString() {

        String sb = "class Account {\n" + "    id: " + toIndentedString(id) + "\n" + "    accountId: "
                + toIndentedString(accountId) + "\n" + "    accountVan: " + toIndentedString(accountVan) + "\n"
                + "    accountTitle: " + toIndentedString(accountTitle) + "\n" + "    displayName: " + toIndentedString(
                displayName) + "\n" + "    accountAlias: " + toIndentedString(accountAlias) + "\n"
                + "    accountStatus: " + toIndentedString(accountStatus) + "\n" + "    currency: " + toIndentedString(
                currency) + "\n" + "    type: " + toIndentedString(type) + "\n" + "    tradingType: "
                + toIndentedString(tradingType) + "\n" + "    faclient: " + toIndentedString(faclient) + "\n"
                + "    clearingStatus: " + toIndentedString(clearingStatus) + "\n" + "    covestor: "
                + toIndentedString(covestor) + "\n" + "    parent: " + toIndentedString(parent) + "\n" + "    desc: "
                + toIndentedString(desc) + "\n" + "}";
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

    public Account accountAlias(String accountAlias) {
        this.accountAlias = accountAlias;
        return this;
    }

    public Account accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    public Account accountStatus(BigDecimal accountStatus) {
        this.accountStatus = accountStatus;
        return this;
    }

    public Account accountTitle(String accountTitle) {
        this.accountTitle = accountTitle;
        return this;
    }

    public Account accountVan(String accountVan) {
        this.accountVan = accountVan;
        return this;
    }

    public Account clearingStatus(ClearingStatusEnum clearingStatus) {
        this.clearingStatus = clearingStatus;
        return this;
    }

    public Account covestor(Boolean covestor) {
        this.covestor = covestor;
        return this;
    }

    public Account currency(CurrencyEnum currency) {
        this.currency = currency;
        return this;
    }

    public Account desc(String desc) {
        this.desc = desc;
        return this;
    }

    public Account displayName(DisplayNameEnum displayName) {
        this.displayName = displayName;
        return this;
    }

    public Account faclient(Boolean faclient) {
        this.faclient = faclient;
        return this;
    }

    public Account id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Is a Covestor Account.
     *
     * @return covestor
     */
    @ApiModelProperty(value = "Is a Covestor Account")
    @JsonProperty("covestor")
    public Boolean isCovestor() {
        return covestor;
    }

    /**
     * If an account is a sub-account to a Financial Advisor.
     *
     * @return faclient
     */
    @ApiModelProperty(value = "If an account is a sub-account to a Financial Advisor.")
    @JsonProperty("faclient")
    public Boolean isFaclient() {
        return faclient;
    }

    public Account parent(ParentAccount parent) {
        this.parent = parent;
        return this;
    }

    public Account tradingType(String tradingType) {
        this.tradingType = tradingType;
        return this;
    }

    public Account type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Whichever value is not null in this priority.
     */
    @XmlType(name = "DisplayNameEnum")
    @XmlEnum(String.class)
    @JsonAdapter(DisplayNameEnum.Adapter.class)
    public enum DisplayNameEnum {

        @XmlEnumValue("accountTitle") ACCOUNTTITLE("accountTitle"),

        @XmlEnumValue("accountVan") ACCOUNTVAN("accountVan"),

        @XmlEnumValue("accountId") ACCOUNTID("accountId");


        private final String value;

        DisplayNameEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        /**
         * Display name.
         */
        @JsonCreator
        public static DisplayNameEnum fromValue(String text) {
            for (DisplayNameEnum b : DisplayNameEnum.values()) {
                if (String.valueOf(b.value)
                        .equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public String value() {
            return value;
        }

        /**
         * Display name adapter.
         */
        public static class Adapter extends TypeAdapter<DisplayNameEnum> {

            @Override
            public void write(final JsonWriter jsonWriter, final DisplayNameEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public DisplayNameEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return DisplayNameEnum.fromValue(String.valueOf(value));
            }

        }
    }

    /**
     * Base currency of the account.
     */
    @XmlType(name = "CurrencyEnum")
    @XmlEnum(String.class)
    @JsonAdapter(CurrencyEnum.Adapter.class)
    public enum CurrencyEnum {

        @XmlEnumValue("AUD") AUD("AUD"),

        @XmlEnumValue("GBP") GBP("GBP"),

        @XmlEnumValue("CAD") CAD("CAD"),

        @XmlEnumValue("CNH") CNH("CNH"),

        @XmlEnumValue("CZK") CZK("CZK"),

        @XmlEnumValue("DKK") DKK("DKK"),

        @XmlEnumValue("EUR") EUR("EUR"),

        @XmlEnumValue("HKD") HKD("HKD"),

        @XmlEnumValue("HUF") HUF("HUF"),

        @XmlEnumValue("INR") INR("INR"),

        @XmlEnumValue("ILS") ILS("ILS"),

        @XmlEnumValue("JPY") JPY("JPY"),

        @XmlEnumValue("MXN") MXN("MXN"),

        @XmlEnumValue("NOK") NOK("NOK"),

        @XmlEnumValue("NZD") NZD("NZD"),

        @XmlEnumValue("PLN") PLN("PLN"),

        @XmlEnumValue("RUB") RUB("RUB"),

        @XmlEnumValue("SGD") SGD("SGD"),

        @XmlEnumValue("SEK") SEK("SEK"),

        @XmlEnumValue("CHF") CHF("CHF"),

        @XmlEnumValue("USD") USD("USD");


        private final String value;

        CurrencyEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        /**
         * Currency.
         */
        @JsonCreator
        public static CurrencyEnum fromValue(String text) {
            for (CurrencyEnum b : CurrencyEnum.values()) {
                if (String.valueOf(b.value)
                        .equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public String value() {
            return value;
        }

        /**
         * Currency adapter.
         */
        public static class Adapter extends TypeAdapter<CurrencyEnum> {

            @Override
            public void write(final JsonWriter jsonWriter, final CurrencyEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public CurrencyEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return CurrencyEnum.fromValue(String.valueOf(value));
            }

        }
    }

    /**
     * Account Type.
     */
    @XmlType(name = "TypeEnum")
    @XmlEnum(String.class)
    @JsonAdapter(TypeEnum.Adapter.class)
    public enum TypeEnum {

        @XmlEnumValue("INDIVIDUAL") INDIVIDUAL("INDIVIDUAL"),

        @XmlEnumValue("JOINT") JOINT("JOINT"),

        @XmlEnumValue("ORG") ORG("ORG"),

        @XmlEnumValue("TRUST") TRUST("TRUST"),

        @XmlEnumValue("DEMO") DEMO("DEMO");


        private final String value;

        TypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        /**
         * Types.
         */
        @JsonCreator
        public static TypeEnum fromValue(String text) {
            for (TypeEnum b : TypeEnum.values()) {
                if (String.valueOf(b.value)
                        .equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public String value() {
            return value;
        }

        /**
         * Adapter.
         */
        public static class Adapter extends TypeAdapter<TypeEnum> {

            @Override
            public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public TypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return TypeEnum.fromValue(String.valueOf(value));
            }

        }
    }

    /**
     * Status of the Account   * O = Open   * P or N = Pending   * A = Abandoned   * R = Rejected   * C = Closed.
     */
    @XmlType(name = "ClearingStatusEnum")
    @XmlEnum(String.class)
    @JsonAdapter(ClearingStatusEnum.Adapter.class)
    public enum ClearingStatusEnum {

        @XmlEnumValue("O") O("O"),

        @XmlEnumValue("P") P("P"),

        @XmlEnumValue("N") N("N"),

        @XmlEnumValue("A") A("A"),

        @XmlEnumValue("R") R("R"),

        @XmlEnumValue("C") C("C");


        private final String value;

        ClearingStatusEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        /**
         * Clearing Status.
         */
        @JsonCreator
        public static ClearingStatusEnum fromValue(String text) {
            for (ClearingStatusEnum b : ClearingStatusEnum.values()) {
                if (String.valueOf(b.value)
                        .equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public String value() {
            return value;
        }

        /**
         * Adapter.
         */
        public static class Adapter extends TypeAdapter<ClearingStatusEnum> {

            @Override
            public void write(final JsonWriter jsonWriter, final ClearingStatusEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ClearingStatusEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ClearingStatusEnum.fromValue(String.valueOf(value));
            }

        }
    }

}

