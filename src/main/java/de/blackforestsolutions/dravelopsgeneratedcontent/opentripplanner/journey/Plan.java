
package de.blackforestsolutions.dravelopsgeneratedcontent.opentripplanner.journey;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "date",
    "from",
    "to",
    "itineraries"
})
public class Plan implements Serializable
{

    @JsonProperty("date")
    private Long date;
    @JsonProperty("from")
    private Stop from;
    @JsonProperty("to")
    private Stop to;
    @JsonProperty("itineraries")
    private List<Itinerary> itineraries = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -6922692650589323251L;

    @JsonProperty("date")
    public Long getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(Long date) {
        this.date = date;
    }

    @JsonProperty("from")
    public Stop getFrom() {
        return from;
    }

    @JsonProperty("from")
    public void setFrom(Stop from) {
        this.from = from;
    }

    @JsonProperty("to")
    public Stop getTo() {
        return to;
    }

    @JsonProperty("to")
    public void setTo(Stop to) {
        this.to = to;
    }

    @JsonProperty("itineraries")
    public List<Itinerary> getItineraries() {
        return itineraries;
    }

    @JsonProperty("itineraries")
    public void setItineraries(List<Itinerary> itineraries) {
        this.itineraries = itineraries;
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
