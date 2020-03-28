
package pl.pawel.newsapp.model;

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
        "uri",
        "url",
        "id",
        "asset_id",
        "source",
        "published_date",
        "updated",
        "section",
        "subsection",
        "nytdsection",
        "adx_keywords",
        "column",
        "byline",
        "type",
        "title",
        "abstract",
        "des_facet",
        "org_facet",
        "per_facet",
        "geo_facet",
        "media",
        "eta_id"
})
public class Result {

    @JsonProperty("uri")
    private String uri;
    @JsonProperty("url")
    private String url;
    @JsonProperty("id")
    private long id;
    @JsonProperty("asset_id")
    private long assetId;
    @JsonProperty("source")
    private String source;
    @JsonProperty("published_date")
    private String publishedDate;
    @JsonProperty("updated")
    private String updated;
    @JsonProperty("section")
    private String section;
    @JsonProperty("subsection")
    private String subsection;
    @JsonProperty("nytdsection")
    private String nytdsection;
    @JsonProperty("adx_keywords")
    private String adxKeywords;
    @JsonProperty("column")
    private Object column;
    @JsonProperty("byline")
    private String byline;
    @JsonProperty("type")
    private String type;
    @JsonProperty("title")
    private String title;
    @JsonProperty("abstract")
    private String _abstract;
    @JsonProperty("eta_id")
    private long etaId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Result() {
    }

    public Result(String title) {
        this.title = title;
    }


    public Result(long id, String url, String title) {
        this.id = id;
        this.url = url;
        this.title = title;
    }

    @JsonProperty("uri")
    public String getUri() {
        return uri;
    }

    @JsonProperty("uri")
    public void setUri(String uri) {
        this.uri = uri;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("id")
    public long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(long id) {
        this.id = id;
    }

    @JsonProperty("asset_id")
    public long getAssetId() {
        return assetId;
    }

    @JsonProperty("asset_id")
    public void setAssetId(long assetId) {
        this.assetId = assetId;
    }

    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    @JsonProperty("published_date")
    public String getPublishedDate() {
        return publishedDate;
    }

    @JsonProperty("published_date")
    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    @JsonProperty("updated")
    public String getUpdated() {
        return updated;
    }

    @JsonProperty("updated")
    public void setUpdated(String updated) {
        this.updated = updated;
    }

    @JsonProperty("section")
    public String getSection() {
        return section;
    }

    @JsonProperty("section")
    public void setSection(String section) {
        this.section = section;
    }

    @JsonProperty("subsection")
    public String getSubsection() {
        return subsection;
    }

    @JsonProperty("subsection")
    public void setSubsection(String subsection) {
        this.subsection = subsection;
    }

    @JsonProperty("nytdsection")
    public String getNytdsection() {
        return nytdsection;
    }

    @JsonProperty("nytdsection")
    public void setNytdsection(String nytdsection) {
        this.nytdsection = nytdsection;
    }

    @JsonProperty("adx_keywords")
    public String getAdxKeywords() {
        return adxKeywords;
    }

    @JsonProperty("adx_keywords")
    public void setAdxKeywords(String adxKeywords) {
        this.adxKeywords = adxKeywords;
    }

    @JsonProperty("column")
    public Object getColumn() {
        return column;
    }

    @JsonProperty("column")
    public void setColumn(Object column) {
        this.column = column;
    }

    @JsonProperty("byline")
    public String getByline() {
        return byline;
    }

    @JsonProperty("byline")
    public void setByline(String byline) {
        this.byline = byline;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("abstract")
    public String getAbstract() {
        return _abstract;
    }

    @JsonProperty("abstract")
    public void setAbstract(String _abstract) {
        this._abstract = _abstract;
    }


    @JsonProperty("eta_id")
    public long getEtaId() {
        return etaId;
    }

    @JsonProperty("eta_id")
    public void setEtaId(long etaId) {
        this.etaId = etaId;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }


    @Override
    public String toString() {
        return "Result{" +
                "uri='" + uri + '\'' +
                ", url='" + url + '\'' +
                ", id=" + id +
                ", assetId=" + assetId +
                ", source='" + source + '\'' +
                ", publishedDate='" + publishedDate + '\'' +
                ", updated='" + updated + '\'' +
                ", section='" + section + '\'' +
                ", subsection='" + subsection + '\'' +
                ", nytdsection='" + nytdsection + '\'' +
                ", adxKeywords='" + adxKeywords + '\'' +
                ", column=" + column +
                ", byline='" + byline + '\'' +
                ", type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", _abstract='" + _abstract + '\'' +
                '}';
    }
}
