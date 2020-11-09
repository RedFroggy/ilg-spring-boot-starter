package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import fr.redfroggy.ilg.client.company.IdentityProjection;
import fr.redfroggy.ilg.client.site.IdentityProjection3;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDate;
import java.util.List;

/**
 * Identity
 */
@JsonDeserialize(builder = Identity.IdentityBuilder.class)
public class Identity implements IdentityProjection, IdentityProjection3 {
    private final String id;

    private final String registrationId;

    private final String vatnumber;

    private final String name;

    private final String tradings;

    private final String acronym;

    private final Address address;

    private final Site headquarter;

    private final Workforce workforce;

    private final Contact contact;

    private final LegalFormModel legalForm;

    private final ActivityModel activity;

    private final String declaredActivity;

    private final List<SecondaryActivityModel> secondaryActivities;

    private final LocalDate creationDate;

    private final Integer status;

    private final String rna;

    private final String capital;

    private final String rcs;

    private final Cotation cotation;

    private final List<MarketInformationModel> tags;

    private Identity(IdentityBuilder builder) {
        this.id = builder.id;
        this.registrationId = builder.registrationId;
        this.vatnumber = builder.vatnumber;
        this.name = builder.name;
        this.tradings = builder.tradings;
        this.acronym = builder.acronym;
        this.address = builder.address;
        this.headquarter = builder.headquarter;
        this.workforce = builder.workforce;
        this.contact = builder.contact;
        this.legalForm = builder.legalForm;
        this.activity = builder.activity;
        this.declaredActivity = builder.declaredActivity;
        this.secondaryActivities = builder.secondaryActivities;
        this.creationDate = builder.creationDate;
        this.status = builder.status;
        this.rna = builder.rna;
        this.capital = builder.capital;
        this.rcs = builder.rcs;
        this.cotation = builder.cotation;
        this.tags = builder.tags;
    }

    public static IdentityBuilder builder() {
        return new IdentityBuilder();
    }

    /**
     * Company Identifier
     *
     * @return id
     */

    @ApiModelProperty(example = "0123456789", value = "Company Identifier")
    public String getId() {
        return id;
    }

    /**
     * Fiscal Registration Number
     *
     * @return registrationId
     */

    @ApiModelProperty(example = "0123456789", value = "Fiscal Registration Number")
    public String getRegistrationId() {
        return registrationId;
    }

    /**
     * Tax registration number
     *
     * @return vatnumber
     */

    @ApiModelProperty(example = "FR670123456789", value = "Tax registration number")
    public String getVatnumber() {
        return vatnumber;
    }

    /**
     * Company name
     *
     * @return name
     */

    @ApiModelProperty(example = "Great Company", value = "Company name")
    public String getName() {
        return name;
    }

    /**
     * Company trading name
     *
     * @return tradings
     */

    @ApiModelProperty(example = "GC Information", value = "Company trading name")
    public String getTradings() {
        return tradings;
    }

    /**
     * Company acronym
     *
     * @return acronym
     */

    @ApiModelProperty(example = "G.C.I", value = "Company acronym")
    public String getAcronym() {
        return acronym;
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
     * Get contact
     *
     * @return contact
     */

    @ApiModelProperty(value = "")
    public Contact getContact() {
        return contact;
    }

    /**
     * Get legalForm
     *
     * @return legalForm
     */

    @ApiModelProperty(value = "")
    public LegalFormModel getLegalForm() {
        return legalForm;
    }

    /**
     * Get activity
     *
     * @return activity
     */

    @ApiModelProperty(value = "")
    public ActivityModel getActivity() {
        return activity;
    }

    /**
     * Declared activity
     *
     * @return declaredActivity
     */

    @ApiModelProperty(example = "Commerce de matériel audio", value = "Declared activity")
    public String getDeclaredActivity() {
        return declaredActivity;
    }

    /**
     * List of secondary activities
     *
     * @return secondaryActivities
     */

    @ApiModelProperty(value = "List of secondary activities")
    public List<SecondaryActivityModel> getSecondaryActivities() {
        return secondaryActivities;
    }

    /**
     * When the company was created
     *
     * @return creationDate
     */

    @ApiModelProperty(value = "When the company was created")
    public LocalDate getCreationDate() {
        return creationDate;
    }

    /**
     * Whether the company is active or not
     *
     * @return status
     */

    @ApiModelProperty(example = "1", value = "Whether the company is active or not")
    public Integer getStatus() {
        return status;
    }

    /**
     * RNA (Répertoire National des Associations) number if company registred as association or null
     *
     * @return rna
     */

    @ApiModelProperty(example = "W452006858", value =
            "RNA (Répertoire National des Associations) number if company registred as association or null")
    public String getRna() {
        return rna;
    }

    /**
     * Company Capitalization
     *
     * @return capital
     */

    @ApiModelProperty(value = "Company Capitalization")
    public String getCapital() {
        return capital;
    }

    /**
     * Institution in which the company is registered
     *
     * @return rcs
     */

    @ApiModelProperty(example = "RCS Paris", value = "Institution in which the company is registered")
    public String getRcs() {
        return rcs;
    }

    /**
     * Get cotation
     *
     * @return cotation
     */

    @ApiModelProperty(value = "")
    public Cotation getCotation() {
        return cotation;
    }

    /**
     * Market information
     *
     * @return tags
     */

    @ApiModelProperty(value = "Market information")
    public List<MarketInformationModel> getTags() {
        return tags;
    }

    @JsonPOJOBuilder(withPrefix = "")
    @JsonIgnoreProperties({"@type", "@context", "@id", "@link"})
    public static final class IdentityBuilder {
        private String id;
        private String registrationId;
        private String vatnumber;
        private String name;
        private String tradings;
        private String acronym;
        private Address address;
        private Site headquarter;
        private Workforce workforce;
        private Contact contact;
        private LegalFormModel legalForm;
        private ActivityModel activity;
        private String declaredActivity;
        private List<SecondaryActivityModel> secondaryActivities;
        private LocalDate creationDate;
        private Integer status;
        private String rna;
        private String capital;
        private String rcs;
        private Cotation cotation;
        private List<MarketInformationModel> tags = null;

        private IdentityBuilder() {
        }

        public IdentityBuilder id(String id) {
            this.id = id;
            return this;
        }

        public IdentityBuilder registrationId(String registrationId) {
            this.registrationId = registrationId;
            return this;
        }

        public IdentityBuilder vatnumber(String vatnumber) {
            this.vatnumber = vatnumber;
            return this;
        }

        public IdentityBuilder name(String name) {
            this.name = name;
            return this;
        }

        public IdentityBuilder tradings(String tradings) {
            this.tradings = tradings;
            return this;
        }

        public IdentityBuilder acronym(String acronym) {
            this.acronym = acronym;
            return this;
        }

        public IdentityBuilder address(Address address) {
            this.address = address;
            return this;
        }

        public IdentityBuilder headquarter(Site headquarter) {
            this.headquarter = headquarter;
            return this;
        }

        public IdentityBuilder workforce(Workforce workforce) {
            this.workforce = workforce;
            return this;
        }

        public IdentityBuilder contact(Contact contact) {
            this.contact = contact;
            return this;
        }

        public IdentityBuilder legalForm(LegalFormModel legalForm) {
            this.legalForm = legalForm;
            return this;
        }

        public IdentityBuilder activity(ActivityModel activity) {
            this.activity = activity;
            return this;
        }

        public IdentityBuilder declaredActivity(String declaredActivity) {
            this.declaredActivity = declaredActivity;
            return this;
        }

        public IdentityBuilder secondaryActivities(List<SecondaryActivityModel> secondaryActivities) {
            this.secondaryActivities = secondaryActivities;
            return this;
        }

        public IdentityBuilder creationDate(LocalDate creationDate) {
            this.creationDate = creationDate;
            return this;
        }

        public IdentityBuilder status(Integer status) {
            this.status = status;
            return this;
        }

        public IdentityBuilder rna(String rna) {
            this.rna = rna;
            return this;
        }

        public IdentityBuilder capital(String capital) {
            this.capital = capital;
            return this;
        }

        public IdentityBuilder rcs(String rcs) {
            this.rcs = rcs;
            return this;
        }

        public IdentityBuilder cotation(Cotation cotation) {
            this.cotation = cotation;
            return this;
        }

        public IdentityBuilder tags(List<MarketInformationModel> tags) {
            this.tags = tags;
            return this;
        }

        public Identity build() {
            return new Identity(this);
        }
    }
}

