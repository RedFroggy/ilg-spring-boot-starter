package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;

import java.util.List;

/**
 * Block
 */
@JsonDeserialize(builder = Block.BlockBuilder.class)
public class Block {

    private final Integer id;

    private final String label;

    private final Integer orderId;

    private final Integer nbActiveTerms;

    private final Integer nbInactiveTerms;

    private final Integer nbActiveRegroupings;

    private final Integer nbInactiveRegroupings;

    private final List<Executive> dirigeants;

    private Block(BlockBuilder builder) {
        this.id = builder.id;
        this.label = builder.label;
        this.orderId = builder.orderId;
        this.nbActiveTerms = builder.nbActiveTerms;
        this.nbInactiveTerms = builder.nbInactiveTerms;
        this.nbActiveRegroupings = builder.nbActiveRegroupings;
        this.nbInactiveRegroupings = builder.nbInactiveRegroupings;
        this.dirigeants = builder.dirigeants;
    }

    public static BlockBuilder builder() {
        return new BlockBuilder();
    }

    /**
     * Identifier of block
     *
     * @return id
     */
    @ApiModelProperty(value = "Identifier of block")
    public Integer getId() {
        return id;
    }

    /**
     * Label of block
     *
     * @return label
     */
    @ApiModelProperty(value = "Label of block")
    public String getLabel() {
        return label;
    }

    /**
     * priority
     *
     * @return orderId
     */
    @ApiModelProperty(value = "priority")
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * number of active term in the block
     *
     * @return nbActiveTerms
     */
    @ApiModelProperty(value = "number of active term in the block")
    public Integer getNbActiveTerms() {
        return nbActiveTerms;
    }

    /**
     * number of inactive term in the block
     *
     * @return nbInactiveTerms
     */
    @ApiModelProperty(value = "number of inactive term in the block")
    public Integer getNbInactiveTerms() {
        return nbInactiveTerms;
    }

    /**
     * number of active regroupings in the block
     *
     * @return nbActiveRegroupings
     */
    @ApiModelProperty(value = "number of active regroupings in the block")
    public Integer getNbActiveRegroupings() {
        return nbActiveRegroupings;
    }

    /**
     * number of inactive regroupings in the block
     *
     * @return nbInactiveRegroupings
     */
    @ApiModelProperty(value = "number of inactive regroupings in the block")
    public Integer getNbInactiveRegroupings() {
        return nbInactiveRegroupings;
    }

    /**
     * List of executives
     *
     * @return dirigeants
     */
    @ApiModelProperty(value = "List of executives")
    @Valid
    public List<Executive> getDirigeants() {
        return dirigeants;
    }

    @JsonPOJOBuilder(withPrefix = "")
    public static final class BlockBuilder {
        private Integer id;
        private String label;
        private Integer orderId;
        private Integer nbActiveTerms;
        private Integer nbInactiveTerms;
        private Integer nbActiveRegroupings;
        private Integer nbInactiveRegroupings;
        private List<Executive> dirigeants = null;

        private BlockBuilder() {
        }

        public BlockBuilder id(Integer id) {
            this.id = id;
            return this;
        }

        public BlockBuilder label(String label) {
            this.label = label;
            return this;
        }

        public BlockBuilder orderId(Integer orderId) {
            this.orderId = orderId;
            return this;
        }

        public BlockBuilder nbActiveTerms(Integer nbActiveTerms) {
            this.nbActiveTerms = nbActiveTerms;
            return this;
        }

        public BlockBuilder nbInactiveTerms(Integer nbInactiveTerms) {
            this.nbInactiveTerms = nbInactiveTerms;
            return this;
        }

        public BlockBuilder nbActiveRegroupings(Integer nbActiveRegroupings) {
            this.nbActiveRegroupings = nbActiveRegroupings;
            return this;
        }

        public BlockBuilder nbInactiveRegroupings(Integer nbInactiveRegroupings) {
            this.nbInactiveRegroupings = nbInactiveRegroupings;
            return this;
        }

        public BlockBuilder dirigeants(List<Executive> dirigeants) {
            this.dirigeants = dirigeants;
            return this;
        }

        public Block build() {
            return new Block(this);
        }
    }
}

