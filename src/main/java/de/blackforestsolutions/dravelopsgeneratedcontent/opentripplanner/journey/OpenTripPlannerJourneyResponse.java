
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
    "requestParameters",
    "plan",
    "debugOutput",
    "elevationMetadata"
})
public class OpenTripPlannerJourneyResponse implements Serializable
{

    @JsonProperty("requestParameters")
    private RequestParameters requestParameters;
    @JsonProperty("plan")
    private Plan plan;
    @JsonProperty("debugOutput")
    private DebugOutput debugOutput;
    @JsonProperty("elevationMetadata")
    private ElevationMetadata elevationMetadata;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6108680661749889514L;

    @JsonProperty("requestParameters")
    public RequestParameters getRequestParameters() {
        return requestParameters;
    }

    @JsonProperty("requestParameters")
    public void setRequestParameters(RequestParameters requestParameters) {
        this.requestParameters = requestParameters;
    }

    @JsonProperty("plan")
    public Plan getPlan() {
        return plan;
    }

    @JsonProperty("plan")
    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    @JsonProperty("debugOutput")
    public DebugOutput getDebugOutput() {
        return debugOutput;
    }

    @JsonProperty("debugOutput")
    public void setDebugOutput(DebugOutput debugOutput) {
        this.debugOutput = debugOutput;
    }

    @JsonProperty("elevationMetadata")
    public ElevationMetadata getElevationMetadata() {
        return elevationMetadata;
    }

    @JsonProperty("elevationMetadata")
    public void setElevationMetadata(ElevationMetadata elevationMetadata) {
        this.elevationMetadata = elevationMetadata;
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
