
package de.blackforestsolutions.dravelopsgeneratedcontent.opentripplanner.journey;

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
    "distance",
    "relativeDirection",
    "streetName",
    "absoluteDirection",
    "exit",
    "stayOn",
    "area",
    "bogusName",
    "lon",
    "lat",
    "elevation",
    "alerts"
})
public class Step implements Serializable
{

    @JsonProperty("distance")
    private Double distance;
    @JsonProperty("relativeDirection")
    private String relativeDirection;
    @JsonProperty("streetName")
    private String streetName;
    @JsonProperty("absoluteDirection")
    private String absoluteDirection;
    @JsonProperty("exit")
    private String exit;
    @JsonProperty("stayOn")
    private Boolean stayOn;
    @JsonProperty("area")
    private Boolean area;
    @JsonProperty("bogusName")
    private Boolean bogusName;
    @JsonProperty("lon")
    private Double lon;
    @JsonProperty("lat")
    private Double lat;
    @JsonProperty("elevation")
    private String elevation = null;
    @JsonProperty("alerts")
    private List<Alert> alerts = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -3665191465199133652L;

    @JsonProperty("distance")
    public Double getDistance() {
        return distance;
    }

    @JsonProperty("distance")
    public void setDistance(Double distance) {
        this.distance = distance;
    }

    @JsonProperty("relativeDirection")
    public String getRelativeDirection() {
        return relativeDirection;
    }

    @JsonProperty("relativeDirection")
    public void setRelativeDirection(String relativeDirection) {
        this.relativeDirection = relativeDirection;
    }

    @JsonProperty("streetName")
    public String getStreetName() {
        return streetName;
    }

    @JsonProperty("streetName")
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    @JsonProperty("absoluteDirection")
    public String getAbsoluteDirection() {
        return absoluteDirection;
    }

    @JsonProperty("absoluteDirection")
    public void setAbsoluteDirection(String absoluteDirection) {
        this.absoluteDirection = absoluteDirection;
    }

    @JsonProperty("exit")
    public String getExit() {
        return exit;
    }

    @JsonProperty("exit")
    public void setExit(String exit) {
        this.exit = exit;
    }

    @JsonProperty("stayOn")
    public Boolean getStayOn() {
        return stayOn;
    }

    @JsonProperty("stayOn")
    public void setStayOn(Boolean stayOn) {
        this.stayOn = stayOn;
    }

    @JsonProperty("area")
    public Boolean getArea() {
        return area;
    }

    @JsonProperty("area")
    public void setArea(Boolean area) {
        this.area = area;
    }

    @JsonProperty("bogusName")
    public Boolean getBogusName() {
        return bogusName;
    }

    @JsonProperty("bogusName")
    public void setBogusName(Boolean bogusName) {
        this.bogusName = bogusName;
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

    @JsonProperty("elevation")
    public String getElevation() {
        return elevation;
    }

    @JsonProperty("elevation")
    public void setElevation(String elevation) {
        this.elevation = elevation;
    }

    @JsonProperty("alerts")
    public List<Alert> getAlerts() {
        return alerts;
    }

    @JsonProperty("alerts")
    public void setAlerts(List<Alert> alerts) {
        this.alerts = alerts;
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
