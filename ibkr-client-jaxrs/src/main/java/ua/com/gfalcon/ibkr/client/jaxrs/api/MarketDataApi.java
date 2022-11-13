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

package ua.com.gfalcon.ibkr.client.jaxrs.api;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import ua.com.gfalcon.ibkr.model.BooleanConfirmed;
import ua.com.gfalcon.ibkr.model.HistoryData;
import ua.com.gfalcon.ibkr.model.MarketData;
import ua.com.gfalcon.ibkr.model.MarketDataCancelSingle;
import ua.com.gfalcon.ibkr.model.SystemError;

/**
 * Client Portal Web API.
 */
@Path("/")
@Api(value = "/", description = "")
public interface MarketDataApi {

    /**
     * Market Data Cancel (Single)
     * <p/>
     * Cancel market data for given conid. To cancel all market data request(s), see /iserver/marketdata/unsubscribeall.
     */
    @GET
    @Path("/iserver/marketdata/{conid}/unsubscribe")
    @Produces({"application/json"})
    @ApiOperation(value = "Market Data Cancel (Single)", tags = {})
    @ApiResponses(
            value = {@ApiResponse(
                    code = 200, message = "confirms market data for conid is cancelled",
                    response = MarketDataCancelSingle.class), @ApiResponse(code = 500, message = "cancel failed")})
    public MarketDataCancelSingle iserverMarketdataConidUnsubscribeGet(@PathParam("conid") String conid);

    /**
     * Market Data History
     * <p/>
     * Get historical market Data for given conid, length of data is controlled by &#39;period&#39; and &#39;bar&#39;.
     * Formatted as: min&#x3D;minute, h&#x3D;hour, d&#x3D;day, w&#x3D;week, m&#x3D;month, y&#x3D;year e.g. period
     * &#x3D;1y with bar &#x3D;1w returns 52 data points (Max of 1000 data points supported). **Note**: There&#39;s a
     * limit of 5 concurrent requests. Excessive requests will return a &#39;Too many requests&#39; status 429
     * response.
     */
    @GET
    @Path("/iserver/marketdata/history")
    @Produces({"application/json"})
    @ApiOperation(value = "Market Data History", tags = {})
    @ApiResponses(
            value = {@ApiResponse(
                    code = 200, message = "Returns an object", response = HistoryData.class), @ApiResponse(
                    code = 429, message = "Too many requests", response = Object.class), @ApiResponse(
                    code = 500, message = "System Error", response = SystemError.class)})
    public HistoryData iserverMarketdataHistoryGet(@QueryParam("conid") String conid,
            @QueryParam("period") String period, @QueryParam("exchange") String exchange, @QueryParam("bar") String bar,
            @QueryParam("outsideRth") Boolean outsideRth);

    /**
     * Market Data
     * <p/>
     * Get Market Data for the given conid(s). The endpoint will return by default bid, ask, last, change, change pct,
     * close, listing exchange. See response fields for a list of available fields that can be request via fields
     * argument. The endpoint /iserver/accounts must be called prior to /iserver/marketdata/snapshot. For derivative
     * contracts the endpoint /iserver/secdef/search must be called first.  If you call any other endpoints that relays
     * back market data for the same contract, such as /iserver/contract/rules then you must query market data again to
     * ensure all fields are properly returned.  First /snapshot endpoint call for given conid will initiate the market
     * data request.  To receive all available fields the /snapshot endpoint will need to be called several times. To
     * receive streaming market data the endpoint /ws can be used. Refer to [Streaming WebSocket
     * Data](https://interactivebrokers.github.io/cpwebapi/RealtimeSubscription.html) for details.
     */
    @GET
    @Path("/iserver/marketdata/snapshot")
    @Produces({"application/json"})
    @ApiOperation(value = "Market Data", tags = {})
    @ApiResponses(
            value = {@ApiResponse(
                    code = 200, message = "Returns an array of objects", response = Object.class,
                    responseContainer = "List"), @ApiResponse(
                    code = 400, message = "sent when accounts are not queried before sending this request",
                    response = Object.class)})
    public List<Object> iserverMarketdataSnapshotGet(@QueryParam("conids") String conids,
            @QueryParam("since") Integer since, @QueryParam("fields") String fields);

    /**
     * Market Data Cancel (All)
     * <p/>
     * Cancel all market data request(s). To cancel market data for given conid, see
     * /iserver/marketdata/{conid}/unsubscribe.
     */
    @GET
    @Path("/iserver/marketdata/unsubscribeall")
    @Produces({"application/json"})
    @ApiOperation(value = "Market Data Cancel (All)", tags = {})
    @ApiResponses(
            value = {@ApiResponse(
                    code = 200, message = "confirms market data is cancelled", response = BooleanConfirmed.class)})
    public BooleanConfirmed iserverMarketdataUnsubscribeallGet();

    /**
     * Market Data Snapshot (Beta)
     * <p/>
     * Get a snapshot of Market Data for the given conid(s).See response for a list of available fields that can be
     * requested from the fields argument. Must be connected to a brokerage session before can query snapshot data.
     * First /snapshot endpoint call for given conid(s) will initiate the market data request, make an additional
     * request to receive field values back. To receive all available fields the /snapshot endpoint will need to be
     * called several times. To receive streaming market data the endpoint /ws can be used. Refer to [Streaming
     * WebSocket Data](https://interactivebrokers.github.io/cpwebapi/RealtimeSubscription.html) for details.
     */
    @GET
    @Path("/md/snapshot")
    @Produces({"application/json"})
    @ApiOperation(value = "Market Data Snapshot (Beta)", tags = {})
    @ApiResponses(
            value = {@ApiResponse(code = 200, message = "An Object", response = MarketData.class), @ApiResponse(
                    code = 401, message = "Authentication failed"), @ApiResponse(
                    code = 500, message = "System failed")})
    public MarketData mdSnapshotGet(@QueryParam("conids") String conids, @QueryParam("fields") String fields);

}

