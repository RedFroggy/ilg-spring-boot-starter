package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.CessionInfo;
import fr.redfroggy.ilg.client.openapi.model.IdentiteActeur;
import fr.redfroggy.ilg.client.openapi.model.Role;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ActeurCession
 */

public class ActeurCession   {
  @JsonProperty("typeActeur")
  private Role typeActeur;

  @JsonProperty("identiteActeur")
  private IdentiteActeur identiteActeur;

  @JsonProperty("cessionInfo")
  private CessionInfo cessionInfo;

  public ActeurCession typeActeur(Role typeActeur) {
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

  public ActeurCession identiteActeur(IdentiteActeur identiteActeur) {
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

  public ActeurCession cessionInfo(CessionInfo cessionInfo) {
    this.cessionInfo = cessionInfo;
    return this;
  }

  /**
   * Get cessionInfo
   * @return cessionInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public CessionInfo getCessionInfo() {
    return cessionInfo;
  }

  public void setCessionInfo(CessionInfo cessionInfo) {
    this.cessionInfo = cessionInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActeurCession acteurCession = (ActeurCession) o;
    return Objects.equals(this.typeActeur, acteurCession.typeActeur) &&
        Objects.equals(this.identiteActeur, acteurCession.identiteActeur) &&
        Objects.equals(this.cessionInfo, acteurCession.cessionInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeActeur, identiteActeur, cessionInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActeurCession {\n");
    
    sb.append("    typeActeur: ").append(toIndentedString(typeActeur)).append("\n");
    sb.append("    identiteActeur: ").append(toIndentedString(identiteActeur)).append("\n");
    sb.append("    cessionInfo: ").append(toIndentedString(cessionInfo)).append("\n");
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

