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
import javax.validation.constraints.NotNull;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import ua.com.gfalcon.ibkr.model.MarketData;

/**
 * MD API.
 */
@Path("/md")
@Produces({"application/json"})
@io.swagger.annotations.Api(description = "the md API")
public class MdApi {

    @Inject
    MdApiService service;

    @GET
    @Path("/snapshot")

    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(
            value = "Market Data Snapshot (Beta)",
            notes = "Get a snapshot of Market Data for the given conid(s).See response for a list of available fields that can be requested from the fields argument. Must be connected to a brokerage session before can query snapshot data. First /snapshot endpoint call for given conid(s) will initiate the market data request, make an additional request to receive field values back. To receive all available fields the /snapshot endpoint will need to be called several times. To receive streaming market data the endpoint /ws can be used. Refer to [Streaming WebSocket Data](https://interactivebrokers.github.io/cpwebapi/RealtimeSubscription.html) for details. ",
            response = MarketData.class, tags = {"Market Data"})
    @io.swagger.annotations.ApiResponses(
            value = {@io.swagger.annotations.ApiResponse(
                    code = 200, message = "An Object", response = MarketData.class),

                    @io.swagger.annotations.ApiResponse(
                            code = 401, message = "Authentication failed", response = Void.class),

                    @io.swagger.annotations.ApiResponse(code = 500, message = "System failed", response = Void.class)})
    public Response mdSnapshotGet(@NotNull @QueryParam("conids") String conids, @QueryParam("fields") String fields,
            @Context SecurityContext securityContext) throws NotFoundException {
        return service.mdSnapshotGet(conids, fields, securityContext);
    }

}
