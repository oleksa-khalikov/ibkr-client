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
 * portfolio allocation by sector.
 */
public class SectorAllocation {

    /**
     * long positions allocation.
     */
    @ApiModelProperty(value = "long positions allocation")
    @JsonProperty("long")
    @SerializedName("long")
    private SectorAllocationDetail longSectorAllocation;

    /**
     * short positions allocation.
     */
    @ApiModelProperty(value = "short positions allocation")
    @JsonProperty("short")
    @SerializedName("short")
    private SectorAllocationDetail shortSectorAllocation;

    @Override
    public int hashCode() {
        return Objects.hash(getLongSectorAllocation(), getShortSectorAllocation());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SectorAllocation)) {
            return false;
        }
        SectorAllocation that = (SectorAllocation) o;
        return Objects.equals(getLongSectorAllocation(), that.getLongSectorAllocation()) && Objects.equals(
                getShortSectorAllocation(), that.getShortSectorAllocation());
    }

    @Override
    public String toString() {
        String sb = "SectorAllocation{" + "longSectorAllocation=" + longSectorAllocation + ", shortSectorAllocation="
                + shortSectorAllocation + '}';
        return sb;
    }

    public SectorAllocationDetail getLongSectorAllocation() {
        return longSectorAllocation;
    }

    public void setLongSectorAllocation(SectorAllocationDetail longSectorAllocation) {
        this.longSectorAllocation = longSectorAllocation;
    }

    public SectorAllocationDetail getShortSectorAllocation() {
        return shortSectorAllocation;
    }

    public void setShortSectorAllocation(SectorAllocationDetail shortSectorAllocation) {
        this.shortSectorAllocation = shortSectorAllocation;
    }

}
