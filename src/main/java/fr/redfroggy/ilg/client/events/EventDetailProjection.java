package fr.redfroggy.ilg.client.events;

import fr.redfroggy.ilg.client.model.*;
import io.swagger.annotations.ApiModelProperty;

public interface EventDetailProjection {
    /**
     * Get annonceInfo
     * @return annonceInfo
    */
    @ApiModelProperty(value = "")
    AnnonceInfoProjection getAnnonceInfo();

    /**
     * Get personnes
     * @return personnes
    */
    @ApiModelProperty(value = "")
    Personnes getPersonnes();

    /**
     * Get evenements
     * @return evenements
    */
    @ApiModelProperty(value = "")
    Evenements getEvenements();

    /**
     * Get acteursCession
     * @return acteursCession
    */
    @ApiModelProperty(value = "")
    ActeursCession getActeursCession();

    /**
     * Get acteursContentieux
     * @return acteursContentieux
    */
    @ApiModelProperty(value = "")
    ActeursContentieux getActeursContentieux();

    /**
     * Get etablissementsCession
     * @return etablissementsCession
    */
    @ApiModelProperty(value = "")
    EtablissementsCession getEtablissementsCession();

    /**
     * Get actes
     * @return actes
    */
    @ApiModelProperty(value = "")
    Actes getActes();
}
