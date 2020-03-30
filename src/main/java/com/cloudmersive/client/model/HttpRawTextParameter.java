/*
 * configapi
 * Config API lets you easily manage configuration at scale.
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
import com.cloudmersive.client.model.TaskOutputReference;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Raw text parameter that defines the entire body of the HTTP payload; cannot be used with other parameter types
 */
@ApiModel(description = "Raw text parameter that defines the entire body of the HTTP payload; cannot be used with other parameter types")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-29T22:36:39.124-07:00")
public class HttpRawTextParameter {
  @SerializedName("ParameterValue")
  private String parameterValue = null;

  @SerializedName("UseOutputFromPreviousTask")
  private TaskOutputReference useOutputFromPreviousTask = null;

  public HttpRawTextParameter parameterValue(String parameterValue) {
    this.parameterValue = parameterValue;
    return this;
  }

   /**
   * Text value of the parameter
   * @return parameterValue
  **/
  @ApiModelProperty(value = "Text value of the parameter")
  public String getParameterValue() {
    return parameterValue;
  }

  public void setParameterValue(String parameterValue) {
    this.parameterValue = parameterValue;
  }

  public HttpRawTextParameter useOutputFromPreviousTask(TaskOutputReference useOutputFromPreviousTask) {
    this.useOutputFromPreviousTask = useOutputFromPreviousTask;
    return this;
  }

   /**
   * Optional; use the output from a previous task as the input to this parameter.  Set to null (default) to ignore.
   * @return useOutputFromPreviousTask
  **/
  @ApiModelProperty(value = "Optional; use the output from a previous task as the input to this parameter.  Set to null (default) to ignore.")
  public TaskOutputReference getUseOutputFromPreviousTask() {
    return useOutputFromPreviousTask;
  }

  public void setUseOutputFromPreviousTask(TaskOutputReference useOutputFromPreviousTask) {
    this.useOutputFromPreviousTask = useOutputFromPreviousTask;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HttpRawTextParameter httpRawTextParameter = (HttpRawTextParameter) o;
    return Objects.equals(this.parameterValue, httpRawTextParameter.parameterValue) &&
        Objects.equals(this.useOutputFromPreviousTask, httpRawTextParameter.useOutputFromPreviousTask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameterValue, useOutputFromPreviousTask);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HttpRawTextParameter {\n");
    
    sb.append("    parameterValue: ").append(toIndentedString(parameterValue)).append("\n");
    sb.append("    useOutputFromPreviousTask: ").append(toIndentedString(useOutputFromPreviousTask)).append("\n");
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
