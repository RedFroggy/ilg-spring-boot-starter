package fr.redfroggy.ilg.client.site;

import com.fasterxml.jackson.annotation.JsonProperty;
import fr.redfroggy.ilg.client.Pagination;
import fr.redfroggy.ilg.client.Sorting;

import java.util.List;

public interface SitesProjection {
    @JsonProperty("@pagination")
    Pagination getPagination();

    @JsonProperty("@sorting")
    Sorting getSorting();

    /**
     * @return sites
     */
    @JsonProperty("sites")
    List<? extends SiteProjection5> getSites();
}
