package fr.redfroggy.ilg.client.search;

import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;

@Validated
@Api(value = "Search")
public interface SearchApi {

    /**
     * POST /companies/{country}/sites/search : Search a site
     * search in :
     * - name                      Company/Site name (optional)
     * - street                    Company/Site street name (Only available in France) (optional)
     * - zipCode                   Company/Site address zip code (Only available in France) (optional)
     * - city                      Company/Site city (optional)
     * - phone                     Company/Site street phone number (Only available in France) (optional)
     * - companyRegistrationNumber Company registration number (Only available in France) (optional)
     * - registrationNumber        Site registration number (optional)
     *
     * @param country                   Country Code in ISO 3166-2 (required)
     * @param search search request
     * @param limit                     Limit search result (optional)
     * @return (status code 200)
     * or Bad Request (status code 400)
     * or Authentication Failure: Expired Token or Invalid Token (status code 401)
     * or Forbidden (status code 403)
     * or Resource not found (status code 404)
     */
    ResponseEntity<SiteSearch> searchSites(String country, SiteSearchRequest search, Integer limit);
}
