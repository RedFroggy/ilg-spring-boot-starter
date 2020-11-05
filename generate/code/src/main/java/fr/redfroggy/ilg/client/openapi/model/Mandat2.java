package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Address10;
import fr.redfroggy.ilg.client.openapi.model.ExecutiveFonction5;
import fr.redfroggy.ilg.client.openapi.model.ExecutiveMouvement3;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Mandat2
 */

public class Mandat2   {
  @JsonProperty("siren")
  private String siren;

  @JsonProperty("raisonSociale")
  private String raisonSociale;

  @JsonProperty("adresse")
  private Address10 adresse;

  @JsonProperty("fonction")
  private ExecutiveFonction5 fonction;

  @JsonProperty("mouvement")
  private ExecutiveMouvement3 mouvement;

  @JsonProperty("score")
  private Integer score;

  @JsonProperty("risk_label")
  private Integer riskLabel;

  public Mandat2 siren(String siren) {
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

  public Mandat2 raisonSociale(String raisonSociale) {
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

  public Mandat2 adresse(Address10 adresse) {
    this.adresse = adresse;
    return this;
  }

  /**
   * Get adresse
   * @return adresse
  */
  @ApiModelProperty(value = "")

  @Valid

  public Address10 getAdresse() {
    return adresse;
  }

  public void setAdresse(Address10 adresse) {
    this.adresse = adresse;
  }

  public Mandat2 fonction(ExecutiveFonction5 fonction) {
    this.fonction = fonction;
    return this;
  }

  /**
   * Get fonction
   * @return fonction
  */
  @ApiModelProperty(value = "")

  @Valid

  public ExecutiveFonction5 getFonction() {
    return fonction;
  }

  public void setFonction(ExecutiveFonction5 fonction) {
    this.fonction = fonction;
  }

  public Mandat2 mouvement(ExecutiveMouvement3 mouvement) {
    this.mouvement = mouvement;
    return this;
  }

  /**
   * Get mouvement
   * @return mouvement
  */
  @ApiModelProperty(value = "")

  @Valid

  public ExecutiveMouvement3 getMouvement() {
    return mouvement;
  }

  public void setMouvement(ExecutiveMouvement3 mouvement) {
    this.mouvement = mouvement;
  }

  public Mandat2 score(Integer score) {
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

  public Mandat2 riskLabel(Integer riskLabel) {
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
    Mandat2 mandat2 = (Mandat2) o;
    return Objects.equals(this.siren, mandat2.siren) &&
        Objects.equals(this.raisonSociale, mandat2.raisonSociale) &&
        Objects.equals(this.adresse, mandat2.adresse) &&
        Objects.equals(this.fonction, mandat2.fonction) &&
        Objects.equals(this.mouvement, mandat2.mouvement) &&
        Objects.equals(this.score, mandat2.score) &&
        Objects.equals(this.riskLabel, mandat2.riskLabel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(siren, raisonSociale, adresse, fonction, mouvement, score, riskLabel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mandat2 {\n");
    
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

