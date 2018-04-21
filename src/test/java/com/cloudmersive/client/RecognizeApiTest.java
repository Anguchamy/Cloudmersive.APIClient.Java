/*
 * imageapi
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

import com.cloudmersive.client.invoker.ApiException;
import java.io.File;
import com.cloudmersive.client.model.ImageDescriptionResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RecognizeApi
 */
@Ignore
public class RecognizeApiTest {

    private final RecognizeApi api = new RecognizeApi();

    
    /**
     * Describe an image in natural language
     *
     * Generate an English language text description of the image as a sentence.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void recognizeDescribeTest() throws ApiException {
        File imageFile = null;
        ImageDescriptionResponse response = api.recognizeDescribe(imageFile);

        // TODO: test validations
    }
    
}
