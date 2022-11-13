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

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * Position Data.
 */
@Validated
public class PositionData {

    /**
     * Contract identifier from IBKR's database.
     **/
    @ApiModelProperty(value = "Contract identifier from IBKR's database.")
    @JsonProperty("conid")
    @SerializedName("conid")
    private BigDecimal conid = null;

    /**
     * Number of shares or quantity of the position.
     **/
    @ApiModelProperty(value = "Number of shares or quantity of the position.")
    @JsonProperty("position")
    @SerializedName("position")
    private BigDecimal position = null;

    /**
     * Average cost of the position.
     **/
    @ApiModelProperty(value = "Average cost of the position.")
    @JsonProperty("avgCost")
    @SerializedName("avgCost")
    private BigDecimal avgCost = null;

    /**
     * Average cost of the position.
     *
     * @return avgCost
     **/
    @JsonProperty("avgCost")
    @ApiModelProperty(value = "Average cost of the position.")
    @Valid
    public BigDecimal getAvgCost() {
        return avgCost;
    }

    public void setAvgCost(BigDecimal avgCost) {
        this.avgCost = avgCost;
    }

    /**
     * Contract identifier from IBKR's database.
     *
     * @return conid
     **/
    @JsonProperty("conid")
    @ApiModelProperty(value = "Contract identifier from IBKR's database.")
    @Valid
    public BigDecimal getConid() {
        return conid;
    }

    public void setConid(BigDecimal conid) {
        this.conid = conid;
    }

    /**
     * Number of shares or quantity of the position.
     *
     * @return position
     **/
    @JsonProperty("position")
    @ApiModelProperty(value = "Number of shares or quantity of the position.")
    @Valid
    public BigDecimal getPosition() {
        return position;
    }

    public void setPosition(BigDecimal position) {
        this.position = position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(conid, position, avgCost);
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PositionData positionData = (PositionData) o;
        return Objects.equals(this.conid, positionData.conid) && Objects.equals(this.position, positionData.position)
                && Objects.equals(this.avgCost, positionData.avgCost);
    }

    @Override
    public String toString() {

        String sb = "class PositionData {\n" + "    conid: " + toIndentedString(conid) + "\n" + "    position: "
                + toIndentedString(position) + "\n" + "    avgCost: " + toIndentedString(avgCost) + "\n" + "}";
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

    public PositionData avgCost(BigDecimal avgCost) {
        this.avgCost = avgCost;
        return this;
    }

    public PositionData conid(BigDecimal conid) {
        this.conid = conid;
        return this;
    }

    public PositionData position(BigDecimal position) {
        this.position = position;
        return this;
    }

}

