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
 * Sector allocation detail.
 */
public class SectorAllocationDetail {

    @JsonProperty("Others")
    @SerializedName("Others")
    private BigDecimal others;

    @JsonProperty("Utilities")
    @SerializedName("Utilities")
    private BigDecimal utilities;

    @JsonProperty("Energy")
    @SerializedName("Energy")
    private BigDecimal energy;

    @JsonProperty("Technology")
    @SerializedName("Technology")
    private BigDecimal technology;

    @JsonProperty("Financial")
    @SerializedName("Financial")
    private BigDecimal financial;

    @JsonProperty("Communications")
    @SerializedName("Communications")
    private BigDecimal communications;

    @JsonProperty("Industrial")
    @SerializedName("Industrial")
    private BigDecimal industrial;

    @JsonProperty("Consumer")
    @SerializedName("Consumer")
    private BigDecimal consumer;

    @JsonProperty("Diversified")
    @SerializedName("Diversified")
    private BigDecimal diversified;

    @Override
    public int hashCode() {
        return Objects.hash(getOthers(), getUtilities(), getEnergy(), getTechnology(), getFinancial(),
                getCommunications(), getIndustrial(), getConsumer(), getDiversified());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SectorAllocationDetail)) {
            return false;
        }
        SectorAllocationDetail that = (SectorAllocationDetail) o;
        return Objects.equals(getOthers(), that.getOthers()) && Objects.equals(getUtilities(), that.getUtilities())
                && Objects.equals(getEnergy(), that.getEnergy()) && Objects.equals(getTechnology(),
                that.getTechnology()) && Objects.equals(getFinancial(), that.getFinancial()) && Objects.equals(
                getCommunications(), that.getCommunications()) && Objects.equals(getIndustrial(), that.getIndustrial())
                && Objects.equals(getConsumer(), that.getConsumer()) && Objects.equals(getDiversified(),
                that.getDiversified());
    }

    @Override
    public String toString() {
        String sb = "SectorAllocationDetail{" + "others=" + others + ", utilities=" + utilities + ", energy=" + energy
                + ", technology=" + technology + ", financial=" + financial + ", communications=" + communications
                + ", industrial=" + industrial + ", consumer=" + consumer + ", diversified=" + diversified + '}';
        return sb;
    }

    public BigDecimal getOthers() {
        return others;
    }

    public void setOthers(BigDecimal others) {
        this.others = others;
    }

    public BigDecimal getUtilities() {
        return utilities;
    }

    public void setUtilities(BigDecimal utilities) {
        this.utilities = utilities;
    }

    public BigDecimal getEnergy() {
        return energy;
    }

    public void setEnergy(BigDecimal energy) {
        this.energy = energy;
    }

    public BigDecimal getTechnology() {
        return technology;
    }

    public void setTechnology(BigDecimal technology) {
        this.technology = technology;
    }

    public BigDecimal getFinancial() {
        return financial;
    }

    public void setFinancial(BigDecimal financial) {
        this.financial = financial;
    }

    public BigDecimal getCommunications() {
        return communications;
    }

    public void setCommunications(BigDecimal communications) {
        this.communications = communications;
    }

    public BigDecimal getIndustrial() {
        return industrial;
    }

    public void setIndustrial(BigDecimal industrial) {
        this.industrial = industrial;
    }

    public BigDecimal getConsumer() {
        return consumer;
    }

    public void setConsumer(BigDecimal consumer) {
        this.consumer = consumer;
    }

    public BigDecimal getDiversified() {
        return diversified;
    }

    public void setDiversified(BigDecimal diversified) {
        this.diversified = diversified;
    }

}
