package de.blackforestsolutions.dravelopsgeneratedcontent.graphql;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder( {
        "hasVenue",
        "hasAddress",
        "hasStreet",
        "hasLocality",
})
@Generated("jsonschema2pojo")
public class Layers implements Serializable {

    @JsonProperty("hasVenue")
    private Boolean hasVenue;
    @JsonProperty("hasAddress")
    private Boolean hasAddress;
    @JsonProperty("hasStreet")
    private Boolean hasStreet;
    @JsonProperty("hasLocality")
    private Boolean hasLocality;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    @JsonProperty("hasVenue")
    public void setHasVenue(Boolean hasVenue) {
        this.hasVenue = hasVenue;
    }

    @JsonProperty("hasAddress")
    public Boolean getHasAddress() {
        return hasAddress;
    }

    @JsonProperty("hasAddress")
    public void setHasAddress(Boolean hasAddress) {
        this.hasAddress = hasAddress;
    }

    @JsonProperty("hasStreet")
    public Boolean getHasStreet() {
        return hasStreet;
    }

    @JsonProperty("hasStreet")
    public void setHasStreet(Boolean hasStreet) {
        this.hasStreet = hasStreet;
    }

    @JsonProperty("hasLocality")
    public Boolean getHasLocality() {
        return hasLocality;
    }

    @JsonProperty("hasLocality")
    public void setHasLocality(Boolean hasLocality) {
        this.hasLocality = hasLocality;
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