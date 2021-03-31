package fr.redfroggy.ilg.spring.boot.autoconfigure.monitoring;

import fr.redfroggy.ilg.client.monitoring.AlertPortfolioRequest;
import fr.redfroggy.ilg.client.monitoring.Alerts;
import fr.redfroggy.ilg.client.monitoring.MonitoringApi;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class AlertsPageIterator implements Iterator<Alerts> {

    private final MonitoringApi client;

    private final AlertPortfolioRequest request;

    private final Integer portfolioId;

    private int lastret=-1;
    private Alerts alerts;

    public AlertsPageIterator(MonitoringApi client, AlertPortfolioRequest request, Integer portfolioId) {
        Assert.notNull(client, "Cannot build iterator without client");
        Assert.notNull(request, "Cannot build iterator without request params");
        Assert.notNull(portfolioId, "Cannot build iterator without portfolio id");

        this.client = client;
        this.request = request;
        this.portfolioId = portfolioId;
        ResponseEntity<Alerts> response = client.getMonitoringAlertPortfolio(portfolioId, request);
        this.alerts = response.getBody();
    }

    @Override
    public boolean hasNext() {
        Integer total = alerts.getTotal();
        if (total == 0) {
            return false;
        }
        if (lastret == -1) {
            return true;
        }
        Integer lastAlertIndex = alerts.getStart() + alerts.getCount() - 1;
        return lastAlertIndex < total;
    }

    @Override
    public Alerts next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        lastret++;
        if (lastret == 0) {
            return alerts;
        }
        ResponseEntity<Alerts> response = client.getMonitoringAlertPortfolio(portfolioId, request.nextPage());
        this.alerts = response.getBody();
        return alerts;
    }

}
