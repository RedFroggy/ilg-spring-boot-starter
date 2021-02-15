package fr.redfroggy.ilg.spring.boot.autoconfigure.client;

import fr.redfroggy.ilg.client.monitoring.*;
import fr.redfroggy.ilg.spring.boot.autoconfigure.IlgRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class MonitoringApiClient implements MonitoringApi {

    private final IlgRestTemplate client;

    public MonitoringApiClient(IlgRestTemplate client) {
        this.client = client;
    }

    @Override
    public ResponseEntity<Alerts> getMonitoringAlert(AlertRequest requestParam) {
        UriComponentsBuilder uriBuilder = client.absoluteUriBuilder("/monitoring/alert");
        if (requestParam != null) {
            uriBuilder.queryParams(requestParam.toQueryParams());
        }

        return client.getForEntity(uriBuilder.buildAndExpand().toUri(), Alerts.class);
    }

    @Override
    public ResponseEntity<Alerts> getMonitoringAlertPortfolio(Integer portfolioId, AlertPortfolioRequest requestParam) {
        UriComponentsBuilder uriBuilder = client.absoluteUriBuilder("/monitoring/alert/portfolio/{portfolioId}");
        if (requestParam != null) {
            uriBuilder.queryParams(requestParam.toQueryParams());
        }

        return client.getForEntity(uriBuilder.buildAndExpand(portfolioId).toUri(), Alerts.class);
    }

    @Override
    public ResponseEntity<MonitoringNumbers> getMonitoringNumbers(Integer portfolioId) {
        UriComponentsBuilder uriBuilder = client.absoluteUriBuilder("/monitoring/numbers");
        if (portfolioId != null) {
            uriBuilder.queryParam("portfolioId", portfolioId);
        }

        return client.getForEntity(uriBuilder.buildAndExpand().toUri(), MonitoringNumbers.class);
    }

    @Override
    public ResponseEntity<Portfolios> getMonitoringPortfolios(PortfolioRequest requestParam) {
        UriComponentsBuilder uriBuilder = client.absoluteUriBuilder("/monitoring/portfolio");
        if (requestParam != null) {
            uriBuilder.queryParams(requestParam.toQueryParams());
        }
        return client.getForEntity(uriBuilder.buildAndExpand().toUri(), Portfolios.class);
    }

    @Override
    public ResponseEntity<Void> postMonitoringPortfolioPerso() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Override
    public ResponseEntity<PortfolioProjection> getMonitoringPortfolio(Integer portfolioId) {
        UriComponentsBuilder uriBuilder = client.absoluteUriBuilder("/monitoring/portfolio/{portfolioId}");

        return client.getForEntity(uriBuilder.buildAndExpand(portfolioId).toUri(), PortfolioProjection.class);
    }

}
