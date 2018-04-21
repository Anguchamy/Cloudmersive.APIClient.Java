/*
 * ocrapi
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
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
import com.cloudmersive.client.model.ImageToTextResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImageOcrApi {
    private ApiClient apiClient;

    public ImageOcrApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ImageOcrApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for imageOcrPost
     * @param imageFile Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call imageOcrPostCall(File imageFile, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/ocr/image/toText";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (imageFile != null)
        localVarFormParams.put("imageFile", imageFile);

        final String[] localVarAccepts = {
            "application/json", "text/json", "application/xml", "text/xml"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call imageOcrPostValidateBeforeCall(File imageFile, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new ApiException("Missing the required parameter 'imageFile' when calling imageOcrPost(Async)");
        }
        

        com.squareup.okhttp.Call call = imageOcrPostCall(imageFile, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Converts an uploaded image in common formats such as JPEG, PNG into text via Optical Character Recognition.
     * 
     * @param imageFile Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported. (required)
     * @return ImageToTextResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ImageToTextResponse imageOcrPost(File imageFile) throws ApiException {
        ApiResponse<ImageToTextResponse> resp = imageOcrPostWithHttpInfo(imageFile);
        return resp.getData();
    }

    /**
     * Converts an uploaded image in common formats such as JPEG, PNG into text via Optical Character Recognition.
     * 
     * @param imageFile Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported. (required)
     * @return ApiResponse&lt;ImageToTextResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ImageToTextResponse> imageOcrPostWithHttpInfo(File imageFile) throws ApiException {
        com.squareup.okhttp.Call call = imageOcrPostValidateBeforeCall(imageFile, null, null);
        Type localVarReturnType = new TypeToken<ImageToTextResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Converts an uploaded image in common formats such as JPEG, PNG into text via Optical Character Recognition. (asynchronously)
     * 
     * @param imageFile Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call imageOcrPostAsync(File imageFile, final ApiCallback<ImageToTextResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = imageOcrPostValidateBeforeCall(imageFile, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ImageToTextResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
