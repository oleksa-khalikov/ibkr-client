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

package ua.com.gfalcon.ibkr.server.jaxrs.api.factories;

import ua.com.gfalcon.ibkr.server.jaxrs.api.LogoutApiService;
import ua.com.gfalcon.ibkr.server.jaxrs.api.impl.LogoutApiServiceImpl;

/**
 * Logout api service factory.
 */
public class LogoutApiServiceFactory {

    private static final LogoutApiService service = new LogoutApiServiceImpl();

    public static LogoutApiService getLogoutApi() {
        return service;
    }

}
