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
 * CompanySearchGeneric
 */

public class CompanySearchGeneric   {
  @JsonProperty("results")
  @Valid
  private List<CompanySearchResult> results = null;

  @JsonProperty("count")
  private Integer count;

  @JsonProperty("found")
  private Integer found;

  public CompanySearchGeneric results(List<CompanySearchResult> results) {
    this.results = results;
    return this;
  }

  public CompanySearchGeneric addResultsItem(CompanySearchResult resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
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

  public void setResults(List<CompanySearchResult> results) {
    this.results = results;
  }

  public CompanySearchGeneric count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Number of search elements
   * @return count
  */
  @ApiModelProperty(value = "Number of search elements")


  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public CompanySearchGeneric found(Integer found) {
    this.found = found;
    return this;
  }

  /**
   * Total number of result for search
   * @return found
  */
  @ApiModelProperty(value = "Total number of result for search")


  public Integer getFound() {
    return found;
  }

  public void setFound(Integer found) {
    this.found = found;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanySearchGeneric companySearchGeneric = (CompanySearchGeneric) o;
    return Objects.equals(this.results, companySearchGeneric.results) &&
        Objects.equals(this.count, companySearchGeneric.count) &&
        Objects.equals(this.found, companySearchGeneric.found);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, count, found);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanySearchGeneric {\n");
    
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    found: ").append(toIndentedString(found)).append("\n");
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

