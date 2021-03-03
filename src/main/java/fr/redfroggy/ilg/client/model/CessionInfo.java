package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDate;

/**
 * CessionInfo
 */
@JsonDeserialize(builder = CessionInfo.CessionInfoBuilder.class)
public class CessionInfo {

    private final Integer montantCession;

    private final String deviseMontantCession;

    private final String natureCession;

    private final String dureeCession;

    private final String uniteMois;

    private final LocalDate dateFinCession;

    private final String nbParts;

    private final String valeurTitre;

    public CessionInfo(CessionInfoBuilder builder) {
        this.montantCession = builder.montantCession;
        this.deviseMontantCession = builder.deviseMontantCession;
        this.natureCession = builder.natureCession;
        this.dureeCession = builder.dureeCession;
        this.uniteMois = builder.uniteMois;
        this.dateFinCession = builder.dateFinCession;
        this.nbParts = builder.nbParts;
        this.valeurTitre = builder.valeurTitre;
    }

    public static CessionInfoBuilder builder() {
        return new CessionInfoBuilder();
    }

    /**
     * Sale amount
     *
     * @return montantCession
     */
    @ApiModelProperty(example = "10000", value = "Sale amount")
    public Integer getMontantCession() {
        return montantCession;
    }

    /**
     * Currency
     *
     * @return deviseMontantCession
     */
    @ApiModelProperty(example = "EUR", value = "Currency")
    public String getDeviseMontantCession() {
        return deviseMontantCession;
    }

    /**
     * A compléter
     *
     * @return natureCession
     */
    @ApiModelProperty(example = "A compléter", value = "A compléter")
    public String getNatureCession() {
        return natureCession;
    }

    /**
     * A compléter
     *
     * @return dureeCession
     */
    @ApiModelProperty(example = "A compléter", value = "A compléter")
    public String getDureeCession() {
        return dureeCession;
    }

    /**
     * A compléter
     *
     * @return uniteMois
     */
    @ApiModelProperty(example = "A compléter", value = "A compléter")
    public String getUniteMois() {
        return uniteMois;
    }

    /**
     * When sales is closed
     *
     * @return dateFinCession
     */
    @ApiModelProperty(value = "When sales is closed")
    public LocalDate getDateFinCession() {
        return dateFinCession;
    }

    /**
     * Sales percentage
     *
     * @return nbParts
     */
    @ApiModelProperty(example = "20", value = "Sales percentage")
    public String getNbParts() {
        return nbParts;
    }

    /**
     * A compléter
     *
     * @return valeurTitre
     */
    @ApiModelProperty(example = "A compléter", value = "A compléter")
    public String getValeurTitre() {
        return valeurTitre;
    }

    @JsonPOJOBuilder(withPrefix = "")
    @JsonIgnoreProperties({"@type", "@context", "@id", "@link"})
    public static final class CessionInfoBuilder {
        private Integer montantCession;
        private String deviseMontantCession;
        private String natureCession;
        private String dureeCession;
        private String uniteMois;
        private LocalDate dateFinCession;
        private String nbParts;
        private String valeurTitre;

        private CessionInfoBuilder() {
        }

        public CessionInfoBuilder montantCession(Integer montantCession) {
            this.montantCession = montantCession;
            return this;
        }

        public CessionInfoBuilder deviseMontantCession(String deviseMontantCession) {
            this.deviseMontantCession = deviseMontantCession;
            return this;
        }

        public CessionInfoBuilder natureCession(String natureCession) {
            this.natureCession = natureCession;
            return this;
        }

        public CessionInfoBuilder dureeCession(String dureeCession) {
            this.dureeCession = dureeCession;
            return this;
        }

        public CessionInfoBuilder uniteMois(String uniteMois) {
            this.uniteMois = uniteMois;
            return this;
        }

        public CessionInfoBuilder dateFinCession(LocalDate dateFinCession) {
            this.dateFinCession = dateFinCession;
            return this;
        }

        public CessionInfoBuilder nbParts(String nbParts) {
            this.nbParts = nbParts;
            return this;
        }

        public CessionInfoBuilder valeurTitre(String valeurTitre) {
            this.valeurTitre = valeurTitre;
            return this;
        }

        public CessionInfo build() {
            return new CessionInfo(this);
        }
    }
}

