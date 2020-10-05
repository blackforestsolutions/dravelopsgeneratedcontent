
package de.blackforestsolutions.dravelopsgeneratedcontent.opentripplanner.journey;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ellipsoidToGeoidDifference",
    "geoidElevation"
})
public class ElevationMetadata implements Serializable
{

    @JsonProperty("ellipsoidToGeoidDifference")
    private Double ellipsoidToGeoidDifference;
    @JsonProperty("geoidElevation")
    private Boolean geoidElevation;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 4412209792749387464L;

    @JsonProperty("ellipsoidToGeoidDifference")
    public Double getEllipsoidToGeoidDifference() {
        return ellipsoidToGeoidDifference;
    }

    @JsonProperty("ellipsoidToGeoidDifference")
    public void setEllipsoidToGeoidDifference(Double ellipsoidToGeoidDifference) {
        this.ellipsoidToGeoidDifference = ellipsoidToGeoidDifference;
    }

    @JsonProperty("geoidElevation")
    public Boolean getGeoidElevation() {
        return geoidElevation;
    }

    @JsonProperty("geoidElevation")
    public void setGeoidElevation(Boolean geoidElevation) {
        this.geoidElevation = geoidElevation;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
