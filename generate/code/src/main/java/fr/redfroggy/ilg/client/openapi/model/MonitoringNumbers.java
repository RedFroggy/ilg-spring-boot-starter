package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MonitoringNumbers
 */

public class MonitoringNumbers   {
  @JsonProperty("nbitems")
  private Integer nbitems;

  @JsonProperty("nbSubscriptions")
  private Integer nbSubscriptions;

  @JsonProperty("nbPortfolios")
  private Integer nbPortfolios;

  public MonitoringNumbers nbitems(Integer nbitems) {
    this.nbitems = nbitems;
    return this;
  }

  /**
   * Number of items
   * @return nbitems
  */
  @ApiModelProperty(example = "2", value = "Number of items")


  public Integer getNbitems() {
    return nbitems;
  }

  public void setNbitems(Integer nbitems) {
    this.nbitems = nbitems;
  }

  public MonitoringNumbers nbSubscriptions(Integer nbSubscriptions) {
    this.nbSubscriptions = nbSubscriptions;
    return this;
  }

  /**
   * Number of subscriptions
   * @return nbSubscriptions
  */
  @ApiModelProperty(example = "2", value = "Number of subscriptions")


  public Integer getNbSubscriptions() {
    return nbSubscriptions;
  }

  public void setNbSubscriptions(Integer nbSubscriptions) {
    this.nbSubscriptions = nbSubscriptions;
  }

  public MonitoringNumbers nbPortfolios(Integer nbPortfolios) {
    this.nbPortfolios = nbPortfolios;
    return this;
  }

  /**
   * Number of portfolios
   * @return nbPortfolios
  */
  @ApiModelProperty(example = "2", value = "Number of portfolios")


  public Integer getNbPortfolios() {
    return nbPortfolios;
  }

  public void setNbPortfolios(Integer nbPortfolios) {
    this.nbPortfolios = nbPortfolios;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitoringNumbers monitoringNumbers = (MonitoringNumbers) o;
    return Objects.equals(this.nbitems, monitoringNumbers.nbitems) &&
        Objects.equals(this.nbSubscriptions, monitoringNumbers.nbSubscriptions) &&
        Objects.equals(this.nbPortfolios, monitoringNumbers.nbPortfolios);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nbitems, nbSubscriptions, nbPortfolios);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitoringNumbers {\n");
    
    sb.append("    nbitems: ").append(toIndentedString(nbitems)).append("\n");
    sb.append("    nbSubscriptions: ").append(toIndentedString(nbSubscriptions)).append("\n");
    sb.append("    nbPortfolios: ").append(toIndentedString(nbPortfolios)).append("\n");
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

