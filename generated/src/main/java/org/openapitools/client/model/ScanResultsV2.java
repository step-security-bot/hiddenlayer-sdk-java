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
import org.openapitools.client.model.Detections;
import org.openapitools.client.model.ScanResults;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ScanResultsV2
 */
@JsonPropertyOrder({
  ScanResultsV2.JSON_PROPERTY_SCAN_ID,
  ScanResultsV2.JSON_PROPERTY_STATUS,
  ScanResultsV2.JSON_PROPERTY_START_TIME,
  ScanResultsV2.JSON_PROPERTY_END_TIME,
  ScanResultsV2.JSON_PROPERTY_RESULTS,
  ScanResultsV2.JSON_PROPERTY_SEVERITY,
  ScanResultsV2.JSON_PROPERTY_DETECTIONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T21:07:55.255008Z[GMT]", comments = "Generator version: 7.6.0")
public class ScanResultsV2 {
  public static final String JSON_PROPERTY_SCAN_ID = "scan_id";
  private String scanId;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    DONE("done"),
    
    ACCEPTED("accepted"),
    
    FAILED("failed"),
    
    PENDING("pending"),
    
    CREATED("created"),
    
    RETRY("retry"),
    
    UNKNOWN("unknown");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public static final String JSON_PROPERTY_START_TIME = "start_time";
  private Long startTime;

  public static final String JSON_PROPERTY_END_TIME = "end_time";
  private Long endTime;

  public static final String JSON_PROPERTY_RESULTS = "results";
  private ScanResults results;

  /**
   * Gets or Sets severity
   */
  public enum SeverityEnum {
    UNKNOWN("UNKNOWN"),
    
    SAFE("SAFE"),
    
    SUSPICIOUS("SUSPICIOUS"),
    
    MALICIOUS("MALICIOUS");

    private String value;

    SeverityEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SeverityEnum fromValue(String value) {
      for (SeverityEnum b : SeverityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SEVERITY = "severity";
  private SeverityEnum severity;

  public static final String JSON_PROPERTY_DETECTIONS = "detections";
  private List<Detections> detections = new ArrayList<>();

  public ScanResultsV2() { 
  }

  public ScanResultsV2 scanId(String scanId) {
    this.scanId = scanId;
    return this;
  }

   /**
   * Get scanId
   * @return scanId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SCAN_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getScanId() {
    return scanId;
  }


  @JsonProperty(JSON_PROPERTY_SCAN_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setScanId(String scanId) {
    this.scanId = scanId;
  }


  public ScanResultsV2 status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public ScanResultsV2 startTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getStartTime() {
    return startTime;
  }


  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStartTime(Long startTime) {
    this.startTime = startTime;
  }


  public ScanResultsV2 endTime(Long endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getEndTime() {
    return endTime;
  }


  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEndTime(Long endTime) {
    this.endTime = endTime;
  }


  public ScanResultsV2 results(ScanResults results) {
    this.results = results;
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ScanResults getResults() {
    return results;
  }


  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResults(ScanResults results) {
    this.results = results;
  }


  public ScanResultsV2 severity(SeverityEnum severity) {
    this.severity = severity;
    return this;
  }

   /**
   * Get severity
   * @return severity
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEVERITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SeverityEnum getSeverity() {
    return severity;
  }


  @JsonProperty(JSON_PROPERTY_SEVERITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSeverity(SeverityEnum severity) {
    this.severity = severity;
  }


  public ScanResultsV2 detections(List<Detections> detections) {
    this.detections = detections;
    return this;
  }

  public ScanResultsV2 addDetectionsItem(Detections detectionsItem) {
    if (this.detections == null) {
      this.detections = new ArrayList<>();
    }
    this.detections.add(detectionsItem);
    return this;
  }

   /**
   * Get detections
   * @return detections
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DETECTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Detections> getDetections() {
    return detections;
  }


  @JsonProperty(JSON_PROPERTY_DETECTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDetections(List<Detections> detections) {
    this.detections = detections;
  }


  /**
   * Return true if this ScanResultsV2 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScanResultsV2 scanResultsV2 = (ScanResultsV2) o;
    return Objects.equals(this.scanId, scanResultsV2.scanId) &&
        Objects.equals(this.status, scanResultsV2.status) &&
        Objects.equals(this.startTime, scanResultsV2.startTime) &&
        Objects.equals(this.endTime, scanResultsV2.endTime) &&
        Objects.equals(this.results, scanResultsV2.results) &&
        Objects.equals(this.severity, scanResultsV2.severity) &&
        Objects.equals(this.detections, scanResultsV2.detections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scanId, status, startTime, endTime, results, severity, detections);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScanResultsV2 {\n");
    sb.append("    scanId: ").append(toIndentedString(scanId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    detections: ").append(toIndentedString(detections)).append("\n");
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

    // add `scan_id` to the URL query string
    if (getScanId() != null) {
      joiner.add(String.format("%sscan_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getScanId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatus()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `start_time` to the URL query string
    if (getStartTime() != null) {
      joiner.add(String.format("%sstart_time%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStartTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `end_time` to the URL query string
    if (getEndTime() != null) {
      joiner.add(String.format("%send_time%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEndTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `results` to the URL query string
    if (getResults() != null) {
      joiner.add(String.format("%sresults%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getResults()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `severity` to the URL query string
    if (getSeverity() != null) {
      joiner.add(String.format("%sseverity%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSeverity()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `detections` to the URL query string
    if (getDetections() != null) {
      for (int i = 0; i < getDetections().size(); i++) {
        if (getDetections().get(i) != null) {
          joiner.add(getDetections().get(i).toUrlQueryString(String.format("%sdetections%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}
