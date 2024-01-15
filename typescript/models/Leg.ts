/* tslint:disable */
/* eslint-disable */
/**
 * Routing OSM
 * With the Routing OSM service you can calculate routes from a list of waypoints based on open street map data.
 *
 * The version of the OpenAPI document: 1.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface Leg
 */
export interface Leg {
    /**
     * The distance of the leg [m].
     * @type {number}
     * @memberof Leg
     */
    distance: number;
    /**
     * The travel time for the leg [s].
     * @type {number}
     * @memberof Leg
     */
    travelTime: number;
    /**
     * The polyline of the leg in the format specified by **options[polylineFormat]**.
     * @type {string}
     * @memberof Leg
     */
    polyline?: string;
}

/**
 * Check if a given object implements the Leg interface.
 */
export function instanceOfLeg(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "distance" in value;
    isInstance = isInstance && "travelTime" in value;

    return isInstance;
}

export function LegFromJSON(json: any): Leg {
    return LegFromJSONTyped(json, false);
}

export function LegFromJSONTyped(json: any, ignoreDiscriminator: boolean): Leg {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'distance': json['distance'],
        'travelTime': json['travelTime'],
        'polyline': !exists(json, 'polyline') ? undefined : json['polyline'],
    };
}

export function LegToJSON(value?: Leg | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'distance': value.distance,
        'travelTime': value.travelTime,
        'polyline': value.polyline,
    };
}

