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
 * Event
 */

public class Event   {
  @JsonProperty("adId")
  private String adId;

  @JsonProperty("source")
  private String source;

  @JsonProperty("origine")
  private String origine;

  @JsonProperty("eventCode")
  private Integer eventCode;

  @JsonProperty("categorie")
  private String categorie;

  @JsonProperty("dateParution")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate dateParution;

  @JsonProperty("dateEffet")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate dateEffet;

  @JsonProperty("role")
  private String role;

  @JsonProperty("raisonSociale")
  private String raisonSociale;

  public Event adId(String adId) {
    this.adId = adId;
    return this;
  }

  /**
   * Ad Unique Identifier
   * @return adId
  */
  @ApiModelProperty(example = "1A10015", value = "Ad Unique Identifier")


  public String getAdId() {
    return adId;
  }

  public void setAdId(String adId) {
    this.adId = adId;
  }

  public Event source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Source of the Information
   * @return source
  */
  @ApiModelProperty(example = "JAL", value = "Source of the Information")


  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public Event origine(String origine) {
    this.origine = origine;
    return this;
  }

  /**
   * Source of the Information
   * @return origine
  */
  @ApiModelProperty(example = "JAL", value = "Source of the Information")


  public String getOrigine() {
    return origine;
  }

  public void setOrigine(String origine) {
    this.origine = origine;
  }

  public Event eventCode(Integer eventCode) {
    this.eventCode = eventCode;
    return this;
  }

  /**
   * Event code
   * @return eventCode
  */
  @ApiModelProperty(example = "1100", value = "Event code")


  public Integer getEventCode() {
    return eventCode;
  }

  public void setEventCode(Integer eventCode) {
    this.eventCode = eventCode;
  }

  public Event categorie(String categorie) {
    this.categorie = categorie;
    return this;
  }

  /**
   * Event in human readable text
   * @return categorie
  */
  @ApiModelProperty(example = "Création d'entreprise", value = "Event in human readable text")


  public String getCategorie() {
    return categorie;
  }

  public void setCategorie(String categorie) {
    this.categorie = categorie;
  }

  public Event dateParution(LocalDate dateParution) {
    this.dateParution = dateParution;
    return this;
  }

  /**
   * Date when the information was published
   * @return dateParution
  */
  @ApiModelProperty(value = "Date when the information was published")

  @Valid

  public LocalDate getDateParution() {
    return dateParution;
  }

  public void setDateParution(LocalDate dateParution) {
    this.dateParution = dateParution;
  }

  public Event dateEffet(LocalDate dateEffet) {
    this.dateEffet = dateEffet;
    return this;
  }

  /**
   * Date when the change has happened or will happen
   * @return dateEffet
  */
  @ApiModelProperty(value = "Date when the change has happened or will happen")

  @Valid

  public LocalDate getDateEffet() {
    return dateEffet;
  }

  public void setDateEffet(LocalDate dateEffet) {
    this.dateEffet = dateEffet;
  }

  public Event role(String role) {
    this.role = role;
    return this;
  }

  /**
   * Role of the company regarding the information
   * @return role
  */
  @ApiModelProperty(value = "Role of the company regarding the information")


  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public Event raisonSociale(String raisonSociale) {
    this.raisonSociale = raisonSociale;
    return this;
  }

  /**
   * Company name
   * @return raisonSociale
  */
  @ApiModelProperty(value = "Company name")


  public String getRaisonSociale() {
    return raisonSociale;
  }

  public void setRaisonSociale(String raisonSociale) {
    this.raisonSociale = raisonSociale;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;
    return Objects.equals(this.adId, event.adId) &&
        Objects.equals(this.source, event.source) &&
        Objects.equals(this.origine, event.origine) &&
        Objects.equals(this.eventCode, event.eventCode) &&
        Objects.equals(this.categorie, event.categorie) &&
        Objects.equals(this.dateParution, event.dateParution) &&
        Objects.equals(this.dateEffet, event.dateEffet) &&
        Objects.equals(this.role, event.role) &&
        Objects.equals(this.raisonSociale, event.raisonSociale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, source, origine, eventCode, categorie, dateParution, dateEffet, role, raisonSociale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    origine: ").append(toIndentedString(origine)).append("\n");
    sb.append("    eventCode: ").append(toIndentedString(eventCode)).append("\n");
    sb.append("    categorie: ").append(toIndentedString(categorie)).append("\n");
    sb.append("    dateParution: ").append(toIndentedString(dateParution)).append("\n");
    sb.append("    dateEffet: ").append(toIndentedString(dateEffet)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    raisonSociale: ").append(toIndentedString(raisonSociale)).append("\n");
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

