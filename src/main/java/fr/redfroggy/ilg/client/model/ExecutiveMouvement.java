package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import fr.redfroggy.ilg.client.company.ExecutiveMouvementProjection6;
import fr.redfroggy.ilg.client.executive.ExecutiveMouvementProjection5;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDate;

/**
 * ExecutiveMouvement
 */
@JsonDeserialize(builder = ExecutiveMouvement.ExecutiveMouvementBuilder.class)
public class ExecutiveMouvement implements ExecutiveMouvementProjection5, ExecutiveMouvementProjection6 {
    private final Integer code;

    private final String label;

    private final LocalDate dateMouvement;

    private final String source;

    private final EventDetail eventDetail;

    private final ExecutiveFonction fonction;

    public ExecutiveMouvement(ExecutiveMouvementBuilder builder) {
        this.code = builder.code;
        this.label = builder.label;
        this.dateMouvement = builder.dateMouvement;
        this.source = builder.source;
        this.eventDetail = builder.eventDetail;
        this.fonction = builder.fonction;
    }

    public static ExecutiveMouvementBuilder builder() {
        return new ExecutiveMouvementBuilder();
    }

    /**
     * Movement code
     *
     * @return code
     */
    @ApiModelProperty(example = "1", value = "Movement code")
    public Integer getCode() {
        return code;
    }

    /**
     * Human readable movement description
     *
     * @return label
     */
    @ApiModelProperty(example = "Nomination", value = "Human readable movement description")
    public String getLabel() {
        return label;
    }

    /**
     * When the movement happened
     *
     * @return dateMouvement
     */
    @ApiModelProperty(value = "When the movement happened")
    public LocalDate getDateMouvement() {
        return dateMouvement;
    }

    /**
     * Source of movement
     *
     * @return source
     */
    @ApiModelProperty(example = "JAL", value = "Source of movement")
    public String getSource() {
        return source;
    }

    /**
     * Get eventDetail
     *
     * @return eventDetail
     */
    @ApiModelProperty(value = "")
    public EventDetail getEventDetail() {
        return eventDetail;
    }

    /**
     * Get fonction
     *
     * @return fonction
     */
    @ApiModelProperty(value = "")
    public ExecutiveFonction getFonction() {
        return fonction;
    }

    @JsonPOJOBuilder(withPrefix = "")
    public static final class ExecutiveMouvementBuilder {
        private Integer code;
        private String label;
        private LocalDate dateMouvement;
        private String source;
        private EventDetail eventDetail;
        private ExecutiveFonction fonction;

        private ExecutiveMouvementBuilder() {
        }

        public ExecutiveMouvementBuilder code(Integer code) {
            this.code = code;
            return this;
        }

        public ExecutiveMouvementBuilder label(String label) {
            this.label = label;
            return this;
        }

        public ExecutiveMouvementBuilder dateMouvement(LocalDate dateMouvement) {
            this.dateMouvement = dateMouvement;
            return this;
        }

        public ExecutiveMouvementBuilder source(String source) {
            this.source = source;
            return this;
        }

        public ExecutiveMouvementBuilder eventDetail(EventDetail eventDetail) {
            this.eventDetail = eventDetail;
            return this;
        }

        public ExecutiveMouvementBuilder fonction(ExecutiveFonction fonction) {
            this.fonction = fonction;
            return this;
        }

        public ExecutiveMouvement build() {
            return new ExecutiveMouvement(this);
        }
    }
}

