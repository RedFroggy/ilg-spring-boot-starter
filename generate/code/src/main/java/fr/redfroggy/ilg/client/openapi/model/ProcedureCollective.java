package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProcedureCollective
 */

public class ProcedureCollective   {
  @JsonProperty("dateCessationPaiements")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate dateCessationPaiements;

  @JsonProperty("dateFinPeriodeObservation")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate dateFinPeriodeObservation;

  @JsonProperty("dureePlan")
  private Integer dureePlan;

  @JsonProperty("mandataires")
  private String mandataires;

  @JsonProperty("administrateur")
  private String administrateur;

  public ProcedureCollective dateCessationPaiements(LocalDate dateCessationPaiements) {
    this.dateCessationPaiements = dateCessationPaiements;
    return this;
  }

  /**
   * When the company has ceased payments
   * @return dateCessationPaiements
  */
  @ApiModelProperty(value = "When the company has ceased payments")

  @Valid

  public LocalDate getDateCessationPaiements() {
    return dateCessationPaiements;
  }

  public void setDateCessationPaiements(LocalDate dateCessationPaiements) {
    this.dateCessationPaiements = dateCessationPaiements;
  }

  public ProcedureCollective dateFinPeriodeObservation(LocalDate dateFinPeriodeObservation) {
    this.dateFinPeriodeObservation = dateFinPeriodeObservation;
    return this;
  }

  /**
   * End of watching period
   * @return dateFinPeriodeObservation
  */
  @ApiModelProperty(value = "End of watching period")

  @Valid

  public LocalDate getDateFinPeriodeObservation() {
    return dateFinPeriodeObservation;
  }

  public void setDateFinPeriodeObservation(LocalDate dateFinPeriodeObservation) {
    this.dateFinPeriodeObservation = dateFinPeriodeObservation;
  }

  public ProcedureCollective dureePlan(Integer dureePlan) {
    this.dureePlan = dureePlan;
    return this;
  }

  /**
   * Backup/recovery plan duration in month
   * @return dureePlan
  */
  @ApiModelProperty(value = "Backup/recovery plan duration in month")


  public Integer getDureePlan() {
    return dureePlan;
  }

  public void setDureePlan(Integer dureePlan) {
    this.dureePlan = dureePlan;
  }

  public ProcedureCollective mandataires(String mandataires) {
    this.mandataires = mandataires;
    return this;
  }

  /**
   * judicial representative
   * @return mandataires
  */
  @ApiModelProperty(example = "Gérard Butin", value = "judicial representative")


  public String getMandataires() {
    return mandataires;
  }

  public void setMandataires(String mandataires) {
    this.mandataires = mandataires;
  }

  public ProcedureCollective administrateur(String administrateur) {
    this.administrateur = administrateur;
    return this;
  }

  /**
   * judicial representative
   * @return administrateur
  */
  @ApiModelProperty(example = "Joseph Humin", value = "judicial representative")


  public String getAdministrateur() {
    return administrateur;
  }

  public void setAdministrateur(String administrateur) {
    this.administrateur = administrateur;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcedureCollective procedureCollective = (ProcedureCollective) o;
    return Objects.equals(this.dateCessationPaiements, procedureCollective.dateCessationPaiements) &&
        Objects.equals(this.dateFinPeriodeObservation, procedureCollective.dateFinPeriodeObservation) &&
        Objects.equals(this.dureePlan, procedureCollective.dureePlan) &&
        Objects.equals(this.mandataires, procedureCollective.mandataires) &&
        Objects.equals(this.administrateur, procedureCollective.administrateur);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateCessationPaiements, dateFinPeriodeObservation, dureePlan, mandataires, administrateur);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcedureCollective {\n");
    
    sb.append("    dateCessationPaiements: ").append(toIndentedString(dateCessationPaiements)).append("\n");
    sb.append("    dateFinPeriodeObservation: ").append(toIndentedString(dateFinPeriodeObservation)).append("\n");
    sb.append("    dureePlan: ").append(toIndentedString(dureePlan)).append("\n");
    sb.append("    mandataires: ").append(toIndentedString(mandataires)).append("\n");
    sb.append("    administrateur: ").append(toIndentedString(administrateur)).append("\n");
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

