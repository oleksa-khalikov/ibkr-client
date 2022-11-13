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

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import ua.com.gfalcon.ibkr.model.Body;
import ua.com.gfalcon.ibkr.model.ModifyOrder;
import ua.com.gfalcon.ibkr.model.OrderRequest;
import ua.com.gfalcon.ibkr.model.OrderStatus;

/**
 * API tests for OrderApi
 */
@Ignore
public class OrderApiTest {

    private final OrderApi api = new OrderApi();


    /**
     * Cancel Order
     * <p>
     * Cancels an open order. Must call /iserver/accounts endpoint prior to cancelling an order. Use
     * /iservers/account/orders endpoint to review open-order(s) and get latest order status.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void iserverAccountAccountIdOrderOrderIdDeleteTest() throws Exception {
        String accountId = null;
        String orderId = null;
        Object response = api.iserverAccountAccountIdOrderOrderIdDelete(accountId, orderId);

        // TODO: test validations
    }

    /**
     * Modify Order
     * <p>
     * Modifies an open order. Must call /iserver/accounts endpoint prior to modifying an order. Use
     * /iservers/account/orders endpoint to review open-order(s).
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void iserverAccountAccountIdOrderOrderIdPostTest() throws Exception {
        String accountId = null;
        String orderId = null;
        ModifyOrder body = null;
        List<Object> response = api.iserverAccountAccountIdOrderOrderIdPost(accountId, orderId, body);

        // TODO: test validations
    }

    /**
     * Place Order (Deprecated)
     * <p>
     * This endpoint is going to be deprecated, you can use /iserver/account/{accountId}/orders, just pass one order in
     * the array, the order structure will be same. Please note here, sometimes this endpoint alone can&#39;t make sure
     * you submit the order successfully, you could receive some questions in the response, you have to to answer them
     * in order to submit the order successfully. You can use \&quot;/iserver/reply/{replyid}\&quot; endpoint to answer
     * questions
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void iserverAccountAccountIdOrderPostTest() throws Exception {
        String accountId = null;
        OrderRequest body = null;
        List<Object> response = api.iserverAccountAccountIdOrderPost(accountId, body);

        // TODO: test validations
    }

    /**
     * Preview Order (Deprecated)
     * <p>
     * This end-point is going to be deprecated, you can use /iserver/account/{accountId}/orders/whatif, just pass one
     * order in the array, the order structure will be same. This endpoint allows you to preview order without actually
     * submitting the order and you can get commission information in the response.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void iserverAccountAccountIdOrderWhatifPostTest() throws Exception {
        String accountId = null;
        OrderRequest body = null;
        Object response = api.iserverAccountAccountIdOrderWhatifPost(accountId, body);

        // TODO: test validations
    }

    /**
     * Place Orders
     * <p>
     * When connected to an IServer Brokerage Session, this endpoint will allow you to submit orders.  CP WEB API
     * supports various advanced orderTypes, for additional details and examples refer to [IBKR Quant
     * Blog](https://www.tradersinsight.news/category/ibkr-quant-news/programming_languages/rest-development/).   *
     * Bracket - Attach additional opposite-side order(s) by using a single **cOID** sent with the parent and set the
     * same value for **parentId** in each child order(s).   * Cash Quantity -  Send orders using monetary value by
     * specifying **cashQty** instead of quantity, e.g. cashQty: 200. The endpoint /iserver/contract/rules returns list
     * of valid orderTypes in cqtTypes.   * Currency Conversion - Convert cash from one currency to another by including
     * **isCcyConv** &#x3D; **true**. To specify the cash quantity use **fxQTY** instead of quantity, e.g. fxQTY: 100.
     * * Fractional - Contracts that support fractional shares can be traded by specifying **quantity** as a float, e.g.
     * quantity: 0.001. The endpoint /iserver/contract/rules returns a list of valid orderTypes in fraqTypes.   * IB
     * Algos - Attached user-defined settings to your trades by using any of IBKR&#39;s Algo Orders. Use the endpoint
     * /iserver/contract/{conid}/algos to identify the available strategies for a contract.   * One-Cancels-All (OCA) -
     * Group multiple unrelated orders by passing order request info in an array and including **isSingleGroup &#x3D;
     * true** for each order. All orders will be assigned the same oca_group_id.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void iserverAccountAccountIdOrdersPostTest() throws Exception {
        String accountId = null;
        Body body = null;
        List<Object> response = api.iserverAccountAccountIdOrdersPost(accountId, body);

        // TODO: test validations
    }

    /**
     * Preview Orders
     * <p>
     * This endpoint allows you to preview order without actually submitting the order and you can get commission
     * information in the response. Also supports bracket orders.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void iserverAccountAccountIdOrdersWhatifPostTest() throws Exception {
        String accountId = null;
        Body body = null;
        Object response = api.iserverAccountAccountIdOrdersWhatifPost(accountId, body);

        // TODO: test validations
    }

    /**
     * Order Status
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void iserverAccountOrderStatusOrderIdGetTest() throws Exception {
        String orderId = null;
        OrderStatus response = api.iserverAccountOrderStatusOrderIdGet(orderId);

        // TODO: test validations
    }

    /**
     * Place Orders for FA
     * <p>
     * Financial Advisors can use this endpoint to place an order for a specified group. To place an order for a
     * specified account use the endpoint /iserver/account/{accountId}/order. More information about groups can be found
     * in the [TWS Users&#39;
     * Guide:](https://guides.interactivebrokers.com/twsguide/twsguide.htm#usersguidebook/financialadvisors/create_an_account_group_for_share_allocation.htm).
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void iserverAccountOrdersFaGroupPostTest() throws Exception {
        String faGroup = null;
        OrderRequest body = null;
        List<Object> response = api.iserverAccountOrdersFaGroupPost(faGroup, body);

        // TODO: test validations
    }

    /**
     * Live Orders
     * <p>
     * The endpoint is meant to be used in polling mode, e.g. requesting every x seconds. The response will contain two
     * objects, one is notification, the other is orders. Orders is the list of live orders (cancelled, filled,
     * submitted). Notifications contains information about execute orders as they happen, see status field. To receive
     * streaming live orders the endpoint /ws can be used. Refer to [Streaming WebSocket
     * Data](https://interactivebrokers.github.io/cpwebapi/RealtimeSubscription.html) for details.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void iserverAccountOrdersGetTest() throws Exception {
        Body body = null;
        Object response = api.iserverAccountOrdersGet(body);

        // TODO: test validations
    }

    /**
     * Place Order Reply
     * <p>
     * Reply to questions when placing orders and submit orders
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void iserverReplyReplyidPostTest() throws Exception {
        String replyid = null;
        Body body = null;
        List<Object> response = api.iserverReplyReplyidPost(replyid, body);

        // TODO: test validations
    }

}
