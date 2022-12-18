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

import javax.servlet.ServletConfig;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import io.swagger.annotations.ApiParam;
import ua.com.gfalcon.ibkr.model.CertainSubscription;
import ua.com.gfalcon.ibkr.model.DeviceOption;
import ua.com.gfalcon.ibkr.model.Notifications;
import ua.com.gfalcon.ibkr.server.jaxrs.api.factories.FyiApiServiceFactory;

/**
 * Fyi Api.
 */
@Path("/fyi")
@Produces({"application/json"})
@io.swagger.annotations.Api(description = "the fyi API")
public class FyiApi {

    private final FyiApiService delegate;

    /**
     * Fyi Api.
     */
    public FyiApi(@Context ServletConfig servletContext) {
        FyiApiService delegate = null;

        if (servletContext != null) {
            String implClass = servletContext.getInitParameter("FyiApi.implementation");
            if (implClass != null && !"".equals(implClass.trim())) {
                try {
                    delegate = (FyiApiService) Class.forName(implClass)
                            .newInstance();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }

        if (delegate == null) {
            delegate = FyiApiServiceFactory.getFyiApi();
        }

        this.delegate = delegate;
    }

    @DELETE
    @Path("/deliveryoptions/{deviceId}")
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(
            value = "Delete a device", notes = "", response = Object.class, tags = {"FYI"})
    @io.swagger.annotations.ApiResponses(
            value = {@io.swagger.annotations.ApiResponse(
                    code = 200, message = "200 means successful", response = Object.class)})
    public Response fyiDeliveryoptionsDeviceIdDelete(
            @ApiParam(value = "device ID", required = true) @PathParam("deviceId") String deviceId,
            @Context SecurityContext securityContext) throws NotFoundException {
        return delegate.fyiDeliveryoptionsDeviceIdDelete(deviceId, securityContext);
    }

    @POST
    @Path("/deliveryoptions/device")
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(
            value = "Enable/Disable device option", notes = "", response = Object.class, tags = {"FYI"})
    @io.swagger.annotations.ApiResponses(
            value = {@io.swagger.annotations.ApiResponse(
                    code = 200, message = "200 means successful", response = Object.class)})
    public Response fyiDeliveryoptionsDevicePost(@ApiParam(value = "device info", required = true) DeviceOption body,
            @Context SecurityContext securityContext) throws NotFoundException {
        return delegate.fyiDeliveryoptionsDevicePost(body, securityContext);
    }

    @PUT
    @Path("/deliveryoptions/email")
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(
            value = "Enable/Disable email option", notes = "", response = Object.class, tags = {"FYI"})
    @io.swagger.annotations.ApiResponses(
            value = {@io.swagger.annotations.ApiResponse(
                    code = 200, message = "200 means successful", response = Object.class)})
    public Response fyiDeliveryoptionsEmailPut(
            @ApiParam(value = "true/false", required = true) @QueryParam("enabled") String enabled,
            @Context SecurityContext securityContext) throws NotFoundException {
        return delegate.fyiDeliveryoptionsEmailPut(enabled, securityContext);
    }

    @GET
    @Path("/deliveryoptions")
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(
            value = "Get delivery options", notes = "options for sending fyis to email and other devices ",
            response = Object.class, tags = {"FYI"})
    @io.swagger.annotations.ApiResponses(
            value = {@io.swagger.annotations.ApiResponse(
                    code = 200, message = "An object", response = Object.class)})
    public Response fyiDeliveryoptionsGet(@Context SecurityContext securityContext) throws NotFoundException {
        return delegate.fyiDeliveryoptionsGet(securityContext);
    }

    @GET
    @Path("/disclaimer/{typecode}")
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(
            value = "Get disclaimer for a certain kind of fyi", notes = "", response = Object.class, tags = {"FYI"})
    @io.swagger.annotations.ApiResponses(
            value = {@io.swagger.annotations.ApiResponse(
                    code = 200, message = "receives the disclaimer message", response = Object.class)})
    public Response fyiDisclaimerTypecodeGet(
            @ApiParam(value = "fyi code, for example --M8, EA", required = true) @PathParam("typecode") String typecode,
            @Context SecurityContext securityContext) throws NotFoundException {
        return delegate.fyiDisclaimerTypecodeGet(typecode, securityContext);
    }

    @PUT
    @Path("/disclaimer/{typecode}")
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(
            value = "Mark disclaimer read", notes = "", response = Object.class, tags = {"FYI"})
    @io.swagger.annotations.ApiResponses(
            value = {@io.swagger.annotations.ApiResponse(
                    code = 200, message = "200 means successful", response = Object.class)})
    public Response fyiDisclaimerTypecodePut(
            @ApiParam(value = "fyi code, for example --M8, EA", required = true) @PathParam("typecode") String typecode,
            @Context SecurityContext securityContext) throws NotFoundException {
        return delegate.fyiDisclaimerTypecodePut(typecode, securityContext);
    }

    @GET
    @Path("/notifications")
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(
            value = "Get a list of notifications", notes = "", response = Notifications.class, tags = {"FYI"})
    @io.swagger.annotations.ApiResponses(
            value = {@io.swagger.annotations.ApiResponse(
                    code = 200, message = "An array", response = Notifications.class)})
    public Response fyiNotificationsGet(
            @ApiParam(value = "max number of fyis in response", required = true) @QueryParam("max") String max,
            @ApiParam(value = "if set, don't set include") @QueryParam("exclude") String exclude,
            @ApiParam(value = "if set, don't set exclude") @QueryParam("include") String include,
            @Context SecurityContext securityContext) throws NotFoundException {
        return delegate.fyiNotificationsGet(max, exclude, include, securityContext);
    }

    @GET
    @Path("/notifications/more")
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(
            value = "Get more notifications based on a certain one", notes = "", response = Notifications.class,
            tags = {"FYI"})
    @io.swagger.annotations.ApiResponses(
            value = {@io.swagger.annotations.ApiResponse(
                    code = 200, message = "An array", response = Notifications.class)})
    public Response fyiNotificationsMoreGet(
            @ApiParam(value = "id of last notification in the list", required = true) @QueryParam("id") String id,
            @Context SecurityContext securityContext) throws NotFoundException {
        return delegate.fyiNotificationsMoreGet(id, securityContext);
    }

    @PUT
    @Path("/notifications/{notificationId}")
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(
            value = "Get a list of notifications", notes = "", response = Object.class, tags = {"FYI"})
    @io.swagger.annotations.ApiResponses(
            value = {@io.swagger.annotations.ApiResponse(
                    code = 200, message = "when 200 receives, it means successful", response = Object.class)})
    public Response fyiNotificationsNotificationIdPut(@ApiParam(
            value = "mark a notification read", required = true) @PathParam("notificationId") String notificationId,
            @Context SecurityContext securityContext) throws NotFoundException {
        return delegate.fyiNotificationsNotificationIdPut(notificationId, securityContext);
    }

    @GET
    @Path("/settings")
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(
            value = "Get a list of subscriptions",
            notes = "Return the current choices of subscriptions, we can toggle the option ", response = Object.class,
            responseContainer = "List", tags = {"FYI"})
    @io.swagger.annotations.ApiResponses(
            value = {@io.swagger.annotations.ApiResponse(
                    code = 200, message = "An array", response = Object.class, responseContainer = "List")})
    public Response fyiSettingsGet(@Context SecurityContext securityContext) throws NotFoundException {
        return delegate.fyiSettingsGet(securityContext);
    }

    @POST
    @Path("/settings/{typecode}")
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(
            value = "Enable/Disable certain subscription",
            notes = "Configure which typecode you would like to enable/disable. ", response = Object.class,
            tags = {"FYI"})
    @io.swagger.annotations.ApiResponses(
            value = {@io.swagger.annotations.ApiResponse(
                    code = 200, message = "200 means successful", response = Object.class)})
    public Response fyiSettingsTypecodePost(
            @ApiParam(value = "fyi code", required = true) @PathParam("typecode") String typecode,
            @ApiParam(value = "", required = true) CertainSubscription body, @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.fyiSettingsTypecodePost(typecode, body, securityContext);
    }

    @GET
    @Path("/unreadnumber")
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(
            value = "Get unread number of fyis. The HTTP method POST is also supported.",
            notes = "Returns the total number of unread fyis ", response = Object.class, tags = {"FYI"})
    @io.swagger.annotations.ApiResponses(
            value = {@io.swagger.annotations.ApiResponse(
                    code = 200, message = "An object", response = Object.class)})
    public Response fyiUnreadnumberGet(@Context SecurityContext securityContext) throws NotFoundException {
        return delegate.fyiUnreadnumberGet(securityContext);
    }

}
