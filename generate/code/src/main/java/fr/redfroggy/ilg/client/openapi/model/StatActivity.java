package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Ratios2;
import fr.redfroggy.ilg.client.openapi.model.Score3;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StatActivity
 */

public class StatActivity   {
  @JsonProperty("score")
  private Score3 score;

  @JsonProperty("ratios")
  private Ratios2 ratios;

  public StatActivity score(Score3 score) {
    this.score = score;
    return this;
  }

  /**
   * Get score
   * @return score
  */
  @ApiModelProperty(value = "")

  @Valid

  public Score3 getScore() {
    return score;
  }

  public void setScore(Score3 score) {
    this.score = score;
  }

  public StatActivity ratios(Ratios2 ratios) {
    this.ratios = ratios;
    return this;
  }

  /**
   * Get ratios
   * @return ratios
  */
  @ApiModelProperty(value = "")

  @Valid

  public Ratios2 getRatios() {
    return ratios;
  }

  public void setRatios(Ratios2 ratios) {
    this.ratios = ratios;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatActivity statActivity = (StatActivity) o;
    return Objects.equals(this.score, statActivity.score) &&
        Objects.equals(this.ratios, statActivity.ratios);
  }

  @Override
  public int hashCode() {
    return Objects.hash(score, ratios);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatActivity {\n");
    
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    ratios: ").append(toIndentedString(ratios)).append("\n");
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

