package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import fr.redfroggy.ilg.client.openapi.model.Adresse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * IdentiteActeur
 */

public class IdentiteActeur   {
  @JsonProperty("nic")
  private String nic;

  @JsonProperty("siret")
  private String siret;

  @JsonProperty("nom")
  private String nom;

  @JsonProperty("enseigne")
  private String enseigne;

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
  private String codeFormeJuridique;

  @JsonProperty("labelFormeJuridique")
  private String labelFormeJuridique;

  @JsonProperty("capital")
  private Integer capital;

  @JsonProperty("devise")
  private String devise;

  @JsonProperty("activite")
  private String activite;

  @JsonProperty("garant")
  private String garant;

  @JsonProperty("adresse")
  private Adresse adresse;

  public IdentiteActeur nic(String nic) {
    this.nic = nic;
    return this;
  }

  /**
   * Site number
   * @return nic
  */
  @ApiModelProperty(example = "00010", value = "Site number")


  public String getNic() {
    return nic;
  }

  public void setNic(String nic) {
    this.nic = nic;
  }

  public IdentiteActeur siret(String siret) {
    this.siret = siret;
    return this;
  }

  /**
   * Site unique identifier (only available in france)
   * @return siret
  */
  @ApiModelProperty(example = "12345678900010", value = "Site unique identifier (only available in france)")


  public String getSiret() {
    return siret;
  }

  public void setSiret(String siret) {
    this.siret = siret;
  }

  public IdentiteActeur nom(String nom) {
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

  public IdentiteActeur enseigne(String enseigne) {
    this.enseigne = enseigne;
    return this;
  }

  /**
   * Commercial name
   * @return enseigne
  */
  @ApiModelProperty(example = "GC Technology", value = "Commercial name")


  public String getEnseigne() {
    return enseigne;
  }

  public void setEnseigne(String enseigne) {
    this.enseigne = enseigne;
  }

  public IdentiteActeur sigle(String sigle) {
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

  public IdentiteActeur type(TypeEnum type) {
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

  public IdentiteActeur siren(String siren) {
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

  public IdentiteActeur codeFormeJuridique(String codeFormeJuridique) {
    this.codeFormeJuridique = codeFormeJuridique;
    return this;
  }

  /**
   * Get codeFormeJuridique
   * @return codeFormeJuridique
  */
  @ApiModelProperty(example = "5498", value = "")


  public String getCodeFormeJuridique() {
    return codeFormeJuridique;
  }

  public void setCodeFormeJuridique(String codeFormeJuridique) {
    this.codeFormeJuridique = codeFormeJuridique;
  }

  public IdentiteActeur labelFormeJuridique(String labelFormeJuridique) {
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

  public IdentiteActeur capital(Integer capital) {
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

  public IdentiteActeur devise(String devise) {
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

  public IdentiteActeur activite(String activite) {
    this.activite = activite;
    return this;
  }

  /**
   * Activity text
   * @return activite
  */
  @ApiModelProperty(example = "Commerce de d'autoradio", value = "Activity text")


  public String getActivite() {
    return activite;
  }

  public void setActivite(String activite) {
    this.activite = activite;
  }

  public IdentiteActeur garant(String garant) {
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

  public IdentiteActeur adresse(Adresse adresse) {
    this.adresse = adresse;
    return this;
  }

  /**
   * Get adresse
   * @return adresse
  */
  @ApiModelProperty(value = "")

  @Valid

  public Adresse getAdresse() {
    return adresse;
  }

  public void setAdresse(Adresse adresse) {
    this.adresse = adresse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentiteActeur identiteActeur = (IdentiteActeur) o;
    return Objects.equals(this.nic, identiteActeur.nic) &&
        Objects.equals(this.siret, identiteActeur.siret) &&
        Objects.equals(this.nom, identiteActeur.nom) &&
        Objects.equals(this.enseigne, identiteActeur.enseigne) &&
        Objects.equals(this.sigle, identiteActeur.sigle) &&
        Objects.equals(this.type, identiteActeur.type) &&
        Objects.equals(this.siren, identiteActeur.siren) &&
        Objects.equals(this.codeFormeJuridique, identiteActeur.codeFormeJuridique) &&
        Objects.equals(this.labelFormeJuridique, identiteActeur.labelFormeJuridique) &&
        Objects.equals(this.capital, identiteActeur.capital) &&
        Objects.equals(this.devise, identiteActeur.devise) &&
        Objects.equals(this.activite, identiteActeur.activite) &&
        Objects.equals(this.garant, identiteActeur.garant) &&
        Objects.equals(this.adresse, identiteActeur.adresse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nic, siret, nom, enseigne, sigle, type, siren, codeFormeJuridique, labelFormeJuridique, capital, devise, activite, garant, adresse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentiteActeur {\n");
    
    sb.append("    nic: ").append(toIndentedString(nic)).append("\n");
    sb.append("    siret: ").append(toIndentedString(siret)).append("\n");
    sb.append("    nom: ").append(toIndentedString(nom)).append("\n");
    sb.append("    enseigne: ").append(toIndentedString(enseigne)).append("\n");
    sb.append("    sigle: ").append(toIndentedString(sigle)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    siren: ").append(toIndentedString(siren)).append("\n");
    sb.append("    codeFormeJuridique: ").append(toIndentedString(codeFormeJuridique)).append("\n");
    sb.append("    labelFormeJuridique: ").append(toIndentedString(labelFormeJuridique)).append("\n");
    sb.append("    capital: ").append(toIndentedString(capital)).append("\n");
    sb.append("    devise: ").append(toIndentedString(devise)).append("\n");
    sb.append("    activite: ").append(toIndentedString(activite)).append("\n");
    sb.append("    garant: ").append(toIndentedString(garant)).append("\n");
    sb.append("    adresse: ").append(toIndentedString(adresse)).append("\n");
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

