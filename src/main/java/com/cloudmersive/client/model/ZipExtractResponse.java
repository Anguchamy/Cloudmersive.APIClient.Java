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
import com.cloudmersive.client.model.ZipDirectory;
import com.cloudmersive.client.model.ZipFile;
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
 * Result of performing a zip extract operation
 */
@ApiModel(description = "Result of performing a zip extract operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-08T21:01:17.928-08:00")
public class ZipExtractResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("FilesInZip")
  private List<ZipFile> filesInZip = null;

  @SerializedName("DirectoriesInZip")
  private List<ZipDirectory> directoriesInZip = null;

  public ZipExtractResponse successful(Boolean successful) {
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

  public ZipExtractResponse filesInZip(List<ZipFile> filesInZip) {
    this.filesInZip = filesInZip;
    return this;
  }

  public ZipExtractResponse addFilesInZipItem(ZipFile filesInZipItem) {
    if (this.filesInZip == null) {
      this.filesInZip = new ArrayList<ZipFile>();
    }
    this.filesInZip.add(filesInZipItem);
    return this;
  }

   /**
   * Top-level files in the root directory fo the zip file
   * @return filesInZip
  **/
  @ApiModelProperty(value = "Top-level files in the root directory fo the zip file")
  public List<ZipFile> getFilesInZip() {
    return filesInZip;
  }

  public void setFilesInZip(List<ZipFile> filesInZip) {
    this.filesInZip = filesInZip;
  }

  public ZipExtractResponse directoriesInZip(List<ZipDirectory> directoriesInZip) {
    this.directoriesInZip = directoriesInZip;
    return this;
  }

  public ZipExtractResponse addDirectoriesInZipItem(ZipDirectory directoriesInZipItem) {
    if (this.directoriesInZip == null) {
      this.directoriesInZip = new ArrayList<ZipDirectory>();
    }
    this.directoriesInZip.add(directoriesInZipItem);
    return this;
  }

   /**
   * Top-level directories in the root directory of the zip; directories can contain sub-directories and files
   * @return directoriesInZip
  **/
  @ApiModelProperty(value = "Top-level directories in the root directory of the zip; directories can contain sub-directories and files")
  public List<ZipDirectory> getDirectoriesInZip() {
    return directoriesInZip;
  }

  public void setDirectoriesInZip(List<ZipDirectory> directoriesInZip) {
    this.directoriesInZip = directoriesInZip;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZipExtractResponse zipExtractResponse = (ZipExtractResponse) o;
    return Objects.equals(this.successful, zipExtractResponse.successful) &&
        Objects.equals(this.filesInZip, zipExtractResponse.filesInZip) &&
        Objects.equals(this.directoriesInZip, zipExtractResponse.directoriesInZip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, filesInZip, directoriesInZip);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZipExtractResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    filesInZip: ").append(toIndentedString(filesInZip)).append("\n");
    sb.append("    directoriesInZip: ").append(toIndentedString(directoriesInZip)).append("\n");
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

