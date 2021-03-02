package fr.redfroggy.ilg.client.legalinformation;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * LegalActDecision
 */

public class LegalActDecision   {

  private final String type;

  private final String label;

  public LegalActDecision(@JsonProperty("type") String type,
                          @JsonProperty("label") String label) {
    this.type = type;
    this.label = label;
  }

  /**
   * Type of decision
   * @return type
  */
  @ApiModelProperty(value = "Type of decision")
  public String getType() {
    return type;
  }

  /**
   * Complementary information about the decision
   * @return label
  */
  @ApiModelProperty(value = "Complementary information about the decision")
  public String getLabel() {
    return label;
  }

}

