package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Etablissement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Etablissements
 */

public class Etablissements   {
  @JsonProperty("etablissement")
  @Valid
  private List<Etablissement> etablissement = null;

  public Etablissements etablissement(List<Etablissement> etablissement) {
    this.etablissement = etablissement;
    return this;
  }

  public Etablissements addEtablissementItem(Etablissement etablissementItem) {
    if (this.etablissement == null) {
      this.etablissement = new ArrayList<>();
    }
    this.etablissement.add(etablissementItem);
    return this;
  }

  /**
   * 
   * @return etablissement
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Etablissement> getEtablissement() {
    return etablissement;
  }

  public void setEtablissement(List<Etablissement> etablissement) {
    this.etablissement = etablissement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Etablissements etablissements = (Etablissements) o;
    return Objects.equals(this.etablissement, etablissements.etablissement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etablissement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Etablissements {\n");
    
    sb.append("    etablissement: ").append(toIndentedString(etablissement)).append("\n");
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

