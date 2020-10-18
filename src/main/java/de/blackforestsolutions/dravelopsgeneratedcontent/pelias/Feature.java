
package de.blackforestsolutions.dravelopsgeneratedcontent.pelias;

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
    "type",
    "geometry",
    "properties",
    "bbox"
})
public class Feature implements Serializable
{

    @JsonProperty("type")
    private String type;
    @JsonProperty("geometry")
    private Geometry geometry;
    @JsonProperty("properties")
    private Properties properties;
    @JsonProperty("bbox")
    private List<Double> bbox = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6766293903872445228L;

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("geometry")
    public Geometry getGeometry() {
        return geometry;
    }

    @JsonProperty("geometry")
    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    @JsonProperty("properties")
    public Properties getProperties() {
        return properties;
    }

    @JsonProperty("properties")
    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @JsonProperty("bbox")
    public List<Double> getBbox() {
        return bbox;
    }

    @JsonProperty("bbox")
    public void setBbox(List<Double> bbox) {
        this.bbox = bbox;
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
