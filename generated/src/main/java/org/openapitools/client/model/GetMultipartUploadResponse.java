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
import org.openapitools.client.model.MultipartUploadPart;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * GetMultipartUploadResponse
 */
@JsonPropertyOrder({
  GetMultipartUploadResponse.JSON_PROPERTY_UPLOAD_ID,
  GetMultipartUploadResponse.JSON_PROPERTY_PARTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T21:07:55.255008Z[GMT]", comments = "Generator version: 7.6.0")
public class GetMultipartUploadResponse {
  public static final String JSON_PROPERTY_UPLOAD_ID = "upload_id";
  private String uploadId;

  public static final String JSON_PROPERTY_PARTS = "parts";
  private List<MultipartUploadPart> parts = new ArrayList<>();

  public GetMultipartUploadResponse() { 
  }

  public GetMultipartUploadResponse uploadId(String uploadId) {
    this.uploadId = uploadId;
    return this;
  }

   /**
   * Get uploadId
   * @return uploadId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_UPLOAD_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUploadId() {
    return uploadId;
  }


  @JsonProperty(JSON_PROPERTY_UPLOAD_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUploadId(String uploadId) {
    this.uploadId = uploadId;
  }


  public GetMultipartUploadResponse parts(List<MultipartUploadPart> parts) {
    this.parts = parts;
    return this;
  }

  public GetMultipartUploadResponse addPartsItem(MultipartUploadPart partsItem) {
    if (this.parts == null) {
      this.parts = new ArrayList<>();
    }
    this.parts.add(partsItem);
    return this;
  }

   /**
   * Get parts
   * @return parts
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PARTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<MultipartUploadPart> getParts() {
    return parts;
  }


  @JsonProperty(JSON_PROPERTY_PARTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setParts(List<MultipartUploadPart> parts) {
    this.parts = parts;
  }


  /**
   * Return true if this GetMultipartUploadResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMultipartUploadResponse getMultipartUploadResponse = (GetMultipartUploadResponse) o;
    return Objects.equals(this.uploadId, getMultipartUploadResponse.uploadId) &&
        Objects.equals(this.parts, getMultipartUploadResponse.parts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uploadId, parts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMultipartUploadResponse {\n");
    sb.append("    uploadId: ").append(toIndentedString(uploadId)).append("\n");
    sb.append("    parts: ").append(toIndentedString(parts)).append("\n");
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

    // add `upload_id` to the URL query string
    if (getUploadId() != null) {
      joiner.add(String.format("%supload_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUploadId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `parts` to the URL query string
    if (getParts() != null) {
      for (int i = 0; i < getParts().size(); i++) {
        if (getParts().get(i) != null) {
          joiner.add(getParts().get(i).toUrlQueryString(String.format("%sparts%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

