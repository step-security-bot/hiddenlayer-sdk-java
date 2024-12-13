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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.client.model.Edge;
import org.openapitools.client.model.Message;
import org.openapitools.client.model.Node;
import org.openapitools.client.model.PropertyBag;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A network of nodes and directed edges that describes some aspect of the structure of the code (for example, a call graph).
 */
@JsonPropertyOrder({
  Graph.JSON_PROPERTY_DESCRIPTION,
  Graph.JSON_PROPERTY_NODES,
  Graph.JSON_PROPERTY_EDGES,
  Graph.JSON_PROPERTY_PROPERTIES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T21:07:55.255008Z[GMT]", comments = "Generator version: 7.6.0")
public class Graph {
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<Message> description = JsonNullable.<Message>undefined();

  public static final String JSON_PROPERTY_NODES = "nodes";
  private Set<Node> nodes = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_EDGES = "edges";
  private Set<Edge> edges = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private PropertyBag properties;

  public Graph() { 
  }

  public Graph description(Message description) {
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


  public Graph nodes(Set<Node> nodes) {
    this.nodes = nodes;
    return this;
  }

  public Graph addNodesItem(Node nodesItem) {
    if (this.nodes == null) {
      this.nodes = new LinkedHashSet<>();
    }
    this.nodes.add(nodesItem);
    return this;
  }

   /**
   * An array of node objects representing the nodes of the graph.
   * @return nodes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<Node> getNodes() {
    return nodes;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_NODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNodes(Set<Node> nodes) {
    this.nodes = nodes;
  }


  public Graph edges(Set<Edge> edges) {
    this.edges = edges;
    return this;
  }

  public Graph addEdgesItem(Edge edgesItem) {
    if (this.edges == null) {
      this.edges = new LinkedHashSet<>();
    }
    this.edges.add(edgesItem);
    return this;
  }

   /**
   * An array of edge objects representing the edges of the graph.
   * @return edges
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EDGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<Edge> getEdges() {
    return edges;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_EDGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEdges(Set<Edge> edges) {
    this.edges = edges;
  }


  public Graph properties(PropertyBag properties) {
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
   * Return true if this graph object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Graph graph = (Graph) o;
    return equalsNullable(this.description, graph.description) &&
        Objects.equals(this.nodes, graph.nodes) &&
        Objects.equals(this.edges, graph.edges) &&
        Objects.equals(this.properties, graph.properties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(description), nodes, edges, properties);
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
    sb.append("class Graph {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
    sb.append("    edges: ").append(toIndentedString(edges)).append("\n");
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

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(getDescription().toUrlQueryString(prefix + "description" + suffix));
    }

    // add `nodes` to the URL query string
    if (getNodes() != null) {
      int i = 0;
      for (Node _item : getNodes()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%snodes%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
    }

    // add `edges` to the URL query string
    if (getEdges() != null) {
      int i = 0;
      for (Edge _item : getEdges()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%sedges%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
    }

    // add `properties` to the URL query string
    if (getProperties() != null) {
      joiner.add(String.format("%sproperties%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProperties()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

