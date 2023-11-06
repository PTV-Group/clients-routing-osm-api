/*
 * Routing OSM
 *
 * With the Routing OSM service you can calculate routes from a list of waypoints for bicycles based on open street map data.
 *
 * The version of the OpenAPI document: 1.3
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = PTV.Developer.Clients.routing_osm.Client.OpenAPIDateConverter;

namespace PTV.Developer.Clients.routing_osm.Model
{
    /// <summary>
    /// Specifies the geographical horizon.  * &#x60;DISTANCE&#x60; - Represents a geographical horizon that is described by a distance. Every point or road segment that is reachable from the source within the specified distance is included in the horizon.  * &#x60;TRAVEL_TIME&#x60; - Represents a geographical horizon that is described by a travel time. Every point or road segment that is reachable from the source within the specified travel time is included in the horizon.
    /// </summary>
    /// <value>Specifies the geographical horizon.  * &#x60;DISTANCE&#x60; - Represents a geographical horizon that is described by a distance. Every point or road segment that is reachable from the source within the specified distance is included in the horizon.  * &#x60;TRAVEL_TIME&#x60; - Represents a geographical horizon that is described by a travel time. Every point or road segment that is reachable from the source within the specified travel time is included in the horizon.</value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum HorizonType
    {
        /// <summary>
        /// Enum DISTANCE for value: DISTANCE
        /// </summary>
        [EnumMember(Value = "DISTANCE")]
        DISTANCE = 1,

        /// <summary>
        /// Enum TRAVEL_TIME for value: TRAVEL_TIME
        /// </summary>
        [EnumMember(Value = "TRAVEL_TIME")]
        TRAVEL_TIME = 2

    }

}