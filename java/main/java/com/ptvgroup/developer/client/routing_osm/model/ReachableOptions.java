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
import com.ptvgroup.developer.client.routing_osm.model.DrivingDirection;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ReachableOptions
 */
@JsonPropertyOrder({
  ReachableOptions.JSON_PROPERTY_DRIVING_DIRECTION
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-10T13:42:27.306214Z[Etc/UTC]")
public class ReachableOptions {
  public static final String JSON_PROPERTY_DRIVING_DIRECTION = "drivingDirection";
  private DrivingDirection drivingDirection = DrivingDirection.OUTBOUND;

  public ReachableOptions() { 
  }

  public ReachableOptions drivingDirection(DrivingDirection drivingDirection) {
    this.drivingDirection = drivingDirection;
    return this;
  }

   /**
   * Get drivingDirection
   * @return drivingDirection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DRIVING_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DrivingDirection getDrivingDirection() {
    return drivingDirection;
  }


  @JsonProperty(JSON_PROPERTY_DRIVING_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDrivingDirection(DrivingDirection drivingDirection) {
    this.drivingDirection = drivingDirection;
  }


  /**
   * Return true if this ReachableOptions object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReachableOptions reachableOptions = (ReachableOptions) o;
    return Objects.equals(this.drivingDirection, reachableOptions.drivingDirection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(drivingDirection);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReachableOptions {\n");
    sb.append("    drivingDirection: ").append(toIndentedString(drivingDirection)).append("\n");
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

