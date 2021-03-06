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
import com.cloudmersive.client.model.AutodetectGetInfoResult;
import com.cloudmersive.client.model.AutodetectToPngResult;
import java.io.File;
import com.cloudmersive.client.model.PdfToPngResult;
import com.cloudmersive.client.model.TextConversionResult;
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
     * Get document type information
     *
     * Auto-detects a document&#39;s type information; does not require file extension.  Analyzes file contents to confirm file type.  Even if no file extension is present, the auto-detect system will reliably analyze the contents of the file and identify its file type.  Supports over 100 image file formats, Office document file formats, PDF, and more.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertDocumentAutodetectGetInfoTest() throws ApiException {
        File inputFile = null;
        AutodetectGetInfoResult response = api.convertDocumentAutodetectGetInfo(inputFile);

        // TODO: test validations
    }
    
    /**
     * Convert Document to PDF
     *
     * Automatically detect file type and convert it to PDF.  Supports all of the major Office document file formats including Word (DOCX, DOC), Excel (XLSX, XLS), PowerPoint (PPTX, PPT), over 100 image formats, HTML files, and even multi-page TIFF files.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertDocumentAutodetectToPdfTest() throws ApiException {
        File inputFile = null;
        byte[] response = api.convertDocumentAutodetectToPdf(inputFile);

        // TODO: test validations
    }
    
    /**
     * Convert Document to PNG array
     *
     * Automatically detect file type and convert it to an array of PNG images.  Supports all of the major Office document file formats, over 100 image formats, and even multi-page TIFF files.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertDocumentAutodetectToPngArrayTest() throws ApiException {
        File inputFile = null;
        AutodetectToPngResult response = api.convertDocumentAutodetectToPngArray(inputFile);

        // TODO: test validations
    }
    
    /**
     * Convert Document to Text (txt)
     *
     * Automatically detect file type and convert it to Text.  Supports all of the major Office document file formats including Word (DOCX, DOC), Excel (XLSX, XLS), PowerPoint (PPTX, PPT) and PDF files.  For spreadsheets, all worksheets will be included.  If you wish to exclude certain pages, worksheets, slides, etc. use the Split document API first, or the delete pages/slides/worksheet APIs first to adjust the document to the target state prior to converting to text.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertDocumentAutodetectToTxtTest() throws ApiException {
        File inputFile = null;
        String textFormattingMode = null;
        TextConversionResult response = api.convertDocumentAutodetectToTxt(inputFile, textFormattingMode);

        // TODO: test validations
    }
    
    /**
     * Convert CSV to Excel XLSX Spreadsheet
     *
     * Convert CSV file to Office Excel XLSX Workbooks file format.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertDocumentCsvToXlsxTest() throws ApiException {
        File inputFile = null;
        byte[] response = api.convertDocumentCsvToXlsx(inputFile);

        // TODO: test validations
    }
    
    /**
     * Convert Word DOC (97-03) Document to DOCX
     *
     * Convert/upgrade Office Word (97-2003 Format) Documents (doc) to the modern DOCX format
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertDocumentDocToDocxTest() throws ApiException {
        File inputFile = null;
        byte[] response = api.convertDocumentDocToDocx(inputFile);

        // TODO: test validations
    }
    
    /**
     * Convert Word DOC (97-03) Document to PDF
     *
     * Convert Office Word (97-2003 Format) Documents (doc) to standard PDF
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertDocumentDocToPdfTest() throws ApiException {
        File inputFile = null;
        byte[] response = api.convertDocumentDocToPdf(inputFile);

        // TODO: test validations
    }
    
    /**
     * Convert Word DOC (97-03) Document to Text (txt)
     *
     * Convert Office Word DOC (97-03) Document (doc) to text
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertDocumentDocToTxtTest() throws ApiException {
        File inputFile = null;
        TextConversionResult response = api.convertDocumentDocToTxt(inputFile);

        // TODO: test validations
    }
    
    /**
     * Convert Word DOCX Document to PDF
     *
     * Convert Office Word Documents (docx) to standard PDF
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertDocumentDocxToPdfTest() throws ApiException {
        File inputFile = null;
        byte[] response = api.convertDocumentDocxToPdf(inputFile);

        // TODO: test validations
    }
    
    /**
     * Convert Word DOCX Document to Text (txt)
     *
     * Convert Office Word Documents (docx) to text
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertDocumentDocxToTxtTest() throws ApiException {
        File inputFile = null;
        String textFormattingMode = null;
        TextConversionResult response = api.convertDocumentDocxToTxt(inputFile, textFormattingMode);

        // TODO: test validations
    }
    
    /**
     * Convert HTML document file to PDF Document
     *
     * Convert standard HTML, with full support for CSS, JavaScript, Images, and other complex behavior to PDF.  To use external files such as images, use an absolute URL to the file.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertDocumentHtmlToPdfTest() throws ApiException {
        File inputFile = null;
        byte[] response = api.convertDocumentHtmlToPdf(inputFile);

        // TODO: test validations
    }
    
    /**
     * Convert HTML document file to PNG image array
     *
     * Convert standard HTML, with full support for CSS, JavaScript, Images, and other complex behavior to an array of PNG images, one for each page.  To use external files in your HTML such as images, use an absolute URL to the file.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertDocumentHtmlToPngTest() throws ApiException {
        File inputFile = null;
        PdfToPngResult response = api.convertDocumentHtmlToPng(inputFile);

        // TODO: test validations
    }
    
    /**
     * HTML Document file to Text (txt)
     *
     * HTML document to text
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertDocumentHtmlToTxtTest() throws ApiException {
        File inputFile = null;
        TextConversionResult response = api.convertDocumentHtmlToTxt(inputFile);

        // TODO: test validations
    }
    
    /**
     * Convert PDF to Word DOCX Document
     *
     * Convert standard PDF to Office Word Documents (docx).    Converts a PDF at high fidelity into Word format, where it can be easily edited and processed.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertDocumentPdfToDocxTest() throws ApiException {
        File inputFile = null;
        byte[] response = api.convertDocumentPdfToDocx(inputFile);

        // TODO: test validations
    }
    
    /**
     * Convert PDF to Word DOCX Document based on rasterized version of the PDF
     *
     * Convert standard PDF to Office Word Documents (docx), but first rasterize the PDF.    Converts a PDF at high fidelity into Word format.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertDocumentPdfToDocxRasterizeTest() throws ApiException {
        File inputFile = null;
        byte[] response = api.convertDocumentPdfToDocxRasterize(inputFile);

        // TODO: test validations
    }
    
    /**
     * Convert PDF to PNG Image Array
     *
     * Convert PDF document to PNG array, one image per page.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertDocumentPdfToPngArrayTest() throws ApiException {
        File inputFile = null;
        PdfToPngResult response = api.convertDocumentPdfToPngArray(inputFile);

        // TODO: test validations
    }
    
    /**
     * Convert PDF to Single PNG image
     *
     * Convert PDF document to a single tall PNG image, by stacking/concatenating the images vertically into a single \&quot;tall\&quot; image
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertDocumentPdfToPngSingleTest() throws ApiException {
        File inputFile = null;
        byte[] response = api.convertDocumentPdfToPngSingle(inputFile);

        // TODO: test validations
    }
    
    /**
     * Convert PDF to PowerPoint PPTX Presentation
     *
     * Convert standard PDF to Office PowerPoint Presentation (pptx).  Converts a PDF file at high fidelity into PowerPoint format, where it can be easily edited and processed.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertDocumentPdfToPptxTest() throws ApiException {
        File inputFile = null;
        byte[] response = api.convertDocumentPdfToPptx(inputFile);

        // TODO: test validations
    }
    
    /**
     * Convert PDF Document to Text (txt)
     *
     * PDF document to text
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertDocumentPdfToTxtTest() throws ApiException {
        File inputFile = null;
        String textFormattingMode = null;
        TextConversionResult response = api.convertDocumentPdfToTxt(inputFile, textFormattingMode);

        // TODO: test validations
    }
    
    /**
     * Convert PNG Array to PDF
     *
     * Convert an array of PNG images, one image per page, into a newly-created PDF.  Supports images of different sizes as input.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertDocumentPngArrayToPdfTest() throws ApiException {
        File inputFile1 = null;
        File inputFile2 = null;
        File inputFile3 = null;
        File inputFile4 = null;
        File inputFile5 = null;
        File inputFile6 = null;
        File inputFile7 = null;
        File inputFile8 = null;
        File inputFile9 = null;
        File inputFile10 = null;
        byte[] response = api.convertDocumentPngArrayToPdf(inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10);

        // TODO: test validations
    }
    
    /**
     * Convert PowerPoint PPT (97-03) Presentation to PDF
     *
     * Convert Office PowerPoint (97-2003) Documents (ppt) to standard PDF
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertDocumentPptToPdfTest() throws ApiException {
        File inputFile = null;
        byte[] response = api.convertDocumentPptToPdf(inputFile);

        // TODO: test validations
    }
    
    /**
     * Convert PowerPoint PPT (97-03) Presentation to PPTX
     *
     * Convert/upgrade Office PowerPoint (97-2003) Documents (ppt) to modern PPTX
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertDocumentPptToPptxTest() throws ApiException {
        File inputFile = null;
        byte[] response = api.convertDocumentPptToPptx(inputFile);

        // TODO: test validations
    }
    
    /**
     * Convert PowerPoint PPTX Presentation to PDF
     *
     * Convert Office PowerPoint Documents (pptx) to standard PDF
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertDocumentPptxToPdfTest() throws ApiException {
        File inputFile = null;
        byte[] response = api.convertDocumentPptxToPdf(inputFile);

        // TODO: test validations
    }
    
    /**
     * Convert PowerPoint PPTX Presentation to Text (txt)
     *
     * Convert Office PowerPoint Documents (pptx) to standard Text
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertDocumentPptxToTxtTest() throws ApiException {
        File inputFile = null;
        TextConversionResult response = api.convertDocumentPptxToTxt(inputFile);

        // TODO: test validations
    }
    
    /**
     * Convert Excel XLS (97-03) Spreadsheet to CSV
     *
     * Convert/upgrade Office Excel (97-2003) Workbooks (xls) to standard CSV format.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertDocumentXlsToCsvTest() throws ApiException {
        File inputFile = null;
        byte[] response = api.convertDocumentXlsToCsv(inputFile);

        // TODO: test validations
    }
    
    /**
     * Convert Excel XLS (97-03) Spreadsheet to PDF
     *
     * Convert Office Excel (97-2003) Workbooks (xls) to standard PDF.  Converts all worksheets in the workbook to PDF.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertDocumentXlsToPdfTest() throws ApiException {
        File inputFile = null;
        byte[] response = api.convertDocumentXlsToPdf(inputFile);

        // TODO: test validations
    }
    
    /**
     * Convert Excel XLS (97-03) Spreadsheet to XLSX
     *
     * Convert/upgrade Office Excel (97-2003) Workbooks (xls) to modern XLSX format.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertDocumentXlsToXlsxTest() throws ApiException {
        File inputFile = null;
        byte[] response = api.convertDocumentXlsToXlsx(inputFile);

        // TODO: test validations
    }
    
    /**
     * Convert Excel XLSX Spreadsheet to CSV
     *
     * Convert Office Excel Workbooks (XLSX) to standard Comma-Separated Values (CSV) format.  Supports both XLSX and XLSB file Excel formats.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertDocumentXlsxToCsvTest() throws ApiException {
        File inputFile = null;
        String outputEncoding = null;
        byte[] response = api.convertDocumentXlsxToCsv(inputFile, outputEncoding);

        // TODO: test validations
    }
    
    /**
     * Convert Excel XLSX Spreadsheet to PDF
     *
     * Convert Office Excel Workbooks (XLSX) to standard PDF.  Converts all worksheets in the workbook to PDF.  Supports both XLSX and XLSB Excel file formats.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertDocumentXlsxToPdfTest() throws ApiException {
        File inputFile = null;
        byte[] response = api.convertDocumentXlsxToPdf(inputFile);

        // TODO: test validations
    }
    
    /**
     * Convert Excel XLSX Spreadsheet to Text (txt)
     *
     * Convert Office Excel Workbooks (XLSX) to standard Text.  Converts all worksheets in the workbook to Text.  Supports both XLSX and XLSB file formats.  When a spreadsheet contains multiple worksheets, will export all of the text from all of the worksheets.  If you wish to export the text from only one worksheet, try using the Split XLSX API to split the spreadsheet into multiple worksheet files, and then run XLSX to Text on the individual worksheet file that you need to extract the text from.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertDocumentXlsxToTxtTest() throws ApiException {
        File inputFile = null;
        TextConversionResult response = api.convertDocumentXlsxToTxt(inputFile);

        // TODO: test validations
    }
    
}
