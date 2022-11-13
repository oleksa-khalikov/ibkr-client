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

import java.math.BigDecimal;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import ua.com.gfalcon.ibkr.model.Auth;

/**
 * Ccp api service.
 */
public interface CcpApiService {

    Response ccpAccountGet(SecurityContext securityContext) throws NotFoundException;

    Response ccpAuthInitPost(Boolean compete, String locale, String mac, String machineId, String username,
            SecurityContext securityContext) throws NotFoundException;

    Response ccpAuthResponsePost(Auth auth, SecurityContext securityContext) throws NotFoundException;

    Response ccpOrderDelete(String acct, BigDecimal id, SecurityContext securityContext) throws NotFoundException;

    @SuppressWarnings("checkstyle:ParameterNumber")
    Response ccpOrderPost(String acct, BigDecimal conid, String ccy, String exchange, BigDecimal qty, String type,
            String side, BigDecimal price, String tif, SecurityContext securityContext) throws NotFoundException;

    Response ccpOrderPut(String acct, BigDecimal id, SecurityContext securityContext) throws NotFoundException;

    Response ccpOrdersGet(String acct, Boolean cancelled, SecurityContext securityContext) throws NotFoundException;

    Response ccpPositionsGet(SecurityContext securityContext) throws NotFoundException;

    Response ccpStatusGet(SecurityContext securityContext) throws NotFoundException;

    Response ccpTradesGet(String from, String to, SecurityContext securityContext) throws NotFoundException;

}
