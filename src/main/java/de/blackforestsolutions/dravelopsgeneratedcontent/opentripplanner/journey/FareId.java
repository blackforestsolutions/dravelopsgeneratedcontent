package de.blackforestsolutions.dravelopsgeneratedcontent.opentripplanner.journey;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "feedId",
        "id"
})
public class FareId implements Serializable
{
    @JsonProperty("feedId")
    private String feedId;
    @JsonProperty("id")
    private String id;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 2902272580801857702L;

    @JsonProperty("feedId")
    public String getFeedId() {
        return feedId;
    }

    @JsonProperty("feedId")
    public void setFeedId(String feedId) {
        this.feedId = feedId;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
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
