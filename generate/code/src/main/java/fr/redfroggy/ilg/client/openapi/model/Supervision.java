package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Company6;
import fr.redfroggy.ilg.client.openapi.model.SupervisionCustomData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Supervision
 */

public class Supervision   {
  @JsonProperty("company")
  private Company6 company;

  @JsonProperty("startDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate startDate;

  @JsonProperty("alertType")
  @Valid
  private List<String> alertType = null;

  @JsonProperty("customData")
  private SupervisionCustomData customData;

  @JsonProperty("scoreOrigin")
  private Integer scoreOrigin;

  public Supervision company(Company6 company) {
    this.company = company;
    return this;
  }

  /**
   * Get company
   * @return company
  */
  @ApiModelProperty(value = "")

  @Valid

  public Company6 getCompany() {
    return company;
  }

  public void setCompany(Company6 company) {
    this.company = company;
  }

  public Supervision startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Number of employee
   * @return startDate
  */
  @ApiModelProperty(value = "Number of employee")

  @Valid

  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public Supervision alertType(List<String> alertType) {
    this.alertType = alertType;
    return this;
  }

  public Supervision addAlertTypeItem(String alertTypeItem) {
    if (this.alertType == null) {
      this.alertType = new ArrayList<>();
    }
    this.alertType.add(alertTypeItem);
    return this;
  }

  /**
   * Type of supervision
   * @return alertType
  */
  @ApiModelProperty(value = "Type of supervision")


  public List<String> getAlertType() {
    return alertType;
  }

  public void setAlertType(List<String> alertType) {
    this.alertType = alertType;
  }

  public Supervision customData(SupervisionCustomData customData) {
    this.customData = customData;
    return this;
  }

  /**
   * Get customData
   * @return customData
  */
  @ApiModelProperty(value = "")

  @Valid

  public SupervisionCustomData getCustomData() {
    return customData;
  }

  public void setCustomData(SupervisionCustomData customData) {
    this.customData = customData;
  }

  public Supervision scoreOrigin(Integer scoreOrigin) {
    this.scoreOrigin = scoreOrigin;
    return this;
  }

  /**
   * Company Score when supervision started
   * @return scoreOrigin
  */
  @ApiModelProperty(value = "Company Score when supervision started")


  public Integer getScoreOrigin() {
    return scoreOrigin;
  }

  public void setScoreOrigin(Integer scoreOrigin) {
    this.scoreOrigin = scoreOrigin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Supervision supervision = (Supervision) o;
    return Objects.equals(this.company, supervision.company) &&
        Objects.equals(this.startDate, supervision.startDate) &&
        Objects.equals(this.alertType, supervision.alertType) &&
        Objects.equals(this.customData, supervision.customData) &&
        Objects.equals(this.scoreOrigin, supervision.scoreOrigin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(company, startDate, alertType, customData, scoreOrigin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Supervision {\n");
    
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    alertType: ").append(toIndentedString(alertType)).append("\n");
    sb.append("    customData: ").append(toIndentedString(customData)).append("\n");
    sb.append("    scoreOrigin: ").append(toIndentedString(scoreOrigin)).append("\n");
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

