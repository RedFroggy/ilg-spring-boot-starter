package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * KycUbo
 */
@JsonDeserialize(builder = KycUbo.KycUboBuilder.class)
public class KycUbo {

    private final String minDate;
    private final String maxDate;
    private final Integer totalMembers;
    private final Integer totalCapitalDetentionMembers;
    private final Integer totalLegalRepresentativeMembers;

    private final List<GroupMember> members;
    private final List<UboInvestigationStep> steps;

    public KycUbo(KycUboBuilder builder) {
        this.minDate = builder.minDate;
        this.maxDate = builder.maxDate;
        this.totalMembers = builder.totalMembers;
        this.totalCapitalDetentionMembers = builder.totalCapitalDetentionMembers;
        this.totalLegalRepresentativeMembers = builder.totalLegalRepresentativeMembers;
        this.members = builder.members;
        this.steps = builder.steps;
    }

    public static KycUboBuilder builder() {
        return new KycUboBuilder();
    }

    /**
     * Oldest information date
     *
     * @return minDate
     */
    @ApiModelProperty(value = "Oldest information date")
    public String getMinDate() {
        return minDate;
    }

    /**
     * Most recent information date
     *
     * @return maxDate
     */
    @ApiModelProperty(value = "Most recent information date")
    public String getMaxDate() {
        return maxDate;
    }

    /**
     * Number of UBO
     *
     * @return totalMembers
     */
    @ApiModelProperty(value = "Number of UBO")
    public Integer getTotalMembers() {
        return totalMembers;
    }

    /**
     * Number of capital detentions
     *
     * @return totalCapitalDetentionMembers
     */
    @ApiModelProperty(value = "Number of capital detentions")
    public Integer getTotalCapitalDetentionMembers() {
        return totalCapitalDetentionMembers;
    }

    /**
     * Number of legal representatives
     *
     * @return totalLegalRepresentativeMembers
     */
    @ApiModelProperty(value = "Number of legal representatives")
    public Integer getTotalLegalRepresentativeMembers() {
        return totalLegalRepresentativeMembers;
    }

    /**
     * UBO
     *
     * @return members
     */
    @ApiModelProperty(value = "UBO")
    public List<? extends GroupMember> getMembers() {
        return members;
    }

    /**
     * Procedure steps passed through to find ubo
     *
     * @return steps
     */
    @ApiModelProperty(value = "Procedure steps passed through to find ubo")
    public List<? extends UboInvestigationStep> getSteps() {
        return steps;
    }

    @JsonIgnoreProperties({"@type", "@context", "@id", "@link"})
    @JsonPOJOBuilder(withPrefix = "")
    public static final class KycUboBuilder {
        private String minDate;
        private String maxDate;
        private Integer totalMembers;
        private Integer totalCapitalDetentionMembers;
        private Integer totalLegalRepresentativeMembers;
        private List<GroupMember> members;
        private List<UboInvestigationStep> steps;

        private KycUboBuilder() {
        }

        public KycUboBuilder minDate(String minDate) {
            this.minDate = minDate;
            return this;
        }

        public KycUboBuilder maxDate(String maxDate) {
            this.maxDate = maxDate;
            return this;
        }

        public KycUboBuilder totalMembers(Integer totalMembers) {
            this.totalMembers = totalMembers;
            return this;
        }

        public KycUboBuilder totalCapitalDetentionMembers(Integer totalCapitalDetentionMembers) {
            this.totalCapitalDetentionMembers = totalCapitalDetentionMembers;
            return this;
        }

        public KycUboBuilder totalLegalRepresentativeMembers(Integer totalLegalRepresentativeMembers) {
            this.totalLegalRepresentativeMembers = totalLegalRepresentativeMembers;
            return this;
        }

        public KycUboBuilder members(List<GroupMember> members) {
            this.members = members;
            return this;
        }

        public KycUboBuilder steps(List<UboInvestigationStep> steps) {
            this.steps = steps;
            return this;
        }

        public KycUbo build() {
            return new KycUbo(this);
        }
    }
}

