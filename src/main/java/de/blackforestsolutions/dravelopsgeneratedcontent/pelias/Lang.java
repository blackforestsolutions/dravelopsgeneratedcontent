
package de.blackforestsolutions.dravelopsgeneratedcontent.pelias;

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
    "name",
    "iso6391",
    "iso6393",
    "via",
    "defaulted"
})
public class Lang implements Serializable
{

    @JsonProperty("name")
    private String name;
    @JsonProperty("iso6391")
    private String iso6391;
    @JsonProperty("iso6393")
    private String iso6393;
    @JsonProperty("via")
    private String via;
    @JsonProperty("defaulted")
    private Boolean defaulted;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8517324240467054647L;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("iso6391")
    public String getIso6391() {
        return iso6391;
    }

    @JsonProperty("iso6391")
    public void setIso6391(String iso6391) {
        this.iso6391 = iso6391;
    }

    @JsonProperty("iso6393")
    public String getIso6393() {
        return iso6393;
    }

    @JsonProperty("iso6393")
    public void setIso6393(String iso6393) {
        this.iso6393 = iso6393;
    }

    @JsonProperty("via")
    public String getVia() {
        return via;
    }

    @JsonProperty("via")
    public void setVia(String via) {
        this.via = via;
    }

    @JsonProperty("defaulted")
    public Boolean getDefaulted() {
        return defaulted;
    }

    @JsonProperty("defaulted")
    public void setDefaulted(Boolean defaulted) {
        this.defaulted = defaulted;
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
