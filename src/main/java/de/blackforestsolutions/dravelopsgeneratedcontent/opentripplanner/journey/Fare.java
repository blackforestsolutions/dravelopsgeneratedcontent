
package de.blackforestsolutions.dravelopsgeneratedcontent.opentripplanner.journey;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "fare",
        "details"
})
public class Fare implements Serializable {

    public static enum FareType implements Serializable {
        regular, student, senior, tram, special, youth
    }

    /**
     * A mapping from {@link FareType} to {@link Money}.
     */
    @JsonProperty("fare")
    private LinkedHashMap<FareType, Money> fare;
    @JsonProperty("details")
    private LinkedHashMap<FareType, FareComponent> details;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8675794110634376341L;

    @JsonProperty("fare")
    public LinkedHashMap<FareType, Money> getFare() {
        return fare;
    }

    @JsonProperty("fare")
    public void setFare(LinkedHashMap<FareType, Money> fare) {
        this.fare = fare;
    }

    @JsonProperty("details")
    public LinkedHashMap<FareType, FareComponent> getDetails() {
        return details;
    }

    @JsonProperty("details")
    public void setDetails(LinkedHashMap<FareType, FareComponent> details) {
        this.details = details;
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
