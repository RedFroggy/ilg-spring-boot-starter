package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.ConformityRiskItem2;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ScreeningCandidateAnalytics2
 */

public class ScreeningCandidateAnalytics2   {
  @JsonProperty("solvability")
  private ConformityRiskItem2 solvability;

  @JsonProperty("activity")
  private ConformityRiskItem2 activity;

  @JsonProperty("domiciliationCountry")
  private ConformityRiskItem2 domiciliationCountry;

  @JsonProperty("nationality")
  private ConformityRiskItem2 nationality;

  @JsonProperty("operatingRisk")
  private ConformityRiskItem2 operatingRisk;

  @JsonProperty("soe")
  private ConformityRiskItem2 soe;

  @JsonProperty("pep")
  private ConformityRiskItem2 pep;

  @JsonProperty("sanction")
  private ConformityRiskItem2 sanction;

  @JsonProperty("adverseMedia")
  private ConformityRiskItem2 adverseMedia;

  public ScreeningCandidateAnalytics2 solvability(ConformityRiskItem2 solvability) {
    this.solvability = solvability;
    return this;
  }

  /**
   * Get solvability
   * @return solvability
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConformityRiskItem2 getSolvability() {
    return solvability;
  }

  public void setSolvability(ConformityRiskItem2 solvability) {
    this.solvability = solvability;
  }

  public ScreeningCandidateAnalytics2 activity(ConformityRiskItem2 activity) {
    this.activity = activity;
    return this;
  }

  /**
   * Get activity
   * @return activity
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConformityRiskItem2 getActivity() {
    return activity;
  }

  public void setActivity(ConformityRiskItem2 activity) {
    this.activity = activity;
  }

  public ScreeningCandidateAnalytics2 domiciliationCountry(ConformityRiskItem2 domiciliationCountry) {
    this.domiciliationCountry = domiciliationCountry;
    return this;
  }

  /**
   * Get domiciliationCountry
   * @return domiciliationCountry
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConformityRiskItem2 getDomiciliationCountry() {
    return domiciliationCountry;
  }

  public void setDomiciliationCountry(ConformityRiskItem2 domiciliationCountry) {
    this.domiciliationCountry = domiciliationCountry;
  }

  public ScreeningCandidateAnalytics2 nationality(ConformityRiskItem2 nationality) {
    this.nationality = nationality;
    return this;
  }

  /**
   * Get nationality
   * @return nationality
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConformityRiskItem2 getNationality() {
    return nationality;
  }

  public void setNationality(ConformityRiskItem2 nationality) {
    this.nationality = nationality;
  }

  public ScreeningCandidateAnalytics2 operatingRisk(ConformityRiskItem2 operatingRisk) {
    this.operatingRisk = operatingRisk;
    return this;
  }

  /**
   * Get operatingRisk
   * @return operatingRisk
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConformityRiskItem2 getOperatingRisk() {
    return operatingRisk;
  }

  public void setOperatingRisk(ConformityRiskItem2 operatingRisk) {
    this.operatingRisk = operatingRisk;
  }

  public ScreeningCandidateAnalytics2 soe(ConformityRiskItem2 soe) {
    this.soe = soe;
    return this;
  }

  /**
   * Get soe
   * @return soe
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConformityRiskItem2 getSoe() {
    return soe;
  }

  public void setSoe(ConformityRiskItem2 soe) {
    this.soe = soe;
  }

  public ScreeningCandidateAnalytics2 pep(ConformityRiskItem2 pep) {
    this.pep = pep;
    return this;
  }

  /**
   * Get pep
   * @return pep
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConformityRiskItem2 getPep() {
    return pep;
  }

  public void setPep(ConformityRiskItem2 pep) {
    this.pep = pep;
  }

  public ScreeningCandidateAnalytics2 sanction(ConformityRiskItem2 sanction) {
    this.sanction = sanction;
    return this;
  }

  /**
   * Get sanction
   * @return sanction
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConformityRiskItem2 getSanction() {
    return sanction;
  }

  public void setSanction(ConformityRiskItem2 sanction) {
    this.sanction = sanction;
  }

  public ScreeningCandidateAnalytics2 adverseMedia(ConformityRiskItem2 adverseMedia) {
    this.adverseMedia = adverseMedia;
    return this;
  }

  /**
   * Get adverseMedia
   * @return adverseMedia
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConformityRiskItem2 getAdverseMedia() {
    return adverseMedia;
  }

  public void setAdverseMedia(ConformityRiskItem2 adverseMedia) {
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
    ScreeningCandidateAnalytics2 screeningCandidateAnalytics2 = (ScreeningCandidateAnalytics2) o;
    return Objects.equals(this.solvability, screeningCandidateAnalytics2.solvability) &&
        Objects.equals(this.activity, screeningCandidateAnalytics2.activity) &&
        Objects.equals(this.domiciliationCountry, screeningCandidateAnalytics2.domiciliationCountry) &&
        Objects.equals(this.nationality, screeningCandidateAnalytics2.nationality) &&
        Objects.equals(this.operatingRisk, screeningCandidateAnalytics2.operatingRisk) &&
        Objects.equals(this.soe, screeningCandidateAnalytics2.soe) &&
        Objects.equals(this.pep, screeningCandidateAnalytics2.pep) &&
        Objects.equals(this.sanction, screeningCandidateAnalytics2.sanction) &&
        Objects.equals(this.adverseMedia, screeningCandidateAnalytics2.adverseMedia);
  }

  @Override
  public int hashCode() {
    return Objects.hash(solvability, activity, domiciliationCountry, nationality, operatingRisk, soe, pep, sanction, adverseMedia);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScreeningCandidateAnalytics2 {\n");
    
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

