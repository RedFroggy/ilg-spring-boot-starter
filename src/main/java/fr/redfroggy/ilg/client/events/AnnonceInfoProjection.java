package fr.redfroggy.ilg.client.events;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.time.LocalDate;

public interface AnnonceInfoProjection {
    /**
     * Event identifier
     * @return adID
    */
    @ApiModelProperty(example = "XA1235456", value = "Event identifier")
    String getAdID();

    /**
     * Source of information
     * @return origine
    */
    @ApiModelProperty(example = "Bodacc", value = "Source of information")
    String getOrigine();

    /**
     * Source URL
     * @return origineUrl
    */
    @ApiModelProperty(value = "Source URL")
    String getOrigineUrl();

    /**
     * Name of publication
     * @return nomPublication
    */
    @ApiModelProperty(value = "Name of publication")
    String getNomPublication();

    /**
     * Date when event has been released
     * @return dateParution
    */
    @ApiModelProperty(value = "Date when event has been released")
    @Valid
    LocalDate getDateParution();

    /**
     * Parution number
     * @return numParution
    */
    @ApiModelProperty(example = "BXA2017", value = "Parution number")
    String getNumParution();

    /**
     * Event number in parution
     * @return numAnnonce
    */
    @ApiModelProperty(example = "20001", value = "Event number in parution")
    String getNumAnnonce();

    /**
     * Court (if available)
     * @return tribunal
    */
    @ApiModelProperty(example = "PARIS", value = "Court (if available)")
    String getTribunal();

    /**
     * Lawer
     * @return juriste
    */
    @ApiModelProperty(example = "Lawers Associate", value = "Lawer")
    String getJuriste();

    /**
     * Summary
     * @return descriptif
    */
    @ApiModelProperty(value = "Summary")
    String getDescriptif();

    /**
     * Event full text
     * @return texte
    */
    @ApiModelProperty(example = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed...", value = "Event full text")
    String getTexte();
}
