package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.CompanySearchResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CompanySearch
 */

public class CompanySearch   {
  @JsonProperty("companies")
  @Valid
  private List<CompanySearchResult> companies = null;

  @JsonProperty("executives")
  @Valid
  private List<CompanySearchResult> executives = null;

  @JsonProperty("count")
  private Integer count;

  @JsonProperty("countExecutives")
  private Integer countExecutives;

  @JsonProperty("found")
  private Integer found;

  @JsonProperty("foundExecutives")
  private Integer foundExecutives;

  public CompanySearch companies(List<CompanySearchResult> companies) {
    this.companies = companies;
    return this;
  }

  public CompanySearch addCompaniesItem(CompanySearchResult companiesItem) {
    if (this.companies == null) {
      this.companies = new ArrayList<>();
    }
    this.companies.add(companiesItem);
    return this;
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

  public void setCompanies(List<CompanySearchResult> companies) {
    this.companies = companies;
  }

  public CompanySearch executives(List<CompanySearchResult> executives) {
    this.executives = executives;
    return this;
  }

  public CompanySearch addExecutivesItem(CompanySearchResult executivesItem) {
    if (this.executives == null) {
      this.executives = new ArrayList<>();
    }
    this.executives.add(executivesItem);
    return this;
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

  public void setExecutives(List<CompanySearchResult> executives) {
    this.executives = executives;
  }

  public CompanySearch count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Number of companies
   * @return count
  */
  @ApiModelProperty(value = "Number of companies")


  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public CompanySearch countExecutives(Integer countExecutives) {
    this.countExecutives = countExecutives;
    return this;
  }

  /**
   * Number of executives
   * @return countExecutives
  */
  @ApiModelProperty(value = "Number of executives")


  public Integer getCountExecutives() {
    return countExecutives;
  }

  public void setCountExecutives(Integer countExecutives) {
    this.countExecutives = countExecutives;
  }

  public CompanySearch found(Integer found) {
    this.found = found;
    return this;
  }

  /**
   * Total number of result for companies
   * @return found
  */
  @ApiModelProperty(value = "Total number of result for companies")


  public Integer getFound() {
    return found;
  }

  public void setFound(Integer found) {
    this.found = found;
  }

  public CompanySearch foundExecutives(Integer foundExecutives) {
    this.foundExecutives = foundExecutives;
    return this;
  }

  /**
   * Total number of result for executives
   * @return foundExecutives
  */
  @ApiModelProperty(value = "Total number of result for executives")


  public Integer getFoundExecutives() {
    return foundExecutives;
  }

  public void setFoundExecutives(Integer foundExecutives) {
    this.foundExecutives = foundExecutives;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanySearch companySearch = (CompanySearch) o;
    return Objects.equals(this.companies, companySearch.companies) &&
        Objects.equals(this.executives, companySearch.executives) &&
        Objects.equals(this.count, companySearch.count) &&
        Objects.equals(this.countExecutives, companySearch.countExecutives) &&
        Objects.equals(this.found, companySearch.found) &&
        Objects.equals(this.foundExecutives, companySearch.foundExecutives);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companies, executives, count, countExecutives, found, foundExecutives);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanySearch {\n");
    
    sb.append("    companies: ").append(toIndentedString(companies)).append("\n");
    sb.append("    executives: ").append(toIndentedString(executives)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    countExecutives: ").append(toIndentedString(countExecutives)).append("\n");
    sb.append("    found: ").append(toIndentedString(found)).append("\n");
    sb.append("    foundExecutives: ").append(toIndentedString(foundExecutives)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

