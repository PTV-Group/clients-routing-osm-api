/*
 * Routing OSM
 *
 * With the Routing OSM service you can calculate routes from a list of waypoints based on open street map data.
 *
 * The version of the OpenAPI document: 1.4
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
    /// Defines Results
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum Results
    {
        /// <summary>
        /// Enum LEGS for value: LEGS
        /// </summary>
        [EnumMember(Value = "LEGS")]
        LEGS = 1,

        /// <summary>
        /// Enum LEGS_POLYLINE for value: LEGS_POLYLINE
        /// </summary>
        [EnumMember(Value = "LEGS_POLYLINE")]
        LEGS_POLYLINE = 2,

        /// <summary>
        /// Enum POLYLINE for value: POLYLINE
        /// </summary>
        [EnumMember(Value = "POLYLINE")]
        POLYLINE = 3

    }

}
