/*
 * validateapi
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.cloudmersive.client.validate.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Syntactic validity of email address
 */
@ApiModel(description = "Syntactic validity of email address")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-10T22:46:50.387-08:00")
public class AddressVerifySyntaxOnlyResponse {
  @SerializedName("ValidAddress")
  private Boolean validAddress = null;

  public AddressVerifySyntaxOnlyResponse validAddress(Boolean validAddress) {
    this.validAddress = validAddress;
    return this;
  }

   /**
   * True if the email address is syntactically valid, false if it is not
   * @return validAddress
  **/
  @ApiModelProperty(value = "True if the email address is syntactically valid, false if it is not")
  public Boolean isValidAddress() {
    return validAddress;
  }

  public void setValidAddress(Boolean validAddress) {
    this.validAddress = validAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressVerifySyntaxOnlyResponse addressVerifySyntaxOnlyResponse = (AddressVerifySyntaxOnlyResponse) o;
    return Objects.equals(this.validAddress, addressVerifySyntaxOnlyResponse.validAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressVerifySyntaxOnlyResponse {\n");
    
    sb.append("    validAddress: ").append(toIndentedString(validAddress)).append("\n");
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

