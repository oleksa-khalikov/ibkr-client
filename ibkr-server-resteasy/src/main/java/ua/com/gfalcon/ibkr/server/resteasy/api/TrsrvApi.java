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

package ua.com.gfalcon.ibkr.server.resteasy.api;

import javax.inject.Inject;
import javax.validation.constraints.NotNull;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import io.swagger.annotations.ApiParam;
import ua.com.gfalcon.ibkr.model.Body;
import ua.com.gfalcon.ibkr.model.ConIdRequest;
import ua.com.gfalcon.ibkr.model.Secdef;

/**
 * The trsrv API.
 */
@Path("/trsrv")
@Produces({"application/json"})
@io.swagger.annotations.Api(description = "the trsrv API")
public class TrsrvApi {

    @Inject
    TrsrvApiService service;

    @GET
    @Path("/futures")

    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(
            value = "Security Futures by Symbol",
            notes = "Returns a list of non-expired future contracts for given symbol(s)", response = Object.class,
            tags = {"Contract"})
    @io.swagger.annotations.ApiResponses(
            value = {@io.swagger.annotations.ApiResponse(
                    code = 200, message = "returns an object with symbol and and array of its future contracts",
                    response = Object.class),
                    @io.swagger.annotations.ApiResponse(
                            code = 500, message = "error while processing the request", response = Object.class)})
    public Response trsrvFuturesGet(@NotNull @QueryParam("symbols") String symbols,
            @Context SecurityContext securityContext) throws NotFoundException {
        return service.trsrvFuturesGet(symbols, securityContext);
    }

    @POST
    @Path("/secdef")

    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(
            value = "Secdef by Conid", notes = "Returns a list of security definitions for the given conids",
            response = Secdef.class, tags = {"Contract"})
    @io.swagger.annotations.ApiResponses(
            value = {@io.swagger.annotations.ApiResponse(
                    code = 200, message = "returns an array of secdef info", response = Secdef.class)})
    public Response trsrvSecdefPost(@ApiParam(value = "request body", required = true) ConIdRequest body,
            @Context SecurityContext securityContext) throws NotFoundException {
        return service.trsrvSecdefPost(body, securityContext);
    }

    @GET
    @Path("/secdef/schedule")

    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(
            value = "Get trading schedule for symbol",
            notes = "Returns the trading schedule up to a month for the requested contract", response = Object.class,
            tags = {"Contract"})
    @io.swagger.annotations.ApiResponses(
            value = {@io.swagger.annotations.ApiResponse(
                    code = 200, message = "Returns an object", response = Object.class)})
    public Response trsrvSecdefScheduleGet(@NotNull @QueryParam("assetClass") String assetClass,
            @NotNull @QueryParam("symbol") String symbol, @QueryParam("exchange") String exchange,
            @QueryParam("exchangeFilter") String exchangeFilter, @Context SecurityContext securityContext)
            throws NotFoundException {
        return service.trsrvSecdefScheduleGet(assetClass, symbol, exchange, exchangeFilter, securityContext);
    }

    @GET
    @Path("/stocks")

    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(
            value = "Security Stocks by Symbol",
            notes = "Returns an object contains all stock contracts for given symbol(s)", response = Object.class,
            tags = {"Contract"})
    @io.swagger.annotations.ApiResponses(
            value = {@io.swagger.annotations.ApiResponse(
                    code = 200, message = "returns an object with symbols", response = Object.class),

                    @io.swagger.annotations.ApiResponse(
                            code = 500, message = "error while processing the request", response = Object.class)})
    public Response trsrvStocksGet(@NotNull @QueryParam("symbols") String symbols,
            @Context SecurityContext securityContext) throws NotFoundException {
        return service.trsrvStocksGet(symbols, securityContext);
    }

}
