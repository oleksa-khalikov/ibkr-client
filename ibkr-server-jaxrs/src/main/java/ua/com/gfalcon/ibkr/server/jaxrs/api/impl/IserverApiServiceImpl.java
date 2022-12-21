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

package ua.com.gfalcon.ibkr.server.jaxrs.api.impl;

import javax.validation.constraints.NotNull;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import ua.com.gfalcon.ibkr.model.AlertActivation;
import ua.com.gfalcon.ibkr.model.AlertRequest;
import ua.com.gfalcon.ibkr.model.Body;
import ua.com.gfalcon.ibkr.model.Conid;
import ua.com.gfalcon.ibkr.model.ModifyOrder;
import ua.com.gfalcon.ibkr.model.OrderRequest;
import ua.com.gfalcon.ibkr.model.OrdersRequest;
import ua.com.gfalcon.ibkr.model.ScannerParams;
import ua.com.gfalcon.ibkr.model.SetAccount;
import ua.com.gfalcon.ibkr.model.Symbol;
import ua.com.gfalcon.ibkr.server.jaxrs.api.ApiResponseMessage;
import ua.com.gfalcon.ibkr.server.jaxrs.api.IserverApiService;
import ua.com.gfalcon.ibkr.server.jaxrs.api.NotFoundException;

/**
 * Iserver api service.
 */
public class IserverApiServiceImpl extends IserverApiService {

    @Override
    public Response iserverAccountAccountIdAlertActivatePost(String accountId, AlertActivation body,
            SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    @Override
    public Response iserverAccountAccountIdAlertAlertIdDelete(String accountId, String alertId,
            SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    @Override
    public Response iserverAccountAccountIdAlertPost(String accountId, AlertRequest body,
            SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    @Override
    public Response iserverAccountAccountIdAlertsGet(String accountId, SecurityContext securityContext)
            throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    @Override
    public Response iserverAccountAccountIdOrderOrderIdDelete(String accountId, String orderId,
            SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    @Override
    public Response iserverAccountAccountIdOrderOrderIdPost(String accountId, String orderId, ModifyOrder body,
            SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    @Override
    public Response iserverAccountAccountIdOrderPost(String accountId, OrderRequest body,
            SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    @Override
    public Response iserverAccountAccountIdOrderWhatifPost(String accountId, OrderRequest body,
            SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    @Override
    public Response iserverAccountAccountIdOrdersPost(String accountId, OrdersRequest body, SecurityContext securityContext)
            throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    @Override
    public Response iserverAccountAccountIdOrdersWhatifPost(String accountId, Body body,
            SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    @Override
    public Response iserverAccountAlertIdGet(String id, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    @Override
    public Response iserverAccountMtaGet(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    @Override
    public Response iserverAccountOrderStatusOrderIdGet(String orderId, SecurityContext securityContext)
            throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    @Override
    public Response iserverAccountOrdersFaGroupPost(String faGroup, OrderRequest body, SecurityContext securityContext)
            throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    @Override
    public Response iserverAccountOrdersGet(Body body, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    @Override
    public Response iserverAccountPnlPartitionedGet(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    @Override
    public Response iserverAccountPost(SetAccount body, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    @Override
    public Response iserverAccountTradesGet(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    @Override
    public Response iserverAccountsGet(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    @Override
    public Response iserverAuthStatusPost(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    @Override
    public Response iserverContractConidAlgosGet(String conid, String algos, String addDescription, String addParams,
            SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    @Override
    public Response iserverContractConidInfoAndRulesGet(String conid, @NotNull Boolean isBuy,
            SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    @Override
    public Response iserverContractConidInfoGet(String conid, SecurityContext securityContext)
            throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    @Override
    public Response iserverContractRulesPost(Conid conid, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    @Override
    public Response iserverMarketdataConidUnsubscribeGet(String conid, SecurityContext securityContext)
            throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    @Override
    public Response iserverMarketdataHistoryGet(@NotNull String conid, @NotNull String period, String exchange,
            String bar, Boolean outsideRth, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    @Override
    public Response iserverMarketdataSnapshotGet(@NotNull String conids, Integer since, String fields,
            SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    @Override
    public Response iserverMarketdataUnsubscribeallGet(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    @Override
    public Response iserverReauthenticatePost(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    @Override
    public Response iserverReplyReplyidPost(String replyid, Body body, SecurityContext securityContext)
            throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    @Override
    public Response iserverScannerParamsGet(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    @Override
    public Response iserverScannerRunPost(ScannerParams body, SecurityContext securityContext)
            throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    @Override
    public Response iserverSecdefInfoGet(@NotNull String conid, @NotNull String sectype, String month, String exchange,
            String strike, String right, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    @Override
    public Response iserverSecdefSearchPost(Symbol symbol, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    @Override
    public Response iserverSecdefStrikesGet(@NotNull String conid, @NotNull String sectype, @NotNull String month,
            String exchange, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

}
