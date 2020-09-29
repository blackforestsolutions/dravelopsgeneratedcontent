
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

    @JsonProperty("fare")
    private Fare_ fare;
    @JsonProperty("details")
    private Details details;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8675794110634376341L;

    @JsonProperty("fare")
    public Fare_ getFare() {
        return fare;
    }

    @JsonProperty("fare")
    public void setFare(Fare_ fare) {
        this.fare = fare;
    }

    @JsonProperty("details")
    public Details getDetails() {
        return details;
    }

    @JsonProperty("details")
    public void setDetails(Details details) {
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
