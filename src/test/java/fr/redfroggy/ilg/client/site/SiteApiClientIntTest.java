package fr.redfroggy.ilg.client.site;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assume.*;

import fr.redfroggy.ilg.TestApplication;
import fr.redfroggy.ilg.client.PageRequest;
import fr.redfroggy.ilg.spring.boot.autoconfigure.client.SiteApiClient;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.ObjectUtils;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class)
public class SiteApiClientIntTest {

    @Autowired
    private SiteApiClient apiClient;

    @Before
    public void ping() throws IOException {
        assumeFalse("No ILG_URL define, no int tests run",ObjectUtils.isEmpty(System.getenv("ILG_URL")));
    }

    @Test
    public void shouldGetAmazonSitesWhenRequestIsAmazon() {
        SiteRequest requestParams = SiteRequest.builder()
                .page(PageRequest.of(0,2))
                .build();

        ResponseEntity<SitesProjection> sitesResponse = apiClient.getSites("fr", "428785042",requestParams);
        assertThat(sitesResponse.getBody())
                .usingRecursiveComparison()
                .isEqualTo(SitesTest.amazonSites());
    }

    @Test
    public void shouldGetAmazonSite00048WhenRequestIsAmazon() {
        ResponseEntity<SiteProjection> siteResponse = apiClient.getSite("fr", "428785042","42878504200048");
        assertThat(siteResponse.getBody())
                .usingRecursiveComparison()
                .isEqualTo(SiteTest.amazon00048Site());
    }

}
