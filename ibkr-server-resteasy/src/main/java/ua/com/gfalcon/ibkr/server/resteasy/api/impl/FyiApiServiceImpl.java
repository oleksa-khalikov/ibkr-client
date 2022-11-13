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

package ua.com.gfalcon.ibkr.server.resteasy.api.impl;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import ua.com.gfalcon.ibkr.model.Body;
import ua.com.gfalcon.ibkr.server.resteasy.api.ApiResponseMessage;
import ua.com.gfalcon.ibkr.server.resteasy.api.FyiApiService;
import ua.com.gfalcon.ibkr.server.resteasy.api.NotFoundException;

/**
 * Fyi Api Service.
 */
@RequestScoped
public class FyiApiServiceImpl implements FyiApiService {

    /**
     * Fyi delivery options device id.
     */
    public Response fyiDeliveryoptionsDeviceIdDelete(String deviceId, SecurityContext securityContext)
            throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Fyi delivery options device.
     */
    public Response fyiDeliveryoptionsDevicePost(Body body, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Fyi delivery options email.
     */
    public Response fyiDeliveryoptionsEmailPut(String enabled, SecurityContext securityContext)
            throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Fyi delivery options.
     */
    public Response fyiDeliveryoptionsGet(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Fyi disclaimer type code.
     */
    public Response fyiDisclaimerTypecodeGet(String typecode, SecurityContext securityContext)
            throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Fyi disclaimer type code.
     */
    public Response fyiDisclaimerTypecodePut(String typecode, SecurityContext securityContext)
            throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Fyi notifications.
     */
    public Response fyiNotificationsGet(String max, String exclude, String include, SecurityContext securityContext)
            throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Fyi notifications more.
     */
    public Response fyiNotificationsMoreGet(String id, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Fyi notifications notification id.
     */
    public Response fyiNotificationsNotificationIdPut(String notificationId, SecurityContext securityContext)
            throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Fyi settings.
     */
    public Response fyiSettingsGet(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Fyi settings typecode.
     */
    public Response fyiSettingsTypecodePost(String typecode, Body body, SecurityContext securityContext)
            throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Fyi unreadnumber get.
     */
    public Response fyiUnreadnumberGet(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

}
