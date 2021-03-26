package fr.redfroggy.ilg.spring.boot.autoconfigure.monitoring;

import fr.redfroggy.ilg.client.monitoring.AlertPortfolioRequest;
import fr.redfroggy.ilg.client.monitoring.Alerts;
import fr.redfroggy.ilg.client.monitoring.MonitoringApi;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import java.util.Collections;
import java.util.NoSuchElementException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.when;

public class AlertsPageIteratorTest {

    @Mock
    private MonitoringApi client;

    @Mock
    private AlertPortfolioRequest request;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void shouldThrowExceptionWhenHasNoNext() {
        when(client.getMonitoringAlertPortfolio(1, request))
                .thenReturn(ResponseEntity.ok( Alerts.builder().total(0).build()));

        AlertsPageIterator iterator = new AlertsPageIterator(client, request, 1);

        assertThatThrownBy(() -> iterator.next())
                .isInstanceOf(NoSuchElementException.class);
    }

    @Test
    public void shouldHasNextFalseWhenNoAlerts() {
        when(client.getMonitoringAlertPortfolio(1, request))
                .thenReturn(ResponseEntity.ok( Alerts.builder().total(0).build()));

        AlertsPageIterator iterator = new AlertsPageIterator(client, request, 1);

        assertThat(iterator.hasNext()).isFalse();
    }

    @Test
    public void shouldHasNextTrueWhenAlerts() {
        when(client.getMonitoringAlertPortfolio(1, request))
                .thenReturn(ResponseEntity.ok( Alerts.builder().total(1).build()));

        AlertsPageIterator iterator = new AlertsPageIterator(client, request, 1);

        assertThat(iterator.hasNext()).isTrue();
    }

    @Test
    public void shouldHasNextFalseWhenFirstNextAlertIsCall() {
        when(client.getMonitoringAlertPortfolio(1, request))
                .thenReturn(ResponseEntity.ok( Alerts.builder()
                        .start(1)
                        .count(1)
                        .alertes(Collections.singletonList(null))
                        .total(1).build()));

        AlertsPageIterator iterator = new AlertsPageIterator(client, request, 1);
        iterator.next();

        assertThat(iterator.hasNext()).isFalse();
    }

    @Test
    public void shouldIterate2LoopWhen2Pages() {
        when(client.getMonitoringAlertPortfolio(1, request))
                .thenReturn(ResponseEntity.ok( Alerts.builder()
                        .start(1)
                        .count(1)
                        .alertes(Collections.singletonList(null))
                        .total(2).build())
                );
        when(client.getMonitoringAlertPortfolio(1, request.nextPage()))
                .thenReturn(ResponseEntity.ok( Alerts.builder()
                        .start(2)
                        .count(1)
                        .alertes(Collections.singletonList(null))
                        .total(2).build())
                );

        AlertsPageIterator iterator = new AlertsPageIterator(client, request, 1);

        iterator.next();
        assertThat(iterator.hasNext()).isTrue();
        iterator.next();
        assertThat(iterator.hasNext()).isFalse();
    }
}