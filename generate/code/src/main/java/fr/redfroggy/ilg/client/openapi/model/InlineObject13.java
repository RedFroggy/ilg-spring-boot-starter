package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.MonitoringUserSubscriptionsPortfolios;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineObject13
 */

public class InlineObject13   {
  @JsonProperty("targetEmail")
  private String targetEmail;

  @JsonProperty("fullName")
  private String fullName;

  @JsonProperty("comment")
  private String comment;

  @JsonProperty("portfolios")
  @Valid
  private List<MonitoringUserSubscriptionsPortfolios> portfolios = null;

  public InlineObject13 targetEmail(String targetEmail) {
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

  public InlineObject13 fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Get fullName
   * @return fullName
  */
  @ApiModelProperty(example = "NOM Prenom", value = "")


  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public InlineObject13 comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Get comment
   * @return comment
  */
  @ApiModelProperty(example = "texte example", value = "")


  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public InlineObject13 portfolios(List<MonitoringUserSubscriptionsPortfolios> portfolios) {
    this.portfolios = portfolios;
    return this;
  }

  public InlineObject13 addPortfoliosItem(MonitoringUserSubscriptionsPortfolios portfoliosItem) {
    if (this.portfolios == null) {
      this.portfolios = new ArrayList<>();
    }
    this.portfolios.add(portfoliosItem);
    return this;
  }

  /**
   * Get portfolios
   * @return portfolios
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<MonitoringUserSubscriptionsPortfolios> getPortfolios() {
    return portfolios;
  }

  public void setPortfolios(List<MonitoringUserSubscriptionsPortfolios> portfolios) {
    this.portfolios = portfolios;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject13 inlineObject13 = (InlineObject13) o;
    return Objects.equals(this.targetEmail, inlineObject13.targetEmail) &&
        Objects.equals(this.fullName, inlineObject13.fullName) &&
        Objects.equals(this.comment, inlineObject13.comment) &&
        Objects.equals(this.portfolios, inlineObject13.portfolios);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetEmail, fullName, comment, portfolios);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject13 {\n");
    
    sb.append("    targetEmail: ").append(toIndentedString(targetEmail)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    portfolios: ").append(toIndentedString(portfolios)).append("\n");
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

