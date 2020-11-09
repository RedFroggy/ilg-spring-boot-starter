package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import fr.redfroggy.ilg.client.Pagination;
import fr.redfroggy.ilg.client.Sorting;
import fr.redfroggy.ilg.client.site.SitesProjection;

import java.util.List;

/**
 * Sites
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Sites implements SitesProjection {

    private final Pagination pagination;
    private final Sorting sorting;
    private final List<Site> sites;

    public Sites(@JsonProperty("@pagination") Pagination pagination,
                 @JsonProperty("@sorting") Sorting sorting,
                 @JsonProperty("sites") List<Site> sites) {
        this.pagination = pagination;
        this.sorting = sorting;
        this.sites = sites;
    }

    @Override
    @JsonProperty("@pagination")
    public Pagination getPagination() {
        return pagination;
    }

    @Override
    @JsonProperty("@sorting")
    public Sorting getSorting() {
        return sorting;
    }

    /**
     * @return sites
     */
    @Override
    @JsonProperty("sites")
    public List<? extends Site> getSites() {
        return sites;
    }

}

