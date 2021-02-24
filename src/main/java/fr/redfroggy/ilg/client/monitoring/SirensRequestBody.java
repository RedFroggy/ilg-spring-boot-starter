package fr.redfroggy.ilg.client.monitoring;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * List of Siren
 */

public class SirensRequestBody {

  private final List<String> siren;

  public SirensRequestBody(@JsonProperty("siren") List<String> siren) {
    this.siren = siren;
  }

  /**
   * Get siren
   * @return siren
  */
  @ApiModelProperty(value = "")
  public List<String> getSiren() {
    return siren;
  }
}

