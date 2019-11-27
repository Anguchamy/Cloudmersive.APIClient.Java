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


package com.cloudmersive.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.cloudmersive.client.model.OcrPageResultWithLinesWithLocation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Response from an OCR to lines with location operation.  Includes the confience rating and converted text result, along with the locations of the lines in the pages.
 */
@ApiModel(description = "Response from an OCR to lines with location operation.  Includes the confience rating and converted text result, along with the locations of the lines in the pages.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-26T22:01:21.135-08:00")
public class PdfToLinesWithLocationResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("OcrPages")
  private List<OcrPageResultWithLinesWithLocation> ocrPages = null;

  public PdfToLinesWithLocationResult successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if successful, false otherwise
   * @return successful
  **/
  @ApiModelProperty(value = "True if successful, false otherwise")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public PdfToLinesWithLocationResult ocrPages(List<OcrPageResultWithLinesWithLocation> ocrPages) {
    this.ocrPages = ocrPages;
    return this;
  }

  public PdfToLinesWithLocationResult addOcrPagesItem(OcrPageResultWithLinesWithLocation ocrPagesItem) {
    if (this.ocrPages == null) {
      this.ocrPages = new ArrayList<OcrPageResultWithLinesWithLocation>();
    }
    this.ocrPages.add(ocrPagesItem);
    return this;
  }

   /**
   * OCR results for each page
   * @return ocrPages
  **/
  @ApiModelProperty(value = "OCR results for each page")
  public List<OcrPageResultWithLinesWithLocation> getOcrPages() {
    return ocrPages;
  }

  public void setOcrPages(List<OcrPageResultWithLinesWithLocation> ocrPages) {
    this.ocrPages = ocrPages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfToLinesWithLocationResult pdfToLinesWithLocationResult = (PdfToLinesWithLocationResult) o;
    return Objects.equals(this.successful, pdfToLinesWithLocationResult.successful) &&
        Objects.equals(this.ocrPages, pdfToLinesWithLocationResult.ocrPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, ocrPages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfToLinesWithLocationResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    ocrPages: ").append(toIndentedString(ocrPages)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

