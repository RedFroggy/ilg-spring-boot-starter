package fr.redfroggy.ilg.client.monitoring;

import com.google.common.io.Resources;
import fr.redfroggy.ilg.UnitTestUtils;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.Charset;
import java.time.LocalDate;
import java.time.Month;

public class PortfolioTest {

    @Test
    public void shouldGetIlgPortfolioFromJson() throws IOException {
        UnitTestUtils.assertThatJsonIsEqualToResource(portfolio999999Json(), portfolio999999(), Portfolio.class,
                PortfolioProjection.class);
    }

    public static String portfolio999999Json() {
        try {
            return Resources.toString(
                    Resources.getResource("contracts/monitoring/monitoring-portfolio-1.json"),
                    Charset.forName("UTF8"));
        } catch (IOException e) {
            return "";
        }
    }

    public static Portfolio portfolio999999() {
        return Portfolio.builder()
                .id(999999)
                .label("PF JURIALERTE 999")
                .title("PF Jurialerte 999")
                .alertType(AlertType.JURI)
                .extendable(false)
                .matchable(false)
                .type(0)
                .updateDate(LocalDate.of(2021, Month.FEBRUARY, 12))
                .createdAt(LocalDate.of(2020, Month.DECEMBER, 9))
                .isPerso(false)
                .customer(new Customer(1000009999, "999", "7482"))
                .editable(true)
                .deliverable(false)
                .build();
    }

}
