package fr.redfroggy.ilg.client.site;

import fr.redfroggy.ilg.TestApplication;
import fr.redfroggy.ilg.client.ApiClientIntTest;
import fr.redfroggy.ilg.client.PageRequest;
import fr.redfroggy.ilg.spring.boot.autoconfigure.client.SiteApiClient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assume.*;

@EnabledIfEnvironmentVariable(named = "ILG_URL", matches = ".*")
@SpringBootTest(classes = TestApplication.class)
public class SiteApiClientIntTest extends ApiClientIntTest {

    @Autowired
    private SiteApiClient apiClient;

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
