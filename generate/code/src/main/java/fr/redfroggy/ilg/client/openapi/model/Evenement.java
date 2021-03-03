package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Identite;
import fr.redfroggy.ilg.client.openapi.model.ProcedureCollective;
import fr.redfroggy.ilg.client.openapi.model.Rectificatif;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Evenement
 */

public class Evenement   {
  @JsonProperty("codeEvenement")
  private Integer codeEvenement;

  @JsonProperty("labelEvenement")
  private String labelEvenement;

  @JsonProperty("codeEvenementInsee")
  private Integer codeEvenementInsee;

  @JsonProperty("labelEvenementInsee")
  private String labelEvenementInsee;

  @JsonProperty("dateDecision")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate dateDecision;

  @JsonProperty("dateEffet")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate dateEffet;

  @JsonProperty("dateImmatriculation")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate dateImmatriculation;

  @JsonProperty("dateCommencementActivite")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate dateCommencementActivite;

  @JsonProperty("opposition")
  private String opposition;

  @JsonProperty("procedureCollective")
  private ProcedureCollective procedureCollective;

  @JsonProperty("ancienneIdentite")
  private Identite ancienneIdentite;

  @JsonProperty("rectificatif")
  private Rectificatif rectificatif;

  public Evenement codeEvenement(Integer codeEvenement) {
    this.codeEvenement = codeEvenement;
    return this;
  }

  /**
   * Event code
   * @return codeEvenement
  */
  @ApiModelProperty(example = "1100", value = "Event code")


  public Integer getCodeEvenement() {
    return codeEvenement;
  }

  public void setCodeEvenement(Integer codeEvenement) {
    this.codeEvenement = codeEvenement;
  }

  public Evenement labelEvenement(String labelEvenement) {
    this.labelEvenement = labelEvenement;
    return this;
  }

  /**
   * Event label
   * @return labelEvenement
  */
  @ApiModelProperty(example = "Création d'entreprise", value = "Event label")


  public String getLabelEvenement() {
    return labelEvenement;
  }

  public void setLabelEvenement(String labelEvenement) {
    this.labelEvenement = labelEvenement;
  }

  public Evenement codeEvenementInsee(Integer codeEvenementInsee) {
    this.codeEvenementInsee = codeEvenementInsee;
    return this;
  }

  /**
   * Insee event code
   * @return codeEvenementInsee
  */
  @ApiModelProperty(example = "0", value = "Insee event code")


  public Integer getCodeEvenementInsee() {
    return codeEvenementInsee;
  }

  public void setCodeEvenementInsee(Integer codeEvenementInsee) {
    this.codeEvenementInsee = codeEvenementInsee;
  }

  public Evenement labelEvenementInsee(String labelEvenementInsee) {
    this.labelEvenementInsee = labelEvenementInsee;
    return this;
  }

  /**
   * Insee Event Label
   * @return labelEvenementInsee
  */
  @ApiModelProperty(example = "A compléter", value = "Insee Event Label")


  public String getLabelEvenementInsee() {
    return labelEvenementInsee;
  }

  public void setLabelEvenementInsee(String labelEvenementInsee) {
    this.labelEvenementInsee = labelEvenementInsee;
  }

  public Evenement dateDecision(LocalDate dateDecision) {
    this.dateDecision = dateDecision;
    return this;
  }

  /**
   * Event decision date
   * @return dateDecision
  */
  @ApiModelProperty(value = "Event decision date")

  @Valid

  public LocalDate getDateDecision() {
    return dateDecision;
  }

  public void setDateDecision(LocalDate dateDecision) {
    this.dateDecision = dateDecision;
  }

  public Evenement dateEffet(LocalDate dateEffet) {
    this.dateEffet = dateEffet;
    return this;
  }

  /**
   * Event effect date
   * @return dateEffet
  */
  @ApiModelProperty(value = "Event effect date")

  @Valid

  public LocalDate getDateEffet() {
    return dateEffet;
  }

  public void setDateEffet(LocalDate dateEffet) {
    this.dateEffet = dateEffet;
  }

  public Evenement dateImmatriculation(LocalDate dateImmatriculation) {
    this.dateImmatriculation = dateImmatriculation;
    return this;
  }

  /**
   * Company creation date
   * @return dateImmatriculation
  */
  @ApiModelProperty(value = "Company creation date")

  @Valid

  public LocalDate getDateImmatriculation() {
    return dateImmatriculation;
  }

  public void setDateImmatriculation(LocalDate dateImmatriculation) {
    this.dateImmatriculation = dateImmatriculation;
  }

  public Evenement dateCommencementActivite(LocalDate dateCommencementActivite) {
    this.dateCommencementActivite = dateCommencementActivite;
    return this;
  }

  /**
   * When company start its business
   * @return dateCommencementActivite
  */
  @ApiModelProperty(value = "When company start its business")

  @Valid

  public LocalDate getDateCommencementActivite() {
    return dateCommencementActivite;
  }

  public void setDateCommencementActivite(LocalDate dateCommencementActivite) {
    this.dateCommencementActivite = dateCommencementActivite;
  }

  public Evenement opposition(String opposition) {
    this.opposition = opposition;
    return this;
  }

  /**
   * a compléter
   * @return opposition
  */
  @ApiModelProperty(example = "A compléter", value = "a compléter")


  public String getOpposition() {
    return opposition;
  }

  public void setOpposition(String opposition) {
    this.opposition = opposition;
  }

  public Evenement procedureCollective(ProcedureCollective procedureCollective) {
    this.procedureCollective = procedureCollective;
    return this;
  }

  /**
   * Get procedureCollective
   * @return procedureCollective
  */
  @ApiModelProperty(value = "")

  @Valid

  public ProcedureCollective getProcedureCollective() {
    return procedureCollective;
  }

  public void setProcedureCollective(ProcedureCollective procedureCollective) {
    this.procedureCollective = procedureCollective;
  }

  public Evenement ancienneIdentite(Identite ancienneIdentite) {
    this.ancienneIdentite = ancienneIdentite;
    return this;
  }

  /**
   * Get ancienneIdentite
   * @return ancienneIdentite
  */
  @ApiModelProperty(value = "")

  @Valid

  public Identite getAncienneIdentite() {
    return ancienneIdentite;
  }

  public void setAncienneIdentite(Identite ancienneIdentite) {
    this.ancienneIdentite = ancienneIdentite;
  }

  public Evenement rectificatif(Rectificatif rectificatif) {
    this.rectificatif = rectificatif;
    return this;
  }

  /**
   * Get rectificatif
   * @return rectificatif
  */
  @ApiModelProperty(value = "")

  @Valid

  public Rectificatif getRectificatif() {
    return rectificatif;
  }

  public void setRectificatif(Rectificatif rectificatif) {
    this.rectificatif = rectificatif;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Evenement evenement = (Evenement) o;
    return Objects.equals(this.codeEvenement, evenement.codeEvenement) &&
        Objects.equals(this.labelEvenement, evenement.labelEvenement) &&
        Objects.equals(this.codeEvenementInsee, evenement.codeEvenementInsee) &&
        Objects.equals(this.labelEvenementInsee, evenement.labelEvenementInsee) &&
        Objects.equals(this.dateDecision, evenement.dateDecision) &&
        Objects.equals(this.dateEffet, evenement.dateEffet) &&
        Objects.equals(this.dateImmatriculation, evenement.dateImmatriculation) &&
        Objects.equals(this.dateCommencementActivite, evenement.dateCommencementActivite) &&
        Objects.equals(this.opposition, evenement.opposition) &&
        Objects.equals(this.procedureCollective, evenement.procedureCollective) &&
        Objects.equals(this.ancienneIdentite, evenement.ancienneIdentite) &&
        Objects.equals(this.rectificatif, evenement.rectificatif);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codeEvenement, labelEvenement, codeEvenementInsee, labelEvenementInsee, dateDecision, dateEffet, dateImmatriculation, dateCommencementActivite, opposition, procedureCollective, ancienneIdentite, rectificatif);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Evenement {\n");
    
    sb.append("    codeEvenement: ").append(toIndentedString(codeEvenement)).append("\n");
    sb.append("    labelEvenement: ").append(toIndentedString(labelEvenement)).append("\n");
    sb.append("    codeEvenementInsee: ").append(toIndentedString(codeEvenementInsee)).append("\n");
    sb.append("    labelEvenementInsee: ").append(toIndentedString(labelEvenementInsee)).append("\n");
    sb.append("    dateDecision: ").append(toIndentedString(dateDecision)).append("\n");
    sb.append("    dateEffet: ").append(toIndentedString(dateEffet)).append("\n");
    sb.append("    dateImmatriculation: ").append(toIndentedString(dateImmatriculation)).append("\n");
    sb.append("    dateCommencementActivite: ").append(toIndentedString(dateCommencementActivite)).append("\n");
    sb.append("    opposition: ").append(toIndentedString(opposition)).append("\n");
    sb.append("    procedureCollective: ").append(toIndentedString(procedureCollective)).append("\n");
    sb.append("    ancienneIdentite: ").append(toIndentedString(ancienneIdentite)).append("\n");
    sb.append("    rectificatif: ").append(toIndentedString(rectificatif)).append("\n");
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

