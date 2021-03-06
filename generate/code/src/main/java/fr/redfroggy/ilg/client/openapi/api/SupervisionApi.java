/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package fr.redfroggy.ilg.client.openapi.api;

import fr.redfroggy.ilg.client.openapi.model.Error304Model;
import fr.redfroggy.ilg.client.openapi.model.Error400Model;
import fr.redfroggy.ilg.client.openapi.model.Error401Model;
import fr.redfroggy.ilg.client.openapi.model.Error403Model;
import fr.redfroggy.ilg.client.openapi.model.ErrorModel;
import fr.redfroggy.ilg.client.openapi.model.Supervisions;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Validated
@Api(value = "Supervision", description = "the Supervision API")
public interface SupervisionApi {

    /**
     * DELETE /companies/{country}/{id}/supervision : Unset a company supervision
     *
     * @param id Unique identifier representing a specific company (required)
     * @param country Country Code in ISO 3166-2 (required)
     * @param alertType Array of alert type (score|event) (required)
     * @param email Recipient of the supervision (required)
     * @return Supervision has been deleted (status code 204)
     *         or Bad Request (status code 400)
     *         or Authentication Failure: Expired Token or Invalid Token (status code 401)
     *         or Forbidden (status code 403)
     *         or Resource not found (status code 404)
     */
    @ApiOperation(value = "Unset a company supervision", nickname = "companiesCountryIdSupervisionDelete", notes = "", authorizations = {
        @Authorization(value = "Bearer")
    }, tags={ "Supervision", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Supervision has been deleted"),
        @ApiResponse(code = 400, message = "Bad Request", response = Error400Model.class),
        @ApiResponse(code = 401, message = "Authentication Failure: Expired Token or Invalid Token", response = Error401Model.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error403Model.class),
        @ApiResponse(code = 404, message = "Resource not found", response = ErrorModel.class) })
    @RequestMapping(value = "/companies/{country}/{id}/supervision",
        produces = "*/*", 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> companiesCountryIdSupervisionDelete(@ApiParam(value = "Unique identifier representing a specific company",required=true) @PathVariable("id") String id,@Pattern(regexp="^[A-Za-z]{2}$") @ApiParam(value = "Country Code in ISO 3166-2",required=true) @PathVariable("country") String country,@NotNull @ApiParam(value = "Array of alert type (score|event)", required = true, allowableValues = "event, score") @Valid @RequestParam(value = "alertType[]", required = true) List<String> alertType,@NotNull @ApiParam(value = "Recipient of the supervision", required = true) @Valid @RequestParam(value = "email", required = true) String email);


    /**
     * POST /companies/{country}/{id}/supervision : Set a company supervision
     * This service consumes either a form or a json document, see [Remove supervision](#operations,delete-/companies/{country}/{id}/supervision,Supervision) for json format
     *
     * @param id Unique identifier representing a specific company (required)
     * @param country Country Code in ISO 3166-2 (required)
     * @param alertType Array of alert type (score|event) (required)
     * @param email Recipient of the supervision (required)
     * @param customCode Custom code to assign to supervision (optional)
     * @param customCredit Custom credit allowed to company (optional)
     * @return Supervision has been created (status code 201)
     *         or Company was already in supervision for an email (status code 304)
     *         or Bad Request (status code 400)
     *         or Authentication Failure: Expired Token or Invalid Token (status code 401)
     *         or Forbidden (status code 403)
     *         or Resource not found (status code 404)
     */
    @ApiOperation(value = "Set a company supervision", nickname = "companiesCountryIdSupervisionPost", notes = "This service consumes either a form or a json document, see [Remove supervision](#operations,delete-/companies/{country}/{id}/supervision,Supervision) for json format", authorizations = {
        @Authorization(value = "Bearer")
    }, tags={ "Supervision", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Supervision has been created"),
        @ApiResponse(code = 304, message = "Company was already in supervision for an email", response = Error304Model.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error400Model.class),
        @ApiResponse(code = 401, message = "Authentication Failure: Expired Token or Invalid Token", response = Error401Model.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error403Model.class),
        @ApiResponse(code = 404, message = "Resource not found", response = ErrorModel.class) })
    @RequestMapping(value = "/companies/{country}/{id}/supervision",
        produces = "*/*", 
        consumes = "multipart/form-data",
        method = RequestMethod.POST)
    ResponseEntity<Void> companiesCountryIdSupervisionPost(@ApiParam(value = "Unique identifier representing a specific company",required=true) @PathVariable("id") String id,@Pattern(regexp="^[A-Za-z]{2}$") @ApiParam(value = "Country Code in ISO 3166-2",required=true) @PathVariable("country") String country,@ApiParam(value = "Array of alert type (score|event)", required=true , allowableValues="{enumVars=[{name=EVENT, isString=true, value="event"}, {name=SCORE, isString=true, value="score"}], values=[event, score]}") @RequestParam(value="alertType[]", required=true)  List<String> alertType,@ApiParam(value = "Recipient of the supervision", required=true ) @RequestParam(value="email", required=true)  String email,@ApiParam(value = "Custom code to assign to supervision" ) @RequestParam(value="customCode", required=false)  String customCode,@ApiParam(value = "Custom credit allowed to company" ) @RequestParam(value="customCredit", required=false)  String customCredit);


    /**
     * GET /companies/{country}/supervision/{email} : List supervision
     *
     * @param country Country Code in ISO 3166-2 (required)
     * @param email Supervision recipient email (required)
     * @return List of active supervision (status code 200)
     *         or Bad Request (status code 400)
     *         or Authentication Failure: Expired Token or Invalid Token (status code 401)
     *         or Forbidden (status code 403)
     *         or Resource not found (status code 404)
     */
    @ApiOperation(value = "List supervision", nickname = "companiesCountrySupervisionEmailGet", notes = "", response = Supervisions.class, authorizations = {
        @Authorization(value = "Bearer")
    }, tags={ "Supervision", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of active supervision", response = Supervisions.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error400Model.class),
        @ApiResponse(code = 401, message = "Authentication Failure: Expired Token or Invalid Token", response = Error401Model.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error403Model.class),
        @ApiResponse(code = 404, message = "Resource not found", response = ErrorModel.class) })
    @RequestMapping(value = "/companies/{country}/supervision/{email}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<Supervisions> companiesCountrySupervisionEmailGet(@Pattern(regexp="^[A-Za-z]{2}$") @ApiParam(value = "Country Code in ISO 3166-2",required=true) @PathVariable("country") String country,@ApiParam(value = "Supervision recipient email",required=true) @PathVariable("email") String email);

}
