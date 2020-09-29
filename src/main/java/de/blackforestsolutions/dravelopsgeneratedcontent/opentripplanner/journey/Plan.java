
package de.blackforestsolutions.dravelopsgeneratedcontent.opentripplanner.journey;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

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
    private From from;
    @JsonProperty("to")
    private To to;
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
    public From getFrom() {
        return from;
    }

    @JsonProperty("from")
    public void setFrom(From from) {
        this.from = from;
    }

    @JsonProperty("to")
    public To getTo() {
        return to;
    }

    @JsonProperty("to")
    public void setTo(To to) {
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
