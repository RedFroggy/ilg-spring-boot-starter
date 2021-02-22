package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.time.LocalDate;

/**
 * ProcedureCollective
 */
@JsonDeserialize(builder = ProcedureCollective.ProcedureCollectiveBuilder.class)
public class ProcedureCollective {
    @JsonProperty("dateCessationPaiements")
    private final LocalDate dateCessationPaiements;

    @JsonProperty("dateFinPeriodeObservation")
    private final LocalDate dateFinPeriodeObservation;

    @JsonProperty("dureePlan")
    private final Integer dureePlan;

    @JsonProperty("mandataires")
    private final String mandataires;

    @JsonProperty("administrateur")
    private final String administrateur;

    private ProcedureCollective(ProcedureCollectiveBuilder builder) {
        this.dateCessationPaiements = builder.dateCessationPaiements;
        this.dateFinPeriodeObservation = builder.dateFinPeriodeObservation;
        this.dureePlan = builder.dureePlan;
        this.mandataires = builder.mandataires;
        this.administrateur = builder.administrateur;
    }

    public static ProcedureCollectiveBuilder builder() {
        return new ProcedureCollectiveBuilder();
    }

    /**
     * When the company has ceased payments
     *
     * @return dateCessationPaiements
     */
    @ApiModelProperty(value = "When the company has ceased payments")
    @Valid
    public LocalDate getDateCessationPaiements() {
        return dateCessationPaiements;
    }

    /**
     * End of watching period
     *
     * @return dateFinPeriodeObservation
     */
    @ApiModelProperty(value = "End of watching period")
    @Valid
    public LocalDate getDateFinPeriodeObservation() {
        return dateFinPeriodeObservation;
    }

    /**
     * Backup/recovery plan duration in month
     *
     * @return dureePlan
     */
    @ApiModelProperty(value = "Backup/recovery plan duration in month")
    public Integer getDureePlan() {
        return dureePlan;
    }

    /**
     * judicial representative
     *
     * @return mandataires
     */
    @ApiModelProperty(example = "Gérard Butin", value = "judicial representative")
    public String getMandataires() {
        return mandataires;
    }

    /**
     * judicial representative
     *
     * @return administrateur
     */
    @ApiModelProperty(example = "Joseph Humin", value = "judicial representative")
    public String getAdministrateur() {
        return administrateur;
    }

    @JsonPOJOBuilder(withPrefix = "")
    @JsonIgnoreProperties({"@type", "@context", "@id", "@link"})
    public static final class ProcedureCollectiveBuilder {
        private LocalDate dateCessationPaiements;
        private LocalDate dateFinPeriodeObservation;
        private Integer dureePlan;
        private String mandataires;
        private String administrateur;

        private ProcedureCollectiveBuilder() {
        }

        public ProcedureCollectiveBuilder dateCessationPaiements(LocalDate dateCessationPaiements) {
            this.dateCessationPaiements = dateCessationPaiements;
            return this;
        }

        public ProcedureCollectiveBuilder dateFinPeriodeObservation(LocalDate dateFinPeriodeObservation) {
            this.dateFinPeriodeObservation = dateFinPeriodeObservation;
            return this;
        }

        public ProcedureCollectiveBuilder dureePlan(Integer dureePlan) {
            this.dureePlan = dureePlan;
            return this;
        }

        public ProcedureCollectiveBuilder mandataires(String mandataires) {
            this.mandataires = mandataires;
            return this;
        }

        public ProcedureCollectiveBuilder administrateur(String administrateur) {
            this.administrateur = administrateur;
            return this;
        }

        public ProcedureCollective build() {
            return new ProcedureCollective(this);
        }
    }
}

