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
 * EtablissementsCession
 */

public class EtablissementsCession   {
  @JsonProperty("etablissementCession")
  @Valid
  private List<Etablissement> etablissementCession = null;

  public EtablissementsCession etablissementCession(List<Etablissement> etablissementCession) {
    this.etablissementCession = etablissementCession;
    return this;
  }

  public EtablissementsCession addEtablissementCessionItem(Etablissement etablissementCessionItem) {
    if (this.etablissementCession == null) {
      this.etablissementCession = new ArrayList<>();
    }
    this.etablissementCession.add(etablissementCessionItem);
    return this;
  }

  /**
   * 
   * @return etablissementCession
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Etablissement> getEtablissementCession() {
    return etablissementCession;
  }

  public void setEtablissementCession(List<Etablissement> etablissementCession) {
    this.etablissementCession = etablissementCession;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EtablissementsCession etablissementsCession = (EtablissementsCession) o;
    return Objects.equals(this.etablissementCession, etablissementsCession.etablissementCession);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etablissementCession);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EtablissementsCession {\n");
    
    sb.append("    etablissementCession: ").append(toIndentedString(etablissementCession)).append("\n");
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

