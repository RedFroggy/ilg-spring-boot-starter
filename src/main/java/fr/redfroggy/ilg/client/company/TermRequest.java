package fr.redfroggy.ilg.client.company;

import fr.redfroggy.ilg.client.Sorting;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

public class TermRequest {

    private final Integer blockId;
    private final PositionRole positionRole;
    private final Boolean principal;
    private final Boolean termsState;
    private final Sorting.Direction ordersStartDate;

    private TermRequest(TermRequestBuilder builder) {
        this.blockId = builder.blockId;
        this.positionRole = builder.positionRole;
        this.principal = builder.principal;
        this.termsState = builder.termsState;
        this.ordersStartDate = builder.ordersStartDate;
    }

    /**
     * @return Unique identifier representing a block
     */
    public Integer getBlockId() {
        return blockId;
    }

    /**
     * Role representing the type of a membership", allowableValues = "M, O, CAC
     *
     * @return Role representing the type of a membership
     */
    public PositionRole getPositionRole() {
        return positionRole;
    }

    /**
     * @return principal
     */
    public Boolean getPrincipal() {
        return principal;
    }

    /**
     * Filters companies with at least one (true) or no (false) active term of office
     *
     * @return active term of office
     */
    public Boolean getTermsState() {
        return termsState;
    }

    /**
     * Term of office start date (asc/desc)
     *
     * @return asc/desc
     */
    public Sorting.Direction getOrdersStartDate() {
        return ordersStartDate;
    }

    public MultiValueMap<String, String> toQueryParams() {
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        if (blockId != null) {
            queryParams.add("blockId", String.valueOf(blockId));
        }
        if (positionRole != null) {
            queryParams.add("positionRole", positionRole.name());
        }
        if (principal != null) {
            queryParams.add("principal", String.valueOf(principal));
        }
        if (termsState != null) {
            queryParams.add("termsState", String.valueOf(termsState));
        }
        if (ordersStartDate != null) {
            queryParams.add("orders[start_date]", ordersStartDate.name().toLowerCase());
        }
        return queryParams;
    }

    public static TermRequestBuilder builder() {
        return new TermRequestBuilder();
    }

    public static final class TermRequestBuilder {
        private Integer blockId;
        private PositionRole positionRole;
        private Boolean principal;
        private Boolean termsState;
        private Sorting.Direction ordersStartDate;

        private TermRequestBuilder() {
        }

        public TermRequestBuilder blockId(Integer blockId) {
            this.blockId = blockId;
            return this;
        }

        public TermRequestBuilder positionRole(PositionRole positionRole) {
            this.positionRole = positionRole;
            return this;
        }

        public TermRequestBuilder principal(Boolean principal) {
            this.principal = principal;
            return this;
        }

        public TermRequestBuilder termsState(Boolean termsState) {
            this.termsState = termsState;
            return this;
        }

        public TermRequestBuilder ordersStartDate(Sorting.Direction ordersStartDate) {
            this.ordersStartDate = ordersStartDate;
            return this;
        }

        public TermRequest build() {
            return new TermRequest(this);
        }
    }

    /**
     * Role representing the type of a membership.
     */
    public enum PositionRole {
        M, O, CAC;
    }
}
