
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
        "searchWindowUsed",
        "nextDateTime",
        "prevDateTime"
})
public class Metadata implements Serializable
{

    @JsonProperty("searchWindowUsed")
    private Long searchWindowUsed;
    @JsonProperty("nextDateTime")
    private Long nextDateTime;
    @JsonProperty("prevDateTime")
    private Long prevDateTime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -1435027899727624040L;

    @JsonProperty("searchWindowUsed")
    public Long getSearchWindowUsed() {
        return searchWindowUsed;
    }

    @JsonProperty("searchWindowUsed")
    public void setSearchWindowUsed(Long searchWindowUsed) {
        this.searchWindowUsed = searchWindowUsed;
    }

    @JsonProperty("nextDateTime")
    public Long getNextDateTime() {
        return nextDateTime;
    }

    @JsonProperty("nextDateTime")
    public void setNextDateTime(Long nextDateTime) {
        this.nextDateTime = nextDateTime;
    }

    @JsonProperty("prevDateTime")
    public Long getPrevDateTime() {
        return prevDateTime;
    }

    @JsonProperty("prevDateTime")
    public void setPrevDateTime(Long prevDateTime) {
        this.prevDateTime = prevDateTime;
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
