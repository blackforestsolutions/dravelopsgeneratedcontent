
package de.blackforestsolutions.dravelopsgeneratedcontent.graphql;

import java.io.Serializable;
import java.time.ZonedDateTime;
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
        "departureLatitude",
        "departureLongitude",
        "arrivalLatitude",
        "arrivalLongitude",
        "dateTime",
        "isArrivalDateTime",
        "language"
})
public class JourneyVariables implements Serializable {

    @JsonProperty("departureLatitude")
    private Double departureLatitude;
    @JsonProperty("departureLongitude")
    private Double departureLongitude;
    @JsonProperty("arrivalLatitude")
    private Double arrivalLatitude;
    @JsonProperty("arrivalLongitude")
    private Double arrivalLongitude;
    @JsonProperty("dateTime")
    private ZonedDateTime dateTime;
    @JsonProperty("isArrivalDateTime")
    private Boolean isArrivalDateTime;
    @JsonProperty("language")
    private String language;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -7633971650454654343L;

    @JsonProperty("departureLatitude")
    public Double getDepartureLatitude() {
        return departureLatitude;
    }

    @JsonProperty("departureLatitude")
    public void setDepartureLatitude(Double departureLatitude) {
        this.departureLatitude = departureLatitude;
    }

    @JsonProperty("departureLongitude")
    public Double getDepartureLongitude() {
        return departureLongitude;
    }

    @JsonProperty("departureLongitude")
    public void setDepartureLongitude(Double departureLongitude) {
        this.departureLongitude = departureLongitude;
    }

    @JsonProperty("arrivalLatitude")
    public Double getArrivalLatitude() {
        return arrivalLatitude;
    }

    @JsonProperty("arrivalLatitude")
    public void setArrivalLatitude(Double arrivalLatitude) {
        this.arrivalLatitude = arrivalLatitude;
    }

    @JsonProperty("arrivalLongitude")
    public Double getArrivalLongitude() {
        return arrivalLongitude;
    }

    @JsonProperty("arrivalLongitude")
    public void setArrivalLongitude(Double arrivalLongitude) {
        this.arrivalLongitude = arrivalLongitude;
    }

    @JsonProperty("dateTime")
    public ZonedDateTime getDateTime() {
        return dateTime;
    }

    @JsonProperty("dateTime")
    public void setDateTime(ZonedDateTime dateTime) {
        this.dateTime = dateTime;
    }

    @JsonProperty("isArrivalDateTime")
    public Boolean getIsArrivalDateTime() {
        return isArrivalDateTime;
    }

    @JsonProperty("isArrivalDateTime")
    public void setIsArrivalDateTime(Boolean isArrivalDateTime) {
        this.isArrivalDateTime = isArrivalDateTime;
    }

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
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
