/*
 * convertapi
 * Convert API lets you effortlessly convert file formats and types.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.cloudmersive.client;

import com.cloudmersive.client.invoker.ApiCallback;
import com.cloudmersive.client.invoker.ApiClient;
import com.cloudmersive.client.invoker.ApiException;
import com.cloudmersive.client.invoker.ApiResponse;
import com.cloudmersive.client.invoker.Configuration;
import com.cloudmersive.client.invoker.Pair;
import com.cloudmersive.client.invoker.ProgressRequestBody;
import com.cloudmersive.client.invoker.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import java.io.File;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MergeDocumentApi {
    private ApiClient apiClient;

    public MergeDocumentApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MergeDocumentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for mergeDocumentDocx
     * @param inputFile1 First input file to perform the operation on. (required)
     * @param inputFile2 Second input file to perform the operation on (more than 2 can be supplied). (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call mergeDocumentDocxCall(File inputFile1, File inputFile2, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/convert/merge/docx";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (inputFile1 != null)
        localVarFormParams.put("inputFile1", inputFile1);
        if (inputFile2 != null)
        localVarFormParams.put("inputFile2", inputFile2);

        final String[] localVarAccepts = {
            "application/octet-stream"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Apikey" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call mergeDocumentDocxValidateBeforeCall(File inputFile1, File inputFile2, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new ApiException("Missing the required parameter 'inputFile1' when calling mergeDocumentDocx(Async)");
        }
        
        // verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new ApiException("Missing the required parameter 'inputFile2' when calling mergeDocumentDocx(Async)");
        }
        

        com.squareup.okhttp.Call call = mergeDocumentDocxCall(inputFile1, inputFile2, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Merge Multple Word DOCX Together
     * Combine multiple Office Word Documents (docx) into one single Office Word documents
     * @param inputFile1 First input file to perform the operation on. (required)
     * @param inputFile2 Second input file to perform the operation on (more than 2 can be supplied). (required)
     * @return byte[]
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public byte[] mergeDocumentDocx(File inputFile1, File inputFile2) throws ApiException {
        ApiResponse<byte[]> resp = mergeDocumentDocxWithHttpInfo(inputFile1, inputFile2);
        return resp.getData();
    }

    /**
     * Merge Multple Word DOCX Together
     * Combine multiple Office Word Documents (docx) into one single Office Word documents
     * @param inputFile1 First input file to perform the operation on. (required)
     * @param inputFile2 Second input file to perform the operation on (more than 2 can be supplied). (required)
     * @return ApiResponse&lt;byte[]&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<byte[]> mergeDocumentDocxWithHttpInfo(File inputFile1, File inputFile2) throws ApiException {
        com.squareup.okhttp.Call call = mergeDocumentDocxValidateBeforeCall(inputFile1, inputFile2, null, null);
        Type localVarReturnType = new TypeToken<byte[]>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Merge Multple Word DOCX Together (asynchronously)
     * Combine multiple Office Word Documents (docx) into one single Office Word documents
     * @param inputFile1 First input file to perform the operation on. (required)
     * @param inputFile2 Second input file to perform the operation on (more than 2 can be supplied). (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call mergeDocumentDocxAsync(File inputFile1, File inputFile2, final ApiCallback<byte[]> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = mergeDocumentDocxValidateBeforeCall(inputFile1, inputFile2, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<byte[]>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
