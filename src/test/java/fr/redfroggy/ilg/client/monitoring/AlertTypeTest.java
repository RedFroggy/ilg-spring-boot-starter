package fr.redfroggy.ilg.client.monitoring;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class AlertTypeTest {

    @Test
    public void shouldGetAlertTypeJuri() {
        assertThat(AlertType.fromValue(4)).isEqualTo(AlertType.JURI);
    }

    @Test
    public void shouldThrowExceptionWhenIntegerIsNotAlertType() {
        assertThatThrownBy(() -> AlertType.fromValue(5))
        .isInstanceOf(IllegalArgumentException.class);
    }
}
