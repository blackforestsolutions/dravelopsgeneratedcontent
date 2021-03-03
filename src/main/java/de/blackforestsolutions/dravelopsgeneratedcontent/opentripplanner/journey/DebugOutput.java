
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
        "precalculationTime",
        "directStreetRouterTime",
        "transitRouterTime",
        "filteringTime",
        "renderingTime",
        "totalTime",
        "transitRouterTimes"
})
public class DebugOutput implements Serializable
{

    @JsonProperty("precalculationTime")
    private Long precalculationTime;
    @JsonProperty("directStreetRouterTime")
    private Long directStreetRouterTime;
    @JsonProperty("transitRouterTime")
    private Long transitRouterTime;
    @JsonProperty("filteringTime")
    private Long filteringTime;
    @JsonProperty("renderingTime")
    private Long renderingTime;
    @JsonProperty("totalTime")
    private Long totalTime;
    @JsonProperty("transitRouterTimes")
    private TransitRouterTimes transitRouterTimes;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6294274198791813116L;

    @JsonProperty("precalculationTime")
    public Long getPrecalculationTime() {
        return precalculationTime;
    }

    @JsonProperty("precalculationTime")
    public void setPrecalculationTime(Long precalculationTime) {
        this.precalculationTime = precalculationTime;
    }

    @JsonProperty("directStreetRouterTime")
    public Long getDirectStreetRouterTime() {
        return directStreetRouterTime;
    }

    @JsonProperty("directStreetRouterTime")
    public void setDirectStreetRouterTime(Long directStreetRouterTime) {
        this.directStreetRouterTime = directStreetRouterTime;
    }

    @JsonProperty("transitRouterTime")
    public Long getTransitRouterTime() {
        return transitRouterTime;
    }

    @JsonProperty("transitRouterTime")
    public void setTransitRouterTime(Long transitRouterTime) {
        this.transitRouterTime = transitRouterTime;
    }

    @JsonProperty("filteringTime")
    public Long getFilteringTime() {
        return filteringTime;
    }

    @JsonProperty("filteringTime")
    public void setFilteringTime(Long filteringTime) {
        this.filteringTime = filteringTime;
    }

    @JsonProperty("renderingTime")
    public Long getRenderingTime() {
        return renderingTime;
    }

    @JsonProperty("renderingTime")
    public void setRenderingTime(Long renderingTime) {
        this.renderingTime = renderingTime;
    }

    @JsonProperty("totalTime")
    public Long getTotalTime() {
        return totalTime;
    }

    @JsonProperty("totalTime")
    public void setTotalTime(Long totalTime) {
        this.totalTime = totalTime;
    }

    @JsonProperty("transitRouterTimes")
    public TransitRouterTimes getTransitRouterTimes() {
        return transitRouterTimes;
    }

    @JsonProperty("transitRouterTimes")
    public void setTransitRouterTimes(TransitRouterTimes transitRouterTimes) {
        this.transitRouterTimes = transitRouterTimes;
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
