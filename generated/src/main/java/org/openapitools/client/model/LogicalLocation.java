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


package org.openapitools.client.model;

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
import java.util.Arrays;
import org.openapitools.client.model.PropertyBag;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A logical location of a construct that produced a result.
 */
@JsonPropertyOrder({
  LogicalLocation.JSON_PROPERTY_NAME,
  LogicalLocation.JSON_PROPERTY_INDEX,
  LogicalLocation.JSON_PROPERTY_FULLY_QUALIFIED_NAME,
  LogicalLocation.JSON_PROPERTY_DECORATED_NAME,
  LogicalLocation.JSON_PROPERTY_PARENT_INDEX,
  LogicalLocation.JSON_PROPERTY_KIND,
  LogicalLocation.JSON_PROPERTY_PROPERTIES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T21:07:55.255008Z[GMT]", comments = "Generator version: 7.6.0")
public class LogicalLocation {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_INDEX = "index";
  private Integer index = -1;

  public static final String JSON_PROPERTY_FULLY_QUALIFIED_NAME = "fullyQualifiedName";
  private String fullyQualifiedName;

  public static final String JSON_PROPERTY_DECORATED_NAME = "decoratedName";
  private String decoratedName;

  public static final String JSON_PROPERTY_PARENT_INDEX = "parentIndex";
  private Integer parentIndex = -1;

  public static final String JSON_PROPERTY_KIND = "kind";
  private String kind;

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private PropertyBag properties;

  public LogicalLocation() { 
  }

  public LogicalLocation name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Identifies the construct in which the result occurred. For example, this property might contain the name of a class or a method.
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public LogicalLocation index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * The index within the logical locations array.
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


  public LogicalLocation fullyQualifiedName(String fullyQualifiedName) {
    this.fullyQualifiedName = fullyQualifiedName;
    return this;
  }

   /**
   * The human-readable fully qualified name of the logical location.
   * @return fullyQualifiedName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FULLY_QUALIFIED_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFullyQualifiedName() {
    return fullyQualifiedName;
  }


  @JsonProperty(JSON_PROPERTY_FULLY_QUALIFIED_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFullyQualifiedName(String fullyQualifiedName) {
    this.fullyQualifiedName = fullyQualifiedName;
  }


  public LogicalLocation decoratedName(String decoratedName) {
    this.decoratedName = decoratedName;
    return this;
  }

   /**
   * The machine-readable name for the logical location, such as a mangled function name provided by a C++ compiler that encodes calling convention, return type and other details along with the function name.
   * @return decoratedName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DECORATED_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDecoratedName() {
    return decoratedName;
  }


  @JsonProperty(JSON_PROPERTY_DECORATED_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDecoratedName(String decoratedName) {
    this.decoratedName = decoratedName;
  }


  public LogicalLocation parentIndex(Integer parentIndex) {
    this.parentIndex = parentIndex;
    return this;
  }

   /**
   * Identifies the index of the immediate parent of the construct in which the result was detected. For example, this property might point to a logical location that represents the namespace that holds a type.
   * minimum: -1
   * @return parentIndex
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARENT_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getParentIndex() {
    return parentIndex;
  }


  @JsonProperty(JSON_PROPERTY_PARENT_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParentIndex(Integer parentIndex) {
    this.parentIndex = parentIndex;
  }


  public LogicalLocation kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * The type of construct this logical location component refers to. Should be one of &#39;function&#39;, &#39;member&#39;, &#39;module&#39;, &#39;namespace&#39;, &#39;parameter&#39;, &#39;resource&#39;, &#39;returnType&#39;, &#39;type&#39;, &#39;variable&#39;, &#39;object&#39;, &#39;array&#39;, &#39;property&#39;, &#39;value&#39;, &#39;element&#39;, &#39;text&#39;, &#39;attribute&#39;, &#39;comment&#39;, &#39;declaration&#39;, &#39;dtd&#39; or &#39;processingInstruction&#39;, if any of those accurately describe the construct.
   * @return kind
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KIND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKind() {
    return kind;
  }


  @JsonProperty(JSON_PROPERTY_KIND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKind(String kind) {
    this.kind = kind;
  }


  public LogicalLocation properties(PropertyBag properties) {
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
   * Return true if this logicalLocation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogicalLocation logicalLocation = (LogicalLocation) o;
    return Objects.equals(this.name, logicalLocation.name) &&
        Objects.equals(this.index, logicalLocation.index) &&
        Objects.equals(this.fullyQualifiedName, logicalLocation.fullyQualifiedName) &&
        Objects.equals(this.decoratedName, logicalLocation.decoratedName) &&
        Objects.equals(this.parentIndex, logicalLocation.parentIndex) &&
        Objects.equals(this.kind, logicalLocation.kind) &&
        Objects.equals(this.properties, logicalLocation.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, index, fullyQualifiedName, decoratedName, parentIndex, kind, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogicalLocation {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    fullyQualifiedName: ").append(toIndentedString(fullyQualifiedName)).append("\n");
    sb.append("    decoratedName: ").append(toIndentedString(decoratedName)).append("\n");
    sb.append("    parentIndex: ").append(toIndentedString(parentIndex)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `index` to the URL query string
    if (getIndex() != null) {
      joiner.add(String.format("%sindex%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIndex()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `fullyQualifiedName` to the URL query string
    if (getFullyQualifiedName() != null) {
      joiner.add(String.format("%sfullyQualifiedName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFullyQualifiedName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `decoratedName` to the URL query string
    if (getDecoratedName() != null) {
      joiner.add(String.format("%sdecoratedName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDecoratedName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `parentIndex` to the URL query string
    if (getParentIndex() != null) {
      joiner.add(String.format("%sparentIndex%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getParentIndex()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `kind` to the URL query string
    if (getKind() != null) {
      joiner.add(String.format("%skind%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getKind()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `properties` to the URL query string
    if (getProperties() != null) {
      joiner.add(String.format("%sproperties%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProperties()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

