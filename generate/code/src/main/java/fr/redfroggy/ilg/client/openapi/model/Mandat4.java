package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Address18;
import fr.redfroggy.ilg.client.openapi.model.ExecutiveMouvement4;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Mandat4
 */

public class Mandat4   {
  @JsonProperty("siren")
  private String siren;

  @JsonProperty("raisonSociale")
  private String raisonSociale;

  @JsonProperty("adresse")
  private Address18 adresse;

  @JsonProperty("mouvements")
  @Valid
  private List<ExecutiveMouvement4> mouvements = null;

  @JsonProperty("score")
  private Integer score;

  @JsonProperty("risk_label")
  private Integer riskLabel;

  public Mandat4 siren(String siren) {
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

  public Mandat4 raisonSociale(String raisonSociale) {
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

  public Mandat4 adresse(Address18 adresse) {
    this.adresse = adresse;
    return this;
  }

  /**
   * Get adresse
   * @return adresse
  */
  @ApiModelProperty(value = "")

  @Valid

  public Address18 getAdresse() {
    return adresse;
  }

  public void setAdresse(Address18 adresse) {
    this.adresse = adresse;
  }

  public Mandat4 mouvements(List<ExecutiveMouvement4> mouvements) {
    this.mouvements = mouvements;
    return this;
  }

  public Mandat4 addMouvementsItem(ExecutiveMouvement4 mouvementsItem) {
    if (this.mouvements == null) {
      this.mouvements = new ArrayList<>();
    }
    this.mouvements.add(mouvementsItem);
    return this;
  }

  /**
   * 
   * @return mouvements
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ExecutiveMouvement4> getMouvements() {
    return mouvements;
  }

  public void setMouvements(List<ExecutiveMouvement4> mouvements) {
    this.mouvements = mouvements;
  }

  public Mandat4 score(Integer score) {
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

  public Mandat4 riskLabel(Integer riskLabel) {
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
    Mandat4 mandat4 = (Mandat4) o;
    return Objects.equals(this.siren, mandat4.siren) &&
        Objects.equals(this.raisonSociale, mandat4.raisonSociale) &&
        Objects.equals(this.adresse, mandat4.adresse) &&
        Objects.equals(this.mouvements, mandat4.mouvements) &&
        Objects.equals(this.score, mandat4.score) &&
        Objects.equals(this.riskLabel, mandat4.riskLabel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(siren, raisonSociale, adresse, mouvements, score, riskLabel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mandat4 {\n");
    
    sb.append("    siren: ").append(toIndentedString(siren)).append("\n");
    sb.append("    raisonSociale: ").append(toIndentedString(raisonSociale)).append("\n");
    sb.append("    adresse: ").append(toIndentedString(adresse)).append("\n");
    sb.append("    mouvements: ").append(toIndentedString(mouvements)).append("\n");
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

