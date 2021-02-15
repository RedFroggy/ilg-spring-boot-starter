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

    public static String portfoliosJson() {
        try {
            return Resources.toString(
                    Resources.getResource("contracts/monitoring/monitoring-portfolio.json"),
                    Charset.forName("UTF8"));
        } catch (IOException e) {
            return "";
        }
    }

    public static Portfolios portfolios() {
        return new Portfolios(Collections.singletonList(
                Portfolio.builder()
                        .id(999999)
                        .label("PF JURIALERTE 999")
                        .alertType(AlertType.JURI)
                        .type(0)
                        .build()),
                null);
    }

}
