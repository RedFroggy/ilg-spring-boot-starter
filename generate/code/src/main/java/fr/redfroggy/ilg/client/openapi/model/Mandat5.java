package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Address19;
import fr.redfroggy.ilg.client.openapi.model.Term3;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Mandat5
 */

public class Mandat5   {
  @JsonProperty("siren")
  private String siren;

  @JsonProperty("raisonSociale")
  private String raisonSociale;

  @JsonProperty("adresse")
  private Address19 adresse;

  @JsonProperty("regroupings")
  @Valid
  private List<Term3> regroupings = null;

  @JsonProperty("score")
  private Integer score;

  @JsonProperty("risk_label")
  private Integer riskLabel;

  public Mandat5 siren(String siren) {
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

  public Mandat5 raisonSociale(String raisonSociale) {
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

  public Mandat5 adresse(Address19 adresse) {
    this.adresse = adresse;
    return this;
  }

  /**
   * Get adresse
   * @return adresse
  */
  @ApiModelProperty(value = "")

  @Valid

  public Address19 getAdresse() {
    return adresse;
  }

  public void setAdresse(Address19 adresse) {
    this.adresse = adresse;
  }

  public Mandat5 regroupings(List<Term3> regroupings) {
    this.regroupings = regroupings;
    return this;
  }

  public Mandat5 addRegroupingsItem(Term3 regroupingsItem) {
    if (this.regroupings == null) {
      this.regroupings = new ArrayList<>();
    }
    this.regroupings.add(regroupingsItem);
    return this;
  }

  /**
   * List of term of offices
   * @return regroupings
  */
  @ApiModelProperty(value = "List of term of offices")

  @Valid

  public List<Term3> getRegroupings() {
    return regroupings;
  }

  public void setRegroupings(List<Term3> regroupings) {
    this.regroupings = regroupings;
  }

  public Mandat5 score(Integer score) {
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

  public Mandat5 riskLabel(Integer riskLabel) {
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
    Mandat5 mandat5 = (Mandat5) o;
    return Objects.equals(this.siren, mandat5.siren) &&
        Objects.equals(this.raisonSociale, mandat5.raisonSociale) &&
        Objects.equals(this.adresse, mandat5.adresse) &&
        Objects.equals(this.regroupings, mandat5.regroupings) &&
        Objects.equals(this.score, mandat5.score) &&
        Objects.equals(this.riskLabel, mandat5.riskLabel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(siren, raisonSociale, adresse, regroupings, score, riskLabel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mandat5 {\n");
    
    sb.append("    siren: ").append(toIndentedString(siren)).append("\n");
    sb.append("    raisonSociale: ").append(toIndentedString(raisonSociale)).append("\n");
    sb.append("    adresse: ").append(toIndentedString(adresse)).append("\n");
    sb.append("    regroupings: ").append(toIndentedString(regroupings)).append("\n");
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

