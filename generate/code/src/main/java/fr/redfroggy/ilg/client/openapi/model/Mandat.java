package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Address3;
import fr.redfroggy.ilg.client.openapi.model.ExecutiveFonction2;
import fr.redfroggy.ilg.client.openapi.model.ExecutiveMouvement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Mandat
 */

public class Mandat   {
  @JsonProperty("siren")
  private String siren;

  @JsonProperty("raisonSociale")
  private String raisonSociale;

  @JsonProperty("adresse")
  private Address3 adresse;

  @JsonProperty("fonction")
  private ExecutiveFonction2 fonction;

  @JsonProperty("mouvement")
  private ExecutiveMouvement mouvement;

  @JsonProperty("score")
  private Integer score;

  @JsonProperty("risk_label")
  private Integer riskLabel;

  public Mandat siren(String siren) {
    this.siren = siren;
    return this;
  }

  /**
   * Company Identifier (Only available in France)
   * @return siren
  */
  @ApiModelProperty(example = "0123456789", value = "Company Identifier (Only available in France)")


  public String getSiren() {
    return siren;
  }

  public void setSiren(String siren) {
    this.siren = siren;
  }

  public Mandat raisonSociale(String raisonSociale) {
    this.raisonSociale = raisonSociale;
    return this;
  }

  /**
   * Company name
   * @return raisonSociale
  */
  @ApiModelProperty(example = "Great Company", value = "Company name")


  public String getRaisonSociale() {
    return raisonSociale;
  }

  public void setRaisonSociale(String raisonSociale) {
    this.raisonSociale = raisonSociale;
  }

  public Mandat adresse(Address3 adresse) {
    this.adresse = adresse;
    return this;
  }

  /**
   * Get adresse
   * @return adresse
  */
  @ApiModelProperty(value = "")

  @Valid

  public Address3 getAdresse() {
    return adresse;
  }

  public void setAdresse(Address3 adresse) {
    this.adresse = adresse;
  }

  public Mandat fonction(ExecutiveFonction2 fonction) {
    this.fonction = fonction;
    return this;
  }

  /**
   * Get fonction
   * @return fonction
  */
  @ApiModelProperty(value = "")

  @Valid

  public ExecutiveFonction2 getFonction() {
    return fonction;
  }

  public void setFonction(ExecutiveFonction2 fonction) {
    this.fonction = fonction;
  }

  public Mandat mouvement(ExecutiveMouvement mouvement) {
    this.mouvement = mouvement;
    return this;
  }

  /**
   * Get mouvement
   * @return mouvement
  */
  @ApiModelProperty(value = "")

  @Valid

  public ExecutiveMouvement getMouvement() {
    return mouvement;
  }

  public void setMouvement(ExecutiveMouvement mouvement) {
    this.mouvement = mouvement;
  }

  public Mandat score(Integer score) {
    this.score = score;
    return this;
  }

  /**
   * Score of the company
   * @return score
  */
  @ApiModelProperty(value = "Score of the company")


  public Integer getScore() {
    return score;
  }

  public void setScore(Integer score) {
    this.score = score;
  }

  public Mandat riskLabel(Integer riskLabel) {
    this.riskLabel = riskLabel;
    return this;
  }

  /**
   * Score risk of the company
   * @return riskLabel
  */
  @ApiModelProperty(value = "Score risk of the company")


  public Integer getRiskLabel() {
    return riskLabel;
  }

  public void setRiskLabel(Integer riskLabel) {
    this.riskLabel = riskLabel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Mandat mandat = (Mandat) o;
    return Objects.equals(this.siren, mandat.siren) &&
        Objects.equals(this.raisonSociale, mandat.raisonSociale) &&
        Objects.equals(this.adresse, mandat.adresse) &&
        Objects.equals(this.fonction, mandat.fonction) &&
        Objects.equals(this.mouvement, mandat.mouvement) &&
        Objects.equals(this.score, mandat.score) &&
        Objects.equals(this.riskLabel, mandat.riskLabel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(siren, raisonSociale, adresse, fonction, mouvement, score, riskLabel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mandat {\n");
    
    sb.append("    siren: ").append(toIndentedString(siren)).append("\n");
    sb.append("    raisonSociale: ").append(toIndentedString(raisonSociale)).append("\n");
    sb.append("    adresse: ").append(toIndentedString(adresse)).append("\n");
    sb.append("    fonction: ").append(toIndentedString(fonction)).append("\n");
    sb.append("    mouvement: ").append(toIndentedString(mouvement)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    riskLabel: ").append(toIndentedString(riskLabel)).append("\n");
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

