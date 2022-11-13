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

package ua.com.gfalcon.ibkr.server.resteasy.api;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import ua.com.gfalcon.ibkr.model.ValidateSso;

/**
 * SSO API.
 */
@Path("/sso")
@Produces({"application/json"})
@io.swagger.annotations.Api(description = "the sso API")
public class SsoApi {

    @Inject
    SsoApiService service;

    @GET
    @Path("/validate")

    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(
            value = "Validate SSO", notes = "Validates the current session for the SSO user",
            response = ValidateSso.class, tags = {"Session"})
    @io.swagger.annotations.ApiResponses(
            value = {@io.swagger.annotations.ApiResponse(
                    code = 200, message = "An Object", response = ValidateSso.class),

                    @io.swagger.annotations.ApiResponse(
                            code = 401, message = "Authentication failed", response = Void.class),

                    @io.swagger.annotations.ApiResponse(code = 500, message = "System failed", response = Void.class)})
    public Response ssoValidateGet(@Context SecurityContext securityContext) throws NotFoundException {
        return service.ssoValidateGet(securityContext);
    }

}
