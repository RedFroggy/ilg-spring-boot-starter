package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Mandat2;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CompanyMandats
 */

public class CompanyMandats   {
  @JsonProperty("mandats")
  @Valid
  private List<Mandat2> mandats = null;

  public CompanyMandats mandats(List<Mandat2> mandats) {
    this.mandats = mandats;
    return this;
  }

  public CompanyMandats addMandatsItem(Mandat2 mandatsItem) {
    if (this.mandats == null) {
      this.mandats = new ArrayList<>();
    }
    this.mandats.add(mandatsItem);
    return this;
  }

  /**
   * List of assignement
   * @return mandats
  */
  @ApiModelProperty(value = "List of assignement")

  @Valid

  public List<Mandat2> getMandats() {
    return mandats;
  }

  public void setMandats(List<Mandat2> mandats) {
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
    CompanyMandats companyMandats = (CompanyMandats) o;
    return Objects.equals(this.mandats, companyMandats.mandats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mandats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyMandats {\n");
    
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

