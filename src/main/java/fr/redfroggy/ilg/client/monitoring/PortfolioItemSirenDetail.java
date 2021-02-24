package fr.redfroggy.ilg.client.monitoring;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * PortfolioItemSirenDetail
 */

public class PortfolioItemSirenDetail {

  private final Integer siren;

  private final String reference;

  private final String credit;

  public PortfolioItemSirenDetail(@JsonProperty("siren") Integer siren,
                                  @JsonProperty("reference") String reference,
                                  @JsonProperty("credit") String credit) {
    this.siren = siren;
    this.reference = reference;
    this.credit = credit;
  }


  /**
   * unique identifier of company
   * @return siren
  */
  @ApiModelProperty(value = "unique identifier of company")
  public Integer getSiren() {
    return siren;
  }

  /**
   * reference
   * @return reference
  */
  @ApiModelProperty(value = "reference")
  public String getReference() {
    return reference;
  }

  /**
   * credit
   * @return credit
  */
  @ApiModelProperty(value = "credit")
  public String getCredit() {
    return credit;
  }

}

