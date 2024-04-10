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

package com.ptvgroup.developer.client.routing_osm.api;

import com.ptvgroup.developer.client.routing_osm.ApiClient;
import com.ptvgroup.developer.client.routing_osm.ApiException;
import com.ptvgroup.developer.client.routing_osm.ApiResponse;
import com.ptvgroup.developer.client.routing_osm.Pair;

import com.ptvgroup.developer.client.routing_osm.model.ErrorResponse;
import com.ptvgroup.developer.client.routing_osm.model.Options;
import com.ptvgroup.developer.client.routing_osm.model.Results;
import com.ptvgroup.developer.client.routing_osm.model.RouteResponse;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-10T13:42:27.306214Z[Etc/UTC]")
public class RoutingApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public RoutingApi() {
    this(new ApiClient());
  }

  public RoutingApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
    memberVarAsyncResponseInterceptor = apiClient.getAsyncResponseInterceptor();
  }

  protected ApiException getApiException(String operationId, HttpResponse<InputStream> response) throws IOException {
    String body = response.body() == null ? null : new String(response.body().readAllBytes());
    String message = formatExceptionMessage(operationId, response.statusCode(), body);
    return new ApiException(response.statusCode(), message, response.headers(), body);
  }

  private String formatExceptionMessage(String operationId, int statusCode, String body) {
    if (body == null || body.isEmpty()) {
      body = "[no body]";
    }
    return operationId + " call failed with: " + statusCode + " - " + body;
  }

  /**
   * 
   * Calculates a route by specifying a list of waypoints.
   * @param waypoints The list of waypoints the route will be calculated for. At least two waypoints are necessary. The first waypoint is the start and the last is the destination of the route. Additional intermediate waypoints are possible.   The format of each waypoint is &#x60;&lt;lat&gt;,&lt;lon&gt;[;&lt;attribute&gt;;&lt;attribute&gt;;...]&#x60; representing a point with the latitude value in degrees from south to north and the longitude value in degrees (WGS84/EPSG:4326) from west to east. This point will be matched to the nearest possible road.   By default the air-line connection between given and matched coordinates is not included in the route polyline, distance and duration. We will refer to this type of waypoint as an _on-road waypoint_.  The behavior of a waypoint can be changed by appending the following attributes:    * &#x60;includeLastMeters&#x60; to include the air-line connection between given and matched coordinates in the route polyline, distance and duration.  We will refer to this type of waypoint as an _off-road waypoint_.  * &#x60;roadAccess&#x3D;&lt;lat&gt;,&lt;lon&gt;&#x60;, to use these coordinates for matching to the nearest road. Implies **includeLastMeter**, i.e.  the air-line connection between the waypoint coordinates and the matched coordinates  is included in the route polyline, distance and duration. This is useful if the waypoint should not be matched to the nearest possible road but to some road further away,  e.g. garage exit at a different road. (optional
   * @param profile A profile defines a vehicle by a set of attributes, matching typical transport situations. It must be the name of one of the [predefined profiles](../data-api/concepts/osm-profiles) such as _EUR_OSM_CAR_. (optional, default to EUR_OSM_CAR)
   * @param options Routing-relevant options like the polyline format. Use array notation like &#x60;options[polylineFormat]&#x3D;GEO_JSON&#x60; to set options. (optional)
   * @param results Comma-separated list that defines which results will be returned.  * &#x60;LEGS&#x60;     Response includes information about the route **legs** defined as the parts of the route between two consecutive waypoints.  * &#x60;LEGS_POLYLINE&#x60;     Response includes the **polyline** of each of the **legs** in the format specified by **options[polylineFormat]**. _LEGS_ will automatically be included.  * &#x60;POLYLINE&#x60;     Response includes the complete **polyline** of the entire route in the format specified by **options[polylineFormat]**. (optional
   * @return RouteResponse
   * @throws ApiException if fails to make API call
   */
  public RouteResponse calculateRoute(List<String> waypoints, String profile, Options options, List<Results> results) throws ApiException {
    ApiResponse<RouteResponse> localVarResponse = calculateRouteWithHttpInfo(waypoints, profile, options, results);
    return localVarResponse.getData();
  }

  /**
   * 
   * Calculates a route by specifying a list of waypoints.
   * @param waypoints The list of waypoints the route will be calculated for. At least two waypoints are necessary. The first waypoint is the start and the last is the destination of the route. Additional intermediate waypoints are possible.   The format of each waypoint is &#x60;&lt;lat&gt;,&lt;lon&gt;[;&lt;attribute&gt;;&lt;attribute&gt;;...]&#x60; representing a point with the latitude value in degrees from south to north and the longitude value in degrees (WGS84/EPSG:4326) from west to east. This point will be matched to the nearest possible road.   By default the air-line connection between given and matched coordinates is not included in the route polyline, distance and duration. We will refer to this type of waypoint as an _on-road waypoint_.  The behavior of a waypoint can be changed by appending the following attributes:    * &#x60;includeLastMeters&#x60; to include the air-line connection between given and matched coordinates in the route polyline, distance and duration.  We will refer to this type of waypoint as an _off-road waypoint_.  * &#x60;roadAccess&#x3D;&lt;lat&gt;,&lt;lon&gt;&#x60;, to use these coordinates for matching to the nearest road. Implies **includeLastMeter**, i.e.  the air-line connection between the waypoint coordinates and the matched coordinates  is included in the route polyline, distance and duration. This is useful if the waypoint should not be matched to the nearest possible road but to some road further away,  e.g. garage exit at a different road. (optional
   * @param profile A profile defines a vehicle by a set of attributes, matching typical transport situations. It must be the name of one of the [predefined profiles](../data-api/concepts/osm-profiles) such as _EUR_OSM_CAR_. (optional, default to EUR_OSM_CAR)
   * @param options Routing-relevant options like the polyline format. Use array notation like &#x60;options[polylineFormat]&#x3D;GEO_JSON&#x60; to set options. (optional)
   * @param results Comma-separated list that defines which results will be returned.  * &#x60;LEGS&#x60;     Response includes information about the route **legs** defined as the parts of the route between two consecutive waypoints.  * &#x60;LEGS_POLYLINE&#x60;     Response includes the **polyline** of each of the **legs** in the format specified by **options[polylineFormat]**. _LEGS_ will automatically be included.  * &#x60;POLYLINE&#x60;     Response includes the complete **polyline** of the entire route in the format specified by **options[polylineFormat]**. (optional
   * @return ApiResponse&lt;RouteResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RouteResponse> calculateRouteWithHttpInfo(List<String> waypoints, String profile, Options options, List<Results> results) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = calculateRouteRequestBuilder(waypoints, profile, options, results);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("calculateRoute", localVarResponse);
        }
        return new ApiResponse<RouteResponse>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<RouteResponse>() {}) // closes the InputStream
          
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder calculateRouteRequestBuilder(List<String> waypoints, String profile, Options options, List<Results> results) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();
		localVarRequestBuilder.header("User-Agent","ptv-generated java client");

    String localVarPath = "/routes";

    List<Pair> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(ApiClient.parameterToPairs("multi", "waypoints", waypoints));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("profile", profile));
    if (options != null) {
      localVarQueryParams.addAll(ApiClient.parameterToPairs("options[polylineFormat]", options.getPolylineFormat()));
    }
    localVarQueryParams.addAll(ApiClient.parameterToPairs("csv", "results", results));

    if (!localVarQueryParams.isEmpty()) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
}
