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
 * portfolio allocation by group.
 */
public class GroupAllocation {

    /**
     * long positions allocation.
     */
    @ApiModelProperty(value = "long positions allocation")
    @JsonProperty("long")
    @SerializedName("long")
    private GroupAllocationDetail longGroupAllocation;

    /**
     * short positions allocation.
     */
    @ApiModelProperty(value = "short positions allocation")
    @JsonProperty("short")
    @SerializedName("short")
    private GroupAllocationDetail shortGroupAllocation;

    @Override
    public int hashCode() {
        return Objects.hash(getLongGroupAllocation(), getShortGroupAllocation());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GroupAllocation)) {
            return false;
        }
        GroupAllocation that = (GroupAllocation) o;
        return Objects.equals(getLongGroupAllocation(), that.getLongGroupAllocation()) && Objects.equals(
                getShortGroupAllocation(), that.getShortGroupAllocation());
    }

    @Override
    public String toString() {
        String sb = "GroupAllocation{" + "longGroupAllocation=" + longGroupAllocation + ", shortGroupAllocation="
                + shortGroupAllocation + '}';
        return sb;
    }

    public GroupAllocationDetail getLongGroupAllocation() {
        return longGroupAllocation;
    }

    public void setLongGroupAllocation(GroupAllocationDetail longGroupAllocation) {
        this.longGroupAllocation = longGroupAllocation;
    }

    public GroupAllocationDetail getShortGroupAllocation() {
        return shortGroupAllocation;
    }

    public void setShortGroupAllocation(GroupAllocationDetail shortGroupAllocation) {
        this.shortGroupAllocation = shortGroupAllocation;
    }

}
