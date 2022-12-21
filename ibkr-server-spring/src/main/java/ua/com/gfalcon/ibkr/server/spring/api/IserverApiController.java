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

package ua.com.gfalcon.ibkr.server.spring.api;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.ApiParam;
import ua.com.gfalcon.ibkr.model.AccountPnL;
import ua.com.gfalcon.ibkr.model.AlertActivation;
import ua.com.gfalcon.ibkr.model.AlertRequest;
import ua.com.gfalcon.ibkr.model.AlertResponse;
import ua.com.gfalcon.ibkr.model.AuthStatus;
import ua.com.gfalcon.ibkr.model.Body;
import ua.com.gfalcon.ibkr.model.BooleanConfirmed;
import ua.com.gfalcon.ibkr.model.BrokerageAccount;
import ua.com.gfalcon.ibkr.model.Conid;
import ua.com.gfalcon.ibkr.model.Contract;
import ua.com.gfalcon.ibkr.model.HistoryData;
import ua.com.gfalcon.ibkr.model.MarketDataCancelSingle;
import ua.com.gfalcon.ibkr.model.ModifyOrder;
import ua.com.gfalcon.ibkr.model.OrderRequest;
import ua.com.gfalcon.ibkr.model.OrderStatus;
import ua.com.gfalcon.ibkr.model.OrdersRequest;
import ua.com.gfalcon.ibkr.model.ScannerParams;
import ua.com.gfalcon.ibkr.model.ScannerParamsList;
import ua.com.gfalcon.ibkr.model.ScannerResult;
import ua.com.gfalcon.ibkr.model.SecdefInfo;
import ua.com.gfalcon.ibkr.model.SetAccount;
import ua.com.gfalcon.ibkr.model.SwitchAccount;
import ua.com.gfalcon.ibkr.model.Symbol;
import ua.com.gfalcon.ibkr.model.Trade;

/**
 * Iserver api controller.
 */
@Controller
public class IserverApiController implements IserverApi {

    private static final Logger log = LoggerFactory.getLogger(IserverApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public IserverApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    /**
     * Iserver account account id alert activate post.
     */
    public ResponseEntity<Object> iserverAccountAccountIdAlertActivatePost(
            @ApiParam(value = "account id", required = true) @PathVariable("accountId") String accountId,
            @ApiParam(value = "order request info", required = true) @Valid @RequestBody AlertActivation body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Object>(
                        objectMapper.readValue("{  \"bytes\": [    123,    125  ],  \"empty\": false}", Object.class),
                        HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Iserver account account id alert alert id delete.
     */
    public ResponseEntity<Object> iserverAccountAccountIdAlertAlertIdDelete(
            @ApiParam(value = "account id", required = true) @PathVariable("accountId") String accountId,
            @ApiParam(value = "alert id", required = true) @PathVariable("alertId") String alertId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Object>(
                        objectMapper.readValue("{  \"bytes\": [    123,    125  ],  \"empty\": false}", Object.class),
                        HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Iserver account account id alert post.
     */
    public ResponseEntity<Object> iserverAccountAccountIdAlertPost(
            @ApiParam(value = "account id", required = true) @PathVariable("accountId") String accountId,
            @ApiParam(value = "alert info", required = true) @Valid @RequestBody AlertRequest body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Object>(
                        objectMapper.readValue("{  \"bytes\": [    123,    125  ],  \"empty\": false}", Object.class),
                        HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Iserver account account id alerts get.
     */
    public ResponseEntity<List<Object>> iserverAccountAccountIdAlertsGet(
            @ApiParam(value = "account id", required = true) @PathVariable("accountId") String accountId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Object>>(objectMapper.readValue("{}", List.class),
                        HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Object>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Object>>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Iserver account account id order order id delete.
     */
    public ResponseEntity<Object> iserverAccountAccountIdOrderOrderIdDelete(
            @ApiParam(value = "account id, or fa group if deleting a group order", required = true) @PathVariable(
                    "accountId") String accountId, @ApiParam(
            value = "Customer order id, use /iservers/account/orders endpoint to query orderId.", required = true)
            @PathVariable("orderId") String orderId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Object>(
                        objectMapper.readValue("{  \"bytes\": [    123,    125  ],  \"empty\": false}", Object.class),
                        HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Iserver account account id order order id post.
     */
    public ResponseEntity<List<Object>> iserverAccountAccountIdOrderOrderIdPost(
            @ApiParam(value = "account id, or fa group if modifying a group order", required = true) @PathVariable(
                    "accountId") String accountId, @ApiParam(
            value = "Customer order id, use /iservers/account/orders endpoint to query orderId.", required = true)
            @PathVariable("orderId") String orderId,
            @ApiParam(value = "modify-order request", required = true) @Valid @RequestBody ModifyOrder body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Object>>(objectMapper.readValue("{}", List.class),
                        HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Object>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Object>>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Iserver account account id order post.
     */
    public ResponseEntity<List<Object>> iserverAccountAccountIdOrderPost(
            @ApiParam(value = "account id", required = true) @PathVariable("accountId") String accountId,
            @ApiParam(value = "order request info", required = true) @Valid @RequestBody OrderRequest body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Object>>(objectMapper.readValue("{}", List.class),
                        HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Object>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Object>>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Iserver account account id order what if post.
     */
    public ResponseEntity<Object> iserverAccountAccountIdOrderWhatifPost(
            @ApiParam(value = "account id", required = true) @PathVariable("accountId") String accountId,
            @ApiParam(value = "order info", required = true) @Valid @RequestBody OrderRequest body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Object>(
                        objectMapper.readValue("{  \"bytes\": [    123,    125  ],  \"empty\": false}", Object.class),
                        HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Iserver account account id orders post.
     */
    public ResponseEntity<List<Object>> iserverAccountAccountIdOrdersPost(
            @ApiParam(value = "account id", required = true) @PathVariable("accountId") String accountId,
            @ApiParam(value = "order request info", required = true) @Valid @RequestBody OrdersRequest body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Object>>(objectMapper.readValue("{}", List.class),
                        HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Object>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Object>>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Iserver account account id orders what if post.
     */
    public ResponseEntity<Object> iserverAccountAccountIdOrdersWhatifPost(
            @ApiParam(value = "account id", required = true) @PathVariable("accountId") String accountId,
            @ApiParam(value = "order info", required = true) @Valid @RequestBody Body body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Object>(
                        objectMapper.readValue("{  \"bytes\": [    123,    125  ],  \"empty\": false}", Object.class),
                        HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Iserver account alert id get.
     */
    public ResponseEntity<AlertResponse> iserverAccountAlertIdGet(
            @ApiParam(value = "alert id", required = true) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AlertResponse>(
                        objectMapper.readValue("{\"empty\": false}", AlertResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AlertResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AlertResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Iserver account mta get.
     */
    public ResponseEntity<AlertResponse> iserverAccountMtaGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AlertResponse>(
                        objectMapper.readValue("{\"empty\": false}", AlertResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AlertResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AlertResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Iserver account order status order id get.
     */
    public ResponseEntity<OrderStatus> iserverAccountOrderStatusOrderIdGet(@ApiParam(
            value = "Customer order id, use /iservers/account/orders endpoint to query orderId.", required = true)
            @PathVariable("orderId") String orderId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<OrderStatus>(objectMapper.readValue("{\"empty\": false}", OrderStatus.class),
                        HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<OrderStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<OrderStatus>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Iserver account orders fa group post.
     */
    public ResponseEntity<List<Object>> iserverAccountOrdersFaGroupPost(
            @ApiParam(value = "financial advisor group", required = true) @PathVariable("faGroup") String faGroup,
            @ApiParam(value = "order request info", required = true) @Valid @RequestBody OrderRequest body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Object>>(objectMapper.readValue("{}", List.class),
                        HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Object>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Object>>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Iserver account orders get.
     */
    public ResponseEntity<Object> iserverAccountOrdersGet(
            @ApiParam(value = "an array of filters") @Valid @RequestBody Body body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Object>(
                        objectMapper.readValue("{  \"bytes\": [    123,    125  ],  \"empty\": false}", Object.class),
                        HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Iserver account pnl partitioned get.
     */
    public ResponseEntity<AccountPnL> iserverAccountPnlPartitionedGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AccountPnL>(
                        objectMapper.readValue("{  \"bytes\": [    123,    125  ],  \"empty\": false}",
                                AccountPnL.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AccountPnL>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AccountPnL>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Iserver account post.
     */
    public ResponseEntity<SwitchAccount> iserverAccountPost(
            @ApiParam(value = "account id", required = true) @Valid @RequestBody SetAccount body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<SwitchAccount>(
                        objectMapper.readValue("{  \"bytes\": [    123,    125  ],  \"empty\": false}",
                                SwitchAccount.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<SwitchAccount>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<SwitchAccount>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Iserver account trades get.
     */
    public ResponseEntity<List<Trade>> iserverAccountTradesGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Trade>>(objectMapper.readValue("{}", List.class),
                        HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Trade>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Trade>>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Iserver accounts get.
     */
    public ResponseEntity<BrokerageAccount> iserverAccountsGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<BrokerageAccount>(
                        objectMapper.readValue("{  \"bytes\": [    123,    125  ],  \"empty\": false}",
                                BrokerageAccount.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<BrokerageAccount>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<BrokerageAccount>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Iserver auth status post.
     */
    public ResponseEntity<AuthStatus> iserverAuthStatusPost() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AuthStatus>(objectMapper.readValue("{\"empty\": false}", AuthStatus.class),
                        HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AuthStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AuthStatus>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Iserver contract conid algos get.
     */
    public ResponseEntity<List<Object>> iserverContractConidAlgosGet(
            @ApiParam(value = "IBKR contract identifier", required = true) @PathVariable("conid") String conid,
            @ApiParam(value = "List of algo ids delimited by \";\" to filter by. Max of 8 algos ids can be specified.")
            @Valid @RequestParam(
                    value = "algos", required = false) String algos,
            @ApiParam(value = "Whether or not to add algo descriptions to response. Set to 1 for yes, 0 for no.") @Valid
            @RequestParam(
                    value = "addDescription", required = false) String addDescription,
            @ApiParam(value = "Whether or not to show algo parameters.  Set to 1 for yes, 0 for no.") @Valid
            @RequestParam(
                    value = "addParams", required = false) String addParams) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Object>>(objectMapper.readValue("{}", List.class),
                        HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Object>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Object>>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Iserver contract conid info and rules get.
     */
    public ResponseEntity<Object> iserverContractConidInfoAndRulesGet(
            @ApiParam(value = "IBKR contract identifier", required = true) @PathVariable("conid") String conid,
            @NotNull @ApiParam(
                    value = "Side of the market rules apply too. Set to **true** for Buy Orders, set to **false**"
                            + " for Sell Orders",
                    required = true) @Valid @RequestParam(value = "isBuy", required = true) Boolean isBuy) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Object>(
                        objectMapper.readValue("{  \"bytes\": [    123,    125  ],  \"empty\": false}", Object.class),
                        HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Iserver contract conid info get.
     */
    public ResponseEntity<Contract> iserverContractConidInfoGet(
            @ApiParam(value = "contract id", required = true) @PathVariable("conid") String conid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Contract>(objectMapper.readValue("{\"empty\": false}", Contract.class),
                        HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Contract>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Contract>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * iserverContractRulesPost.
     */
    public ResponseEntity<Object> iserverContractRulesPost(
            @ApiParam(value = "", required = true) @Valid @RequestBody Conid conid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Object>(
                        objectMapper.readValue("{  \"bytes\": [    123,    125  ],  \"empty\": false}", Object.class),
                        HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Iserver marketdata conid unsubscribe get.
     */
    public ResponseEntity<MarketDataCancelSingle> iserverMarketdataConidUnsubscribeGet(
            @ApiParam(value = "contract id", required = true) @PathVariable("conid") String conid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<MarketDataCancelSingle>(
                        objectMapper.readValue("{  \"bytes\": [    123,    125  ],  \"empty\": false}",
                                MarketDataCancelSingle.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<MarketDataCancelSingle>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<MarketDataCancelSingle>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Iserver marketdata history get.
     */
    public ResponseEntity<HistoryData> iserverMarketdataHistoryGet(
            @NotNull @ApiParam(value = "contract id", required = true) @Valid @RequestParam(
                    value = "conid", required = true) String conid, @NotNull @ApiParam(
            value = "available time period-- {1-30}min, {1-8}h, {1-1000}d, {1-792}w, {1-182}m, {1-15}y",
            required = true) @Valid @RequestParam(value = "period", required = true) String period, @ApiParam(
            value = "Exchange of the conid (e.g. ISLAND, NYSE, etc.). Default value is empty which corresponds to"
                    + " primary exchange of the conid.")
            @Valid @RequestParam(
            value = "exchange", required = false) String exchange, @ApiParam(
            value = "possible value-- 1min, 2min, 3min, 5min, 10min, 15min, 30min, 1h, 2h, 3h, 4h, 8h, 1d, 1w, 1m")
            @Valid @RequestParam(
            value = "bar", required = false) String bar, @ApiParam(
            value = "For contracts that support it, will determine if historical data includes outside of regular"
                    + " trading hours.")
            @Valid @RequestParam(
            value = "outsideRth", required = false) Boolean outsideRth) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<HistoryData>(objectMapper.readValue("{\"empty\": false}", HistoryData.class),
                        HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<HistoryData>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<HistoryData>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Iserver marketdata snapshot get.
     */
    public ResponseEntity<List<Object>> iserverMarketdataSnapshotGet(@NotNull @ApiParam(
            value = "list of conids separated by comma", required = true) @Valid
            @RequestParam(value = "conids", required = true) String conids,
            @ApiParam(value = "time period since which updates are required. uses epoch time with milliseconds.") @Valid
            @RequestParam(
                    value = "since", required = false) Integer since,
            @ApiParam(value = "list of fields separated by comma") @Valid @RequestParam(
                    value = "fields", required = false) String fields) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Object>>(objectMapper.readValue("{}", List.class),
                        HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Object>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Object>>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Iserver marketdata unsubscribeall get.
     */
    public ResponseEntity<BooleanConfirmed> iserverMarketdataUnsubscribeallGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<>(
                        objectMapper.readValue("{  \"bytes\": [    123,    125  ],  \"empty\": false}",
                                BooleanConfirmed.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Iserver reauthenticate post.
     */
    public ResponseEntity<AuthStatus> iserverReauthenticatePost() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AuthStatus>(objectMapper.readValue("{\"empty\": false}", AuthStatus.class),
                        HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AuthStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AuthStatus>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Iserver reply replyid post.
     */
    public ResponseEntity<List<Object>> iserverReplyReplyidPost(@ApiParam(
            value = "Please use the \"id\" from the response of \"Place Order\" endpoint", required = true)
            @PathVariable("replyid") String replyid,
            @ApiParam(value = "Answer to question", required = true) @Valid @RequestBody Body body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Object>>(objectMapper.readValue("{}", List.class),
                        HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Object>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Object>>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Iserver scanner params get.
     */
    public ResponseEntity<ScannerParamsList> iserverScannerParamsGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ScannerParamsList>(
                        objectMapper.readValue("{  \"bytes\": [    123,    125  ],  \"empty\": false}",
                                ScannerParamsList.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ScannerParamsList>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ScannerParamsList>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Iserver scanner run post.
     */
    public ResponseEntity<List<ScannerResult>> iserverScannerRunPost(
            @ApiParam(value = "scanner-params request", required = true) @Valid @RequestBody ScannerParams body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ScannerResult>>(
                        (List<ScannerResult>) objectMapper.readerForListOf(ScannerResult.class)
                                .readValue("{}"), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ScannerResult>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ScannerResult>>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Iserver secdef info get.
     */
    public ResponseEntity<List<SecdefInfo>> iserverSecdefInfoGet(
            @NotNull @ApiParam(value = "underlying contract id", required = true) @Valid @RequestParam(
                    value = "conid", required = true) String conid,
            @NotNull @ApiParam(value = "FUT/OPT/WAR/CASH/CFD", required = true) @Valid @RequestParam(
                    value = "sectype", required = true) String sectype,
            @ApiParam(value = "contract month, only required for FUT/OPT/WAR in the format MMMYY, example JAN00") @Valid
            @RequestParam(
                    value = "month", required = false) String month,
            @ApiParam(value = "optional, default is SMART") @Valid @RequestParam(
                    value = "exchange", required = false) String exchange,
            @ApiParam(value = "optional, only required for OPT/WAR") @Valid @RequestParam(
                    value = "strike", required = false) String strike,
            @ApiParam(value = "C for call, P for put") @Valid @RequestParam(
                    value = "right", required = false) String right) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<SecdefInfo>>(objectMapper.readValue("{}", List.class),
                        HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<SecdefInfo>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<SecdefInfo>>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Iserver secdef search post.
     */
    public ResponseEntity<List<Object>> iserverSecdefSearchPost(@ApiParam(
            value = "Symbol or Company Name to be searched", required = true) @Valid @RequestBody Symbol symbol) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Object>>(objectMapper.readValue("{}", List.class),
                        HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Object>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Object>>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Iserver secdef strikes get.
     */
    public ResponseEntity<Object> iserverSecdefStrikesGet(
            @NotNull @ApiParam(value = "contract id of the underlying contract", required = true) @Valid @RequestParam(
                    value = "conid", required = true) String conid,
            @NotNull @ApiParam(value = "OPT/WAR", required = true) @Valid @RequestParam(
                    value = "sectype", required = true) String sectype,
            @NotNull @ApiParam(value = "contract month", required = true) @Valid @RequestParam(
                    value = "month", required = true) String month,
            @ApiParam(value = "optional, default is SMART") @Valid @RequestParam(
                    value = "exchange", required = false) String exchange) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Object>(
                        objectMapper.readValue("{  \"bytes\": [    123,    125  ],  \"empty\": false}", Object.class),
                        HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

}
