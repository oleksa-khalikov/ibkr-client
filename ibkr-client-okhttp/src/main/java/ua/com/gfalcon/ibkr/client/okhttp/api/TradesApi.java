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

/*
 * Client Portal Web API
 * Client Poral Web API
 *
 * OpenAPI spec version: 1.0.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ua.com.gfalcon.ibkr.client.okhttp.api;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.reflect.TypeToken;

import ua.com.gfalcon.ibkr.client.okhttp.ApiCallback;
import ua.com.gfalcon.ibkr.client.okhttp.ApiClient;
import ua.com.gfalcon.ibkr.client.okhttp.ApiException;
import ua.com.gfalcon.ibkr.client.okhttp.ApiResponse;
import ua.com.gfalcon.ibkr.client.okhttp.Configuration;
import ua.com.gfalcon.ibkr.client.okhttp.Pair;
import ua.com.gfalcon.ibkr.client.okhttp.ProgressRequestBody;
import ua.com.gfalcon.ibkr.client.okhttp.ProgressResponseBody;
import ua.com.gfalcon.ibkr.model.Trade;

/**
 * Trades Api.
 */
public class TradesApi {

    private ApiClient apiClient;

    public TradesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TradesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * List of Trades for the selected account
     * Returns a list of trades for the currently selected account for current day and six previous days. It is advised
     * to call this endpoint once per session.
     *
     * @return List&lt;Trade&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Trade> iserverAccountTradesGet() throws ApiException {
        ApiResponse<List<Trade>> resp = iserverAccountTradesGetWithHttpInfo();
        return resp.getData();
    }

    /**
     * List of Trades for the selected account
     * Returns a list of trades for the currently selected account for current day and six previous days. It is advised
     * to call this endpoint once per session.
     *
     * @return ApiResponse&lt;List&lt;Trade&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Trade>> iserverAccountTradesGetWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = iserverAccountTradesGetValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<List<Trade>>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call iserverAccountTradesGetValidateBeforeCall(
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {


        com.squareup.okhttp.Call call = iserverAccountTradesGetCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * Build call for iserverAccountTradesGet.
     *
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call iserverAccountTradesGetCall(
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Object localVarPostBody = null;
        // create path and map variables
        final String localVarPath = "/iserver/account/trades";
        final List<Pair> localVarQueryParams = new ArrayList<Pair>();
        final List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        final Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }
        final String[] localVarContentTypes = {

        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient()
                    .networkInterceptors()
                    .add(new com.squareup.okhttp.Interceptor() {
                        @Override
                        public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain)
                                throws IOException {
                            com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                            return originalResponse.newBuilder()
                                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                                    .build();
                        }
                    });
        }

        String[] localVarAuthNames = new String[]{};
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * List of Trades for the selected account (asynchronously)
     * Returns a list of trades for the currently selected account for current day and six previous days. It is advised
     * to call this endpoint once per session.
     *
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call iserverAccountTradesGetAsync(final ApiCallback<List<Trade>> callback)
            throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = iserverAccountTradesGetValidateBeforeCall(progressListener,
                progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Trade>>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

}
