package fr.redfroggy.ilg.client.monitoring;

import com.google.common.io.Resources;
import fr.redfroggy.ilg.UnitTestUtils;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collections;

public class PortfoliosTest {

    @Test
    public void shouldGetPortfoliosFromJson() throws IOException {
        UnitTestUtils.assertThatJsonIsEqualToResource(portfoliosJson(), portfolios(), Portfolios.class);
    }

    @Test
    public void shouldGetPortfoliosFromJsonForSiren303731590() throws IOException {
        UnitTestUtils.assertThatJsonIsEqualToResource(portfoliosJsonForSiren303731590(),
                portfoliosForSiren303731590(), Portfolios.class,
                PortfoliosProjection2.class);
    }

    public static String portfoliosJson() {
        try {
            return Resources.toString(
                    Resources.getResource("contracts/monitoring/monitoring-portfolio.json"),
                    Charset.forName("UTF8"));
        } catch (IOException e) {
            return "";
        }
    }

    public static PortfoliosProjection portfolios() {
        return new Portfolios(Collections.singletonList(
                Portfolio.builder()
                        .id(999999)
                        .label("PF JURIALERTE 999")
                        .alertType(AlertType.JURI)
                        .type(0)
                        .build()),
                null);
    }

    public static String portfoliosJsonForSiren303731590() {
        try {
            return Resources.toString(
                    Resources.getResource("contracts/monitoring/monitoring-siren-1.json"),
                    Charset.forName("UTF8"));
        } catch (IOException e) {
            return "";
        }
    }

    public static PortfoliosProjection2 portfoliosForSiren303731590() {
        return new Portfolios(Collections.singletonList(
                Portfolio.builder()
                        .id(999999)
                        .label("PF JURIALERTE 999")
                        .alertType(AlertType.JURI)
                        .type(0)
                        .item(PortfolioItem.builder()
                                .id(1170109486)
                                .siren(303731590)
                                .build())
                        .editable(true)
                        .build()),
                1);
    }
}
