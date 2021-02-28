
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
    "date",
    "arriveBy",
    "fromPlace",
    "toPlace",
    "time",
    "locale"
})
public class RequestParameters implements Serializable
{

    @JsonProperty("date")
    private String date;
    @JsonProperty("arriveBy")
    private String arriveBy;
    @JsonProperty("fromPlace")
    private String fromPlace;
    @JsonProperty("toPlace")
    private String toPlace;
    @JsonProperty("time")
    private String time;
    @JsonProperty("locale")
    private String locale;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 2902272580801857702L;

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("arriveBy")
    public String getArriveBy() {
        return arriveBy;
    }

    @JsonProperty("arriveBy")
    public void setArriveBy(String arriveBy) {
        this.arriveBy = arriveBy;
    }

    @JsonProperty("fromPlace")
    public String getFromPlace() {
        return fromPlace;
    }

    @JsonProperty("fromPlace")
    public void setFromPlace(String fromPlace) {
        this.fromPlace = fromPlace;
    }

    @JsonProperty("toPlace")
    public String getToPlace() {
        return toPlace;
    }

    @JsonProperty("toPlace")
    public void setToPlace(String toPlace) {
        this.toPlace = toPlace;
    }

    @JsonProperty("time")
    public String getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(String time) {
        this.time = time;
    }

    @JsonProperty("locale")
    public String getLocale() {
        return locale;
    }

    @JsonProperty("locale")
    public void setLocale(String locale) {
        this.locale = locale;
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
