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
 * MonitoringSubscriptionsSubscriptions
 */

public class MonitoringSubscriptionsSubscriptions   {
  @JsonProperty("subscriptionId")
  private Integer subscriptionId;

  @JsonProperty("audit")
  private Boolean audit;

  @JsonProperty("editable")
  private Boolean editable;

  @JsonProperty("status")
  private Boolean status;

  public MonitoringSubscriptionsSubscriptions subscriptionId(Integer subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

  /**
   * Get subscriptionId
   * @return subscriptionId
  */
  @ApiModelProperty(example = "5645132", value = "")


  public Integer getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(Integer subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  public MonitoringSubscriptionsSubscriptions audit(Boolean audit) {
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

  public MonitoringSubscriptionsSubscriptions editable(Boolean editable) {
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

  public MonitoringSubscriptionsSubscriptions status(Boolean status) {
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
    MonitoringSubscriptionsSubscriptions monitoringSubscriptionsSubscriptions = (MonitoringSubscriptionsSubscriptions) o;
    return Objects.equals(this.subscriptionId, monitoringSubscriptionsSubscriptions.subscriptionId) &&
        Objects.equals(this.audit, monitoringSubscriptionsSubscriptions.audit) &&
        Objects.equals(this.editable, monitoringSubscriptionsSubscriptions.editable) &&
        Objects.equals(this.status, monitoringSubscriptionsSubscriptions.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionId, audit, editable, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitoringSubscriptionsSubscriptions {\n");
    
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
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

