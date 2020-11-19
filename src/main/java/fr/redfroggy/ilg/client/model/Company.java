package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import fr.redfroggy.ilg.client.company.CompanyProjection;
import fr.redfroggy.ilg.client.search.CompanyProjection5;
import fr.redfroggy.ilg.client.site.CompanyProjection4;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Company
 */
@JsonDeserialize(builder = Company.CompanyBuilder.class)
public class Company implements CompanyProjection, CompanyProjection4,
        CompanyProjection5 {
    private final Identity identity;

    private final Object sites;

    private final Risk risk;

    private final Score score;

    private final Financial financial;

    private final Links links;

    private final GroupMember groupStructure;

    private final GroupInfo groupInfo;

    private final Executive mandataire;

    private final List<Event> lastAds;

    private final Object events;

    private final Object executives;

    private final Object mandats;

    private final Object legal;

    private final Kyc kyc;

    private Company(CompanyBuilder builder) {
        this.links = builder.links;
        this.sites = builder.sites;
        this.identity = builder.identity;
        this.risk = builder.risk;
        this.score = builder.score;
        this.financial = builder.financial;
        this.groupStructure = builder.groupStructure;
        this.groupInfo = builder.groupInfo;
        this.mandataire = builder.mandataire;
        this.lastAds = builder.lastAds;
        this.events = builder.events;
        this.executives = builder.executives;
        this.mandats = builder.mandats;
        this.legal = builder.legal;
        this.kyc = builder.kyc;
    }

    public Company(Identity identity) {
        this.identity = identity;
        this.sites = null;
        this.risk = null;
        this.score = null;
        this.financial = null;
        this.links = null;
        this.groupStructure = null;
        this.groupInfo = null;
        this.mandataire = null;
        this.lastAds = null;
        this.events = null;
        this.executives = null;
        this.mandats = null;
        this.legal = null;
        this.kyc = null;
    }

    public static CompanyBuilder builder() {
        return new CompanyBuilder();
    }

    /**
     * Get identity
     *
     * @return identity
     */
    @ApiModelProperty(value = "")
    public Identity getIdentity() {
        return identity;
    }

    /**
     * Get sites
     *
     * @return sites
     */
    @ApiModelProperty(value = "")
    public Object getSites() {
        return sites;
    }

    /**
     * Get risk
     *
     * @return risk
     */
    @ApiModelProperty(value = "")
    public Risk getRisk() {
        return risk;
    }

    /**
     * Get score
     *
     * @return score
     */
    @ApiModelProperty(value = "")
    public Score getScore() {
        return score;
    }

    /**
     * Get financial
     *
     * @return financial
     */
    @ApiModelProperty(value = "")
    public Financial getFinancial() {
        return financial;
    }

    /**
     * Get links
     *
     * @return links
     */
    @ApiModelProperty(value = "")
    public Links getLinks() {
        return links;
    }

    /**
     * Get groupStructure
     *
     * @return groupStructure
     */
    @ApiModelProperty(value = "")
    public GroupMember getGroupStructure() {
        return groupStructure;
    }

    /**
     * Get groupInfo
     *
     * @return groupInfo
     */
    @ApiModelProperty(value = "")
    public GroupInfo getGroupInfo() {
        return groupInfo;
    }

    /**
     * Get mandataire
     *
     * @return mandataire
     */
    @ApiModelProperty(value = "")
    public Executive getMandataire() {
        return mandataire;
    }

    /**
     * @return lastAds
     */
    @ApiModelProperty(value = "")
    public List<Event> getLastAds() {
        return lastAds;
    }

    /**
     * Get events
     *
     * @return events
     */
    @ApiModelProperty(value = "")
    public Object getEvents() {
        return events;
    }

    /**
     * Get executives
     *
     * @return executives
     */
    @ApiModelProperty(value = "")
    public Object getExecutives() {
        return executives;
    }

    /**
     * Get mandats
     *
     * @return mandats
     */
    @ApiModelProperty(value = "")
    public Object getMandats() {
        return mandats;
    }

    /**
     * Get legal
     *
     * @return legal
     */
    @ApiModelProperty(value = "")
    public Object getLegal() {
        return legal;
    }

    /**
     * Get kyc
     *
     * @return kyc
     */
    @ApiModelProperty(value = "")
    public Kyc getKyc() {
        return kyc;
    }

    @JsonPOJOBuilder(withPrefix = "")
    @JsonIgnoreProperties({"@type", "@context", "@id", "@link", "sites", "events", "executives", "mandats", "legal",
            "kyc"})
    public static final class CompanyBuilder {
        private Identity identity;
        private Object sites;
        private Risk risk;
        private Score score;
        private Financial financial;
        private Links links;
        private GroupMember groupStructure;
        private GroupInfo groupInfo;
        private Executive mandataire;
        private List<Event> lastAds;
        private Object events;
        private Object executives;
        private Object mandats;
        private Object legal;
        private Kyc kyc;

        private CompanyBuilder() {
        }

        public CompanyBuilder identity(Identity identity) {
            this.identity = identity;
            return this;
        }

        public CompanyBuilder sites(Object sites) {
            this.sites = sites;
            return this;
        }

        public CompanyBuilder risk(Risk risk) {
            this.risk = risk;
            return this;
        }

        public CompanyBuilder score(Score score) {
            this.score = score;
            return this;
        }

        public CompanyBuilder financial(Financial financial) {
            this.financial = financial;
            return this;
        }

        public CompanyBuilder links(Links links) {
            this.links = links;
            return this;
        }

        public CompanyBuilder groupStructure(GroupMember groupStructure) {
            this.groupStructure = groupStructure;
            return this;
        }

        public CompanyBuilder groupInfo(GroupInfo groupInfo) {
            this.groupInfo = groupInfo;
            return this;
        }

        public CompanyBuilder mandataire(Executive mandataire) {
            this.mandataire = mandataire;
            return this;
        }

        public CompanyBuilder lastAds(List<Event> lastAds) {
            this.lastAds = lastAds;
            return this;
        }

        public CompanyBuilder events(Object events) {
            this.events = events;
            return this;
        }

        public CompanyBuilder executives(Object executives) {
            this.executives = executives;
            return this;
        }

        public CompanyBuilder mandats(Object mandats) {
            this.mandats = mandats;
            return this;
        }

        public CompanyBuilder legal(Object legal) {
            this.legal = legal;
            return this;
        }

        public CompanyBuilder kyc(Kyc kyc) {
            this.kyc = kyc;
            return this;
        }

        public Company build() {
            return new Company(this);
        }
    }
}

