
package de.blackforestsolutions.dravelopsgeneratedcontent.graphql;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "editor"
})
@Generated("jsonschema2pojo")
public class Settings implements Serializable {

    @JsonProperty("editor")
    private Editor editor;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6814585677478601834L;

    @JsonProperty("editor")
    public Editor getEditor() {
        return editor;
    }

    @JsonProperty("editor")
    public void setEditor(Editor editor) {
        this.editor = editor;
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