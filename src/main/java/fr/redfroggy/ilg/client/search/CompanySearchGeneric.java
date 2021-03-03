package fr.redfroggy.ilg.client.search;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.List;

/**
 * CompanySearchGeneric
 */
public class CompanySearchGeneric   {

  private final List<CompanySearchResult> results;

  private final Integer count;

  private final Integer found;

  public CompanySearchGeneric(@JsonProperty("results") List<CompanySearchResult> results,
                              @JsonProperty("count") Integer count,
                              @JsonProperty("found") Integer found) {
    this.results = results;
    this.count = count;
    this.found = found;
  }

  /**
   * 
   * @return results
  */
  @ApiModelProperty(value = "")
  @Valid
  public List<CompanySearchResult> getResults() {
    return results;
  }

  /**
   * Number of search elements
   * @return count
  */
  @ApiModelProperty(value = "Number of search elements")
  public Integer getCount() {
    return count;
  }

  /**
   * Total number of result for search
   * @return found
  */
  @ApiModelProperty(value = "Total number of result for search")
  public Integer getFound() {
    return found;
  }

}

