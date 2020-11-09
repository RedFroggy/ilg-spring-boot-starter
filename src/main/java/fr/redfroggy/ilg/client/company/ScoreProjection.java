package fr.redfroggy.ilg.client.company;

import fr.redfroggy.ilg.client.model.ScoreHistory;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;
import java.util.Map;

public interface ScoreProjection {
    /**
     * Score
     * @return score
    */
    @ApiModelProperty(example = "12", value = "Score")
    Integer getScore();

    /**
     * Previous score
     * @return previous
    */
    @ApiModelProperty(example = "12", value = "Previous score")
    Integer getPrevious();

    /**
     * Advise on max credit
     * @return creditLimit
    */
    @ApiModelProperty(example = "10000", value = "Advise on max credit")
    Integer getCreditLimit();

    /**
     * Estimated number of day for a company to pay its providers
     * @return delaiReglementFournisseur
    */
    @ApiModelProperty(example = "86.2", value = "Estimated number of day for a company to pay its providers")
    Float getDelaiReglementFournisseur();

    /**
     * Estimated number of day for a segment to pay its providers
     * @return delaiReglementFournisseurSecteur
    */
    @ApiModelProperty(example = "58.1", value = "Estimated number of day for a segment to pay its providers")
    Float getDelaiReglementFournisseurSecteur();

    /**
     * Score comments (non-exhaustive list)
     * @return comments
    */
    @ApiModelProperty(value = "Score comments (non-exhaustive list)")
    Map<String,String> getComments();

    /**
     * Score summary, not null if the score is less than 4
     * @return summary
    */
    @ApiModelProperty(example = "Dissolution anticipée", value = "Score summary, not null if the score is less than 4")
    String getSummary();

    /**
     * Score history
     * @return history
    */
    @ApiModelProperty(value = "Score history")
    List<ScoreHistory> getHistory();

    /**
     * Tendancy
     * @return tendance
    */
    @ApiModelProperty(example = "=", value = "Tendancy")
    String getTendance();

    /**
     * Indicateur Covid-19
     * @return coVIDImpact
     */
    @ApiModelProperty(example = "impact Covid 19 fort", value = "Indicateur Covid-19")
    String getCovidImpact();
}
