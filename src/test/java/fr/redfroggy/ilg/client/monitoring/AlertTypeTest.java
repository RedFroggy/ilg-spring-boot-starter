package fr.redfroggy.ilg.client.monitoring;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

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
