package fr.redfroggy.ilg.client.site;

import fr.redfroggy.ilg.client.IlgApi;
import org.springframework.http.ResponseEntity;


public interface SiteApi extends IlgApi {

    /**
     * GET /companies/{country}/{id}/sites : Return the site list for a company
     * This service is @Paginable, @Filterable, @Sortable and @Searchable.
     * <p>
     * Warn,  @Filterable ilg api not working
     *
     * @param country      Country Code in ISO 3166-2 (required)
     * @param id           Unique identifier representing a specific company (required)
     * @param requestParam requestParam @Paginable, @Sortable and @Searchable
     * @return (status code 200)
     * or Bad Request (status code 400)
     * or Authentication Failure: Expired Token or Invalid Token (status code 401)
     * or Forbidden (status code 403)
     * or Resource not found (status code 404)
     */
    ResponseEntity<SitesProjection> getSites(String country, String id, SiteRequest requestParam);

    /**
     * GET /companies/{country}/{id}/sites : Return the site list for a company
     *
     * @param country Country Code in ISO 3166-2 (required)
     * @param id      Unique identifier representing a specific company (required)
     * @return (status code 200)
     * or Bad Request (status code 400)
     * or Authentication Failure: Expired Token or Invalid Token (status code 401)
     * or Forbidden (status code 403)
     * or Resource not found (status code 404)
     */
    ResponseEntity<SitesProjection> getSites(String country, String id);


    /**
     * GET /companies/{country}/{id}/sites/{sid} : Return a specific site
     *
     * @param country Country Code in ISO 3166-2 (required)
     * @param id      Unique identifier representing a specific company (required)
     * @param sid     Unique identifier representing a specific site of the company (required)
     * @return (status code 200)
     * or Bad Request (status code 400)
     * or Authentication Failure: Expired Token or Invalid Token (status code 401)
     * or Forbidden (status code 403)
     * or Resource not found (status code 404)
     */
    ResponseEntity<SiteProjection> getSite(
            String country,
            String id,
            String sid);

}
