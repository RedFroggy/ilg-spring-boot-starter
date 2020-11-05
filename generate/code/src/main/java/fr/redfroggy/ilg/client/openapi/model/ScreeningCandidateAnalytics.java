package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.ConformityRiskItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ScreeningCandidateAnalytics
 */

public class ScreeningCandidateAnalytics   {
  @JsonProperty("solvability")
  private ConformityRiskItem solvability;

  @JsonProperty("activity")
  private ConformityRiskItem activity;

  @JsonProperty("domiciliationCountry")
  private ConformityRiskItem domiciliationCountry;

  @JsonProperty("nationality")
  private ConformityRiskItem nationality;

  @JsonProperty("operatingRisk")
  private ConformityRiskItem operatingRisk;

  @JsonProperty("soe")
  private ConformityRiskItem soe;

  @JsonProperty("pep")
  private ConformityRiskItem pep;

  @JsonProperty("sanction")
  private ConformityRiskItem sanction;

  @JsonProperty("adverseMedia")
  private ConformityRiskItem adverseMedia;

  public ScreeningCandidateAnalytics solvability(ConformityRiskItem solvability) {
    this.solvability = solvability;
    return this;
  }

  /**
   * Get solvability
   * @return solvability
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConformityRiskItem getSolvability() {
    return solvability;
  }

  public void setSolvability(ConformityRiskItem solvability) {
    this.solvability = solvability;
  }

  public ScreeningCandidateAnalytics activity(ConformityRiskItem activity) {
    this.activity = activity;
    return this;
  }

  /**
   * Get activity
   * @return activity
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConformityRiskItem getActivity() {
    return activity;
  }

  public void setActivity(ConformityRiskItem activity) {
    this.activity = activity;
  }

  public ScreeningCandidateAnalytics domiciliationCountry(ConformityRiskItem domiciliationCountry) {
    this.domiciliationCountry = domiciliationCountry;
    return this;
  }

  /**
   * Get domiciliationCountry
   * @return domiciliationCountry
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConformityRiskItem getDomiciliationCountry() {
    return domiciliationCountry;
  }

  public void setDomiciliationCountry(ConformityRiskItem domiciliationCountry) {
    this.domiciliationCountry = domiciliationCountry;
  }

  public ScreeningCandidateAnalytics nationality(ConformityRiskItem nationality) {
    this.nationality = nationality;
    return this;
  }

  /**
   * Get nationality
   * @return nationality
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConformityRiskItem getNationality() {
    return nationality;
  }

  public void setNationality(ConformityRiskItem nationality) {
    this.nationality = nationality;
  }

  public ScreeningCandidateAnalytics operatingRisk(ConformityRiskItem operatingRisk) {
    this.operatingRisk = operatingRisk;
    return this;
  }

  /**
   * Get operatingRisk
   * @return operatingRisk
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConformityRiskItem getOperatingRisk() {
    return operatingRisk;
  }

  public void setOperatingRisk(ConformityRiskItem operatingRisk) {
    this.operatingRisk = operatingRisk;
  }

  public ScreeningCandidateAnalytics soe(ConformityRiskItem soe) {
    this.soe = soe;
    return this;
  }

  /**
   * Get soe
   * @return soe
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConformityRiskItem getSoe() {
    return soe;
  }

  public void setSoe(ConformityRiskItem soe) {
    this.soe = soe;
  }

  public ScreeningCandidateAnalytics pep(ConformityRiskItem pep) {
    this.pep = pep;
    return this;
  }

  /**
   * Get pep
   * @return pep
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConformityRiskItem getPep() {
    return pep;
  }

  public void setPep(ConformityRiskItem pep) {
    this.pep = pep;
  }

  public ScreeningCandidateAnalytics sanction(ConformityRiskItem sanction) {
    this.sanction = sanction;
    return this;
  }

  /**
   * Get sanction
   * @return sanction
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConformityRiskItem getSanction() {
    return sanction;
  }

  public void setSanction(ConformityRiskItem sanction) {
    this.sanction = sanction;
  }

  public ScreeningCandidateAnalytics adverseMedia(ConformityRiskItem adverseMedia) {
    this.adverseMedia = adverseMedia;
    return this;
  }

  /**
   * Get adverseMedia
   * @return adverseMedia
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConformityRiskItem getAdverseMedia() {
    return adverseMedia;
  }

  public void setAdverseMedia(ConformityRiskItem adverseMedia) {
    this.adverseMedia = adverseMedia;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScreeningCandidateAnalytics screeningCandidateAnalytics = (ScreeningCandidateAnalytics) o;
    return Objects.equals(this.solvability, screeningCandidateAnalytics.solvability) &&
        Objects.equals(this.activity, screeningCandidateAnalytics.activity) &&
        Objects.equals(this.domiciliationCountry, screeningCandidateAnalytics.domiciliationCountry) &&
        Objects.equals(this.nationality, screeningCandidateAnalytics.nationality) &&
        Objects.equals(this.operatingRisk, screeningCandidateAnalytics.operatingRisk) &&
        Objects.equals(this.soe, screeningCandidateAnalytics.soe) &&
        Objects.equals(this.pep, screeningCandidateAnalytics.pep) &&
        Objects.equals(this.sanction, screeningCandidateAnalytics.sanction) &&
        Objects.equals(this.adverseMedia, screeningCandidateAnalytics.adverseMedia);
  }

  @Override
  public int hashCode() {
    return Objects.hash(solvability, activity, domiciliationCountry, nationality, operatingRisk, soe, pep, sanction, adverseMedia);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScreeningCandidateAnalytics {\n");
    
    sb.append("    solvability: ").append(toIndentedString(solvability)).append("\n");
    sb.append("    activity: ").append(toIndentedString(activity)).append("\n");
    sb.append("    domiciliationCountry: ").append(toIndentedString(domiciliationCountry)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    operatingRisk: ").append(toIndentedString(operatingRisk)).append("\n");
    sb.append("    soe: ").append(toIndentedString(soe)).append("\n");
    sb.append("    pep: ").append(toIndentedString(pep)).append("\n");
    sb.append("    sanction: ").append(toIndentedString(sanction)).append("\n");
    sb.append("    adverseMedia: ").append(toIndentedString(adverseMedia)).append("\n");
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

