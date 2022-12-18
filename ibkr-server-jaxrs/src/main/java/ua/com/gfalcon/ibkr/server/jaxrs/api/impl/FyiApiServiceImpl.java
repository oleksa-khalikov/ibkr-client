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

import ua.com.gfalcon.ibkr.model.CertainSubscription;
import ua.com.gfalcon.ibkr.model.DeviceOption;
import ua.com.gfalcon.ibkr.server.jaxrs.api.ApiResponseMessage;
import ua.com.gfalcon.ibkr.server.jaxrs.api.FyiApiService;
import ua.com.gfalcon.ibkr.server.jaxrs.api.NotFoundException;

/**
 * Fyi api service.
 */
public class FyiApiServiceImpl extends FyiApiService {

    @Override
    public Response fyiDeliveryoptionsDeviceIdDelete(String deviceId, SecurityContext securityContext)
            throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    @Override
    public Response fyiDeliveryoptionsDevicePost(DeviceOption body, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    @Override
    public Response fyiDeliveryoptionsEmailPut(@NotNull String enabled, SecurityContext securityContext)
            throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    @Override
    public Response fyiDeliveryoptionsGet(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    @Override
    public Response fyiDisclaimerTypecodeGet(String typecode, SecurityContext securityContext)
            throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    @Override
    public Response fyiDisclaimerTypecodePut(String typecode, SecurityContext securityContext)
            throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    @Override
    public Response fyiNotificationsGet(@NotNull String max, String exclude, String include,
            SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    @Override
    public Response fyiNotificationsMoreGet(@NotNull String id, SecurityContext securityContext)
            throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    @Override
    public Response fyiNotificationsNotificationIdPut(String notificationId, SecurityContext securityContext)
            throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    @Override
    public Response fyiSettingsGet(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    @Override
    public Response fyiSettingsTypecodePost(String typecode, CertainSubscription body, SecurityContext securityContext)
            throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    @Override
    public Response fyiUnreadnumberGet(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

}
