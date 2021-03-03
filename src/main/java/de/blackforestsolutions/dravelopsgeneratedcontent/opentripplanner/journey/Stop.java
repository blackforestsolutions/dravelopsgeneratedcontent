
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
    "name",
    "stopId",
    "stopCode",
    "platformCode",
    "lon",
    "lat",
    "arrival",
    "departure",
    "orig",
    "zoneId",
    "stopIndex",
    "stopSequence",
    "vertexType",
    "bikeShareId",
})
public class Stop implements Serializable
{

    @JsonProperty("name")
    private String name;
    @JsonProperty("stopId")
    private String stopId;
    @JsonProperty("stopCode")
    private String stopCode;
    @JsonProperty("platformCode")
    private String platformCode;
    @JsonProperty("lon")
    private Double lon;
    @JsonProperty("lat")
    private Double lat;
    @JsonProperty("arrival")
    private Long arrival;
    @JsonProperty("departure")
    private Long departure;
    @JsonProperty("orig")
    private String orig;
    @JsonProperty("zoneId")
    private String zoneId;
    @JsonProperty("stopIndex")
    private Long stopIndex;
    @JsonProperty("stopSequence")
    private Long stopSequence;
    @JsonProperty("vertexType")
    private String vertexType;
    @JsonProperty("bikeShareId")
    private String bikeShareId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -3002475775460683642L;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("stopId")
    public String getStopId() {
        return stopId;
    }

    @JsonProperty("stopId")
    public void setStopId(String stopId) {
        this.stopId = stopId;
    }

    @JsonProperty("stopCode")
    public String getStopCode() {
        return stopCode;
    }

    @JsonProperty("stopCode")
    public void setStopCode(String stopCode) {
        this.stopCode = stopCode;
    }

    @JsonProperty("platformCode")
    public String getPlatformCode() {
        return platformCode;
    }

    @JsonProperty("platformCode")
    public void setPlatformCode(String platformCode) {
        this.platformCode = platformCode;
    }

    @JsonProperty("lon")
    public Double getLon() {
        return lon;
    }

    @JsonProperty("lon")
    public void setLon(Double lon) {
        this.lon = lon;
    }

    @JsonProperty("lat")
    public Double getLat() {
        return lat;
    }

    @JsonProperty("lat")
    public void setLat(Double lat) {
        this.lat = lat;
    }

    @JsonProperty("arrival")
    public Long getArrival() {
        return arrival;
    }

    @JsonProperty("arrival")
    public void setArrival(Long arrival) {
        this.arrival = arrival;
    }

    @JsonProperty("departure")
    public Long getDeparture() {
        return departure;
    }

    @JsonProperty("departure")
    public void setDeparture(Long departure) {
        this.departure = departure;
    }

    @JsonProperty("orig")
    public String getOrig() {
        return orig;
    }

    @JsonProperty("orig")
    public void setOrig(String orig) {
        this.orig = orig;
    }

    @JsonProperty("zoneId")
    public String getZoneId() {
        return zoneId;
    }

    @JsonProperty("zoneId")
    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    @JsonProperty("stopIndex")
    public Long getStopIndex() {
        return stopIndex;
    }

    @JsonProperty("stopIndex")
    public void setStopIndex(Long stopIndex) {
        this.stopIndex = stopIndex;
    }

    @JsonProperty("stopSequence")
    public Long getStopSequence() {
        return stopSequence;
    }

    @JsonProperty("stopSequence")
    public void setStopSequence(Long stopSequence) {
        this.stopSequence = stopSequence;
    }

    @JsonProperty("vertexType")
    public String getVertexType() {
        return vertexType;
    }

    @JsonProperty("vertexType")
    public void setVertexType(String vertexType) {
        this.vertexType = vertexType;
    }

    @JsonProperty("bikeShareId")
    public String getBikeShareId() {
        return bikeShareId;
    }

    @JsonProperty("bikeShareId")
    public void setBikeShareId(String bikeShareId) {
        this.bikeShareId = bikeShareId;
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
