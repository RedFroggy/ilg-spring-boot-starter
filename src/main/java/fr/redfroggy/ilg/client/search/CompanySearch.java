package fr.redfroggy.ilg.client.search;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;

import java.util.List;

/**
 * CompanySearch
 */
@JsonDeserialize(builder = CompanySearch.CompanySearchBuilder.class)
public class CompanySearch  {

  private final List<CompanySearchResult> companies;

  private final List<CompanySearchResult> executives;

  private final Integer count;

  private final Integer countExecutives;

  private final Integer found;

  private final Integer foundExecutives;

  private CompanySearch(CompanySearchBuilder builder) {
    this.companies = builder.companies;
    this.executives = builder.executives;
    this.count = builder.count;
    this.countExecutives = builder.countExecutives;
    this.found = builder.found;
    this.foundExecutives = builder.foundExecutives;
  }

  /**
   * 
   * @return companies
  */
  @ApiModelProperty(value = "")
  @Valid
  public List<CompanySearchResult> getCompanies() {
    return companies;
  }

  /**
   * 
   * @return executives
  */
  @ApiModelProperty(value = "")
  @Valid
  public List<CompanySearchResult> getExecutives() {
    return executives;
  }

  /**
   * Number of companies
   * @return count
  */
  @ApiModelProperty(value = "Number of companies")
  public Integer getCount() {
    return count;
  }

  /**
   * Number of executives
   * @return countExecutives
  */
  @ApiModelProperty(value = "Number of executives")
  public Integer getCountExecutives() {
    return countExecutives;
  }

  /**
   * Total number of result for companies
   * @return found
  */
  @ApiModelProperty(value = "Total number of result for companies")
  public Integer getFound() {
    return found;
  }

  /**
   * Total number of result for executives
   * @return foundExecutives
  */
  @ApiModelProperty(value = "Total number of result for executives")
  public Integer getFoundExecutives() {
    return foundExecutives;
  }

  public static CompanySearchBuilder builder() {
    return new CompanySearchBuilder();
  }

  @JsonPOJOBuilder(withPrefix = "")
  public static final class CompanySearchBuilder {
    private List<CompanySearchResult> companies;
    private List<CompanySearchResult> executives;
    private Integer count;
    private Integer countExecutives;
    private Integer found;
    private Integer foundExecutives;

    private CompanySearchBuilder() {
    }

    public CompanySearchBuilder companies(List<CompanySearchResult> companies) {
      this.companies = companies;
      return this;
    }

    public CompanySearchBuilder executives(List<CompanySearchResult> executives) {
      this.executives = executives;
      return this;
    }

    public CompanySearchBuilder count(Integer count) {
      this.count = count;
      return this;
    }

    public CompanySearchBuilder countExecutives(Integer countExecutives) {
      this.countExecutives = countExecutives;
      return this;
    }

    public CompanySearchBuilder found(Integer found) {
      this.found = found;
      return this;
    }

    public CompanySearchBuilder foundExecutives(Integer foundExecutives) {
      this.foundExecutives = foundExecutives;
      return this;
    }

    public CompanySearch build() {
      return new CompanySearch(this);
    }
  }
}

