package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.LegalDepositList2;
import fr.redfroggy.ilg.client.openapi.model.LegalStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Legal
 */

public class Legal   {
  @JsonProperty("deposits")
  private LegalDepositList2 deposits;

  @JsonProperty("status")
  private LegalStatus status;

  public Legal deposits(LegalDepositList2 deposits) {
    this.deposits = deposits;
    return this;
  }

  /**
   * Get deposits
   * @return deposits
  */
  @ApiModelProperty(value = "")

  @Valid

  public LegalDepositList2 getDeposits() {
    return deposits;
  }

  public void setDeposits(LegalDepositList2 deposits) {
    this.deposits = deposits;
  }

  public Legal status(LegalStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(value = "")

  @Valid

  public LegalStatus getStatus() {
    return status;
  }

  public void setStatus(LegalStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Legal legal = (Legal) o;
    return Objects.equals(this.deposits, legal.deposits) &&
        Objects.equals(this.status, legal.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deposits, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Legal {\n");
    
    sb.append("    deposits: ").append(toIndentedString(deposits)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

