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

package ua.com.gfalcon.ibkr.server.jaxrs.api;

import javax.servlet.ServletConfig;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import io.swagger.annotations.ApiParam;
import ua.com.gfalcon.ibkr.model.HistoryResult;
import ua.com.gfalcon.ibkr.model.ScannerDirect;
import ua.com.gfalcon.ibkr.model.ScannerDirectResult;
import ua.com.gfalcon.ibkr.server.jaxrs.api.factories.HmdsApiServiceFactory;

/**
 * Hmds Api.
 */
@Path("/hmds")
@Produces({"application/json"})
@io.swagger.annotations.Api(description = "the hmds API")
public class HmdsApi {

    private final HmdsApiService delegate;

    /**
     * Hmds Api.
     */
    public HmdsApi(@Context ServletConfig servletContext) {
        HmdsApiService delegate = null;

        if (servletContext != null) {
            String implClass = servletContext.getInitParameter("HmdsApi.implementation");
            if (implClass != null && !"".equals(implClass.trim())) {
                try {
                    delegate = (HmdsApiService) Class.forName(implClass)
                            .newInstance();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }

        if (delegate == null) {
            delegate = HmdsApiServiceFactory.getHmdsApi();
        }

        this.delegate = delegate;
    }

    @GET
    @Path("/history")
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(
            value = "Market Data History",
            notes = "Using direct to market data farm connection, will provide a list of historical market data"
                    + " for a given conid",
            response = HistoryResult.class, tags = {"MarketData (Beta)"})
    @io.swagger.annotations.ApiResponses(
            value = {@io.swagger.annotations.ApiResponse(
                    code = 200, message = "Valid result", response = HistoryResult.class),
                    @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request", response = Void.class)})
    public Response hmdsHistoryGet(@ApiParam(value = "contract id", required = true) @QueryParam("conid") Integer conid,
            @ApiParam(
                    value = "Time period for history request."
                            + "    * min: Minutes   * h: Hours   * d: Days   * w: Weeks   * m: Months   * y: Years ",
                    required = true, allowableValues = "min, h, d, w, m, y") @QueryParam("period") String period,
            @ApiParam(
                    value = "Duration of time for each candlestick bar."
                            + "   * min: Minutes   * h: Hours   * d: Days   * w: Weeks   * m: Months ",
                    allowableValues = "min, h, d, w, m") @QueryParam("bar") String bar, @ApiParam(
            value = "For contracts that support it, will determine if history data includes outside "
                    + "of regular trading hours.")
            @QueryParam("outsideRth") Boolean outsideRth, @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.hmdsHistoryGet(conid, period, bar, outsideRth, securityContext);
    }

    @POST
    @Path("/scanner")
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(
            value = "Run Scanner (Beta)",
            notes = "Using a direct connection to the market data farm, will provide results to the requested scanner.",
            response = ScannerDirectResult.class, tags = {"Scanner"})
    @io.swagger.annotations.ApiResponses(
            value = {@io.swagger.annotations.ApiResponse(
                    code = 200, message = "Valid result", response = ScannerDirectResult.class),
                    @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request", response = Void.class)})
    public Response hmdsScannerPost(@ApiParam(value = "request body", required = true) ScannerDirect body,
            @Context SecurityContext securityContext) throws NotFoundException {
        return delegate.hmdsScannerPost(body, securityContext);
    }

}
