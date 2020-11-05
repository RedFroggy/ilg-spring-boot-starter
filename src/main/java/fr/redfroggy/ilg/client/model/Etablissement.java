package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.swagger.annotations.ApiModelProperty;

/**
 * Etablissement
 */
@JsonDeserialize(builder = Etablissement.EtablissementBuilder.class)
public class Etablissement {
    private final TypeEtablissement typeEtablissement;

    private final String siret;

    private final String nic;

    private final String enseigne;

    private final String naf;

    private final String activite;

    private final String origineFonds;

    private final Adresse adresse;

    private Etablissement(EtablissementBuilder builder) {
        this.typeEtablissement = builder.typeEtablissement;
        this.siret = builder.siret;
        this.nic = builder.nic;
        this.enseigne = builder.enseigne;
        this.naf = builder.naf;
        this.activite = builder.activite;
        this.origineFonds = builder.origineFonds;
        this.adresse = builder.adresse;
    }

    public static EtablissementBuilder builder() {
        return new EtablissementBuilder();
    }

    /**
     * Type of Site
     *
     * @return typeEtablissement
     */
    @ApiModelProperty(example = "Principal", value = "Type of Site")
    public TypeEtablissement getTypeEtablissement() {
        return typeEtablissement;
    }

    /**
     * Site unique identifier (only available in france)
     *
     * @return siret
     */
    @ApiModelProperty(example = "12345678900010", value = "Site unique identifier (only available in france)")
    public String getSiret() {
        return siret;
    }

    /**
     * Site number
     *
     * @return nic
     */
    @ApiModelProperty(example = "00010", value = "Site number")
    public String getNic() {
        return nic;
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
     * Activity Code
     *
     * @return naf
     */
    @ApiModelProperty(example = "1200Z", value = "Activity Code")
    public String getNaf() {
        return naf;
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
     * à Compléter
     *
     * @return origineFonds
     */
    @ApiModelProperty(value = "à Compléter")
    public String getOrigineFonds() {
        return origineFonds;
    }

    /**
     * Site address
     *
     * @return adresse
     */
    @ApiModelProperty(example = "123 Rue Fleur 12456 Fleurville", value = "Site address")
    public Adresse getAdresse() {
        return adresse;
    }

    @JsonPOJOBuilder(withPrefix = "")
    @JsonIgnoreProperties({"@type", "@context", "@id", "@link"})
    public static final class EtablissementBuilder {
        private TypeEtablissement typeEtablissement;
        private String siret;
        private String nic;
        private String enseigne;
        private String naf;
        private String activite;
        private String origineFonds;
        private Adresse adresse;

        private EtablissementBuilder() {
        }

        public EtablissementBuilder typeEtablissement(TypeEtablissement typeEtablissement) {
            this.typeEtablissement = typeEtablissement;
            return this;
        }

        public EtablissementBuilder siret(String siret) {
            this.siret = siret;
            return this;
        }

        public EtablissementBuilder nic(String nic) {
            this.nic = nic;
            return this;
        }

        public EtablissementBuilder enseigne(String enseigne) {
            this.enseigne = enseigne;
            return this;
        }

        public EtablissementBuilder naf(String naf) {
            this.naf = naf;
            return this;
        }

        public EtablissementBuilder activite(String activite) {
            this.activite = activite;
            return this;
        }

        public EtablissementBuilder origineFonds(String origineFonds) {
            this.origineFonds = origineFonds;
            return this;
        }

        public EtablissementBuilder adresse(Adresse adresse) {
            this.adresse = adresse;
            return this;
        }

        public Etablissement build() {
            return new Etablissement(this);
        }
    }
}

