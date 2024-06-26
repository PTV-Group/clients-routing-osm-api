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
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines the format for polylines in the response.  * &#x60;GEO_JSON&#x60; - Polylines are returned in the [GeoJSON](https://en.wikipedia.org/wiki/GeoJSON) format.  * &#x60;GOOGLE_ENCODED_POLYLINE&#x60; - Polylines are returned in [Google&#39;s Encoded Polyline](https://developers.google.com/maps/documentation/utilities/polylinealgorithm) format.
 */
public enum PolylineFormat {
  
  GEO_JSON("GEO_JSON"),
  
  GOOGLE_ENCODED_POLYLINE("GOOGLE_ENCODED_POLYLINE");

  private String value;

  PolylineFormat(String value) {
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
  public static PolylineFormat fromValue(String value) {
    for (PolylineFormat b : PolylineFormat.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

