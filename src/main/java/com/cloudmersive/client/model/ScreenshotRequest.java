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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Details of the screenshot request
 */
@ApiModel(description = "Details of the screenshot request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-17T19:00:27.561-07:00")
public class ScreenshotRequest {
  @SerializedName("Url")
  private String url = null;

  @SerializedName("ExtraLoadingWait")
  private Integer extraLoadingWait = null;

  @SerializedName("ScreenshotWidth")
  private Integer screenshotWidth = null;

  @SerializedName("ScreenshotHeight")
  private Integer screenshotHeight = null;

  public ScreenshotRequest url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public ScreenshotRequest extraLoadingWait(Integer extraLoadingWait) {
    this.extraLoadingWait = extraLoadingWait;
    return this;
  }

   /**
   * Get extraLoadingWait
   * @return extraLoadingWait
  **/
  @ApiModelProperty(value = "")
  public Integer getExtraLoadingWait() {
    return extraLoadingWait;
  }

  public void setExtraLoadingWait(Integer extraLoadingWait) {
    this.extraLoadingWait = extraLoadingWait;
  }

  public ScreenshotRequest screenshotWidth(Integer screenshotWidth) {
    this.screenshotWidth = screenshotWidth;
    return this;
  }

   /**
   * Get screenshotWidth
   * @return screenshotWidth
  **/
  @ApiModelProperty(value = "")
  public Integer getScreenshotWidth() {
    return screenshotWidth;
  }

  public void setScreenshotWidth(Integer screenshotWidth) {
    this.screenshotWidth = screenshotWidth;
  }

  public ScreenshotRequest screenshotHeight(Integer screenshotHeight) {
    this.screenshotHeight = screenshotHeight;
    return this;
  }

   /**
   * Get screenshotHeight
   * @return screenshotHeight
  **/
  @ApiModelProperty(value = "")
  public Integer getScreenshotHeight() {
    return screenshotHeight;
  }

  public void setScreenshotHeight(Integer screenshotHeight) {
    this.screenshotHeight = screenshotHeight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScreenshotRequest screenshotRequest = (ScreenshotRequest) o;
    return Objects.equals(this.url, screenshotRequest.url) &&
        Objects.equals(this.extraLoadingWait, screenshotRequest.extraLoadingWait) &&
        Objects.equals(this.screenshotWidth, screenshotRequest.screenshotWidth) &&
        Objects.equals(this.screenshotHeight, screenshotRequest.screenshotHeight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, extraLoadingWait, screenshotWidth, screenshotHeight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScreenshotRequest {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    extraLoadingWait: ").append(toIndentedString(extraLoadingWait)).append("\n");
    sb.append("    screenshotWidth: ").append(toIndentedString(screenshotWidth)).append("\n");
    sb.append("    screenshotHeight: ").append(toIndentedString(screenshotHeight)).append("\n");
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

