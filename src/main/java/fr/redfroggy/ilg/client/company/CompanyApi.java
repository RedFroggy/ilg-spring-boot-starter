package fr.redfroggy.ilg.client.company;

import fr.redfroggy.ilg.client.IlgApi;
import fr.redfroggy.ilg.client.model.Availability;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
@CacheConfig(cacheNames = "ilgCompanyApi", cacheResolver = "ilgCacheResolver", keyGenerator = "methodKeyGenerator")
public interface CompanyApi extends IlgApi {

    /**
     * GET /companies/{country}/{id}/availability : Return which data are available for a company
     * True when data are available, false otherwise, null if you can not access data
     *
     * @param country Country Code in ISO 3166-2 (required)
     * @param id Unique identifier representing a specific company (required)
     * @return  (status code 200)
     *         or Bad Request (status code 400)
     *         or Authentication Failure: Expired Token or Invalid Token (status code 401)
     *         or Forbidden (status code 403)
     *         or Resource not found (status code 404)
     */
    @Cacheable
    ResponseEntity<Availability> getAvailability(String country, String id);

    /**
     * GET /companies/{country}/{id} : Return a company
     *
     * @param country Country Code in ISO 3166-2 (required)
     * @param id Unique identifier representing a specific company (required)
     * @return  (status code 200)
     *         or Bad Request (status code 400)
     *         or Authentication Failure: Expired Token or Invalid Token (status code 401)
     *         or Forbidden (status code 403)
     *         or Resource not found (status code 404)
     */
    @Cacheable
    ResponseEntity<CompanyProjection> getCompany(String country, String id);

    /**
     * GET /companies/{country}/{id}/identity/contact : Return contact information for a given company
     *
     * @param country Country Code in ISO 3166-2 (required)
     * @param id Unique identifier representing a specific company (required)
     * @return  (status code 200)
     *         or Bad Request (status code 400)
     *         or Authentication Failure: Expired Token or Invalid Token (status code 401)
     *         or Forbidden (status code 403)
     *         or Resource not found (status code 404)
     */
    @Cacheable
    ResponseEntity<ContactProjection> getIdentityContact(String country, String id);

    /**
     * GET /companies/{country}/{id}/identity : Return identity card of a company
     *
     * @param country Country Code in ISO 3166-2 (required)
     * @param id Unique identifier representing a specific company (required)
     * @return  (status code 200)
     *         or Bad Request (status code 400)
     *         or Authentication Failure: Expired Token or Invalid Token (status code 401)
     *         or Forbidden (status code 403)
     *         or Resource not found (status code 404)
     */
    @Cacheable
    ResponseEntity<IdentityProjection> getIdentity(String country, String id);

    /**
     * GET /companies/{country}/{id}/mandataire : Return the company legal representative
     *
     * @param country Country Code in ISO 3166-2 (required)
     * @param id Unique identifier representing a specific company (required)
     * @return  (status code 200)
     *         or Bad Request (status code 400)
     *         or Authentication Failure: Expired Token or Invalid Token (status code 401)
     *         or Forbidden (status code 403)
     *         or Resource not found (status code 404)
     */
    @Cacheable
    ResponseEntity<ExecutiveProjection> getMandataire(String country, String id);

    /**
     * GET /companies/{country}/{id}/identity/workforce : Return workforce of a company
     *
     * @param country Country Code in ISO 3166-2 (required)
     * @param id Unique identifier representing a specific company (required)
     * @return  (status code 200)
     *         or Bad Request (status code 400)
     *         or Authentication Failure: Expired Token or Invalid Token (status code 401)
     *         or Forbidden (status code 403)
     *         or Resource not found (status code 404)
     */
    @Cacheable
    ResponseEntity<WorkforceProjection> getIdentityWorkforce(String country, String id);

    /**
     * GET /companies/{country}/{id}/risk : Return a company risk class
     *
     * @param country Country Code in ISO 3166-2 (required)
     * @param id Unique identifier representing a specific company (required)
     * @return  (status code 200)
     *         or Bad Request (status code 400)
     *         or Authentication Failure: Expired Token or Invalid Token (status code 401)
     *         or Forbidden (status code 403)
     *         or Resource not found (status code 404)
     */
    @Cacheable
    ResponseEntity<RiskProjection> getRisk(String country, String id);

    /**
     * GET /companies/{country}/{id}/score : Return a company score
     *
     * @param country Country Code in ISO 3166-2 (required)
     * @param id Unique identifier representing a specific company (required)
     * @return  (status code 200)
     *         or Bad Request (status code 400)
     *         or Authentication Failure: Expired Token or Invalid Token (status code 401)
     *         or Forbidden (status code 403)
     *         or Resource not found (status code 404)
     */
    @Cacheable
    ResponseEntity<ScoreProjection> getScore(String country, String id);

    /**
     * GET /companies/{country}/{id}/terms : All assignments for the given company
     *
     * @param id Unique identifier representing a specific company (required)
     * @param country Country Code in ISO 3166-2 (required)
     * @return  (status code 200)
     *         or Bad Request (status code 400)
     *         or Authentication Failure: Expired Token or Invalid Token (status code 401)
     *         or Forbidden (status code 403)
     *         or Resource not found (status code 404)
     */
    @Cacheable
    ResponseEntity<ExecutiveTermsProjection> getTerms(String country, String id);

    /**
     * GET /companies/{country}/{id}/terms : All assignments for the given company
     *  request params:
     *      - blockId Unique identifier representing a block (optional)
     *      - positionRole Role representing the type of a membership (optional)
     *      - principal  (optional)
     *      - termsState Filters companies with at least one (true) or no (false) active term of office
     *      (optional)
     *      - ordersStartDate Term of office start date (asc/desc) (optional)
     *
     * @param id Unique identifier representing a specific company (required)
     * @param country Country Code in ISO 3166-2 (required)
     * @param requestParam request params on terms
     * @return  (status code 200)
     *         or Bad Request (status code 400)
     *         or Authentication Failure: Expired Token or Invalid Token (status code 401)
     *         or Forbidden (status code 403)
     *         or Resource not found (status code 404)
     */
    ResponseEntity<ExecutiveTermsProjection> getTerms(String country, String id, TermRequest requestParam);

}
