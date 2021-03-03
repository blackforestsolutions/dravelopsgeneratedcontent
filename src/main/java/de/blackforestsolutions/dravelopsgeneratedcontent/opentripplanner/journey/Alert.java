
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
        "alertHeaderText",
        "alertDescriptionText",
        "alertUrl",
        "effectiveStartDate",
        "effectiveEndDate"
})
public class Alert implements Serializable
{

    @JsonProperty("alertHeaderText")
    private String alertHeaderText;
    @JsonProperty("alertDescriptionText")
    private String alertDescriptionText;
    @JsonProperty("alertUrl")
    private String alertUrl;
    @JsonProperty("effectiveStartDate")
    private Long effectiveStartDate;
    @JsonProperty("effectiveEndDate")
    private Long effectiveEndDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 7420579497196085919L;

    @JsonProperty("alertHeaderText")
    public String getAlertHeaderText() {
        return alertHeaderText;
    }

    @JsonProperty("alertHeaderText")
    public void setAlertHeaderText(String alertHeaderText) {
        this.alertHeaderText = alertHeaderText;
    }

    @JsonProperty("alertDescriptionText")
    public String getAlertDescriptionText() {
        return alertDescriptionText;
    }

    @JsonProperty("alertDescriptionText")
    public void setAlertDescriptionText(String alertDescriptionText) {
        this.alertDescriptionText = alertDescriptionText;
    }

    @JsonProperty("alertUrl")
    public String getAlertUrl() {
        return alertUrl;
    }

    @JsonProperty("alertUrl")
    public void setAlertUrl(String alertUrl) {
        this.alertUrl = alertUrl;
    }

    @JsonProperty("effectiveStartDate")
    public Long getEffectiveStartDate() {
        return effectiveStartDate;
    }

    @JsonProperty("effectiveStartDate")
    public void setEffectiveStartDate(Long effectiveStartDate) {
        this.effectiveStartDate = effectiveStartDate;
    }

    @JsonProperty("effectiveEndDate")
    public Long getEffectiveEndDate() {
        return effectiveEndDate;
    }

    @JsonProperty("effectiveEndDate")
    public void setEffectiveEndDate(Long effectiveEndDate) {
        this.effectiveEndDate = effectiveEndDate;
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
