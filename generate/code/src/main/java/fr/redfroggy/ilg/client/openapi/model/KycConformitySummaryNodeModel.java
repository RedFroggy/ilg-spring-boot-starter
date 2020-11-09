package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import fr.redfroggy.ilg.client.openapi.model.KycConformityStatusCountModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * KycConformitySummaryNodeModel
 */

public class KycConformitySummaryNodeModel   {
  /**
   * Summary status
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

  /**
   * Summary reason
   */
  public enum ReasonEnum {
    FAIBLE("Risque Faible"),
    
    MOYEN("Risque Moyen"),
    
    _LEV_("Risque Élevé");

    private String value;

    ReasonEnum(String value) {
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
    public static ReasonEnum fromValue(String value) {
      for (ReasonEnum b : ReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("reason")
  private ReasonEnum reason;

  @JsonProperty("statusCount")
  private KycConformityStatusCountModel statusCount;

  public KycConformitySummaryNodeModel status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Summary status
   * @return status
  */
  @ApiModelProperty(example = "low", value = "Summary status")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public KycConformitySummaryNodeModel reason(ReasonEnum reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Summary reason
   * @return reason
  */
  @ApiModelProperty(example = "Risque Faible", value = "Summary reason")


  public ReasonEnum getReason() {
    return reason;
  }

  public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }

  public KycConformitySummaryNodeModel statusCount(KycConformityStatusCountModel statusCount) {
    this.statusCount = statusCount;
    return this;
  }

  /**
   * Get statusCount
   * @return statusCount
  */
  @ApiModelProperty(value = "")

  @Valid

  public KycConformityStatusCountModel getStatusCount() {
    return statusCount;
  }

  public void setStatusCount(KycConformityStatusCountModel statusCount) {
    this.statusCount = statusCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KycConformitySummaryNodeModel kycConformitySummaryNodeModel = (KycConformitySummaryNodeModel) o;
    return Objects.equals(this.status, kycConformitySummaryNodeModel.status) &&
        Objects.equals(this.reason, kycConformitySummaryNodeModel.reason) &&
        Objects.equals(this.statusCount, kycConformitySummaryNodeModel.statusCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, reason, statusCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KycConformitySummaryNodeModel {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    statusCount: ").append(toIndentedString(statusCount)).append("\n");
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

