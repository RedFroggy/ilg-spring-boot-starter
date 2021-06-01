/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package fr.redfroggy.ilg.client.legalinformation;

import fr.redfroggy.ilg.client.Sorting;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Pattern;
import java.time.LocalDate;

@Validated
public interface LegalInformationApi {

    /**
     * GET /companies/{country}/{id}/legal/deposits/{depositId} : Get legal deposit files as PDF
     *
     * @param country Country Code in ISO 3166-2 (required)
     * @param id Unique identifier representing a specific company (required)
     * @param depositId Document id, can be found in deposit list (required)
     * @return PDF Datastream (status code 200)
     *         or Bad Request (status code 400)
     *         or Authentication Failure: Expired Token or Invalid Token (status code 401)
     *         or Forbidden (status code 403)
     *         or Resource not found (status code 404)
     */
    ResponseEntity<Void> downloadLegalDeposit(@Pattern(regexp="^[A-Za-z]{2}$") String country, String id,
                                              @Pattern(regexp="^[A-Za-z]{2}$") String depositId);


    /**
     * GET /companies/{country}/{id}/legal/deposits : List of legal file deposit
     *
     * @param country Country Code in ISO 3166-2 (required)
     * @param id Unique identifier representing a specific company (required)
     * @return  (status code 200)
     *         or Bad Request (status code 400)
     *         or Authentication Failure: Expired Token or Invalid Token (status code 401)
     *         or Forbidden (status code 403)
     *         or Resource not found (status code 404)
     */

    ResponseEntity<LegalDepositList> getLegalDeposits(@Pattern(regexp="^[A-Za-z]{2}$") String country, String id);


    /**
     * GET /companies/{country}/{id}/legal : All legal information
     *
     * Sorting:
     * - column Column name in JSONPath format (start with &#39;$.&#39;) for sorting (optional)
     * - order Sorting order, &#39;asc&#39; or &#39;desc&#39; (optional)
     *
     * @param country Country Code in ISO 3166-2 (required)
     * @param id Unique identifier representing a specific company (required)
     * @param sorting Sorting request params
     * @return Legal information (status code 200)
     *         or Bad Request (status code 400)
     *         or Authentication Failure: Expired Token or Invalid Token (status code 401)
     *         or Forbidden (status code 403)
     *         or Resource not found (status code 404)
     */
    ResponseEntity<Legal> getLegal(@Pattern(regexp="^[A-Za-z]{2}$") String country, String id, Sorting sorting);


    /**
     * GET /companies/{country}/{id}/legal/status : Get legal status as PDF
     *
     * @param country Country Code in ISO 3166-2 (required)
     * @param id Unique identifier representing a specific company (required)
     * @param date Date of the last status update, can be found in deposit list (optional)
     * @return PDF Datastream (status code 200)
     *         or Bad Request (status code 400)
     *         or Authentication Failure: Expired Token or Invalid Token (status code 401)
     *         or Forbidden (status code 403)
     *         or Resource not found (status code 404)
     */
    ResponseEntity<Void> downloadLegalStatus(@Pattern(regexp="^[A-Za-z]{2}$") String country, String id, LocalDate date);

}