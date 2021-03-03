package fr.redfroggy.ilg.client.monitoring;

import fr.redfroggy.ilg.client.PageRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import org.springframework.http.ResponseEntity;

import javax.validation.constraints.NotNull;

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
    ResponseEntity<PortfoliosProjection> getMonitoringPortfolios(PortfolioRequest request);


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


    /**
     * GET /monitoring/portfolio/{portfolioId}/item : Return a list of items
     *
     * Request params:
     * - page Page number (optional)
     * - number Number of result by page (optional)
     * - customCode Filter for a custom code (optional)
     * - eventCode Filter for the event code (optional)
     * - siren Filter for a siren (optional)
     * - cname Search text in company name (optional)
     * - ilgScoreOrigin Filter for a origin score (optional)
     * - customCreditMin Filter for a custom credit min (optional)
     * - customCreditMax Filter for a custom credit max (optional)
     * - portfolio List of monitoring for a portfolio (optional)
     * - userEmail List of monitoring for a user (optional)
     * - monitoringStartDateMin Filter for a start date of monitoring min (YYYY-MM-DD) (optional)
     * - monitoringStartDateMax Filter for a start date of monitoring max (YYYY-MM-DD) (optional)
     * - creationDateMin Filter for a creation date of monitoring min (YYYY-MM-DD) (optional)
     * - creationDateMax Filter for a creation date of monitoring max (YYYY-MM-DD) (optional)
     * - sort Value to sort (optional, default to monitoringStartDate)
     * - order Sorting order, ‘asc’ or ‘desc’ (optional, default to DESC)
     *
     * @param portfolioId Unique identifier representing a portfolio (required)
     * @param requestParam add request params to get request
     * @return  (status code 200)
     *         or Bad Request (status code 400)
     *         or Authentication Failure: Expired Token or Invalid Token (status code 401)
     *         or Forbidden (status code 403)
     *         or Resource not found (status code 404)
     */
    ResponseEntity<PortfolioItems> getPortfolioItems(Integer portfolioId, PortfolioItemRequest requestParam);


    /**
     * DELETE /monitoring/portfolio/{portfolioId}/item/{itemId} : Delete items from PF
     *
     * @param portfolioId Unique identifier representing a portfolio (required)
     * @param itemId Unique identifier representing a item (required)
     * @return The items have been removed (status code 204)
     *         or Bad Request (status code 400)
     *         or Authentication Failure: Expired Token or Invalid Token (status code 401)
     *         or Forbidden (status code 403)
     *         or Resource not found (status code 404)
     *         or Conflict (status code 409)
     */
    ResponseEntity<Void> deletePortfolioItem(Integer portfolioId, Integer itemId);


    /**
     * PATCH /monitoring/portfolio/{portfolioId}/item/{itemId} : Update item from PF
     *
     * @param portfolioId Unique identifier representing a portfolio (required)
     * @param itemId Unique identifier representing a item (required)
     * @param itemDetail  (required)
     * @return The items have been removed (status code 204)
     *         or Bad Request (status code 400)
     *         or Authentication Failure: Expired Token or Invalid Token (status code 401)
     *         or Forbidden (status code 403)
     *         or Resource not found (status code 404)
     *         or Conflict (status code 409)
     */
    ResponseEntity<Void> updatePortfolioItem(Integer portfolioId, Integer itemId, PortfolioItemDetail itemDetail);


    /**
     * POST /monitoring/portfolio/{portfolioId}/item : Add item to PF
     *
     * @param portfolioId Unique identifier representing a portfolio (required)
     * @param itemDetail  (required)
     * @return the item have been added (status code 201)
     *         or Bad Request (status code 400)
     *         or Authentication Failure: Expired Token or Invalid Token (status code 401)
     *         or Forbidden (status code 403)
     *         or Conflict (status code 409)
     */
    ResponseEntity<Void> addPortfolioItem(Integer portfolioId, PortfolioItemSirenDetail itemDetail);


    /**
     * DELETE /monitoring/portfolio/{portfolioId}/items : Delete items from PF
     *
     * @param portfolioId Unique identifier representing a portfolio (required)
     * @param idsOfItem  (required)
     * @return The items have been removed (status code 204)
     *         or Bad Request (status code 400)
     *         or Authentication Failure: Expired Token or Invalid Token (status code 401)
     *         or Forbidden (status code 403)
     *         or Resource not found (status code 404)
     *         or Conflict (status code 409)
     */
    ResponseEntity<Void> deletePortfolioItems(Integer portfolioId, PortfolioItemIds idsOfItem);

    /**
     * POST /monitoring/portfolio/siren : Return list of siren subscribed for given siren
     *
     * @param sirensRequestBody list of siren (required)
     * @return list of siren subscribed for given siren (status code 200)
     *         or Bad Request (status code 400)
     *         or Authentication Failure: Expired Token or Invalid Token (status code 401)
     *         or Forbidden (status code 403)
     *         or Resource not found (status code 404)
     */
    ResponseEntity<SirensResponseBody> listPortfolioSirens(@NotNull SirensRequestBody sirensRequestBody);

    /**
     * GET /monitoring/portfolio/siren/{siren} : Return informations of portfolios for user and siren
     *
     * @param siren Unique identifier representing a company (required)
     * @param page Page request params (optional)
     * @return  (status code 200)
     *         or Bad Request (status code 400)
     *         or Authentication Failure: Expired Token or Invalid Token (status code 401)
     *         or Forbidden (status code 403)
     *         or Resource not found (status code 404)
     */
    ResponseEntity<PortfoliosProjection2> getPortfolioSiren(@NotNull Integer siren, PageRequest page);

}
