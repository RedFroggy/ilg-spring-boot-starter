package fr.redfroggy.ilg.client.monitoring;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * Customer
 */

public class Customer {

    private final Integer id;

    private final String label;

    private final String customerCode;

    public Customer(@JsonProperty("id") Integer id,
                    @JsonProperty("label") String label,
                    @JsonProperty("customerCode") String customerCode) {
        this.id = id;
        this.label = label;
        this.customerCode = customerCode;
    }

    /**
     * Customer's Id
     *
     * @return id
     */
    @ApiModelProperty(example = "2", value = "Customer's Id")
    public Integer getId() {
        return id;
    }

    /**
     * Name of the Customer
     *
     * @return label
     */
    @ApiModelProperty(example = "INFOLEGALE", value = "Name of the Customer")
    public String getLabel() {
        return label;
    }

    /**
     * Customer code
     *
     * @return customerCode
     */
    @ApiModelProperty(example = "1", value = "Customer code")
    public String getCustomerCode() {
        return customerCode;
    }
}

