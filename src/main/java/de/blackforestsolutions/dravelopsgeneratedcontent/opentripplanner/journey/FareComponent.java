
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
    "fareId",
    "price",
    "routes"
})
public class FareComponent implements Serializable
{

    @JsonProperty("fareId")
    private String fareId;
    @JsonProperty("price")
    private Money price;
    @JsonProperty("routes")
    private List<String> routes = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -2724975380429903312L;

    @JsonProperty("fareId")
    public String getFareId() {
        return fareId;
    }

    @JsonProperty("fareId")
    public void setFareId(String fareId) {
        this.fareId = fareId;
    }

    @JsonProperty("price")
    public Money getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Money price) {
        this.price = price;
    }

    @JsonProperty("routes")
    public List<String> getRoutes() {
        return routes;
    }

    @JsonProperty("routes")
    public void setRoutes(List<String> routes) {
        this.routes = routes;
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
