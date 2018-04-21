/*
 * barcodeapi
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
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
import com.cloudmersive.client.model.ProductMatch;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * BarcodeLookupResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-21T01:02:13.710-07:00")
public class BarcodeLookupResponse {
  @JsonProperty("Successful")
  private Boolean successful = null;

  @JsonProperty("Matches")
  private List<ProductMatch> matches = null;

  public BarcodeLookupResponse successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * Get successful
   * @return successful
  **/
  @ApiModelProperty(value = "")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public BarcodeLookupResponse matches(List<ProductMatch> matches) {
    this.matches = matches;
    return this;
  }

  public BarcodeLookupResponse addMatchesItem(ProductMatch matchesItem) {
    if (this.matches == null) {
      this.matches = new ArrayList<ProductMatch>();
    }
    this.matches.add(matchesItem);
    return this;
  }

   /**
   * Get matches
   * @return matches
  **/
  @ApiModelProperty(value = "")
  public List<ProductMatch> getMatches() {
    return matches;
  }

  public void setMatches(List<ProductMatch> matches) {
    this.matches = matches;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BarcodeLookupResponse barcodeLookupResponse = (BarcodeLookupResponse) o;
    return Objects.equals(this.successful, barcodeLookupResponse.successful) &&
        Objects.equals(this.matches, barcodeLookupResponse.matches);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, matches);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BarcodeLookupResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
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

