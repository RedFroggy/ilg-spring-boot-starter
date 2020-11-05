package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ConformityRiskItem2
 */

public class ConformityRiskItem2   {
  /**
   * Risk status
   */
  public enum StatusEnum {
    LOW("low"),
    
    MEDIUM("medium"),
    
    HIGH("high");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("status")
  private StatusEnum status;

  @JsonProperty("reason")
  private String reason;

  @JsonProperty("source")
  private String source;

  @JsonProperty("processingType")
  private String processingType;

  @JsonProperty("candidateProcessed")
  private Integer candidateProcessed;

  @JsonProperty("candidateUnprocessed")
  private Integer candidateUnprocessed;

  @JsonProperty("count")
  private Integer count;

  @JsonProperty("indice")
  private Integer indice;

  public ConformityRiskItem2 status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Risk status
   * @return status
  */
  @ApiModelProperty(example = "low", value = "Risk status")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public ConformityRiskItem2 reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Risk reason
   * @return reason
  */
  @ApiModelProperty(example = "Risque Faible", value = "Risk reason")


  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public ConformityRiskItem2 source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Risk Source
   * @return source
  */
  @ApiModelProperty(example = "ILG / LN / MIXED", value = "Risk Source")


  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public ConformityRiskItem2 processingType(String processingType) {
    this.processingType = processingType;
    return this;
  }

  /**
   * Risk Source
   * @return processingType
  */
  @ApiModelProperty(example = "ILG / LN", value = "Risk Source")


  public String getProcessingType() {
    return processingType;
  }

  public void setProcessingType(String processingType) {
    this.processingType = processingType;
  }

  public ConformityRiskItem2 candidateProcessed(Integer candidateProcessed) {
    this.candidateProcessed = candidateProcessed;
    return this;
  }

  /**
   * Candidates unprocessed
   * @return candidateProcessed
  */
  @ApiModelProperty(example = "1", value = "Candidates unprocessed")


  public Integer getCandidateProcessed() {
    return candidateProcessed;
  }

  public void setCandidateProcessed(Integer candidateProcessed) {
    this.candidateProcessed = candidateProcessed;
  }

  public ConformityRiskItem2 candidateUnprocessed(Integer candidateUnprocessed) {
    this.candidateUnprocessed = candidateUnprocessed;
    return this;
  }

  /**
   * Candidates unprocessed
   * @return candidateUnprocessed
  */
  @ApiModelProperty(example = "1", value = "Candidates unprocessed")


  public Integer getCandidateUnprocessed() {
    return candidateUnprocessed;
  }

  public void setCandidateUnprocessed(Integer candidateUnprocessed) {
    this.candidateUnprocessed = candidateUnprocessed;
  }

  public ConformityRiskItem2 count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Risk count
   * @return count
  */
  @ApiModelProperty(example = "1", value = "Risk count")


  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public ConformityRiskItem2 indice(Integer indice) {
    this.indice = indice;
    return this;
  }

  /**
   * Risk indice
   * @return indice
  */
  @ApiModelProperty(example = "1", value = "Risk indice")


  public Integer getIndice() {
    return indice;
  }

  public void setIndice(Integer indice) {
    this.indice = indice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConformityRiskItem2 conformityRiskItem2 = (ConformityRiskItem2) o;
    return Objects.equals(this.status, conformityRiskItem2.status) &&
        Objects.equals(this.reason, conformityRiskItem2.reason) &&
        Objects.equals(this.source, conformityRiskItem2.source) &&
        Objects.equals(this.processingType, conformityRiskItem2.processingType) &&
        Objects.equals(this.candidateProcessed, conformityRiskItem2.candidateProcessed) &&
        Objects.equals(this.candidateUnprocessed, conformityRiskItem2.candidateUnprocessed) &&
        Objects.equals(this.count, conformityRiskItem2.count) &&
        Objects.equals(this.indice, conformityRiskItem2.indice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, reason, source, processingType, candidateProcessed, candidateUnprocessed, count, indice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConformityRiskItem2 {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    processingType: ").append(toIndentedString(processingType)).append("\n");
    sb.append("    candidateProcessed: ").append(toIndentedString(candidateProcessed)).append("\n");
    sb.append("    candidateUnprocessed: ").append(toIndentedString(candidateUnprocessed)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    indice: ").append(toIndentedString(indice)).append("\n");
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

