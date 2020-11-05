package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Etablissement
 */

public class Etablissement   {
  /**
   * Type of Site
   */
  public enum TypeEtablissementEnum {
    NON_SP_CIFI_("Non spécifié"),
    
    SI_GE_SOCIAL("Siège social"),
    
    PRINCIPAL("Principal"),
    
    SECONDAIRE("Secondaire"),
    
    DOMICILE("Domicile");

    private String value;

    TypeEtablissementEnum(String value) {
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
    public static TypeEtablissementEnum fromValue(String value) {
      for (TypeEtablissementEnum b : TypeEtablissementEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("typeEtablissement")
  private TypeEtablissementEnum typeEtablissement;

  @JsonProperty("siret")
  private String siret;

  @JsonProperty("nic")
  private String nic;

  @JsonProperty("enseigne")
  private String enseigne;

  @JsonProperty("naf")
  private String naf;

  @JsonProperty("activite")
  private String activite;

  @JsonProperty("origineFonds")
  private String origineFonds;

  @JsonProperty("adresse")
  private String adresse;

  public Etablissement typeEtablissement(TypeEtablissementEnum typeEtablissement) {
    this.typeEtablissement = typeEtablissement;
    return this;
  }

  /**
   * Type of Site
   * @return typeEtablissement
  */
  @ApiModelProperty(example = "Principal", value = "Type of Site")


  public TypeEtablissementEnum getTypeEtablissement() {
    return typeEtablissement;
  }

  public void setTypeEtablissement(TypeEtablissementEnum typeEtablissement) {
    this.typeEtablissement = typeEtablissement;
  }

  public Etablissement siret(String siret) {
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

  public Etablissement nic(String nic) {
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

  public Etablissement enseigne(String enseigne) {
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

  public Etablissement naf(String naf) {
    this.naf = naf;
    return this;
  }

  /**
   * Activity Code
   * @return naf
  */
  @ApiModelProperty(example = "1200Z", value = "Activity Code")


  public String getNaf() {
    return naf;
  }

  public void setNaf(String naf) {
    this.naf = naf;
  }

  public Etablissement activite(String activite) {
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

  public Etablissement origineFonds(String origineFonds) {
    this.origineFonds = origineFonds;
    return this;
  }

  /**
   * à Compléter
   * @return origineFonds
  */
  @ApiModelProperty(value = "à Compléter")


  public String getOrigineFonds() {
    return origineFonds;
  }

  public void setOrigineFonds(String origineFonds) {
    this.origineFonds = origineFonds;
  }

  public Etablissement adresse(String adresse) {
    this.adresse = adresse;
    return this;
  }

  /**
   * Site address
   * @return adresse
  */
  @ApiModelProperty(example = "123 Rue Fleur 12456 Fleurville", value = "Site address")


  public String getAdresse() {
    return adresse;
  }

  public void setAdresse(String adresse) {
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
    Etablissement etablissement = (Etablissement) o;
    return Objects.equals(this.typeEtablissement, etablissement.typeEtablissement) &&
        Objects.equals(this.siret, etablissement.siret) &&
        Objects.equals(this.nic, etablissement.nic) &&
        Objects.equals(this.enseigne, etablissement.enseigne) &&
        Objects.equals(this.naf, etablissement.naf) &&
        Objects.equals(this.activite, etablissement.activite) &&
        Objects.equals(this.origineFonds, etablissement.origineFonds) &&
        Objects.equals(this.adresse, etablissement.adresse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeEtablissement, siret, nic, enseigne, naf, activite, origineFonds, adresse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Etablissement {\n");
    
    sb.append("    typeEtablissement: ").append(toIndentedString(typeEtablissement)).append("\n");
    sb.append("    siret: ").append(toIndentedString(siret)).append("\n");
    sb.append("    nic: ").append(toIndentedString(nic)).append("\n");
    sb.append("    enseigne: ").append(toIndentedString(enseigne)).append("\n");
    sb.append("    naf: ").append(toIndentedString(naf)).append("\n");
    sb.append("    activite: ").append(toIndentedString(activite)).append("\n");
    sb.append("    origineFonds: ").append(toIndentedString(origineFonds)).append("\n");
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

