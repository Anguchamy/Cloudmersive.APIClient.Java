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
 * Input to set-footer command
 */
@ApiModel(description = "Input to set-footer command")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-21T20:51:15.104-07:00")
public class DocxInsertImageRequest {
  @SerializedName("InputDocumentFileBytes")
  private byte[] inputDocumentFileBytes = null;

  @SerializedName("InputDocumentFileUrl")
  private String inputDocumentFileUrl = null;

  @SerializedName("InputImageFileBytes")
  private byte[] inputImageFileBytes = null;

  @SerializedName("InputImageFileUrl")
  private String inputImageFileUrl = null;

  @SerializedName("ImageWidth")
  private Long imageWidth = null;

  @SerializedName("ImageHeight")
  private Long imageHeight = null;

  public DocxInsertImageRequest inputDocumentFileBytes(byte[] inputDocumentFileBytes) {
    this.inputDocumentFileBytes = inputDocumentFileBytes;
    return this;
  }

   /**
   * Optional: Bytes of the input file to operate on
   * @return inputDocumentFileBytes
  **/
  @ApiModelProperty(value = "Optional: Bytes of the input file to operate on")
  public byte[] getInputDocumentFileBytes() {
    return inputDocumentFileBytes;
  }

  public void setInputDocumentFileBytes(byte[] inputDocumentFileBytes) {
    this.inputDocumentFileBytes = inputDocumentFileBytes;
  }

  public DocxInsertImageRequest inputDocumentFileUrl(String inputDocumentFileUrl) {
    this.inputDocumentFileUrl = inputDocumentFileUrl;
    return this;
  }

   /**
   * Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).
   * @return inputDocumentFileUrl
  **/
  @ApiModelProperty(value = "Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).")
  public String getInputDocumentFileUrl() {
    return inputDocumentFileUrl;
  }

  public void setInputDocumentFileUrl(String inputDocumentFileUrl) {
    this.inputDocumentFileUrl = inputDocumentFileUrl;
  }

  public DocxInsertImageRequest inputImageFileBytes(byte[] inputImageFileBytes) {
    this.inputImageFileBytes = inputImageFileBytes;
    return this;
  }

   /**
   * Optional: Bytes of the input image file to operate on
   * @return inputImageFileBytes
  **/
  @ApiModelProperty(value = "Optional: Bytes of the input image file to operate on")
  public byte[] getInputImageFileBytes() {
    return inputImageFileBytes;
  }

  public void setInputImageFileBytes(byte[] inputImageFileBytes) {
    this.inputImageFileBytes = inputImageFileBytes;
  }

  public DocxInsertImageRequest inputImageFileUrl(String inputImageFileUrl) {
    this.inputImageFileUrl = inputImageFileUrl;
    return this;
  }

   /**
   * Optional: URL of an image file to operate on as input.  This can be a public URL, or you can also use the begin-editing API to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).
   * @return inputImageFileUrl
  **/
  @ApiModelProperty(value = "Optional: URL of an image file to operate on as input.  This can be a public URL, or you can also use the begin-editing API to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).")
  public String getInputImageFileUrl() {
    return inputImageFileUrl;
  }

  public void setInputImageFileUrl(String inputImageFileUrl) {
    this.inputImageFileUrl = inputImageFileUrl;
  }

  public DocxInsertImageRequest imageWidth(Long imageWidth) {
    this.imageWidth = imageWidth;
    return this;
  }

   /**
   * Width in points of the image, set to 0 for default
   * @return imageWidth
  **/
  @ApiModelProperty(value = "Width in points of the image, set to 0 for default")
  public Long getImageWidth() {
    return imageWidth;
  }

  public void setImageWidth(Long imageWidth) {
    this.imageWidth = imageWidth;
  }

  public DocxInsertImageRequest imageHeight(Long imageHeight) {
    this.imageHeight = imageHeight;
    return this;
  }

   /**
   * Height in point of the image, set to 0 for default
   * @return imageHeight
  **/
  @ApiModelProperty(value = "Height in point of the image, set to 0 for default")
  public Long getImageHeight() {
    return imageHeight;
  }

  public void setImageHeight(Long imageHeight) {
    this.imageHeight = imageHeight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocxInsertImageRequest docxInsertImageRequest = (DocxInsertImageRequest) o;
    return Objects.equals(this.inputDocumentFileBytes, docxInsertImageRequest.inputDocumentFileBytes) &&
        Objects.equals(this.inputDocumentFileUrl, docxInsertImageRequest.inputDocumentFileUrl) &&
        Objects.equals(this.inputImageFileBytes, docxInsertImageRequest.inputImageFileBytes) &&
        Objects.equals(this.inputImageFileUrl, docxInsertImageRequest.inputImageFileUrl) &&
        Objects.equals(this.imageWidth, docxInsertImageRequest.imageWidth) &&
        Objects.equals(this.imageHeight, docxInsertImageRequest.imageHeight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputDocumentFileBytes, inputDocumentFileUrl, inputImageFileBytes, inputImageFileUrl, imageWidth, imageHeight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxInsertImageRequest {\n");
    
    sb.append("    inputDocumentFileBytes: ").append(toIndentedString(inputDocumentFileBytes)).append("\n");
    sb.append("    inputDocumentFileUrl: ").append(toIndentedString(inputDocumentFileUrl)).append("\n");
    sb.append("    inputImageFileBytes: ").append(toIndentedString(inputImageFileBytes)).append("\n");
    sb.append("    inputImageFileUrl: ").append(toIndentedString(inputImageFileUrl)).append("\n");
    sb.append("    imageWidth: ").append(toIndentedString(imageWidth)).append("\n");
    sb.append("    imageHeight: ").append(toIndentedString(imageHeight)).append("\n");
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
