/*
 * Routing OSM
 *
 * With the Routing OSM service you can calculate routes from a list of waypoints based on open street map data.
 *
 * The version of the OpenAPI document: 1.5
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
    /// ReachableAreasResponse
    /// </summary>
    [DataContract(Name = "ReachableAreasResponse")]
    public partial class ReachableAreasResponse : IEquatable<ReachableAreasResponse>, IValidatableObject
    {

        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        [DataMember(Name = "status", EmitDefaultValue = false)]
        public CalculationStatus? Status { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="ReachableAreasResponse" /> class.
        /// </summary>
        /// <param name="status">status.</param>
        /// <param name="reachableAreas">reachableAreas.</param>
        /// <param name="error">error.</param>
        public ReachableAreasResponse(CalculationStatus? status = default(CalculationStatus?), ReachableAreas reachableAreas = default(ReachableAreas), ErrorResponse error = default(ErrorResponse))
        {
            this.Status = status;
            this.ReachableAreas = reachableAreas;
            this.Error = error;
        }

        /// <summary>
        /// Gets or Sets ReachableAreas
        /// </summary>
        [DataMember(Name = "reachableAreas", EmitDefaultValue = false)]
        public ReachableAreas ReachableAreas { get; set; }

        /// <summary>
        /// Gets or Sets Error
        /// </summary>
        [DataMember(Name = "error", EmitDefaultValue = false)]
        public ErrorResponse Error { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ReachableAreasResponse {\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  ReachableAreas: ").Append(ReachableAreas).Append("\n");
            sb.Append("  Error: ").Append(Error).Append("\n");
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
            return this.Equals(input as ReachableAreasResponse);
        }

        /// <summary>
        /// Returns true if ReachableAreasResponse instances are equal
        /// </summary>
        /// <param name="input">Instance of ReachableAreasResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ReachableAreasResponse input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Status == input.Status ||
                    this.Status.Equals(input.Status)
                ) && 
                (
                    this.ReachableAreas == input.ReachableAreas ||
                    (this.ReachableAreas != null &&
                    this.ReachableAreas.Equals(input.ReachableAreas))
                ) && 
                (
                    this.Error == input.Error ||
                    (this.Error != null &&
                    this.Error.Equals(input.Error))
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
                hashCode = (hashCode * 59) + this.Status.GetHashCode();
                if (this.ReachableAreas != null)
                {
                    hashCode = (hashCode * 59) + this.ReachableAreas.GetHashCode();
                }
                if (this.Error != null)
                {
                    hashCode = (hashCode * 59) + this.Error.GetHashCode();
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
            yield break;
        }
    }

}
