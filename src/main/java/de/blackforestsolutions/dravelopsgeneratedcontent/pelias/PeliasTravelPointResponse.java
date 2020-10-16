
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
    "geocoding",
    "type",
    "features",
    "bbox"
})
public class PeliasTravelPointResponse implements Serializable
{

    @JsonProperty("geocoding")
    private Geocoding geocoding;
    @JsonProperty("type")
    private String type;
    @JsonProperty("features")
    private List<Feature> features = null;
    @JsonProperty("bbox")
    private List<Double> bbox = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8904953584720683070L;

    @JsonProperty("geocoding")
    public Geocoding getGeocoding() {
        return geocoding;
    }

    @JsonProperty("geocoding")
    public void setGeocoding(Geocoding geocoding) {
        this.geocoding = geocoding;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("features")
    public List<Feature> getFeatures() {
        return features;
    }

    @JsonProperty("features")
    public void setFeatures(List<Feature> features) {
        this.features = features;
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
