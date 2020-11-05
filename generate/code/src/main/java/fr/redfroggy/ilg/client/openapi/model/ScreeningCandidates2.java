package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.ConformityIdentity2;
import fr.redfroggy.ilg.client.openapi.model.ScreeningCandidate2;
import fr.redfroggy.ilg.client.openapi.model.ScreeningCandidateAnalytics2;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ScreeningCandidates2
 */

public class ScreeningCandidates2   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("candidates")
  @Valid
  private List<ScreeningCandidate2> candidates = null;

  @JsonProperty("processed")
  private Boolean processed;

  @JsonProperty("count")
  private Integer count;

  @JsonProperty("candidatesGeneratedAt")
  private String candidatesGeneratedAt;

  @JsonProperty("candidatesOldestGeneratedAt")
  private String candidatesOldestGeneratedAt;

  @JsonProperty("analytics")
  private ScreeningCandidateAnalytics2 analytics;

  @JsonProperty("source")
  private String source;

  @JsonProperty("hasScreened")
  private Boolean hasScreened;

  @JsonProperty("identity")
  private ConformityIdentity2 identity;

  @JsonProperty("nbUnprocessed")
  private Integer nbUnprocessed;

  public ScreeningCandidates2 id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Candidates identifier
   * @return id
  */
  @ApiModelProperty(example = "8cb0617a719d92b3322d06dd8ba64f793f00a39d", value = "Candidates identifier")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ScreeningCandidates2 candidates(List<ScreeningCandidate2> candidates) {
    this.candidates = candidates;
    return this;
  }

  public ScreeningCandidates2 addCandidatesItem(ScreeningCandidate2 candidatesItem) {
    if (this.candidates == null) {
      this.candidates = new ArrayList<>();
    }
    this.candidates.add(candidatesItem);
    return this;
  }

  /**
   * Candidates list
   * @return candidates
  */
  @ApiModelProperty(value = "Candidates list")

  @Valid

  public List<ScreeningCandidate2> getCandidates() {
    return candidates;
  }

  public void setCandidates(List<ScreeningCandidate2> candidates) {
    this.candidates = candidates;
  }

  public ScreeningCandidates2 processed(Boolean processed) {
    this.processed = processed;
    return this;
  }

  /**
   * Wether candidates has been processed
   * @return processed
  */
  @ApiModelProperty(example = "false", value = "Wether candidates has been processed")


  public Boolean getProcessed() {
    return processed;
  }

  public void setProcessed(Boolean processed) {
    this.processed = processed;
  }

  public ScreeningCandidates2 count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Number of candidates
   * @return count
  */
  @ApiModelProperty(example = "1", value = "Number of candidates")


  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public ScreeningCandidates2 candidatesGeneratedAt(String candidatesGeneratedAt) {
    this.candidatesGeneratedAt = candidatesGeneratedAt;
    return this;
  }

  /**
   * Candidates's last search date
   * @return candidatesGeneratedAt
  */
  @ApiModelProperty(example = "2018-12-07 12:52:35", value = "Candidates's last search date")


  public String getCandidatesGeneratedAt() {
    return candidatesGeneratedAt;
  }

  public void setCandidatesGeneratedAt(String candidatesGeneratedAt) {
    this.candidatesGeneratedAt = candidatesGeneratedAt;
  }

  public ScreeningCandidates2 candidatesOldestGeneratedAt(String candidatesOldestGeneratedAt) {
    this.candidatesOldestGeneratedAt = candidatesOldestGeneratedAt;
    return this;
  }

  /**
   * Candidates's oldest search date
   * @return candidatesOldestGeneratedAt
  */
  @ApiModelProperty(example = "2018-12-07 12:52:35", value = "Candidates's oldest search date")


  public String getCandidatesOldestGeneratedAt() {
    return candidatesOldestGeneratedAt;
  }

  public void setCandidatesOldestGeneratedAt(String candidatesOldestGeneratedAt) {
    this.candidatesOldestGeneratedAt = candidatesOldestGeneratedAt;
  }

  public ScreeningCandidates2 analytics(ScreeningCandidateAnalytics2 analytics) {
    this.analytics = analytics;
    return this;
  }

  /**
   * Get analytics
   * @return analytics
  */
  @ApiModelProperty(value = "")

  @Valid

  public ScreeningCandidateAnalytics2 getAnalytics() {
    return analytics;
  }

  public void setAnalytics(ScreeningCandidateAnalytics2 analytics) {
    this.analytics = analytics;
  }

  public ScreeningCandidates2 source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Data source
   * @return source
  */
  @ApiModelProperty(example = "ILG / LN / MIXED", value = "Data source")


  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public ScreeningCandidates2 hasScreened(Boolean hasScreened) {
    this.hasScreened = hasScreened;
    return this;
  }

  /**
   * Wether candidates has been screened
   * @return hasScreened
  */
  @ApiModelProperty(example = "false", value = "Wether candidates has been screened")


  public Boolean getHasScreened() {
    return hasScreened;
  }

  public void setHasScreened(Boolean hasScreened) {
    this.hasScreened = hasScreened;
  }

  public ScreeningCandidates2 identity(ConformityIdentity2 identity) {
    this.identity = identity;
    return this;
  }

  /**
   * Get identity
   * @return identity
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConformityIdentity2 getIdentity() {
    return identity;
  }

  public void setIdentity(ConformityIdentity2 identity) {
    this.identity = identity;
  }

  public ScreeningCandidates2 nbUnprocessed(Integer nbUnprocessed) {
    this.nbUnprocessed = nbUnprocessed;
    return this;
  }

  /**
   * Number of unprocessed candidate
   * @return nbUnprocessed
  */
  @ApiModelProperty(example = "1", value = "Number of unprocessed candidate")


  public Integer getNbUnprocessed() {
    return nbUnprocessed;
  }

  public void setNbUnprocessed(Integer nbUnprocessed) {
    this.nbUnprocessed = nbUnprocessed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScreeningCandidates2 screeningCandidates2 = (ScreeningCandidates2) o;
    return Objects.equals(this.id, screeningCandidates2.id) &&
        Objects.equals(this.candidates, screeningCandidates2.candidates) &&
        Objects.equals(this.processed, screeningCandidates2.processed) &&
        Objects.equals(this.count, screeningCandidates2.count) &&
        Objects.equals(this.candidatesGeneratedAt, screeningCandidates2.candidatesGeneratedAt) &&
        Objects.equals(this.candidatesOldestGeneratedAt, screeningCandidates2.candidatesOldestGeneratedAt) &&
        Objects.equals(this.analytics, screeningCandidates2.analytics) &&
        Objects.equals(this.source, screeningCandidates2.source) &&
        Objects.equals(this.hasScreened, screeningCandidates2.hasScreened) &&
        Objects.equals(this.identity, screeningCandidates2.identity) &&
        Objects.equals(this.nbUnprocessed, screeningCandidates2.nbUnprocessed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, candidates, processed, count, candidatesGeneratedAt, candidatesOldestGeneratedAt, analytics, source, hasScreened, identity, nbUnprocessed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScreeningCandidates2 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    candidates: ").append(toIndentedString(candidates)).append("\n");
    sb.append("    processed: ").append(toIndentedString(processed)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    candidatesGeneratedAt: ").append(toIndentedString(candidatesGeneratedAt)).append("\n");
    sb.append("    candidatesOldestGeneratedAt: ").append(toIndentedString(candidatesOldestGeneratedAt)).append("\n");
    sb.append("    analytics: ").append(toIndentedString(analytics)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    hasScreened: ").append(toIndentedString(hasScreened)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    nbUnprocessed: ").append(toIndentedString(nbUnprocessed)).append("\n");
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

