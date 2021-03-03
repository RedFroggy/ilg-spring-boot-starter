package fr.redfroggy.ilg.client.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.time.LocalDate;

/**
 * Rectificatif
 */
@JsonDeserialize(builder = Rectificatif.RectificatifBuilder.class)
public class Rectificatif {
    @JsonProperty("nomPublication")
    private final String nomPublication;

    @JsonProperty("dateParution")
    private final LocalDate dateParution;

    @JsonProperty("numParution")
    private final String numParution;

    @JsonProperty("numAnnonce")
    private final String numAnnonce;

    private Rectificatif(RectificatifBuilder builder) {
        this.nomPublication = builder.nomPublication;
        this.dateParution = builder.dateParution;
        this.numParution = builder.numParution;
        this.numAnnonce = builder.numAnnonce;
    }

    public static RectificatifBuilder builder() {
        return new RectificatifBuilder();
    }

    /**
     * Parution name
     *
     * @return nomPublication
     */
    @ApiModelProperty(example = "Great Newspaper", value = "Parution name")
    public String getNomPublication() {
        return nomPublication;
    }

    /**
     * Release date
     *
     * @return dateParution
     */
    @ApiModelProperty(value = "Release date")
    @Valid
    public LocalDate getDateParution() {
        return dateParution;
    }

    /**
     * Parution number
     *
     * @return numParution
     */
    @ApiModelProperty(example = "XA123456", value = "Parution number")
    public String getNumParution() {
        return numParution;
    }

    /**
     * Event number
     *
     * @return numAnnonce
     */
    @ApiModelProperty(example = "45632", value = "Event number")
    public String getNumAnnonce() {
        return numAnnonce;
    }

    @JsonPOJOBuilder(withPrefix = "")
    @JsonIgnoreProperties({"@type", "@context", "@id", "@link"})
    public static final class RectificatifBuilder {
        private String nomPublication;
        private LocalDate dateParution;
        private String numParution;
        private String numAnnonce;

        private RectificatifBuilder() {
        }

        public RectificatifBuilder nomPublication(String nomPublication) {
            this.nomPublication = nomPublication;
            return this;
        }

        public RectificatifBuilder dateParution(LocalDate dateParution) {
            this.dateParution = dateParution;
            return this;
        }

        public RectificatifBuilder numParution(String numParution) {
            this.numParution = numParution;
            return this;
        }

        public RectificatifBuilder numAnnonce(String numAnnonce) {
            this.numAnnonce = numAnnonce;
            return this;
        }

        public Rectificatif build() {
            return new Rectificatif(this);
        }
    }
}

