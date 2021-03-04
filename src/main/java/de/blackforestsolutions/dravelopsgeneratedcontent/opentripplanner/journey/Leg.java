
package de.blackforestsolutions.dravelopsgeneratedcontent.opentripplanner.journey;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "startTime",
    "endTime",
    "departureDelay",
    "arrivalDelay",
    "realTime",
    "distance",
    "pathway",
    "mode",
    "route",
    "agencyTimeZoneOffset",
    "interlineWithPreviousLeg",
    "from",
    "to",
    "legGeometry",
    "rentedBike",
    "duration",
    "transitLeg",
    "intermediateStops",
    "steps",
    "agencyName",
    "agencyUrl",
    "routeType",
    "routeId",
    "headsign",
    "agencyId",
    "tripId",
    "serviceDate",
    "routeShortName",
    "routeLongName",
    "isNonExactFrequency",
    "headway",
    "routeColor",
    "routeTextColor",
    "tripShortName",
    "tripBlockId",
    "routeBrandingUrl",
    "alerts",
    "boardRule",
    "alightRule"
})
public class Leg implements Serializable
{

    @JsonProperty("startTime")
    private Long startTime;
    @JsonProperty("endTime")
    private Long endTime;
    @JsonProperty("departureDelay")
    private Long departureDelay;
    @JsonProperty("arrivalDelay")
    private Long arrivalDelay;
    @JsonProperty("realTime")
    private Boolean realTime;
    @JsonProperty("distance")
    private Double distance;
    @JsonProperty("pathway")
    private Boolean pathway;
    @JsonProperty("mode")
    private String mode;
    @JsonProperty("route")
    private String route;
    @JsonProperty("agencyTimeZoneOffset")
    private Long agencyTimeZoneOffset;
    @JsonProperty("interlineWithPreviousLeg")
    private Boolean interlineWithPreviousLeg;
    @JsonProperty("from")
    private Stop from;
    @JsonProperty("to")
    private Stop to;
    @JsonProperty("legGeometry")
    private LegGeometry legGeometry;
    @JsonProperty("rentedBike")
    private Boolean rentedBike;
    @JsonProperty("duration")
    private Double duration;
    @JsonProperty("transitLeg")
    private Boolean transitLeg;
    @JsonProperty("intermediateStops")
    private List<Stop> intermediateStops = null;
    @JsonProperty("steps")
    private List<Step> steps = null;
    @JsonProperty("agencyName")
    private String agencyName;
    @JsonProperty("agencyUrl")
    private String agencyUrl;
    @JsonProperty("routeType")
    private Long routeType;
    @JsonProperty("routeId")
    private String routeId;
    @JsonProperty("headsign")
    private String headsign;
    @JsonProperty("agencyId")
    private String agencyId;
    @JsonProperty("tripId")
    private String tripId;
    @JsonProperty("serviceDate")
    private String serviceDate;
    @JsonProperty("routeShortName")
    private String routeShortName;
    @JsonProperty("routeLongName")
    private String routeLongName;
    @JsonProperty("isNonExactFrequency")
    private Boolean isNonExactFrequency;
    @JsonProperty("headway")
    private Long headway;
    @JsonProperty("routeColor")
    private String routeColor;
    @JsonProperty("routeTextColor")
    private String routeTextColor;
    @JsonProperty("tripShortName")
    private String tripShortName;
    @JsonProperty("tripBlockId")
    private String tripBlockId;
    @JsonProperty("routeBrandingUrl")
    private String routeBrandingUrl;
    @JsonProperty("alerts")
    private List<Alert> alerts = null;
    @JsonProperty("boardRule")
    private String boardRule;
    @JsonProperty("alightRule")
    private String alightRule;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 7185650652432758669L;

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

    @JsonProperty("departureDelay")
    public Long getDepartureDelay() {
        return departureDelay;
    }

    @JsonProperty("departureDelay")
    public void setDepartureDelay(Long departureDelay) {
        this.departureDelay = departureDelay;
    }

    @JsonProperty("arrivalDelay")
    public Long getArrivalDelay() {
        return arrivalDelay;
    }

    @JsonProperty("arrivalDelay")
    public void setArrivalDelay(Long arrivalDelay) {
        this.arrivalDelay = arrivalDelay;
    }

    @JsonProperty("realTime")
    public Boolean getRealTime() {
        return realTime;
    }

    @JsonProperty("realTime")
    public void setRealTime(Boolean realTime) {
        this.realTime = realTime;
    }

    @JsonProperty("distance")
    public Double getDistance() {
        return distance;
    }

    @JsonProperty("distance")
    public void setDistance(Double distance) {
        this.distance = distance;
    }

    @JsonProperty("pathway")
    public Boolean getPathway() {
        return pathway;
    }

    @JsonProperty("pathway")
    public void setPathway(Boolean pathway) {
        this.pathway = pathway;
    }

    @JsonProperty("mode")
    public String getMode() {
        return mode;
    }

    @JsonProperty("mode")
    public void setMode(String mode) {
        this.mode = mode;
    }

    @JsonProperty("route")
    public String getRoute() {
        return route;
    }

    @JsonProperty("route")
    public void setRoute(String route) {
        this.route = route;
    }

    @JsonProperty("agencyTimeZoneOffset")
    public Long getAgencyTimeZoneOffset() {
        return agencyTimeZoneOffset;
    }

    @JsonProperty("agencyTimeZoneOffset")
    public void setAgencyTimeZoneOffset(Long agencyTimeZoneOffset) {
        this.agencyTimeZoneOffset = agencyTimeZoneOffset;
    }

    @JsonProperty("interlineWithPreviousLeg")
    public Boolean getInterlineWithPreviousLeg() {
        return interlineWithPreviousLeg;
    }

    @JsonProperty("interlineWithPreviousLeg")
    public void setInterlineWithPreviousLeg(Boolean interlineWithPreviousLeg) {
        this.interlineWithPreviousLeg = interlineWithPreviousLeg;
    }

    @JsonProperty("from")
    public Stop getFrom() {
        return from;
    }

    @JsonProperty("from")
    public void setFrom(Stop from) {
        this.from = from;
    }

    @JsonProperty("to")
    public Stop getTo() {
        return to;
    }

    @JsonProperty("to")
    public void setTo(Stop to) {
        this.to = to;
    }

    @JsonProperty("legGeometry")
    public LegGeometry getLegGeometry() {
        return legGeometry;
    }

    @JsonProperty("legGeometry")
    public void setLegGeometry(LegGeometry legGeometry) {
        this.legGeometry = legGeometry;
    }

    @JsonProperty("rentedBike")
    public Boolean getRentedBike() {
        return rentedBike;
    }

    @JsonProperty("rentedBike")
    public void setRentedBike(Boolean rentedBike) {
        this.rentedBike = rentedBike;
    }

    @JsonProperty("duration")
    public Double getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(Double duration) {
        this.duration = duration;
    }

    @JsonProperty("transitLeg")
    public Boolean getTransitLeg() {
        return transitLeg;
    }

    @JsonProperty("transitLeg")
    public void setTransitLeg(Boolean transitLeg) {
        this.transitLeg = transitLeg;
    }

    @JsonProperty("intermediateStops")
    public List<Stop> getIntermediateStops() {
        return intermediateStops;
    }

    @JsonProperty("intermediateStops")
    public void setIntermediateStops(List<Stop> intermediateStops) {
        this.intermediateStops = intermediateStops;
    }

    @JsonProperty("steps")
    public List<Step> getSteps() {
        return steps;
    }

    @JsonProperty("steps")
    public void setSteps(List<Step> steps) {
        this.steps = steps;
    }

    @JsonProperty("agencyName")
    public String getAgencyName() {
        return agencyName;
    }

    @JsonProperty("agencyName")
    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    @JsonProperty("agencyUrl")
    public String getAgencyUrl() {
        return agencyUrl;
    }

    @JsonProperty("agencyUrl")
    public void setAgencyUrl(String agencyUrl) {
        this.agencyUrl = agencyUrl;
    }

    @JsonProperty("routeType")
    public Long getRouteType() {
        return routeType;
    }

    @JsonProperty("routeType")
    public void setRouteType(Long routeType) {
        this.routeType = routeType;
    }

    @JsonProperty("routeId")
    public String getRouteId() {
        return routeId;
    }

    @JsonProperty("routeId")
    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    @JsonProperty("headsign")
    public String getHeadsign() {
        return headsign;
    }

    @JsonProperty("headsign")
    public void setHeadsign(String headsign) {
        this.headsign = headsign;
    }

    @JsonProperty("agencyId")
    public String getAgencyId() {
        return agencyId;
    }

    @JsonProperty("agencyId")
    public void setAgencyId(String agencyId) {
        this.agencyId = agencyId;
    }

    @JsonProperty("tripId")
    public String getTripId() {
        return tripId;
    }

    @JsonProperty("tripId")
    public void setTripId(String tripId) {
        this.tripId = tripId;
    }

    @JsonProperty("serviceDate")
    public String getServiceDate() {
        return serviceDate;
    }

    @JsonProperty("serviceDate")
    public void setServiceDate(String serviceDate) {
        this.serviceDate = serviceDate;
    }

    @JsonProperty("routeShortName")
    public String getRouteShortName() {
        return routeShortName;
    }

    @JsonProperty("routeShortName")
    public void setRouteShortName(String routeShortName) {
        this.routeShortName = routeShortName;
    }

    @JsonProperty("routeLongName")
    public String getRouteLongName() {
        return routeLongName;
    }

    @JsonProperty("routeLongName")
    public void setRouteLongName(String routeLongName) {
        this.routeLongName = routeLongName;
    }

    @JsonProperty("isNonExactFrequency")
    public Boolean getNonExactFrequency() {
        return isNonExactFrequency;
    }

    @JsonProperty("isNonExactFrequency")
    public void setNonExactFrequency(Boolean nonExactFrequency) {
        isNonExactFrequency = nonExactFrequency;
    }

    @JsonProperty("headway")
    public Long getHeadway() {
        return headway;
    }

    @JsonProperty("headway")
    public void setHeadway(Long headway) {
        this.headway = headway;
    }

    @JsonProperty("routeColor")
    public String getRouteColor() {
        return routeColor;
    }

    @JsonProperty("routeColor")
    public void setRouteColor(String routeColor) {
        this.routeColor = routeColor;
    }

    @JsonProperty("routeTextColor")
    public String getRouteTextColor() {
        return routeTextColor;
    }

    @JsonProperty("routeTextColor")
    public void setRouteTextColor(String routeTextColor) {
        this.routeTextColor = routeTextColor;
    }

    @JsonProperty("tripShortName")
    public String getTripShortName() {
        return tripShortName;
    }

    @JsonProperty("tripShortName")
    public void setTripShortName(String tripShortName) {
        this.tripShortName = tripShortName;
    }

    @JsonProperty("tripBlockId")
    public String getTripBlockId() {
        return tripBlockId;
    }

    @JsonProperty("tripBlockId")
    public void setTripBlockId(String tripBlockId) {
        this.tripBlockId = tripBlockId;
    }

    @JsonProperty("routeBrandingUrl")
    public String getRouteBrandingUrl() {
        return routeBrandingUrl;
    }

    @JsonProperty("routeBrandingUrl")
    public void setRouteBrandingUrl(String routeBrandingUrl) {
        this.routeBrandingUrl = routeBrandingUrl;
    }

    @JsonProperty("alerts")
    public List<Alert> getAlerts() {
        return alerts;
    }

    @JsonProperty("alerts")
    public void setAlerts(List<Alert> alerts) {
        this.alerts = alerts;
    }

    @JsonProperty("boardRule")
    public String getBoardRule() {
        return boardRule;
    }

    @JsonProperty("boardRule")
    public void setBoardRule(String boardRule) {
        this.boardRule = boardRule;
    }

    @JsonProperty("alightRule")
    public String getAlightRule() {
        return alightRule;
    }

    @JsonProperty("alightRule")
    public void setAlightRule(String alightRule) {
        this.alightRule = alightRule;
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
