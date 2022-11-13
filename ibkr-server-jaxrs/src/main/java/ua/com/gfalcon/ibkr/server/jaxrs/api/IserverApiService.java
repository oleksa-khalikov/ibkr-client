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

import javax.validation.constraints.NotNull;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import ua.com.gfalcon.ibkr.model.AlertRequest;
import ua.com.gfalcon.ibkr.model.Body;
import ua.com.gfalcon.ibkr.model.Conid;
import ua.com.gfalcon.ibkr.model.ModifyOrder;
import ua.com.gfalcon.ibkr.model.OrderRequest;
import ua.com.gfalcon.ibkr.model.ScannerParams;
import ua.com.gfalcon.ibkr.model.SetAccount;
import ua.com.gfalcon.ibkr.model.Symbol;

/**
 * Iserver api service.
 */
public abstract class IserverApiService {

    public abstract Response iserverAccountAccountIdAlertActivatePost(String accountId, Body body,
            SecurityContext securityContext) throws NotFoundException;

    public abstract Response iserverAccountAccountIdAlertAlertIdDelete(String accountId, String alertId,
            SecurityContext securityContext) throws NotFoundException;

    public abstract Response iserverAccountAccountIdAlertPost(String accountId, AlertRequest body,
            SecurityContext securityContext) throws NotFoundException;

    public abstract Response iserverAccountAccountIdAlertsGet(String accountId, SecurityContext securityContext)
            throws NotFoundException;

    public abstract Response iserverAccountAccountIdOrderOrderIdDelete(String accountId, String orderId,
            SecurityContext securityContext) throws NotFoundException;

    public abstract Response iserverAccountAccountIdOrderOrderIdPost(String accountId, String orderId, ModifyOrder body,
            SecurityContext securityContext) throws NotFoundException;

    public abstract Response iserverAccountAccountIdOrderPost(String accountId, OrderRequest body,
            SecurityContext securityContext) throws NotFoundException;

    public abstract Response iserverAccountAccountIdOrderWhatifPost(String accountId, OrderRequest body,
            SecurityContext securityContext) throws NotFoundException;

    public abstract Response iserverAccountAccountIdOrdersPost(String accountId, Body body,
            SecurityContext securityContext) throws NotFoundException;

    public abstract Response iserverAccountAccountIdOrdersWhatifPost(String accountId, Body body,
            SecurityContext securityContext) throws NotFoundException;

    public abstract Response iserverAccountAlertIdGet(String id, SecurityContext securityContext)
            throws NotFoundException;

    public abstract Response iserverAccountMtaGet(SecurityContext securityContext) throws NotFoundException;

    public abstract Response iserverAccountOrderStatusOrderIdGet(String orderId, SecurityContext securityContext)
            throws NotFoundException;

    public abstract Response iserverAccountOrdersFaGroupPost(String faGroup, OrderRequest body,
            SecurityContext securityContext) throws NotFoundException;

    public abstract Response iserverAccountOrdersGet(Body body, SecurityContext securityContext)
            throws NotFoundException;

    public abstract Response iserverAccountPnlPartitionedGet(SecurityContext securityContext) throws NotFoundException;

    public abstract Response iserverAccountPost(SetAccount body, SecurityContext securityContext)
            throws NotFoundException;

    public abstract Response iserverAccountTradesGet(SecurityContext securityContext) throws NotFoundException;

    public abstract Response iserverAccountsGet(SecurityContext securityContext) throws NotFoundException;

    public abstract Response iserverAuthStatusPost(SecurityContext securityContext) throws NotFoundException;

    public abstract Response iserverContractConidAlgosGet(String conid, String algos, String addDescription,
            String addParams, SecurityContext securityContext) throws NotFoundException;

    public abstract Response iserverContractConidInfoAndRulesGet(String conid, @NotNull Boolean isBuy,
            SecurityContext securityContext) throws NotFoundException;

    public abstract Response iserverContractConidInfoGet(String conid, SecurityContext securityContext)
            throws NotFoundException;

    public abstract Response iserverContractRulesPost(Conid conid, SecurityContext securityContext)
            throws NotFoundException;

    public abstract Response iserverMarketdataConidUnsubscribeGet(String conid, SecurityContext securityContext)
            throws NotFoundException;

    public abstract Response iserverMarketdataHistoryGet(@NotNull String conid, @NotNull String period, String exchange,
            String bar, Boolean outsideRth, SecurityContext securityContext) throws NotFoundException;

    public abstract Response iserverMarketdataSnapshotGet(@NotNull String conids, Integer since, String fields,
            SecurityContext securityContext) throws NotFoundException;

    public abstract Response iserverMarketdataUnsubscribeallGet(SecurityContext securityContext)
            throws NotFoundException;

    public abstract Response iserverReauthenticatePost(SecurityContext securityContext) throws NotFoundException;

    public abstract Response iserverReplyReplyidPost(String replyid, Body body, SecurityContext securityContext)
            throws NotFoundException;

    public abstract Response iserverScannerParamsGet(SecurityContext securityContext) throws NotFoundException;

    public abstract Response iserverScannerRunPost(ScannerParams body, SecurityContext securityContext)
            throws NotFoundException;

    public abstract Response iserverSecdefInfoGet(@NotNull String conid, @NotNull String sectype, String month,
            String exchange, String strike, String right, SecurityContext securityContext) throws NotFoundException;

    public abstract Response iserverSecdefSearchPost(Symbol symbol, SecurityContext securityContext)
            throws NotFoundException;

    public abstract Response iserverSecdefStrikesGet(@NotNull String conid, @NotNull String sectype,
            @NotNull String month, String exchange, SecurityContext securityContext) throws NotFoundException;

}
