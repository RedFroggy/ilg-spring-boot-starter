package fr.redfroggy.ilg.client.events;

import static org.assertj.core.api.Assertions.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.*;
import static org.springframework.test.web.client.response.MockRestResponseCreators.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import fr.redfroggy.ilg.TestApplication;
import fr.redfroggy.ilg.client.FiltersRequest;
import fr.redfroggy.ilg.client.PageRequest;
import fr.redfroggy.ilg.client.authentication.AuthenticationJwt;
import fr.redfroggy.ilg.spring.boot.autoconfigure.client.EventsApiClient;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.client.ExpectedCount;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class, properties = { "ilg.url=http://ilg.fr","ilg.debugging=false"})
public class EventsApiClientMockRestTest {

    @Autowired
    private EventsApiClient apiClient;

    @Autowired
    private RestTemplate ilgRestTemplate;

    @Autowired
    private RestTemplate simpleRestTemplate;

    private MockRestServiceServer mockAuthorizedServer;
    private MockRestServiceServer mockApiServer;

    private ObjectMapper mapper = new ObjectMapper();

    @Before
    public void init() throws URISyntaxException, JsonProcessingException {
        mockAuthorizedServer = MockRestServiceServer.createServer(simpleRestTemplate);
        AuthenticationJwt jwt = new AuthenticationJwt("test-token", "test-refreshToken");
        mockAuthorizedServer.expect(ExpectedCount.once(),
                requestTo(new URI("http://ilg.fr/login_json")))
                .andRespond(withStatus(HttpStatus.OK)
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(mapper.writeValueAsString(jwt))
                );

        mockApiServer = MockRestServiceServer.createServer(ilgRestTemplate);
    }

    @Test
    public void shouldGetIlgEventsWhenRequestIsIlg() throws URISyntaxException,
            JsonProcessingException {
        mockApiServer.expect(ExpectedCount.once(),
                requestTo(new URI("http://ilg.fr/companies/fr/503207896/events")))
                .andExpect(method(HttpMethod.GET))
                .andExpect(header("authorization","Bearer test-token"))
                .andExpect(header("accept",MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andRespond(withStatus(HttpStatus.OK)
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(EventsTest.ilg503207896EventsJson())
                );

        ResponseEntity<EventsProjection> response = apiClient.getEvents("fr", "503207896");
        assertThat(response.getBody())
                .usingRecursiveComparison()
                .isEqualTo(EventsTest.ilg503207896Events());

        mockApiServer.verify();
    }

    @Test
    public void shouldGetIlgEventsWhenRequestIsIlgWithEventParams() throws URISyntaxException,
            JsonProcessingException {
        mockApiServer.expect(ExpectedCount.once(),
                requestTo(new URI("http://ilg.fr/companies/fr/503207896/events" +
                        "?page=0&number=1&filters[]=$.eventCode,6365")))
                .andExpect(method(HttpMethod.GET))
                .andExpect(header("authorization","Bearer test-token"))
                .andExpect(header("accept",MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andRespond(withStatus(HttpStatus.OK)
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(EventsTest.ilg503207896EventsJson())
                );

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
        mockApiServer.expect(ExpectedCount.once(),
                requestTo(new URI("http://ilg.fr/event/6000574496")))
                .andExpect(method(HttpMethod.GET))
                .andExpect(header("authorization","Bearer test-token"))
                .andExpect(header("accept",MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andRespond(withStatus(HttpStatus.OK)
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(EventDetailTest.ilg503207896EventDetailJson())
                );

        ResponseEntity<EventDetailProjection> response = apiClient.getEvent("6000574496");
        assertThat(response.getBody())
                .usingRecursiveComparison()
                .isEqualTo(EventDetailTest.ilg503207896EventDetail());

        mockApiServer.verify();
    }
}
