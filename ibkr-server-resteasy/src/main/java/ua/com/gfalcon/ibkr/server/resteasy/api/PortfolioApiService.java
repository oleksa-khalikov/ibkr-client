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

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import ua.com.gfalcon.ibkr.model.AccountAllocationRequest;
import ua.com.gfalcon.ibkr.model.Body;

/**
 * Portfolio api service.
 */
public interface PortfolioApiService {

    Response portfolioAccountIdAllocationGet(String accountId, SecurityContext securityContext)
            throws NotFoundException;

    Response portfolioAccountIdLedgerGet(String accountId, SecurityContext securityContext) throws NotFoundException;

    Response portfolioAccountIdMetaGet(String accountId, SecurityContext securityContext) throws NotFoundException;

    Response portfolioAccountIdPositionConidGet(String accountId, Integer conid, SecurityContext securityContext)
            throws NotFoundException;

    Response portfolioAccountIdPositionsInvalidatePost(String accountId, SecurityContext securityContext)
            throws NotFoundException;

    Response portfolioAccountIdPositionsPageIdGet(String accountId, String pageId, String model, String sort,
            String direction, String period, SecurityContext securityContext) throws NotFoundException;

    Response portfolioAccountIdSummaryGet(String accountId, SecurityContext securityContext) throws NotFoundException;

    Response portfolioAccountsGet(SecurityContext securityContext) throws NotFoundException;

    Response portfolioAllocationPost(AccountAllocationRequest body, SecurityContext securityContext) throws NotFoundException;

    Response portfolioPositionsConidGet(Integer conid, SecurityContext securityContext) throws NotFoundException;

    Response portfolioSubaccountsGet(SecurityContext securityContext) throws NotFoundException;

}
