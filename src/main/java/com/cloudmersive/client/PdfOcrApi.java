/*
 * ocrapi
 * The powerful Optical Character Recognition (OCR) APIs let you convert scanned images of pages into recognized text.
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
import com.cloudmersive.client.model.PdfToTextResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PdfOcrApi {
    private ApiClient apiClient;

    public PdfOcrApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PdfOcrApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for pdfOcrPost
     * @param imageFile Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported. (required)
     * @param language Optional, language of the input document, default is English (ENG).  Possible values are ENG (English), ARA (Arabic), ZHO (Chinese - Simplified), ZHO-HANT (Chinese - Traditional), ASM (Assamese), AFR (Afrikaans), AMH (Amharic), AZE (Azerbaijani), AZE-CYRL (Azerbaijani - Cyrillic), BEL (Belarusian), BEN (Bengali), BOD (Tibetan), BOS (Bosnian), BUL (Bulgarian), CAT (Catalan; Valencian), CEB (Cebuano), CES (Czech), CHR (Cherokee), CYM (Welsh), DAN (Danish), DEU (German), DZO (Dzongkha), ELL (Greek), ENM (Archaic/Middle English), EPO (Esperanto), EST (Estonian), EUS (Basque), FAS (Persian), FIN (Finnish), FRA (French), FRK (Frankish), FRM (Middle-French), GLE (Irish), GLG (Galician), GRC (Ancient Greek), HAT (Hatian), HEB (Hebrew), HIN (Hindi), HRV (Croatian), HUN (Hungarian), IKU (Inuktitut), IND (Indonesian), ISL (Icelandic), ITA (Italian), ITA-OLD (Old - Italian), JAV (Javanese), JPN (Japanese), KAN (Kannada), KAT (Georgian), KAT-OLD (Old-Georgian), KAZ (Kazakh), KHM (Central Khmer), KIR (Kirghiz), KOR (Korean), KUR (Kurdish), LAO (Lao), LAT (Latin), LAV (Latvian), LIT (Lithuanian), MAL (Malayalam), MAR (Marathi), MKD (Macedonian), MLT (Maltese), MSA (Malay), MYA (Burmese), NEP (Nepali), NLD (Dutch), NOR (Norwegian), ORI (Oriya), PAN (Panjabi), POL (Polish), POR (Portuguese), PUS (Pushto), RON (Romanian), RUS (Russian), SAN (Sanskrit), SIN (Sinhala), SLK (Slovak), SLV (Slovenian), SPA (Spanish), SPA-OLD (Old Spanish), SQI (Albanian), SRP (Serbian), SRP-LAT (Latin Serbian), SWA (Swahili), SWE (Swedish), SYR (Syriac), TAM (Tamil), TEL (Telugu), TGK (Tajik), TGL (Tagalog), THA (Thai), TIR (Tigrinya), TUR (Turkish), UIG (Uighur), UKR (Ukrainian), URD (Urdu), UZB (Uzbek), UZB-CYR (Cyrillic Uzbek), VIE (Vietnamese), YID (Yiddish) (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call pdfOcrPostCall(File imageFile, String language, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/ocr/pdf/toText";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (language != null)
        localVarHeaderParams.put("language", apiClient.parameterToString(language));

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

        String[] localVarAuthNames = new String[] { "Apikey" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call pdfOcrPostValidateBeforeCall(File imageFile, String language, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new ApiException("Missing the required parameter 'imageFile' when calling pdfOcrPost(Async)");
        }
        

        com.squareup.okhttp.Call call = pdfOcrPostCall(imageFile, language, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Converts an uploaded image in common formats such as JPEG, PNG into text via Optical Character Recognition.
     * 
     * @param imageFile Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported. (required)
     * @param language Optional, language of the input document, default is English (ENG).  Possible values are ENG (English), ARA (Arabic), ZHO (Chinese - Simplified), ZHO-HANT (Chinese - Traditional), ASM (Assamese), AFR (Afrikaans), AMH (Amharic), AZE (Azerbaijani), AZE-CYRL (Azerbaijani - Cyrillic), BEL (Belarusian), BEN (Bengali), BOD (Tibetan), BOS (Bosnian), BUL (Bulgarian), CAT (Catalan; Valencian), CEB (Cebuano), CES (Czech), CHR (Cherokee), CYM (Welsh), DAN (Danish), DEU (German), DZO (Dzongkha), ELL (Greek), ENM (Archaic/Middle English), EPO (Esperanto), EST (Estonian), EUS (Basque), FAS (Persian), FIN (Finnish), FRA (French), FRK (Frankish), FRM (Middle-French), GLE (Irish), GLG (Galician), GRC (Ancient Greek), HAT (Hatian), HEB (Hebrew), HIN (Hindi), HRV (Croatian), HUN (Hungarian), IKU (Inuktitut), IND (Indonesian), ISL (Icelandic), ITA (Italian), ITA-OLD (Old - Italian), JAV (Javanese), JPN (Japanese), KAN (Kannada), KAT (Georgian), KAT-OLD (Old-Georgian), KAZ (Kazakh), KHM (Central Khmer), KIR (Kirghiz), KOR (Korean), KUR (Kurdish), LAO (Lao), LAT (Latin), LAV (Latvian), LIT (Lithuanian), MAL (Malayalam), MAR (Marathi), MKD (Macedonian), MLT (Maltese), MSA (Malay), MYA (Burmese), NEP (Nepali), NLD (Dutch), NOR (Norwegian), ORI (Oriya), PAN (Panjabi), POL (Polish), POR (Portuguese), PUS (Pushto), RON (Romanian), RUS (Russian), SAN (Sanskrit), SIN (Sinhala), SLK (Slovak), SLV (Slovenian), SPA (Spanish), SPA-OLD (Old Spanish), SQI (Albanian), SRP (Serbian), SRP-LAT (Latin Serbian), SWA (Swahili), SWE (Swedish), SYR (Syriac), TAM (Tamil), TEL (Telugu), TGK (Tajik), TGL (Tagalog), THA (Thai), TIR (Tigrinya), TUR (Turkish), UIG (Uighur), UKR (Ukrainian), URD (Urdu), UZB (Uzbek), UZB-CYR (Cyrillic Uzbek), VIE (Vietnamese), YID (Yiddish) (optional)
     * @return PdfToTextResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PdfToTextResponse pdfOcrPost(File imageFile, String language) throws ApiException {
        ApiResponse<PdfToTextResponse> resp = pdfOcrPostWithHttpInfo(imageFile, language);
        return resp.getData();
    }

    /**
     * Converts an uploaded image in common formats such as JPEG, PNG into text via Optical Character Recognition.
     * 
     * @param imageFile Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported. (required)
     * @param language Optional, language of the input document, default is English (ENG).  Possible values are ENG (English), ARA (Arabic), ZHO (Chinese - Simplified), ZHO-HANT (Chinese - Traditional), ASM (Assamese), AFR (Afrikaans), AMH (Amharic), AZE (Azerbaijani), AZE-CYRL (Azerbaijani - Cyrillic), BEL (Belarusian), BEN (Bengali), BOD (Tibetan), BOS (Bosnian), BUL (Bulgarian), CAT (Catalan; Valencian), CEB (Cebuano), CES (Czech), CHR (Cherokee), CYM (Welsh), DAN (Danish), DEU (German), DZO (Dzongkha), ELL (Greek), ENM (Archaic/Middle English), EPO (Esperanto), EST (Estonian), EUS (Basque), FAS (Persian), FIN (Finnish), FRA (French), FRK (Frankish), FRM (Middle-French), GLE (Irish), GLG (Galician), GRC (Ancient Greek), HAT (Hatian), HEB (Hebrew), HIN (Hindi), HRV (Croatian), HUN (Hungarian), IKU (Inuktitut), IND (Indonesian), ISL (Icelandic), ITA (Italian), ITA-OLD (Old - Italian), JAV (Javanese), JPN (Japanese), KAN (Kannada), KAT (Georgian), KAT-OLD (Old-Georgian), KAZ (Kazakh), KHM (Central Khmer), KIR (Kirghiz), KOR (Korean), KUR (Kurdish), LAO (Lao), LAT (Latin), LAV (Latvian), LIT (Lithuanian), MAL (Malayalam), MAR (Marathi), MKD (Macedonian), MLT (Maltese), MSA (Malay), MYA (Burmese), NEP (Nepali), NLD (Dutch), NOR (Norwegian), ORI (Oriya), PAN (Panjabi), POL (Polish), POR (Portuguese), PUS (Pushto), RON (Romanian), RUS (Russian), SAN (Sanskrit), SIN (Sinhala), SLK (Slovak), SLV (Slovenian), SPA (Spanish), SPA-OLD (Old Spanish), SQI (Albanian), SRP (Serbian), SRP-LAT (Latin Serbian), SWA (Swahili), SWE (Swedish), SYR (Syriac), TAM (Tamil), TEL (Telugu), TGK (Tajik), TGL (Tagalog), THA (Thai), TIR (Tigrinya), TUR (Turkish), UIG (Uighur), UKR (Ukrainian), URD (Urdu), UZB (Uzbek), UZB-CYR (Cyrillic Uzbek), VIE (Vietnamese), YID (Yiddish) (optional)
     * @return ApiResponse&lt;PdfToTextResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PdfToTextResponse> pdfOcrPostWithHttpInfo(File imageFile, String language) throws ApiException {
        com.squareup.okhttp.Call call = pdfOcrPostValidateBeforeCall(imageFile, language, null, null);
        Type localVarReturnType = new TypeToken<PdfToTextResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Converts an uploaded image in common formats such as JPEG, PNG into text via Optical Character Recognition. (asynchronously)
     * 
     * @param imageFile Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported. (required)
     * @param language Optional, language of the input document, default is English (ENG).  Possible values are ENG (English), ARA (Arabic), ZHO (Chinese - Simplified), ZHO-HANT (Chinese - Traditional), ASM (Assamese), AFR (Afrikaans), AMH (Amharic), AZE (Azerbaijani), AZE-CYRL (Azerbaijani - Cyrillic), BEL (Belarusian), BEN (Bengali), BOD (Tibetan), BOS (Bosnian), BUL (Bulgarian), CAT (Catalan; Valencian), CEB (Cebuano), CES (Czech), CHR (Cherokee), CYM (Welsh), DAN (Danish), DEU (German), DZO (Dzongkha), ELL (Greek), ENM (Archaic/Middle English), EPO (Esperanto), EST (Estonian), EUS (Basque), FAS (Persian), FIN (Finnish), FRA (French), FRK (Frankish), FRM (Middle-French), GLE (Irish), GLG (Galician), GRC (Ancient Greek), HAT (Hatian), HEB (Hebrew), HIN (Hindi), HRV (Croatian), HUN (Hungarian), IKU (Inuktitut), IND (Indonesian), ISL (Icelandic), ITA (Italian), ITA-OLD (Old - Italian), JAV (Javanese), JPN (Japanese), KAN (Kannada), KAT (Georgian), KAT-OLD (Old-Georgian), KAZ (Kazakh), KHM (Central Khmer), KIR (Kirghiz), KOR (Korean), KUR (Kurdish), LAO (Lao), LAT (Latin), LAV (Latvian), LIT (Lithuanian), MAL (Malayalam), MAR (Marathi), MKD (Macedonian), MLT (Maltese), MSA (Malay), MYA (Burmese), NEP (Nepali), NLD (Dutch), NOR (Norwegian), ORI (Oriya), PAN (Panjabi), POL (Polish), POR (Portuguese), PUS (Pushto), RON (Romanian), RUS (Russian), SAN (Sanskrit), SIN (Sinhala), SLK (Slovak), SLV (Slovenian), SPA (Spanish), SPA-OLD (Old Spanish), SQI (Albanian), SRP (Serbian), SRP-LAT (Latin Serbian), SWA (Swahili), SWE (Swedish), SYR (Syriac), TAM (Tamil), TEL (Telugu), TGK (Tajik), TGL (Tagalog), THA (Thai), TIR (Tigrinya), TUR (Turkish), UIG (Uighur), UKR (Ukrainian), URD (Urdu), UZB (Uzbek), UZB-CYR (Cyrillic Uzbek), VIE (Vietnamese), YID (Yiddish) (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call pdfOcrPostAsync(File imageFile, String language, final ApiCallback<PdfToTextResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = pdfOcrPostValidateBeforeCall(imageFile, language, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PdfToTextResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
