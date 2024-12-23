/*
 * HiddenLayer ModelScan V2
 * HiddenLayer ModelScan API for scanning of models
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.hiddenlayer.sdk.rest.models;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.hiddenlayer.sdk.rest.models.ArtifactContent;
import com.hiddenlayer.sdk.rest.models.PropertyBag;
import com.hiddenlayer.sdk.rest.models.Region;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The replacement of a single region of an artifact.
 */
@JsonPropertyOrder({
  Replacement.JSON_PROPERTY_DELETED_REGION,
  Replacement.JSON_PROPERTY_INSERTED_CONTENT,
  Replacement.JSON_PROPERTY_PROPERTIES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-23T18:20:36.233399Z[GMT]", comments = "Generator version: 7.6.0")
public class Replacement {
  public static final String JSON_PROPERTY_DELETED_REGION = "deletedRegion";
  private Region deletedRegion;

  public static final String JSON_PROPERTY_INSERTED_CONTENT = "insertedContent";
  private ArtifactContent insertedContent;

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private PropertyBag properties;

  public Replacement() { 
  }

  public Replacement deletedRegion(Region deletedRegion) {
    this.deletedRegion = deletedRegion;
    return this;
  }

   /**
   * Get deletedRegion
   * @return deletedRegion
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DELETED_REGION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Region getDeletedRegion() {
    return deletedRegion;
  }


  @JsonProperty(JSON_PROPERTY_DELETED_REGION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDeletedRegion(Region deletedRegion) {
    this.deletedRegion = deletedRegion;
  }


  public Replacement insertedContent(ArtifactContent insertedContent) {
    this.insertedContent = insertedContent;
    return this;
  }

   /**
   * Get insertedContent
   * @return insertedContent
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSERTED_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ArtifactContent getInsertedContent() {
    return insertedContent;
  }


  @JsonProperty(JSON_PROPERTY_INSERTED_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInsertedContent(ArtifactContent insertedContent) {
    this.insertedContent = insertedContent;
  }


  public Replacement properties(PropertyBag properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PropertyBag getProperties() {
    return properties;
  }


  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProperties(PropertyBag properties) {
    this.properties = properties;
  }


  /**
   * Return true if this replacement object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Replacement replacement = (Replacement) o;
    return Objects.equals(this.deletedRegion, replacement.deletedRegion) &&
        Objects.equals(this.insertedContent, replacement.insertedContent) &&
        Objects.equals(this.properties, replacement.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedRegion, insertedContent, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Replacement {\n");
    sb.append("    deletedRegion: ").append(toIndentedString(deletedRegion)).append("\n");
    sb.append("    insertedContent: ").append(toIndentedString(insertedContent)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `deletedRegion` to the URL query string
    if (getDeletedRegion() != null) {
      joiner.add(getDeletedRegion().toUrlQueryString(prefix + "deletedRegion" + suffix));
    }

    // add `insertedContent` to the URL query string
    if (getInsertedContent() != null) {
      joiner.add(getInsertedContent().toUrlQueryString(prefix + "insertedContent" + suffix));
    }

    // add `properties` to the URL query string
    if (getProperties() != null) {
      joiner.add(String.format("%sproperties%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProperties()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}
