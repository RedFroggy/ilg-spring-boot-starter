package fr.redfroggy.ilg.client.monitoring;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.redfroggy.ilg.UnitTestUtils;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;

public class AlertsTest {
    private static final ObjectMapper json = UnitTestUtils.getJsonMapper();

    @Test
    public void shouldGetAlertsFromJson() throws IOException {
        Alerts fromJson = json.readValue(alertsJson(), Alerts.class);

        assertThat(fromJson)
                .usingRecursiveComparison()
                .isEqualTo(alerts());

    }

    public static String alertsJson() {
        return UnitTestUtils.getJsonFromContractFile("/monitoring/monitoring-alert.json");
    }

    public static Alerts alerts() {
        return Alerts.builder()
                .id("/alert")
                .start(1)
                .page(1)
                .total(2)
                .count(2)
                .alertes(Arrays.asList(
                        Alert.builder()
                                .adId("RCS-C_BXC20210030580")
                                .source(AlertSource.BOD)
                                .name("FUTURA FINANCES")
                                .parutionDate(LocalDate.of(2021, Month.FEBRUARY,12))
                                .creationDate(LocalDate.of(2021, Month.FEBRUARY,12))
                                .siren(344401575)
                                .urlEvent("/event/RCS-C_BXC20210030580")
                                .portfolioItems(Collections.singletonList(new AlertPortfolioItem(999999,"0",0)))
                                .build(),
                        Alert.builder()
                                .adId("RCS-C_BXC20210030638")
                                .source(AlertSource.BOD)
                                .name("ALIX TEXTILES")
                                .parutionDate(LocalDate.of(2021, Month.FEBRUARY,12))
                                .creationDate(LocalDate.of(2021, Month.FEBRUARY,12))
                                .siren(484815238)
                                .urlEvent("/event/RCS-C_BXC20210030638")
                                .portfolioItems(Collections.singletonList(new AlertPortfolioItem(999999,"0",0)))
                                .build()
                ))
                .build();
    }
}
