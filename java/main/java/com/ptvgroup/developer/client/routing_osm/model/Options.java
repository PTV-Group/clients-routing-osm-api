/*
 * Routing OSM
 * With the Routing OSM service you can calculate routes from a list of waypoints based on open street map data.
 *
 * The version of the OpenAPI document: 1.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ptvgroup.developer.client.routing_osm.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.ptvgroup.developer.client.routing_osm.model.PolylineFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Options
 */
@JsonPropertyOrder({
  Options.JSON_PROPERTY_POLYLINE_FORMAT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-10T13:42:27.306214Z[Etc/UTC]")
public class Options {
  public static final String JSON_PROPERTY_POLYLINE_FORMAT = "polylineFormat";
  private PolylineFormat polylineFormat = PolylineFormat.GEO_JSON;

  public Options() { 
  }

  public Options polylineFormat(PolylineFormat polylineFormat) {
    this.polylineFormat = polylineFormat;
    return this;
  }

   /**
   * Get polylineFormat
   * @return polylineFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_POLYLINE_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PolylineFormat getPolylineFormat() {
    return polylineFormat;
  }


  @JsonProperty(JSON_PROPERTY_POLYLINE_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPolylineFormat(PolylineFormat polylineFormat) {
    this.polylineFormat = polylineFormat;
  }


  /**
   * Return true if this Options object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Options options = (Options) o;
    return Objects.equals(this.polylineFormat, options.polylineFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(polylineFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Options {\n");
    sb.append("    polylineFormat: ").append(toIndentedString(polylineFormat)).append("\n");
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

}

