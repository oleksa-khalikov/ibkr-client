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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

/**
 * Group allocation detail.
 */
public class GroupAllocationDetail {

    @JsonProperty("Computers")
    @SerializedName("Computers")
    private BigDecimal computers;

    @JsonProperty("Semiconductors")
    @SerializedName("Semiconductors")
    private BigDecimal semiconductors;

    @JsonProperty("Others")
    @SerializedName("Others")
    private BigDecimal others;

    @JsonProperty("Chemicals")
    @SerializedName("Chemicals")
    private BigDecimal chemicals;

    @JsonProperty("Apparel")
    @SerializedName("Apparel")
    private BigDecimal apparel;

    @JsonProperty("Communications")
    @SerializedName("Communications")
    private BigDecimal communications;

    @JsonProperty("Banks")
    @SerializedName("Banks")
    private BigDecimal banks;

    @JsonProperty("Airlines")
    @SerializedName("Airlines")
    private BigDecimal airlines;

    @JsonProperty("Internet")
    @SerializedName("Internet")
    private BigDecimal internet;

    @Override
    public int hashCode() {
        return Objects.hash(getComputers(), getSemiconductors(), getOthers(), getChemicals(), getApparel(),
                getCommunications(), getBanks(), getAirlines(), getInternet());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GroupAllocationDetail)) {
            return false;
        }
        GroupAllocationDetail that = (GroupAllocationDetail) o;
        return Objects.equals(getComputers(), that.getComputers()) && Objects.equals(getSemiconductors(),
                that.getSemiconductors()) && Objects.equals(getOthers(), that.getOthers()) && Objects.equals(
                getChemicals(), that.getChemicals()) && Objects.equals(getApparel(), that.getApparel())
                && Objects.equals(getCommunications(), that.getCommunications()) && Objects.equals(getBanks(),
                that.getBanks()) && Objects.equals(getAirlines(), that.getAirlines()) && Objects.equals(getInternet(),
                that.getInternet());
    }

    @Override
    public String toString() {
        String sb =
                "GroupAllocationDetail{" + "computers=" + computers + ", semiconductors=" + semiconductors + ", others="
                        + others + ", chemicals=" + chemicals + ", apparel=" + apparel + ", communications="
                        + communications + ", banks=" + banks + ", airlines=" + airlines + ", internet=" + internet
                        + '}';
        return sb;
    }

    public BigDecimal getComputers() {
        return computers;
    }

    public void setComputers(BigDecimal computers) {
        this.computers = computers;
    }

    public BigDecimal getSemiconductors() {
        return semiconductors;
    }

    public void setSemiconductors(BigDecimal semiconductors) {
        this.semiconductors = semiconductors;
    }

    public BigDecimal getOthers() {
        return others;
    }

    public void setOthers(BigDecimal others) {
        this.others = others;
    }

    public BigDecimal getChemicals() {
        return chemicals;
    }

    public void setChemicals(BigDecimal chemicals) {
        this.chemicals = chemicals;
    }

    public BigDecimal getApparel() {
        return apparel;
    }

    public void setApparel(BigDecimal apparel) {
        this.apparel = apparel;
    }

    public BigDecimal getCommunications() {
        return communications;
    }

    public void setCommunications(BigDecimal communications) {
        this.communications = communications;
    }

    public BigDecimal getBanks() {
        return banks;
    }

    public void setBanks(BigDecimal banks) {
        this.banks = banks;
    }

    public BigDecimal getAirlines() {
        return airlines;
    }

    public void setAirlines(BigDecimal airlines) {
        this.airlines = airlines;
    }

    public BigDecimal getInternet() {
        return internet;
    }

    public void setInternet(BigDecimal internet) {
        this.internet = internet;
    }

}
