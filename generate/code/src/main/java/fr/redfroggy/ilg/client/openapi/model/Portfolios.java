package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Portfolio3;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Portfolios
 */

public class Portfolios   {
  @JsonProperty("portfolios")
  @Valid
  private List<Portfolio3> portfolios = null;

  @JsonProperty("count")
  private Integer count;

  public Portfolios portfolios(List<Portfolio3> portfolios) {
    this.portfolios = portfolios;
    return this;
  }

  public Portfolios addPortfoliosItem(Portfolio3 portfoliosItem) {
    if (this.portfolios == null) {
      this.portfolios = new ArrayList<>();
    }
    this.portfolios.add(portfoliosItem);
    return this;
  }

  /**
   * List of portfolios
   * @return portfolios
  */
  @ApiModelProperty(value = "List of portfolios")

  @Valid

  public List<Portfolio3> getPortfolios() {
    return portfolios;
  }

  public void setPortfolios(List<Portfolio3> portfolios) {
    this.portfolios = portfolios;
  }

  public Portfolios count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Number of portfolios
   * @return count
  */
  @ApiModelProperty(example = "1", value = "Number of portfolios")


  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Portfolios portfolios = (Portfolios) o;
    return Objects.equals(this.portfolios, portfolios.portfolios) &&
        Objects.equals(this.count, portfolios.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portfolios, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Portfolios {\n");
    
    sb.append("    portfolios: ").append(toIndentedString(portfolios)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

