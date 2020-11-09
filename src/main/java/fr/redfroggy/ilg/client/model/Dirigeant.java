package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDate;

/**
 * Dirigeant
 */
@JsonDeserialize(builder = Dirigeant.DirigeantBuilder.class)
public class Dirigeant {
    private final Civilite civilite;

    private final String nom;

    private final String nomJeuneFille;

    private final String prenom;

    private final String siren;

    private final String codeFonction;

    private final String labelFonction;

    private final LocalDate dateNaissance;

    private final String nationalite;

    private final String mouvement;

    private final String representePar;

    private final String apport;

    private final String telephone;

    private final Adresse adresse;

    public Dirigeant(DirigeantBuilder builder) {
        this.civilite = builder.civilite;
        this.nom = builder.nom;
        this.nomJeuneFille = builder.nomJeuneFille;
        this.prenom = builder.prenom;
        this.siren = builder.siren;
        this.codeFonction = builder.codeFonction;
        this.labelFonction = builder.labelFonction;
        this.dateNaissance = builder.dateNaissance;
        this.nationalite = builder.nationalite;
        this.mouvement = builder.mouvement;
        this.representePar = builder.representePar;
        this.apport = builder.apport;
        this.telephone = builder.telephone;
        this.adresse = builder.adresse;
    }

    public static DirigeantBuilder builder() {
        return new DirigeantBuilder();
    }

    /**
     * Executive title
     *
     * @return civilite
     */
    @ApiModelProperty(example = "M", value = "Executive title")
    public Civilite getCivilite() {
        return civilite;
    }

    /**
     * Lastname
     *
     * @return nom
     */
    @ApiModelProperty(example = "Dupont", value = "Lastname")
    public String getNom() {
        return nom;
    }

    /**
     * Maiden name
     *
     * @return nomJeuneFille
     */
    @ApiModelProperty(example = "", value = "Maiden name")
    public String getNomJeuneFille() {
        return nomJeuneFille;
    }

    /**
     * Firstname
     *
     * @return prenom
     */
    @ApiModelProperty(example = "Laurent", value = "Firstname")
    public String getPrenom() {
        return prenom;
    }

    /**
     * Company identifier if available
     *
     * @return siren
     */
    @ApiModelProperty(example = "123456789", value = "Company identifier if available")
    public String getSiren() {
        return siren;
    }

    /**
     * Executive position
     *
     * @return codeFonction
     */
    @ApiModelProperty(example = "01", value = "Executive position")
    public String getCodeFonction() {
        return codeFonction;
    }

    /**
     * Executive position label
     *
     * @return labelFonction
     */
    @ApiModelProperty(example = "Président", value = "Executive position label")
    public String getLabelFonction() {
        return labelFonction;
    }

    /**
     * Birth date
     *
     * @return dateNaissance
     */
    @ApiModelProperty(value = "Birth date")
    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    /**
     * Nationality
     *
     * @return nationalite
     */
    @ApiModelProperty(example = "Française", value = "Nationality")
    public String getNationalite() {
        return nationalite;
    }

    /**
     * Assignment
     *
     * @return mouvement
     */
    @ApiModelProperty(example = "Nomination", value = "Assignment")
    public String getMouvement() {
        return mouvement;
    }

    /**
     * Represented by
     *
     * @return representePar
     */
    @ApiModelProperty(value = "Represented by")
    public String getRepresentePar() {
        return representePar;
    }

    /**
     * @return apport
     */
    @ApiModelProperty(value = "")
    public String getApport() {
        return apport;
    }

    /**
     * Phone number
     *
     * @return telephone
     */
    @ApiModelProperty(example = "012345789", value = "Phone number")
    public String getTelephone() {
        return telephone;
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
    public static final class DirigeantBuilder {
        private Civilite civilite;
        private String nom;
        private String nomJeuneFille;
        private String prenom;
        private String siren;
        private String codeFonction;
        private String labelFonction;
        private LocalDate dateNaissance;
        private String nationalite;
        private String mouvement;
        private String representePar;
        private String apport;
        private String telephone;
        private Adresse adresse;

        private DirigeantBuilder() {
        }

        public DirigeantBuilder civilite(Civilite civilite) {
            this.civilite = civilite;
            return this;
        }

        public DirigeantBuilder nom(String nom) {
            this.nom = nom;
            return this;
        }

        public DirigeantBuilder nomJeuneFille(String nomJeuneFille) {
            this.nomJeuneFille = nomJeuneFille;
            return this;
        }

        public DirigeantBuilder prenom(String prenom) {
            this.prenom = prenom;
            return this;
        }

        public DirigeantBuilder siren(String siren) {
            this.siren = siren;
            return this;
        }

        public DirigeantBuilder codeFonction(String codeFonction) {
            this.codeFonction = codeFonction;
            return this;
        }

        public DirigeantBuilder labelFonction(String labelFonction) {
            this.labelFonction = labelFonction;
            return this;
        }

        public DirigeantBuilder dateNaissance(LocalDate dateNaissance) {
            this.dateNaissance = dateNaissance;
            return this;
        }

        public DirigeantBuilder nationalite(String nationalite) {
            this.nationalite = nationalite;
            return this;
        }

        public DirigeantBuilder mouvement(String mouvement) {
            this.mouvement = mouvement;
            return this;
        }

        public DirigeantBuilder representePar(String representePar) {
            this.representePar = representePar;
            return this;
        }

        public DirigeantBuilder apport(String apport) {
            this.apport = apport;
            return this;
        }

        public DirigeantBuilder telephone(String telephone) {
            this.telephone = telephone;
            return this;
        }

        public DirigeantBuilder adresse(Adresse adresse) {
            this.adresse = adresse;
            return this;
        }

        public Dirigeant build() {
            return new Dirigeant(this);
        }
    }
}

