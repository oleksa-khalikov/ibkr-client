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

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import ua.com.gfalcon.ibkr.model.Account;
import ua.com.gfalcon.ibkr.model.AccountLedger;
import ua.com.gfalcon.ibkr.model.AccountPnL;
import ua.com.gfalcon.ibkr.model.AccountSummary;
import ua.com.gfalcon.ibkr.model.Accounts;
import ua.com.gfalcon.ibkr.model.BrokerageAccount;
import ua.com.gfalcon.ibkr.model.SetAccount;
import ua.com.gfalcon.ibkr.model.SwitchAccount;

/**
 * Client Portal Web API.
 *
 * <p>Client Poral Web API
 */
@Path("/")
@Api(value = "/", description = "")
public interface AccountApi {

    /**
     * PnL for the selected account
     * <p/>
     * Returns an object containing PnL for the selected account and its models (if any). To receive streaming PnL the
     * endpoint /ws can be used. Refer to [Streaming WebSocket
     * Data](https://interactivebrokers.github.io/cpwebapi/RealtimeSubscription.html) for details.
     */
    @GET
    @Path("/iserver/account/pnl/partitioned")
    @Produces({"application/json"})
    @ApiOperation(value = "PnL for the selected account", tags = {})
    @ApiResponses(
            value = {@ApiResponse(
                    code = 200, message = "An object containing account and model(s) pnl",
                    response = AccountPnL.class)})
    public AccountPnL iserverAccountPnlPartitionedGet();

    /**
     * Switch Account
     * <p/>
     * If an user has multiple accounts, and user wants to get orders, trades, etc. of an account other than currently
     * selected account, then user can update the currently selected account using this API and then can fetch required
     * information for the newly updated account.
     */
    @POST
    @Path("/iserver/account")
    @Produces({"application/json"})
    @ApiOperation(value = "Switch Account", tags = {})
    @ApiResponses(
            value = {@ApiResponse(
                    code = 200, message = "an object containing updated account ID", response = SwitchAccount.class)})
    public SwitchAccount iserverAccountPost(SetAccount body);

    /**
     * Brokerage Accounts
     * <p/>
     * Returns a list of accounts the user has trading access to, their respective aliases and the currently selected
     * account. Note this endpoint must be called before modifying an order or querying open orders.
     */
    @GET
    @Path("/iserver/accounts")
    @Produces({"application/json"})
    @ApiOperation(value = "Brokerage Accounts", tags = {})
    @ApiResponses(
            value = {@ApiResponse(
                    code = 200, message = "An array of accounts", response = BrokerageAccount.class)})
    public BrokerageAccount iserverAccountsGet();

    /**
     * Account Ledger
     * <p/>
     * Information regarding settled cash, cash balances, etc. in the account&#39;s base currency and any other cash
     * balances hold in other currencies.  /portfolio/accounts or /portfolio/subaccounts must be called prior to this
     * endpoint. The list of supported currencies is available at
     * https://www.interactivebrokers.com/en/index.php?f&#x3D;3185.
     */
    @GET
    @Path("/portfolio/{accountId}/ledger")
    @Produces({"application/json"})
    @ApiOperation(value = "Account Ledger", tags = {})
    @ApiResponses(value = {@ApiResponse(code = 200, message = "200 means successful", response = AccountLedger.class)})
    public AccountLedger portfolioAccountIdLedgerGet(@PathParam("accountId") String accountId);

    /**
     * Account Information
     * <p/>
     * Account information related to account Id /portfolio/accounts or /portfolio/subaccounts must be called prior to
     * this endpoint.
     */
    @GET
    @Path("/portfolio/{accountId}/meta")
    @Produces({"application/json"})
    @ApiOperation(value = "Account Information", tags = {})
    @ApiResponses(value = {@ApiResponse(code = 200, message = "An object", response = Accounts.class)})
    public Accounts portfolioAccountIdMetaGet(@PathParam("accountId") String accountId);

    /**
     * Account Summary
     * <p/>
     * Returns information about margin, cash balances and other information related to specified account. See also
     * /portfolio/{accountId}/ledger. /portfolio/accounts or /portfolio/subaccounts must be called prior to this
     * endpoint.
     */
    @GET
    @Path("/portfolio/{accountId}/summary")
    @Produces({"application/json"})
    @ApiOperation(value = "Account Summary", tags = {})
    @ApiResponses(
            value = {@ApiResponse(
                    code = 200,
                    message = "returns an object containing account summary. The object contains multiple properties. "
                            + "A property is sufficed with "
                            + "-c if its provides commodity value, "
                            + "-s if it provides security value and -c if its UKL segment value",
                    response = AccountSummary.class)})
    public AccountSummary portfolioAccountIdSummaryGet(@PathParam("accountId") String accountId);

    /**
     * Portfolio Accounts
     * <p/>
     * In non-tiered account structures, returns a list of accounts for which the user can view position and account
     * information. This endpoint must be called prior to calling other /portfolio endpoints for those accounts. For
     * querying a list of accounts which the user can trade, see /iserver/accounts. For a list of subaccounts in tiered
     * account structures (e.g. financial advisor or ibroker accounts) see /portfolio/subaccounts.
     */
    @GET
    @Path("/portfolio/accounts")
    @Produces({"application/json"})
    @ApiOperation(value = "Portfolio Accounts", tags = {})
    @ApiResponses(value = {@ApiResponse(code = 200, message = "An array", response = Accounts.class)})
    public Accounts portfolioAccountsGet();

    /**
     * List of Sub-Accounts
     * <p/>
     * Used in tiered account structures (such as Financial Advisor and IBroker Accounts) to return a list of up to 100
     * sub-accounts for which the user can view position and account-related information. This endpoint must be called
     * prior to calling other /portfolio endpoints for those sub-accounts. If you have more than 100 sub-accounts use
     * /portfolio/subaccounts2. To query a list of accounts the user can trade, see /iserver/accounts.
     */
    @GET
    @Path("/portfolio/subaccounts")
    @Produces({"application/json"})
    @ApiOperation(value = "List of Sub-Accounts", tags = {})
    @ApiResponses(value = {@ApiResponse(code = 200, message = "An array", response = Account.class)})
    public Account portfolioSubaccountsGet();

}

