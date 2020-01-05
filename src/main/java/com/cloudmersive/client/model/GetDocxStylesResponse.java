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
import com.cloudmersive.client.model.DocxStyle;
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
 * Result of running a Get-Tables command
 */
@ApiModel(description = "Result of running a Get-Tables command")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-04T17:22:22.973-08:00")
public class GetDocxStylesResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("Styles")
  private List<DocxStyle> styles = null;

  public GetDocxStylesResponse successful(Boolean successful) {
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

  public GetDocxStylesResponse styles(List<DocxStyle> styles) {
    this.styles = styles;
    return this;
  }

  public GetDocxStylesResponse addStylesItem(DocxStyle stylesItem) {
    if (this.styles == null) {
      this.styles = new ArrayList<DocxStyle>();
    }
    this.styles.add(stylesItem);
    return this;
  }

   /**
   * Styles in the DOCX document
   * @return styles
  **/
  @ApiModelProperty(value = "Styles in the DOCX document")
  public List<DocxStyle> getStyles() {
    return styles;
  }

  public void setStyles(List<DocxStyle> styles) {
    this.styles = styles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDocxStylesResponse getDocxStylesResponse = (GetDocxStylesResponse) o;
    return Objects.equals(this.successful, getDocxStylesResponse.successful) &&
        Objects.equals(this.styles, getDocxStylesResponse.styles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, styles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocxStylesResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    styles: ").append(toIndentedString(styles)).append("\n");
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

