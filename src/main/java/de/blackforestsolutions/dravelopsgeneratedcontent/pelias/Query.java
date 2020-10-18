
package de.blackforestsolutions.dravelopsgeneratedcontent.pelias;

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
    "text",
    "parser",
    "parsed_text",
    "point.lat",
    "point.lon",
    "boundary.circle.lat",
    "boundary.circle.lon",
    "size",
    "layers",
    "private",
    "focus.point.lat",
    "focus.point.lon",
    "lang",
    "querySize"
})
public class Query implements Serializable
{

    @JsonProperty("text")
    private String text;
    @JsonProperty("parser")
    private String parser;
    @JsonProperty("parsed_text")
    private ParsedText parsedText;
    @JsonProperty("point.lat")
    private Double pointLat;
    @JsonProperty("point.lon")
    private Double pointLon;
    @JsonProperty("boundary.circle.lat")
    private Double boundaryCircleLat;
    @JsonProperty("boundary.circle.lon")
    private Double boundaryCircleLon;
    @JsonProperty("size")
    private Long size;
    @JsonProperty("layers")
    private List<String> layers = null;
    @JsonProperty("private")
    private Boolean _private;
    @JsonProperty("focus.point.lat")
    private Double focusPointLat;
    @JsonProperty("focus.point.lon")
    private Double focusPointLon;
    @JsonProperty("lang")
    private Lang lang;
    @JsonProperty("querySize")
    private Long querySize;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 9088643076004403777L;

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("parser")
    public String getParser() {
        return parser;
    }

    @JsonProperty("parser")
    public void setParser(String parser) {
        this.parser = parser;
    }

    @JsonProperty("parsed_text")
    public ParsedText getParsedText() {
        return parsedText;
    }

    @JsonProperty("parsed_text")
    public void setParsedText(ParsedText parsedText) {
        this.parsedText = parsedText;
    }

    @JsonProperty("point.lat")
    public Double getPointLat() {
        return pointLat;
    }

    @JsonProperty("point.lat")
    public void setPointLat(Double pointLat) {
        this.pointLat = pointLat;
    }

    @JsonProperty("point.lon")
    public Double getPointLon() {
        return pointLon;
    }

    @JsonProperty("point.lon")
    public void setPointLon(Double pointLon) {
        this.pointLon = pointLon;
    }

    @JsonProperty("boundary.circle.lat")
    public Double getBoundaryCircleLat() {
        return boundaryCircleLat;
    }

    @JsonProperty("boundary.circle.lat")
    public void setBoundaryCircleLat(Double boundaryCircleLat) {
        this.boundaryCircleLat = boundaryCircleLat;
    }

    @JsonProperty("boundary.circle.lon")
    public Double getBoundaryCircleLon() {
        return boundaryCircleLon;
    }

    @JsonProperty("boundary.circle.lon")
    public void setBoundaryCircleLon(Double boundaryCircleLon) {
        this.boundaryCircleLon = boundaryCircleLon;
    }

    @JsonProperty("size")
    public Long getSize() {
        return size;
    }

    @JsonProperty("size")
    public void setSize(Long size) {
        this.size = size;
    }

    @JsonProperty("layers")
    public List<String> getLayers() {
        return layers;
    }

    @JsonProperty("layers")
    public void setLayers(List<String> layers) {
        this.layers = layers;
    }

    @JsonProperty("private")
    public Boolean getPrivate() {
        return _private;
    }

    @JsonProperty("private")
    public void setPrivate(Boolean _private) {
        this._private = _private;
    }

    @JsonProperty("focus.point.lat")
    public Double getFocusPointLat() {
        return focusPointLat;
    }

    @JsonProperty("focus.point.lat")
    public void setFocusPointLat(Double focusPointLat) {
        this.focusPointLat = focusPointLat;
    }

    @JsonProperty("focus.point.lon")
    public Double getFocusPointLon() {
        return focusPointLon;
    }

    @JsonProperty("focus.point.lon")
    public void setFocusPointLon(Double focusPointLon) {
        this.focusPointLon = focusPointLon;
    }

    @JsonProperty("lang")
    public Lang getLang() {
        return lang;
    }

    @JsonProperty("lang")
    public void setLang(Lang lang) {
        this.lang = lang;
    }

    @JsonProperty("querySize")
    public Long getQuerySize() {
        return querySize;
    }

    @JsonProperty("querySize")
    public void setQuerySize(Long querySize) {
        this.querySize = querySize;
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
