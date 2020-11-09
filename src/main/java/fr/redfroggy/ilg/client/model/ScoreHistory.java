package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * ScoreHistory
 */
public class ScoreHistory {

    private final String year;

    private final String month;

    private final String averageScore;

    private final String averageScoreActivity;

    public ScoreHistory(@JsonProperty("year") String year,
                        @JsonProperty("month") String month,
                        @JsonProperty("average_score") String averageScore,
                        @JsonProperty("average_score_activity") String averageScoreActivity) {
        this.year = year;
        this.month = month;
        this.averageScore = averageScore;
        this.averageScoreActivity = averageScoreActivity;
    }

    /**
     * Get year
     *
     * @return year
     */
    @ApiModelProperty(example = "2017", value = "")
    public String getYear() {
        return year;
    }

    /**
     * Get month
     *
     * @return month
     */
    @ApiModelProperty(example = "05", value = "")
    public String getMonth() {
        return month;
    }

    /**
     * Get averageScore
     *
     * @return averageScore
     */
    @ApiModelProperty(example = "15.0", value = "")
    public String getAverageScore() {
        return averageScore;
    }

    /**
     * Get averageScoreActivity
     *
     * @return averageScoreActivity
     */
    @ApiModelProperty(example = "10.1", value = "")
    public String getAverageScoreActivity() {
        return averageScoreActivity;
    }
}

