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

/**
 * Client Portal Web API
 * Client Poral Web API
 * <p>
 * OpenAPI spec version: 1.0.0
 * <p>
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package ua.com.gfalcon.ibkr.client.jaxrs.api;

import java.util.ArrayList;
import java.util.List;

import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import ua.com.gfalcon.ibkr.client.jaxrs.api.PortfolioApi;
import ua.com.gfalcon.ibkr.model.AccountAllocationRequest;
import ua.com.gfalcon.ibkr.model.Body;


/**
 * Client Portal Web API
 *
 * <p>Client Poral Web API
 * <p>
 * API tests for PortfolioApi
 */
public class PortfolioApiTest {


    private PortfolioApi api;

    /**
     * Account Allocation
     * <p>
     * Information about the account&#39;s portfolio allocation by Asset Class, Industry and Category.  /portfolio/accounts or /portfolio/subaccounts must be called prior to this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void portfolioAccountIdAllocationGetTest() {
        String accountId = null;
        //Allocation response = api.portfolioAccountIdAllocationGet(accountId);
        //assertNotNull(response);
        // TODO: test validations


    }

    /**
     * Account Ledger
     * <p>
     * Information regarding settled cash, cash balances, etc. in the account&#39;s base currency and any other cash balances hold in other currencies.  /portfolio/accounts or /portfolio/subaccounts must be called prior to this endpoint. The list of supported currencies is available at https://www.interactivebrokers.com/en/index.php?f&#x3D;3185.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void portfolioAccountIdLedgerGetTest() {
        String accountId = null;
        //Object response = api.portfolioAccountIdLedgerGet(accountId);
        //assertNotNull(response);
        // TODO: test validations


    }

    /**
     * Account Information
     * <p>
     * Account information related to account Id /portfolio/accounts or /portfolio/subaccounts must be called prior to this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void portfolioAccountIdMetaGetTest() {
        String accountId = null;
        //Accounts response = api.portfolioAccountIdMetaGet(accountId);
        //assertNotNull(response);
        // TODO: test validations


    }

    /**
     * Position by Conid
     * <p>
     * Returns a list of all positions matching the conid. For portfolio models the conid could be in more than one model, returning an array with the name of the model it belongs to.  /portfolio/accounts or /portfolio/subaccounts must be called prior to this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void portfolioAccountIdPositionConidGetTest() {
        String accountId = null;
        Integer conid = null;
        //Position response = api.portfolioAccountIdPositionConidGet(accountId, conid);
        //assertNotNull(response);
        // TODO: test validations


    }

    /**
     * Invalidates the backend cache of the Portfolio
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void portfolioAccountIdPositionsInvalidatePostTest() {
        String accountId = null;
        //Object response = api.portfolioAccountIdPositionsInvalidatePost(accountId);
        //assertNotNull(response);
        // TODO: test validations


    }

    /**
     * Portfolio Positions
     * <p>
     * Returns a list of positions for the given account. The endpoint supports paging, page&#39;s default size is 30 positions. /portfolio/accounts or /portfolio/subaccounts must be called prior to this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void portfolioAccountIdPositionsPageIdGetTest() {
        String accountId = null;
        String pageId = null;
        String model = null;
        String sort = null;
        String direction = null;
        String period = null;
        //Position response = api.portfolioAccountIdPositionsPageIdGet(accountId, pageId, model, sort, direction, period);
        //assertNotNull(response);
        // TODO: test validations


    }

    /**
     * Account Summary
     * <p>
     * Returns information about margin, cash balances and other information related to specified account. See also /portfolio/{accountId}/ledger. /portfolio/accounts or /portfolio/subaccounts must be called prior to this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void portfolioAccountIdSummaryGetTest() {
        String accountId = null;
        //Object response = api.portfolioAccountIdSummaryGet(accountId);
        //assertNotNull(response);
        // TODO: test validations


    }

    /**
     * Portfolio Accounts
     * <p>
     * In non-tiered account structures, returns a list of accounts for which the user can view position and account information. This endpoint must be called prior to calling other /portfolio endpoints for those accounts. For querying a list of accounts which the user can trade, see /iserver/accounts. For a list of subaccounts in tiered account structures (e.g. financial advisor or ibroker accounts) see /portfolio/subaccounts.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void portfolioAccountsGetTest() {
        //Accounts response = api.portfolioAccountsGet();
        //assertNotNull(response);
        // TODO: test validations


    }

    /**
     * Account Alloction (All Accounts)
     * <p>
     * Similar to /portfolio/{accountId}/allocation but returns a consolidated view of of all the accounts returned by /portfolio/accounts. /portfolio/accounts or /portfolio/subaccounts must be called prior to this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void portfolioAllocationPostTest() {
        AccountAllocationRequest body = null;
        //Allocation response = api.portfolioAllocationPost(body);
        //assertNotNull(response);
        // TODO: test validations


    }

    /**
     * Positions by Conid
     * <p>
     * Returns an object of all positions matching the conid for all the selected accounts. For portfolio models the conid could be in more than one model, returning an array with the name of the model it belongs to. /portfolio/accounts or /portfolio/subaccounts must be called prior to this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void portfolioPositionsConidGetTest() {
        Integer conid = null;
        //Object response = api.portfolioPositionsConidGet(conid);
        //assertNotNull(response);
        // TODO: test validations


    }

    /**
     * List of Sub-Accounts
     * <p>
     * Used in tiered account structures (such as Financial Advisor and IBroker Accounts) to return a list of up to 100 sub-accounts for which the user can view position and account-related information. This endpoint must be called prior to calling other /portfolio endpoints for those sub-accounts. If you have more than 100 sub-accounts use /portfolio/subaccounts2. To query a list of accounts the user can trade, see /iserver/accounts.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void portfolioSubaccountsGetTest() {
        //Account response = api.portfolioSubaccountsGet();
        //assertNotNull(response);
        // TODO: test validations


    }

    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);

        api = JAXRSClientFactory.create("https://localhost:5000/v1/api", PortfolioApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);

        ClientConfiguration config = WebClient.getConfig(client);
    }

}
