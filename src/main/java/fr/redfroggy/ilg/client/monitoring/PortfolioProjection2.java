package fr.redfroggy.ilg.client.monitoring;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;

public interface PortfolioProjection2 {
    @ApiModelProperty(example = "2", value = "Portfolio's Id")
    Integer getId();

    @ApiModelProperty(example = "Créalerte Rhône", value = "Name of the portfolio")
    String getLabel();

    /**
     * Portfolio type : complex, normal…
     *
     * @return type
     */
    @ApiModelProperty(example = "1", value = "Portfolio type : complex, normal…")
    Integer getType();

    @ApiModelProperty(example = "2", value = "Type of alert (jurialerte, scorealerte…")
    AlertType getAlertType();

    @ApiModelProperty(value = "List of monitored item")
    @Valid
    PortfolioItemProjection2 getItem();

    @ApiModelProperty(example = "false", value = "this portfolio is editable")
    Boolean getEditable();
}
