package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Dirigeants;
import fr.redfroggy.ilg.client.openapi.model.Identite;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Personne
 */

public class Personne   {
  @JsonProperty("identite")
  private Identite identite;

  @JsonProperty("dirigeants")
  private Dirigeants dirigeants;

  @JsonProperty("administration")
  private String administration;

  public Personne identite(Identite identite) {
    this.identite = identite;
    return this;
  }

  /**
   * Get identite
   * @return identite
  */
  @ApiModelProperty(value = "")

  @Valid

  public Identite getIdentite() {
    return identite;
  }

  public void setIdentite(Identite identite) {
    this.identite = identite;
  }

  public Personne dirigeants(Dirigeants dirigeants) {
    this.dirigeants = dirigeants;
    return this;
  }

  /**
   * Get dirigeants
   * @return dirigeants
  */
  @ApiModelProperty(value = "")

  @Valid

  public Dirigeants getDirigeants() {
    return dirigeants;
  }

  public void setDirigeants(Dirigeants dirigeants) {
    this.dirigeants = dirigeants;
  }

  public Personne administration(String administration) {
    this.administration = administration;
    return this;
  }

  /**
   * Administration
   * @return administration
  */
  @ApiModelProperty(value = "Administration")


  public String getAdministration() {
    return administration;
  }

  public void setAdministration(String administration) {
    this.administration = administration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Personne personne = (Personne) o;
    return Objects.equals(this.identite, personne.identite) &&
        Objects.equals(this.dirigeants, personne.dirigeants) &&
        Objects.equals(this.administration, personne.administration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identite, dirigeants, administration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Personne {\n");
    
    sb.append("    identite: ").append(toIndentedString(identite)).append("\n");
    sb.append("    dirigeants: ").append(toIndentedString(dirigeants)).append("\n");
    sb.append("    administration: ").append(toIndentedString(administration)).append("\n");
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

