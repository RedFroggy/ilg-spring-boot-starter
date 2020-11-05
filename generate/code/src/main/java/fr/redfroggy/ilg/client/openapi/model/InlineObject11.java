package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.MonitoringSubscriptionsSubscriptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineObject11
 */

public class InlineObject11   {
  @JsonProperty("userEmail")
  private String userEmail;

  @JsonProperty("subscriptions")
  @Valid
  private List<MonitoringSubscriptionsSubscriptions> subscriptions = null;

  public InlineObject11 userEmail(String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

  /**
   * Get userEmail
   * @return userEmail
  */
  @ApiModelProperty(example = "example@example.com", value = "")


  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  public InlineObject11 subscriptions(List<MonitoringSubscriptionsSubscriptions> subscriptions) {
    this.subscriptions = subscriptions;
    return this;
  }

  public InlineObject11 addSubscriptionsItem(MonitoringSubscriptionsSubscriptions subscriptionsItem) {
    if (this.subscriptions == null) {
      this.subscriptions = new ArrayList<>();
    }
    this.subscriptions.add(subscriptionsItem);
    return this;
  }

  /**
   * Get subscriptions
   * @return subscriptions
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<MonitoringSubscriptionsSubscriptions> getSubscriptions() {
    return subscriptions;
  }

  public void setSubscriptions(List<MonitoringSubscriptionsSubscriptions> subscriptions) {
    this.subscriptions = subscriptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject11 inlineObject11 = (InlineObject11) o;
    return Objects.equals(this.userEmail, inlineObject11.userEmail) &&
        Objects.equals(this.subscriptions, inlineObject11.subscriptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userEmail, subscriptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject11 {\n");
    
    sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
    sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
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

