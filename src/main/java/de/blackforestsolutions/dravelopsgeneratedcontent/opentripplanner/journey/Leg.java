
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
    "flexDrtAdvanceBookMin",
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
    "routeLongName"
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
    private From from;
    @JsonProperty("to")
    private To to;
    @JsonProperty("legGeometry")
    private LegGeometry legGeometry;
    @JsonProperty("rentedBike")
    private Boolean rentedBike;
    @JsonProperty("flexDrtAdvanceBookMin")
    private Double flexDrtAdvanceBookMin;
    @JsonProperty("duration")
    private Double duration;
    @JsonProperty("transitLeg")
    private Boolean transitLeg;
    @JsonProperty("intermediateStops")
    private List<IntermediateStop> intermediateStops = null;
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
    public From getFrom() {
        return from;
    }

    @JsonProperty("from")
    public void setFrom(From from) {
        this.from = from;
    }

    @JsonProperty("to")
    public To getTo() {
        return to;
    }

    @JsonProperty("to")
    public void setTo(To to) {
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

    @JsonProperty("flexDrtAdvanceBookMin")
    public Double getFlexDrtAdvanceBookMin() {
        return flexDrtAdvanceBookMin;
    }

    @JsonProperty("flexDrtAdvanceBookMin")
    public void setFlexDrtAdvanceBookMin(Double flexDrtAdvanceBookMin) {
        this.flexDrtAdvanceBookMin = flexDrtAdvanceBookMin;
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
    public List<IntermediateStop> getIntermediateStops() {
        return intermediateStops;
    }

    @JsonProperty("intermediateStops")
    public void setIntermediateStops(List<IntermediateStop> intermediateStops) {
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
