/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.1-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package fr.redfroggy.ilg.client.events;

import fr.redfroggy.ilg.client.IlgApi;
import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;

@Validated
@Api(value = "Events", description = "the Events API")
public interface EventsApi extends IlgApi {

    /**
     * GET /companies/{country}/{id}/events : Return all events for a company. Return the 20 last events, result can be paginated and filtered
     *
     * @param id Unique identifier representing a specific company (required)
     * @param country Country Code in ISO 3166-2 (required)
     * @param requestParam requestParam @Paginable, @Sortable and @Filterable
     * @return List of events related to the company (status code 200)
     *         or Bad Request (status code 400)
     *         or Authentication Failure: Expired Token or Invalid Token (status code 401)
     *         or Forbidden (status code 403)
     *         or Resource not found (status code 404)
     */
    ResponseEntity<EventsProjection> getEvents(String country, String id, EventRequest requestParam);


    /**
     * GET /companies/{country}/{id}/events : Return all events for a company. Return the 20 last events
     *
     * @param id Unique identifier representing a specific company (required)
     * @param country Country Code in ISO 3166-2 (required)
     * @return List of events related to the company (status code 200)
     *         or Bad Request (status code 400)
     *         or Authentication Failure: Expired Token or Invalid Token (status code 401)
     *         or Forbidden (status code 403)
     *         or Resource not found (status code 404)
     */
    ResponseEntity<EventsProjection> getEvents(String country, String id);


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
    ResponseEntity<EventDetailProjection> getEvent(String id);

}