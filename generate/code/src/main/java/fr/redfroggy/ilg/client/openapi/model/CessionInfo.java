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
 * CessionInfo
 */

public class CessionInfo   {
  @JsonProperty("montantCession")
  private Integer montantCession;

  @JsonProperty("deviseMontantCession")
  private String deviseMontantCession;

  @JsonProperty("natureCession")
  private String natureCession;

  @JsonProperty("dureeCession")
  private String dureeCession;

  @JsonProperty("uniteMois")
  private String uniteMois;

  @JsonProperty("dateFinCession")
  private LocalDate dateFinCession;

  @JsonProperty("nbParts")
  private Integer nbParts;

  @JsonProperty("valeurTitre")
  private String valeurTitre;

  public CessionInfo montantCession(Integer montantCession) {
    this.montantCession = montantCession;
    return this;
  }

  /**
   * Sale amount
   * @return montantCession
  */
  @ApiModelProperty(example = "10000", value = "Sale amount")


  public Integer getMontantCession() {
    return montantCession;
  }

  public void setMontantCession(Integer montantCession) {
    this.montantCession = montantCession;
  }

  public CessionInfo deviseMontantCession(String deviseMontantCession) {
    this.deviseMontantCession = deviseMontantCession;
    return this;
  }

  /**
   * Currency
   * @return deviseMontantCession
  */
  @ApiModelProperty(example = "EUR", value = "Currency")


  public String getDeviseMontantCession() {
    return deviseMontantCession;
  }

  public void setDeviseMontantCession(String deviseMontantCession) {
    this.deviseMontantCession = deviseMontantCession;
  }

  public CessionInfo natureCession(String natureCession) {
    this.natureCession = natureCession;
    return this;
  }

  /**
   * A compléter
   * @return natureCession
  */
  @ApiModelProperty(example = "A compléter", value = "A compléter")


  public String getNatureCession() {
    return natureCession;
  }

  public void setNatureCession(String natureCession) {
    this.natureCession = natureCession;
  }

  public CessionInfo dureeCession(String dureeCession) {
    this.dureeCession = dureeCession;
    return this;
  }

  /**
   * A compléter
   * @return dureeCession
  */
  @ApiModelProperty(example = "A compléter", value = "A compléter")


  public String getDureeCession() {
    return dureeCession;
  }

  public void setDureeCession(String dureeCession) {
    this.dureeCession = dureeCession;
  }

  public CessionInfo uniteMois(String uniteMois) {
    this.uniteMois = uniteMois;
    return this;
  }

  /**
   * A compléter
   * @return uniteMois
  */
  @ApiModelProperty(example = "A compléter", value = "A compléter")


  public String getUniteMois() {
    return uniteMois;
  }

  public void setUniteMois(String uniteMois) {
    this.uniteMois = uniteMois;
  }

  public CessionInfo dateFinCession(LocalDate dateFinCession) {
    this.dateFinCession = dateFinCession;
    return this;
  }

  /**
   * When sales is closed
   * @return dateFinCession
  */
  @ApiModelProperty(value = "When sales is closed")

  @Valid

  public LocalDate getDateFinCession() {
    return dateFinCession;
  }

  public void setDateFinCession(LocalDate dateFinCession) {
    this.dateFinCession = dateFinCession;
  }

  public CessionInfo nbParts(Integer nbParts) {
    this.nbParts = nbParts;
    return this;
  }

  /**
   * Sales percentage
   * @return nbParts
  */
  @ApiModelProperty(example = "20", value = "Sales percentage")


  public Integer getNbParts() {
    return nbParts;
  }

  public void setNbParts(Integer nbParts) {
    this.nbParts = nbParts;
  }

  public CessionInfo valeurTitre(String valeurTitre) {
    this.valeurTitre = valeurTitre;
    return this;
  }

  /**
   * A compléter
   * @return valeurTitre
  */
  @ApiModelProperty(example = "A compléter", value = "A compléter")


  public String getValeurTitre() {
    return valeurTitre;
  }

  public void setValeurTitre(String valeurTitre) {
    this.valeurTitre = valeurTitre;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CessionInfo cessionInfo = (CessionInfo) o;
    return Objects.equals(this.montantCession, cessionInfo.montantCession) &&
        Objects.equals(this.deviseMontantCession, cessionInfo.deviseMontantCession) &&
        Objects.equals(this.natureCession, cessionInfo.natureCession) &&
        Objects.equals(this.dureeCession, cessionInfo.dureeCession) &&
        Objects.equals(this.uniteMois, cessionInfo.uniteMois) &&
        Objects.equals(this.dateFinCession, cessionInfo.dateFinCession) &&
        Objects.equals(this.nbParts, cessionInfo.nbParts) &&
        Objects.equals(this.valeurTitre, cessionInfo.valeurTitre);
  }

  @Override
  public int hashCode() {
    return Objects.hash(montantCession, deviseMontantCession, natureCession, dureeCession, uniteMois, dateFinCession, nbParts, valeurTitre);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CessionInfo {\n");
    
    sb.append("    montantCession: ").append(toIndentedString(montantCession)).append("\n");
    sb.append("    deviseMontantCession: ").append(toIndentedString(deviseMontantCession)).append("\n");
    sb.append("    natureCession: ").append(toIndentedString(natureCession)).append("\n");
    sb.append("    dureeCession: ").append(toIndentedString(dureeCession)).append("\n");
    sb.append("    uniteMois: ").append(toIndentedString(uniteMois)).append("\n");
    sb.append("    dateFinCession: ").append(toIndentedString(dateFinCession)).append("\n");
    sb.append("    nbParts: ").append(toIndentedString(nbParts)).append("\n");
    sb.append("    valeurTitre: ").append(toIndentedString(valeurTitre)).append("\n");
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

