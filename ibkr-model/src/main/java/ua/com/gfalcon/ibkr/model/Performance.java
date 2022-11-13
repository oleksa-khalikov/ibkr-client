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
 * Performance.
 */
@Validated
public class Performance {

    @ApiModelProperty(value = "")
    @JsonProperty("id")
    @SerializedName("id")
    private String id = null;

    /**
     * Cumulative performance data.
     **/
    @ApiModelProperty(value = "Cumulative performance data")
    @JsonProperty("cps")
    @SerializedName("cps")
    private Object cps = null;

    /**
     * Time period performance data.
     **/
    @ApiModelProperty(value = "Time period performance data")
    @JsonProperty("tpps")
    @SerializedName("tpps")
    private Object tpps = null;

    /**
     * Net asset value data for the account or consolidated accounts. NAV data is not applicable to benchmarks.
     **/
    @ApiModelProperty(
            value = "Net asset value data for the account or consolidated accounts."
                    + " NAV data is not applicable to benchmarks.")
    @JsonProperty("nav")
    @SerializedName("nav")
    private Object nav = null;

    @ApiModelProperty(value = "")
    @JsonProperty("pm")
    @SerializedName("pm")
    private String pm = null;

    @ApiModelProperty(value = "")
    @JsonProperty("included")
    @Valid
    @SerializedName("included")
    private List<String> included = new ArrayList<String>();

    @ApiModelProperty(value = "")
    @JsonProperty("currencyType")
    @SerializedName("currencyType")
    private String currencyType = null;

    @ApiModelProperty(value = "")
    @JsonProperty("rc")
    @SerializedName("rc")
    private Integer rc = null;

    /**
     * Cumulative performance data.
     *
     * @return cps
     **/
    @JsonProperty("cps")
    @ApiModelProperty(value = "Cumulative performance data")
    public Object getCps() {
        return cps;
    }

    public void setCps(Object cps) {
        this.cps = cps;
    }

    /**
     * Get currencyType.
     *
     * @return currencyType
     **/
    @JsonProperty("currencyType")
    @ApiModelProperty(value = "")
    public String getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }

    /**
     * Get id.
     *
     * @return id
     **/
    @JsonProperty("id")
    @ApiModelProperty(value = "")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Get included.
     *
     * @return included
     **/
    @JsonProperty("included")
    @ApiModelProperty(value = "")
    public List<String> getIncluded() {
        return included;
    }

    public void setIncluded(List<String> included) {
        this.included = included;
    }

    /**
     * Net asset value data for the account or consolidated accounts. NAV data is not applicable to benchmarks.
     *
     * @return nav
     **/
    @JsonProperty("nav")
    @ApiModelProperty(
            value = "Net asset value data for the account or consolidated accounts."
                    + " NAV data is not applicable to benchmarks.")
    public Object getNav() {
        return nav;
    }

    public void setNav(Object nav) {
        this.nav = nav;
    }

    /**
     * Get pm.
     *
     * @return pm
     **/
    @JsonProperty("pm")
    @ApiModelProperty(value = "")
    public String getPm() {
        return pm;
    }

    public void setPm(String pm) {
        this.pm = pm;
    }

    /**
     * Get rc.
     *
     * @return rc
     **/
    @JsonProperty("rc")
    @ApiModelProperty(value = "")
    public Integer getRc() {
        return rc;
    }

    public void setRc(Integer rc) {
        this.rc = rc;
    }

    /**
     * Time period performance data.
     *
     * @return tpps
     **/
    @JsonProperty("tpps")
    @ApiModelProperty(value = "Time period performance data")
    public Object getTpps() {
        return tpps;
    }

    public void setTpps(Object tpps) {
        this.tpps = tpps;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cps, tpps, nav, pm, included, currencyType, rc);
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Performance performance = (Performance) o;
        return Objects.equals(this.id, performance.id) && Objects.equals(this.cps, performance.cps) && Objects.equals(
                this.tpps, performance.tpps) && Objects.equals(this.nav, performance.nav) && Objects.equals(this.pm,
                performance.pm) && Objects.equals(this.included, performance.included) && Objects.equals(
                this.currencyType, performance.currencyType) && Objects.equals(this.rc, performance.rc);
    }

    @Override
    public String toString() {

        String sb = "class Performance {\n" + "    id: " + toIndentedString(id) + "\n" + "    cps: " + toIndentedString(
                cps) + "\n" + "    tpps: " + toIndentedString(tpps) + "\n" + "    nav: " + toIndentedString(nav) + "\n"
                + "    pm: " + toIndentedString(pm) + "\n" + "    included: " + toIndentedString(included) + "\n"
                + "    currencyType: " + toIndentedString(currencyType) + "\n" + "    rc: " + toIndentedString(rc)
                + "\n" + "}";
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
     * Add included item.
     */
    public Performance addIncludedItem(String includedItem) {
        if (this.included == null) {
            this.included = new ArrayList<String>();
        }
        this.included.add(includedItem);
        return this;
    }

    public Performance cps(Object cps) {
        this.cps = cps;
        return this;
    }

    public Performance currencyType(String currencyType) {
        this.currencyType = currencyType;
        return this;
    }

    public Performance id(String id) {
        this.id = id;
        return this;
    }

    public Performance included(List<String> included) {
        this.included = included;
        return this;
    }

    public Performance nav(Object nav) {
        this.nav = nav;
        return this;
    }

    public Performance pm(String pm) {
        this.pm = pm;
        return this;
    }

    public Performance rc(Integer rc) {
        this.rc = rc;
        return this;
    }

    public Performance tpps(Object tpps) {
        this.tpps = tpps;
        return this;
    }

}

