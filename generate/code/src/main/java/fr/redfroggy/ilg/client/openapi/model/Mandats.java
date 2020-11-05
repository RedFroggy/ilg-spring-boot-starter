package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Mandat4;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Mandats
 */

public class Mandats   {
  @JsonProperty("mandats")
  @Valid
  private List<Mandat4> mandats = null;

  public Mandats mandats(List<Mandat4> mandats) {
    this.mandats = mandats;
    return this;
  }

  public Mandats addMandatsItem(Mandat4 mandatsItem) {
    if (this.mandats == null) {
      this.mandats = new ArrayList<>();
    }
    this.mandats.add(mandatsItem);
    return this;
  }

  /**
   * 
   * @return mandats
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Mandat4> getMandats() {
    return mandats;
  }

  public void setMandats(List<Mandat4> mandats) {
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
    Mandats mandats = (Mandats) o;
    return Objects.equals(this.mandats, mandats.mandats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mandats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mandats {\n");
    
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

