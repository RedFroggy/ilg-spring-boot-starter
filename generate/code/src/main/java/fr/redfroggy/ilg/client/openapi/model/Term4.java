package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.ExecutiveFonction12;
import fr.redfroggy.ilg.client.openapi.model.ExecutiveMouvement8;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Term4
 */

public class Term4   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("siren")
  private Integer siren;

  @JsonProperty("fonction")
  private ExecutiveFonction12 fonction;

  @JsonProperty("startCode")
  private ExecutiveMouvement8 startCode;

  @JsonProperty("startDate")
  private LocalDate startDate;

  @JsonProperty("endCode")
  private ExecutiveMouvement8 endCode;

  @JsonProperty("endDate")
  private LocalDate endDate;

  @JsonProperty("lastMovementCode")
  private ExecutiveMouvement8 lastMovementCode;

  @JsonProperty("lastMovementDate")
  private LocalDate lastMovementDate;

  @JsonProperty("principal")
  private Integer principal;

  public Term4 id(String id) {
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

  public Term4 siren(Integer siren) {
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

  public Term4 fonction(ExecutiveFonction12 fonction) {
    this.fonction = fonction;
    return this;
  }

  /**
   * Get fonction
   * @return fonction
  */
  @ApiModelProperty(value = "")

  @Valid

  public ExecutiveFonction12 getFonction() {
    return fonction;
  }

  public void setFonction(ExecutiveFonction12 fonction) {
    this.fonction = fonction;
  }

  public Term4 startCode(ExecutiveMouvement8 startCode) {
    this.startCode = startCode;
    return this;
  }

  /**
   * Get startCode
   * @return startCode
  */
  @ApiModelProperty(value = "")

  @Valid

  public ExecutiveMouvement8 getStartCode() {
    return startCode;
  }

  public void setStartCode(ExecutiveMouvement8 startCode) {
    this.startCode = startCode;
  }

  public Term4 startDate(LocalDate startDate) {
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

  public Term4 endCode(ExecutiveMouvement8 endCode) {
    this.endCode = endCode;
    return this;
  }

  /**
   * Get endCode
   * @return endCode
  */
  @ApiModelProperty(value = "")

  @Valid

  public ExecutiveMouvement8 getEndCode() {
    return endCode;
  }

  public void setEndCode(ExecutiveMouvement8 endCode) {
    this.endCode = endCode;
  }

  public Term4 endDate(LocalDate endDate) {
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

  public Term4 lastMovementCode(ExecutiveMouvement8 lastMovementCode) {
    this.lastMovementCode = lastMovementCode;
    return this;
  }

  /**
   * Get lastMovementCode
   * @return lastMovementCode
  */
  @ApiModelProperty(value = "")

  @Valid

  public ExecutiveMouvement8 getLastMovementCode() {
    return lastMovementCode;
  }

  public void setLastMovementCode(ExecutiveMouvement8 lastMovementCode) {
    this.lastMovementCode = lastMovementCode;
  }

  public Term4 lastMovementDate(LocalDate lastMovementDate) {
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

  public Term4 principal(Integer principal) {
    this.principal = principal;
    return this;
  }

  /**
   * principal
   * @return principal
  */
  @ApiModelProperty(value = "principal")


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
    Term4 term4 = (Term4) o;
    return Objects.equals(this.id, term4.id) &&
        Objects.equals(this.siren, term4.siren) &&
        Objects.equals(this.fonction, term4.fonction) &&
        Objects.equals(this.startCode, term4.startCode) &&
        Objects.equals(this.startDate, term4.startDate) &&
        Objects.equals(this.endCode, term4.endCode) &&
        Objects.equals(this.endDate, term4.endDate) &&
        Objects.equals(this.lastMovementCode, term4.lastMovementCode) &&
        Objects.equals(this.lastMovementDate, term4.lastMovementDate) &&
        Objects.equals(this.principal, term4.principal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, siren, fonction, startCode, startDate, endCode, endDate, lastMovementCode, lastMovementDate, principal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Term4 {\n");
    
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

