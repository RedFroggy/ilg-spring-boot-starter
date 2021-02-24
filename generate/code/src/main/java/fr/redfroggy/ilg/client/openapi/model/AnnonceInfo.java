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
 * AnnonceInfo
 */

public class AnnonceInfo   {
  @JsonProperty("adID")
  private String adID;

  @JsonProperty("origine")
  private String origine;

  @JsonProperty("origineUrl")
  private String origineUrl;

  @JsonProperty("nomPublication")
  private String nomPublication;

  @JsonProperty("dateParution")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate dateParution;

  @JsonProperty("numParution")
  private String numParution;

  @JsonProperty("numAnnonce")
  private String numAnnonce;

  @JsonProperty("tribunal")
  private String tribunal;

  @JsonProperty("juriste")
  private String juriste;

  @JsonProperty("descriptif")
  private String descriptif;

  @JsonProperty("texte")
  private String texte;

  public AnnonceInfo adID(String adID) {
    this.adID = adID;
    return this;
  }

  /**
   * Event identifier
   * @return adID
  */
  @ApiModelProperty(example = "XA1235456", value = "Event identifier")


  public String getAdID() {
    return adID;
  }

  public void setAdID(String adID) {
    this.adID = adID;
  }

  public AnnonceInfo origine(String origine) {
    this.origine = origine;
    return this;
  }

  /**
   * Source of information
   * @return origine
  */
  @ApiModelProperty(example = "Bodacc", value = "Source of information")


  public String getOrigine() {
    return origine;
  }

  public void setOrigine(String origine) {
    this.origine = origine;
  }

  public AnnonceInfo origineUrl(String origineUrl) {
    this.origineUrl = origineUrl;
    return this;
  }

  /**
   * Source URL
   * @return origineUrl
  */
  @ApiModelProperty(value = "Source URL")


  public String getOrigineUrl() {
    return origineUrl;
  }

  public void setOrigineUrl(String origineUrl) {
    this.origineUrl = origineUrl;
  }

  public AnnonceInfo nomPublication(String nomPublication) {
    this.nomPublication = nomPublication;
    return this;
  }

  /**
   * Name of publication
   * @return nomPublication
  */
  @ApiModelProperty(value = "Name of publication")


  public String getNomPublication() {
    return nomPublication;
  }

  public void setNomPublication(String nomPublication) {
    this.nomPublication = nomPublication;
  }

  public AnnonceInfo dateParution(LocalDate dateParution) {
    this.dateParution = dateParution;
    return this;
  }

  /**
   * Date when event has been released
   * @return dateParution
  */
  @ApiModelProperty(value = "Date when event has been released")

  @Valid

  public LocalDate getDateParution() {
    return dateParution;
  }

  public void setDateParution(LocalDate dateParution) {
    this.dateParution = dateParution;
  }

  public AnnonceInfo numParution(String numParution) {
    this.numParution = numParution;
    return this;
  }

  /**
   * Parution number
   * @return numParution
  */
  @ApiModelProperty(example = "BXA2017", value = "Parution number")


  public String getNumParution() {
    return numParution;
  }

  public void setNumParution(String numParution) {
    this.numParution = numParution;
  }

  public AnnonceInfo numAnnonce(String numAnnonce) {
    this.numAnnonce = numAnnonce;
    return this;
  }

  /**
   * Event number in parution
   * @return numAnnonce
  */
  @ApiModelProperty(example = "20001", value = "Event number in parution")


  public String getNumAnnonce() {
    return numAnnonce;
  }

  public void setNumAnnonce(String numAnnonce) {
    this.numAnnonce = numAnnonce;
  }

  public AnnonceInfo tribunal(String tribunal) {
    this.tribunal = tribunal;
    return this;
  }

  /**
   * Court (if available)
   * @return tribunal
  */
  @ApiModelProperty(example = "PARIS", value = "Court (if available)")


  public String getTribunal() {
    return tribunal;
  }

  public void setTribunal(String tribunal) {
    this.tribunal = tribunal;
  }

  public AnnonceInfo juriste(String juriste) {
    this.juriste = juriste;
    return this;
  }

  /**
   * Lawer
   * @return juriste
  */
  @ApiModelProperty(example = "Lawers Associate", value = "Lawer")


  public String getJuriste() {
    return juriste;
  }

  public void setJuriste(String juriste) {
    this.juriste = juriste;
  }

  public AnnonceInfo descriptif(String descriptif) {
    this.descriptif = descriptif;
    return this;
  }

  /**
   * Summary
   * @return descriptif
  */
  @ApiModelProperty(value = "Summary")


  public String getDescriptif() {
    return descriptif;
  }

  public void setDescriptif(String descriptif) {
    this.descriptif = descriptif;
  }

  public AnnonceInfo texte(String texte) {
    this.texte = texte;
    return this;
  }

  /**
   * Event full text
   * @return texte
  */
  @ApiModelProperty(example = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed...", value = "Event full text")


  public String getTexte() {
    return texte;
  }

  public void setTexte(String texte) {
    this.texte = texte;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnnonceInfo annonceInfo = (AnnonceInfo) o;
    return Objects.equals(this.adID, annonceInfo.adID) &&
        Objects.equals(this.origine, annonceInfo.origine) &&
        Objects.equals(this.origineUrl, annonceInfo.origineUrl) &&
        Objects.equals(this.nomPublication, annonceInfo.nomPublication) &&
        Objects.equals(this.dateParution, annonceInfo.dateParution) &&
        Objects.equals(this.numParution, annonceInfo.numParution) &&
        Objects.equals(this.numAnnonce, annonceInfo.numAnnonce) &&
        Objects.equals(this.tribunal, annonceInfo.tribunal) &&
        Objects.equals(this.juriste, annonceInfo.juriste) &&
        Objects.equals(this.descriptif, annonceInfo.descriptif) &&
        Objects.equals(this.texte, annonceInfo.texte);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adID, origine, origineUrl, nomPublication, dateParution, numParution, numAnnonce, tribunal, juriste, descriptif, texte);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnonceInfo {\n");
    
    sb.append("    adID: ").append(toIndentedString(adID)).append("\n");
    sb.append("    origine: ").append(toIndentedString(origine)).append("\n");
    sb.append("    origineUrl: ").append(toIndentedString(origineUrl)).append("\n");
    sb.append("    nomPublication: ").append(toIndentedString(nomPublication)).append("\n");
    sb.append("    dateParution: ").append(toIndentedString(dateParution)).append("\n");
    sb.append("    numParution: ").append(toIndentedString(numParution)).append("\n");
    sb.append("    numAnnonce: ").append(toIndentedString(numAnnonce)).append("\n");
    sb.append("    tribunal: ").append(toIndentedString(tribunal)).append("\n");
    sb.append("    juriste: ").append(toIndentedString(juriste)).append("\n");
    sb.append("    descriptif: ").append(toIndentedString(descriptif)).append("\n");
    sb.append("    texte: ").append(toIndentedString(texte)).append("\n");
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

