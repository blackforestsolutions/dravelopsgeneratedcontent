
package de.blackforestsolutions.dravelopsgeneratedcontent.pelias;

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
    "wheelchair",
    "opening_hours"
})
public class Osm implements Serializable
{

    @JsonProperty("wheelchair")
    private String wheelchair;
    @JsonProperty("opening_hours")
    private String openingHours;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -3091915073041944983L;

    @JsonProperty("wheelchair")
    public String getWheelchair() {
        return wheelchair;
    }

    @JsonProperty("wheelchair")
    public void setWheelchair(String wheelchair) {
        this.wheelchair = wheelchair;
    }

    @JsonProperty("opening_hours")
    public String getOpeningHours() {
        return openingHours;
    }

    @JsonProperty("opening_hours")
    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
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
