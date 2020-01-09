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
import com.cloudmersive.client.model.PresentationResult;
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
 * The result of splitting a presentation into individual PowerPoint PPTX slides
 */
@ApiModel(description = "The result of splitting a presentation into individual PowerPoint PPTX slides")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-08T20:51:56.219-08:00")
public class SplitPptxPresentationResult {
  @SerializedName("ResultPresentations")
  private List<PresentationResult> resultPresentations = null;

  @SerializedName("Successful")
  private Boolean successful = null;

  public SplitPptxPresentationResult resultPresentations(List<PresentationResult> resultPresentations) {
    this.resultPresentations = resultPresentations;
    return this;
  }

  public SplitPptxPresentationResult addResultPresentationsItem(PresentationResult resultPresentationsItem) {
    if (this.resultPresentations == null) {
      this.resultPresentations = new ArrayList<PresentationResult>();
    }
    this.resultPresentations.add(resultPresentationsItem);
    return this;
  }

   /**
   * Get resultPresentations
   * @return resultPresentations
  **/
  @ApiModelProperty(value = "")
  public List<PresentationResult> getResultPresentations() {
    return resultPresentations;
  }

  public void setResultPresentations(List<PresentationResult> resultPresentations) {
    this.resultPresentations = resultPresentations;
  }

  public SplitPptxPresentationResult successful(Boolean successful) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SplitPptxPresentationResult splitPptxPresentationResult = (SplitPptxPresentationResult) o;
    return Objects.equals(this.resultPresentations, splitPptxPresentationResult.resultPresentations) &&
        Objects.equals(this.successful, splitPptxPresentationResult.successful);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultPresentations, successful);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SplitPptxPresentationResult {\n");
    
    sb.append("    resultPresentations: ").append(toIndentedString(resultPresentations)).append("\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
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

