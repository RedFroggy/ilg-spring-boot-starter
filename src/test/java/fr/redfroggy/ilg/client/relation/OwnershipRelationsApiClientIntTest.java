package fr.redfroggy.ilg.client.relation;

import static org.assertj.core.api.Assertions.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import fr.redfroggy.ilg.TestApplication;
import fr.redfroggy.ilg.client.ApiClientIntTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URISyntaxException;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class)
public class OwnershipRelationsApiClientIntTest extends ApiClientIntTest {
    @Autowired
    private OwnershipRelationsApi apiClient;

    @Test
    public void shouldGetIlgLinksWhenRequestIsIlg() throws URISyntaxException,
            JsonProcessingException {
        ResponseEntity<LinksProjection> response = apiClient.getLinks("fr", "503207896");
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
        ResponseEntity<ShareholdersProjection> response = apiClient.getLinksShareholders("fr", "503207896");

        ShareholdersProjection shareholders = response.getBody();

        assertThat(shareholders.getMembers())
                .first()
                .usingRecursiveComparison()
                .isEqualTo(ShareholdersTest.ilg503207896Shareholders().getMembers().get(0));
    }

    @Test
    public void shouldGetIlgSubsidiariesWhenRequestIsIlg() throws URISyntaxException,
            JsonProcessingException {
        ResponseEntity<SubsidiariesProjection> response = apiClient.getLinksSubsidiaries("fr", "503207896");

        SubsidiariesProjection subsidiaries = response.getBody();

        assertThat(subsidiaries.getMembers())
                .first()
                .usingRecursiveComparison()
                .isEqualTo(SubsidiariesTest.ilg503207896Subsidiaries().getMembers().get(0));
    }

    @Test
    public void shouldGetGroupWhenRequestIs455198() throws URISyntaxException,
            JsonProcessingException {
        ResponseEntity<GroupProjection> response = apiClient.getGroups("455198");

        GroupProjection group = response.getBody();

        assertThat(group.getMembers())
                .first()
                .usingRecursiveComparison()
                .isEqualTo(GroupTest.group455198().getMembers().get(0));
    }
}
