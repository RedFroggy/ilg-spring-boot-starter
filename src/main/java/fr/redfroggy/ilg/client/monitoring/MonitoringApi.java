package fr.redfroggy.ilg.client.monitoring;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import javax.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestParam;

@Validated
@Api(value = "Monitoring", description = "the Monitoring API")
public interface MonitoringApi {

    /**
     * GET /monitoring/alert : Return a list of alerts
     * <p>
     * Request params:
     * - entityId Identifiant unique représentant une entité (optional)
     * - userEmail Email de l&#39;utilisateur (optional)
     * - alertMinDate Date de début de recherche de parution des alertes (format yyyy-mm-dd) (optional)
     * - alertMaxDate Date de fin de recherche de parution des alertes (format yyyy-mm-dd) (optional)
     * - source Enum sur la source de l’alerte, Available values : BOD, JAL, PRE, RPC, SIR, TCO (optional)
     * - isPerso Valeur de filtrage sur les portfolios perso (1) ou pro (0) (optional)
     * - page Entier représentant le numéro de la page (optional)
     * - number Nombre de résultats par page (optional)
     * - sort Valeur de retour à trier (nom de la colonne) (optional, default to adId)
     * - order Ordre ascendant ou descendant portant sur la condition de trie (optional, default to ASC)
     *
     * @return (status code 200)
     * or Bad Request (status code 400)
     * or Authentication Failure: Expired Token or Invalid Token (status code 401)
     * or Forbidden (status code 403)
     * or Resource not found (status code 404)
     */
    ResponseEntity<Alerts> getMonitoringAlert(AlertRequest requestParam);


    /**
     * GET /monitoring/alert/portfolio/{portfolioId} : Return a list of alerts by portfolio id
     * <p>
     * Request params:
     * <p>
     * - alertMinDate Date de début de recherche de parution des alertes (format yyyy-mm-dd) (optional)
     * - alertMaxDate Date de fin de recherche de parution des alertes (format yyyy-mm-dd) (optional)
     * - source Enum sur la source de l’alerte, Available values : BOD, JAL, PRE, RPC, SIR, TCO (optional)
     * - page Entier représentant le numéro de la page (optional)
     * - number Nombre de résultats par page (optional)
     * - sort Valeur de retour à trier (nom de la colonne) (optional, default to adId)
     * - order Ordre ascendant ou descendant portant sur la condition de trie (optional, default to ASC)
     *
     * @param portfolioId Identifiant du portefeuille dont on veut les alertes (required)
     * @param request     Request params
     * @return (status code 200)
     * or Bad Request (status code 400)
     * or Authentication Failure: Expired Token or Invalid Token (status code 401)
     * or Forbidden (status code 403)
     * or Resource not found (status code 404)
     */
    ResponseEntity<Alerts> getMonitoringAlertPortfolio(@ApiParam(value = "Identifiant du portefeuille dont on veut " +
            "les alertes", required = true) Integer portfolioId, AlertPortfolioRequest request);


    /**
     * GET /monitoring/numbers : Return stats
     *
     * @param portfolioId Unique identifier representing a portfolio (optional)
     * @return (status code 200)
     * or Bad Request (status code 400)
     * or Authentication Failure: Expired Token or Invalid Token (status code 401)
     * or Forbidden (status code 403)
     * or Resource not found (status code 404)
     */
    ResponseEntity<MonitoringNumbers> getMonitoringNumbers(@ApiParam(value = "Unique identifier representing a " +
            "portfolio") @Valid @RequestParam(value = "portfolioId", required = false) Integer portfolioId);
    
}
