package fr.redfroggy.ilg.spring.boot.autoconfigure.client;

import fr.redfroggy.ilg.client.events.EventDetailProjection;
import fr.redfroggy.ilg.client.events.EventRequest;
import fr.redfroggy.ilg.client.events.EventsApi;
import fr.redfroggy.ilg.client.events.EventsProjection;
import fr.redfroggy.ilg.client.model.EventDetail;
import fr.redfroggy.ilg.client.model.Events;
import fr.redfroggy.ilg.spring.boot.autoconfigure.IlgRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class EventsApiClient implements EventsApi {

    private final IlgRestTemplate client;

    public EventsApiClient(IlgRestTemplate client) {
        this.client = client;
    }

    @Override
    public ResponseEntity<EventsProjection> getEvents(String country, String id, EventRequest requestParam) {
        Assert.hasText(country, "Get events cannot execute without country");
        Assert.hasText(id, "Get events cannot execute without company id");

        UriComponentsBuilder uriBuilder = client.absoluteCompanyUriBuilder("/events");
        if (requestParam != null) {
            uriBuilder.queryParams(requestParam.toQueryParams());
        }
        return (ResponseEntity) client.getForEntity(uriBuilder.buildAndExpand(country, id).toUri(), Events.class);
    }

    @Override
    public ResponseEntity<EventsProjection> getEvents(String country, String id) {
        return getEvents(country, id, null);
    }

    @Override
    public ResponseEntity<EventDetailProjection> getEvent(String id) {
        Assert.hasText(id, "Get event cannot execute without event id");
        UriComponentsBuilder uriBuilder = client.absoluteUriBuilder("/event/{id}");

        return (ResponseEntity)client.getForEntity(uriBuilder.buildAndExpand(id).toUri(), EventDetail.class);
    }
}
