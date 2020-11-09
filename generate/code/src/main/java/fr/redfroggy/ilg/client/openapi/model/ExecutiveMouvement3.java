package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExecutiveMouvement3
 */

public class ExecutiveMouvement3   {
  @JsonProperty("code")
  private Integer code;

  @JsonProperty("label")
  private String label;

  @JsonProperty("dateMouvement")
  private LocalDate dateMouvement;

  @JsonProperty("source")
  private String source;

  @JsonProperty("eventDetail")
  private Object eventDetail;

  public ExecutiveMouvement3 code(Integer code) {
    this.code = code;
    return this;
  }

  /**
   * Movement code
   * @return code
  */
  @ApiModelProperty(example = "1", value = "Movement code")


  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public ExecutiveMouvement3 label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Human readable movement description
   * @return label
  */
  @ApiModelProperty(example = "Nomination", value = "Human readable movement description")


  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public ExecutiveMouvement3 dateMouvement(LocalDate dateMouvement) {
    this.dateMouvement = dateMouvement;
    return this;
  }

  /**
   * When the movement happened
   * @return dateMouvement
  */
  @ApiModelProperty(value = "When the movement happened")

  @Valid

  public LocalDate getDateMouvement() {
    return dateMouvement;
  }

  public void setDateMouvement(LocalDate dateMouvement) {
    this.dateMouvement = dateMouvement;
  }

  public ExecutiveMouvement3 source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Source of movement
   * @return source
  */
  @ApiModelProperty(example = "JAL", value = "Source of movement")


  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public ExecutiveMouvement3 eventDetail(Object eventDetail) {
    this.eventDetail = eventDetail;
    return this;
  }

  /**
   * Get eventDetail
   * @return eventDetail
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getEventDetail() {
    return eventDetail;
  }

  public void setEventDetail(Object eventDetail) {
    this.eventDetail = eventDetail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecutiveMouvement3 executiveMouvement3 = (ExecutiveMouvement3) o;
    return Objects.equals(this.code, executiveMouvement3.code) &&
        Objects.equals(this.label, executiveMouvement3.label) &&
        Objects.equals(this.dateMouvement, executiveMouvement3.dateMouvement) &&
        Objects.equals(this.source, executiveMouvement3.source) &&
        Objects.equals(this.eventDetail, executiveMouvement3.eventDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, label, dateMouvement, source, eventDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecutiveMouvement3 {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    dateMouvement: ").append(toIndentedString(dateMouvement)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    eventDetail: ").append(toIndentedString(eventDetail)).append("\n");
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

