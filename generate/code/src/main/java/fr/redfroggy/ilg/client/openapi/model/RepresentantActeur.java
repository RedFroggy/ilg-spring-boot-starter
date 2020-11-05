package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.IdentiteActeur;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RepresentantActeur
 */

public class RepresentantActeur   {
  @JsonProperty("identiteActeur")
  private IdentiteActeur identiteActeur;

  public RepresentantActeur identiteActeur(IdentiteActeur identiteActeur) {
    this.identiteActeur = identiteActeur;
    return this;
  }

  /**
   * Get identiteActeur
   * @return identiteActeur
  */
  @ApiModelProperty(value = "")

  @Valid

  public IdentiteActeur getIdentiteActeur() {
    return identiteActeur;
  }

  public void setIdentiteActeur(IdentiteActeur identiteActeur) {
    this.identiteActeur = identiteActeur;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepresentantActeur representantActeur = (RepresentantActeur) o;
    return Objects.equals(this.identiteActeur, representantActeur.identiteActeur);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identiteActeur);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepresentantActeur {\n");
    
    sb.append("    identiteActeur: ").append(toIndentedString(identiteActeur)).append("\n");
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

