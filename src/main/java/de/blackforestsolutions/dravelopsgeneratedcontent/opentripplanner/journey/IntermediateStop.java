
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
    "lon",
    "lat",
    "arrival",
    "departure",
    "stopIndex",
    "stopSequence",
    "vertexType",
    "boardAlightType"
})
public class IntermediateStop implements Serializable
{

    @JsonProperty("name")
    private String name;
    @JsonProperty("stopId")
    private String stopId;
    @JsonProperty("lon")
    private Double lon;
    @JsonProperty("lat")
    private Double lat;
    @JsonProperty("arrival")
    private Long arrival;
    @JsonProperty("departure")
    private Long departure;
    @JsonProperty("stopIndex")
    private Long stopIndex;
    @JsonProperty("stopSequence")
    private Long stopSequence;
    @JsonProperty("vertexType")
    private String vertexType;
    @JsonProperty("boardAlightType")
    private String boardAlightType;
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

    @JsonProperty("boardAlightType")
    public String getBoardAlightType() {
        return boardAlightType;
    }

    @JsonProperty("boardAlightType")
    public void setBoardAlightType(String boardAlightType) {
        this.boardAlightType = boardAlightType;
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
