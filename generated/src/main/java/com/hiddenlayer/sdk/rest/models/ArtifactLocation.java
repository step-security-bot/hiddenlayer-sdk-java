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
import com.hiddenlayer.sdk.rest.models.Message;
import com.hiddenlayer.sdk.rest.models.PropertyBag;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Specifies the location of an artifact.
 */
@JsonPropertyOrder({
  ArtifactLocation.JSON_PROPERTY_URI,
  ArtifactLocation.JSON_PROPERTY_URI_BASE_ID,
  ArtifactLocation.JSON_PROPERTY_INDEX,
  ArtifactLocation.JSON_PROPERTY_DESCRIPTION,
  ArtifactLocation.JSON_PROPERTY_PROPERTIES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-23T18:20:36.233399Z[GMT]", comments = "Generator version: 7.6.0")
public class ArtifactLocation {
  public static final String JSON_PROPERTY_URI = "uri";
  private String uri;

  public static final String JSON_PROPERTY_URI_BASE_ID = "uriBaseId";
  private String uriBaseId;

  public static final String JSON_PROPERTY_INDEX = "index";
  private Integer index = -1;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<Message> description = JsonNullable.<Message>undefined();

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private PropertyBag properties;

  public ArtifactLocation() { 
  }

  public ArtifactLocation uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * A string containing a valid relative or absolute URI.
   * @return uri
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUri() {
    return uri;
  }


  @JsonProperty(JSON_PROPERTY_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUri(String uri) {
    this.uri = uri;
  }


  public ArtifactLocation uriBaseId(String uriBaseId) {
    this.uriBaseId = uriBaseId;
    return this;
  }

   /**
   * A string which indirectly specifies the absolute URI with respect to which a relative URI in the \&quot;uri\&quot; property is interpreted.
   * @return uriBaseId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URI_BASE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUriBaseId() {
    return uriBaseId;
  }


  @JsonProperty(JSON_PROPERTY_URI_BASE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUriBaseId(String uriBaseId) {
    this.uriBaseId = uriBaseId;
  }


  public ArtifactLocation index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * The index within the run artifacts array of the artifact object associated with the artifact location.
   * minimum: -1
   * @return index
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIndex() {
    return index;
  }


  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndex(Integer index) {
    this.index = index;
  }


  public ArtifactLocation description(Message description) {
    this.description = JsonNullable.<Message>of(description);
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Message getDescription() {
        return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Message> getDescription_JsonNullable() {
    return description;
  }
  
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<Message> description) {
    this.description = description;
  }

  public void setDescription(Message description) {
    this.description = JsonNullable.<Message>of(description);
  }


  public ArtifactLocation properties(PropertyBag properties) {
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
   * Return true if this artifactLocation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArtifactLocation artifactLocation = (ArtifactLocation) o;
    return Objects.equals(this.uri, artifactLocation.uri) &&
        Objects.equals(this.uriBaseId, artifactLocation.uriBaseId) &&
        Objects.equals(this.index, artifactLocation.index) &&
        equalsNullable(this.description, artifactLocation.description) &&
        Objects.equals(this.properties, artifactLocation.properties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(uri, uriBaseId, index, hashCodeNullable(description), properties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArtifactLocation {\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    uriBaseId: ").append(toIndentedString(uriBaseId)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

    // add `uri` to the URL query string
    if (getUri() != null) {
      joiner.add(String.format("%suri%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUri()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `uriBaseId` to the URL query string
    if (getUriBaseId() != null) {
      joiner.add(String.format("%suriBaseId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUriBaseId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `index` to the URL query string
    if (getIndex() != null) {
      joiner.add(String.format("%sindex%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIndex()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(getDescription().toUrlQueryString(prefix + "description" + suffix));
    }

    // add `properties` to the URL query string
    if (getProperties() != null) {
      joiner.add(String.format("%sproperties%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProperties()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}
