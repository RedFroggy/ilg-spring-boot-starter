package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import fr.redfroggy.ilg.client.openapi.model.Etablissements;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Identite
 */

public class Identite   {
  @JsonProperty("nom")
  private String nom;

  @JsonProperty("pseudonyme")
  private String pseudonyme;

  @JsonProperty("sigle")
  private String sigle;

  /**
   * Whether the person is a real person (P), or a company (M)
   */
  public enum TypeEnum {
    M("M"),
    
    P("P");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  @JsonProperty("siren")
  private String siren;

  @JsonProperty("codeFormeJuridique")
  private Integer codeFormeJuridique;

  @JsonProperty("labelFormeJuridique")
  private String labelFormeJuridique;

  @JsonProperty("capital")
  private Integer capital;

  @JsonProperty("devise")
  private String devise;

  @JsonProperty("dateCreation")
  private LocalDate dateCreation;

  @JsonProperty("duree")
  private Integer duree;

  @JsonProperty("garant")
  private String garant;

  @JsonProperty("dateClotureDesComptes")
  private LocalDate dateClotureDesComptes;

  @JsonProperty("etablissements")
  private Etablissements etablissements;

  public Identite nom(String nom) {
    this.nom = nom;
    return this;
  }

  /**
   * Name
   * @return nom
  */
  @ApiModelProperty(example = "Great Company", value = "Name")


  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public Identite pseudonyme(String pseudonyme) {
    this.pseudonyme = pseudonyme;
    return this;
  }

  /**
   * Get pseudonyme
   * @return pseudonyme
  */
  @ApiModelProperty(example = "GC", value = "")


  public String getPseudonyme() {
    return pseudonyme;
  }

  public void setPseudonyme(String pseudonyme) {
    this.pseudonyme = pseudonyme;
  }

  public Identite sigle(String sigle) {
    this.sigle = sigle;
    return this;
  }

  /**
   * acronym
   * @return sigle
  */
  @ApiModelProperty(example = "GC", value = "acronym")


  public String getSigle() {
    return sigle;
  }

  public void setSigle(String sigle) {
    this.sigle = sigle;
  }

  public Identite type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Whether the person is a real person (P), or a company (M)
   * @return type
  */
  @ApiModelProperty(example = "M", value = "Whether the person is a real person (P), or a company (M)")


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Identite siren(String siren) {
    this.siren = siren;
    return this;
  }

  /**
   * Company Identifier
   * @return siren
  */
  @ApiModelProperty(example = "123456789", value = "Company Identifier")


  public String getSiren() {
    return siren;
  }

  public void setSiren(String siren) {
    this.siren = siren;
  }

  public Identite codeFormeJuridique(Integer codeFormeJuridique) {
    this.codeFormeJuridique = codeFormeJuridique;
    return this;
  }

  /**
   * Get codeFormeJuridique
   * @return codeFormeJuridique
  */
  @ApiModelProperty(example = "5498", value = "")


  public Integer getCodeFormeJuridique() {
    return codeFormeJuridique;
  }

  public void setCodeFormeJuridique(Integer codeFormeJuridique) {
    this.codeFormeJuridique = codeFormeJuridique;
  }

  public Identite labelFormeJuridique(String labelFormeJuridique) {
    this.labelFormeJuridique = labelFormeJuridique;
    return this;
  }

  /**
   * Get labelFormeJuridique
   * @return labelFormeJuridique
  */
  @ApiModelProperty(example = "SARL unipersonnelle (EURL)", value = "")


  public String getLabelFormeJuridique() {
    return labelFormeJuridique;
  }

  public void setLabelFormeJuridique(String labelFormeJuridique) {
    this.labelFormeJuridique = labelFormeJuridique;
  }

  public Identite capital(Integer capital) {
    this.capital = capital;
    return this;
  }

  /**
   * Get capital
   * @return capital
  */
  @ApiModelProperty(example = "100", value = "")


  public Integer getCapital() {
    return capital;
  }

  public void setCapital(Integer capital) {
    this.capital = capital;
  }

  public Identite devise(String devise) {
    this.devise = devise;
    return this;
  }

  /**
   * Currency
   * @return devise
  */
  @ApiModelProperty(example = "EUR", value = "Currency")


  public String getDevise() {
    return devise;
  }

  public void setDevise(String devise) {
    this.devise = devise;
  }

  public Identite dateCreation(LocalDate dateCreation) {
    this.dateCreation = dateCreation;
    return this;
  }

  /**
   * Company creation date
   * @return dateCreation
  */
  @ApiModelProperty(value = "Company creation date")

  @Valid

  public LocalDate getDateCreation() {
    return dateCreation;
  }

  public void setDateCreation(LocalDate dateCreation) {
    this.dateCreation = dateCreation;
  }

  public Identite duree(Integer duree) {
    this.duree = duree;
    return this;
  }

  /**
   * Company max age, in year
   * @return duree
  */
  @ApiModelProperty(value = "Company max age, in year")


  public Integer getDuree() {
    return duree;
  }

  public void setDuree(Integer duree) {
    this.duree = duree;
  }

  public Identite garant(String garant) {
    this.garant = garant;
    return this;
  }

  /**
   * Guarantor
   * @return garant
  */
  @ApiModelProperty(value = "Guarantor")


  public String getGarant() {
    return garant;
  }

  public void setGarant(String garant) {
    this.garant = garant;
  }

  public Identite dateClotureDesComptes(LocalDate dateClotureDesComptes) {
    this.dateClotureDesComptes = dateClotureDesComptes;
    return this;
  }

  /**
   * Date on which the accounts are closed
   * @return dateClotureDesComptes
  */
  @ApiModelProperty(value = "Date on which the accounts are closed")

  @Valid

  public LocalDate getDateClotureDesComptes() {
    return dateClotureDesComptes;
  }

  public void setDateClotureDesComptes(LocalDate dateClotureDesComptes) {
    this.dateClotureDesComptes = dateClotureDesComptes;
  }

  public Identite etablissements(Etablissements etablissements) {
    this.etablissements = etablissements;
    return this;
  }

  /**
   * Get etablissements
   * @return etablissements
  */
  @ApiModelProperty(value = "")

  @Valid

  public Etablissements getEtablissements() {
    return etablissements;
  }

  public void setEtablissements(Etablissements etablissements) {
    this.etablissements = etablissements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Identite identite = (Identite) o;
    return Objects.equals(this.nom, identite.nom) &&
        Objects.equals(this.pseudonyme, identite.pseudonyme) &&
        Objects.equals(this.sigle, identite.sigle) &&
        Objects.equals(this.type, identite.type) &&
        Objects.equals(this.siren, identite.siren) &&
        Objects.equals(this.codeFormeJuridique, identite.codeFormeJuridique) &&
        Objects.equals(this.labelFormeJuridique, identite.labelFormeJuridique) &&
        Objects.equals(this.capital, identite.capital) &&
        Objects.equals(this.devise, identite.devise) &&
        Objects.equals(this.dateCreation, identite.dateCreation) &&
        Objects.equals(this.duree, identite.duree) &&
        Objects.equals(this.garant, identite.garant) &&
        Objects.equals(this.dateClotureDesComptes, identite.dateClotureDesComptes) &&
        Objects.equals(this.etablissements, identite.etablissements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nom, pseudonyme, sigle, type, siren, codeFormeJuridique, labelFormeJuridique, capital, devise, dateCreation, duree, garant, dateClotureDesComptes, etablissements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Identite {\n");
    
    sb.append("    nom: ").append(toIndentedString(nom)).append("\n");
    sb.append("    pseudonyme: ").append(toIndentedString(pseudonyme)).append("\n");
    sb.append("    sigle: ").append(toIndentedString(sigle)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    siren: ").append(toIndentedString(siren)).append("\n");
    sb.append("    codeFormeJuridique: ").append(toIndentedString(codeFormeJuridique)).append("\n");
    sb.append("    labelFormeJuridique: ").append(toIndentedString(labelFormeJuridique)).append("\n");
    sb.append("    capital: ").append(toIndentedString(capital)).append("\n");
    sb.append("    devise: ").append(toIndentedString(devise)).append("\n");
    sb.append("    dateCreation: ").append(toIndentedString(dateCreation)).append("\n");
    sb.append("    duree: ").append(toIndentedString(duree)).append("\n");
    sb.append("    garant: ").append(toIndentedString(garant)).append("\n");
    sb.append("    dateClotureDesComptes: ").append(toIndentedString(dateClotureDesComptes)).append("\n");
    sb.append("    etablissements: ").append(toIndentedString(etablissements)).append("\n");
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

