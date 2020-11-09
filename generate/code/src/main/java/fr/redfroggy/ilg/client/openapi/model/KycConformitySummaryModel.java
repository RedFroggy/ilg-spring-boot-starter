package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.KycConformitySummaryNodeModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * KycConformitySummaryModel
 */

public class KycConformitySummaryModel   {
  @JsonProperty("company")
  private KycConformitySummaryNodeModel company;

  @JsonProperty("executives")
  private KycConformitySummaryNodeModel executives;

  @JsonProperty("group")
  private KycConformitySummaryNodeModel group;

  @JsonProperty("shareholders")
  private KycConformitySummaryNodeModel shareholders;

  @JsonProperty("ubos")
  private KycConformitySummaryNodeModel ubos;

  @JsonProperty("summary")
  private KycConformitySummaryNodeModel summary;

  public KycConformitySummaryModel company(KycConformitySummaryNodeModel company) {
    this.company = company;
    return this;
  }

  /**
   * Get company
   * @return company
  */
  @ApiModelProperty(value = "")

  @Valid

  public KycConformitySummaryNodeModel getCompany() {
    return company;
  }

  public void setCompany(KycConformitySummaryNodeModel company) {
    this.company = company;
  }

  public KycConformitySummaryModel executives(KycConformitySummaryNodeModel executives) {
    this.executives = executives;
    return this;
  }

  /**
   * Get executives
   * @return executives
  */
  @ApiModelProperty(value = "")

  @Valid

  public KycConformitySummaryNodeModel getExecutives() {
    return executives;
  }

  public void setExecutives(KycConformitySummaryNodeModel executives) {
    this.executives = executives;
  }

  public KycConformitySummaryModel group(KycConformitySummaryNodeModel group) {
    this.group = group;
    return this;
  }

  /**
   * Get group
   * @return group
  */
  @ApiModelProperty(value = "")

  @Valid

  public KycConformitySummaryNodeModel getGroup() {
    return group;
  }

  public void setGroup(KycConformitySummaryNodeModel group) {
    this.group = group;
  }

  public KycConformitySummaryModel shareholders(KycConformitySummaryNodeModel shareholders) {
    this.shareholders = shareholders;
    return this;
  }

  /**
   * Get shareholders
   * @return shareholders
  */
  @ApiModelProperty(value = "")

  @Valid

  public KycConformitySummaryNodeModel getShareholders() {
    return shareholders;
  }

  public void setShareholders(KycConformitySummaryNodeModel shareholders) {
    this.shareholders = shareholders;
  }

  public KycConformitySummaryModel ubos(KycConformitySummaryNodeModel ubos) {
    this.ubos = ubos;
    return this;
  }

  /**
   * Get ubos
   * @return ubos
  */
  @ApiModelProperty(value = "")

  @Valid

  public KycConformitySummaryNodeModel getUbos() {
    return ubos;
  }

  public void setUbos(KycConformitySummaryNodeModel ubos) {
    this.ubos = ubos;
  }

  public KycConformitySummaryModel summary(KycConformitySummaryNodeModel summary) {
    this.summary = summary;
    return this;
  }

  /**
   * Get summary
   * @return summary
  */
  @ApiModelProperty(value = "")

  @Valid

  public KycConformitySummaryNodeModel getSummary() {
    return summary;
  }

  public void setSummary(KycConformitySummaryNodeModel summary) {
    this.summary = summary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KycConformitySummaryModel kycConformitySummaryModel = (KycConformitySummaryModel) o;
    return Objects.equals(this.company, kycConformitySummaryModel.company) &&
        Objects.equals(this.executives, kycConformitySummaryModel.executives) &&
        Objects.equals(this.group, kycConformitySummaryModel.group) &&
        Objects.equals(this.shareholders, kycConformitySummaryModel.shareholders) &&
        Objects.equals(this.ubos, kycConformitySummaryModel.ubos) &&
        Objects.equals(this.summary, kycConformitySummaryModel.summary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(company, executives, group, shareholders, ubos, summary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KycConformitySummaryModel {\n");
    
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    executives: ").append(toIndentedString(executives)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    shareholders: ").append(toIndentedString(shareholders)).append("\n");
    sb.append("    ubos: ").append(toIndentedString(ubos)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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

