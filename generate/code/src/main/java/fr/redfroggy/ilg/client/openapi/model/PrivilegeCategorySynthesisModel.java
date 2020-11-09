package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.PrivilegeCategoryModel2;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PrivilegeCategorySynthesisModel
 */

public class PrivilegeCategorySynthesisModel   {
  @JsonProperty("privilegeCategory")
  private PrivilegeCategoryModel2 privilegeCategory;

  @JsonProperty("amount")
  private BigDecimal amount;

  @JsonProperty("activePrivilegesCount")
  private Integer activePrivilegesCount;

  @JsonProperty("lastPrivilegeDate")
  private String lastPrivilegeDate;

  public PrivilegeCategorySynthesisModel privilegeCategory(PrivilegeCategoryModel2 privilegeCategory) {
    this.privilegeCategory = privilegeCategory;
    return this;
  }

  /**
   * Get privilegeCategory
   * @return privilegeCategory
  */
  @ApiModelProperty(value = "")

  @Valid

  public PrivilegeCategoryModel2 getPrivilegeCategory() {
    return privilegeCategory;
  }

  public void setPrivilegeCategory(PrivilegeCategoryModel2 privilegeCategory) {
    this.privilegeCategory = privilegeCategory;
  }

  public PrivilegeCategorySynthesisModel amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Privilege amount for the category
   * @return amount
  */
  @ApiModelProperty(example = "1234.56", value = "Privilege amount for the category")

  @Valid

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public PrivilegeCategorySynthesisModel activePrivilegesCount(Integer activePrivilegesCount) {
    this.activePrivilegesCount = activePrivilegesCount;
    return this;
  }

  /**
   * Number of active privileges for the category
   * @return activePrivilegesCount
  */
  @ApiModelProperty(example = "3", value = "Number of active privileges for the category")


  public Integer getActivePrivilegesCount() {
    return activePrivilegesCount;
  }

  public void setActivePrivilegesCount(Integer activePrivilegesCount) {
    this.activePrivilegesCount = activePrivilegesCount;
  }

  public PrivilegeCategorySynthesisModel lastPrivilegeDate(String lastPrivilegeDate) {
    this.lastPrivilegeDate = lastPrivilegeDate;
    return this;
  }

  /**
   * Last privilege date for the category
   * @return lastPrivilegeDate
  */
  @ApiModelProperty(value = "Last privilege date for the category")


  public String getLastPrivilegeDate() {
    return lastPrivilegeDate;
  }

  public void setLastPrivilegeDate(String lastPrivilegeDate) {
    this.lastPrivilegeDate = lastPrivilegeDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrivilegeCategorySynthesisModel privilegeCategorySynthesisModel = (PrivilegeCategorySynthesisModel) o;
    return Objects.equals(this.privilegeCategory, privilegeCategorySynthesisModel.privilegeCategory) &&
        Objects.equals(this.amount, privilegeCategorySynthesisModel.amount) &&
        Objects.equals(this.activePrivilegesCount, privilegeCategorySynthesisModel.activePrivilegesCount) &&
        Objects.equals(this.lastPrivilegeDate, privilegeCategorySynthesisModel.lastPrivilegeDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privilegeCategory, amount, activePrivilegesCount, lastPrivilegeDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrivilegeCategorySynthesisModel {\n");
    
    sb.append("    privilegeCategory: ").append(toIndentedString(privilegeCategory)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    activePrivilegesCount: ").append(toIndentedString(activePrivilegesCount)).append("\n");
    sb.append("    lastPrivilegeDate: ").append(toIndentedString(lastPrivilegeDate)).append("\n");
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

