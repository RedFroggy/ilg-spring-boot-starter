package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Address7;
import fr.redfroggy.ilg.client.openapi.model.Greffe;
import fr.redfroggy.ilg.client.openapi.model.PrivilegeCategoryModel;
import fr.redfroggy.ilg.client.openapi.model.PrivilegeStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PrivilegeDetail
 */

public class PrivilegeDetail   {
  @JsonProperty("privilegeCategory")
  private PrivilegeCategoryModel privilegeCategory;

  @JsonProperty("status")
  private PrivilegeStatus status;

  @JsonProperty("inscriptionDate")
  private String inscriptionDate;

  @JsonProperty("inscriptionNumber")
  private String inscriptionNumber;

  @JsonProperty("debtAmount")
  private BigDecimal debtAmount;

  @JsonProperty("debtCurrency")
  private String debtCurrency;

  @JsonProperty("creditorName")
  private String creditorName;

  @JsonProperty("creditorAddress")
  private Address7 creditorAddress;

  @JsonProperty("greffe")
  private Greffe greffe;

  @JsonProperty("expirationDate")
  private String expirationDate;

  @JsonProperty("lastPartialRadiationDate")
  private String lastPartialRadiationDate;

  @JsonProperty("partialRadiationAmount")
  private BigDecimal partialRadiationAmount;

  @JsonProperty("definitiveRadiationDate")
  private String definitiveRadiationDate;

  public PrivilegeDetail privilegeCategory(PrivilegeCategoryModel privilegeCategory) {
    this.privilegeCategory = privilegeCategory;
    return this;
  }

  /**
   * Get privilegeCategory
   * @return privilegeCategory
  */
  @ApiModelProperty(value = "")

  @Valid

  public PrivilegeCategoryModel getPrivilegeCategory() {
    return privilegeCategory;
  }

  public void setPrivilegeCategory(PrivilegeCategoryModel privilegeCategory) {
    this.privilegeCategory = privilegeCategory;
  }

  public PrivilegeDetail status(PrivilegeStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(value = "")

  @Valid

  public PrivilegeStatus getStatus() {
    return status;
  }

  public void setStatus(PrivilegeStatus status) {
    this.status = status;
  }

  public PrivilegeDetail inscriptionDate(String inscriptionDate) {
    this.inscriptionDate = inscriptionDate;
    return this;
  }

  /**
   * Inscription date
   * @return inscriptionDate
  */
  @ApiModelProperty(value = "Inscription date")


  public String getInscriptionDate() {
    return inscriptionDate;
  }

  public void setInscriptionDate(String inscriptionDate) {
    this.inscriptionDate = inscriptionDate;
  }

  public PrivilegeDetail inscriptionNumber(String inscriptionNumber) {
    this.inscriptionNumber = inscriptionNumber;
    return this;
  }

  /**
   * Inscription number
   * @return inscriptionNumber
  */
  @ApiModelProperty(value = "Inscription number")


  public String getInscriptionNumber() {
    return inscriptionNumber;
  }

  public void setInscriptionNumber(String inscriptionNumber) {
    this.inscriptionNumber = inscriptionNumber;
  }

  public PrivilegeDetail debtAmount(BigDecimal debtAmount) {
    this.debtAmount = debtAmount;
    return this;
  }

  /**
   * Debt amount
   * @return debtAmount
  */
  @ApiModelProperty(value = "Debt amount")

  @Valid

  public BigDecimal getDebtAmount() {
    return debtAmount;
  }

  public void setDebtAmount(BigDecimal debtAmount) {
    this.debtAmount = debtAmount;
  }

  public PrivilegeDetail debtCurrency(String debtCurrency) {
    this.debtCurrency = debtCurrency;
    return this;
  }

  /**
   * Debt currency
   * @return debtCurrency
  */
  @ApiModelProperty(value = "Debt currency")


  public String getDebtCurrency() {
    return debtCurrency;
  }

  public void setDebtCurrency(String debtCurrency) {
    this.debtCurrency = debtCurrency;
  }

  public PrivilegeDetail creditorName(String creditorName) {
    this.creditorName = creditorName;
    return this;
  }

  /**
   * Privilege's creditor name
   * @return creditorName
  */
  @ApiModelProperty(value = "Privilege's creditor name")


  public String getCreditorName() {
    return creditorName;
  }

  public void setCreditorName(String creditorName) {
    this.creditorName = creditorName;
  }

  public PrivilegeDetail creditorAddress(Address7 creditorAddress) {
    this.creditorAddress = creditorAddress;
    return this;
  }

  /**
   * Get creditorAddress
   * @return creditorAddress
  */
  @ApiModelProperty(value = "")

  @Valid

  public Address7 getCreditorAddress() {
    return creditorAddress;
  }

  public void setCreditorAddress(Address7 creditorAddress) {
    this.creditorAddress = creditorAddress;
  }

  public PrivilegeDetail greffe(Greffe greffe) {
    this.greffe = greffe;
    return this;
  }

  /**
   * Get greffe
   * @return greffe
  */
  @ApiModelProperty(value = "")

  @Valid

  public Greffe getGreffe() {
    return greffe;
  }

  public void setGreffe(Greffe greffe) {
    this.greffe = greffe;
  }

  public PrivilegeDetail expirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * Privilege expiration date
   * @return expirationDate
  */
  @ApiModelProperty(value = "Privilege expiration date")


  public String getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }

  public PrivilegeDetail lastPartialRadiationDate(String lastPartialRadiationDate) {
    this.lastPartialRadiationDate = lastPartialRadiationDate;
    return this;
  }

  /**
   * Last partial radiation date
   * @return lastPartialRadiationDate
  */
  @ApiModelProperty(value = "Last partial radiation date")


  public String getLastPartialRadiationDate() {
    return lastPartialRadiationDate;
  }

  public void setLastPartialRadiationDate(String lastPartialRadiationDate) {
    this.lastPartialRadiationDate = lastPartialRadiationDate;
  }

  public PrivilegeDetail partialRadiationAmount(BigDecimal partialRadiationAmount) {
    this.partialRadiationAmount = partialRadiationAmount;
    return this;
  }

  /**
   * Partial radiation amount
   * @return partialRadiationAmount
  */
  @ApiModelProperty(value = "Partial radiation amount")

  @Valid

  public BigDecimal getPartialRadiationAmount() {
    return partialRadiationAmount;
  }

  public void setPartialRadiationAmount(BigDecimal partialRadiationAmount) {
    this.partialRadiationAmount = partialRadiationAmount;
  }

  public PrivilegeDetail definitiveRadiationDate(String definitiveRadiationDate) {
    this.definitiveRadiationDate = definitiveRadiationDate;
    return this;
  }

  /**
   * Definitive radiation date
   * @return definitiveRadiationDate
  */
  @ApiModelProperty(value = "Definitive radiation date")


  public String getDefinitiveRadiationDate() {
    return definitiveRadiationDate;
  }

  public void setDefinitiveRadiationDate(String definitiveRadiationDate) {
    this.definitiveRadiationDate = definitiveRadiationDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrivilegeDetail privilegeDetail = (PrivilegeDetail) o;
    return Objects.equals(this.privilegeCategory, privilegeDetail.privilegeCategory) &&
        Objects.equals(this.status, privilegeDetail.status) &&
        Objects.equals(this.inscriptionDate, privilegeDetail.inscriptionDate) &&
        Objects.equals(this.inscriptionNumber, privilegeDetail.inscriptionNumber) &&
        Objects.equals(this.debtAmount, privilegeDetail.debtAmount) &&
        Objects.equals(this.debtCurrency, privilegeDetail.debtCurrency) &&
        Objects.equals(this.creditorName, privilegeDetail.creditorName) &&
        Objects.equals(this.creditorAddress, privilegeDetail.creditorAddress) &&
        Objects.equals(this.greffe, privilegeDetail.greffe) &&
        Objects.equals(this.expirationDate, privilegeDetail.expirationDate) &&
        Objects.equals(this.lastPartialRadiationDate, privilegeDetail.lastPartialRadiationDate) &&
        Objects.equals(this.partialRadiationAmount, privilegeDetail.partialRadiationAmount) &&
        Objects.equals(this.definitiveRadiationDate, privilegeDetail.definitiveRadiationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privilegeCategory, status, inscriptionDate, inscriptionNumber, debtAmount, debtCurrency, creditorName, creditorAddress, greffe, expirationDate, lastPartialRadiationDate, partialRadiationAmount, definitiveRadiationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrivilegeDetail {\n");
    
    sb.append("    privilegeCategory: ").append(toIndentedString(privilegeCategory)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    inscriptionDate: ").append(toIndentedString(inscriptionDate)).append("\n");
    sb.append("    inscriptionNumber: ").append(toIndentedString(inscriptionNumber)).append("\n");
    sb.append("    debtAmount: ").append(toIndentedString(debtAmount)).append("\n");
    sb.append("    debtCurrency: ").append(toIndentedString(debtCurrency)).append("\n");
    sb.append("    creditorName: ").append(toIndentedString(creditorName)).append("\n");
    sb.append("    creditorAddress: ").append(toIndentedString(creditorAddress)).append("\n");
    sb.append("    greffe: ").append(toIndentedString(greffe)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    lastPartialRadiationDate: ").append(toIndentedString(lastPartialRadiationDate)).append("\n");
    sb.append("    partialRadiationAmount: ").append(toIndentedString(partialRadiationAmount)).append("\n");
    sb.append("    definitiveRadiationDate: ").append(toIndentedString(definitiveRadiationDate)).append("\n");
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

