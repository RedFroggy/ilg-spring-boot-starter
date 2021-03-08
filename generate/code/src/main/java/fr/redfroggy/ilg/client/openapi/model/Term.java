package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.ExecutiveFonction6;
import fr.redfroggy.ilg.client.openapi.model.ExecutiveMouvement5;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Term
 */

public class Term   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("siren")
  private Integer siren;

  @JsonProperty("fonction")
  private ExecutiveFonction6 fonction;

  @JsonProperty("startCode")
  private ExecutiveMouvement5 startCode;

  @JsonProperty("startDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate startDate;

  @JsonProperty("endCode")
  private ExecutiveMouvement5 endCode;

  @JsonProperty("endDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate endDate;

  @JsonProperty("lastMovementCode")
  private ExecutiveMouvement5 lastMovementCode;

  @JsonProperty("lastMovementDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate lastMovementDate;

  @JsonProperty("principal")
  private Integer principal;

  public Term id(String id) {
    this.id = id;
    return this;
  }

  /**
   * identifier of term
   * @return id
  */
  @ApiModelProperty(example = "1", value = "identifier of term")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Term siren(Integer siren) {
    this.siren = siren;
    return this;
  }

  /**
   * identifier of a company
   * @return siren
  */
  @ApiModelProperty(example = "503207896", value = "identifier of a company")


  public Integer getSiren() {
    return siren;
  }

  public void setSiren(Integer siren) {
    this.siren = siren;
  }

  public Term fonction(ExecutiveFonction6 fonction) {
    this.fonction = fonction;
    return this;
  }

  /**
   * Get fonction
   * @return fonction
  */
  @ApiModelProperty(value = "")

  @Valid

  public ExecutiveFonction6 getFonction() {
    return fonction;
  }

  public void setFonction(ExecutiveFonction6 fonction) {
    this.fonction = fonction;
  }

  public Term startCode(ExecutiveMouvement5 startCode) {
    this.startCode = startCode;
    return this;
  }

  /**
   * Get startCode
   * @return startCode
  */
  @ApiModelProperty(value = "")

  @Valid

  public ExecutiveMouvement5 getStartCode() {
    return startCode;
  }

  public void setStartCode(ExecutiveMouvement5 startCode) {
    this.startCode = startCode;
  }

  public Term startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Date opening the term
   * @return startDate
  */
  @ApiModelProperty(value = "Date opening the term")

  @Valid

  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public Term endCode(ExecutiveMouvement5 endCode) {
    this.endCode = endCode;
    return this;
  }

  /**
   * Get endCode
   * @return endCode
  */
  @ApiModelProperty(value = "")

  @Valid

  public ExecutiveMouvement5 getEndCode() {
    return endCode;
  }

  public void setEndCode(ExecutiveMouvement5 endCode) {
    this.endCode = endCode;
  }

  public Term endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Date closing the term
   * @return endDate
  */
  @ApiModelProperty(value = "Date closing the term")

  @Valid

  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public Term lastMovementCode(ExecutiveMouvement5 lastMovementCode) {
    this.lastMovementCode = lastMovementCode;
    return this;
  }

  /**
   * Get lastMovementCode
   * @return lastMovementCode
  */
  @ApiModelProperty(value = "")

  @Valid

  public ExecutiveMouvement5 getLastMovementCode() {
    return lastMovementCode;
  }

  public void setLastMovementCode(ExecutiveMouvement5 lastMovementCode) {
    this.lastMovementCode = lastMovementCode;
  }

  public Term lastMovementDate(LocalDate lastMovementDate) {
    this.lastMovementDate = lastMovementDate;
    return this;
  }

  /**
   * Last movement date during the term
   * @return lastMovementDate
  */
  @ApiModelProperty(value = "Last movement date during the term")

  @Valid

  public LocalDate getLastMovementDate() {
    return lastMovementDate;
  }

  public void setLastMovementDate(LocalDate lastMovementDate) {
    this.lastMovementDate = lastMovementDate;
  }

  public Term principal(Integer principal) {
    this.principal = principal;
    return this;
  }

  /**
   * principal
   * @return principal
  */
  @ApiModelProperty(example = "1", value = "principal")


  public Integer getPrincipal() {
    return principal;
  }

  public void setPrincipal(Integer principal) {
    this.principal = principal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Term term = (Term) o;
    return Objects.equals(this.id, term.id) &&
        Objects.equals(this.siren, term.siren) &&
        Objects.equals(this.fonction, term.fonction) &&
        Objects.equals(this.startCode, term.startCode) &&
        Objects.equals(this.startDate, term.startDate) &&
        Objects.equals(this.endCode, term.endCode) &&
        Objects.equals(this.endDate, term.endDate) &&
        Objects.equals(this.lastMovementCode, term.lastMovementCode) &&
        Objects.equals(this.lastMovementDate, term.lastMovementDate) &&
        Objects.equals(this.principal, term.principal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, siren, fonction, startCode, startDate, endCode, endDate, lastMovementCode, lastMovementDate, principal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Term {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    siren: ").append(toIndentedString(siren)).append("\n");
    sb.append("    fonction: ").append(toIndentedString(fonction)).append("\n");
    sb.append("    startCode: ").append(toIndentedString(startCode)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endCode: ").append(toIndentedString(endCode)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    lastMovementCode: ").append(toIndentedString(lastMovementCode)).append("\n");
    sb.append("    lastMovementDate: ").append(toIndentedString(lastMovementDate)).append("\n");
    sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
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

