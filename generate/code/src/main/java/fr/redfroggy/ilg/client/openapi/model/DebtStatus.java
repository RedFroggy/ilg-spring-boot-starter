package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.DebtSocialStatusModel;
import fr.redfroggy.ilg.client.openapi.model.DebtTaxOfficeStatusModel;
import fr.redfroggy.ilg.client.openapi.model.Privilege;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DebtStatus
 */

public class DebtStatus   {
  @JsonProperty("socialStatus")
  private DebtSocialStatusModel socialStatus;

  @JsonProperty("taxOfficeStatus")
  private DebtTaxOfficeStatusModel taxOfficeStatus;

  @JsonProperty("privilege")
  private Privilege privilege;

  public DebtStatus socialStatus(DebtSocialStatusModel socialStatus) {
    this.socialStatus = socialStatus;
    return this;
  }

  /**
   * Get socialStatus
   * @return socialStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public DebtSocialStatusModel getSocialStatus() {
    return socialStatus;
  }

  public void setSocialStatus(DebtSocialStatusModel socialStatus) {
    this.socialStatus = socialStatus;
  }

  public DebtStatus taxOfficeStatus(DebtTaxOfficeStatusModel taxOfficeStatus) {
    this.taxOfficeStatus = taxOfficeStatus;
    return this;
  }

  /**
   * Get taxOfficeStatus
   * @return taxOfficeStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public DebtTaxOfficeStatusModel getTaxOfficeStatus() {
    return taxOfficeStatus;
  }

  public void setTaxOfficeStatus(DebtTaxOfficeStatusModel taxOfficeStatus) {
    this.taxOfficeStatus = taxOfficeStatus;
  }

  public DebtStatus privilege(Privilege privilege) {
    this.privilege = privilege;
    return this;
  }

  /**
   * Get privilege
   * @return privilege
  */
  @ApiModelProperty(value = "")

  @Valid

  public Privilege getPrivilege() {
    return privilege;
  }

  public void setPrivilege(Privilege privilege) {
    this.privilege = privilege;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DebtStatus debtStatus = (DebtStatus) o;
    return Objects.equals(this.socialStatus, debtStatus.socialStatus) &&
        Objects.equals(this.taxOfficeStatus, debtStatus.taxOfficeStatus) &&
        Objects.equals(this.privilege, debtStatus.privilege);
  }

  @Override
  public int hashCode() {
    return Objects.hash(socialStatus, taxOfficeStatus, privilege);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebtStatus {\n");
    
    sb.append("    socialStatus: ").append(toIndentedString(socialStatus)).append("\n");
    sb.append("    taxOfficeStatus: ").append(toIndentedString(taxOfficeStatus)).append("\n");
    sb.append("    privilege: ").append(toIndentedString(privilege)).append("\n");
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

