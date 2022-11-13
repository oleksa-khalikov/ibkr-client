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

/*
 * Client Portal Web API
 * Client Poral Web API
 *
 * OpenAPI spec version: 1.0.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ua.com.gfalcon.ibkr.client.okhttp.api;

import org.junit.Ignore;
import org.junit.Test;

import ua.com.gfalcon.ibkr.model.Account;
import ua.com.gfalcon.ibkr.model.Accounts;
import ua.com.gfalcon.ibkr.model.Allocation;
import ua.com.gfalcon.ibkr.model.Body;
import ua.com.gfalcon.ibkr.model.Position;

/**
 * API tests for PortfolioApi
 */
@Ignore
public class PortfolioApiTest {

    private final PortfolioApi api = new PortfolioApi();


    /**
     * Account Allocation
     * <p>
     * Information about the account&#39;s portfolio allocation by Asset Class, Industry and Category.
     * /portfolio/accounts or /portfolio/subaccounts must be called prior to this endpoint.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void portfolioAccountIdAllocationGetTest() throws Exception {
        String accountId = null;
        Allocation response = api.portfolioAccountIdAllocationGet(accountId);

        // TODO: test validations
    }

    /**
     * Account Ledger
     * <p>
     * Information regarding settled cash, cash balances, etc. in the account&#39;s base currency and any other cash
     * balances hold in other currencies.  /portfolio/accounts or /portfolio/subaccounts must be called prior to this
     * endpoint. The list of supported currencies is available at
     * https://www.interactivebrokers.com/en/index.php?f&#x3D;3185.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void portfolioAccountIdLedgerGetTest() throws Exception {
        String accountId = null;
        Object response = api.portfolioAccountIdLedgerGet(accountId);

        // TODO: test validations
    }

    /**
     * Account Information
     * <p>
     * Account information related to account Id /portfolio/accounts or /portfolio/subaccounts must be called prior to
     * this endpoint.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void portfolioAccountIdMetaGetTest() throws Exception {
        String accountId = null;
        Accounts response = api.portfolioAccountIdMetaGet(accountId);

        // TODO: test validations
    }

    /**
     * Position by Conid
     * <p>
     * Returns a list of all positions matching the conid. For portfolio models the conid could be in more than one
     * model, returning an array with the name of the model it belongs to.  /portfolio/accounts or
     * /portfolio/subaccounts must be called prior to this endpoint.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void portfolioAccountIdPositionConidGetTest() throws Exception {
        String accountId = null;
        Integer conid = null;
        Position response = api.portfolioAccountIdPositionConidGet(accountId, conid);

        // TODO: test validations
    }

    /**
     * Invalidates the backend cache of the Portfolio
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void portfolioAccountIdPositionsInvalidatePostTest() throws Exception {
        String accountId = null;
        Object response = api.portfolioAccountIdPositionsInvalidatePost(accountId);

        // TODO: test validations
    }

    /**
     * Portfolio Positions
     * <p>
     * Returns a list of positions for the given account. The endpoint supports paging, page&#39;s default size is 30
     * positions. /portfolio/accounts or /portfolio/subaccounts must be called prior to this endpoint.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void portfolioAccountIdPositionsPageIdGetTest() throws Exception {
        String accountId = null;
        String pageId = null;
        String model = null;
        String sort = null;
        String direction = null;
        String period = null;
        Position response = api.portfolioAccountIdPositionsPageIdGet(accountId, pageId, model, sort, direction, period);

        // TODO: test validations
    }

    /**
     * Account Summary
     * <p>
     * Returns information about margin, cash balances and other information related to specified account. See also
     * /portfolio/{accountId}/ledger. /portfolio/accounts or /portfolio/subaccounts must be called prior to this
     * endpoint.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void portfolioAccountIdSummaryGetTest() throws Exception {
        String accountId = null;
        Object response = api.portfolioAccountIdSummaryGet(accountId);

        // TODO: test validations
    }

    /**
     * Portfolio Accounts
     * <p>
     * In non-tiered account structures, returns a list of accounts for which the user can view position and account
     * information. This endpoint must be called prior to calling other /portfolio endpoints for those accounts. For
     * querying a list of accounts which the user can trade, see /iserver/accounts. For a list of subaccounts in tiered
     * account structures (e.g. financial advisor or ibroker accounts) see /portfolio/subaccounts.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void portfolioAccountsGetTest() throws Exception {
        Accounts response = api.portfolioAccountsGet();

        // TODO: test validations
    }

    /**
     * Account Alloction (All Accounts)
     * <p>
     * Similar to /portfolio/{accountId}/allocation but returns a consolidated view of of all the accounts returned by
     * /portfolio/accounts. /portfolio/accounts or /portfolio/subaccounts must be called prior to this endpoint.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void portfolioAllocationPostTest() throws Exception {
        Body body = null;
        Allocation response = api.portfolioAllocationPost(body);

        // TODO: test validations
    }

    /**
     * Positions by Conid
     * <p>
     * Returns an object of all positions matching the conid for all the selected accounts. For portfolio models the
     * conid could be in more than one model, returning an array with the name of the model it belongs to.
     * /portfolio/accounts or /portfolio/subaccounts must be called prior to this endpoint.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void portfolioPositionsConidGetTest() throws Exception {
        Integer conid = null;
        Object response = api.portfolioPositionsConidGet(conid);

        // TODO: test validations
    }

    /**
     * List of Sub-Accounts
     * <p>
     * Used in tiered account structures (such as Financial Advisor and IBroker Accounts) to return a list of up to 100
     * sub-accounts for which the user can view position and account-related information. This endpoint must be called
     * prior to calling other /portfolio endpoints for those sub-accounts. If you have more than 100 sub-accounts use
     * /portfolio/subaccounts2. To query a list of accounts the user can trade, see /iserver/accounts.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void portfolioSubaccountsGetTest() throws Exception {
        Account response = api.portfolioSubaccountsGet();

        // TODO: test validations
    }

}
