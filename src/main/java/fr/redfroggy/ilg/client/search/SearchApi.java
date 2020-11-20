package fr.redfroggy.ilg.client.search;

import io.swagger.annotations.Api;
import javax.validation.constraints.Pattern;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;

@Validated
@Api(value = "Search")
public interface SearchApi {

    /**
     * POST /companies/{country}/search/companies : Search companies
     *
     * Request search params :
     *
     * - vatNumber VAT number (international use only) (optional)
     * - simpleSearch General search, can only be used alone (optional)
     * - eirl Only search against individual limited companies (optional)
     * - siege Company is headquarter (optional)
     * - actif Company is active (optional)
     * - societeNom Company name (optional)
     * - societeNaf Company activity code (optional)
     * - societeCodePostal Company postal code (optional)
     * - societeNumVoie Company number in street (optional)
     * - societeRue Company street (optional)
     * - societeVille Company city (optional)
     * - societeRegion Company region (optional)
     * - societeDepartement Company departement (optional)
     *
     * @param country Country Code in ISO 3166-2 (required)
     * @param searchParam the search params
     * @param limit Limit the number of result (optional)
     * @return  (status code 200)
     *         or Bad Request (status code 400)
     *         or Authentication Failure: Expired Token or Invalid Token (status code 401)
     *         or Forbidden (status code 403)
     *         or Resource not found (status code 404)
     */
    ResponseEntity<CompanySearchGeneric> searchCompanies(@Pattern(regexp="^[A-Za-z]{2}$") String country,
                                                         CompanySearchRequestParam searchParam, Integer limit);

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
