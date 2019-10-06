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


package com.cloudmersive.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.cloudmersive.client.model.AlternateFileFormatCandidate;
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
 * Result of an autodetect/get-info operation
 */
@ApiModel(description = "Result of an autodetect/get-info operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-05T22:52:00.728-07:00")
public class AutodetectGetInfoResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("DetectedFileExtension")
  private String detectedFileExtension = null;

  @SerializedName("DetectedMimeType")
  private String detectedMimeType = null;

  @SerializedName("AlternateFileTypeCandidates")
  private List<AlternateFileFormatCandidate> alternateFileTypeCandidates = null;

  public AutodetectGetInfoResult successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if the operation was successful, false otherwise
   * @return successful
  **/
  @ApiModelProperty(value = "True if the operation was successful, false otherwise")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public AutodetectGetInfoResult detectedFileExtension(String detectedFileExtension) {
    this.detectedFileExtension = detectedFileExtension;
    return this;
  }

   /**
   * Detected file extension of the file format, with a leading period
   * @return detectedFileExtension
  **/
  @ApiModelProperty(value = "Detected file extension of the file format, with a leading period")
  public String getDetectedFileExtension() {
    return detectedFileExtension;
  }

  public void setDetectedFileExtension(String detectedFileExtension) {
    this.detectedFileExtension = detectedFileExtension;
  }

  public AutodetectGetInfoResult detectedMimeType(String detectedMimeType) {
    this.detectedMimeType = detectedMimeType;
    return this;
  }

   /**
   * MIME type of this file extension
   * @return detectedMimeType
  **/
  @ApiModelProperty(value = "MIME type of this file extension")
  public String getDetectedMimeType() {
    return detectedMimeType;
  }

  public void setDetectedMimeType(String detectedMimeType) {
    this.detectedMimeType = detectedMimeType;
  }

  public AutodetectGetInfoResult alternateFileTypeCandidates(List<AlternateFileFormatCandidate> alternateFileTypeCandidates) {
    this.alternateFileTypeCandidates = alternateFileTypeCandidates;
    return this;
  }

  public AutodetectGetInfoResult addAlternateFileTypeCandidatesItem(AlternateFileFormatCandidate alternateFileTypeCandidatesItem) {
    if (this.alternateFileTypeCandidates == null) {
      this.alternateFileTypeCandidates = new ArrayList<AlternateFileFormatCandidate>();
    }
    this.alternateFileTypeCandidates.add(alternateFileTypeCandidatesItem);
    return this;
  }

   /**
   * Alternate file type options and their probability
   * @return alternateFileTypeCandidates
  **/
  @ApiModelProperty(value = "Alternate file type options and their probability")
  public List<AlternateFileFormatCandidate> getAlternateFileTypeCandidates() {
    return alternateFileTypeCandidates;
  }

  public void setAlternateFileTypeCandidates(List<AlternateFileFormatCandidate> alternateFileTypeCandidates) {
    this.alternateFileTypeCandidates = alternateFileTypeCandidates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutodetectGetInfoResult autodetectGetInfoResult = (AutodetectGetInfoResult) o;
    return Objects.equals(this.successful, autodetectGetInfoResult.successful) &&
        Objects.equals(this.detectedFileExtension, autodetectGetInfoResult.detectedFileExtension) &&
        Objects.equals(this.detectedMimeType, autodetectGetInfoResult.detectedMimeType) &&
        Objects.equals(this.alternateFileTypeCandidates, autodetectGetInfoResult.alternateFileTypeCandidates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, detectedFileExtension, detectedMimeType, alternateFileTypeCandidates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutodetectGetInfoResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    detectedFileExtension: ").append(toIndentedString(detectedFileExtension)).append("\n");
    sb.append("    detectedMimeType: ").append(toIndentedString(detectedMimeType)).append("\n");
    sb.append("    alternateFileTypeCandidates: ").append(toIndentedString(alternateFileTypeCandidates)).append("\n");
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

