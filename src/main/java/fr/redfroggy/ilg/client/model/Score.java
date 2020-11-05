package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;
import java.util.Map;

/**
 * Score
 */
@JsonDeserialize(builder = Score.ScoreBuilder.class)
public class Score {

    private final Integer score;

    private final Integer previous;

    private final Integer creditLimit;

    private final Float delaiReglementFournisseur;

    private final Float delaiReglementFournisseurSecteur;

    private final Map<String, String> comments;

    private final String summary;

    private final List<ScoreHistory> history;

    private final String tendance;

    private final String covidImpact;

    public Score(ScoreBuilder builder) {
        this.score = builder.score;
        this.previous = builder.previous;
        this.creditLimit = builder.creditLimit;
        this.delaiReglementFournisseur = builder.delaiReglementFournisseur;
        this.delaiReglementFournisseurSecteur = builder.delaiReglementFournisseurSecteur;
        this.comments = builder.comments;
        this.summary = builder.summary;
        this.history = builder.history;
        this.tendance = builder.tendance;
        this.covidImpact = builder.covidImpact;
    }

    public static ScoreBuilder builder() {
        return new ScoreBuilder();
    }

    /**
     * Score
     *
     * @return score
     */

    @ApiModelProperty(example = "12", value = "Score")
    public Integer getScore() {
        return score;
    }

    /**
     * Previous score
     *
     * @return previous
     */

    @ApiModelProperty(example = "12", value = "Previous score")
    public Integer getPrevious() {
        return previous;
    }

    /**
     * Advise on max credit
     *
     * @return creditLimit
     */

    @ApiModelProperty(example = "10000", value = "Advise on max credit")
    public Integer getCreditLimit() {
        return creditLimit;
    }

    /**
     * Estimated number of day for a company to pay its providers
     *
     * @return delaiReglementFournisseur
     */

    @ApiModelProperty(example = "86.2", value = "Estimated number of day for a company to pay its providers")
    public Float getDelaiReglementFournisseur() {
        return delaiReglementFournisseur;
    }

    /**
     * Estimated number of day for a segment to pay its providers
     *
     * @return delaiReglementFournisseurSecteur
     */

    @ApiModelProperty(example = "58.1", value = "Estimated number of day for a segment to pay its providers")
    public Float getDelaiReglementFournisseurSecteur() {
        return delaiReglementFournisseurSecteur;
    }

    /**
     * Score comments (non-exhaustive list)
     *
     * @return comments
     */

    @ApiModelProperty(value = "Score comments (non-exhaustive list)")
    public Map<String, String> getComments() {
        return comments;
    }

    /**
     * Score summary, not null if the score is less than 4
     *
     * @return summary
     */

    @ApiModelProperty(example = "Dissolution anticipée", value = "Score summary, not null if the score is less than 4")
    public String getSummary() {
        return summary;
    }

    /**
     * Score history
     *
     * @return history
     */

    @ApiModelProperty(value = "Score history")
    public List<ScoreHistory> getHistory() {
        return history;
    }

    /**
     * Tendancy
     *
     * @return tendance
     */

    @ApiModelProperty(example = "=", value = "Tendancy")
    public String getTendance() {
        return tendance;
    }

    /**
     * Indicateur Covid-19
     *
     * @return coVIDImpact
     */

    @ApiModelProperty(example = "impact Covid 19 fort", value = "Indicateur Covid-19")
    public String getCovidImpact() {
        return covidImpact;
    }

    @JsonPOJOBuilder(withPrefix = "")
    @JsonIgnoreProperties({"@type", "@context", "@id", "@link"})
    public static final class ScoreBuilder {
        private Integer score;
        private Integer previous;
        private Integer creditLimit;
        private Float delaiReglementFournisseur;
        private Float delaiReglementFournisseurSecteur;
        private Map<String, String> comments;
        private String summary;
        private List<ScoreHistory> history;
        private String tendance;
        private String covidImpact;

        private ScoreBuilder() {
        }

        public ScoreBuilder score(Integer score) {
            this.score = score;
            return this;
        }

        public ScoreBuilder previous(Integer previous) {
            this.previous = previous;
            return this;
        }

        public ScoreBuilder creditLimit(Integer creditLimit) {
            this.creditLimit = creditLimit;
            return this;
        }

        public ScoreBuilder delaiReglementFournisseur(Float delaiReglementFournisseur) {
            this.delaiReglementFournisseur = delaiReglementFournisseur;
            return this;
        }

        public ScoreBuilder delaiReglementFournisseurSecteur(Float delaiReglementFournisseurSecteur) {
            this.delaiReglementFournisseurSecteur = delaiReglementFournisseurSecteur;
            return this;
        }

        public ScoreBuilder comments(Map<String, String> comments) {
            this.comments = comments;
            return this;
        }

        public ScoreBuilder summary(String summary) {
            this.summary = summary;
            return this;
        }

        public ScoreBuilder history(List<ScoreHistory> history) {
            this.history = history;
            return this;
        }

        public ScoreBuilder tendance(String tendance) {
            this.tendance = tendance;
            return this;
        }

        @JsonProperty("COVIDImpact")
        public ScoreBuilder covidImpact(String covidImpact) {
            this.covidImpact = covidImpact;
            return this;
        }

        public Score build() {
            return new Score(this);
        }
    }
}

