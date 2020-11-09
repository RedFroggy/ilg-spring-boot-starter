package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PortfolioItems2
 */

public class PortfolioItems2   {
  @JsonProperty("sirens")
  @Valid
  private List<String> sirens = null;

  public PortfolioItems2 sirens(List<String> sirens) {
    this.sirens = sirens;
    return this;
  }

  public PortfolioItems2 addSirensItem(String sirensItem) {
    if (this.sirens == null) {
      this.sirens = new ArrayList<>();
    }
    this.sirens.add(sirensItem);
    return this;
  }

  /**
   * siren
   * @return sirens
  */
  @ApiModelProperty(value = "siren")


  public List<String> getSirens() {
    return sirens;
  }

  public void setSirens(List<String> sirens) {
    this.sirens = sirens;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortfolioItems2 portfolioItems2 = (PortfolioItems2) o;
    return Objects.equals(this.sirens, portfolioItems2.sirens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sirens);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortfolioItems2 {\n");
    
    sb.append("    sirens: ").append(toIndentedString(sirens)).append("\n");
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

