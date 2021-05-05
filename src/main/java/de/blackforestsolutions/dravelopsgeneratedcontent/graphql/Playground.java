
package de.blackforestsolutions.dravelopsgeneratedcontent.graphql;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "page-title",
        "settings",
        "tabs"
})
@Generated("jsonschema2pojo")
public class Playground implements Serializable {

    @JsonProperty("page-title")
    private String pageTitle;
    @JsonProperty("settings")
    private Settings settings;
    @JsonProperty("tabs")
    private Map<String, Tab> tabs;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -891441123281508992L;

    @JsonProperty("page-title")
    public String getPageTitle() {
        return pageTitle;
    }

    @JsonProperty("page-title")
    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }

    @JsonProperty("settings")
    public Settings getSettings() {
        return settings;
    }

    @JsonProperty("settings")
    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    @JsonProperty("tabs")
    public Map<String, Tab> getTabs() {
        return tabs;
    }

    @JsonProperty("tabs")
    public void setTabs(Map<String, Tab> tabs) {
        this.tabs = tabs;
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