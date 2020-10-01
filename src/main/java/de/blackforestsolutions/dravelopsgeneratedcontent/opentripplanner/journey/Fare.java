
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
    "fare",
    "details"
})
public class Fare implements Serializable
{

    public static enum FareType implements Serializable {
        regular, student, senior, tram, special, youth
    }

    /**
     * A mapping from {@link FareType} to {@link Money}.
     */
    @JsonProperty("fare")
    public Map<FareType, Money> fare;
    @JsonProperty("details")
    private Map<FareType, FareComponent>  details;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8675794110634376341L;

    @JsonProperty("fare")
    public Map<FareType, Money> getFare() {
        return fare;
    }

    @JsonProperty("fare")
    public void setFare(Map<FareType, Money> fare) {
        this.fare = fare;
    }

    @JsonProperty("details")
    public Map<FareType, FareComponent> getDetails() {
        return details;
    }

    @JsonProperty("details")
    public void setDetails(Map<FareType, FareComponent> details) {
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
