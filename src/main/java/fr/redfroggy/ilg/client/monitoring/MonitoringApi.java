package fr.redfroggy.ilg.client.monitoring;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import org.springframework.http.ResponseEntity;

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
    ResponseEntity<MonitoringNumbers> getMonitoringNumbers(Integer portfolioId);


    /**
     * GET /monitoring/portfolio : Return a list of portfolio for user or entity
     *
     * Request params :
     * - entityId      Unique identifier representing a entity (optional)
     * - userEmail     Email of user (optional)
     * - label         part of name of the portfolio (optional)
     * - alertType     type of of alert 4&#x3D;juri, 8&#x3D;score, 12&#x3D;juri+score (ex: alertType[]&#x3D;
     *                      4&amp;alertype[]&#x3D;12) (optional)
     * - isPerso       Portfolio perso or not 1&#x3D;perso, 0&#x3D;pro (optional)
     * - updateDateMin update date min YYYY-MM-DD (optional)
     * - updateDateMax update date max YYYY-MM-DD (optional)
     * - audit         Portfolio auditable or not 1 or 0 (optional)
     * - editable      Portfolio is editable or not 1 or 0 (optional)
     * - page          Page number (optional)
     * - number        Number of result by page (optional)
     * - sort          Value to sort (optional, default to label)
     * - order         Sorting order, ‘asc’ or ‘desc’ (optional, default to ASC)
     * @return (status code 200)
     * or Bad Request (status code 400)
     * or Authentication Failure: Expired Token or Invalid Token (status code 401)
     * or Forbidden (status code 403)
     * or Resource not found (status code 404)
     */
    ResponseEntity<Portfolios> getMonitoringPortfolios(PortfolioRequest request);


    /**
     * POST /monitoring/portfolio/perso : POST a personal portfolio
     *
     * @return The portfolio have been added (status code 201)
     * or Bad Request (status code 400)
     * or Authentication Failure: Expired Token or Invalid Token (status code 401)
     * or Forbidden (status code 403)
     * or Resource not found (status code 404)
     * or A personal portfolio already exists (status code 409)
     */
    ResponseEntity<Void> postMonitoringPortfolioPerso();


    /**
     * GET /monitoring/portfolio/{portfolioId} : Return information of portfolio
     *
     * @param portfolioId Unique identifier representing a Portfolio (required)
     * @return (status code 200)
     * or Bad Request (status code 400)
     * or Authentication Failure: Expired Token or Invalid Token (status code 401)
     * or Forbidden (status code 403)
     * or Resource not found (status code 404)
     */
    ResponseEntity<PortfolioProjection> getMonitoringPortfolio(Integer portfolioId);

}
