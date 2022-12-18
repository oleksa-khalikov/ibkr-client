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
import ua.com.gfalcon.ibkr.model.Body;
import ua.com.gfalcon.ibkr.model.Performance;
import ua.com.gfalcon.ibkr.model.Summary;
import ua.com.gfalcon.ibkr.model.Transactions;

/**
 * Portfolio analyst api.
 */
public class PortfolioAnalystApi {

    private ApiClient apiClient;

    public PortfolioAnalystApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PortfolioAnalystApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Account Performance
     * Returns the performance (MTM) for the given accounts, if more than one account is passed, the result is
     * consolidated.
     *
     * @param body an array of account ids (required)
     * @return Performance
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Performance paPerformancePost(Body body) throws ApiException {
        ApiResponse<Performance> resp = paPerformancePostWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Account Performance
     * Returns the performance (MTM) for the given accounts, if more than one account is passed, the result is
     * consolidated.
     *
     * @param body an array of account ids (required)
     * @return ApiResponse&lt;Performance&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Performance> paPerformancePostWithHttpInfo(Body body) throws ApiException {
        com.squareup.okhttp.Call call = paPerformancePostValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<Performance>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call paPerformancePostValidateBeforeCall(Body body,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling paPerformancePost(Async)");
        }


        com.squareup.okhttp.Call call = paPerformancePostCall(body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Build call for paPerformancePost.
     *
     * @param body                    an array of account ids (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call paPerformancePostCall(Body body,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Object localVarPostBody = body;

        // create path and map variables
        final String localVarPath = "/pa/performance";

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Account Performance (asynchronously)
     * Returns the performance (MTM) for the given accounts, if more than one account is passed, the result is
     * consolidated.
     *
     * @param body     an array of account ids (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call paPerformancePostAsync(Body body, final ApiCallback<Performance> callback)
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

        com.squareup.okhttp.Call call = paPerformancePostValidateBeforeCall(body, progressListener,
                progressRequestListener);
        Type localVarReturnType = new TypeToken<Performance>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Account Balance&#39;s Summary
     * Returns a summary of all account balances for the given accounts, if more than one account is passed, the result
     * is consolidated.
     *
     * @param body an array of account ids (required)
     * @return Summary
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Summary paSummaryPost(Body body) throws ApiException {
        ApiResponse<Summary> resp = paSummaryPostWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Account Balance&#39;s Summary
     * Returns a summary of all account balances for the given accounts, if more than one account is passed, the result
     * is consolidated.
     *
     * @param body an array of account ids (required)
     * @return ApiResponse&lt;Summary&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Summary> paSummaryPostWithHttpInfo(Body body) throws ApiException {
        com.squareup.okhttp.Call call = paSummaryPostValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<Summary>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call paSummaryPostValidateBeforeCall(Body body,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling paSummaryPost(Async)");
        }


        com.squareup.okhttp.Call call = paSummaryPostCall(body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Build call for paSummaryPost.
     *
     * @param body                    an array of account ids (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call paSummaryPostCall(Body body,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Object localVarPostBody = body;

        // create path and map variables
        final String localVarPath = "/pa/summary";

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Account Balance&#39;s Summary (asynchronously)
     * Returns a summary of all account balances for the given accounts, if more than one account is passed, the result
     * is consolidated.
     *
     * @param body     an array of account ids (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call paSummaryPostAsync(Body body, final ApiCallback<Summary> callback)
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

        com.squareup.okhttp.Call call = paSummaryPostValidateBeforeCall(body, progressListener,
                progressRequestListener);
        Type localVarReturnType = new TypeToken<Summary>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Position&#39;s Transaction History
     * transaction history for a given number of conids and accounts. Types of transactions include dividend payments,
     * buy and sell transactions, transfers.
     *
     * @param body (required)
     * @return Transactions
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Transactions paTransactionsPost(Body body) throws ApiException {
        ApiResponse<Transactions> resp = paTransactionsPostWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Position&#39;s Transaction History
     * transaction history for a given number of conids and accounts. Types of transactions include dividend payments,
     * buy and sell transactions, transfers.
     *
     * @param body (required)
     * @return ApiResponse&lt;Transactions&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Transactions> paTransactionsPostWithHttpInfo(Body body) throws ApiException {
        com.squareup.okhttp.Call call = paTransactionsPostValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<Transactions>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call paTransactionsPostValidateBeforeCall(Body body,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling paTransactionsPost(Async)");
        }


        com.squareup.okhttp.Call call = paTransactionsPostCall(body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Build call for paTransactionsPost.
     *
     * @param body                    (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call paTransactionsPostCall(Body body,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Object localVarPostBody = body;

        // create path and map variables
        final String localVarPath = "/pa/transactions";

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Position&#39;s Transaction History (asynchronously)
     * transaction history for a given number of conids and accounts. Types of transactions include dividend payments,
     * buy and sell transactions, transfers.
     *
     * @param body     (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call paTransactionsPostAsync(Body body, final ApiCallback<Transactions> callback)
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

        com.squareup.okhttp.Call call = paTransactionsPostValidateBeforeCall(body, progressListener,
                progressRequestListener);
        Type localVarReturnType = new TypeToken<Transactions>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

}