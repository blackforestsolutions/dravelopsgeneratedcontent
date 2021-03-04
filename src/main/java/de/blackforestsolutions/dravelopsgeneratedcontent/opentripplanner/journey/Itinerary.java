
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
    "duration",
    "startTime",
    "endTime",
    "walkTime",
    "transitTime",
    "waitingTime",
    "walkDistance",
    "walkLimitExceeded",
    "elevationLost",
    "elevationGained",
    "transfers",
    "fare",
    "legs",
    "systemNotices",
    "tooSloped"
})
public class Itinerary implements Serializable
{

    @JsonProperty("duration")
    private Long duration;
    @JsonProperty("startTime")
    private Long startTime;
    @JsonProperty("endTime")
    private Long endTime;
    @JsonProperty("walkTime")
    private Long walkTime;
    @JsonProperty("transitTime")
    private Long transitTime;
    @JsonProperty("waitingTime")
    private Long waitingTime;
    @JsonProperty("walkDistance")
    private Double walkDistance;
    @JsonProperty("walkLimitExceeded")
    private Boolean walkLimitExceeded;
    @JsonProperty("elevationLost")
    private Double elevationLost;
    @JsonProperty("elevationGained")
    private Double elevationGained;
    @JsonProperty("transfers")
    private Long transfers;
    @JsonProperty("fare")
    private Fare fare;
    @JsonProperty("legs")
    private List<Leg> legs = null;
    @JsonProperty("systemNotices")
    private List<SystemNotice> systemNotices = null;
    @JsonProperty("tooSloped")
    private Boolean tooSloped;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -4663883635151559802L;

    @JsonProperty("duration")
    public Long getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(Long duration) {
        this.duration = duration;
    }

    @JsonProperty("startTime")
    public Long getStartTime() {
        return startTime;
    }

    @JsonProperty("startTime")
    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    @JsonProperty("endTime")
    public Long getEndTime() {
        return endTime;
    }

    @JsonProperty("endTime")
    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    @JsonProperty("walkTime")
    public Long getWalkTime() {
        return walkTime;
    }

    @JsonProperty("walkTime")
    public void setWalkTime(Long walkTime) {
        this.walkTime = walkTime;
    }

    @JsonProperty("transitTime")
    public Long getTransitTime() {
        return transitTime;
    }

    @JsonProperty("transitTime")
    public void setTransitTime(Long transitTime) {
        this.transitTime = transitTime;
    }

    @JsonProperty("waitingTime")
    public Long getWaitingTime() {
        return waitingTime;
    }

    @JsonProperty("waitingTime")
    public void setWaitingTime(Long waitingTime) {
        this.waitingTime = waitingTime;
    }

    @JsonProperty("walkDistance")
    public Double getWalkDistance() {
        return walkDistance;
    }

    @JsonProperty("walkDistance")
    public void setWalkDistance(Double walkDistance) {
        this.walkDistance = walkDistance;
    }

    @JsonProperty("walkLimitExceeded")
    public Boolean getWalkLimitExceeded() {
        return walkLimitExceeded;
    }

    @JsonProperty("walkLimitExceeded")
    public void setWalkLimitExceeded(Boolean walkLimitExceeded) {
        this.walkLimitExceeded = walkLimitExceeded;
    }

    @JsonProperty("elevationLost")
    public Double getElevationLost() {
        return elevationLost;
    }

    @JsonProperty("elevationLost")
    public void setElevationLost(Double elevationLost) {
        this.elevationLost = elevationLost;
    }

    @JsonProperty("elevationGained")
    public Double getElevationGained() {
        return elevationGained;
    }

    @JsonProperty("elevationGained")
    public void setElevationGained(Double elevationGained) {
        this.elevationGained = elevationGained;
    }

    @JsonProperty("transfers")
    public Long getTransfers() {
        return transfers;
    }

    @JsonProperty("transfers")
    public void setTransfers(Long transfers) {
        this.transfers = transfers;
    }

    @JsonProperty("fare")
    public Fare getFare() {
        return fare;
    }

    @JsonProperty("fare")
    public void setFare(Fare fare) {
        this.fare = fare;
    }

    @JsonProperty("legs")
    public List<Leg> getLegs() {
        return legs;
    }

    @JsonProperty("legs")
    public void setLegs(List<Leg> legs) {
        this.legs = legs;
    }

    @JsonProperty("systemNotices")
    public List<SystemNotice> getSystemNotices() {
        return systemNotices;
    }

    @JsonProperty("systemNotices")
    public void setSystemNotices(List<SystemNotice> systemNotices) {
        this.systemNotices = systemNotices;
    }

    @JsonProperty("tooSloped")
    public Boolean getTooSloped() {
        return tooSloped;
    }

    @JsonProperty("tooSloped")
    public void setTooSloped(Boolean tooSloped) {
        this.tooSloped = tooSloped;
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
