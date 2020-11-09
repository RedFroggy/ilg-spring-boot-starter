package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import fr.redfroggy.ilg.client.company.KycProjection;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;

/**
 * Kyc
 */
public class Kyc implements KycProjection {

  private final Object ubo;

  private final Object conformity;

  public Kyc(@JsonProperty("ubo") Object ubo,
             @JsonProperty("conformity") Object conformity) {
    this.ubo = ubo;
    this.conformity = conformity;
  }

  /**
   * Get ubo
   * @return ubo
  */
  @Override
  @ApiModelProperty(value = "")
  @Valid
  public Object getUbo() {
    return ubo;
  }

  /**
   * Get conformity
   * @return conformity
  */
  @Override
  @ApiModelProperty(value = "")
  @Valid
  public Object getConformity() {
    return conformity;
  }

}

