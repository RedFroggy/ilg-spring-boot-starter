package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import fr.redfroggy.ilg.client.openapi.model.Adresse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Dirigeant
 */

public class Dirigeant   {
  /**
   * Executive title
   */
  public enum CiviliteEnum {
    STE("Ste"),
    
    DR("Dr"),
    
    M("M"),
    
    MME("Mme"),
    
    MLLE("Mlle"),
    
    ME("Me");

    private String value;

    CiviliteEnum(String value) {
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
    public static CiviliteEnum fromValue(String value) {
      for (CiviliteEnum b : CiviliteEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("civilite")
  private CiviliteEnum civilite;

  @JsonProperty("nom")
  private String nom;

  @JsonProperty("nomJeuneFille")
  private String nomJeuneFille;

  @JsonProperty("prenom")
  private String prenom;

  @JsonProperty("siren")
  private String siren;

  @JsonProperty("codeFonction")
  private String codeFonction;

  @JsonProperty("labelFonction")
  private String labelFonction;

  @JsonProperty("dateNaissance")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate dateNaissance;

  @JsonProperty("nationalite")
  private String nationalite;

  @JsonProperty("mouvement")
  private String mouvement;

  @JsonProperty("representePar")
  private String representePar;

  @JsonProperty("apport")
  private String apport;

  @JsonProperty("telephone")
  private String telephone;

  @JsonProperty("adresse")
  private Adresse adresse;

  public Dirigeant civilite(CiviliteEnum civilite) {
    this.civilite = civilite;
    return this;
  }

  /**
   * Executive title
   * @return civilite
  */
  @ApiModelProperty(example = "M", value = "Executive title")


  public CiviliteEnum getCivilite() {
    return civilite;
  }

  public void setCivilite(CiviliteEnum civilite) {
    this.civilite = civilite;
  }

  public Dirigeant nom(String nom) {
    this.nom = nom;
    return this;
  }

  /**
   * Lastname
   * @return nom
  */
  @ApiModelProperty(example = "Dupont", value = "Lastname")


  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public Dirigeant nomJeuneFille(String nomJeuneFille) {
    this.nomJeuneFille = nomJeuneFille;
    return this;
  }

  /**
   * Maiden name
   * @return nomJeuneFille
  */
  @ApiModelProperty(example = "", value = "Maiden name")


  public String getNomJeuneFille() {
    return nomJeuneFille;
  }

  public void setNomJeuneFille(String nomJeuneFille) {
    this.nomJeuneFille = nomJeuneFille;
  }

  public Dirigeant prenom(String prenom) {
    this.prenom = prenom;
    return this;
  }

  /**
   * Firstname
   * @return prenom
  */
  @ApiModelProperty(example = "Laurent", value = "Firstname")


  public String getPrenom() {
    return prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  public Dirigeant siren(String siren) {
    this.siren = siren;
    return this;
  }

  /**
   * Company identifier if available
   * @return siren
  */
  @ApiModelProperty(example = "123456789", value = "Company identifier if available")


  public String getSiren() {
    return siren;
  }

  public void setSiren(String siren) {
    this.siren = siren;
  }

  public Dirigeant codeFonction(String codeFonction) {
    this.codeFonction = codeFonction;
    return this;
  }

  /**
   * Executive position
   * @return codeFonction
  */
  @ApiModelProperty(example = "01", value = "Executive position")


  public String getCodeFonction() {
    return codeFonction;
  }

  public void setCodeFonction(String codeFonction) {
    this.codeFonction = codeFonction;
  }

  public Dirigeant labelFonction(String labelFonction) {
    this.labelFonction = labelFonction;
    return this;
  }

  /**
   * Executive position label
   * @return labelFonction
  */
  @ApiModelProperty(example = "Président", value = "Executive position label")


  public String getLabelFonction() {
    return labelFonction;
  }

  public void setLabelFonction(String labelFonction) {
    this.labelFonction = labelFonction;
  }

  public Dirigeant dateNaissance(LocalDate dateNaissance) {
    this.dateNaissance = dateNaissance;
    return this;
  }

  /**
   * Birth date
   * @return dateNaissance
  */
  @ApiModelProperty(value = "Birth date")

  @Valid

  public LocalDate getDateNaissance() {
    return dateNaissance;
  }

  public void setDateNaissance(LocalDate dateNaissance) {
    this.dateNaissance = dateNaissance;
  }

  public Dirigeant nationalite(String nationalite) {
    this.nationalite = nationalite;
    return this;
  }

  /**
   * Nationality
   * @return nationalite
  */
  @ApiModelProperty(example = "Française", value = "Nationality")


  public String getNationalite() {
    return nationalite;
  }

  public void setNationalite(String nationalite) {
    this.nationalite = nationalite;
  }

  public Dirigeant mouvement(String mouvement) {
    this.mouvement = mouvement;
    return this;
  }

  /**
   * Assignment
   * @return mouvement
  */
  @ApiModelProperty(example = "Nomination", value = "Assignment")


  public String getMouvement() {
    return mouvement;
  }

  public void setMouvement(String mouvement) {
    this.mouvement = mouvement;
  }

  public Dirigeant representePar(String representePar) {
    this.representePar = representePar;
    return this;
  }

  /**
   * Represented by
   * @return representePar
  */
  @ApiModelProperty(value = "Represented by")


  public String getRepresentePar() {
    return representePar;
  }

  public void setRepresentePar(String representePar) {
    this.representePar = representePar;
  }

  public Dirigeant apport(String apport) {
    this.apport = apport;
    return this;
  }

  /**
   * 
   * @return apport
  */
  @ApiModelProperty(value = "")


  public String getApport() {
    return apport;
  }

  public void setApport(String apport) {
    this.apport = apport;
  }

  public Dirigeant telephone(String telephone) {
    this.telephone = telephone;
    return this;
  }

  /**
   * Phone number
   * @return telephone
  */
  @ApiModelProperty(example = "012345789", value = "Phone number")


  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  public Dirigeant adresse(Adresse adresse) {
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
    Dirigeant dirigeant = (Dirigeant) o;
    return Objects.equals(this.civilite, dirigeant.civilite) &&
        Objects.equals(this.nom, dirigeant.nom) &&
        Objects.equals(this.nomJeuneFille, dirigeant.nomJeuneFille) &&
        Objects.equals(this.prenom, dirigeant.prenom) &&
        Objects.equals(this.siren, dirigeant.siren) &&
        Objects.equals(this.codeFonction, dirigeant.codeFonction) &&
        Objects.equals(this.labelFonction, dirigeant.labelFonction) &&
        Objects.equals(this.dateNaissance, dirigeant.dateNaissance) &&
        Objects.equals(this.nationalite, dirigeant.nationalite) &&
        Objects.equals(this.mouvement, dirigeant.mouvement) &&
        Objects.equals(this.representePar, dirigeant.representePar) &&
        Objects.equals(this.apport, dirigeant.apport) &&
        Objects.equals(this.telephone, dirigeant.telephone) &&
        Objects.equals(this.adresse, dirigeant.adresse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(civilite, nom, nomJeuneFille, prenom, siren, codeFonction, labelFonction, dateNaissance, nationalite, mouvement, representePar, apport, telephone, adresse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dirigeant {\n");
    
    sb.append("    civilite: ").append(toIndentedString(civilite)).append("\n");
    sb.append("    nom: ").append(toIndentedString(nom)).append("\n");
    sb.append("    nomJeuneFille: ").append(toIndentedString(nomJeuneFille)).append("\n");
    sb.append("    prenom: ").append(toIndentedString(prenom)).append("\n");
    sb.append("    siren: ").append(toIndentedString(siren)).append("\n");
    sb.append("    codeFonction: ").append(toIndentedString(codeFonction)).append("\n");
    sb.append("    labelFonction: ").append(toIndentedString(labelFonction)).append("\n");
    sb.append("    dateNaissance: ").append(toIndentedString(dateNaissance)).append("\n");
    sb.append("    nationalite: ").append(toIndentedString(nationalite)).append("\n");
    sb.append("    mouvement: ").append(toIndentedString(mouvement)).append("\n");
    sb.append("    representePar: ").append(toIndentedString(representePar)).append("\n");
    sb.append("    apport: ").append(toIndentedString(apport)).append("\n");
    sb.append("    telephone: ").append(toIndentedString(telephone)).append("\n");
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

