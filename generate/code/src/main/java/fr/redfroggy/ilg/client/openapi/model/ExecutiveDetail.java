package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Executive2;
import fr.redfroggy.ilg.client.openapi.model.Mandat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExecutiveDetail
 */

public class ExecutiveDetail   {
  @JsonProperty("execInfos")
  private Executive2 execInfos;

  @JsonProperty("mandats")
  @Valid
  private List<Mandat> mandats = null;

  public ExecutiveDetail execInfos(Executive2 execInfos) {
    this.execInfos = execInfos;
    return this;
  }

  /**
   * Get execInfos
   * @return execInfos
  */
  @ApiModelProperty(value = "")

  @Valid

  public Executive2 getExecInfos() {
    return execInfos;
  }

  public void setExecInfos(Executive2 execInfos) {
    this.execInfos = execInfos;
  }

  public ExecutiveDetail mandats(List<Mandat> mandats) {
    this.mandats = mandats;
    return this;
  }

  public ExecutiveDetail addMandatsItem(Mandat mandatsItem) {
    if (this.mandats == null) {
      this.mandats = new ArrayList<>();
    }
    this.mandats.add(mandatsItem);
    return this;
  }

  /**
   * 
   * @return mandats
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Mandat> getMandats() {
    return mandats;
  }

  public void setMandats(List<Mandat> mandats) {
    this.mandats = mandats;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecutiveDetail executiveDetail = (ExecutiveDetail) o;
    return Objects.equals(this.execInfos, executiveDetail.execInfos) &&
        Objects.equals(this.mandats, executiveDetail.mandats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(execInfos, mandats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecutiveDetail {\n");
    
    sb.append("    execInfos: ").append(toIndentedString(execInfos)).append("\n");
    sb.append("    mandats: ").append(toIndentedString(mandats)).append("\n");
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

