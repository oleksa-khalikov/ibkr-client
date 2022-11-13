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

package ua.com.gfalcon.ibkr.server.spring.api;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * WS API.
 */
@Validated
@Api(value = "ws", description = "the ws API")
@RequestMapping(value = "/v1/api")
public interface WsApi {

    @ApiOperation(
            value = "Websocket Endpoint", nickname = "wsPost",
            notes = "The streaming API is documented under [Streaming WebSocket Data](https://interactivebrokers.github.io/cpwebapi/RealtimeSubscription.html) for details.",
            tags = {"Streaming"})
    @ApiResponses(value = {@ApiResponse(code = 200, message = "confirms session is open")})
    @RequestMapping(value = "/ws", produces = {"application/json"}, method = RequestMethod.POST)
    ResponseEntity<Void> wsPost();

}
