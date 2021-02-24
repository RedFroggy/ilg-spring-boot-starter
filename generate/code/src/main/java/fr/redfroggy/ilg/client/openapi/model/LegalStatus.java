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
 * LegalStatus
 */

public class LegalStatus   {
  @JsonProperty("registrationId")
  private String registrationId;

  @JsonProperty("date")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate date;

  @JsonProperty("dateAct")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate dateAct;

  @JsonProperty("availability")
  private Boolean availability;

  public LegalStatus registrationId(String registrationId) {
    this.registrationId = registrationId;
    return this;
  }

  /**
   * company identifier
   * @return registrationId
  */
  @ApiModelProperty(example = "15ED4561111", value = "company identifier")


  public String getRegistrationId() {
    return registrationId;
  }

  public void setRegistrationId(String registrationId) {
    this.registrationId = registrationId;
  }

  public LegalStatus date(LocalDate date) {
    this.date = date;
    return this;
  }

  /**
   * Deposit date
   * @return date
  */
  @ApiModelProperty(value = "Deposit date")

  @Valid

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public LegalStatus dateAct(LocalDate dateAct) {
    this.dateAct = dateAct;
    return this;
  }

  /**
   * Act date
   * @return dateAct
  */
  @ApiModelProperty(value = "Act date")

  @Valid

  public LocalDate getDateAct() {
    return dateAct;
  }

  public void setDateAct(LocalDate dateAct) {
    this.dateAct = dateAct;
  }

  public LegalStatus availability(Boolean availability) {
    this.availability = availability;
    return this;
  }

  /**
   * Available or not
   * @return availability
  */
  @ApiModelProperty(example = "true", value = "Available or not")


  public Boolean getAvailability() {
    return availability;
  }

  public void setAvailability(Boolean availability) {
    this.availability = availability;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegalStatus legalStatus = (LegalStatus) o;
    return Objects.equals(this.registrationId, legalStatus.registrationId) &&
        Objects.equals(this.date, legalStatus.date) &&
        Objects.equals(this.dateAct, legalStatus.dateAct) &&
        Objects.equals(this.availability, legalStatus.availability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registrationId, date, dateAct, availability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegalStatus {\n");
    
    sb.append("    registrationId: ").append(toIndentedString(registrationId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    dateAct: ").append(toIndentedString(dateAct)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
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

