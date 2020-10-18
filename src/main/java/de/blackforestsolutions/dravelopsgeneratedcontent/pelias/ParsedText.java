
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
    "subject",
    "street",
    "housenumber",
    "locality",
    "admin",
    "country"
})
public class ParsedText implements Serializable
{

    @JsonProperty("subject")
    private String subject;
    @JsonProperty("street")
    private String street;
    @JsonProperty("housenumber")
    private String housenumber;
    @JsonProperty("locality")
    private String locality;
    @JsonProperty("admin")
    private String admin;
    @JsonProperty("country")
    private String country;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -7348718743258202187L;

    @JsonProperty("subject")
    public String getSubject() {
        return subject;
    }

    @JsonProperty("subject")
    public void setSubject(String subject) {
        this.subject = subject;
    }

    @JsonProperty("street")
    public String getStreet() {
        return street;
    }

    @JsonProperty("street")
    public void setStreet(String street) {
        this.street = street;
    }

    @JsonProperty("housenumber")
    public String getHousenumber() {
        return housenumber;
    }

    @JsonProperty("housenumber")
    public void setHousenumber(String housenumber) {
        this.housenumber = housenumber;
    }

    @JsonProperty("locality")
    public String getLocality() {
        return locality;
    }

    @JsonProperty("locality")
    public void setLocality(String locality) {
        this.locality = locality;
    }

    @JsonProperty("admin")
    public String getAdmin() {
        return admin;
    }

    @JsonProperty("admin")
    public void setAdmin(String admin) {
        this.admin = admin;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
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
