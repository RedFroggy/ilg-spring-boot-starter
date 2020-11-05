package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.swagger.annotations.ApiModelProperty;

/**
 * Availability
 */
@JsonDeserialize(builder = Availability.AvailabilityBuilder.class)
public class Availability {

    private final Boolean identity;

    private final Boolean sites;

    private final Boolean risk;

    private final Boolean score;

    private final Boolean financial;

    private final Boolean links;

    private final Boolean groupStructure;

    private final Boolean groupInfo;

    private final Boolean mandataire;

    private final Boolean lastAds;

    private final Boolean events;

    private final Boolean executives;

    private final Boolean mandats;

    private final Boolean legal;

    private final Boolean kyc;

    public Availability(AvailabilityBuilder builder) {
        this.identity = builder.identity;
        this.sites = builder.sites;
        this.risk = builder.risk;
        this.score = builder.score;
        this.financial = builder.financial;
        this.links = builder.links;
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

    public static AvailabilityBuilder builder() {
        return new AvailabilityBuilder();
    }

    /**
     * Identity availability
     *
     * @return identity
     */
    @ApiModelProperty(value = "Identity availability")

    public Boolean getIdentity() {
        return identity;
    }

    /**
     * Sites availability
     *
     * @return sites
     */
    @ApiModelProperty(value = "Sites availability")
    public Boolean getSites() {
        return sites;
    }

    /**
     * Risk availability
     *
     * @return risk
     */
    @ApiModelProperty(value = "Risk availability")
    public Boolean getRisk() {
        return risk;
    }

    /**
     * Score availability
     *
     * @return score
     */
    @ApiModelProperty(value = "Score availability")
    public Boolean getScore() {
        return score;
    }

    /**
     * Financial availability
     *
     * @return financial
     */
    @ApiModelProperty(value = "Financial availability")
    public Boolean getFinancial() {
        return financial;
    }

    /**
     * Links availability
     *
     * @return links
     */
    @ApiModelProperty(value = "Links availability")
    public Boolean getLinks() {
        return links;
    }

    /**
     * Group structure availability
     *
     * @return groupStructure
     */
    @ApiModelProperty(value = "Group structure availability")
    public Boolean getGroupStructure() {
        return groupStructure;
    }

    /**
     * Group infos availability
     *
     * @return groupInfo
     */
    @ApiModelProperty(value = "Group infos availability")
    public Boolean getGroupInfo() {
        return groupInfo;
    }

    /**
     * Mandataire availability
     *
     * @return mandataire
     */

    @ApiModelProperty(value = "Mandataire availability")
    public Boolean getMandataire() {
        return mandataire;
    }

    /**
     * Last ads availability
     *
     * @return lastAds
     */
    @ApiModelProperty(value = "Last ads availability")
    public Boolean getLastAds() {
        return lastAds;
    }

    /**
     * Events availability
     *
     * @return events
     */
    @ApiModelProperty(value = "Events availability")
    public Boolean getEvents() {
        return events;
    }

    /**
     * Executives availability
     *
     * @return executives
     */
    @ApiModelProperty(value = "Executives availability")
    public Boolean getExecutives() {
        return executives;
    }

    /**
     * Mandats availability
     *
     * @return mandats
     */
    @ApiModelProperty(value = "Mandats availability")
    public Boolean getMandats() {
        return mandats;
    }

    /**
     * Legal availability
     *
     * @return legal
     */
    @ApiModelProperty(value = "Legal availability")
    public Boolean getLegal() {
        return legal;
    }

    /**
     * Kyc availability
     *
     * @return kyc
     */
    @ApiModelProperty(value = "Kyc availability")
    public Boolean getKyc() {
        return kyc;
    }

    @JsonPOJOBuilder(withPrefix = "")
    public static final class AvailabilityBuilder {
        private Boolean identity;
        private Boolean sites;
        private Boolean risk;
        private Boolean score;
        private Boolean financial;
        private Boolean links;
        private Boolean groupStructure;
        private Boolean groupInfo;
        private Boolean mandataire;
        private Boolean lastAds;
        private Boolean events;
        private Boolean executives;
        private Boolean mandats;
        private Boolean legal;
        private Boolean kyc;

        private AvailabilityBuilder() {
        }

        public AvailabilityBuilder identity(Boolean identity) {
            this.identity = identity;
            return this;
        }

        public AvailabilityBuilder sites(Boolean sites) {
            this.sites = sites;
            return this;
        }

        public AvailabilityBuilder risk(Boolean risk) {
            this.risk = risk;
            return this;
        }

        public AvailabilityBuilder score(Boolean score) {
            this.score = score;
            return this;
        }

        public AvailabilityBuilder financial(Boolean financial) {
            this.financial = financial;
            return this;
        }

        public AvailabilityBuilder links(Boolean links) {
            this.links = links;
            return this;
        }

        public AvailabilityBuilder groupStructure(Boolean groupStructure) {
            this.groupStructure = groupStructure;
            return this;
        }

        public AvailabilityBuilder groupInfo(Boolean groupInfo) {
            this.groupInfo = groupInfo;
            return this;
        }

        public AvailabilityBuilder mandataire(Boolean mandataire) {
            this.mandataire = mandataire;
            return this;
        }

        public AvailabilityBuilder lastAds(Boolean lastAds) {
            this.lastAds = lastAds;
            return this;
        }

        public AvailabilityBuilder events(Boolean events) {
            this.events = events;
            return this;
        }

        public AvailabilityBuilder executives(Boolean executives) {
            this.executives = executives;
            return this;
        }

        public AvailabilityBuilder mandats(Boolean mandats) {
            this.mandats = mandats;
            return this;
        }

        public AvailabilityBuilder legal(Boolean legal) {
            this.legal = legal;
            return this;
        }

        public AvailabilityBuilder kyc(Boolean kyc) {
            this.kyc = kyc;
            return this;
        }

        public Availability build() {
            return new Availability(this);
        }
    }
}
