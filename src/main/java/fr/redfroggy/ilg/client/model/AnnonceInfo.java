package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDate;

/**
 * AnnonceInfo
 */
@JsonDeserialize(builder = AnnonceInfo.AnnonceInfoBuilder.class)
public class AnnonceInfo {
    private final String adID;

    private final String origine;

    private final String origineUrl;

    private final String nomPublication;

    private final LocalDate dateParution;

    private final String numParution;

    private final String numAnnonce;

    private final String tribunal;

    private final String juriste;

    private final String descriptif;

    private final String texte;

    private AnnonceInfo(AnnonceInfoBuilder builder) {
        this.adID = builder.adID;
        this.origine = builder.origine;
        this.origineUrl = builder.origineUrl;
        this.nomPublication = builder.nomPublication;
        this.dateParution = builder.dateParution;
        this.numParution = builder.numParution;
        this.numAnnonce = builder.numAnnonce;
        this.tribunal = builder.tribunal;
        this.juriste = builder.juriste;
        this.descriptif = builder.descriptif;
        this.texte = builder.texte;
    }

    public static AnnonceInfoBuilder builder() {
        return new AnnonceInfoBuilder();
    }

    /**
     * Event identifier
     *
     * @return adID
     */
    @ApiModelProperty(example = "XA1235456", value = "Event identifier")
    public String getAdID() {
        return adID;
    }

    /**
     * Source of information
     *
     * @return origine
     */
    @ApiModelProperty(example = "Bodacc", value = "Source of information")
    public String getOrigine() {
        return origine;
    }

    /**
     * Source URL
     *
     * @return origineUrl
     */
    @ApiModelProperty(value = "Source URL")
    public String getOrigineUrl() {
        return origineUrl;
    }

    /**
     * Name of publication
     *
     * @return nomPublication
     */
    @ApiModelProperty(value = "Name of publication")
    public String getNomPublication() {
        return nomPublication;
    }

    /**
     * Date when event has been released
     *
     * @return dateParution
     */
    @ApiModelProperty(value = "Date when event has been released")
    public LocalDate getDateParution() {
        return dateParution;
    }

    /**
     * Parution number
     *
     * @return numParution
     */
    @ApiModelProperty(example = "BXA2017", value = "Parution number")
    public String getNumParution() {
        return numParution;
    }

    /**
     * Event number in parution
     *
     * @return numAnnonce
     */
    @ApiModelProperty(example = "20001", value = "Event number in parution")
    public String getNumAnnonce() {
        return numAnnonce;
    }

    /**
     * Court (if available)
     *
     * @return tribunal
     */
    @ApiModelProperty(example = "PARIS", value = "Court (if available)")
    public String getTribunal() {
        return tribunal;
    }

    /**
     * Lawer
     *
     * @return juriste
     */
    @ApiModelProperty(example = "Lawers Associate", value = "Lawer")
    public String getJuriste() {
        return juriste;
    }

    /**
     * Summary
     *
     * @return descriptif
     */
    @ApiModelProperty(value = "Summary")
    public String getDescriptif() {
        return descriptif;
    }

    /**
     * Event full text
     *
     * @return texte
     */
    @ApiModelProperty(example = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed...", value = "Event " +
            "full text")
    public String getTexte() {
        return texte;
    }

    @JsonPOJOBuilder(withPrefix = "")
    public static final class AnnonceInfoBuilder {
        private String adID;
        private String origine;
        private String origineUrl;
        private String nomPublication;
        private LocalDate dateParution;
        private String numParution;
        private String numAnnonce;
        private String tribunal;
        private String juriste;
        private String descriptif;
        private String texte;

        private AnnonceInfoBuilder() {
        }

        public AnnonceInfoBuilder adID(String adID) {
            this.adID = adID;
            return this;
        }

        public AnnonceInfoBuilder origine(String origine) {
            this.origine = origine;
            return this;
        }

        public AnnonceInfoBuilder origineUrl(String origineUrl) {
            this.origineUrl = origineUrl;
            return this;
        }

        public AnnonceInfoBuilder nomPublication(String nomPublication) {
            this.nomPublication = nomPublication;
            return this;
        }

        public AnnonceInfoBuilder dateParution(LocalDate dateParution) {
            this.dateParution = dateParution;
            return this;
        }

        public AnnonceInfoBuilder numParution(String numParution) {
            this.numParution = numParution;
            return this;
        }

        public AnnonceInfoBuilder numAnnonce(String numAnnonce) {
            this.numAnnonce = numAnnonce;
            return this;
        }

        public AnnonceInfoBuilder tribunal(String tribunal) {
            this.tribunal = tribunal;
            return this;
        }

        public AnnonceInfoBuilder juriste(String juriste) {
            this.juriste = juriste;
            return this;
        }

        public AnnonceInfoBuilder descriptif(String descriptif) {
            this.descriptif = descriptif;
            return this;
        }

        public AnnonceInfoBuilder texte(String texte) {
            this.texte = texte;
            return this;
        }

        public AnnonceInfo build() {
            return new AnnonceInfo(this);
        }
    }
}

