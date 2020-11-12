package fr.redfroggy.ilg.client.executive;

import fr.redfroggy.ilg.client.Sorting;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

public class ExecutiveRequest {

    private final Integer blockId;
    private final Boolean active;
    private final PositionRole positionRole;
    private final Sorting.Direction ordersName;
    private final Sorting.Direction ordersTermPositionCode;
    private final Sorting.Direction ordersTermStartDate;

    private ExecutiveRequest(ExecutiveRequestBuilder builder) {
        this.blockId = builder.blockId;
        this.active = builder.active;
        this.positionRole = builder.positionRole;
        this.ordersName = builder.ordersName;
        this.ordersTermPositionCode = builder.ordersTermPositionCode;
        this.ordersTermStartDate = builder.ordersTermStartDate;
    }

    /**
     *
     * @return block identifier (optional)
     */
    public Integer getBlockId() {
        return blockId;
    }

    /**
     *
     * @return true(active) or false(inactive)
     */
    public Boolean getActive() {
        return active;
    }

    /**
     * Type of term
     *
     * @return M, O, CAC
     */
    public PositionRole getPositionRole() {
        return positionRole;
    }

    /**
     * Executive name
     *
     * @return (asc/desc) (optional)
     */
    public Sorting.Direction getOrdersName() {
        return ordersName;
    }

    /**
     * Executive position code
     *
     * @return (asc/desc) (optional)
     */
    public Sorting.Direction getOrdersTermPositionCode() {
        return ordersTermPositionCode;
    }

    /**
     * Term start date (asc/desc)
     *
     * @return asc/desc (optional)
     */
    public Sorting.Direction getOrdersTermStartDate() {
        return ordersTermStartDate;
    }

    public MultiValueMap<String, String> toQueryParams() {
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        if (blockId != null) {
            queryParams.add("blockId", String.valueOf(blockId));
        }
        if (active != null) {
            queryParams.add("active", String.valueOf(active));
        }
        if (positionRole != null) {
            queryParams.add("positionRole", positionRole.name());
        }
        if (ordersName != null) {
            queryParams.add("orders[name]", ordersName.name().toLowerCase());
        }
        if (ordersTermPositionCode != null) {
            queryParams.add("orders[term.position_code]", ordersTermPositionCode.name().toLowerCase());
        }
        if (ordersTermStartDate != null) {
            queryParams.add("orders[term.start_date]", ordersTermStartDate.name().toLowerCase());
        }
        return queryParams;
    }

    public static ExecutiveRequestBuilder builder() {
        return new ExecutiveRequestBuilder();
    }

    public static final class ExecutiveRequestBuilder {
        private Integer blockId;
        private Boolean active;
        private PositionRole positionRole;
        private Sorting.Direction ordersName;
        private Sorting.Direction ordersTermPositionCode;
        private Sorting.Direction ordersTermStartDate;

        private ExecutiveRequestBuilder() {
        }

        public ExecutiveRequestBuilder blockId(Integer blockId) {
            this.blockId = blockId;
            return this;
        }

        public ExecutiveRequestBuilder active(Boolean active) {
            this.active = active;
            return this;
        }

        public ExecutiveRequestBuilder positionRole(PositionRole positionRole) {
            this.positionRole = positionRole;
            return this;
        }

        public ExecutiveRequestBuilder ordersName(Sorting.Direction ordersName) {
            this.ordersName = ordersName;
            return this;
        }

        public ExecutiveRequestBuilder ordersTermPositionCode(Sorting.Direction ordersTermPositionCode) {
            this.ordersTermPositionCode = ordersTermPositionCode;
            return this;
        }

        public ExecutiveRequestBuilder ordersTermStartDate(Sorting.Direction ordersTermStartDate) {
            this.ordersTermStartDate = ordersTermStartDate;
            return this;
        }

        public ExecutiveRequest build() {
            return new ExecutiveRequest(this);
        }
    }

    /**
     * Role representing the type of a membership.
     */
    public enum PositionRole {
        M, O, CAC;
    }
}
