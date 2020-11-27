package fr.redfroggy.ilg.client.events;

import static org.assertj.core.api.Assertions.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import fr.redfroggy.ilg.TestCachingConfiguration;
import fr.redfroggy.ilg.client.ApiClientMockRestTest;
import fr.redfroggy.ilg.client.FiltersRequest;
import fr.redfroggy.ilg.client.PageRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.client.ExpectedCount;

import java.net.URISyntaxException;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {TestCachingConfiguration.class},
        properties = { "ilg.url=http://ilg.fr","ilg.debugging=false","ilg.api-cache.enabled=false"})
public class EventsApiClientMockRestTest extends ApiClientMockRestTest {

    @Autowired
    private EventsApi apiClient;

    @Test
    public void shouldGetIlgEventsWhenRequestIsIlg() throws URISyntaxException,
            JsonProcessingException {
        mockApi("http://ilg.fr/companies/fr/503207896/events", EventsTest.ilg503207896EventsJson());

        ResponseEntity<EventsProjection> response = apiClient.getEvents("fr", "503207896");
        assertThat(response.getBody())
                .usingRecursiveComparison()
                .isEqualTo(EventsTest.ilg503207896Events());

        mockApiServer.verify();
    }

    @Test
    public void shouldGetIlgEventsWhenRequestIsIlgWithEventParams() throws URISyntaxException,
            JsonProcessingException {
        mockApi("http://ilg.fr/companies/fr/503207896/events" +
                "?page=0&number=1&filters[]=$.eventCode,6365", EventsTest.ilg503207896EventsJson());

        EventRequest requestParam = EventRequest.builder()
                .page(PageRequest.of(0,1))
                .filters(FiltersRequest.of("$.eventCode,6365"))
                .build();

        ResponseEntity<EventsProjection> response = apiClient.getEvents("fr", "503207896", requestParam);
        assertThat(response.getBody())
                .usingRecursiveComparison()
                .isEqualTo(EventsTest.ilg503207896Events());

        mockApiServer.verify();
    }

    @Test
    public void shouldGetIlgEventDetailWhenRequestIsIlg() throws URISyntaxException,
            JsonProcessingException {
        mockApi("http://ilg.fr/event/6000574496", EventDetailTest.ilg503207896EventDetailJson());

        ResponseEntity<EventDetailProjection> response = apiClient.getEvent("6000574496");
        assertThat(response.getBody())
                .usingRecursiveComparison()
                .isEqualTo(EventDetailTest.ilg503207896EventDetail());

        mockApiServer.verify();
    }

    @Test
    public void shouldRequestEventsTwiceWhenCacheIsDisabled() throws URISyntaxException,
            JsonProcessingException {
        mockApi("http://ilg.fr/companies/fr/503207896/events", EventsTest.ilg503207896EventsJson(), ExpectedCount.times(2));

        //cache disabled, api requested twice
        apiClient.getEvents("fr", "503207896");
        apiClient.getEvents("fr", "503207896");

        mockApiServer.verify();
    }
}
