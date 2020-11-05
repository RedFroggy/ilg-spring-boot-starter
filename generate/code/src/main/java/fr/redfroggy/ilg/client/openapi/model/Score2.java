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
 * Score2
 */

public class Score2   {
  @JsonProperty("score")
  private Integer score;

  @JsonProperty("creditLimit")
  private Integer creditLimit;

  public Score2 score(Integer score) {
    this.score = score;
    return this;
  }

  /**
   * Score
   * @return score
  */
  @ApiModelProperty(example = "12", value = "Score")


  public Integer getScore() {
    return score;
  }

  public void setScore(Integer score) {
    this.score = score;
  }

  public Score2 creditLimit(Integer creditLimit) {
    this.creditLimit = creditLimit;
    return this;
  }

  /**
   * Advise on max credit
   * @return creditLimit
  */
  @ApiModelProperty(example = "10000", value = "Advise on max credit")


  public Integer getCreditLimit() {
    return creditLimit;
  }

  public void setCreditLimit(Integer creditLimit) {
    this.creditLimit = creditLimit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Score2 score2 = (Score2) o;
    return Objects.equals(this.score, score2.score) &&
        Objects.equals(this.creditLimit, score2.creditLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(score, creditLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Score2 {\n");
    
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    creditLimit: ").append(toIndentedString(creditLimit)).append("\n");
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

