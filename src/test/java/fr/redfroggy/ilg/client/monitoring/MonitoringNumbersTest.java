package fr.redfroggy.ilg.client.monitoring;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.redfroggy.ilg.UnitTestUtils;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class MonitoringNumbersTest {
    private static final ObjectMapper json = UnitTestUtils.getJsonMapper();

    @Test
    public void shouldGetMonitoringNumbersFromJson() throws IOException {
        MonitoringNumbers fromJson = json.readValue(monitoringNumbersJson(), MonitoringNumbers.class);

        assertThat(fromJson)
                .usingRecursiveComparison()
                .isEqualTo(monitoringNumbers());

    }

    public static String monitoringNumbersJson() {
        return UnitTestUtils.getJsonFromContractFile("/monitoring/monitoring-numbers.json");
    }

    public static MonitoringNumbers monitoringNumbers() {
        return new MonitoringNumbers(3525, 3, 1);
    }
}
