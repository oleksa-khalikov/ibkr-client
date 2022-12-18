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

package ua.com.gfalcon.ibkr.server.spring.api;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.ApiParam;
import ua.com.gfalcon.ibkr.model.Body;
import ua.com.gfalcon.ibkr.model.ConIdRequest;
import ua.com.gfalcon.ibkr.model.Secdef;

/**
 * Trsrv Api Controller.
 */
@Controller
public class TrsrvApiController implements TrsrvApi {

    private static final Logger log = LoggerFactory.getLogger(TrsrvApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public TrsrvApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    /**
     * Futures Get.
     */
    public ResponseEntity<Object> trsrvFuturesGet(@NotNull @ApiParam(
            value = "list of case-sensitive symbols separated by comma", required = true) @Valid
            @RequestParam(value = "symbols", required = true) String symbols) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Object>(
                        objectMapper.readValue("{  \"bytes\": [    123,    125  ],  \"empty\": false}", Object.class),
                        HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Secdef Post.
     */
    public ResponseEntity<Secdef> trsrvSecdefPost(
            @ApiParam(value = "request body", required = true) @Valid @RequestBody ConIdRequest body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Secdef>(
                        objectMapper.readValue("{  \"bytes\": [],  \"empty\": true}", Secdef.class),
                        HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Secdef>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Secdef>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Secdef schedule get.
     */
    public ResponseEntity<Object> trsrvSecdefScheduleGet(@NotNull @ApiParam(
            value = "specify the asset class of the contract. Available values-- Stock: STK, Option: OPT, Future: FUT, "
                    + "Contract For Difference: CFD, Warrant: WAR, Forex: SWP, Mutual Fund: FND, Bond: BND, "
                    + "Inter-Commodity Spreads: ICS ",
            required = true) @Valid @RequestParam(value = "assetClass", required = true) String assetClass,
            @NotNull @ApiParam(
                    value = "Underlying Symbol for specified contract, for example 'AAPL' for US Stock - Apple Inc.",
                    required = true) @Valid @RequestParam(value = "symbol", required = true) String symbol,
            @ApiParam(value = "Native exchange for contract, for example 'NASDAQ' for US Stock - Apple Inc.") @Valid
            @RequestParam(
                    value = "exchange", required = false) String exchange,
            @ApiParam(value = "Response only returns trading schedule for specified exchange") @Valid @RequestParam(
                    value = "exchangeFilter", required = false) String exchangeFilter) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Object>(
                        objectMapper.readValue("{  \"bytes\": [    123,    125  ],  \"empty\": false}", Object.class),
                        HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Stocks.
     */
    public ResponseEntity<Object> trsrvStocksGet(@NotNull @ApiParam(
            value = "list of upper-sensitive symbols separated by comma", required = true) @Valid
            @RequestParam(value = "symbols", required = true) String symbols) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Object>(
                        objectMapper.readValue("{  \"bytes\": [    123,    125  ],  \"empty\": false}", Object.class),
                        HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

}
