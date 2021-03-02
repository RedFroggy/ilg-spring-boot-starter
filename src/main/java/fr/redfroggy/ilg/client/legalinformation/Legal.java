package fr.redfroggy.ilg.client.legalinformation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;

/**
 * Legal
 */
@JsonIgnoreProperties(value = {"@id"})
public class Legal {

  private final LegalDepositList deposits;

  private final LegalStatus status;

  public Legal(@JsonProperty("deposits") LegalDepositList deposits,
               @JsonProperty("status") LegalStatus status) {
    this.deposits = deposits;
    this.status = status;
  }

  /**
   * Get deposits
   * @return deposits
  */
  @ApiModelProperty(value = "")
  @Valid
  public LegalDepositList getDeposits() {
    return deposits;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(value = "")
  @Valid
  public LegalStatus getStatus() {
    return status;
  }

}

