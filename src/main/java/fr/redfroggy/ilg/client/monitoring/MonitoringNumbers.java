package fr.redfroggy.ilg.client.monitoring;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * MonitoringNumbers
 */

public class MonitoringNumbers   {

  private final Integer nbitems;

  private final Integer nbSubscriptions;

  private final Integer nbPortfolios;

  public MonitoringNumbers(@JsonProperty("nbitems") Integer nbitems,
                           @JsonProperty("nbSubscriptions") Integer nbSubscriptions,
                           @JsonProperty("nbPortfolios") Integer nbPortfolios) {
    this.nbitems = nbitems;
    this.nbSubscriptions = nbSubscriptions;
    this.nbPortfolios = nbPortfolios;
  }

  /**
   * Number of items
   * @return nbitems
  */
  @ApiModelProperty(example = "2", value = "Number of items")
  public Integer getNbitems() {
    return nbitems;
  }

  /**
   * Number of subscriptions
   * @return nbSubscriptions
  */
  @ApiModelProperty(example = "2", value = "Number of subscriptions")
  public Integer getNbSubscriptions() {
    return nbSubscriptions;
  }

  /**
   * Number of portfolios
   * @return nbPortfolios
  */
  @ApiModelProperty(example = "2", value = "Number of portfolios")
  public Integer getNbPortfolios() {
    return nbPortfolios;
  }

}

