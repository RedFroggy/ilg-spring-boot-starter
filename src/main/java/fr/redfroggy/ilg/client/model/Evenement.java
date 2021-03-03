package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.time.LocalDate;

/**
 * Evenement
 */
@JsonDeserialize(builder = Evenement.EvenementBuilder.class)
public class Evenement {

    private final Integer codeEvenement;

    private final String labelEvenement;

    private final String codeEvenementInsee;

    private final String labelEvenementInsee;

    private final LocalDate dateDecision;

    private final LocalDate dateEffet;

    private final LocalDate dateImmatriculation;

    private final LocalDate dateCommencementActivite;

    private final String opposition;

    private final ProcedureCollective procedureCollective;

    private final Identite ancienneIdentite;

    private final Rectificatif rectificatif;

    private Evenement(EvenementBuilder builder) {
        this.codeEvenement = builder.codeEvenement;
        this.labelEvenement = builder.labelEvenement;
        this.codeEvenementInsee = builder.codeEvenementInsee;
        this.labelEvenementInsee = builder.labelEvenementInsee;
        this.dateDecision = builder.dateDecision;
        this.dateEffet = builder.dateEffet;
        this.dateImmatriculation = builder.dateImmatriculation;
        this.dateCommencementActivite = builder.dateCommencementActivite;
        this.opposition = builder.opposition;
        this.procedureCollective = builder.procedureCollective;
        this.ancienneIdentite = builder.ancienneIdentite;
        this.rectificatif = builder.rectificatif;
    }

    public static EvenementBuilder builder() {
        return new EvenementBuilder();
    }

    /**
     * Event code
     *
     * @return codeEvenement
     */
    @ApiModelProperty(example = "1100", value = "Event code")
    public Integer getCodeEvenement() {
        return codeEvenement;
    }

    /**
     * Event label
     *
     * @return labelEvenement
     */
    @ApiModelProperty(example = "Création d'entreprise", value = "Event label")
    public String getLabelEvenement() {
        return labelEvenement;
    }

    /**
     * Insee event code
     *
     * @return codeEvenementInsee
     */
    @ApiModelProperty(example = "0", value = "Insee event code")
    public String getCodeEvenementInsee() {
        return codeEvenementInsee;
    }

    /**
     * Insee Event Label
     *
     * @return labelEvenementInsee
     */
    @ApiModelProperty(example = "A compléter", value = "Insee Event Label")
    public String getLabelEvenementInsee() {
        return labelEvenementInsee;
    }

    /**
     * Event decision date
     *
     * @return dateDecision
     */
    @ApiModelProperty(value = "Event decision date")
    public LocalDate getDateDecision() {
        return dateDecision;
    }

    /**
     * Event effect date
     *
     * @return dateEffet
     */
    @ApiModelProperty(value = "Event effect date")
    @Valid
    public LocalDate getDateEffet() {
        return dateEffet;
    }

    /**
     * Company creation date
     *
     * @return dateImmatriculation
     */
    @ApiModelProperty(value = "Company creation date")
    @Valid
    public LocalDate getDateImmatriculation() {
        return dateImmatriculation;
    }

    /**
     * When company start its business
     *
     * @return dateCommencementActivite
     */
    @ApiModelProperty(value = "When company start its business")
    @Valid
    public LocalDate getDateCommencementActivite() {
        return dateCommencementActivite;
    }

    /**
     * a compléter
     *
     * @return opposition
     */
    @ApiModelProperty(example = "A compléter", value = "a compléter")
    public String getOpposition() {
        return opposition;
    }

    /**
     * Get procedureCollective
     *
     * @return procedureCollective
     */
    @ApiModelProperty(value = "")
    @Valid
    public ProcedureCollective getProcedureCollective() {
        return procedureCollective;
    }

    /**
     * Get ancienneIdentite
     *
     * @return ancienneIdentite
     */
    @ApiModelProperty(value = "")
    @Valid
    public Identite getAncienneIdentite() {
        return ancienneIdentite;
    }

    /**
     * Get rectificatif
     *
     * @return rectificatif
     */
    @ApiModelProperty(value = "")
    @Valid
    public Rectificatif getRectificatif() {
        return rectificatif;
    }

    @JsonPOJOBuilder(withPrefix = "")
    @JsonIgnoreProperties({"@type", "@context", "@id", "@link"})
    public static final class EvenementBuilder {
        private Integer codeEvenement;
        private String labelEvenement;
        private String codeEvenementInsee;
        private String labelEvenementInsee;
        private LocalDate dateDecision;
        private LocalDate dateEffet;
        private LocalDate dateImmatriculation;
        private LocalDate dateCommencementActivite;
        private String opposition;
        private ProcedureCollective procedureCollective;
        private Identite ancienneIdentite;
        private Rectificatif rectificatif;

        private EvenementBuilder() {
        }

        public EvenementBuilder codeEvenement(Integer codeEvenement) {
            this.codeEvenement = codeEvenement;
            return this;
        }

        public EvenementBuilder labelEvenement(String labelEvenement) {
            this.labelEvenement = labelEvenement;
            return this;
        }

        public EvenementBuilder codeEvenementInsee(String codeEvenementInsee) {
            this.codeEvenementInsee = codeEvenementInsee;
            return this;
        }

        public EvenementBuilder labelEvenementInsee(String labelEvenementInsee) {
            this.labelEvenementInsee = labelEvenementInsee;
            return this;
        }

        public EvenementBuilder dateDecision(LocalDate dateDecision) {
            this.dateDecision = dateDecision;
            return this;
        }

        public EvenementBuilder dateEffet(LocalDate dateEffet) {
            this.dateEffet = dateEffet;
            return this;
        }

        public EvenementBuilder dateImmatriculation(LocalDate dateImmatriculation) {
            this.dateImmatriculation = dateImmatriculation;
            return this;
        }

        public EvenementBuilder dateCommencementActivite(LocalDate dateCommencementActivite) {
            this.dateCommencementActivite = dateCommencementActivite;
            return this;
        }

        public EvenementBuilder opposition(String opposition) {
            this.opposition = opposition;
            return this;
        }

        public EvenementBuilder procedureCollective(ProcedureCollective procedureCollective) {
            this.procedureCollective = procedureCollective;
            return this;
        }

        public EvenementBuilder ancienneIdentite(Identite ancienneIdentite) {
            this.ancienneIdentite = ancienneIdentite;
            return this;
        }

        public EvenementBuilder rectificatif(Rectificatif rectificatif) {
            this.rectificatif = rectificatif;
            return this;
        }

        public Evenement build() {
            return new Evenement(this);
        }
    }
}

