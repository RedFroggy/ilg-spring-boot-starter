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
 * ScoreHistory
 */

public class ScoreHistory   {
  @JsonProperty("year")
  private String year;

  @JsonProperty("month")
  private String month;

  @JsonProperty("average_score")
  private String averageScore;

  @JsonProperty("average_score_activity")
  private String averageScoreActivity;

  public ScoreHistory year(String year) {
    this.year = year;
    return this;
  }

  /**
   * Get year
   * @return year
  */
  @ApiModelProperty(example = "2017", value = "")


  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }

  public ScoreHistory month(String month) {
    this.month = month;
    return this;
  }

  /**
   * Get month
   * @return month
  */
  @ApiModelProperty(example = "05", value = "")


  public String getMonth() {
    return month;
  }

  public void setMonth(String month) {
    this.month = month;
  }

  public ScoreHistory averageScore(String averageScore) {
    this.averageScore = averageScore;
    return this;
  }

  /**
   * Get averageScore
   * @return averageScore
  */
  @ApiModelProperty(example = "15.0", value = "")


  public String getAverageScore() {
    return averageScore;
  }

  public void setAverageScore(String averageScore) {
    this.averageScore = averageScore;
  }

  public ScoreHistory averageScoreActivity(String averageScoreActivity) {
    this.averageScoreActivity = averageScoreActivity;
    return this;
  }

  /**
   * Get averageScoreActivity
   * @return averageScoreActivity
  */
  @ApiModelProperty(example = "10.1", value = "")


  public String getAverageScoreActivity() {
    return averageScoreActivity;
  }

  public void setAverageScoreActivity(String averageScoreActivity) {
    this.averageScoreActivity = averageScoreActivity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScoreHistory scoreHistory = (ScoreHistory) o;
    return Objects.equals(this.year, scoreHistory.year) &&
        Objects.equals(this.month, scoreHistory.month) &&
        Objects.equals(this.averageScore, scoreHistory.averageScore) &&
        Objects.equals(this.averageScoreActivity, scoreHistory.averageScoreActivity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(year, month, averageScore, averageScoreActivity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScoreHistory {\n");
    
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    averageScore: ").append(toIndentedString(averageScore)).append("\n");
    sb.append("    averageScoreActivity: ").append(toIndentedString(averageScoreActivity)).append("\n");
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

