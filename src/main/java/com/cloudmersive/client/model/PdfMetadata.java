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
import org.threeten.bp.OffsetDateTime;

/**
 * Result of an autodetect/get-info operation
 */
@ApiModel(description = "Result of an autodetect/get-info operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-22T11:10:33.366-08:00")
public class PdfMetadata {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("Title")
  private String title = null;

  @SerializedName("Keywords")
  private String keywords = null;

  @SerializedName("Subject")
  private String subject = null;

  @SerializedName("Author")
  private String author = null;

  @SerializedName("Creator")
  private String creator = null;

  @SerializedName("DateModified")
  private OffsetDateTime dateModified = null;

  @SerializedName("DateCreated")
  private OffsetDateTime dateCreated = null;

  @SerializedName("PageCount")
  private Integer pageCount = null;

  public PdfMetadata successful(Boolean successful) {
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

  public PdfMetadata title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Title of the document
   * @return title
  **/
  @ApiModelProperty(value = "Title of the document")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public PdfMetadata keywords(String keywords) {
    this.keywords = keywords;
    return this;
  }

   /**
   * Keywords of the document
   * @return keywords
  **/
  @ApiModelProperty(value = "Keywords of the document")
  public String getKeywords() {
    return keywords;
  }

  public void setKeywords(String keywords) {
    this.keywords = keywords;
  }

  public PdfMetadata subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Subject of the document
   * @return subject
  **/
  @ApiModelProperty(value = "Subject of the document")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public PdfMetadata author(String author) {
    this.author = author;
    return this;
  }

   /**
   * User name of the creator/author of the document, if available, null if not available
   * @return author
  **/
  @ApiModelProperty(value = "User name of the creator/author of the document, if available, null if not available")
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public PdfMetadata creator(String creator) {
    this.creator = creator;
    return this;
  }

   /**
   * Creator of the document
   * @return creator
  **/
  @ApiModelProperty(value = "Creator of the document")
  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

  public PdfMetadata dateModified(OffsetDateTime dateModified) {
    this.dateModified = dateModified;
    return this;
  }

   /**
   * The timestamp that the document was last modified, if available, null if not available
   * @return dateModified
  **/
  @ApiModelProperty(value = "The timestamp that the document was last modified, if available, null if not available")
  public OffsetDateTime getDateModified() {
    return dateModified;
  }

  public void setDateModified(OffsetDateTime dateModified) {
    this.dateModified = dateModified;
  }

  public PdfMetadata dateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * The timestamp that the document was created, if available, null if not available
   * @return dateCreated
  **/
  @ApiModelProperty(value = "The timestamp that the document was created, if available, null if not available")
  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }

  public PdfMetadata pageCount(Integer pageCount) {
    this.pageCount = pageCount;
    return this;
  }

   /**
   * The number of pages in the document
   * @return pageCount
  **/
  @ApiModelProperty(value = "The number of pages in the document")
  public Integer getPageCount() {
    return pageCount;
  }

  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfMetadata pdfMetadata = (PdfMetadata) o;
    return Objects.equals(this.successful, pdfMetadata.successful) &&
        Objects.equals(this.title, pdfMetadata.title) &&
        Objects.equals(this.keywords, pdfMetadata.keywords) &&
        Objects.equals(this.subject, pdfMetadata.subject) &&
        Objects.equals(this.author, pdfMetadata.author) &&
        Objects.equals(this.creator, pdfMetadata.creator) &&
        Objects.equals(this.dateModified, pdfMetadata.dateModified) &&
        Objects.equals(this.dateCreated, pdfMetadata.dateCreated) &&
        Objects.equals(this.pageCount, pdfMetadata.pageCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, title, keywords, subject, author, creator, dateModified, dateCreated, pageCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfMetadata {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
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
