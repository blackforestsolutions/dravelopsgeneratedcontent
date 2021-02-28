
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
        "tripPatternFilterTime",
        "accessEgressTime",
        "raptorSearchTime",
        "itineraryCreationTime"
})
public class TransitRouterTimes implements Serializable
{

    @JsonProperty("tripPatternFilterTime")
    private Long tripPatternFilterTime;
    @JsonProperty("accessEgressTime")
    private Long accessEgressTime;
    @JsonProperty("raptorSearchTime")
    private Long raptorSearchTime;
    @JsonProperty("itineraryCreationTime")
    private Long itineraryCreationTime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -1106641815528493126L;

    @JsonProperty("tripPatternFilterTime")
    public Long getTripPatternFilterTime() {
        return tripPatternFilterTime;
    }

    @JsonProperty("tripPatternFilterTime")
    public void setTripPatternFilterTime(Long tripPatternFilterTime) {
        this.tripPatternFilterTime = tripPatternFilterTime;
    }

    @JsonProperty("accessEgressTime")
    public Long getAccessEgressTime() {
        return accessEgressTime;
    }

    @JsonProperty("accessEgressTime")
    public void setAccessEgressTime(Long accessEgressTime) {
        this.accessEgressTime = accessEgressTime;
    }

    @JsonProperty("raptorSearchTime")
    public Long getRaptorSearchTime() {
        return raptorSearchTime;
    }

    @JsonProperty("raptorSearchTime")
    public void setRaptorSearchTime(Long raptorSearchTime) {
        this.raptorSearchTime = raptorSearchTime;
    }

    @JsonProperty("itineraryCreationTime")
    public Long getItineraryCreationTime() {
        return itineraryCreationTime;
    }

    @JsonProperty("itineraryCreationTime")
    public void setItineraryCreationTime(Long itineraryCreationTime) {
        this.itineraryCreationTime = itineraryCreationTime;
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
