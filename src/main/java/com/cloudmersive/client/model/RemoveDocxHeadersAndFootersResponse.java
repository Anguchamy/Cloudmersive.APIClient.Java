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
 * Result of running a Remove Headers and Footers command
 */
@ApiModel(description = "Result of running a Remove Headers and Footers command")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-04T17:22:22.973-08:00")
public class RemoveDocxHeadersAndFootersResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("EditedDocumentURL")
  private String editedDocumentURL = null;

  public RemoveDocxHeadersAndFootersResponse successful(Boolean successful) {
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

  public RemoveDocxHeadersAndFootersResponse editedDocumentURL(String editedDocumentURL) {
    this.editedDocumentURL = editedDocumentURL;
    return this;
  }

   /**
   * URL of the resulting edited document; this is a secure URL and cannot be downloaded without adding the Apikey header; it is also temporary, stored in an in-memory cache and will be deleted.  Call Finish-Editing to get the result document contents.
   * @return editedDocumentURL
  **/
  @ApiModelProperty(value = "URL of the resulting edited document; this is a secure URL and cannot be downloaded without adding the Apikey header; it is also temporary, stored in an in-memory cache and will be deleted.  Call Finish-Editing to get the result document contents.")
  public String getEditedDocumentURL() {
    return editedDocumentURL;
  }

  public void setEditedDocumentURL(String editedDocumentURL) {
    this.editedDocumentURL = editedDocumentURL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoveDocxHeadersAndFootersResponse removeDocxHeadersAndFootersResponse = (RemoveDocxHeadersAndFootersResponse) o;
    return Objects.equals(this.successful, removeDocxHeadersAndFootersResponse.successful) &&
        Objects.equals(this.editedDocumentURL, removeDocxHeadersAndFootersResponse.editedDocumentURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, editedDocumentURL);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveDocxHeadersAndFootersResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    editedDocumentURL: ").append(toIndentedString(editedDocumentURL)).append("\n");
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

