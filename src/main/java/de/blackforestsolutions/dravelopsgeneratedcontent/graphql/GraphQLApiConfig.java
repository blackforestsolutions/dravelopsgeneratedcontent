
package de.blackforestsolutions.dravelopsgeneratedcontent.graphql;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "graphql",
        "sha"
})
@Generated("jsonschema2pojo")
public class GraphQLApiConfig implements Serializable {

    @JsonProperty("graphql")
    private Graphql graphql;
    @JsonProperty("sha")
    private String sha;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6727866780798907402L;

    @JsonProperty("graphql")
    public Graphql getGraphql() {
        return graphql;
    }

    @JsonProperty("graphql")
    public void setGraphql(Graphql graphql) {
        this.graphql = graphql;
    }

    @JsonProperty("sha")
    public String getSha() {
        return sha;
    }

    @JsonProperty("sha")
    public void setSha(String sha) {
        this.sha = sha;
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