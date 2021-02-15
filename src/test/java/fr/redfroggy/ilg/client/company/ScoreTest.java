package fr.redfroggy.ilg.client.company;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.common.io.Resources;
import fr.redfroggy.ilg.JacksonUtils;
import fr.redfroggy.ilg.UnitTestUtils;
import fr.redfroggy.ilg.client.model.Score;
import fr.redfroggy.ilg.client.model.ScoreHistory;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ScoreTest {

    private static final ObjectMapper json = JacksonUtils.buildMapper()
            .setSerializationInclusion(JsonInclude.Include.NON_NULL)
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
            .disable(SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS);

    @Test
    public void shouldGetAmazon00048ScoreFromJson() throws IOException {
        UnitTestUtils.assertThatJsonIsEqualToResource(amazon00048ScoreJson(), amazon00048Score(), Score.class,
                ScoreProjection.class);
    }

    public static String amazon00048ScoreJson() {
        return UnitTestUtils.getJsonFromContractFile("/company/FR-428785042-company-score.json");
    }

    public static Score amazon00048Score() {
        HashMap<String, String> comments = new HashMap<>();
        comments.put("COP_8", "Le délai moyen constaté des règlements auprès de ses fournisseurs est de <span class='delai_reglement_negatif'>204</span> jours contre 64 jours pour ses confrères.");
        comments.put("FIN_102", "L’entreprise peut autofinancer ses besoins courants (stocks, créances clients).");
        comments.put("FIN_62", "Le ratio de Liquidité générale exprime une capacité de remboursement des dettes à " +
                "court terme un peu juste");
        comments.put("LFI_1", "Le capital de AMAZON FRANCE LOGISTIQUE SAS est majoritairement contrôlé, aussi la situation de son actionnaire doit être prise en compte dans votre décision. De façon générale, notez qu’en cas de défaillance de l’actionnaire majoritaire, les filiales sont régulièrement  impactées par le jugement. A l’inverse, et malgré certains devoirs imposés à l’actionnaire majoritaire, il n’est pas rare de constater que ce dernier se déresponsabilise de ses engagements lors de difficultés de paiement, et alors en cas de défaillance de la filiale il appartiendra au juge de définir les responsabilités et les éventuelles poursuites (ce commentaire est d’ordre général, nous n’avons pas constaté à ce jour ce type de fait concernant l’actionnaire de AMAZON FRANCE LOGISTIQUE SAS). ");
        comments.put("NAF_10", "Son secteur d’activité a un taux de défaillance supérieur à la moyenne des entreprises");
        comments.put("REL_4", "La situation de l’entreprise permet une entrée en relation.");

        return Score.builder()
                .score(17)
                .previous(18)
                .creditLimit(500000)
                .delaiReglementFournisseur(204.21f)
                .delaiReglementFournisseurSecteur(63.72f)
                .comments(comments)
                .history(buildScoreHistoryList())
                .tendance("=")
                .covidImpact("impact Covid 19 faible")
                .build();
    }

    private static List<ScoreHistory> buildScoreHistoryList() {
        return Arrays.asList(
                new ScoreHistory("2018", "10", "17.0", "10.6"),
                new ScoreHistory("2018", "11", "17.0", "10.6"),
                new ScoreHistory("2018", "12", "17.0", "10.6"),
                new ScoreHistory("2019", "01", "17.0", "10.5"),
                new ScoreHistory("2019", "02", "17.0", "10.5"),
                new ScoreHistory("2019", "03", "16.0", "10.5"),
                new ScoreHistory("2019", "04", "16.0", "10.5"),
                new ScoreHistory("2019", "05", "16.0", "10.5"),
                new ScoreHistory("2019", "06", "16.0", "10.5"),
                new ScoreHistory("2019", "07", "16.0", "10.5"),
                new ScoreHistory("2019", "08", "16.0", "10.5"),
                new ScoreHistory("2019", "09", "16.0", "10.5"),
                new ScoreHistory("2019", "10", "17.0", "10.5"),
                new ScoreHistory("2019", "11", "17.0", "10.5"),
                new ScoreHistory("2019", "12", "16.0", "10.5"),
                new ScoreHistory("2020", "01", "16.0", "10.4"),
                new ScoreHistory("2020", "02", "16.0", "10.5"),
                new ScoreHistory("2020", "03", "17.0", "10.0"),
                new ScoreHistory("2020", "04", "17.0", "9.8"),
                new ScoreHistory("2020", "05", "17.0", "9.8"),
                new ScoreHistory("2020", "06", "17.0", "9.8"),
                new ScoreHistory("2020", "07", "17.0", "9.9"),
                new ScoreHistory("2020", "08", "17.0", "9.9"),
                new ScoreHistory("2020", "09", "17.0", "9.9"),
                new ScoreHistory("2020", "10", "17.0", "9.9")
        );
    }
}
