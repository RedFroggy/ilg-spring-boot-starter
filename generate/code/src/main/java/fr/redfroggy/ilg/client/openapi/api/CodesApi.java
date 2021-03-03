/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package fr.redfroggy.ilg.client.openapi.api;

import fr.redfroggy.ilg.client.openapi.model.City;
import fr.redfroggy.ilg.client.openapi.model.Error400Model;
import fr.redfroggy.ilg.client.openapi.model.Error401Model;
import fr.redfroggy.ilg.client.openapi.model.Error403Model;
import fr.redfroggy.ilg.client.openapi.model.ErrorModel;
import fr.redfroggy.ilg.client.openapi.model.Nafs;
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
@Api(value = "Codes", description = "the Codes API")
public interface CodesApi {

    /**
     * GET /codes/city/{term} : Return the list of cities
     *
     * @param term Term to search (required)
     * @return  (status code 200)
     *         or Bad Request (status code 400)
     *         or Authentication Failure: Expired Token or Invalid Token (status code 401)
     *         or Forbidden (status code 403)
     *         or Resource not found (status code 404)
     */
    @ApiOperation(value = "Return the list of cities", nickname = "codesCityTermGet", notes = "", response = City.class, authorizations = {
        @Authorization(value = "Bearer")
    }, tags={ "Codes", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = City.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error400Model.class),
        @ApiResponse(code = 401, message = "Authentication Failure: Expired Token or Invalid Token", response = Error401Model.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error403Model.class),
        @ApiResponse(code = 404, message = "Resource not found", response = ErrorModel.class) })
    @RequestMapping(value = "/codes/city/{term}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<City> codesCityTermGet(@ApiParam(value = "Term to search",required=true) @PathVariable("term") String term);


    /**
     * GET /nafs/ : Return the list of activity codes
     *
     * @return  (status code 200)
     *         or Bad Request (status code 400)
     *         or Authentication Failure: Expired Token or Invalid Token (status code 401)
     *         or Forbidden (status code 403)
     *         or Resource not found (status code 404)
     */
    @ApiOperation(value = "Return the list of activity codes", nickname = "nafsGet", notes = "", response = Nafs.class, authorizations = {
        @Authorization(value = "Bearer")
    }, tags={ "Codes", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Nafs.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error400Model.class),
        @ApiResponse(code = 401, message = "Authentication Failure: Expired Token or Invalid Token", response = Error401Model.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error403Model.class),
        @ApiResponse(code = 404, message = "Resource not found", response = ErrorModel.class) })
    @RequestMapping(value = "/nafs/",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<Nafs> nafsGet();

}
