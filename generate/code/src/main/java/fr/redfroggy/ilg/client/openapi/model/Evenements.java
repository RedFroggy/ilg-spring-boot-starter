package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Evenement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Evenements
 */

public class Evenements   {
  @JsonProperty("evenement")
  @Valid
  private List<Evenement> evenement = null;

  public Evenements evenement(List<Evenement> evenement) {
    this.evenement = evenement;
    return this;
  }

  public Evenements addEvenementItem(Evenement evenementItem) {
    if (this.evenement == null) {
      this.evenement = new ArrayList<>();
    }
    this.evenement.add(evenementItem);
    return this;
  }

  /**
   * 
   * @return evenement
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Evenement> getEvenement() {
    return evenement;
  }

  public void setEvenement(List<Evenement> evenement) {
    this.evenement = evenement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Evenements evenements = (Evenements) o;
    return Objects.equals(this.evenement, evenements.evenement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evenement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Evenements {\n");
    
    sb.append("    evenement: ").append(toIndentedString(evenement)).append("\n");
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

