/* tslint:disable */
/* eslint-disable */
/**
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

import { exists, mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface CausingError
 */
export interface CausingError {
    /**
     * A human readable message that describes the error.
     * @type {string}
     * @memberof CausingError
     */
    description: string;
    /**
     * A constant string that can be used to identify this error class programmatically.
     * An errorCode can have **details** to provide information in additional properties which are described with the code they apply to. They are of type string unless otherwise specified.
     * Note that additional errorCodes as well as the **details** of existing errorCodes may be added at any time. Furthermore, the **description** may change at any time.
     * 
     * **Error codes for** `GENERAL_VALIDATION_ERROR`
     * 
     * * `GENERAL_INVALID_VALUE` - A parameter is set to an invalid value.
     *   * `value` - The invalid value.
     * * `GENERAL_UNRECOGNIZED_PARAMETER` - A parameter is unknown.
     * * `GENERAL_DUPLICATE_PARAMETER` - A parameter is duplicated.
     * * `GENERAL_INVALID_LIST` - A list has an invalid format such as duplicate commas.
     *   * `value` - The invalid list.
     * * `ROUTING_INVALID_WAYPOINT_ATTRIBUTE` - A waypoint attribute is set to an invalid value.
     *   * `attribute` - The invalid waypoint attribute.
     * * `ROUTING_UNRECOGNIZED_WAYPOINT_ATTRIBUTE` - A waypoint attribute is unknown.
     *   * `attribute` - The invalid waypoint key.
     * * `ROUTING_DUPLICATE_WAYPOINT_ATTRIBUTE` - A waypoint attribute is duplicated.
     *   * `attribute` - The duplicated waypoint key.
     * * `ROUTING_MUST_HAVE_WAYPOINTS` - The request must have at least two waypoints.
     * * `ROUTING_PROFILE_NOT_FOUND` - The requested profile could not be found.
     *   * `value` - The profile name.
     * * `ROUTING_ESTIMATED_DISTANCE_TOO_LONG` - The distance of the route (estimated by air-line) for non-motorized vehicles is too long. - _The **parameter** remains empty._
     *   * `distance` - The estimated distance (integer).
     *   * `limit` - The maximum allowable distance (integer).
     * 
     * **Error codes for** `ROUTING_ERROR`
     * 
     * * `ROUTING_WAYPOINT_CANNOT_BE_MATCHED` - The waypoint cannot be matched to the nearest possible road.
     * * `ROUTING_ROUTE_NOT_FOUND` - A route between at least two waypoints could not be found for the current configuration and profile. - _The **parameter** remains empty._
     * 
     * **Error codes for** `ROUTING_RESTRICTION_EXCEEDED`
     * 
     * * `ROUTING_TOO_MANY_WAYPOINTS` - The request contains too many waypoints.
     *   * `limit`- The maximum allowed number of waypoints for a single request (integer).
     * @type {string}
     * @memberof CausingError
     */
    errorCode: string;
    /**
     * The name of the affected query or path parameter or a JSONPath to the affected property of the request.
     * @type {string}
     * @memberof CausingError
     */
    parameter?: string;
    /**
     * Additional properties specific to this error class.
     * @type {{ [key: string]: any; }}
     * @memberof CausingError
     */
    details?: { [key: string]: any; };
}

/**
 * Check if a given object implements the CausingError interface.
 */
export function instanceOfCausingError(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "description" in value;
    isInstance = isInstance && "errorCode" in value;

    return isInstance;
}

export function CausingErrorFromJSON(json: any): CausingError {
    return CausingErrorFromJSONTyped(json, false);
}

export function CausingErrorFromJSONTyped(json: any, ignoreDiscriminator: boolean): CausingError {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'description': json['description'],
        'errorCode': json['errorCode'],
        'parameter': !exists(json, 'parameter') ? undefined : json['parameter'],
        'details': !exists(json, 'details') ? undefined : json['details'],
    };
}

export function CausingErrorToJSON(value?: CausingError | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'description': value.description,
        'errorCode': value.errorCode,
        'parameter': value.parameter,
        'details': value.details,
    };
}
