package fr.redfroggy.ilg.client.monitoring;

import com.google.common.io.Resources;
import fr.redfroggy.ilg.UnitTestUtils;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.Charset;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Collections;

public class PortfolioItemsTest {

    @Test
    public void shouldGetItemsFromJson() throws IOException {
        UnitTestUtils.assertThatJsonIsEqualToResource(portfolio999999ItemsJson(), portfolio999999Items(), PortfolioItems.class);
    }

    public static String portfolio999999ItemsJson() {
        try {
            return Resources.toString(
                    Resources.getResource("contracts/monitoring/monitoring-portfolio-1-item.json"),
                    Charset.forName("UTF8"));
        } catch (IOException e) {
            return "";
        }
    }

    public static PortfolioItems portfolio999999Items() {
        PortfolioItem item1 = PortfolioItem.builder()
                .id(1170109486)
                .siren(303731590)
                .companyName("ETABLISSEMENTS GUICHARD")
                .monitoringStartDate(LocalDate.of(2020,12,26))
                .links(Collections.emptyList())
                .build();
        PortfolioItem item2 = PortfolioItem.builder()
                .id(1170109487)
                .siren(304099732)
                .companyName("AMENAGEMENT 77")
                .monitoringStartDate(LocalDate.of(2020,12,26))
                .links(Collections.emptyList())
                .build();
        return new PortfolioItems(Arrays.asList(item1,item2), 3525);
    }
}