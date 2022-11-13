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

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import ua.com.gfalcon.ibkr.model.AlertRequest;
import ua.com.gfalcon.ibkr.model.AlertResponse;
import ua.com.gfalcon.ibkr.model.Body;

/**
 * Client Portal Web API.
 *
 * <p>Client Poral Web API
 */
@Path("/")
@Api(value = "/", description = "")
public interface AlertApi {

    /**
     * Activate or deactivate an alert.
     *
     * <p>Please note, if alertId is 0, it will activate/deactivate all alerts
     */
    @POST
    @Path("/iserver/account/{accountId}/alert/activate")
    @Produces({"application/json"})
    @ApiOperation(value = "Activate or deactivate an alert", tags = {})
    @ApiResponses(value = {@ApiResponse(code = 200, message = "returns an object", response = Object.class)})
    public Object iserverAccountAccountIdAlertActivatePost(@PathParam("accountId") String accountId, Body body);

    /**
     * Delete an alert.
     *
     *<p>Please be careful, if alertId is 0, it will delete all alerts
     */
    @DELETE
    @Path("/iserver/account/{accountId}/alert/{alertId}")
    @Produces({"application/json"})
    @ApiOperation(value = "Delete an alert", tags = {})
    @ApiResponses(value = {@ApiResponse(code = 200, message = "returns an object", response = Object.class)})
    public Object iserverAccountAccountIdAlertAlertIdDelete(@PathParam("accountId") String accountId,
            @PathParam("alertId") String alertId);

    /**
     * Create or modify alert.
     *
     *<p>Please note here, DO NOT pass orderId when creating a new alert, toolId is only required for MTA alert.
     */
    @POST
    @Path("/iserver/account/{accountId}/alert")
    @Produces({"application/json"})
    @ApiOperation(value = "Create or modify alert", tags = {})
    @ApiResponses(value = {@ApiResponse(code = 200, message = "returns an object", response = Object.class)})
    public Object iserverAccountAccountIdAlertPost(@PathParam("accountId") String accountId, AlertRequest body);

    /**
     * Get a list of available alerts.
     *
     *<p>The response will contain both active and inactive alerts, but it won&#39;t have MTA alert
     */
    @GET
    @Path("/iserver/account/{accountId}/alerts")
    @Produces({"application/json"})
    @ApiOperation(value = "Get a list of available alerts", tags = {})
    @ApiResponses(
            value = {@ApiResponse(
                    code = 200, message = "returns an array of objects", response = Object.class,
                    responseContainer = "List")})
    public List<Object> iserverAccountAccountIdAlertsGet(@PathParam("accountId") String accountId);

    /**
     * Get details of an alert
     *
     *<p>Use the endpoint /iserver/account/:accountId/alerts to receive the alert id. The order_id in the response
     * is the alert id.
     */
    @GET
    @Path("/iserver/account/alert/{id}")
    @Produces({"application/json"})
    @ApiOperation(value = "Get details of an alert", tags = {})
    @ApiResponses(value = {@ApiResponse(code = 200, message = "returns an object", response = AlertResponse.class)})
    public AlertResponse iserverAccountAlertIdGet(@PathParam("id") String id);

    /**
     * Get MTA alert
     *
     *<p>Each login user only has one mobile trading assistant (MTA) alert with it&#39;s own unique tool id. The tool
     * id cannot be changed. When modified a new order Id is generated. MTA alerts can not be created or deleted. If you
     * call delete /iserver/account/:accountId/alert/:alertId, it will reset MTA to default. See
     * (<a href="https://www.interactivebrokers.com/en/software/mobileiphonemobile/mobileiphone.htm#monitor/trading-assistant.htm">here</a>)
     * for more information on MTA alerts.
     */
    @GET
    @Path("/iserver/account/mta")
    @Produces({"application/json"})
    @ApiOperation(value = "Get MTA alert", tags = {})
    @ApiResponses(value = {@ApiResponse(code = 200, message = "returns an object", response = AlertResponse.class)})
    public AlertResponse iserverAccountMtaGet();

}

