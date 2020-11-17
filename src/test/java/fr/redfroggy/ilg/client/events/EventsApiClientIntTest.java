package fr.redfroggy.ilg.client.events;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assume.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import fr.redfroggy.ilg.TestApplication;
import fr.redfroggy.ilg.client.FiltersRequest;
import fr.redfroggy.ilg.spring.boot.autoconfigure.client.EventsApiClient;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.ObjectUtils;

import java.io.IOException;
import java.net.URISyntaxException;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class)
public class EventsApiClientIntTest {

    @Autowired
    private EventsApiClient apiClient;

    private ObjectMapper mapper = new ObjectMapper();

    @Before
    public void ping() throws IOException {
        assumeFalse("No ILG_URL define, no int tests run", ObjectUtils.isEmpty(System.getenv("ILG_URL")));
    }

    @Test
    public void shouldGetIlgEventsWhenRequestIsIlg() throws URISyntaxException,
            JsonProcessingException {

        EventRequest requestParam = EventRequest.builder()
                .filters(FiltersRequest.of("$.adId,6000574496"))
                .build();

        ResponseEntity<EventsProjection> response = apiClient.getEvents("fr", "503207896", requestParam);
        assertThat(response.getBody())
                .usingRecursiveComparison()
                .isEqualTo(EventsTest.ilg503207896EventsIntTest());
    }

    @Test
    public void shouldGetIlgEventDetailWhenRequestIsIlg() throws URISyntaxException,
            JsonProcessingException {

        ResponseEntity<EventDetailProjection> response = apiClient.getEvent("6000574496");
        assertThat(response.getBody())
                .usingRecursiveComparison()
                .isEqualTo(EventDetailTest.ilg503207896EventDetailIntTest());

    }
}
