package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Address11;
import fr.redfroggy.ilg.client.openapi.model.Term2;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Mandat3
 */

public class Mandat3   {
  @JsonProperty("siren")
  private String siren;

  @JsonProperty("raisonSociale")
  private String raisonSociale;

  @JsonProperty("adresse")
  private Address11 adresse;

  @JsonProperty("regroupings")
  @Valid
  private List<Term2> regroupings = null;

  @JsonProperty("score")
  private Integer score;

  @JsonProperty("risk_label")
  private Integer riskLabel;

  public Mandat3 siren(String siren) {
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

  public Mandat3 raisonSociale(String raisonSociale) {
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

  public Mandat3 adresse(Address11 adresse) {
    this.adresse = adresse;
    return this;
  }

  /**
   * Get adresse
   * @return adresse
  */
  @ApiModelProperty(value = "")

  @Valid

  public Address11 getAdresse() {
    return adresse;
  }

  public void setAdresse(Address11 adresse) {
    this.adresse = adresse;
  }

  public Mandat3 regroupings(List<Term2> regroupings) {
    this.regroupings = regroupings;
    return this;
  }

  public Mandat3 addRegroupingsItem(Term2 regroupingsItem) {
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

  public List<Term2> getRegroupings() {
    return regroupings;
  }

  public void setRegroupings(List<Term2> regroupings) {
    this.regroupings = regroupings;
  }

  public Mandat3 score(Integer score) {
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

  public Mandat3 riskLabel(Integer riskLabel) {
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
    Mandat3 mandat3 = (Mandat3) o;
    return Objects.equals(this.siren, mandat3.siren) &&
        Objects.equals(this.raisonSociale, mandat3.raisonSociale) &&
        Objects.equals(this.adresse, mandat3.adresse) &&
        Objects.equals(this.regroupings, mandat3.regroupings) &&
        Objects.equals(this.score, mandat3.score) &&
        Objects.equals(this.riskLabel, mandat3.riskLabel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(siren, raisonSociale, adresse, regroupings, score, riskLabel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mandat3 {\n");
    
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

