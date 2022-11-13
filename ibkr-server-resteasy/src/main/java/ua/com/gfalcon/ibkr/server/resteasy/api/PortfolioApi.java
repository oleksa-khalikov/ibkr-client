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
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import io.swagger.annotations.ApiParam;
import ua.com.gfalcon.ibkr.model.Account;
import ua.com.gfalcon.ibkr.model.AccountLedger;
import ua.com.gfalcon.ibkr.model.AccountSummary;
import ua.com.gfalcon.ibkr.model.Accounts;
import ua.com.gfalcon.ibkr.model.Allocation;
import ua.com.gfalcon.ibkr.model.Body;
import ua.com.gfalcon.ibkr.model.Position;

/**
 * Portfolio Api.
 */
@Path("/portfolio")
@Produces({"application/json"})
@io.swagger.annotations.Api(description = "the portfolio API")
public class PortfolioApi {

    @Inject
    PortfolioApiService service;

    @GET
    @Path("/{accountId}/allocation")
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(
            value = "Account Allocation",
            notes = "Information about the account's portfolio allocation by Asset Class, Industry and Category."
                    + "  /portfolio/accounts or /portfolio/subaccounts must be called prior to this endpoint.",
            response = Allocation.class, tags = {"Portfolio"})
    @io.swagger.annotations.ApiResponses(
            value = {@io.swagger.annotations.ApiResponse(
                    code = 200, message = "returns an object of three different allocations",
                    response = Allocation.class)})
    public Response portfolioAccountIdAllocationGet(@PathParam("accountId") String accountId,
            @Context SecurityContext securityContext) throws NotFoundException {
        return service.portfolioAccountIdAllocationGet(accountId, securityContext);
    }

    @GET
    @Path("/{accountId}/ledger")
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(
            value = "Account Ledger",
            notes = "Information regarding settled cash, cash balances, etc. in the account's base currency and any"
                    + " other cash balances hold in other currencies.  /portfolio/accounts or /portfolio/subaccounts"
                    + " must be called prior to this endpoint. The list of supported currencies is available"
                    + " at https://www.interactivebrokers.com/en/index.php?f=3185.",
            response = AccountLedger.class, tags = {"Account", "Portfolio"})
    @io.swagger.annotations.ApiResponses(
            value = {@io.swagger.annotations.ApiResponse(
                    code = 200, message = "200 means successful", response = AccountLedger.class)})
    public Response portfolioAccountIdLedgerGet(@PathParam("accountId") String accountId,
            @Context SecurityContext securityContext) throws NotFoundException {
        return service.portfolioAccountIdLedgerGet(accountId, securityContext);
    }

    @GET
    @Path("/{accountId}/meta")
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(
            value = "Account Information",
            notes = "Account information related to account Id /portfolio/accounts or /portfolio/subaccounts must be"
                    + " called prior to this endpoint.",
            response = Accounts.class, tags = {"Account", "Portfolio"})
    @io.swagger.annotations.ApiResponses(
            value = {@io.swagger.annotations.ApiResponse(
                    code = 200, message = "An object", response = Accounts.class)})
    public Response portfolioAccountIdMetaGet(@PathParam("accountId") String accountId,
            @Context SecurityContext securityContext) throws NotFoundException {
        return service.portfolioAccountIdMetaGet(accountId, securityContext);
    }

    @GET
    @Path("/{accountId}/position/{conid}")
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(
            value = "Position by Conid",
            notes = "Returns a list of all positions matching the conid. For portfolio models the conid could be in"
                    + " more than one model, returning an array with the name of the model it belongs to."
                    + "  /portfolio/accounts or /portfolio/subaccounts must be called prior to this endpoint.",
            response = Position.class, tags = {"Portfolio"})
    @io.swagger.annotations.ApiResponses(
            value = {@io.swagger.annotations.ApiResponse(
                    code = 200, message = "returns a list containing only one position for the conid",
                    response = Position.class)})
    public Response portfolioAccountIdPositionConidGet(@PathParam("accountId") String accountId,
            @PathParam("conid") Integer conid, @Context SecurityContext securityContext) throws NotFoundException {
        return service.portfolioAccountIdPositionConidGet(accountId, conid, securityContext);
    }

    @POST
    @Path("/{accountId}/positions/invalidate")

    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(
            value = "Invalidates the backend cache of the Portfolio", notes = "", response = Object.class,
            tags = {"Portfolio"})
    @io.swagger.annotations.ApiResponses(
            value = {@io.swagger.annotations.ApiResponse(
                    code = 200, message = "Means successful", response = Object.class)})
    public Response portfolioAccountIdPositionsInvalidatePost(@PathParam("accountId") String accountId,
            @Context SecurityContext securityContext) throws NotFoundException {
        return service.portfolioAccountIdPositionsInvalidatePost(accountId, securityContext);
    }

    @GET
    @Path("/{accountId}/positions/{pageId}")

    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(
            value = "Portfolio Positions",
            notes = "Returns a list of positions for the given account. The endpoint supports paging, page's default"
                    + " size is 30 positions. /portfolio/accounts or /portfolio/subaccounts must be called prior"
                    + " to this endpoint.",
            response = Position.class, tags = {"Portfolio"})
    @io.swagger.annotations.ApiResponses(
            value = {@io.swagger.annotations.ApiResponse(
                    code = 200, message = "returns a list of positions in the portfolio", response = Position.class)})
    public Response portfolioAccountIdPositionsPageIdGet(@PathParam("accountId") String accountId,
            @PathParam("pageId") String pageId, @QueryParam("model") String model, @QueryParam("sort") String sort,
            @QueryParam("direction") String direction, @QueryParam("period") String period,
            @Context SecurityContext securityContext) throws NotFoundException {
        return service.portfolioAccountIdPositionsPageIdGet(accountId, pageId, model, sort, direction, period,
                securityContext);
    }

    @GET
    @Path("/{accountId}/summary")
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(
            value = "Account Summary",
            notes = "Returns information about margin, cash balances and other information related to specified"
                    + " account. See also /portfolio/{accountId}/ledger. /portfolio/accounts"
                    + " or /portfolio/subaccounts must be called prior to this endpoint.",
            response = AccountSummary.class, tags = {"Account", "Portfolio"})
    @io.swagger.annotations.ApiResponses(
            value = {@io.swagger.annotations.ApiResponse(
                    code = 200,
                    message = "returns an object containing account summary. The object contains multiple"
                            + " properties. A property is sufficed with -c if its provides commodity value, -s"
                            + " if it provides security value and -c if its UKL segment value",
                    response = AccountSummary.class)})
    public Response portfolioAccountIdSummaryGet(@PathParam("accountId") String accountId,
            @Context SecurityContext securityContext) throws NotFoundException {
        return service.portfolioAccountIdSummaryGet(accountId, securityContext);
    }

    @GET
    @Path("/accounts")
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(
            value = "Portfolio Accounts",
            notes = "In non-tiered account structures, returns a list of accounts for which the user can view"
                    + " position and account information. This endpoint must be called prior to calling other"
                    + " /portfolio endpoints for those accounts. For querying a list of accounts which the user"
                    + " can trade, see /iserver/accounts. For a list of subaccounts in tiered account structures"
                    + " (e.g. financial advisor or ibroker accounts) see /portfolio/subaccounts.",
            response = Accounts.class, tags = {"Account", "Portfolio"})
    @io.swagger.annotations.ApiResponses(
            value = {@io.swagger.annotations.ApiResponse(
                    code = 200, message = "An array", response = Accounts.class)})
    public Response portfolioAccountsGet(@Context SecurityContext securityContext) throws NotFoundException {
        return service.portfolioAccountsGet(securityContext);
    }

    @POST
    @Path("/allocation")
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(
            value = "Account Alloction (All Accounts)",
            notes = "Similar to /portfolio/{accountId}/allocation but returns a consolidated view of of all the"
                    + " accounts returned by /portfolio/accounts. /portfolio/accounts or /portfolio/subaccounts"
                    + " must be called prior to this endpoint.",
            response = Allocation.class, tags = {"Portfolio"})
    @io.swagger.annotations.ApiResponses(
            value = {@io.swagger.annotations.ApiResponse(
                    code = 200, message = "returns an object of three different allocations",
                    response = Allocation.class)})
    public Response portfolioAllocationPost(@ApiParam(value = "accounts info", required = true) Body body,
            @Context SecurityContext securityContext) throws NotFoundException {
        return service.portfolioAllocationPost(body, securityContext);
    }

    @GET
    @Path("/positions/{conid}")
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(
            value = "Positions by Conid",
            notes = "Returns an object of all positions matching the conid for all the selected accounts. For"
                    + " portfolio models the conid could be in more than one model, returning an array with the"
                    + " name of the model it belongs to. /portfolio/accounts or /portfolio/subaccounts must be"
                    + " called prior to this endpoint.",
            response = Object.class, tags = {"Portfolio"})
    @io.swagger.annotations.ApiResponses(
            value = {@io.swagger.annotations.ApiResponse(
                    code = 200, message = "returns an object containing account and its position information",
                    response = Object.class)})
    public Response portfolioPositionsConidGet(@PathParam("conid") Integer conid,
            @Context SecurityContext securityContext) throws NotFoundException {
        return service.portfolioPositionsConidGet(conid, securityContext);
    }

    @GET
    @Path("/subaccounts")
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(
            value = "List of Sub-Accounts",
            notes = "Used in tiered account structures (such as Financial Advisor and IBroker Accounts) to return"
                    + " a list of up to 100 sub-accounts for which the user can view position and account-related"
                    + " information. This endpoint must be called prior to calling other /portfolio endpoints for"
                    + " those sub-accounts. If you have more than 100 sub-accounts use /portfolio/subaccounts2."
                    + " To query a list of accounts the user can trade, see /iserver/accounts.",
            response = Account.class, tags = {"Account", "Portfolio"})
    @io.swagger.annotations.ApiResponses(
            value = {@io.swagger.annotations.ApiResponse(
                    code = 200, message = "An array", response = Account.class)})
    public Response portfolioSubaccountsGet(@Context SecurityContext securityContext) throws NotFoundException {
        return service.portfolioSubaccountsGet(securityContext);
    }

}
