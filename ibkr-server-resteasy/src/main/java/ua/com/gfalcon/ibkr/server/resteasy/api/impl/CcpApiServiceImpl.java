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

import java.math.BigDecimal;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import ua.com.gfalcon.ibkr.model.Auth;
import ua.com.gfalcon.ibkr.server.resteasy.api.ApiResponseMessage;
import ua.com.gfalcon.ibkr.server.resteasy.api.CcpApiService;
import ua.com.gfalcon.ibkr.server.resteasy.api.NotFoundException;

/**
 * Ccp api service.
 */
@RequestScoped
public class CcpApiServiceImpl implements CcpApiService {

    /**
     * Ccp account get.
     */
    public Response ccpAccountGet(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Ccp auth init post.
     */
    public Response ccpAuthInitPost(Boolean compete, String locale, String mac, String machineId, String username,
            SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Ccp auth response post.
     */
    public Response ccpAuthResponsePost(Auth auth, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Ccp order delete.
     */
    public Response ccpOrderDelete(String acct, BigDecimal id, SecurityContext securityContext)
            throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Ccp order post.
     */
    @SuppressWarnings("checkstyle:ParameterNumber")
    public Response ccpOrderPost(String acct, BigDecimal conid, String ccy, String exchange, BigDecimal qty,
            String type, String side, BigDecimal price, String tif, SecurityContext securityContext)
            throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Ccp order put.
     */
    public Response ccpOrderPut(String acct, BigDecimal id, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Ccp orders get.
     */
    public Response ccpOrdersGet(String acct, Boolean cancelled, SecurityContext securityContext)
            throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Ccp positions get.
     */
    public Response ccpPositionsGet(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Ccp status get.
     */
    public Response ccpStatusGet(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

    /**
     * Ccp trades get.
     */
    public Response ccpTradesGet(String from, String to, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok()
                .entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!"))
                .build();
    }

}
