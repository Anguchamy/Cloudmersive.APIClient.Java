/*
 * ocrapi
 * The powerful Optical Character Recognition (OCR) APIs let you convert scanned images of pages into recognized text.
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
import java.util.ArrayList;
import java.util.List;

/**
 * Definition of a form field for OCR data extraction from images
 */
@ApiModel(description = "Definition of a form field for OCR data extraction from images")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-05T13:44:29.442-07:00")
public class FormFieldDefinition {
  @SerializedName("FieldID")
  private String fieldID = null;

  @SerializedName("LeftAnchor")
  private String leftAnchor = null;

  @SerializedName("TopAnchor")
  private String topAnchor = null;

  @SerializedName("AnchorMode")
  private String anchorMode = null;

  @SerializedName("DataType")
  private String dataType = null;

  @SerializedName("TargetDigitCount")
  private Integer targetDigitCount = null;

  @SerializedName("MinimumCharacterCount")
  private Integer minimumCharacterCount = null;

  @SerializedName("AllowNumericDigits")
  private Boolean allowNumericDigits = null;

  @SerializedName("VerticalAlignmentType")
  private String verticalAlignmentType = null;

  @SerializedName("HorizontalAlignmentType")
  private String horizontalAlignmentType = null;

  @SerializedName("TargetFieldWidth_Relative")
  private Double targetFieldWidthRelative = null;

  @SerializedName("TargetFieldHeight_Relative")
  private Double targetFieldHeightRelative = null;

  @SerializedName("Ignore")
  private List<String> ignore = null;

  public FormFieldDefinition fieldID(String fieldID) {
    this.fieldID = fieldID;
    return this;
  }

   /**
   * The identifier of the field; use this to identify which field is being referenced
   * @return fieldID
  **/
  @ApiModelProperty(value = "The identifier of the field; use this to identify which field is being referenced")
  public String getFieldID() {
    return fieldID;
  }

  public void setFieldID(String fieldID) {
    this.fieldID = fieldID;
  }

  public FormFieldDefinition leftAnchor(String leftAnchor) {
    this.leftAnchor = leftAnchor;
    return this;
  }

   /**
   * Optional - the left-hand anchor of the field
   * @return leftAnchor
  **/
  @ApiModelProperty(value = "Optional - the left-hand anchor of the field")
  public String getLeftAnchor() {
    return leftAnchor;
  }

  public void setLeftAnchor(String leftAnchor) {
    this.leftAnchor = leftAnchor;
  }

  public FormFieldDefinition topAnchor(String topAnchor) {
    this.topAnchor = topAnchor;
    return this;
  }

   /**
   * Optional - the top anchor of the field
   * @return topAnchor
  **/
  @ApiModelProperty(value = "Optional - the top anchor of the field")
  public String getTopAnchor() {
    return topAnchor;
  }

  public void setTopAnchor(String topAnchor) {
    this.topAnchor = topAnchor;
  }

  public FormFieldDefinition anchorMode(String anchorMode) {
    this.anchorMode = anchorMode;
    return this;
  }

   /**
   * Optional - the matching mode for the anchor.  Possible values are Complete (requires the entire anchor to match) and Partial (allows only part of the anchor to match).  Default is Partial.
   * @return anchorMode
  **/
  @ApiModelProperty(value = "Optional - the matching mode for the anchor.  Possible values are Complete (requires the entire anchor to match) and Partial (allows only part of the anchor to match).  Default is Partial.")
  public String getAnchorMode() {
    return anchorMode;
  }

  public void setAnchorMode(String anchorMode) {
    this.anchorMode = anchorMode;
  }

  public FormFieldDefinition dataType(String dataType) {
    this.dataType = dataType;
    return this;
  }

   /**
   * The data type of the field; possible values are INTEGER (Integer value), STRING (Arbitrary string value, spaces are permitted), DATE (Date in a structured format), DECIMAL (Decimal number), ALPHANUMERIC (Continuous alphanumeric string with no spaces), STRINGNOWHITESPACE (A string that contains no whitespace characters), SERIALNUMBER (A serial-number style string that contains letters and numbers, and certain symbols; must contain at least one number), ALPHAONLY (Alphabet characters only, no numbers or symbols or whitespace)
   * @return dataType
  **/
  @ApiModelProperty(value = "The data type of the field; possible values are INTEGER (Integer value), STRING (Arbitrary string value, spaces are permitted), DATE (Date in a structured format), DECIMAL (Decimal number), ALPHANUMERIC (Continuous alphanumeric string with no spaces), STRINGNOWHITESPACE (A string that contains no whitespace characters), SERIALNUMBER (A serial-number style string that contains letters and numbers, and certain symbols; must contain at least one number), ALPHAONLY (Alphabet characters only, no numbers or symbols or whitespace)")
  public String getDataType() {
    return dataType;
  }

  public void setDataType(String dataType) {
    this.dataType = dataType;
  }

  public FormFieldDefinition targetDigitCount(Integer targetDigitCount) {
    this.targetDigitCount = targetDigitCount;
    return this;
  }

   /**
   * Optional - the target number of digits in the field; useful for fixed-length fields
   * @return targetDigitCount
  **/
  @ApiModelProperty(value = "Optional - the target number of digits in the field; useful for fixed-length fields")
  public Integer getTargetDigitCount() {
    return targetDigitCount;
  }

  public void setTargetDigitCount(Integer targetDigitCount) {
    this.targetDigitCount = targetDigitCount;
  }

  public FormFieldDefinition minimumCharacterCount(Integer minimumCharacterCount) {
    this.minimumCharacterCount = minimumCharacterCount;
    return this;
  }

   /**
   * Optional - the target number of digits in the field; useful for fixed-length fields
   * @return minimumCharacterCount
  **/
  @ApiModelProperty(value = "Optional - the target number of digits in the field; useful for fixed-length fields")
  public Integer getMinimumCharacterCount() {
    return minimumCharacterCount;
  }

  public void setMinimumCharacterCount(Integer minimumCharacterCount) {
    this.minimumCharacterCount = minimumCharacterCount;
  }

  public FormFieldDefinition allowNumericDigits(Boolean allowNumericDigits) {
    this.allowNumericDigits = allowNumericDigits;
    return this;
  }

   /**
   * Optional - set to false to block values that contain numeric digits, set to true to allow numeric digits
   * @return allowNumericDigits
  **/
  @ApiModelProperty(value = "Optional - set to false to block values that contain numeric digits, set to true to allow numeric digits")
  public Boolean isAllowNumericDigits() {
    return allowNumericDigits;
  }

  public void setAllowNumericDigits(Boolean allowNumericDigits) {
    this.allowNumericDigits = allowNumericDigits;
  }

  public FormFieldDefinition verticalAlignmentType(String verticalAlignmentType) {
    this.verticalAlignmentType = verticalAlignmentType;
    return this;
  }

   /**
   * Vertical alignment of target value area relative to the field anchor; Possible values are VCenter, Top, Bottom
   * @return verticalAlignmentType
  **/
  @ApiModelProperty(value = "Vertical alignment of target value area relative to the field anchor; Possible values are VCenter, Top, Bottom")
  public String getVerticalAlignmentType() {
    return verticalAlignmentType;
  }

  public void setVerticalAlignmentType(String verticalAlignmentType) {
    this.verticalAlignmentType = verticalAlignmentType;
  }

  public FormFieldDefinition horizontalAlignmentType(String horizontalAlignmentType) {
    this.horizontalAlignmentType = horizontalAlignmentType;
    return this;
  }

   /**
   * Horizontal alignment of target value area relative to the field anchor; Possible values are Left, Right
   * @return horizontalAlignmentType
  **/
  @ApiModelProperty(value = "Horizontal alignment of target value area relative to the field anchor; Possible values are Left, Right")
  public String getHorizontalAlignmentType() {
    return horizontalAlignmentType;
  }

  public void setHorizontalAlignmentType(String horizontalAlignmentType) {
    this.horizontalAlignmentType = horizontalAlignmentType;
  }

  public FormFieldDefinition targetFieldWidthRelative(Double targetFieldWidthRelative) {
    this.targetFieldWidthRelative = targetFieldWidthRelative;
    return this;
  }

   /**
   * Optional - scale factor for target field width - relative to width of field title; a value of 1.0 indicates the target value area has the same width as the field value as occurring in the image; a value of 2.0 would indicate that the target value area has 2 times the width of the field value as occurring in the image.
   * @return targetFieldWidthRelative
  **/
  @ApiModelProperty(value = "Optional - scale factor for target field width - relative to width of field title; a value of 1.0 indicates the target value area has the same width as the field value as occurring in the image; a value of 2.0 would indicate that the target value area has 2 times the width of the field value as occurring in the image.")
  public Double getTargetFieldWidthRelative() {
    return targetFieldWidthRelative;
  }

  public void setTargetFieldWidthRelative(Double targetFieldWidthRelative) {
    this.targetFieldWidthRelative = targetFieldWidthRelative;
  }

  public FormFieldDefinition targetFieldHeightRelative(Double targetFieldHeightRelative) {
    this.targetFieldHeightRelative = targetFieldHeightRelative;
    return this;
  }

   /**
   * Optional - scale factor for target field height - relative to height of field title
   * @return targetFieldHeightRelative
  **/
  @ApiModelProperty(value = "Optional - scale factor for target field height - relative to height of field title")
  public Double getTargetFieldHeightRelative() {
    return targetFieldHeightRelative;
  }

  public void setTargetFieldHeightRelative(Double targetFieldHeightRelative) {
    this.targetFieldHeightRelative = targetFieldHeightRelative;
  }

  public FormFieldDefinition ignore(List<String> ignore) {
    this.ignore = ignore;
    return this;
  }

  public FormFieldDefinition addIgnoreItem(String ignoreItem) {
    if (this.ignore == null) {
      this.ignore = new ArrayList<String>();
    }
    this.ignore.add(ignoreItem);
    return this;
  }

   /**
   * Optional - Ignore any result items that contain a partial or complete match with these text strings
   * @return ignore
  **/
  @ApiModelProperty(value = "Optional - Ignore any result items that contain a partial or complete match with these text strings")
  public List<String> getIgnore() {
    return ignore;
  }

  public void setIgnore(List<String> ignore) {
    this.ignore = ignore;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormFieldDefinition formFieldDefinition = (FormFieldDefinition) o;
    return Objects.equals(this.fieldID, formFieldDefinition.fieldID) &&
        Objects.equals(this.leftAnchor, formFieldDefinition.leftAnchor) &&
        Objects.equals(this.topAnchor, formFieldDefinition.topAnchor) &&
        Objects.equals(this.anchorMode, formFieldDefinition.anchorMode) &&
        Objects.equals(this.dataType, formFieldDefinition.dataType) &&
        Objects.equals(this.targetDigitCount, formFieldDefinition.targetDigitCount) &&
        Objects.equals(this.minimumCharacterCount, formFieldDefinition.minimumCharacterCount) &&
        Objects.equals(this.allowNumericDigits, formFieldDefinition.allowNumericDigits) &&
        Objects.equals(this.verticalAlignmentType, formFieldDefinition.verticalAlignmentType) &&
        Objects.equals(this.horizontalAlignmentType, formFieldDefinition.horizontalAlignmentType) &&
        Objects.equals(this.targetFieldWidthRelative, formFieldDefinition.targetFieldWidthRelative) &&
        Objects.equals(this.targetFieldHeightRelative, formFieldDefinition.targetFieldHeightRelative) &&
        Objects.equals(this.ignore, formFieldDefinition.ignore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldID, leftAnchor, topAnchor, anchorMode, dataType, targetDigitCount, minimumCharacterCount, allowNumericDigits, verticalAlignmentType, horizontalAlignmentType, targetFieldWidthRelative, targetFieldHeightRelative, ignore);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormFieldDefinition {\n");
    
    sb.append("    fieldID: ").append(toIndentedString(fieldID)).append("\n");
    sb.append("    leftAnchor: ").append(toIndentedString(leftAnchor)).append("\n");
    sb.append("    topAnchor: ").append(toIndentedString(topAnchor)).append("\n");
    sb.append("    anchorMode: ").append(toIndentedString(anchorMode)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    targetDigitCount: ").append(toIndentedString(targetDigitCount)).append("\n");
    sb.append("    minimumCharacterCount: ").append(toIndentedString(minimumCharacterCount)).append("\n");
    sb.append("    allowNumericDigits: ").append(toIndentedString(allowNumericDigits)).append("\n");
    sb.append("    verticalAlignmentType: ").append(toIndentedString(verticalAlignmentType)).append("\n");
    sb.append("    horizontalAlignmentType: ").append(toIndentedString(horizontalAlignmentType)).append("\n");
    sb.append("    targetFieldWidthRelative: ").append(toIndentedString(targetFieldWidthRelative)).append("\n");
    sb.append("    targetFieldHeightRelative: ").append(toIndentedString(targetFieldHeightRelative)).append("\n");
    sb.append("    ignore: ").append(toIndentedString(ignore)).append("\n");
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

