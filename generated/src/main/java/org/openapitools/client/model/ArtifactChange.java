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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.ArtifactLocation;
import org.openapitools.client.model.PropertyBag;
import org.openapitools.client.model.Replacement;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A change to a single artifact.
 */
@JsonPropertyOrder({
  ArtifactChange.JSON_PROPERTY_ARTIFACT_LOCATION,
  ArtifactChange.JSON_PROPERTY_REPLACEMENTS,
  ArtifactChange.JSON_PROPERTY_PROPERTIES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T21:07:55.255008Z[GMT]", comments = "Generator version: 7.6.0")
public class ArtifactChange {
  public static final String JSON_PROPERTY_ARTIFACT_LOCATION = "artifactLocation";
  private ArtifactLocation artifactLocation;

  public static final String JSON_PROPERTY_REPLACEMENTS = "replacements";
  private List<Replacement> replacements = new ArrayList<>();

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private PropertyBag properties;

  public ArtifactChange() { 
  }

  public ArtifactChange artifactLocation(ArtifactLocation artifactLocation) {
    this.artifactLocation = artifactLocation;
    return this;
  }

   /**
   * Get artifactLocation
   * @return artifactLocation
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ARTIFACT_LOCATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ArtifactLocation getArtifactLocation() {
    return artifactLocation;
  }


  @JsonProperty(JSON_PROPERTY_ARTIFACT_LOCATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setArtifactLocation(ArtifactLocation artifactLocation) {
    this.artifactLocation = artifactLocation;
  }


  public ArtifactChange replacements(List<Replacement> replacements) {
    this.replacements = replacements;
    return this;
  }

  public ArtifactChange addReplacementsItem(Replacement replacementsItem) {
    if (this.replacements == null) {
      this.replacements = new ArrayList<>();
    }
    this.replacements.add(replacementsItem);
    return this;
  }

   /**
   * An array of replacement objects, each of which represents the replacement of a single region in a single artifact specified by &#39;artifactLocation&#39;.
   * @return replacements
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REPLACEMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Replacement> getReplacements() {
    return replacements;
  }


  @JsonProperty(JSON_PROPERTY_REPLACEMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReplacements(List<Replacement> replacements) {
    this.replacements = replacements;
  }


  public ArtifactChange properties(PropertyBag properties) {
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
   * Return true if this artifactChange object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArtifactChange artifactChange = (ArtifactChange) o;
    return Objects.equals(this.artifactLocation, artifactChange.artifactLocation) &&
        Objects.equals(this.replacements, artifactChange.replacements) &&
        Objects.equals(this.properties, artifactChange.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifactLocation, replacements, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArtifactChange {\n");
    sb.append("    artifactLocation: ").append(toIndentedString(artifactLocation)).append("\n");
    sb.append("    replacements: ").append(toIndentedString(replacements)).append("\n");
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

    // add `artifactLocation` to the URL query string
    if (getArtifactLocation() != null) {
      joiner.add(getArtifactLocation().toUrlQueryString(prefix + "artifactLocation" + suffix));
    }

    // add `replacements` to the URL query string
    if (getReplacements() != null) {
      for (int i = 0; i < getReplacements().size(); i++) {
        if (getReplacements().get(i) != null) {
          joiner.add(getReplacements().get(i).toUrlQueryString(String.format("%sreplacements%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `properties` to the URL query string
    if (getProperties() != null) {
      joiner.add(String.format("%sproperties%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProperties()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

