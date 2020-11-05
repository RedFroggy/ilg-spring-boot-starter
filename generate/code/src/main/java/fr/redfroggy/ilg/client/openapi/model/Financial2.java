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
 * Financial2
 */

public class Financial2   {
  @JsonProperty("turnover")
  private String turnover;

  public Financial2 turnover(String turnover) {
    this.turnover = turnover;
    return this;
  }

  /**
   * Financial turnover
   * @return turnover
  */
  @ApiModelProperty(example = "1000", value = "Financial turnover")


  public String getTurnover() {
    return turnover;
  }

  public void setTurnover(String turnover) {
    this.turnover = turnover;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Financial2 financial2 = (Financial2) o;
    return Objects.equals(this.turnover, financial2.turnover);
  }

  @Override
  public int hashCode() {
    return Objects.hash(turnover);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Financial2 {\n");
    
    sb.append("    turnover: ").append(toIndentedString(turnover)).append("\n");
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

