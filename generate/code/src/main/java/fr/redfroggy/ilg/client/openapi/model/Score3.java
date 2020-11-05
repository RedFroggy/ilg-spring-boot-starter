package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.ScoreHistory;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Score3
 */

public class Score3   {
  @JsonProperty("score")
  private Integer score;

  @JsonProperty("previous")
  private Integer previous;

  @JsonProperty("delaiReglementFournisseur")
  private Float delaiReglementFournisseur;

  @JsonProperty("history")
  @Valid
  private List<ScoreHistory> history = null;

  public Score3 score(Integer score) {
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

  public Score3 previous(Integer previous) {
    this.previous = previous;
    return this;
  }

  /**
   * Previous score
   * @return previous
  */
  @ApiModelProperty(example = "12", value = "Previous score")


  public Integer getPrevious() {
    return previous;
  }

  public void setPrevious(Integer previous) {
    this.previous = previous;
  }

  public Score3 delaiReglementFournisseur(Float delaiReglementFournisseur) {
    this.delaiReglementFournisseur = delaiReglementFournisseur;
    return this;
  }

  /**
   * Estimated number of day for a company to pay its providers
   * @return delaiReglementFournisseur
  */
  @ApiModelProperty(example = "86.2", value = "Estimated number of day for a company to pay its providers")


  public Float getDelaiReglementFournisseur() {
    return delaiReglementFournisseur;
  }

  public void setDelaiReglementFournisseur(Float delaiReglementFournisseur) {
    this.delaiReglementFournisseur = delaiReglementFournisseur;
  }

  public Score3 history(List<ScoreHistory> history) {
    this.history = history;
    return this;
  }

  public Score3 addHistoryItem(ScoreHistory historyItem) {
    if (this.history == null) {
      this.history = new ArrayList<>();
    }
    this.history.add(historyItem);
    return this;
  }

  /**
   * Score history
   * @return history
  */
  @ApiModelProperty(value = "Score history")

  @Valid

  public List<ScoreHistory> getHistory() {
    return history;
  }

  public void setHistory(List<ScoreHistory> history) {
    this.history = history;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Score3 score3 = (Score3) o;
    return Objects.equals(this.score, score3.score) &&
        Objects.equals(this.previous, score3.previous) &&
        Objects.equals(this.delaiReglementFournisseur, score3.delaiReglementFournisseur) &&
        Objects.equals(this.history, score3.history);
  }

  @Override
  public int hashCode() {
    return Objects.hash(score, previous, delaiReglementFournisseur, history);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Score3 {\n");
    
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
    sb.append("    delaiReglementFournisseur: ").append(toIndentedString(delaiReglementFournisseur)).append("\n");
    sb.append("    history: ").append(toIndentedString(history)).append("\n");
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

