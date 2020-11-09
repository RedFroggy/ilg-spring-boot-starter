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
 * MonitoringUserSubscriptionsPortfolios
 */

public class MonitoringUserSubscriptionsPortfolios   {
  @JsonProperty("portfolioId")
  private Integer portfolioId;

  @JsonProperty("audit")
  private Boolean audit;

  @JsonProperty("editable")
  private Boolean editable;

  @JsonProperty("status")
  private Boolean status;

  public MonitoringUserSubscriptionsPortfolios portfolioId(Integer portfolioId) {
    this.portfolioId = portfolioId;
    return this;
  }

  /**
   * Get portfolioId
   * @return portfolioId
  */
  @ApiModelProperty(example = "5645132", value = "")


  public Integer getPortfolioId() {
    return portfolioId;
  }

  public void setPortfolioId(Integer portfolioId) {
    this.portfolioId = portfolioId;
  }

  public MonitoringUserSubscriptionsPortfolios audit(Boolean audit) {
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

  public MonitoringUserSubscriptionsPortfolios editable(Boolean editable) {
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

  public MonitoringUserSubscriptionsPortfolios status(Boolean status) {
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
    MonitoringUserSubscriptionsPortfolios monitoringUserSubscriptionsPortfolios = (MonitoringUserSubscriptionsPortfolios) o;
    return Objects.equals(this.portfolioId, monitoringUserSubscriptionsPortfolios.portfolioId) &&
        Objects.equals(this.audit, monitoringUserSubscriptionsPortfolios.audit) &&
        Objects.equals(this.editable, monitoringUserSubscriptionsPortfolios.editable) &&
        Objects.equals(this.status, monitoringUserSubscriptionsPortfolios.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portfolioId, audit, editable, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitoringUserSubscriptionsPortfolios {\n");
    
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

