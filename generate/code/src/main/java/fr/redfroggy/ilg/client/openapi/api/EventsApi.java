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
import fr.redfroggy.ilg.client.openapi.model.EventDetail;
import fr.redfroggy.ilg.client.openapi.model.Events;
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
@Api(value = "Events", description = "the Events API")
public interface EventsApi {

    /**
     * GET /companies/{country}/{id}/events : Return all events for a company. Return the 20 last events, result can be paginated and filtered
     *
     * @param id Unique identifier representing a specific company (required)
     * @param country Country Code in ISO 3166-2 (required)
     * @param page Page number (optional)
     * @param number Number of result by page (optional)
     * @param column Column name in JSONPath format (start with &#39;$.&#39;) for sorting (example: &#x60;$.name&#x60;) (optional)
     * @param order Sorting order, &#39;asc&#39; or &#39;desc&#39; (optional)
     * @param filters Filters parameters in format &#x60;{JsonPath},{value}&#x60; (example: &#x60;$.eventCode,1100&#x60;) (optional, default to new ArrayList&lt;&gt;())
     * @return List of events related to the company (status code 200)
     *         or Bad Request (status code 400)
     *         or Authentication Failure: Expired Token or Invalid Token (status code 401)
     *         or Forbidden (status code 403)
     *         or Resource not found (status code 404)
     */
    @ApiOperation(value = "Return all events for a company. Return the 20 last events, result can be paginated and filtered", nickname = "companiesCountryIdEventsGet", notes = "", response = Events.class, authorizations = {
        @Authorization(value = "Bearer")
    }, tags={ "Events", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of events related to the company", response = Events.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error400Model.class),
        @ApiResponse(code = 401, message = "Authentication Failure: Expired Token or Invalid Token", response = Error401Model.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error403Model.class),
        @ApiResponse(code = 404, message = "Resource not found", response = ErrorModel.class) })
    @RequestMapping(value = "/companies/{country}/{id}/events",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<Events> companiesCountryIdEventsGet(@ApiParam(value = "Unique identifier representing a specific company",required=true) @PathVariable("id") String id,@Pattern(regexp="^[A-Za-z]{2}$") @ApiParam(value = "Country Code in ISO 3166-2",required=true) @PathVariable("country") String country,@ApiParam(value = "Page number") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Number of result by page") @Valid @RequestParam(value = "number", required = false) Integer number,@Pattern(regexp="/^\\$\\./") @ApiParam(value = "Column name in JSONPath format (start with '$.') for sorting (example: `$.name`)") @Valid @RequestParam(value = "column", required = false) String column,@ApiParam(value = "Sorting order, 'asc' or 'desc'", allowableValues = "asc, desc") @Valid @RequestParam(value = "order", required = false) String order,@ApiParam(value = "Filters parameters in format `{JsonPath},{value}` (example: `$.eventCode,1100`)") @Valid @RequestParam(value = "filters", required = false) List<String> filters);


    /**
     * GET /event/{id} : Return details for an event
     *
     * @param id Unique identifier representing an event (required)
     * @return  (status code 200)
     *         or Bad Request (status code 400)
     *         or Authentication Failure: Expired Token or Invalid Token (status code 401)
     *         or Forbidden (status code 403)
     *         or Resource not found (status code 404)
     */
    @ApiOperation(value = "Return details for an event", nickname = "eventIdGet", notes = "", response = EventDetail.class, authorizations = {
        @Authorization(value = "Bearer")
    }, tags={ "Events", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = EventDetail.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error400Model.class),
        @ApiResponse(code = 401, message = "Authentication Failure: Expired Token or Invalid Token", response = Error401Model.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error403Model.class),
        @ApiResponse(code = 404, message = "Resource not found", response = ErrorModel.class) })
    @RequestMapping(value = "/event/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<EventDetail> eventIdGet(@ApiParam(value = "Unique identifier representing an event",required=true) @PathVariable("id") String id);

}
