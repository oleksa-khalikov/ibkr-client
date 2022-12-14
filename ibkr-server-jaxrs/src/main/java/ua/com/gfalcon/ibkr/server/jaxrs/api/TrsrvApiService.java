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

import javax.validation.constraints.NotNull;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import ua.com.gfalcon.ibkr.model.Body;
import ua.com.gfalcon.ibkr.model.ConIdRequest;

/**
 * Trsrv api service.
 */
public abstract class TrsrvApiService {

    public abstract Response trsrvFuturesGet(@NotNull String symbols, SecurityContext securityContext)
            throws NotFoundException;

    public abstract Response trsrvSecdefPost(ConIdRequest body, SecurityContext securityContext) throws NotFoundException;

    public abstract Response trsrvSecdefScheduleGet(@NotNull String assetClass, @NotNull String symbol, String exchange,
            String exchangeFilter, SecurityContext securityContext) throws NotFoundException;

    public abstract Response trsrvStocksGet(@NotNull String symbols, SecurityContext securityContext)
            throws NotFoundException;

}
