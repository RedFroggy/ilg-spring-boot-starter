package fr.redfroggy.ilg.client.search;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * SiteSearch
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SiteSearch {

    private final List<? extends SiteProjection4> sites;

    private final Integer count;

    private final Integer found;

    public SiteSearch(@JsonProperty("sites") List<? extends SiteProjection4> sites,
                      @JsonProperty("count") Integer count,
                      @JsonProperty("found") Integer found) {
        this.sites = sites;
        this.count = count;
        this.found = found;
    }

    /**
     * @return sites
     */
    @ApiModelProperty(value = "")
    public List<? extends SiteProjection4> getSites() {
        return sites;
    }

    /**
     * Get count
     *
     * @return count
     */
    @ApiModelProperty(value = "")
    public Integer getCount() {
        return count;
    }

    /**
     * Get found
     *
     * @return found
     */
    @ApiModelProperty(value = "")
    public Integer getFound() {
        return found;
    }

}

