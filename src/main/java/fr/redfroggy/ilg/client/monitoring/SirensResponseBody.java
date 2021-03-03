package fr.redfroggy.ilg.client.monitoring;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * List of Siren
 */

public class SirensResponseBody {

  private final List<String> sirens;

  public SirensResponseBody(@JsonProperty("sirens") List<String> sirens) {
    this.sirens = sirens;
  }

  /**
   * Get sirens
   * @return sirens
  */
  @ApiModelProperty(value = "")
  public List<String> getSirens() {
    return sirens;
  }
}

