package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;

/**
 * ExecutiveFonction
 */
@JsonDeserialize(builder = ExecutiveFonction.ExecutiveFonctionBuilder.class)
public class ExecutiveFonction {

    private final String code;

    private final String label;

    private final Integer priority;

    private final String role;

    private final Block block;

    private final Integer showOrder;

    private ExecutiveFonction(ExecutiveFonctionBuilder builder) {
        this.code = builder.code;
        this.label = builder.label;
        this.priority = builder.priority;
        this.role = builder.role;
        this.block = builder.block;
        this.showOrder = builder.showOrder;
    }

    public static ExecutiveFonctionBuilder builder() {
        return new ExecutiveFonctionBuilder();
    }

    /**
     * Position code
     *
     * @return code
     */

    @ApiModelProperty(example = "047", value = "Position code")
    public String getCode() {
        return code;
    }

    /**
     * Position description
     *
     * @return label
     */

    @ApiModelProperty(example = "Administrateur", value = "Position description")
    public String getLabel() {
        return label;
    }

    /**
     * Position priority order
     *
     * @return priority
     */

    @ApiModelProperty(example = "4", value = "Position priority order")
    public Integer getPriority() {
        return priority;
    }

    /**
     * role of office
     *
     * @return role
     */

    @ApiModelProperty(example = "M", value = "role of office")
    public String getRole() {
        return role;
    }

    /**
     * Get block
     *
     * @return block
     */

    @ApiModelProperty(value = "")
    @Valid
    public Block getBlock() {
        return block;
    }

    /**
     * order identifier
     *
     * @return showOrder
     */

    @ApiModelProperty(value = "order identifier")
    public Integer getShowOrder() {
        return showOrder;
    }

    @JsonPOJOBuilder(withPrefix = "")
    public static final class ExecutiveFonctionBuilder {
        private String code;
        private String label;
        private Integer priority;
        private String role;
        private Block block;
        private Integer showOrder;

        private ExecutiveFonctionBuilder() {
        }

        public ExecutiveFonctionBuilder code(String code) {
            this.code = code;
            return this;
        }

        public ExecutiveFonctionBuilder label(String label) {
            this.label = label;
            return this;
        }

        public ExecutiveFonctionBuilder priority(Integer priority) {
            this.priority = priority;
            return this;
        }

        public ExecutiveFonctionBuilder role(String role) {
            this.role = role;
            return this;
        }

        public ExecutiveFonctionBuilder block(Block block) {
            this.block = block;
            return this;
        }

        public ExecutiveFonctionBuilder showOrder(Integer showOrder) {
            this.showOrder = showOrder;
            return this;
        }

        public ExecutiveFonction build() {
            return new ExecutiveFonction(this);
        }
    }
}

