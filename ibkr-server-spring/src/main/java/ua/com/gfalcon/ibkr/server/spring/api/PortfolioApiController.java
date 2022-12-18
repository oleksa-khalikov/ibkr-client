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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.ApiParam;
import ua.com.gfalcon.ibkr.model.Account;
import ua.com.gfalcon.ibkr.model.AccountAllocationRequest;
import ua.com.gfalcon.ibkr.model.AccountLedger;
import ua.com.gfalcon.ibkr.model.AccountSummary;
import ua.com.gfalcon.ibkr.model.Accounts;
import ua.com.gfalcon.ibkr.model.Allocation;
import ua.com.gfalcon.ibkr.model.Body;
import ua.com.gfalcon.ibkr.model.Position;

/**
 * Portfolio api controller.
 */
@Controller
public class PortfolioApiController implements PortfolioApi {

    private static final Logger log = LoggerFactory.getLogger(PortfolioApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PortfolioApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    /**
     * Portfolio account id allocation.
     */
    public ResponseEntity<Allocation> portfolioAccountIdAllocationGet(
            @ApiParam(value = "account id", required = true) @PathVariable("accountId") String accountId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Allocation>(
                        objectMapper.readValue("{  \"bytes\": [],  \"empty\": true}", Allocation.class),
                        HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Allocation>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Allocation>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Portfolio account id ledger.
     */
    public ResponseEntity<AccountLedger> portfolioAccountIdLedgerGet(
            @ApiParam(value = "account id", required = true) @PathVariable("accountId") String accountId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AccountLedger>(
                        objectMapper.readValue("{  \"bytes\": [    123,    125  ],  \"empty\": false}",
                                AccountLedger.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AccountLedger>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AccountLedger>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Portfolio account id meta.
     */
    public ResponseEntity<Accounts> portfolioAccountIdMetaGet(
            @ApiParam(value = "account id", required = true) @PathVariable("accountId") String accountId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Accounts>(
                        objectMapper.readValue("{  \"bytes\": [],  \"empty\": true}", Accounts.class),
                        HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Accounts>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Accounts>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Portfolio account id position conid.
     */
    public ResponseEntity<Position> portfolioAccountIdPositionConidGet(
            @ApiParam(value = "account id", required = true) @PathVariable("accountId") String accountId,
            @ApiParam(value = "contract id", required = true) @PathVariable("conid") Integer conid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Position>(
                        objectMapper.readValue("{  \"bytes\": [],  \"empty\": true}", Position.class),
                        HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Position>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Position>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Portfolio account id positions invalidate.
     */
    public ResponseEntity<Object> portfolioAccountIdPositionsInvalidatePost(
            @ApiParam(value = "account id", required = true) @PathVariable("accountId") String accountId) {
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
     * Portfolio account id positions page id.
     */
    public ResponseEntity<Position> portfolioAccountIdPositionsPageIdGet(
            @ApiParam(value = "account id", required = true) @PathVariable("accountId") String accountId,
            @ApiParam(value = "page id", required = true) @PathVariable("pageId") String pageId,
            @ApiParam(value = "optional") @Valid @RequestParam(value = "model", required = false) String model,
            @ApiParam(value = "declare the table to be sorted by which column") @Valid @RequestParam(
                    value = "sort", required = false) String sort,
            @ApiParam(value = "in which order, a means ascending - d means descending") @Valid @RequestParam(
                    value = "direction", required = false) String direction,
            @ApiParam(value = "period for pnl column, can be 1D, 7D, 1M...") @Valid @RequestParam(
                    value = "period", required = false) String period) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Position>(
                        objectMapper.readValue("{  \"bytes\": [],  \"empty\": true}", Position.class),
                        HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Position>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Position>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Portfolio account id summary.
     */
    public ResponseEntity<AccountSummary> portfolioAccountIdSummaryGet(
            @ApiParam(value = "account id", required = true) @PathVariable("accountId") String accountId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AccountSummary>(
                        objectMapper.readValue("{  \"bytes\": [    123,    125  ],  \"empty\": false}",
                                AccountSummary.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AccountSummary>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AccountSummary>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Portfolio accounts.
     */
    public ResponseEntity<Accounts> portfolioAccountsGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Accounts>(
                        objectMapper.readValue("{  \"bytes\": [],  \"empty\": true}", Accounts.class),
                        HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Accounts>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Accounts>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Portfolio allocation.
     */
    public ResponseEntity<Allocation> portfolioAllocationPost(
            @ApiParam(value = "accounts info", required = true) @Valid @RequestBody AccountAllocationRequest body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Allocation>(
                        objectMapper.readValue("{  \"bytes\": [],  \"empty\": true}", Allocation.class),
                        HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Allocation>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Allocation>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Portfolio positions conid.
     */
    public ResponseEntity<Object> portfolioPositionsConidGet(
            @ApiParam(value = "contract id", required = true) @PathVariable("conid") Integer conid) {
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
     * Portfolio subaccounts.
     */
    public ResponseEntity<Account> portfolioSubaccountsGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Account>(objectMapper.readValue("{\"empty\": false}", Account.class),
                        HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Account>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Account>(HttpStatus.NOT_IMPLEMENTED);
    }

}
