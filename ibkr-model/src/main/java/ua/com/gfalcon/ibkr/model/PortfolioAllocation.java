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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * Information about the account's portfolio allocation.
 */
public class PortfolioAllocation {

    /**
     * Portfolio allocation by asset class.
     */
    @ApiModelProperty(value = "Portfolio allocation by asset class")
    @JsonProperty("assetClass")
    @SerializedName("assetClass")
    private AssetClassAllocation assetClass;

    /**
     * Portfolio allocation by sector.
     */
    @ApiModelProperty(value = "Portfolio allocation by sector")
    @JsonProperty("sector")
    @SerializedName("sector")
    private SectorAllocation sector;

    /**
     * Portfolio allocation by group.
     */
    @ApiModelProperty(value = "Portfolio allocation by group")
    @JsonProperty("group")
    @SerializedName("group")
    private GroupAllocation group;

    @Override
    public int hashCode() {
        return Objects.hash(getAssetClass(), getSector(), getGroup());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PortfolioAllocation)) {
            return false;
        }
        PortfolioAllocation that = (PortfolioAllocation) o;
        return Objects.equals(getAssetClass(), that.getAssetClass()) && Objects.equals(getSector(), that.getSector())
                && Objects.equals(getGroup(), that.getGroup());
    }

    @Override
    public String toString() {
        String sb =
                "PortfolioAllocation{" + "assetClass=" + assetClass + ", sector=" + sector + ", group=" + group + '}';
        return sb;
    }

    public AssetClassAllocation getAssetClass() {
        return assetClass;
    }

    public void setAssetClass(AssetClassAllocation assetClass) {
        this.assetClass = assetClass;
    }

    public SectorAllocation getSector() {
        return sector;
    }

    public void setSector(SectorAllocation sector) {
        this.sector = sector;
    }

    public GroupAllocation getGroup() {
        return group;
    }

    public void setGroup(GroupAllocation group) {
        this.group = group;
    }

}
