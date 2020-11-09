package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import fr.redfroggy.ilg.client.company.SiteProjection2;
import fr.redfroggy.ilg.client.site.CodeLabelPairProjection2;
import fr.redfroggy.ilg.client.site.SiteProjection;
import fr.redfroggy.ilg.client.site.SiteProjection5;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDate;
import java.util.List;

/**
 * Site
 */
@JsonDeserialize(builder = Site.SiteBuilder.class)
public class Site implements SiteProjection, SiteProjection2, SiteProjection5 {
    private final String id;

    private final String companyId;

    private final String registrationId;

    private final String siteNumber;

    private final String name;

    private final String commercialName;

    private final String tradings;

    private final String sigle;

    private final Boolean status;

    private final LocalDate creationDate;

    private final LocalDate closingDate;

    private final Boolean isHeadquarter;

    private final Address address;

    private final Site headquarter;

    private final Workforce workforce;

    private final CodeLabelPair activity;

    private final Company company;

    private final Integer tailleUniteUrbaine;

    private final String trancheCommune;

    private final String lieuActivite;

    private final String surface;

    private final String origine;

    private final List<SiteEvents> events;

    private Site(SiteBuilder builder) {
        this.id = builder.id;
        this.companyId = builder.companyId;
        this.registrationId = builder.registrationId;
        this.siteNumber = builder.siteNumber;
        this.name = builder.name;
        this.commercialName = builder.commercialName;
        this.tradings = builder.tradings;
        this.sigle = builder.sigle;
        this.status = builder.status;
        this.creationDate = builder.creationDate;
        this.closingDate = builder.closingDate;
        this.isHeadquarter = builder.isHeadquarter;
        this.address = builder.address;
        this.headquarter = builder.headquarter;
        this.workforce = builder.workforce;
        this.activity = builder.activity;
        this.company = builder.company;
        this.tailleUniteUrbaine = builder.tailleUniteUrbaine;
        this.trancheCommune = builder.trancheCommune;
        this.lieuActivite = builder.lieuActivite;
        this.surface = builder.surface;
        this.origine = builder.origine;
        this.events = builder.events;
    }

    public static SiteBuilder builder() {
        return new SiteBuilder();
    }

    /**
     * Identifier for an establishment
     *
     * @return id
     */
    @ApiModelProperty(example = "12345678900129", value = "Identifier for an establishment")
    public String getId() {
        return id;
    }

    /**
     * Identifier for the company owning the establishment
     *
     * @return companyId
     */
    @ApiModelProperty(example = "123456789", value = "Identifier for the company owning the establishment")
    public String getCompanyId() {
        return companyId;
    }

    /**
     * Fiscal registration Identifier
     *
     * @return registrationId
     */
    @ApiModelProperty(example = "12345678900129", value = "Fiscal registration Identifier")
    public String getRegistrationId() {
        return registrationId;
    }

    /**
     * Establishment number
     *
     * @return siteNumber
     */
    @ApiModelProperty(example = "00129", value = "Establishment number")
    public String getSiteNumber() {
        return siteNumber;
    }

    /**
     * Name of the establishment
     *
     * @return name
     */
    @ApiModelProperty(example = "Great Company", value = "Name of the establishment")
    public String getName() {
        return name;
    }

    /**
     * Commercial Name of the establishment
     *
     * @return commercialName
     */
    @ApiModelProperty(example = "World Aware", value = "Commercial Name of the establishment")
    public String getCommercialName() {
        return commercialName;
    }

    /**
     * Trading Name of the establishment
     *
     * @return tradings
     */
    @ApiModelProperty(example = "GC Information", value = "Trading Name of the establishment")
    public String getTradings() {
        return tradings;
    }

    /**
     * Acronym of the establishment
     *
     * @return sigle
     */
    @ApiModelProperty(example = "G.C.W.A.", value = "Acronym of the establishment")
    public String getSigle() {
        return sigle;
    }

    /**
     * Whether the establishment is active or not
     *
     * @return status
     */
    @ApiModelProperty(example = "true", value = "Whether the establishment is active or not")
    public Boolean getStatus() {
        return status;
    }

    /**
     * When the establishment opened
     *
     * @return creationDate
     */
    @ApiModelProperty(value = "When the establishment opened")
    public LocalDate getCreationDate() {
        return creationDate;
    }

    /**
     * When the establishment closed (if status=false)
     *
     * @return closingDate
     */
    public LocalDate getClosingDate() {
        return closingDate;
    }

    /**
     * Whether the establishment is headquarter or not
     *
     * @return isHeadquarter
     */
    @ApiModelProperty(example = "true", value = "Whether the establishment is headquarter or not")
    public Boolean getIsHeadquarter() {
        return isHeadquarter;
    }

    /**
     * Get address
     *
     * @return address
     */
    @ApiModelProperty(value = "")
    public Address getAddress() {
        return address;
    }

    /**
     * Get headquarter
     *
     * @return headquarter
     */
    @ApiModelProperty(value = "")
    public Site getHeadquarter() {
        return headquarter;
    }

    /**
     * Get workforce
     *
     * @return workforce
     */
    @ApiModelProperty(value = "")
    public Workforce getWorkforce() {
        return workforce;
    }

    /**
     * Get activity
     *
     * @return activity
     */
    @ApiModelProperty(value = "")
    public CodeLabelPairProjection2 getActivity() {
        return activity;
    }

    /**
     * Get company
     *
     * @return company
     */
    @ApiModelProperty(value = "")
    public Company getCompany() {
        return company;
    }

    /**
     * Size of urban unit
     *
     * @return tailleUniteUrbaine
     */
    @ApiModelProperty(value = "Size of urban unit")
    public Integer getTailleUniteUrbaine() {
        return tailleUniteUrbaine;
    }

    /**
     * Range size of city where the establishment is located
     *
     * @return trancheCommune
     */
    @ApiModelProperty(example = "10000 - 100000", value = "Range size of city where the establishment is located")
    public String getTrancheCommune() {
        return trancheCommune;
    }

    /**
     * à compléter
     *
     * @return lieuActivite
     */
    @ApiModelProperty(value = "à compléter")
    public String getLieuActivite() {
        return lieuActivite;
    }

    /**
     * à compléter
     *
     * @return surface
     */
    @ApiModelProperty(value = "à compléter")
    public String getSurface() {
        return surface;
    }

    /**
     * INSEE origin
     *
     * @return origine
     */
    @ApiModelProperty(example = "Création", value = "INSEE origin")
    public String getOrigine() {
        return origine;
    }

    /**
     * list of event
     *
     * @return events
     */
    @ApiModelProperty(value = "list of event")
    public List<SiteEvents> getEvents() {
        return events;
    }

    @JsonPOJOBuilder(withPrefix = "")
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class SiteBuilder {
        private String id;
        private String companyId;
        private String registrationId;
        private String siteNumber;
        private String name;
        private String commercialName;
        private String tradings;
        private String sigle;
        private Boolean status;
        private LocalDate creationDate;
        private LocalDate closingDate;
        private Boolean isHeadquarter;
        private Address address;
        private Site headquarter;
        private Workforce workforce;
        private CodeLabelPair activity;
        private Company company;
        private Integer tailleUniteUrbaine;
        private String trancheCommune;
        private String lieuActivite;
        private String surface;
        private String origine;
        private List<SiteEvents> events;

        private SiteBuilder() {
        }

        public SiteBuilder id(String id) {
            this.id = id;
            return this;
        }

        public SiteBuilder companyId(String companyId) {
            this.companyId = companyId;
            return this;
        }

        public SiteBuilder registrationId(String registrationId) {
            this.registrationId = registrationId;
            return this;
        }

        public SiteBuilder siteNumber(String siteNumber) {
            this.siteNumber = siteNumber;
            return this;
        }

        public SiteBuilder name(String name) {
            this.name = name;
            return this;
        }

        public SiteBuilder commercialName(String commercialName) {
            this.commercialName = commercialName;
            return this;
        }

        public SiteBuilder tradings(String tradings) {
            this.tradings = tradings;
            return this;
        }

        public SiteBuilder sigle(String sigle) {
            this.sigle = sigle;
            return this;
        }

        public SiteBuilder status(Boolean status) {
            this.status = status;
            return this;
        }

        public SiteBuilder creationDate(LocalDate creationDate) {
            this.creationDate = creationDate;
            return this;
        }

        public SiteBuilder closingDate(LocalDate closingDate) {
            this.closingDate = closingDate;
            return this;
        }

        public SiteBuilder isHeadquarter(Boolean isHeadquarter) {
            this.isHeadquarter = isHeadquarter;
            return this;
        }

        public SiteBuilder address(Address address) {
            this.address = address;
            return this;
        }

        public SiteBuilder headquarter(Site headquarter) {
            this.headquarter = headquarter;
            return this;
        }

        public SiteBuilder workforce(Workforce workforce) {
            this.workforce = workforce;
            return this;
        }

        public SiteBuilder activity(CodeLabelPair activity) {
            this.activity = activity;
            return this;
        }

        public SiteBuilder company(Company company) {
            this.company = company;
            return this;
        }

        public SiteBuilder tailleUniteUrbaine(Integer tailleUniteUrbaine) {
            this.tailleUniteUrbaine = tailleUniteUrbaine;
            return this;
        }

        public SiteBuilder trancheCommune(String trancheCommune) {
            this.trancheCommune = trancheCommune;
            return this;
        }

        public SiteBuilder lieuActivite(String lieuActivite) {
            this.lieuActivite = lieuActivite;
            return this;
        }

        public SiteBuilder surface(String surface) {
            this.surface = surface;
            return this;
        }

        public SiteBuilder origine(String origine) {
            this.origine = origine;
            return this;
        }

        public SiteBuilder events(List<SiteEvents> events) {
            this.events = events;
            return this;
        }

        public Site build() {
            return new Site(this);
        }
    }
}

