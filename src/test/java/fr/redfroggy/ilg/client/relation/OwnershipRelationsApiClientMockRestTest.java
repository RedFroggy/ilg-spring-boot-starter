package fr.redfroggy.ilg.client.relation;

import com.fasterxml.jackson.core.JsonProcessingException;
import fr.redfroggy.ilg.TestApplication;
import fr.redfroggy.ilg.client.ApiClientMockRestTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import java.net.URISyntaxException;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = TestApplication.class, properties = { "ilg.url=http://ilg.fr","ilg.debugging=false"})
public class OwnershipRelationsApiClientMockRestTest extends ApiClientMockRestTest {
    @Autowired
    private OwnershipRelationsApi apiClient;

    @Test
    public void shouldGetIlgLinksWhenRequestIsIlg() throws URISyntaxException,
            JsonProcessingException {
        mockApi("http://ilg.fr/companies/fr/503207896/links", LinksTest.ilg503207896LinksJson());

        ResponseEntity<LinksProjection> response = apiClient.getLinks("fr", "503207896");
        mockApiServer.verify();

        LinksProjection links = response.getBody();

        assertThat(links.getShareholders().getMembers())
                .first()
                .usingRecursiveComparison()
                .isEqualTo(LinksTest.ilg503207896Links().getShareholders().getMembers().get(0));

        assertThat(links.getSubsidiaries().getMembers())
                .first()
                .usingRecursiveComparison()
                .isEqualTo(LinksTest.ilg503207896Links().getSubsidiaries().getMembers().get(0));


    }

    @Test
    public void shouldGetIlgShareholdersWhenRequestIsIlg() throws URISyntaxException,
            JsonProcessingException {
        mockApi("http://ilg.fr/companies/fr/503207896/links/shareholders", ShareholdersTest.ilg503207896ShareholdersJson());

        ResponseEntity<ShareholdersProjection> response = apiClient.getLinksShareholders("fr", "503207896");
        mockApiServer.verify();

        ShareholdersProjection shareholders = response.getBody();

        assertThat(shareholders.getMembers())
                .first()
                .usingRecursiveComparison()
                .isEqualTo(ShareholdersTest.ilg503207896Shareholders().getMembers().get(0));

    }

    @Test
    public void shouldGetIlgSubsidiariesWhenRequestIsIlg() throws URISyntaxException,
            JsonProcessingException {
        mockApi("http://ilg.fr/companies/fr/503207896/links/subsidiaries", SubsidiariesTest.ilg503207896SubsidiariesJson());

        ResponseEntity<SubsidiariesProjection> response = apiClient.getLinksSubsidiaries("fr", "503207896");
        mockApiServer.verify();

        SubsidiariesProjection subsidiaries = response.getBody();

        assertThat(subsidiaries.getMembers())
                .first()
                .usingRecursiveComparison()
                .isEqualTo(SubsidiariesTest.ilg503207896Subsidiaries().getMembers().get(0));

    }

    @Test
    public void shouldGetGroupWhenRequestIs455198() throws URISyntaxException,
            JsonProcessingException {
        mockApi("http://ilg.fr/groups/455198", GroupTest.group455198Json());

        ResponseEntity<GroupProjection> response = apiClient.getGroups("455198");
        mockApiServer.verify();

        GroupProjection group = response.getBody();

        assertThat(group.getMembers())
                .first()
                .usingRecursiveComparison()
                .isEqualTo(GroupTest.group455198().getMembers().get(0));

    }
}
