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

package ua.com.gfalcon.ibkr.server.resteasy.api.impl;

import javax.enterprise.context.RequestScoped;
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
import ua.com.gfalcon.ibkr.server.resteasy.api.ApiResponseMessage;
import ua.com.gfalcon.ibkr.server.resteasy.api.IserverApiService;
import ua.com.gfalcon.ibkr.server.resteasy.api.NotFoundException;

/**
 * Iserver Api Service.
 */
@RequestScoped
public class IserverApiServiceImpl implements IserverApiService {

    /**
     * Iserver account account id alert activate post.
     */
    public Response iserverAccountAccountIdAlertActivatePost(String accountId, AlertActivation body,
            SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Iserver account account id alert alert id delete.
     */
    public Response iserverAccountAccountIdAlertAlertIdDelete(String accountId, String alertId,
            SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Iserver account account id alert post.
     */
    public Response iserverAccountAccountIdAlertPost(String accountId, AlertRequest body,
            SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Iserver account account id alerts get.
     */
    public Response iserverAccountAccountIdAlertsGet(String accountId, SecurityContext securityContext)
            throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Iserver account account id order order id delete.
     */
    public Response iserverAccountAccountIdOrderOrderIdDelete(String accountId, String orderId,
            SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Iserver account account id order order id post.
     */
    public Response iserverAccountAccountIdOrderOrderIdPost(String accountId, String orderId, ModifyOrder body,
            SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Iserver account account id order post.
     */
    public Response iserverAccountAccountIdOrderPost(String accountId, OrderRequest body,
            SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Iserver account id order what if post.
     */
    public Response iserverAccountAccountIdOrderWhatifPost(String accountId, OrderRequest body,
            SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Iserver account account id orders post.
     */
    public Response iserverAccountAccountIdOrdersPost(String accountId, OrdersRequest body, SecurityContext securityContext)
            throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Iserver account account id orders whatif post.
     */
    public Response iserverAccountAccountIdOrdersWhatifPost(String accountId, Body body,
            SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Iserver account alert id get.
     */
    public Response iserverAccountAlertIdGet(String id, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Iserver account mta get.
     */
    public Response iserverAccountMtaGet(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Iserver account order status order id get.
     */
    public Response iserverAccountOrderStatusOrderIdGet(String orderId, SecurityContext securityContext)
            throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Iserver account orders fa group post.
     */
    public Response iserverAccountOrdersFaGroupPost(String faGroup, OrderRequest body, SecurityContext securityContext)
            throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Iserver account orders get.
     */
    public Response iserverAccountOrdersGet(Body body, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Iserver account pnl partitioned get.
     */
    public Response iserverAccountPnlPartitionedGet(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Iserver account post.
     */
    public Response iserverAccountPost(SetAccount body, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Iserver account trades get.
     */
    public Response iserverAccountTradesGet(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Iserver accounts get.
     */
    public Response iserverAccountsGet(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Iserver auth status post.
     */
    public Response iserverAuthStatusPost(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Iserver contract conid algos get.
     */
    public Response iserverContractConidAlgosGet(String conid, String algos, String addDescription, String addParams,
            SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Iserver contract conid info and rules get.
     */
    public Response iserverContractConidInfoAndRulesGet(String conid, Boolean isBuy, SecurityContext securityContext)
            throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Iserver contract conid info get.
     */
    public Response iserverContractConidInfoGet(String conid, SecurityContext securityContext)
            throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Iserver contract rules post.
     */
    public Response iserverContractRulesPost(Conid conid, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Iserver marketdata conid unsubscribe get.
     */
    public Response iserverMarketdataConidUnsubscribeGet(String conid, SecurityContext securityContext)
            throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Iserver marketdata history get.
     */
    public Response iserverMarketdataHistoryGet(String conid, String period, String exchange, String bar,
            Boolean outsideRth, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Iserver marketdata snapshot get.
     */
    public Response iserverMarketdataSnapshotGet(String conids, Integer since, String fields,
            SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Iserver marketdata unsubscribeall get.
     */
    public Response iserverMarketdataUnsubscribeallGet(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Iserver reauthenticate post.
     */
    public Response iserverReauthenticatePost(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Iserver reply replyid post.
     */
    public Response iserverReplyReplyidPost(String replyid, Body body, SecurityContext securityContext)
            throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Iserver scanner params get.
     */
    public Response iserverScannerParamsGet(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Iserver scanner run post.
     */
    public Response iserverScannerRunPost(ScannerParams body, SecurityContext securityContext)
            throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Iserver secdef info get.
     */
    public Response iserverSecdefInfoGet(String conid, String sectype, String month, String exchange, String strike,
            String right, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Iserver secdef search post.
     */
    public Response iserverSecdefSearchPost(Symbol symbol, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Iserver secdef strikes get.
     */
    public Response iserverSecdefStrikesGet(String conid, String sectype, String month, String exchange,
            SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

}
