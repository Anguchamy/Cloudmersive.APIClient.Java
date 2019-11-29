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
import java.math.BigDecimal;
import java.io.File;
import com.cloudmersive.client.model.PdfFormFields;
import com.cloudmersive.client.model.PdfMetadata;
import com.cloudmersive.client.model.SetPdfFormFieldsRequest;
import com.cloudmersive.client.model.SetPdfMetadataRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EditPdfApi
 */
@Ignore
public class EditPdfApiTest {

    private final EditPdfApi api = new EditPdfApi();

    
    /**
     * Decrypt and password-protect a PDF
     *
     * Decrypt a PDF document with a password.  Decrypted PDF will no longer require a password to open.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editPdfDecryptTest() throws ApiException {
        String password = null;
        File inputFile = null;
        byte[] response = api.editPdfDecrypt(password, inputFile);

        // TODO: test validations
    }
    
    /**
     * Remove / delete pages from a PDF document
     *
     * Remove one or more pages from a PDF document
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editPdfDeletePagesTest() throws ApiException {
        File inputFile = null;
        Integer pageStart = null;
        Integer pageEnd = null;
        byte[] response = api.editPdfDeletePages(inputFile, pageStart, pageEnd);

        // TODO: test validations
    }
    
    /**
     * Encrypt and password-protect a PDF
     *
     * Encrypt a PDF document with a password.  Set an owner password to control owner (editor/creator) permissions, and set a user (reader) password to control the viewer of the PDF.  Set the password fields null to omit the given password.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editPdfEncryptTest() throws ApiException {
        File inputFile = null;
        String userPassword = null;
        String ownerPassword = null;
        String encryptionKeyLength = null;
        byte[] response = api.editPdfEncrypt(inputFile, userPassword, ownerPassword, encryptionKeyLength);

        // TODO: test validations
    }
    
    /**
     * Gets PDF Form fields and values
     *
     * Encrypt a PDF document with a password.  Set an owner password to control owner (editor/creator) permissions, and set a user (reader) password to control the viewer of the PDF.  Set the password fields null to omit the given password.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editPdfGetFormFieldsTest() throws ApiException {
        File inputFile = null;
        PdfFormFields response = api.editPdfGetFormFields(inputFile);

        // TODO: test validations
    }
    
    /**
     * Get PDF document metadata
     *
     * Returns the metadata from the PDF document, including Title, Author, etc.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editPdfGetMetadataTest() throws ApiException {
        File inputFile = null;
        PdfMetadata response = api.editPdfGetMetadata(inputFile);

        // TODO: test validations
    }
    
    /**
     * Insert / copy pages from one PDF document into another
     *
     * Copy one or more pages from one PDF document (source document) and insert them into a second PDF document (destination document).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editPdfInsertPagesTest() throws ApiException {
        File sourceFile = null;
        File destinationFile = null;
        Integer pageStartSource = null;
        Integer pageEndSource = null;
        Integer pageInsertBeforeDesitnation = null;
        byte[] response = api.editPdfInsertPages(sourceFile, destinationFile, pageStartSource, pageEndSource, pageInsertBeforeDesitnation);

        // TODO: test validations
    }
    
    /**
     * Rasterize a PDF to an image-based PDF
     *
     * Rasterize a PDF into an image-based PDF.  The output is a PDF where each page is comprised of a high-resolution image, with all text, figures and other components removed.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editPdfRasterizeTest() throws ApiException {
        File inputFile = null;
        byte[] response = api.editPdfRasterize(inputFile);

        // TODO: test validations
    }
    
    /**
     * Sets ands fills PDF Form field values
     *
     * Fill in the form fields in a PDF form with specific values.  Use form/get-fields to enumerate the available fields and their data types in an input form.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editPdfSetFormFieldsTest() throws ApiException {
        SetPdfFormFieldsRequest fieldValues = null;
        byte[] response = api.editPdfSetFormFields(fieldValues);

        // TODO: test validations
    }
    
    /**
     * Sets PDF document metadata
     *
     * Sets (writes) metadata into the input PDF document, including Title, Author, etc.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editPdfSetMetadataTest() throws ApiException {
        SetPdfMetadataRequest request = null;
        byte[] response = api.editPdfSetMetadata(request);

        // TODO: test validations
    }
    
    /**
     * Encrypt, password-protect and set restricted permissions on a PDF
     *
     * Encrypt a PDF document with a password, and set permissions on the PDF.  Set an owner password to control owner (editor/creator) permissions [required], and set a user (reader) password to control the viewer of the PDF [optional].  Set the reader password to null to omit the password.  Restrict or allow printing, copying content, document assembly, editing (read-only), form filling, modification of annotations, and degraded printing through document Digital Rights Management (DRM).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editPdfSetPermissionsTest() throws ApiException {
        String ownerPassword = null;
        String userPassword = null;
        File inputFile = null;
        String encryptionKeyLength = null;
        Boolean allowPrinting = null;
        Boolean allowDocumentAssembly = null;
        Boolean allowContentExtraction = null;
        Boolean allowFormFilling = null;
        Boolean allowEditing = null;
        Boolean allowAnnotations = null;
        Boolean allowDegradedPrinting = null;
        byte[] response = api.editPdfSetPermissions(ownerPassword, userPassword, inputFile, encryptionKeyLength, allowPrinting, allowDocumentAssembly, allowContentExtraction, allowFormFilling, allowEditing, allowAnnotations, allowDegradedPrinting);

        // TODO: test validations
    }
    
    /**
     * Add a text watermark to a PDF
     *
     * Adds a text watermark to a PDF
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editPdfWatermarkTextTest() throws ApiException {
        String watermarkText = null;
        File inputFile = null;
        String fontName = null;
        BigDecimal fontSize = null;
        String fontColor = null;
        BigDecimal fontTransparency = null;
        byte[] response = api.editPdfWatermarkText(watermarkText, inputFile, fontName, fontSize, fontColor, fontTransparency);

        // TODO: test validations
    }
    
}
