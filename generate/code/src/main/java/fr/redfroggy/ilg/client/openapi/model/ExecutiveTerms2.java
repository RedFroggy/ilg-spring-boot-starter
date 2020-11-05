package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Mandat5;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExecutiveTerms2
 */

public class ExecutiveTerms2   {
  @JsonProperty("mandats")
  @Valid
  private List<Mandat5> mandats = null;

  public ExecutiveTerms2 mandats(List<Mandat5> mandats) {
    this.mandats = mandats;
    return this;
  }

  public ExecutiveTerms2 addMandatsItem(Mandat5 mandatsItem) {
    if (this.mandats == null) {
      this.mandats = new ArrayList<>();
    }
    this.mandats.add(mandatsItem);
    return this;
  }

  /**
   * List of term of office
   * @return mandats
  */
  @ApiModelProperty(value = "List of term of office")

  @Valid

  public List<Mandat5> getMandats() {
    return mandats;
  }

  public void setMandats(List<Mandat5> mandats) {
    this.mandats = mandats;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecutiveTerms2 executiveTerms2 = (ExecutiveTerms2) o;
    return Objects.equals(this.mandats, executiveTerms2.mandats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mandats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecutiveTerms2 {\n");
    
    sb.append("    mandats: ").append(toIndentedString(mandats)).append("\n");
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

