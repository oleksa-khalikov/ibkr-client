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
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

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
import ua.com.gfalcon.ibkr.model.CertainSubscription;
import ua.com.gfalcon.ibkr.model.DeviceOption;
import ua.com.gfalcon.ibkr.model.Notifications;

/**
 * Fyi Api Controller.
 */
@Controller
public class FyiApiController implements FyiApi {

    private static final Logger log = LoggerFactory.getLogger(FyiApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public FyiApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    /**
     * Fyi delivery options device id.
     */
    public ResponseEntity<Object> fyiDeliveryoptionsDeviceIdDelete(
            @ApiParam(value = "device ID", required = true) @PathVariable("deviceId") String deviceId) {
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
     * Fyi delivery options device post.
     */
    public ResponseEntity<Object> fyiDeliveryoptionsDevicePost(
            @ApiParam(value = "device info", required = true) @Valid @RequestBody DeviceOption body) {
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
     * Fyi delivery options email.
     */
    public ResponseEntity<Object> fyiDeliveryoptionsEmailPut(
            @NotNull @ApiParam(value = "true/false", required = true) @Valid @RequestParam(
                    value = "enabled", required = true) String enabled) {
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
     * Fyi delivery options.
     */
    public ResponseEntity<Object> fyiDeliveryoptionsGet() {
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
     * Fyi disclaimer typecode.
     */
    public ResponseEntity<Object> fyiDisclaimerTypecodeGet(@ApiParam(
            value = "fyi code, for example --M8, EA", required = true) @PathVariable("typecode") String typecode) {
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
     * Fyi disclaimer type code.
     */
    public ResponseEntity<Object> fyiDisclaimerTypecodePut(@ApiParam(
            value = "fyi code, for example --M8, EA", required = true) @PathVariable("typecode") String typecode) {
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
     * Get fyi notifications.
     *
     * @param max       max number of fyis in response
     * @param exclude   if set, don't set include
     * @param include   if set, don't set exclude
     * @return          notifications
     */
    public ResponseEntity<Notifications> fyiNotificationsGet(@NotNull @ApiParam(
            value = "max number of fyis in response", required = true) @Valid
            @RequestParam(value = "max", required = true) String max,
            @ApiParam(value = "if set, don't set include") @Valid @RequestParam(
                    value = "exclude", required = false) String exclude,
            @ApiParam(value = "if set, don't set exclude") @Valid @RequestParam(
                    value = "include", required = false) String include) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Notifications>(
                        objectMapper.readValue("{  \"bytes\": [],  \"empty\": true}", Notifications.class),
                        HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Notifications>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Notifications>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Fyi notifications more get.
     *
     * @param id id of last notification in the list
     */
    public ResponseEntity<Notifications> fyiNotificationsMoreGet(
            @NotNull @ApiParam(value = "id of last notification in the list", required = true) @Valid @RequestParam(
                    value = "id", required = true) String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Notifications>(
                        objectMapper.readValue("{  \"bytes\": [],  \"empty\": true}", Notifications.class),
                        HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Notifications>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Notifications>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Mark a notification read.
     *
     * @param notificationId notification Id.
     */
    public ResponseEntity<Object> fyiNotificationsNotificationIdPut(
            @ApiParam(value = "mark a notification read", required = true)
            @PathVariable("notificationId") String notificationId) {
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
     * Fyi settings.
     */
    public ResponseEntity<List<Object>> fyiSettingsGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Object>>(objectMapper.readValue("{}", List.class),
                        HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Object>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Object>>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Fyi settings type code.
     */
    public ResponseEntity<Object> fyiSettingsTypecodePost(
            @ApiParam(value = "fyi code", required = true) @PathVariable("typecode") String typecode,
            @ApiParam(value = "", required = true) @Valid @RequestBody CertainSubscription body) {
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
     * Fyi unread number.
     */
    public ResponseEntity<Object> fyiUnreadnumberGet() {
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
