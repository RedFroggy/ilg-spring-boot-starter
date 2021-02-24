package fr.redfroggy.ilg.client.monitoring;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * PortfolioItemDetail
 */

public class PortfolioItemDetail {

  private final String reference;

  private final Integer credit;

  public PortfolioItemDetail(@JsonProperty("reference") String reference,
                             @JsonProperty("credit") Integer credit) {
    this.reference = reference;
    this.credit = credit;
  }

  /**
   * Get reference
   * @return reference
  */
  @ApiModelProperty(example = "reference", value = "")
  public String getReference() {
    return reference;
  }

  /**
   * Get credit
   * @return credit
  */
  @ApiModelProperty(example = "55000", value = "")
  public Integer getCredit() {
    return credit;
  }
}

