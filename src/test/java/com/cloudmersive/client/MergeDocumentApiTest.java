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

import com.cloudmersive.client.invoker.ApiException;
import java.io.File;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MergeDocumentApi
 */
@Ignore
public class MergeDocumentApiTest {

    private final MergeDocumentApi api = new MergeDocumentApi();

    
    /**
     * Merge Multple Word DOCX Together
     *
     * Combine multiple Office Word Documents (docx) into one single Office Word documents
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mergeDocumentDocxTest() throws ApiException {
        File inputFile1 = null;
        File inputFile2 = null;
        byte[] response = api.mergeDocumentDocx(inputFile1, inputFile2);

        // TODO: test validations
    }
    
}