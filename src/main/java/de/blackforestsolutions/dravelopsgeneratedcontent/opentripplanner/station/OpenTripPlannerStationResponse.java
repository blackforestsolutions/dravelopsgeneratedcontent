
package de.blackforestsolutions.dravelopsgeneratedcontent.opentripplanner.station;

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
        "id",
        "name",
        "code",
        "lat",
        "lon",
        "url",
        "stationId",
        "dist"
})
public class OpenTripPlannerStationResponse implements Serializable {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("code")
    private String code;
    @JsonProperty("lat")
    private Double lat;
    @JsonProperty("lon")
    private Double lon;
    @JsonProperty("url")
    private String url;
    @JsonProperty("stationId")
    private String stationId;
    @JsonProperty("dist")
    private Long dist;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -3693485694989338249L;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("lat")
    public Double getLat() {
        return lat;
    }

    @JsonProperty("lat")
    public void setLat(Double lat) {
        this.lat = lat;
    }

    @JsonProperty("lon")
    public Double getLon() {
        return lon;
    }

    @JsonProperty("lon")
    public void setLon(Double lon) {
        this.lon = lon;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("stationId")
    public String getStationId() {
        return stationId;
    }

    @JsonProperty("stationId")
    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    @JsonProperty("dist")
    public Long getDist() {
        return dist;
    }

    @JsonProperty("dist")
    public void setDist(Long dist) {
        this.dist = dist;
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
