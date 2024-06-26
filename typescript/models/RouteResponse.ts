/* tslint:disable */
/* eslint-disable */
/**
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

import { exists, mapValues } from '../runtime';
import type { Leg } from './Leg';
import {
    LegFromJSON,
    LegFromJSONTyped,
    LegToJSON,
} from './Leg';

/**
 * 
 * @export
 * @interface RouteResponse
 */
export interface RouteResponse {
    /**
     * The distance of the route [m].
     * @type {number}
     * @memberof RouteResponse
     */
    distance: number;
    /**
     * The travel time for the route [s].
     * @type {number}
     * @memberof RouteResponse
     */
    travelTime: number;
    /**
     * The legs of the route.
     * @type {Array<Leg>}
     * @memberof RouteResponse
     */
    legs?: Array<Leg>;
    /**
     * The polyline of the route in the format specified by **options[polylineFormat]**.
     * @type {string}
     * @memberof RouteResponse
     */
    polyline?: string;
}

/**
 * Check if a given object implements the RouteResponse interface.
 */
export function instanceOfRouteResponse(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "distance" in value;
    isInstance = isInstance && "travelTime" in value;

    return isInstance;
}

export function RouteResponseFromJSON(json: any): RouteResponse {
    return RouteResponseFromJSONTyped(json, false);
}

export function RouteResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): RouteResponse {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'distance': json['distance'],
        'travelTime': json['travelTime'],
        'legs': !exists(json, 'legs') ? undefined : ((json['legs'] as Array<any>).map(LegFromJSON)),
        'polyline': !exists(json, 'polyline') ? undefined : json['polyline'],
    };
}

export function RouteResponseToJSON(value?: RouteResponse | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'distance': value.distance,
        'travelTime': value.travelTime,
        'legs': value.legs === undefined ? undefined : ((value.legs as Array<any>).map(LegToJSON)),
        'polyline': value.polyline,
    };
}

