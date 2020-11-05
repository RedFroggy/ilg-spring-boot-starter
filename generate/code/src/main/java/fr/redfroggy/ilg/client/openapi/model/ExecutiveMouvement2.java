package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.EventDetail3;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExecutiveMouvement2
 */

public class ExecutiveMouvement2   {
  @JsonProperty("code")
  private Integer code;

  @JsonProperty("label")
  private String label;

  @JsonProperty("dateMouvement")
  private LocalDate dateMouvement;

  @JsonProperty("source")
  private String source;

  @JsonProperty("eventDetail")
  private EventDetail3 eventDetail;

  public ExecutiveMouvement2 code(Integer code) {
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

  public ExecutiveMouvement2 label(String label) {
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

  public ExecutiveMouvement2 dateMouvement(LocalDate dateMouvement) {
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

  public ExecutiveMouvement2 source(String source) {
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

  public ExecutiveMouvement2 eventDetail(EventDetail3 eventDetail) {
    this.eventDetail = eventDetail;
    return this;
  }

  /**
   * Get eventDetail
   * @return eventDetail
  */
  @ApiModelProperty(value = "")

  @Valid

  public EventDetail3 getEventDetail() {
    return eventDetail;
  }

  public void setEventDetail(EventDetail3 eventDetail) {
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
    ExecutiveMouvement2 executiveMouvement2 = (ExecutiveMouvement2) o;
    return Objects.equals(this.code, executiveMouvement2.code) &&
        Objects.equals(this.label, executiveMouvement2.label) &&
        Objects.equals(this.dateMouvement, executiveMouvement2.dateMouvement) &&
        Objects.equals(this.source, executiveMouvement2.source) &&
        Objects.equals(this.eventDetail, executiveMouvement2.eventDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, label, dateMouvement, source, eventDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecutiveMouvement2 {\n");
    
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

