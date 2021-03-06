/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package fr.redfroggy.ilg.client.openapi.api;

import fr.redfroggy.ilg.client.openapi.model.CodeLabelPair;
import fr.redfroggy.ilg.client.openapi.model.Company2;
import fr.redfroggy.ilg.client.openapi.model.Error400Model;
import fr.redfroggy.ilg.client.openapi.model.Error401Model;
import fr.redfroggy.ilg.client.openapi.model.Error403Model;
import fr.redfroggy.ilg.client.openapi.model.ErrorModel;
import fr.redfroggy.ilg.client.openapi.model.Score2;
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
@Api(value = "Personalized", description = "the Personalized API")
public interface PersonalizedApi {

    /**
     * GET /personalized/{country}/{id}/category : Returns personalized category data
     *
     * @param id Unique identifier representing a specific company (required)
     * @param country Country Code in ISO 3166-2 (required)
     * @return  (status code 200)
     *         or Bad Request (status code 400)
     *         or Authentication Failure: Expired Token or Invalid Token (status code 401)
     *         or Forbidden (status code 403)
     *         or Resource not found (status code 404)
     */
    @ApiOperation(value = "Returns personalized category data", nickname = "personalizedCountryIdCategoryGet", notes = "", response = CodeLabelPair.class, authorizations = {
        @Authorization(value = "Bearer")
    }, tags={ "Personalized", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = CodeLabelPair.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error400Model.class),
        @ApiResponse(code = 401, message = "Authentication Failure: Expired Token or Invalid Token", response = Error401Model.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error403Model.class),
        @ApiResponse(code = 404, message = "Resource not found", response = ErrorModel.class) })
    @RequestMapping(value = "/personalized/{country}/{id}/category",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<CodeLabelPair> personalizedCountryIdCategoryGet(@ApiParam(value = "Unique identifier representing a specific company",required=true) @PathVariable("id") String id,@Pattern(regexp="^[A-Za-z]{2}$") @ApiParam(value = "Country Code in ISO 3166-2",required=true) @PathVariable("country") String country);


    /**
     * GET /personalized/{country}/{id} : Returns personalized company data
     *
     * @param id Unique identifier representing a specific company (required)
     * @param country Country Code in ISO 3166-2 (required)
     * @return  (status code 200)
     *         or Bad Request (status code 400)
     *         or Authentication Failure: Expired Token or Invalid Token (status code 401)
     *         or Forbidden (status code 403)
     *         or Resource not found (status code 404)
     */
    @ApiOperation(value = "Returns personalized company data", nickname = "personalizedCountryIdGet", notes = "", response = Company2.class, authorizations = {
        @Authorization(value = "Bearer")
    }, tags={ "Personalized", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Company2.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error400Model.class),
        @ApiResponse(code = 401, message = "Authentication Failure: Expired Token or Invalid Token", response = Error401Model.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error403Model.class),
        @ApiResponse(code = 404, message = "Resource not found", response = ErrorModel.class) })
    @RequestMapping(value = "/personalized/{country}/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<Company2> personalizedCountryIdGet(@ApiParam(value = "Unique identifier representing a specific company",required=true) @PathVariable("id") String id,@Pattern(regexp="^[A-Za-z]{2}$") @ApiParam(value = "Country Code in ISO 3166-2",required=true) @PathVariable("country") String country);


    /**
     * GET /personalized/{country}/{id}/score : Returns personalized score data
     *
     * @param id Unique identifier representing a specific company (required)
     * @param country Country Code in ISO 3166-2 (required)
     * @return  (status code 200)
     *         or Bad Request (status code 400)
     *         or Authentication Failure: Expired Token or Invalid Token (status code 401)
     *         or Forbidden (status code 403)
     *         or Resource not found (status code 404)
     */
    @ApiOperation(value = "Returns personalized score data", nickname = "personalizedCountryIdScoreGet", notes = "", response = Score2.class, authorizations = {
        @Authorization(value = "Bearer")
    }, tags={ "Personalized", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Score2.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error400Model.class),
        @ApiResponse(code = 401, message = "Authentication Failure: Expired Token or Invalid Token", response = Error401Model.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error403Model.class),
        @ApiResponse(code = 404, message = "Resource not found", response = ErrorModel.class) })
    @RequestMapping(value = "/personalized/{country}/{id}/score",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<Score2> personalizedCountryIdScoreGet(@ApiParam(value = "Unique identifier representing a specific company",required=true) @PathVariable("id") String id,@Pattern(regexp="^[A-Za-z]{2}$") @ApiParam(value = "Country Code in ISO 3166-2",required=true) @PathVariable("country") String country);

}
