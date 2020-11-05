package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Balance2;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Balances
 */

public class Balances   {
  @JsonProperty("balances")
  @Valid
  private List<Balance2> balances = null;

  @JsonProperty("count")
  private Integer count;

  public Balances balances(List<Balance2> balances) {
    this.balances = balances;
    return this;
  }

  public Balances addBalancesItem(Balance2 balancesItem) {
    if (this.balances == null) {
      this.balances = new ArrayList<>();
    }
    this.balances.add(balancesItem);
    return this;
  }

  /**
   * List of Balance object
   * @return balances
  */
  @ApiModelProperty(value = "List of Balance object")

  @Valid

  public List<Balance2> getBalances() {
    return balances;
  }

  public void setBalances(List<Balance2> balances) {
    this.balances = balances;
  }

  public Balances count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Number of Balance
   * @return count
  */
  @ApiModelProperty(example = "1", value = "Number of Balance")


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
    Balances balances = (Balances) o;
    return Objects.equals(this.balances, balances.balances) &&
        Objects.equals(this.count, balances.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balances, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Balances {\n");
    
    sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
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

