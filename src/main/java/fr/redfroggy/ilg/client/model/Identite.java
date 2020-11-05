package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Identite
 */
@JsonDeserialize(builder = Identite.IdentiteBuilder.class)
public class Identite {

    private final String nom;

    private final String pseudonyme;

    private final String sigle;

    private final Type type;

    private final String siren;

    private final Integer codeFormeJuridique;

    private final String labelFormeJuridique;

    private final BigDecimal capital;

    private final String devise;

    private final LocalDate dateCreation;

    private final Integer duree;

    private final String garant;

    private final LocalDate dateClotureDesComptes;

    private final Etablissements etablissements;

    public Identite(IdentiteBuilder builder) {
        this.nom = builder.nom;
        this.pseudonyme = builder.pseudonyme;
        this.sigle = builder.sigle;
        this.type = builder.type;
        this.siren = builder.siren;
        this.codeFormeJuridique = builder.codeFormeJuridique;
        this.labelFormeJuridique = builder.labelFormeJuridique;
        this.capital = builder.capital;
        this.devise = builder.devise;
        this.dateCreation = builder.dateCreation;
        this.duree = builder.duree;
        this.garant = builder.garant;
        this.dateClotureDesComptes = builder.dateClotureDesComptes;
        this.etablissements = builder.etablissements;
    }

    public static IdentiteBuilder builder() {
        return new IdentiteBuilder();
    }

    /**
     * Name
     *
     * @return nom
     */
    @ApiModelProperty(example = "Great Company", value = "Name")
    public String getNom() {
        return nom;
    }

    /**
     * Get pseudonyme
     *
     * @return pseudonyme
     */
    @ApiModelProperty(example = "GC", value = "")
    public String getPseudonyme() {
        return pseudonyme;
    }

    /**
     * acronym
     *
     * @return sigle
     */
    @ApiModelProperty(example = "GC", value = "acronym")
    public String getSigle() {
        return sigle;
    }

    /**
     * Whether the person is a real person (P), or a company (M)
     *
     * @return type
     */
    @ApiModelProperty(example = "M", value = "Whether the person is a real person (P), or a company (M)")
    public Type getType() {
        return type;
    }

    /**
     * Company Identifier
     *
     * @return siren
     */
    @ApiModelProperty(example = "123456789", value = "Company Identifier")
    public String getSiren() {
        return siren;
    }

    /**
     * Get codeFormeJuridique
     *
     * @return codeFormeJuridique
     */
    @ApiModelProperty(example = "5498", value = "")
    public Integer getCodeFormeJuridique() {
        return codeFormeJuridique;
    }

    /**
     * Get labelFormeJuridique
     *
     * @return labelFormeJuridique
     */
    @ApiModelProperty(example = "SARL unipersonnelle (EURL)", value = "")
    public String getLabelFormeJuridique() {
        return labelFormeJuridique;
    }

    /**
     * Get capital
     *
     * @return capital
     */
    @ApiModelProperty(example = "100", value = "")
    public BigDecimal getCapital() {
        return capital;
    }

    /**
     * Currency
     *
     * @return devise
     */
    @ApiModelProperty(example = "EUR", value = "Currency")
    public String getDevise() {
        return devise;
    }

    /**
     * Company creation date
     *
     * @return dateCreation
     */
    @ApiModelProperty(value = "Company creation date")
    public LocalDate getDateCreation() {
        return dateCreation;
    }

    /**
     * Company max age, in year
     *
     * @return duree
     */
    @ApiModelProperty(value = "Company max age, in year")
    public Integer getDuree() {
        return duree;
    }

    /**
     * Guarantor
     *
     * @return garant
     */
    @ApiModelProperty(value = "Guarantor")
    public String getGarant() {
        return garant;
    }

    /**
     * Date on which the accounts are closed
     *
     * @return dateClotureDesComptes
     */
    @ApiModelProperty(value = "Date on which the accounts are closed")
    public LocalDate getDateClotureDesComptes() {
        return dateClotureDesComptes;
    }

    /**
     * Get etablissements
     *
     * @return etablissements
     */
    @ApiModelProperty(value = "")
    public Etablissements getEtablissements() {
        return etablissements;
    }

    @JsonPOJOBuilder(withPrefix = "")
    @JsonIgnoreProperties({"@type", "@context", "@id", "@link"})
    public static final class IdentiteBuilder {
        private String nom;
        private String pseudonyme;
        private String sigle;
        private Type type;
        private String siren;
        private Integer codeFormeJuridique;
        private String labelFormeJuridique;
        private BigDecimal capital;
        private String devise;
        private LocalDate dateCreation;
        private Integer duree;
        private String garant;
        private LocalDate dateClotureDesComptes;
        private Etablissements etablissements;

        private IdentiteBuilder() {
        }

        public IdentiteBuilder nom(String nom) {
            this.nom = nom;
            return this;
        }

        public IdentiteBuilder pseudonyme(String pseudonyme) {
            this.pseudonyme = pseudonyme;
            return this;
        }

        public IdentiteBuilder sigle(String sigle) {
            this.sigle = sigle;
            return this;
        }

        public IdentiteBuilder type(Type type) {
            this.type = type;
            return this;
        }

        public IdentiteBuilder siren(String siren) {
            this.siren = siren;
            return this;
        }

        public IdentiteBuilder codeFormeJuridique(Integer codeFormeJuridique) {
            this.codeFormeJuridique = codeFormeJuridique;
            return this;
        }

        public IdentiteBuilder labelFormeJuridique(String labelFormeJuridique) {
            this.labelFormeJuridique = labelFormeJuridique;
            return this;
        }

        public IdentiteBuilder capital(BigDecimal capital) {
            this.capital = capital;
            return this;
        }

        public IdentiteBuilder devise(String devise) {
            this.devise = devise;
            return this;
        }

        public IdentiteBuilder dateCreation(LocalDate dateCreation) {
            this.dateCreation = dateCreation;
            return this;
        }

        public IdentiteBuilder duree(Integer duree) {
            this.duree = duree;
            return this;
        }

        public IdentiteBuilder garant(String garant) {
            this.garant = garant;
            return this;
        }

        public IdentiteBuilder dateClotureDesComptes(LocalDate dateClotureDesComptes) {
            this.dateClotureDesComptes = dateClotureDesComptes;
            return this;
        }

        public IdentiteBuilder etablissements(Etablissements etablissements) {
            this.etablissements = etablissements;
            return this;
        }

        public Identite build() {
            return new Identite(this);
        }
    }
}

