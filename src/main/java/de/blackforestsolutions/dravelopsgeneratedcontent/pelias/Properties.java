
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
    "id",
    "gid",
    "layer",
    "source",
    "source_id",
    "name",
    "housenumber",
    "street",
    "postalcode",
    "distance",
    "accuracy",
    "country",
    "country_gid",
    "country_a",
    "region",
    "region_gid",
    "region_a",
    "macrocounty",
    "macrocounty_gid",
    "county",
    "county_gid",
    "county_a",
    "localadmin",
    "localadmin_gid",
    "locality",
    "locality_gid",
    "label",
    "addendum",
    "confidence"
})
public class Properties implements Serializable
{

    @JsonProperty("id")
    private String id;
    @JsonProperty("gid")
    private String gid;
    @JsonProperty("layer")
    private String layer;
    @JsonProperty("source")
    private String source;
    @JsonProperty("source_id")
    private String sourceId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("housenumber")
    private String housenumber;
    @JsonProperty("street")
    private String street;
    @JsonProperty("postalcode")
    private String postalcode;
    @JsonProperty("distance")
    private Double distance;
    @JsonProperty("accuracy")
    private String accuracy;
    @JsonProperty("country")
    private String country;
    @JsonProperty("country_gid")
    private String countryGid;
    @JsonProperty("country_a")
    private String countryA;
    @JsonProperty("region")
    private String region;
    @JsonProperty("region_gid")
    private String regionGid;
    @JsonProperty("region_a")
    private String regionA;
    @JsonProperty("macrocounty")
    private String macrocounty;
    @JsonProperty("macrocounty_gid")
    private String macrocountyGid;
    @JsonProperty("county")
    private String county;
    @JsonProperty("county_gid")
    private String countyGid;
    @JsonProperty("county_a")
    private String countyA;
    @JsonProperty("localadmin")
    private String localadmin;
    @JsonProperty("localadmin_gid")
    private String localadminGid;
    @JsonProperty("locality")
    private String locality;
    @JsonProperty("locality_gid")
    private String localityGid;
    @JsonProperty("label")
    private String label;
    @JsonProperty("addendum")
    private Addendum addendum;
    @JsonProperty("confidence")
    private Double confidence;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -730234706084197350L;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("gid")
    public String getGid() {
        return gid;
    }

    @JsonProperty("gid")
    public void setGid(String gid) {
        this.gid = gid;
    }

    @JsonProperty("layer")
    public String getLayer() {
        return layer;
    }

    @JsonProperty("layer")
    public void setLayer(String layer) {
        this.layer = layer;
    }

    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    @JsonProperty("source_id")
    public String getSourceId() {
        return sourceId;
    }

    @JsonProperty("source_id")
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("housenumber")
    public String getHousenumber() {
        return housenumber;
    }

    @JsonProperty("housenumber")
    public void setHousenumber(String housenumber) {
        this.housenumber = housenumber;
    }

    @JsonProperty("street")
    public String getStreet() {
        return street;
    }

    @JsonProperty("street")
    public void setStreet(String street) {
        this.street = street;
    }

    @JsonProperty("postalcode")
    public String getPostalcode() {
        return postalcode;
    }

    @JsonProperty("postalcode")
    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    @JsonProperty("distance")
    public Double getDistance() {
        return distance;
    }

    @JsonProperty("distance")
    public void setDistance(Double distance) {
        this.distance = distance;
    }

    @JsonProperty("accuracy")
    public String getAccuracy() {
        return accuracy;
    }

    @JsonProperty("accuracy")
    public void setAccuracy(String accuracy) {
        this.accuracy = accuracy;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("country_gid")
    public String getCountryGid() {
        return countryGid;
    }

    @JsonProperty("country_gid")
    public void setCountryGid(String countryGid) {
        this.countryGid = countryGid;
    }

    @JsonProperty("country_a")
    public String getCountryA() {
        return countryA;
    }

    @JsonProperty("country_a")
    public void setCountryA(String countryA) {
        this.countryA = countryA;
    }

    @JsonProperty("region")
    public String getRegion() {
        return region;
    }

    @JsonProperty("region")
    public void setRegion(String region) {
        this.region = region;
    }

    @JsonProperty("region_gid")
    public String getRegionGid() {
        return regionGid;
    }

    @JsonProperty("region_gid")
    public void setRegionGid(String regionGid) {
        this.regionGid = regionGid;
    }

    @JsonProperty("region_a")
    public String getRegionA() {
        return regionA;
    }

    @JsonProperty("region_a")
    public void setRegionA(String regionA) {
        this.regionA = regionA;
    }

    @JsonProperty("macrocounty")
    public String getMacrocounty() {
        return macrocounty;
    }

    @JsonProperty("macrocounty")
    public void setMacrocounty(String macrocounty) {
        this.macrocounty = macrocounty;
    }

    @JsonProperty("macrocounty_gid")
    public String getMacrocountyGid() {
        return macrocountyGid;
    }

    @JsonProperty("macrocounty_gid")
    public void setMacrocountyGid(String macrocountyGid) {
        this.macrocountyGid = macrocountyGid;
    }

    @JsonProperty("county")
    public String getCounty() {
        return county;
    }

    @JsonProperty("county")
    public void setCounty(String county) {
        this.county = county;
    }

    @JsonProperty("county_gid")
    public String getCountyGid() {
        return countyGid;
    }

    @JsonProperty("county_gid")
    public void setCountyGid(String countyGid) {
        this.countyGid = countyGid;
    }

    @JsonProperty("county_a")
    public String getCountyA() {
        return countyA;
    }

    @JsonProperty("county_a")
    public void setCountyA(String countyA) {
        this.countyA = countyA;
    }

    @JsonProperty("localadmin")
    public String getLocaladmin() {
        return localadmin;
    }

    @JsonProperty("localadmin")
    public void setLocaladmin(String localadmin) {
        this.localadmin = localadmin;
    }

    @JsonProperty("localadmin_gid")
    public String getLocaladminGid() {
        return localadminGid;
    }

    @JsonProperty("localadmin_gid")
    public void setLocaladminGid(String localadminGid) {
        this.localadminGid = localadminGid;
    }

    @JsonProperty("locality")
    public String getLocality() {
        return locality;
    }

    @JsonProperty("locality")
    public void setLocality(String locality) {
        this.locality = locality;
    }

    @JsonProperty("locality_gid")
    public String getLocalityGid() {
        return localityGid;
    }

    @JsonProperty("locality_gid")
    public void setLocalityGid(String localityGid) {
        this.localityGid = localityGid;
    }

    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("addendum")
    public Addendum getAddendum() {
        return addendum;
    }

    @JsonProperty("addendum")
    public void setAddendum(Addendum addendum) {
        this.addendum = addendum;
    }

    @JsonProperty("confidence")
    public Double getConfidence() {
        return confidence;
    }

    @JsonProperty("confidence")
    public void setConfidence(Double confidence) {
        this.confidence = confidence;
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
