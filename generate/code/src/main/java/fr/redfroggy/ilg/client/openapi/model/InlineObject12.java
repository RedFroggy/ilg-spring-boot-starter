package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineObject12
 */

public class InlineObject12   {
  @JsonProperty("targetId")
  private Integer targetId;

  @JsonProperty("targetEmail")
  private String targetEmail;

  @JsonProperty("portfolioId")
  private Integer portfolioId;

  @JsonProperty("audit")
  private Boolean audit;

  @JsonProperty("editable")
  private Boolean editable;

  @JsonProperty("status")
  private Boolean status;

  public InlineObject12 targetId(Integer targetId) {
    this.targetId = targetId;
    return this;
  }

  /**
   * Get targetId
   * @return targetId
  */
  @ApiModelProperty(example = "1505545", value = "")


  public Integer getTargetId() {
    return targetId;
  }

  public void setTargetId(Integer targetId) {
    this.targetId = targetId;
  }

  public InlineObject12 targetEmail(String targetEmail) {
    this.targetEmail = targetEmail;
    return this;
  }

  /**
   * Get targetEmail
   * @return targetEmail
  */
  @ApiModelProperty(example = "example@example.fr", value = "")


  public String getTargetEmail() {
    return targetEmail;
  }

  public void setTargetEmail(String targetEmail) {
    this.targetEmail = targetEmail;
  }

  public InlineObject12 portfolioId(Integer portfolioId) {
    this.portfolioId = portfolioId;
    return this;
  }

  /**
   * Get portfolioId
   * @return portfolioId
  */
  @ApiModelProperty(example = "1154456", value = "")


  public Integer getPortfolioId() {
    return portfolioId;
  }

  public void setPortfolioId(Integer portfolioId) {
    this.portfolioId = portfolioId;
  }

  public InlineObject12 audit(Boolean audit) {
    this.audit = audit;
    return this;
  }

  /**
   * Get audit
   * @return audit
  */
  @ApiModelProperty(example = "true", value = "")


  public Boolean getAudit() {
    return audit;
  }

  public void setAudit(Boolean audit) {
    this.audit = audit;
  }

  public InlineObject12 editable(Boolean editable) {
    this.editable = editable;
    return this;
  }

  /**
   * Get editable
   * @return editable
  */
  @ApiModelProperty(example = "true", value = "")


  public Boolean getEditable() {
    return editable;
  }

  public void setEditable(Boolean editable) {
    this.editable = editable;
  }

  public InlineObject12 status(Boolean status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(example = "true", value = "")


  public Boolean getStatus() {
    return status;
  }

  public void setStatus(Boolean status) {
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
    InlineObject12 inlineObject12 = (InlineObject12) o;
    return Objects.equals(this.targetId, inlineObject12.targetId) &&
        Objects.equals(this.targetEmail, inlineObject12.targetEmail) &&
        Objects.equals(this.portfolioId, inlineObject12.portfolioId) &&
        Objects.equals(this.audit, inlineObject12.audit) &&
        Objects.equals(this.editable, inlineObject12.editable) &&
        Objects.equals(this.status, inlineObject12.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetId, targetEmail, portfolioId, audit, editable, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject12 {\n");
    
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    targetEmail: ").append(toIndentedString(targetEmail)).append("\n");
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    audit: ").append(toIndentedString(audit)).append("\n");
    sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
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

