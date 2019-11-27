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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Input to a Insert Paragraph request
 */
@ApiModel(description = "Input to a Insert Paragraph request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-26T22:01:33.635-08:00")
public class DocxRemoveObjectRequest {
  @SerializedName("InputFileBytes")
  private byte[] inputFileBytes = null;

  @SerializedName("InputFileUrl")
  private String inputFileUrl = null;

  @SerializedName("PathToObjectToRemove")
  private String pathToObjectToRemove = null;

  public DocxRemoveObjectRequest inputFileBytes(byte[] inputFileBytes) {
    this.inputFileBytes = inputFileBytes;
    return this;
  }

   /**
   * Optional: Bytes of the input file to operate on
   * @return inputFileBytes
  **/
  @ApiModelProperty(value = "Optional: Bytes of the input file to operate on")
  public byte[] getInputFileBytes() {
    return inputFileBytes;
  }

  public void setInputFileBytes(byte[] inputFileBytes) {
    this.inputFileBytes = inputFileBytes;
  }

  public DocxRemoveObjectRequest inputFileUrl(String inputFileUrl) {
    this.inputFileUrl = inputFileUrl;
    return this;
  }

   /**
   * Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).
   * @return inputFileUrl
  **/
  @ApiModelProperty(value = "Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).")
  public String getInputFileUrl() {
    return inputFileUrl;
  }

  public void setInputFileUrl(String inputFileUrl) {
    this.inputFileUrl = inputFileUrl;
  }

  public DocxRemoveObjectRequest pathToObjectToRemove(String pathToObjectToRemove) {
    this.pathToObjectToRemove = pathToObjectToRemove;
    return this;
  }

   /**
   * Path within the document of the object to delete; fill in the PathToObjectToRemove field using the Path value from an existing object.
   * @return pathToObjectToRemove
  **/
  @ApiModelProperty(value = "Path within the document of the object to delete; fill in the PathToObjectToRemove field using the Path value from an existing object.")
  public String getPathToObjectToRemove() {
    return pathToObjectToRemove;
  }

  public void setPathToObjectToRemove(String pathToObjectToRemove) {
    this.pathToObjectToRemove = pathToObjectToRemove;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocxRemoveObjectRequest docxRemoveObjectRequest = (DocxRemoveObjectRequest) o;
    return Arrays.equals(this.inputFileBytes, docxRemoveObjectRequest.inputFileBytes) &&
        Objects.equals(this.inputFileUrl, docxRemoveObjectRequest.inputFileUrl) &&
        Objects.equals(this.pathToObjectToRemove, docxRemoveObjectRequest.pathToObjectToRemove);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(inputFileBytes), inputFileUrl, pathToObjectToRemove);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxRemoveObjectRequest {\n");
    
    sb.append("    inputFileBytes: ").append(toIndentedString(inputFileBytes)).append("\n");
    sb.append("    inputFileUrl: ").append(toIndentedString(inputFileUrl)).append("\n");
    sb.append("    pathToObjectToRemove: ").append(toIndentedString(pathToObjectToRemove)).append("\n");
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

