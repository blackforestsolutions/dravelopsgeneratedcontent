
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
    "points",
    "length"
})
public class LegGeometry implements Serializable
{

    @JsonProperty("points")
    private String points;
    @JsonProperty("length")
    private Long length;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -2689833402670100570L;

    @JsonProperty("points")
    public String getPoints() {
        return points;
    }

    @JsonProperty("points")
    public void setPoints(String points) {
        this.points = points;
    }

    @JsonProperty("length")
    public Long getLength() {
        return length;
    }

    @JsonProperty("length")
    public void setLength(Long length) {
        this.length = length;
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
