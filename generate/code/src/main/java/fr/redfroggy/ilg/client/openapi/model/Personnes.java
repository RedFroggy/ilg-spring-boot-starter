package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Personne;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Personnes
 */

public class Personnes   {
  @JsonProperty("personne")
  @Valid
  private List<Personne> personne = null;

  public Personnes personne(List<Personne> personne) {
    this.personne = personne;
    return this;
  }

  public Personnes addPersonneItem(Personne personneItem) {
    if (this.personne == null) {
      this.personne = new ArrayList<>();
    }
    this.personne.add(personneItem);
    return this;
  }

  /**
   * Array of personne
   * @return personne
  */
  @ApiModelProperty(value = "Array of personne")

  @Valid

  public List<Personne> getPersonne() {
    return personne;
  }

  public void setPersonne(List<Personne> personne) {
    this.personne = personne;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Personnes personnes = (Personnes) o;
    return Objects.equals(this.personne, personnes.personne);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personne);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Personnes {\n");
    
    sb.append("    personne: ").append(toIndentedString(personne)).append("\n");
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

