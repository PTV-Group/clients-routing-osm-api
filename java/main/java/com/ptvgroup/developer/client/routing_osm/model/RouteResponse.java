/*
 * Routing OSM
 * With the Routing OSM service you can calculate routes from a list of waypoints for bicycles based on open street map data.
 *
 * The version of the OpenAPI document: 1.0
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
import com.ptvgroup.developer.client.routing_osm.model.Leg;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RouteResponse
 */
@JsonPropertyOrder({
  RouteResponse.JSON_PROPERTY_DISTANCE,
  RouteResponse.JSON_PROPERTY_TRAVEL_TIME,
  RouteResponse.JSON_PROPERTY_LEGS,
  RouteResponse.JSON_PROPERTY_POLYLINE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-27T11:17:06.009161Z[Etc/UTC]")
public class RouteResponse {
  public static final String JSON_PROPERTY_DISTANCE = "distance";
  private Integer distance;

  public static final String JSON_PROPERTY_TRAVEL_TIME = "travelTime";
  private Integer travelTime;

  public static final String JSON_PROPERTY_LEGS = "legs";
  private List<Leg> legs = null;

  public static final String JSON_PROPERTY_POLYLINE = "polyline";
  private String polyline;

  public RouteResponse() { 
  }

  public RouteResponse distance(Integer distance) {
    this.distance = distance;
    return this;
  }

   /**
   * The distance of the route [m].
   * minimum: 0
   * @return distance
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1422", required = true, value = "The distance of the route [m].")
  @JsonProperty(JSON_PROPERTY_DISTANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getDistance() {
    return distance;
  }


  @JsonProperty(JSON_PROPERTY_DISTANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDistance(Integer distance) {
    this.distance = distance;
  }


  public RouteResponse travelTime(Integer travelTime) {
    this.travelTime = travelTime;
    return this;
  }

   /**
   * The travel time for the route [s].
   * minimum: 0
   * @return travelTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "56", required = true, value = "The travel time for the route [s].")
  @JsonProperty(JSON_PROPERTY_TRAVEL_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getTravelTime() {
    return travelTime;
  }


  @JsonProperty(JSON_PROPERTY_TRAVEL_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTravelTime(Integer travelTime) {
    this.travelTime = travelTime;
  }


  public RouteResponse legs(List<Leg> legs) {
    this.legs = legs;
    return this;
  }

  public RouteResponse addLegsItem(Leg legsItem) {
    if (this.legs == null) {
      this.legs = new ArrayList<>();
    }
    this.legs.add(legsItem);
    return this;
  }

   /**
   * The legs of the route.
   * @return legs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The legs of the route.")
  @JsonProperty(JSON_PROPERTY_LEGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Leg> getLegs() {
    return legs;
  }


  @JsonProperty(JSON_PROPERTY_LEGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLegs(List<Leg> legs) {
    this.legs = legs;
  }


  public RouteResponse polyline(String polyline) {
    this.polyline = polyline;
    return this;
  }

   /**
   * The polyline of the route in the format specified by **options[polylineFormat]**.
   * @return polyline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The polyline of the route in the format specified by **options[polylineFormat]**.")
  @JsonProperty(JSON_PROPERTY_POLYLINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPolyline() {
    return polyline;
  }


  @JsonProperty(JSON_PROPERTY_POLYLINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPolyline(String polyline) {
    this.polyline = polyline;
  }


  /**
   * Return true if this RouteResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RouteResponse routeResponse = (RouteResponse) o;
    return Objects.equals(this.distance, routeResponse.distance) &&
        Objects.equals(this.travelTime, routeResponse.travelTime) &&
        Objects.equals(this.legs, routeResponse.legs) &&
        Objects.equals(this.polyline, routeResponse.polyline);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distance, travelTime, legs, polyline);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RouteResponse {\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    travelTime: ").append(toIndentedString(travelTime)).append("\n");
    sb.append("    legs: ").append(toIndentedString(legs)).append("\n");
    sb.append("    polyline: ").append(toIndentedString(polyline)).append("\n");
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
