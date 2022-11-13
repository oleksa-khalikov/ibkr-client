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

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import ua.com.gfalcon.ibkr.model.Body;
import ua.com.gfalcon.ibkr.model.Performance;
import ua.com.gfalcon.ibkr.model.Summary;
import ua.com.gfalcon.ibkr.model.Transactions;

/**
 * Client Portal Web API.
 *
 * <p>Client Poral Web API
 */
@Path("/")
@Api(value = "/", description = "")
public interface PortfolioAnalystApi {

    /**
     * Account Performance
     * <p/>Returns the performance (MTM) for the given accounts, if more than one account is passed, the result is
     * consolidated.
     */
    @POST
    @Path("/pa/performance")
    @Produces({"application/json"})
    @ApiOperation(value = "Account Performance", tags = {})
    @ApiResponses(value = {@ApiResponse(code = 200, message = "returns an object", response = Performance.class)})
    public Performance paPerformancePost(Body body);

    /**
     * Account Balance&#39;s Summary
     *
     * <p>Returns a summary of all account balances for the given accounts,
     * if more than one account is passed, the result
     * is consolidated.
     */
    @POST
    @Path("/pa/summary")
    @Produces({"application/json"})
    @ApiOperation(value = "Account Balance's Summary", tags = {})
    @ApiResponses(value = {@ApiResponse(code = 200, message = "returns an object", response = Summary.class)})
    public Summary paSummaryPost(Body body);

    /**
     * Position&#39;s Transaction History.
     * Transaction history for a given number of conids and accounts. Types of transactions include dividend payments,
     * buy and sell transactions, transfers.
     */
    @POST
    @Path("/pa/transactions")
    @Produces({"application/json"})
    @ApiOperation(value = "Position's Transaction History", tags = {})
    @ApiResponses(value = {@ApiResponse(code = 200, message = "returns an object", response = Transactions.class)})
    public Transactions paTransactionsPost(Body body);

}

