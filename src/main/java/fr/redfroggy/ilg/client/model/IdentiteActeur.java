package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

/**
 * IdentiteActeur
 */
@JsonDeserialize(builder = IdentiteActeur.IdentiteActeurBuilder.class)
public class IdentiteActeur {

    private final Integer nic;

    private final Integer siret;

    private final String nom;

    private final String enseigne;

    private final String sigle;

    private final Type type;

    private final String siren;

    private final Integer codeFormeJuridique;

    private final String labelFormeJuridique;

    private final BigDecimal capital;

    private final String devise;

    private final String activite;

    private final String garant;

    private final Adresse adresse;

    public IdentiteActeur(IdentiteActeurBuilder builder) {
        this.nic = builder.nic;
        this.siret = builder.siret;
        this.nom = builder.nom;
        this.enseigne = builder.enseigne;
        this.sigle = builder.sigle;
        this.type = builder.type;
        this.siren = builder.siren;
        this.codeFormeJuridique = builder.codeFormeJuridique;
        this.labelFormeJuridique = builder.labelFormeJuridique;
        this.capital = builder.capital;
        this.devise = builder.devise;
        this.activite = builder.activite;
        this.garant = builder.garant;
        this.adresse = builder.adresse;
    }

    public static IdentiteActeurBuilder builder() {
        return new IdentiteActeurBuilder();
    }

    /**
     * Site number
     *
     * @return nic
     */
    @ApiModelProperty(example = "10", value = "Site number")
    public Integer getNic() {
        return nic;
    }

    /**
     * Site unique identifier (only available in france)
     *
     * @return siret
     */
    @ApiModelProperty(example = "12345678900010", value = "Site unique identifier (only available in france)")
    public Integer getSiret() {
        return siret;
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
     * Commercial name
     *
     * @return enseigne
     */
    @ApiModelProperty(example = "GC Technology", value = "Commercial name")
    public String getEnseigne() {
        return enseigne;
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
     * Activity text
     *
     * @return activite
     */
    @ApiModelProperty(example = "Commerce de d'autoradio", value = "Activity text")
    public String getActivite() {
        return activite;
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
     * Get adresse
     *
     * @return adresse
     */
    @ApiModelProperty(value = "")
    public Adresse getAdresse() {
        return adresse;
    }

    @JsonPOJOBuilder(withPrefix = "")
    @JsonIgnoreProperties({"@type", "@context", "@id", "@link"})
    public static final class IdentiteActeurBuilder {
        private Integer nic;
        private Integer siret;
        private String nom;
        private String enseigne;
        private String sigle;
        private Type type;
        private String siren;
        private Integer codeFormeJuridique;
        private String labelFormeJuridique;
        private BigDecimal capital;
        private String devise;
        private String activite;
        private String garant;
        private Adresse adresse;

        private IdentiteActeurBuilder() {
        }

        public IdentiteActeurBuilder nic(Integer nic) {
            this.nic = nic;
            return this;
        }

        public IdentiteActeurBuilder siret(Integer siret) {
            this.siret = siret;
            return this;
        }

        public IdentiteActeurBuilder nom(String nom) {
            this.nom = nom;
            return this;
        }

        public IdentiteActeurBuilder enseigne(String enseigne) {
            this.enseigne = enseigne;
            return this;
        }

        public IdentiteActeurBuilder sigle(String sigle) {
            this.sigle = sigle;
            return this;
        }

        public IdentiteActeurBuilder type(Type type) {
            this.type = type;
            return this;
        }

        public IdentiteActeurBuilder siren(String siren) {
            this.siren = siren;
            return this;
        }

        public IdentiteActeurBuilder codeFormeJuridique(Integer codeFormeJuridique) {
            this.codeFormeJuridique = codeFormeJuridique;
            return this;
        }

        public IdentiteActeurBuilder labelFormeJuridique(String labelFormeJuridique) {
            this.labelFormeJuridique = labelFormeJuridique;
            return this;
        }

        public IdentiteActeurBuilder capital(BigDecimal capital) {
            this.capital = capital;
            return this;
        }

        public IdentiteActeurBuilder devise(String devise) {
            this.devise = devise;
            return this;
        }

        public IdentiteActeurBuilder activite(String activite) {
            this.activite = activite;
            return this;
        }

        public IdentiteActeurBuilder garant(String garant) {
            this.garant = garant;
            return this;
        }

        public IdentiteActeurBuilder adresse(Adresse adresse) {
            this.adresse = adresse;
            return this;
        }

        public IdentiteActeur build() {
            return new IdentiteActeur(this);
        }
    }
}

