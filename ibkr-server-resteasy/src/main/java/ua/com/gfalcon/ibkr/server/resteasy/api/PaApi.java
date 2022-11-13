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
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import io.swagger.annotations.ApiParam;
import ua.com.gfalcon.ibkr.model.Body;
import ua.com.gfalcon.ibkr.model.Performance;
import ua.com.gfalcon.ibkr.model.Summary;
import ua.com.gfalcon.ibkr.model.Transactions;

/**
 * PA API.
 */
@Path("/pa")
@Produces({"application/json"})
@io.swagger.annotations.Api(description = "the pa API")
public class PaApi {

    @Inject
    PaApiService service;

    @POST
    @Path("/performance")
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(
            value = "Account Performance",
            notes = "Returns the performance (MTM) for the given accounts, if more than one account is passed, the"
                    + " result is consolidated.",
            response = Performance.class, tags = {"PortfolioAnalyst"})
    @io.swagger.annotations.ApiResponses(
            value = {@io.swagger.annotations.ApiResponse(
                    code = 200, message = "returns an object", response = Performance.class)})
    public Response paPerformancePost(@ApiParam(value = "an array of account ids", required = true) Body body,
            @Context SecurityContext securityContext) throws NotFoundException {
        return service.paPerformancePost(body, securityContext);
    }

    @POST
    @Path("/summary")
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(
            value = "Account Balance's Summary",
            notes = "Returns a summary of all account balances for the given accounts, if more than one account is"
                    + " passed, the result is consolidated.",
            response = Summary.class, tags = {"PortfolioAnalyst"})
    @io.swagger.annotations.ApiResponses(
            value = {@io.swagger.annotations.ApiResponse(
                    code = 200, message = "returns an object", response = Summary.class)})
    public Response paSummaryPost(@ApiParam(value = "an array of account ids", required = true) Body body,
            @Context SecurityContext securityContext) throws NotFoundException {
        return service.paSummaryPost(body, securityContext);
    }

    @POST
    @Path("/transactions")
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(
            value = "Position's Transaction History",
            notes = "transaction history for a given number of conids and accounts. Types of transactions include"
                    + " dividend payments, buy and sell transactions, transfers. ",
            response = Transactions.class, tags = {"PortfolioAnalyst"})
    @io.swagger.annotations.ApiResponses(
            value = {@io.swagger.annotations.ApiResponse(
                    code = 200, message = "returns an object", response = Transactions.class)})
    public Response paTransactionsPost(@ApiParam(value = "", required = true) Body body,
            @Context SecurityContext securityContext) throws NotFoundException {
        return service.paTransactionsPost(body, securityContext);
    }

}
