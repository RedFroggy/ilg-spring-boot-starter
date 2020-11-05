package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.swagger.annotations.ApiModelProperty;

/**
 * Adresse
 */
@JsonDeserialize(builder = Adresse.AdresseBuilder.class)
public class Adresse {

    private final String rue;

    private final String boitePostal;

    private final String codePostal;

    private final String ville;

    private final String departement;

    private final String codePays;

    private final String labelPays;

    private final String adresseTexte;

    private Adresse(AdresseBuilder builder) {
        this.rue = builder.rue;
        this.boitePostal = builder.boitePostal;
        this.codePostal = builder.codePostal;
        this.ville = builder.ville;
        this.departement = builder.departement;
        this.codePays = builder.codePays;
        this.labelPays = builder.labelPays;
        this.adresseTexte = builder.adresseTexte;
    }

    public static AdresseBuilder builder() {
        return new AdresseBuilder();
    }

    /**
     * Street name
     *
     * @return rue
     */
    @ApiModelProperty(example = "123 Rue de fleur", value = "Street name")
    public String getRue() {
        return rue;
    }

    /**
     * Postal Box
     *
     * @return boitePostal
     */
    @ApiModelProperty(example = "BP12", value = "Postal Box")
    public String getBoitePostal() {
        return boitePostal;
    }

    /**
     * Postal Code
     *
     * @return codePostal
     */
    @ApiModelProperty(example = "12345", value = "Postal Code")
    public String getCodePostal() {
        return codePostal;
    }

    /**
     * City
     *
     * @return ville
     */
    @ApiModelProperty(example = "Fleurviller", value = "City")
    public String getVille() {
        return ville;
    }

    /**
     * Departement as a number
     *
     * @return departement
     */
    @ApiModelProperty(example = "75", value = "Departement as a number")
    public String getDepartement() {
        return departement;
    }

    /**
     * Country code in ISO 3166-3
     *
     * @return codePays
     */
    @ApiModelProperty(example = "FRA", value = "Country code in ISO 3166-3")
    public String getCodePays() {
        return codePays;
    }

    /**
     * Country name
     *
     * @return labelPays
     */
    @ApiModelProperty(example = "France", value = "Country name")
    public String getLabelPays() {
        return labelPays;
    }

    /**
     * Full address text
     *
     * @return adresseTexte
     */
    @ApiModelProperty(example = "123 Rue Fleur 123456 Fleurville France", value = "Full address text")
    public String getAdresseTexte() {
        return adresseTexte;
    }

    @JsonPOJOBuilder(withPrefix = "")
    @JsonIgnoreProperties({"@type", "@context", "@id", "@link"})
    public static final class AdresseBuilder {
        private String rue;
        private String boitePostal;
        private String codePostal;
        private String ville;
        private String departement;
        private String codePays;
        private String labelPays;
        private String adresseTexte;

        private AdresseBuilder() {
        }

        public AdresseBuilder rue(String rue) {
            this.rue = rue;
            return this;
        }

        public AdresseBuilder boitePostal(String boitePostal) {
            this.boitePostal = boitePostal;
            return this;
        }

        public AdresseBuilder codePostal(String codePostal) {
            this.codePostal = codePostal;
            return this;
        }

        public AdresseBuilder ville(String ville) {
            this.ville = ville;
            return this;
        }

        public AdresseBuilder departement(String departement) {
            this.departement = departement;
            return this;
        }

        public AdresseBuilder codePays(String codePays) {
            this.codePays = codePays;
            return this;
        }

        public AdresseBuilder labelPays(String labelPays) {
            this.labelPays = labelPays;
            return this;
        }

        public AdresseBuilder adresseTexte(String adresseTexte) {
            this.adresseTexte = adresseTexte;
            return this;
        }

        public Adresse build() {
            return new Adresse(this);
        }
    }
}

