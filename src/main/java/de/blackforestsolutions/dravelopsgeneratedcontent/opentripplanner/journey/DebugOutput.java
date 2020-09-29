
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
    "precalculationTime",
    "pathCalculationTime",
    "pathTimes",
    "renderingTime",
    "totalTime",
    "timedOut"
})
public class DebugOutput implements Serializable
{

    @JsonProperty("precalculationTime")
    private Long precalculationTime;
    @JsonProperty("pathCalculationTime")
    private Long pathCalculationTime;
    @JsonProperty("pathTimes")
    private List<Long> pathTimes = null;
    @JsonProperty("renderingTime")
    private Long renderingTime;
    @JsonProperty("totalTime")
    private Long totalTime;
    @JsonProperty("timedOut")
    private Boolean timedOut;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 2610944185371409550L;

    @JsonProperty("precalculationTime")
    public Long getPrecalculationTime() {
        return precalculationTime;
    }

    @JsonProperty("precalculationTime")
    public void setPrecalculationTime(Long precalculationTime) {
        this.precalculationTime = precalculationTime;
    }

    @JsonProperty("pathCalculationTime")
    public Long getPathCalculationTime() {
        return pathCalculationTime;
    }

    @JsonProperty("pathCalculationTime")
    public void setPathCalculationTime(Long pathCalculationTime) {
        this.pathCalculationTime = pathCalculationTime;
    }

    @JsonProperty("pathTimes")
    public List<Long> getPathTimes() {
        return pathTimes;
    }

    @JsonProperty("pathTimes")
    public void setPathTimes(List<Long> pathTimes) {
        this.pathTimes = pathTimes;
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

    @JsonProperty("timedOut")
    public Boolean getTimedOut() {
        return timedOut;
    }

    @JsonProperty("timedOut")
    public void setTimedOut(Boolean timedOut) {
        this.timedOut = timedOut;
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
