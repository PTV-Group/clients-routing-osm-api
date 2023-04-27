/*
 * Routing OSM
 *
 * With the Routing OSM service you can calculate routes from a list of waypoints for bicycles based on open street map data.
 *
 * The version of the OpenAPI document: 1.0
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
    /// Leg
    /// </summary>
    [DataContract(Name = "Leg")]
    public partial class Leg : IEquatable<Leg>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Leg" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Leg() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Leg" /> class.
        /// </summary>
        /// <param name="distance">The distance of the leg [m]. (required).</param>
        /// <param name="travelTime">The travel time for the leg [s]. (required).</param>
        /// <param name="polyline">The polyline of the leg in the format specified by **options[polylineFormat]**..</param>
        public Leg(int distance = default(int), int travelTime = default(int), string polyline = default(string))
        {
            this.Distance = distance;
            this.TravelTime = travelTime;
            this.Polyline = polyline;
        }

        /// <summary>
        /// The distance of the leg [m].
        /// </summary>
        /// <value>The distance of the leg [m].</value>
        [DataMember(Name = "distance", IsRequired = true, EmitDefaultValue = true)]
        public int Distance { get; set; }

        /// <summary>
        /// The travel time for the leg [s].
        /// </summary>
        /// <value>The travel time for the leg [s].</value>
        [DataMember(Name = "travelTime", IsRequired = true, EmitDefaultValue = true)]
        public int TravelTime { get; set; }

        /// <summary>
        /// The polyline of the leg in the format specified by **options[polylineFormat]**.
        /// </summary>
        /// <value>The polyline of the leg in the format specified by **options[polylineFormat]**.</value>
        [DataMember(Name = "polyline", EmitDefaultValue = false)]
        public string Polyline { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Leg {\n");
            sb.Append("  Distance: ").Append(Distance).Append("\n");
            sb.Append("  TravelTime: ").Append(TravelTime).Append("\n");
            sb.Append("  Polyline: ").Append(Polyline).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as Leg);
        }

        /// <summary>
        /// Returns true if Leg instances are equal
        /// </summary>
        /// <param name="input">Instance of Leg to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Leg input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Distance == input.Distance ||
                    this.Distance.Equals(input.Distance)
                ) && 
                (
                    this.TravelTime == input.TravelTime ||
                    this.TravelTime.Equals(input.TravelTime)
                ) && 
                (
                    this.Polyline == input.Polyline ||
                    (this.Polyline != null &&
                    this.Polyline.Equals(input.Polyline))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                hashCode = (hashCode * 59) + this.Distance.GetHashCode();
                hashCode = (hashCode * 59) + this.TravelTime.GetHashCode();
                if (this.Polyline != null)
                {
                    hashCode = (hashCode * 59) + this.Polyline.GetHashCode();
                }
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            // Distance (int) minimum
            if (this.Distance < (int)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Distance, must be a value greater than or equal to 0.", new [] { "Distance" });
            }

            // TravelTime (int) minimum
            if (this.TravelTime < (int)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for TravelTime, must be a value greater than or equal to 0.", new [] { "TravelTime" });
            }

            yield break;
        }
    }

}