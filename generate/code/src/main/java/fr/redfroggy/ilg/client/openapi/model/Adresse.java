package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Adresse
 */

public class Adresse   {
  @JsonProperty("rue")
  private String rue;

  @JsonProperty("boitePostal")
  private String boitePostal;

  @JsonProperty("codePostal")
  private String codePostal;

  @JsonProperty("ville")
  private String ville;

  @JsonProperty("departement")
  private Integer departement;

  @JsonProperty("codePays")
  private String codePays;

  @JsonProperty("labelPays")
  private String labelPays;

  @JsonProperty("adresseTexte")
  private String adresseTexte;

  public Adresse rue(String rue) {
    this.rue = rue;
    return this;
  }

  /**
   * Street name
   * @return rue
  */
  @ApiModelProperty(example = "123 Rue de fleur", value = "Street name")


  public String getRue() {
    return rue;
  }

  public void setRue(String rue) {
    this.rue = rue;
  }

  public Adresse boitePostal(String boitePostal) {
    this.boitePostal = boitePostal;
    return this;
  }

  /**
   * Postal Box
   * @return boitePostal
  */
  @ApiModelProperty(example = "BP12", value = "Postal Box")


  public String getBoitePostal() {
    return boitePostal;
  }

  public void setBoitePostal(String boitePostal) {
    this.boitePostal = boitePostal;
  }

  public Adresse codePostal(String codePostal) {
    this.codePostal = codePostal;
    return this;
  }

  /**
   * Postal Code
   * @return codePostal
  */
  @ApiModelProperty(example = "12345", value = "Postal Code")


  public String getCodePostal() {
    return codePostal;
  }

  public void setCodePostal(String codePostal) {
    this.codePostal = codePostal;
  }

  public Adresse ville(String ville) {
    this.ville = ville;
    return this;
  }

  /**
   * City
   * @return ville
  */
  @ApiModelProperty(example = "Fleurviller", value = "City")


  public String getVille() {
    return ville;
  }

  public void setVille(String ville) {
    this.ville = ville;
  }

  public Adresse departement(Integer departement) {
    this.departement = departement;
    return this;
  }

  /**
   * Departement as a number
   * @return departement
  */
  @ApiModelProperty(example = "75", value = "Departement as a number")


  public Integer getDepartement() {
    return departement;
  }

  public void setDepartement(Integer departement) {
    this.departement = departement;
  }

  public Adresse codePays(String codePays) {
    this.codePays = codePays;
    return this;
  }

  /**
   * Country code in ISO 3166-3
   * @return codePays
  */
  @ApiModelProperty(example = "FRA", value = "Country code in ISO 3166-3")


  public String getCodePays() {
    return codePays;
  }

  public void setCodePays(String codePays) {
    this.codePays = codePays;
  }

  public Adresse labelPays(String labelPays) {
    this.labelPays = labelPays;
    return this;
  }

  /**
   * Country name
   * @return labelPays
  */
  @ApiModelProperty(example = "France", value = "Country name")


  public String getLabelPays() {
    return labelPays;
  }

  public void setLabelPays(String labelPays) {
    this.labelPays = labelPays;
  }

  public Adresse adresseTexte(String adresseTexte) {
    this.adresseTexte = adresseTexte;
    return this;
  }

  /**
   * Full address text
   * @return adresseTexte
  */
  @ApiModelProperty(example = "123 Rue Fleur 123456 Fleurville France", value = "Full address text")


  public String getAdresseTexte() {
    return adresseTexte;
  }

  public void setAdresseTexte(String adresseTexte) {
    this.adresseTexte = adresseTexte;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Adresse adresse = (Adresse) o;
    return Objects.equals(this.rue, adresse.rue) &&
        Objects.equals(this.boitePostal, adresse.boitePostal) &&
        Objects.equals(this.codePostal, adresse.codePostal) &&
        Objects.equals(this.ville, adresse.ville) &&
        Objects.equals(this.departement, adresse.departement) &&
        Objects.equals(this.codePays, adresse.codePays) &&
        Objects.equals(this.labelPays, adresse.labelPays) &&
        Objects.equals(this.adresseTexte, adresse.adresseTexte);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rue, boitePostal, codePostal, ville, departement, codePays, labelPays, adresseTexte);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Adresse {\n");
    
    sb.append("    rue: ").append(toIndentedString(rue)).append("\n");
    sb.append("    boitePostal: ").append(toIndentedString(boitePostal)).append("\n");
    sb.append("    codePostal: ").append(toIndentedString(codePostal)).append("\n");
    sb.append("    ville: ").append(toIndentedString(ville)).append("\n");
    sb.append("    departement: ").append(toIndentedString(departement)).append("\n");
    sb.append("    codePays: ").append(toIndentedString(codePays)).append("\n");
    sb.append("    labelPays: ").append(toIndentedString(labelPays)).append("\n");
    sb.append("    adresseTexte: ").append(toIndentedString(adresseTexte)).append("\n");
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

