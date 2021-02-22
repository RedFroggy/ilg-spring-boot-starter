package fr.redfroggy.ilg.client.monitoring;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Arrays;
import java.util.List;

/**
 * PortfolioItemIds
 */

public class PortfolioItemIds {

  private final List<String> idsItems;

  public PortfolioItemIds(@JsonProperty("idsItems") List<String> idsItems) {
    this.idsItems = idsItems;
  }

  public PortfolioItemIds(String... idsItems) {
    this.idsItems = Arrays.asList(idsItems);
  }

  /**
   * Get idsItems
   * @return idsItems
  */
  @ApiModelProperty(value = "")
  public List<String> getIdsItems() {
    return idsItems;
  }

}

