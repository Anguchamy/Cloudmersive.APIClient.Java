/*
 * convertapi
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
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConvertDocumentApi
 */
@Ignore
public class ConvertDocumentApiTest {

    private final ConvertDocumentApi api = new ConvertDocumentApi();

    
    /**
     * Convert Document to PDF
     *
     * Automatically detect file type and convert it to PDF.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertDocumentAutodetectToPdfTest() throws ApiException {
        File inputFile = null;
        File response = api.convertDocumentAutodetectToPdf(inputFile);

        // TODO: test validations
    }
    
    /**
     * Word DOCX to PDF
     *
     * Convert Office Word Documents (docx) to standard PDF
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertDocumentDocxToPdfTest() throws ApiException {
        File inputFile = null;
        File response = api.convertDocumentDocxToPdf(inputFile);

        // TODO: test validations
    }
    
    /**
     * PowerPoint PPTX to PDF
     *
     * Convert Office PowerPoint Documents (pptx) to standard PDF
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertDocumentPptxToPdfTest() throws ApiException {
        File inputFile = null;
        File response = api.convertDocumentPptxToPdf(inputFile);

        // TODO: test validations
    }
    
    /**
     * Excel XLSX to CSV
     *
     * Convert Office Excel Workbooks (xlsx) to standard Comma-Separated Values (CSV) format.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertDocumentXlsxToCsvTest() throws ApiException {
        File inputFile = null;
        File response = api.convertDocumentXlsxToCsv(inputFile);

        // TODO: test validations
    }
    
    /**
     * Excel XLSX to PDF
     *
     * Convert Office Excel Workbooks (xlsx) to standard PDF.  Converts all worksheets in the workbook to PDF.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertDocumentXlsxToPdfTest() throws ApiException {
        File inputFile = null;
        File response = api.convertDocumentXlsxToPdf(inputFile);

        // TODO: test validations
    }
    
}
