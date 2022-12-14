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

/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.27).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
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
import ua.com.gfalcon.ibkr.model.BooleanConfirmed;

/**
 * Logout API.
 */
@Validated
@Api(value = "logout", description = "the logout API")
@RequestMapping(value = "/v1/api")
public interface LogoutApi {

    @ApiOperation(
            value = "Ends the current session", nickname = "logoutPost",
            notes = "Logs the user out of the gateway session. Any further activity requires re-authentication.",
            response = BooleanConfirmed.class, tags = {"Session"})
    @ApiResponses(
            value = {@ApiResponse(
                    code = 200, message = "returned status indicates if user is logged in",
                    response = BooleanConfirmed.class)})
    @RequestMapping(value = "/logout", produces = {"application/json"}, method = RequestMethod.POST)
    ResponseEntity<BooleanConfirmed> logoutPost();

}
