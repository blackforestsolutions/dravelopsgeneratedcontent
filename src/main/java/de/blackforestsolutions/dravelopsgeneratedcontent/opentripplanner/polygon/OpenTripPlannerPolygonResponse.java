
package de.blackforestsolutions.dravelopsgeneratedcontent.opentripplanner.polygon;

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
    "routerId",
    "polygon",
    "buildTime",
    "transitServiceStarts",
    "transitServiceEnds",
    "transitModes",
    "centerLatitude",
    "centerLongitude",
    "hasParkRide",
    "travelOptions",
    "lowerLeftLongitude",
    "lowerLeftLatitude",
    "upperRightLatitude",
    "upperRightLongitude",
    "hasBikeSharing",
    "hasBikePark"
})
public class OpenTripPlannerPolygonResponse implements Serializable
{

    @JsonProperty("routerId")
    private String routerId;
    @JsonProperty("polygon")
    private Polygon polygon;
    @JsonProperty("buildTime")
    private Long buildTime;
    @JsonProperty("transitServiceStarts")
    private Long transitServiceStarts;
    @JsonProperty("transitServiceEnds")
    private Long transitServiceEnds;
    @JsonProperty("transitModes")
    private List<String> transitModes = null;
    @JsonProperty("centerLatitude")
    private Double centerLatitude;
    @JsonProperty("centerLongitude")
    private Double centerLongitude;
    @JsonProperty("hasParkRide")
    private Boolean hasParkRide;
    @JsonProperty("travelOptions")
    private List<TravelOption> travelOptions = null;
    @JsonProperty("lowerLeftLongitude")
    private Double lowerLeftLongitude;
    @JsonProperty("lowerLeftLatitude")
    private Double lowerLeftLatitude;
    @JsonProperty("upperRightLatitude")
    private Double upperRightLatitude;
    @JsonProperty("upperRightLongitude")
    private Double upperRightLongitude;
    @JsonProperty("hasBikeSharing")
    private Boolean hasBikeSharing;
    @JsonProperty("hasBikePark")
    private Boolean hasBikePark;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -7109169658885780921L;

    @JsonProperty("routerId")
    public String getRouterId() {
        return routerId;
    }

    @JsonProperty("routerId")
    public void setRouterId(String routerId) {
        this.routerId = routerId;
    }

    @JsonProperty("polygon")
    public Polygon getPolygon() {
        return polygon;
    }

    @JsonProperty("polygon")
    public void setPolygon(Polygon polygon) {
        this.polygon = polygon;
    }

    @JsonProperty("buildTime")
    public Long getBuildTime() {
        return buildTime;
    }

    @JsonProperty("buildTime")
    public void setBuildTime(Long buildTime) {
        this.buildTime = buildTime;
    }

    @JsonProperty("transitServiceStarts")
    public Long getTransitServiceStarts() {
        return transitServiceStarts;
    }

    @JsonProperty("transitServiceStarts")
    public void setTransitServiceStarts(Long transitServiceStarts) {
        this.transitServiceStarts = transitServiceStarts;
    }

    @JsonProperty("transitServiceEnds")
    public Long getTransitServiceEnds() {
        return transitServiceEnds;
    }

    @JsonProperty("transitServiceEnds")
    public void setTransitServiceEnds(Long transitServiceEnds) {
        this.transitServiceEnds = transitServiceEnds;
    }

    @JsonProperty("transitModes")
    public List<String> getTransitModes() {
        return transitModes;
    }

    @JsonProperty("transitModes")
    public void setTransitModes(List<String> transitModes) {
        this.transitModes = transitModes;
    }

    @JsonProperty("centerLatitude")
    public Double getCenterLatitude() {
        return centerLatitude;
    }

    @JsonProperty("centerLatitude")
    public void setCenterLatitude(Double centerLatitude) {
        this.centerLatitude = centerLatitude;
    }

    @JsonProperty("centerLongitude")
    public Double getCenterLongitude() {
        return centerLongitude;
    }

    @JsonProperty("centerLongitude")
    public void setCenterLongitude(Double centerLongitude) {
        this.centerLongitude = centerLongitude;
    }

    @JsonProperty("hasParkRide")
    public Boolean getHasParkRide() {
        return hasParkRide;
    }

    @JsonProperty("hasParkRide")
    public void setHasParkRide(Boolean hasParkRide) {
        this.hasParkRide = hasParkRide;
    }

    @JsonProperty("travelOptions")
    public List<TravelOption> getTravelOptions() {
        return travelOptions;
    }

    @JsonProperty("travelOptions")
    public void setTravelOptions(List<TravelOption> travelOptions) {
        this.travelOptions = travelOptions;
    }

    @JsonProperty("lowerLeftLongitude")
    public Double getLowerLeftLongitude() {
        return lowerLeftLongitude;
    }

    @JsonProperty("lowerLeftLongitude")
    public void setLowerLeftLongitude(Double lowerLeftLongitude) {
        this.lowerLeftLongitude = lowerLeftLongitude;
    }

    @JsonProperty("lowerLeftLatitude")
    public Double getLowerLeftLatitude() {
        return lowerLeftLatitude;
    }

    @JsonProperty("lowerLeftLatitude")
    public void setLowerLeftLatitude(Double lowerLeftLatitude) {
        this.lowerLeftLatitude = lowerLeftLatitude;
    }

    @JsonProperty("upperRightLatitude")
    public Double getUpperRightLatitude() {
        return upperRightLatitude;
    }

    @JsonProperty("upperRightLatitude")
    public void setUpperRightLatitude(Double upperRightLatitude) {
        this.upperRightLatitude = upperRightLatitude;
    }

    @JsonProperty("upperRightLongitude")
    public Double getUpperRightLongitude() {
        return upperRightLongitude;
    }

    @JsonProperty("upperRightLongitude")
    public void setUpperRightLongitude(Double upperRightLongitude) {
        this.upperRightLongitude = upperRightLongitude;
    }

    @JsonProperty("hasBikeSharing")
    public Boolean getHasBikeSharing() {
        return hasBikeSharing;
    }

    @JsonProperty("hasBikeSharing")
    public void setHasBikeSharing(Boolean hasBikeSharing) {
        this.hasBikeSharing = hasBikeSharing;
    }

    @JsonProperty("hasBikePark")
    public Boolean getHasBikePark() {
        return hasBikePark;
    }

    @JsonProperty("hasBikePark")
    public void setHasBikePark(Boolean hasBikePark) {
        this.hasBikePark = hasBikePark;
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
