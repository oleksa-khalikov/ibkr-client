/*
 *   Copyright 2016-2022 Oleksii V. KHALIKOV
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.27).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

package ua.com.gfalcon.ibkr.server.spring.api;

import java.math.BigDecimal;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import ua.com.gfalcon.ibkr.model.Auth;
import ua.com.gfalcon.ibkr.model.OrderData;
import ua.com.gfalcon.ibkr.model.PositionData;

/**
 * CCP API.
 */
@Validated
@Api(value = "ccp", description = "the ccp API")
@RequestMapping(value = "/v1/api")
public interface CcpApi {

    @ApiOperation(
            value = "Brokerage Accounts", nickname = "ccpAccountGet", notes = "Provides the list of tradeable accounts",
            response = Object.class, tags = {"CCP (Beta)"})
    @ApiResponses(value = {@ApiResponse(code = 200, message = "An array of accounts", response = Object.class)})
    @RequestMapping(value = "/ccp/account", produces = {"application/json"}, method = RequestMethod.GET)
    ResponseEntity<Object> ccpAccountGet();


    @ApiOperation(
            value = "Start CCP Session", nickname = "ccpAuthInitPost",
            notes = "Initiate a brokerage session to CCP. Only one brokerage session type can run at a time. "
                    + "If an existing brokerage session to iServer is running then call the endpoint /logout first. "
                    + "Note at this time only order management is possible from CCP session, "
                    + "market data and scanner endpoints can't be used since they are only available from "
                    + "iServer session. Work is in progress to provide new CCP endpoints for market data and scanners.",
            response = Object.class, tags = {"CCP (Beta)"})
    @ApiResponses(
            value = {@ApiResponse(
                    code = 200, message = "Returns challenge for connection", response = Object.class), @ApiResponse(
                    code = 401, message = "Access denied"), @ApiResponse(
                    code = 500, message = "System error")})
    @RequestMapping(
            value = "/ccp/auth/init", produces = {"application/json"}, consumes = {"application/x-www-form-urlencoded"},
            method = RequestMethod.POST)
    ResponseEntity<Object> ccpAuthInitPost(@ApiParam(value = "Allow competing CCP session to run") @RequestParam(
            value = "compete", required = false) Boolean compete,
            @ApiParam(value = "Concatenate value for language and region, set to \"en_US\"") @RequestParam(
                    value = "locale", required = false) String locale,
            @ApiParam(value = "Local MAC Address") @RequestParam(value = "mac", required = false) String mac,
            @ApiParam(value = "Local machine ID") @RequestParam(value = "machineId", required = false) String machineId,
            @ApiParam(value = "Login user, set to dash \"-\"") @RequestParam(
                    value = "username", required = false) String username);


    @ApiOperation(
            value = "Complete CCP Session", nickname = "ccpAuthResponsePost", notes = "Session Token Authentication",
            response = Object.class, tags = {"CCP (Beta)"})
    @ApiResponses(
            value = {@ApiResponse(code = 200, message = "Valid result", response = Object.class), @ApiResponse(
                    code = 401, message = "Access denied"), @ApiResponse(code = 500, message = "System error")})
    @RequestMapping(value = "/ccp/auth/response", produces = {"application/json"}, method = RequestMethod.POST)
    ResponseEntity<Object> ccpAuthResponsePost(@ApiParam(value = "") @Valid @RequestBody Auth auth);


    @ApiOperation(
            value = "Delete Order", nickname = "ccpOrderDelete",
            notes = "Sends an Order cancellation request. The status of the order can be queried through /ccp/order. "
                    + "Passing arguments as GET is also supported (requires passing action=delete) "
                    + "(GET is meant for development only) ",
            response = OrderData.class, tags = {"CCP (Beta)"})
    @ApiResponses(
            value = {@ApiResponse(code = 200, message = "An Object", response = OrderData.class), @ApiResponse(
                    code = 401, message = "Access denied"), @ApiResponse(
                    code = 500, message = "System error, for example when connection to CCP failed")})
    @RequestMapping(
            value = "/ccp/order", produces = {"application/json"}, consumes = {"application/json"},
            method = RequestMethod.DELETE)
    ResponseEntity<OrderData> ccpOrderDelete(
            @NotNull @ApiParam(value = "Account Number", required = true) @Valid @RequestParam(
                    value = "acct", required = true) String acct, @NotNull @ApiParam(
            value = "Order Identifier of original submit order", required = true) @Valid
            @RequestParam(value = "id", required = true) BigDecimal id);


    @SuppressWarnings("checkstyle:ParameterNumber")
    @ApiOperation(
            value = "Submit Order", nickname = "ccpOrderPost", notes = "Submits an Order. ", response = OrderData.class,
            tags = {"CCP (Beta)"})
    @ApiResponses(
            value = {@ApiResponse(code = 200, message = "An Object", response = OrderData.class), @ApiResponse(
                    code = 400, message = "Bad Request"), @ApiResponse(
                    code = 401, message = "Access denied"), @ApiResponse(
                    code = 500, message = "System error, for example when connection to CCP failed")})
    @RequestMapping(
            value = "/ccp/order", produces = {"application/json"}, consumes = {"application/json"},
            method = RequestMethod.POST)
    ResponseEntity<OrderData> ccpOrderPost(
            @NotNull @ApiParam(value = "User Account", required = true) @Valid @RequestParam(
                    value = "acct", required = true) String acct, @NotNull @ApiParam(
            value = "Contract identifier from IBKR's database.", required = true) @Valid
            @RequestParam(value = "conid", required = true) BigDecimal conid, @NotNull @ApiParam(
            value = "Contract Currency", required = true, allowableValues = "USD, GBP, EUR") @Valid
            @RequestParam(value = "ccy", required = true) String ccy, @NotNull @ApiParam(
            value = "Exchange", required = true, allowableValues = "NYSE, CBOE, NYMEX") @Valid @RequestParam(
            value = "exchange", required = true) String exchange,
            @NotNull @ApiParam(value = "Order Quantity", required = true) @Valid @RequestParam(
                    value = "qty", required = true) BigDecimal qty, @ApiParam(
            value = "Order Price; required if order type is limit", allowableValues = "limit, market") @Valid
            @RequestParam(value = "type", required = false) String type,
            @ApiParam(value = "Side", allowableValues = "sell, buy") @Valid @RequestParam(
                    value = "side", required = false) String side,
            @ApiParam(value = "Order Price; required if order type is limit") @Valid @RequestParam(
                    value = "price", required = false) BigDecimal price,
            @ApiParam(value = "Time in Force", allowableValues = "IOC, GTC") @Valid @RequestParam(
                    value = "tif", required = false) String tif);


    @ApiOperation(
            value = "Update Order", nickname = "ccpOrderPut",
            notes = "Updates an Order. Updating an order requires the same arguments as placing an order besides the "
                    + "conid. Note: The status of the order can be queried through GET /ccp/order. ",
            response = OrderData.class, tags = {"CCP (Beta)"})
    @ApiResponses(
            value = {@ApiResponse(code = 200, message = "An Object", response = OrderData.class), @ApiResponse(
                    code = 401, message = "Access denied"), @ApiResponse(
                    code = 500, message = "System error, for example when connection to CCP failed")})
    @RequestMapping(
            value = "/ccp/order", produces = {"application/json"}, consumes = {"application/json"},
            method = RequestMethod.PUT)
    ResponseEntity<OrderData> ccpOrderPut(
            @NotNull @ApiParam(value = "User Account", required = true) @Valid @RequestParam(
                    value = "acct", required = true) String acct,
            @NotNull @ApiParam(value = "Order ID to be modified", required = true) @Valid @RequestParam(
                    value = "id", required = true) BigDecimal id);


    @ApiOperation(
            value = "Order Status", nickname = "ccpOrdersGet", notes = "Get status for all orders",
            response = Object.class, tags = {"CCP (Beta)"})
    @ApiResponses(
            value = {@ApiResponse(
                    code = 200, message = "An Object", response = Object.class), @ApiResponse(
                    code = 400, message = "Bad request"), @ApiResponse(
                    code = 401, message = "Access denied"), @ApiResponse(code = 500, message = "System error")})
    @RequestMapping(value = "/ccp/orders", produces = {"application/json"}, method = RequestMethod.GET)
    ResponseEntity<Object> ccpOrdersGet(
            @NotNull @ApiParam(value = "User Account", required = true) @Valid @RequestParam(
                    value = "acct", required = true) String acct,
            @ApiParam(value = "Return only Rejected or Cancelled orders since today midnight") @Valid @RequestParam(
                    value = "cancelled", required = false) Boolean cancelled);


    @ApiOperation(
            value = "Positions", nickname = "ccpPositionsGet", notes = "List of positions",
            response = PositionData.class, tags = {"CCP (Beta)"})
    @ApiResponses(
            value = {@ApiResponse(
                    code = 200, message = "Valid result", response = PositionData.class), @ApiResponse(
                    code = 401, message = "Access denied"), @ApiResponse(code = 500, message = "System error")})
    @RequestMapping(value = "/ccp/positions", produces = {"application/json"}, method = RequestMethod.GET)
    ResponseEntity<PositionData> ccpPositionsGet();


    @ApiOperation(
            value = "CCP Status", nickname = "ccpStatusGet",
            notes = "Provide the current CCP session status. When using the Gateway this endpoint will also initiate "
                    + "a brokerage session to CCP by sending /auth/init and response.",
            response = Object.class, tags = {"CCP (Beta)"})
    @ApiResponses(
            value = {@ApiResponse(code = 200, message = "Valid result", response = Object.class), @ApiResponse(
                    code = 401, message = "Access denied"), @ApiResponse(code = 500, message = "System error")})
    @RequestMapping(value = "/ccp/status", produces = {"application/json"}, method = RequestMethod.GET)
    ResponseEntity<Object> ccpStatusGet();


    @ApiOperation(
            value = "Trades", nickname = "ccpTradesGet",
            notes = "Get a list of Trades, by default, the list is from today midnight to Date.now(). ",
            response = Object.class, tags = {"CCP (Beta)"})
    @ApiResponses(
            value = {@ApiResponse(
                    code = 200, message = "An Object", response = Object.class), @ApiResponse(
                    code = 400, message = "Bad request"), @ApiResponse(
                    code = 401, message = "Access denied"), @ApiResponse(code = 500, message = "System error")})
    @RequestMapping(value = "/ccp/trades", produces = {"application/json"}, method = RequestMethod.GET)
    ResponseEntity<Object> ccpTradesGet(
            @ApiParam(value = "From Date (YYYYMMDD-HH:mm:ss) or offset (-1,-2,-3..)") @Valid @RequestParam(
                    value = "from", required = false) String from, @ApiParam(
            value = "To Date (YYYYMMDD-HH:mm:ss) or offset (-1,-2,-3..). To value should be bigger than from value. ")
            @Valid @RequestParam(value = "to", required = false) String to);

}
