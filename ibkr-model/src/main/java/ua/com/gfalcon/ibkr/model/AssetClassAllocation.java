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
 * portfolio allocation by asset class.
 */
public class AssetClassAllocation {

    /**
     * long positions allocation.
     */
    @ApiModelProperty(value = "long positions allocation")
    @JsonProperty("long")
    @SerializedName("long")
    private AssetClassAllocationDetail longAssetClass;

    /**
     * short positions allocation.
     */
    @ApiModelProperty(value = "short positions allocation")
    @JsonProperty("short")
    @SerializedName("short")
    private AssetClassAllocationDetail shortAssetClass;

    @Override
    public int hashCode() {
        return Objects.hash(getLongAssetClass(), getShortAssetClass());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AssetClassAllocation)) {
            return false;
        }
        AssetClassAllocation that = (AssetClassAllocation) o;
        return Objects.equals(getLongAssetClass(), that.getLongAssetClass()) && Objects.equals(getShortAssetClass(),
                that.getShortAssetClass());
    }

    @Override
    public String toString() {
        String sb =
                "AssetClassAllocation{" + "longAssetClass=" + longAssetClass + ", shortAssetClass=" + shortAssetClass
                        + '}';
        return sb;
    }

    public AssetClassAllocationDetail getLongAssetClass() {
        return longAssetClass;
    }

    public void setLongAssetClass(AssetClassAllocationDetail longAssetClass) {
        this.longAssetClass = longAssetClass;
    }

    public AssetClassAllocationDetail getShortAssetClass() {
        return shortAssetClass;
    }

    public void setShortAssetClass(AssetClassAllocationDetail shortAssetClass) {
        this.shortAssetClass = shortAssetClass;
    }

}
