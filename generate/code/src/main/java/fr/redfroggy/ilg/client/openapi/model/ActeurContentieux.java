package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.IdentiteActeur;
import fr.redfroggy.ilg.client.openapi.model.RepresentantActeur;
import fr.redfroggy.ilg.client.openapi.model.Role;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ActeurContentieux
 */

public class ActeurContentieux   {
  @JsonProperty("identiteActeur")
  private IdentiteActeur identiteActeur;

  @JsonProperty("typeActeur")
  private Role typeActeur;

  @JsonProperty("representantActeur")
  private RepresentantActeur representantActeur;

  public ActeurContentieux identiteActeur(IdentiteActeur identiteActeur) {
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

  public ActeurContentieux typeActeur(Role typeActeur) {
    this.typeActeur = typeActeur;
    return this;
  }

  /**
   * Get typeActeur
   * @return typeActeur
  */
  @ApiModelProperty(value = "")

  @Valid

  public Role getTypeActeur() {
    return typeActeur;
  }

  public void setTypeActeur(Role typeActeur) {
    this.typeActeur = typeActeur;
  }

  public ActeurContentieux representantActeur(RepresentantActeur representantActeur) {
    this.representantActeur = representantActeur;
    return this;
  }

  /**
   * Get representantActeur
   * @return representantActeur
  */
  @ApiModelProperty(value = "")

  @Valid

  public RepresentantActeur getRepresentantActeur() {
    return representantActeur;
  }

  public void setRepresentantActeur(RepresentantActeur representantActeur) {
    this.representantActeur = representantActeur;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActeurContentieux acteurContentieux = (ActeurContentieux) o;
    return Objects.equals(this.identiteActeur, acteurContentieux.identiteActeur) &&
        Objects.equals(this.typeActeur, acteurContentieux.typeActeur) &&
        Objects.equals(this.representantActeur, acteurContentieux.representantActeur);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identiteActeur, typeActeur, representantActeur);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActeurContentieux {\n");
    
    sb.append("    identiteActeur: ").append(toIndentedString(identiteActeur)).append("\n");
    sb.append("    typeActeur: ").append(toIndentedString(typeActeur)).append("\n");
    sb.append("    representantActeur: ").append(toIndentedString(representantActeur)).append("\n");
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

