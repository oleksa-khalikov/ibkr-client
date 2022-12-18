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
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import ua.com.gfalcon.ibkr.model.Body;
import ua.com.gfalcon.ibkr.model.DeviceOption;
import ua.com.gfalcon.ibkr.model.Notifications;

/**
 * Client Portal Web API.
 */
@Path("/")
@Api(value = "/", description = "")
public interface FyiApi {

    /**
     * Delete a device.
     */
    @DELETE
    @Path("/fyi/deliveryoptions/{deviceId}")
    @Produces({"application/json"})
    @ApiOperation(value = "Delete a device", tags = {})
    @ApiResponses(value = {@ApiResponse(code = 200, message = "200 means successful", response = Object.class)})
    public Object fyiDeliveryoptionsDeviceIdDelete(@PathParam("deviceId") String deviceId);

    /**
     * Enable/Disable device option.
     */
    @POST
    @Path("/fyi/deliveryoptions/device")
    @Produces({"application/json"})
    @ApiOperation(value = "Enable/Disable device option", tags = {})
    @ApiResponses(value = {@ApiResponse(code = 200, message = "200 means successful", response = Object.class)})
    public Object fyiDeliveryoptionsDevicePost(DeviceOption body);

    /**
     * Enable/Disable email option.
     */
    @PUT
    @Path("/fyi/deliveryoptions/email")
    @Produces({"application/json"})
    @ApiOperation(value = "Enable/Disable email option", tags = {})
    @ApiResponses(value = {@ApiResponse(code = 200, message = "200 means successful", response = Object.class)})
    public Object fyiDeliveryoptionsEmailPut(@QueryParam("enabled") String enabled);

    /**
     * Get delivery options.
     * <p/>
     * options for sending fyis to email and other devices
     */
    @GET
    @Path("/fyi/deliveryoptions")
    @Produces({"application/json"})
    @ApiOperation(value = "Get delivery options", tags = {})
    @ApiResponses(value = {@ApiResponse(code = 200, message = "An object", response = Object.class)})
    public Object fyiDeliveryoptionsGet();

    /**
     * Get disclaimer for a certain kind of fyi.
     */
    @GET
    @Path("/fyi/disclaimer/{typecode}")
    @Produces({"application/json"})
    @ApiOperation(value = "Get disclaimer for a certain kind of fyi", tags = {})
    @ApiResponses(
            value = {@ApiResponse(
                    code = 200, message = "receives the disclaimer message", response = Object.class)})
    public Object fyiDisclaimerTypecodeGet(@PathParam("typecode") String typecode);

    /**
     * Mark disclaimer read.
     */
    @PUT
    @Path("/fyi/disclaimer/{typecode}")
    @Produces({"application/json"})
    @ApiOperation(value = "Mark disclaimer read", tags = {})
    @ApiResponses(value = {@ApiResponse(code = 200, message = "200 means successful", response = Object.class)})
    public Object fyiDisclaimerTypecodePut(@PathParam("typecode") String typecode);

    /**
     * Get a list of notifications.
     */
    @GET
    @Path("/fyi/notifications")
    @Produces({"application/json"})
    @ApiOperation(value = "Get a list of notifications", tags = {})
    @ApiResponses(value = {@ApiResponse(code = 200, message = "An array", response = Notifications.class)})
    public Notifications fyiNotificationsGet(@QueryParam("max") String max, @QueryParam("exclude") String exclude,
            @QueryParam("include") String include);

    /**
     * Get more notifications based on a certain one.
     */
    @GET
    @Path("/fyi/notifications/more")
    @Produces({"application/json"})
    @ApiOperation(value = "Get more notifications based on a certain one", tags = {})
    @ApiResponses(value = {@ApiResponse(code = 200, message = "An array", response = Notifications.class)})
    public Notifications fyiNotificationsMoreGet(@QueryParam("id") String id);

    /**
     * Get a list of notifications.
     */
    @PUT
    @Path("/fyi/notifications/{notificationId}")
    @Produces({"application/json"})
    @ApiOperation(value = "Get a list of notifications", tags = {})
    @ApiResponses(
            value = {@ApiResponse(
                    code = 200, message = "when 200 receives, it means successful", response = Object.class)})
    public Object fyiNotificationsNotificationIdPut(@PathParam("notificationId") String notificationId);

    /**
     * Get a list of subscriptions.
     * <p/>
     * Return the current choices of subscriptions, we can toggle the option
     */
    @GET
    @Path("/fyi/settings")
    @Produces({"application/json"})
    @ApiOperation(value = "Get a list of subscriptions", tags = {})
    @ApiResponses(
            value = {@ApiResponse(
                    code = 200, message = "An array", response = Object.class, responseContainer = "List")})
    public List<Object> fyiSettingsGet();

    /**
     * Enable/Disable certain subscription
     * <p/>
     * Configure which typecode you would like to enable/disable.
     */
    @POST
    @Path("/fyi/settings/{typecode}")
    @Produces({"application/json"})
    @ApiOperation(value = "Enable/Disable certain subscription", tags = {})
    @ApiResponses(value = {@ApiResponse(code = 200, message = "200 means successful", response = Object.class)})
    public Object fyiSettingsTypecodePost(@PathParam("typecode") String typecode, Body body);

    /**
     * Get unread number of fyis. The HTTP method POST is also supported.
     * <p/>
     * Returns the total number of unread fyis
     */
    @GET
    @Path("/fyi/unreadnumber")
    @Produces({"application/json"})
    @ApiOperation(value = "Get unread number of fyis. The HTTP method POST is also supported.", tags = {})
    @ApiResponses(value = {@ApiResponse(code = 200, message = "An object", response = Object.class)})
    public Object fyiUnreadnumberGet();

}

