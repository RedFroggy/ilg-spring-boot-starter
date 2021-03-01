/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package fr.redfroggy.ilg.client.openapi.api;

import fr.redfroggy.ilg.client.openapi.model.Error400Model;
import fr.redfroggy.ilg.client.openapi.model.Error401Model;
import fr.redfroggy.ilg.client.openapi.model.Error403Model;
import fr.redfroggy.ilg.client.openapi.model.ErrorModel;
import fr.redfroggy.ilg.client.openapi.model.Ratios2;
import fr.redfroggy.ilg.client.openapi.model.Score3;
import fr.redfroggy.ilg.client.openapi.model.StatActivity;
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
@Api(value = "Stats", description = "the Stats API")
public interface StatsApi {

    /**
     * GET /stats/activity/{id} : Return Statistics on Activity segment
     *
     * @param id Activity Code (required)
     * @return  (status code 200)
     *         or Bad Request (status code 400)
     *         or Authentication Failure: Expired Token or Invalid Token (status code 401)
     *         or Forbidden (status code 403)
     *         or Resource not found (status code 404)
     */
    @ApiOperation(value = "Return Statistics on Activity segment", nickname = "statsActivityIdGet", notes = "", response = StatActivity.class, authorizations = {
        @Authorization(value = "Bearer")
    }, tags={ "Stats", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = StatActivity.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error400Model.class),
        @ApiResponse(code = 401, message = "Authentication Failure: Expired Token or Invalid Token", response = Error401Model.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error403Model.class),
        @ApiResponse(code = 404, message = "Resource not found", response = ErrorModel.class) })
    @RequestMapping(value = "/stats/activity/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<StatActivity> statsActivityIdGet(@ApiParam(value = "Activity Code",required=true) @PathVariable("id") String id);


    /**
     * GET /stats/activity/{id}/ratios : Return Ratios Statistics on Activity segment
     *
     * @param id Activity Code (required)
     * @return  (status code 200)
     *         or Bad Request (status code 400)
     *         or Authentication Failure: Expired Token or Invalid Token (status code 401)
     *         or Forbidden (status code 403)
     *         or Resource not found (status code 404)
     */
    @ApiOperation(value = "Return Ratios Statistics on Activity segment", nickname = "statsActivityIdRatiosGet", notes = "", response = Ratios2.class, authorizations = {
        @Authorization(value = "Bearer")
    }, tags={ "Stats", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Ratios2.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error400Model.class),
        @ApiResponse(code = 401, message = "Authentication Failure: Expired Token or Invalid Token", response = Error401Model.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error403Model.class),
        @ApiResponse(code = 404, message = "Resource not found", response = ErrorModel.class) })
    @RequestMapping(value = "/stats/activity/{id}/ratios",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<Ratios2> statsActivityIdRatiosGet(@ApiParam(value = "Activity Code",required=true) @PathVariable("id") String id);


    /**
     * GET /stats/activity/{id}/score : Return Score Statistics on Activity segment
     *
     * @param id Activity Code (required)
     * @return  (status code 200)
     *         or Bad Request (status code 400)
     *         or Authentication Failure: Expired Token or Invalid Token (status code 401)
     *         or Forbidden (status code 403)
     *         or Resource not found (status code 404)
     */
    @ApiOperation(value = "Return Score Statistics on Activity segment", nickname = "statsActivityIdScoreGet", notes = "", response = Score3.class, authorizations = {
        @Authorization(value = "Bearer")
    }, tags={ "Stats", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Score3.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error400Model.class),
        @ApiResponse(code = 401, message = "Authentication Failure: Expired Token or Invalid Token", response = Error401Model.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error403Model.class),
        @ApiResponse(code = 404, message = "Resource not found", response = ErrorModel.class) })
    @RequestMapping(value = "/stats/activity/{id}/score",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<Score3> statsActivityIdScoreGet(@ApiParam(value = "Activity Code",required=true) @PathVariable("id") String id);

}