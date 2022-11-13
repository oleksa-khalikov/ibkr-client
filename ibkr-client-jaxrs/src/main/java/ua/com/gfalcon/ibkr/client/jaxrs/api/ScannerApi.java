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

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import ua.com.gfalcon.ibkr.model.ScannerDirect;
import ua.com.gfalcon.ibkr.model.ScannerDirectResult;
import ua.com.gfalcon.ibkr.model.ScannerParams;
import ua.com.gfalcon.ibkr.model.ScannerParamsList;
import ua.com.gfalcon.ibkr.model.ScannerResult;

/**
 * Client Portal Web API.
 *
 * <p>Client Poral Web API
 */
@Path("/")
@Api(value = "/", description = "")
public interface ScannerApi {

    /**
     * Run Scanner (Beta)
     * <p/>
     * Using a direct connection to the market data farm, will provide results to the requested scanner.
     */
    @POST
    @Path("/hmds/scanner")
    @Produces({"application/json"})
    @ApiOperation(value = "Run Scanner (Beta)", tags = {})
    @ApiResponses(
            value = {@ApiResponse(
                    code = 200, message = "Valid result", response = ScannerDirectResult.class), @ApiResponse(
                    code = 400, message = "Bad request")})
    public ScannerDirectResult hmdsScannerPost(ScannerDirect body);

    /**
     * Scanner Parameters.
     * <p/>
     * Returns an object contains four lists contain all parameters for scanners
     */
    @GET
    @Path("/iserver/scanner/params")
    @Produces({"application/json"})
    @ApiOperation(value = "Scanner Parameters", tags = {})
    @ApiResponses(
            value = {@ApiResponse(
                    code = 200, message = "An object contains lists", response = ScannerParamsList.class)})
    public ScannerParamsList iserverScannerParamsGet();

    /**
     * run scanner to get a list of contracts.
     */
    @POST
    @Path("/iserver/scanner/run")
    @Produces({"application/json"})
    @ApiOperation(value = "run scanner to get a list of contracts", tags = {})
    @ApiResponses(
            value = {@ApiResponse(
                    code = 200, message = "returns an array", response = ScannerResult.class,
                    responseContainer = "List")})
    public List<ScannerResult> iserverScannerRunPost(ScannerParams body);

}

