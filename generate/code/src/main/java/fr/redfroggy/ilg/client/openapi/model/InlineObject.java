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
 * InlineObject
 */

public class InlineObject   {
  @JsonProperty("candidatesId")
  private String candidatesId;

  @JsonProperty("candidateId")
  private String candidateId;

  @JsonProperty("processed")
  private Boolean processed;

  @JsonProperty("siren")
  private Integer siren;

  @JsonProperty("individualId")
  private String individualId;

  public InlineObject candidatesId(String candidatesId) {
    this.candidatesId = candidatesId;
    return this;
  }

  /**
   * Get candidatesId
   * @return candidatesId
  */
  @ApiModelProperty(example = "acb608e10b979da6c4cd8b257a3daa8faaaf4966", value = "")


  public String getCandidatesId() {
    return candidatesId;
  }

  public void setCandidatesId(String candidatesId) {
    this.candidatesId = candidatesId;
  }

  public InlineObject candidateId(String candidateId) {
    this.candidateId = candidateId;
    return this;
  }

  /**
   * Get candidateId
   * @return candidateId
  */
  @ApiModelProperty(example = "WX0003695338", value = "")


  public String getCandidateId() {
    return candidateId;
  }

  public void setCandidateId(String candidateId) {
    this.candidateId = candidateId;
  }

  public InlineObject processed(Boolean processed) {
    this.processed = processed;
    return this;
  }

  /**
   * Get processed
   * @return processed
  */
  @ApiModelProperty(example = "true", value = "")


  public Boolean getProcessed() {
    return processed;
  }

  public void setProcessed(Boolean processed) {
    this.processed = processed;
  }

  public InlineObject siren(Integer siren) {
    this.siren = siren;
    return this;
  }

  /**
   * Get siren
   * @return siren
  */
  @ApiModelProperty(example = "304187701", value = "")


  public Integer getSiren() {
    return siren;
  }

  public void setSiren(Integer siren) {
    this.siren = siren;
  }

  public InlineObject individualId(String individualId) {
    this.individualId = individualId;
    return this;
  }

  /**
   * Get individualId
   * @return individualId
  */
  @ApiModelProperty(example = "91358", value = "")


  public String getIndividualId() {
    return individualId;
  }

  public void setIndividualId(String individualId) {
    this.individualId = individualId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject inlineObject = (InlineObject) o;
    return Objects.equals(this.candidatesId, inlineObject.candidatesId) &&
        Objects.equals(this.candidateId, inlineObject.candidateId) &&
        Objects.equals(this.processed, inlineObject.processed) &&
        Objects.equals(this.siren, inlineObject.siren) &&
        Objects.equals(this.individualId, inlineObject.individualId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(candidatesId, candidateId, processed, siren, individualId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject {\n");
    
    sb.append("    candidatesId: ").append(toIndentedString(candidatesId)).append("\n");
    sb.append("    candidateId: ").append(toIndentedString(candidateId)).append("\n");
    sb.append("    processed: ").append(toIndentedString(processed)).append("\n");
    sb.append("    siren: ").append(toIndentedString(siren)).append("\n");
    sb.append("    individualId: ").append(toIndentedString(individualId)).append("\n");
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

