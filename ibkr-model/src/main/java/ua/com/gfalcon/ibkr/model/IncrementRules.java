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

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Price increment value contract trades.
 */
@ApiModel(description = "Price increment value contract trades.")
public class IncrementRules {

    /**
     * The minimum contract price on the market that supports the specified increment.
     */
    @ApiModelProperty(value = "The minimum contract price on the market that supports the specified increment.")
    @JsonProperty("lowerEdge")
    @SerializedName("lowerEdge")
    private BigDecimal lowerEdge = null;

    /**
     * The minimum increment value for contract price.
     */
    @ApiModelProperty(value = "The minimum increment value for contract price.")
    @JsonProperty("increment")
    @SerializedName("increment")
    private BigDecimal increment = null;

    @Override
    public int hashCode() {
        return Objects.hash(getLowerEdge(), getIncrement());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IncrementRules)) {
            return false;
        }
        IncrementRules that = (IncrementRules) o;
        return Objects.equals(getLowerEdge(), that.getLowerEdge()) && Objects.equals(getIncrement(),
                that.getIncrement());
    }

    @Override
    public String toString() {
        String sb = "IncrementRules{" + "lowerEdge=" + lowerEdge + ", increment=" + increment + '}';
        return sb;
    }

    /**
     * The minimum contract price on the market that supports the specified increment.
     */
    @ApiModelProperty(value = "The minimum contract price on the market that supports the specified increment.")
    @JsonProperty("lowerEdge")
    public BigDecimal getLowerEdge() {
        return lowerEdge;
    }

    public void setLowerEdge(BigDecimal lowerEdge) {
        this.lowerEdge = lowerEdge;
    }

    /**
     * The minimum increment value for contract price.
     */
    @ApiModelProperty(value = "The minimum increment value for contract price.")
    @JsonProperty("increment")
    public BigDecimal getIncrement() {
        return increment;
    }

    public void setIncrement(BigDecimal increment) {
        this.increment = increment;
    }

}
