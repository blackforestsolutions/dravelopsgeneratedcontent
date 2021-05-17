
package de.blackforestsolutions.dravelopsgeneratedcontent.graphql;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "playground"
})
@Generated("jsonschema2pojo")
public class Graphql implements Serializable {

    @JsonProperty("playground")
    private Playground playground;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 7965517848625508759L;

    @JsonProperty("playground")
    public Playground getPlayground() {
        return playground;
    }

    @JsonProperty("playground")
    public void setPlayground(Playground playground) {
        this.playground = playground;
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
