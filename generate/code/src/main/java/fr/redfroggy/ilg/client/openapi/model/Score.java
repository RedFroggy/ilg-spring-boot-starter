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
 * Score
 */

public class Score   {
  @JsonProperty("score")
  private Integer score;

  @JsonProperty("previous")
  private Integer previous;

  @JsonProperty("creditLimit")
  private Integer creditLimit;

  @JsonProperty("delaiReglementFournisseur")
  private Float delaiReglementFournisseur;

  @JsonProperty("delaiReglementFournisseurSecteur")
  private Float delaiReglementFournisseurSecteur;

  @JsonProperty("comments")
  @Valid
  private List<Object> comments = null;

  @JsonProperty("summary")
  private String summary;

  @JsonProperty("history")
  @Valid
  private List<ScoreHistory> history = null;

  @JsonProperty("tendance")
  private String tendance;

  @JsonProperty("COVIDImpact")
  private String coVIDImpact;

  public Score score(Integer score) {
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

  public Score previous(Integer previous) {
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

  public Score creditLimit(Integer creditLimit) {
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

  public Score delaiReglementFournisseur(Float delaiReglementFournisseur) {
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

  public Score delaiReglementFournisseurSecteur(Float delaiReglementFournisseurSecteur) {
    this.delaiReglementFournisseurSecteur = delaiReglementFournisseurSecteur;
    return this;
  }

  /**
   * Estimated number of day for a segment to pay its providers
   * @return delaiReglementFournisseurSecteur
  */
  @ApiModelProperty(example = "58.1", value = "Estimated number of day for a segment to pay its providers")


  public Float getDelaiReglementFournisseurSecteur() {
    return delaiReglementFournisseurSecteur;
  }

  public void setDelaiReglementFournisseurSecteur(Float delaiReglementFournisseurSecteur) {
    this.delaiReglementFournisseurSecteur = delaiReglementFournisseurSecteur;
  }

  public Score comments(List<Object> comments) {
    this.comments = comments;
    return this;
  }

  public Score addCommentsItem(Object commentsItem) {
    if (this.comments == null) {
      this.comments = new ArrayList<>();
    }
    this.comments.add(commentsItem);
    return this;
  }

  /**
   * Score comments (non-exhaustive list)
   * @return comments
  */
  @ApiModelProperty(value = "Score comments (non-exhaustive list)")


  public List<Object> getComments() {
    return comments;
  }

  public void setComments(List<Object> comments) {
    this.comments = comments;
  }

  public Score summary(String summary) {
    this.summary = summary;
    return this;
  }

  /**
   * Score summary, not null if the score is less than 4
   * @return summary
  */
  @ApiModelProperty(example = "Dissolution anticipée", value = "Score summary, not null if the score is less than 4")


  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public Score history(List<ScoreHistory> history) {
    this.history = history;
    return this;
  }

  public Score addHistoryItem(ScoreHistory historyItem) {
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

  public Score tendance(String tendance) {
    this.tendance = tendance;
    return this;
  }

  /**
   * Tendancy
   * @return tendance
  */
  @ApiModelProperty(example = "=", value = "Tendancy")


  public String getTendance() {
    return tendance;
  }

  public void setTendance(String tendance) {
    this.tendance = tendance;
  }

  public Score coVIDImpact(String coVIDImpact) {
    this.coVIDImpact = coVIDImpact;
    return this;
  }

  /**
   * Indicateur Covid-19
   * @return coVIDImpact
  */
  @ApiModelProperty(example = "impact Covid 19 fort", value = "Indicateur Covid-19")


  public String getCoVIDImpact() {
    return coVIDImpact;
  }

  public void setCoVIDImpact(String coVIDImpact) {
    this.coVIDImpact = coVIDImpact;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Score score = (Score) o;
    return Objects.equals(this.score, score.score) &&
        Objects.equals(this.previous, score.previous) &&
        Objects.equals(this.creditLimit, score.creditLimit) &&
        Objects.equals(this.delaiReglementFournisseur, score.delaiReglementFournisseur) &&
        Objects.equals(this.delaiReglementFournisseurSecteur, score.delaiReglementFournisseurSecteur) &&
        Objects.equals(this.comments, score.comments) &&
        Objects.equals(this.summary, score.summary) &&
        Objects.equals(this.history, score.history) &&
        Objects.equals(this.tendance, score.tendance) &&
        Objects.equals(this.coVIDImpact, score.coVIDImpact);
  }

  @Override
  public int hashCode() {
    return Objects.hash(score, previous, creditLimit, delaiReglementFournisseur, delaiReglementFournisseurSecteur, comments, summary, history, tendance, coVIDImpact);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Score {\n");
    
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
    sb.append("    creditLimit: ").append(toIndentedString(creditLimit)).append("\n");
    sb.append("    delaiReglementFournisseur: ").append(toIndentedString(delaiReglementFournisseur)).append("\n");
    sb.append("    delaiReglementFournisseurSecteur: ").append(toIndentedString(delaiReglementFournisseurSecteur)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    history: ").append(toIndentedString(history)).append("\n");
    sb.append("    tendance: ").append(toIndentedString(tendance)).append("\n");
    sb.append("    coVIDImpact: ").append(toIndentedString(coVIDImpact)).append("\n");
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

