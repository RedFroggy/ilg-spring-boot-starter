package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PortfolioItem
 */

public class PortfolioItem   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("siren")
  private Integer siren;

  @JsonProperty("customCode")
  private String customCode;

  @JsonProperty("customCredit")
  private Integer customCredit;

  public PortfolioItem id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * id
   * @return id
  */
  @ApiModelProperty(example = "2588955", value = "id")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public PortfolioItem siren(Integer siren) {
    this.siren = siren;
    return this;
  }

  /**
   * siren
   * @return siren
  */
  @ApiModelProperty(example = "258899555", value = "siren")


  public Integer getSiren() {
    return siren;
  }

  public void setSiren(Integer siren) {
    this.siren = siren;
  }

  public PortfolioItem customCode(String customCode) {
    this.customCode = customCode;
    return this;
  }

  /**
   * Reference of the item
   * @return customCode
  */
  @ApiModelProperty(example = "SXXCCS", value = "Reference of the item")


  public String getCustomCode() {
    return customCode;
  }

  public void setCustomCode(String customCode) {
    this.customCode = customCode;
  }

  public PortfolioItem customCredit(Integer customCredit) {
    this.customCredit = customCredit;
    return this;
  }

  /**
   * Custom credit of the item
   * @return customCredit
  */
  @ApiModelProperty(example = "1000", value = "Custom credit of the item")


  public Integer getCustomCredit() {
    return customCredit;
  }

  public void setCustomCredit(Integer customCredit) {
    this.customCredit = customCredit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortfolioItem portfolioItem = (PortfolioItem) o;
    return Objects.equals(this.id, portfolioItem.id) &&
        Objects.equals(this.siren, portfolioItem.siren) &&
        Objects.equals(this.customCode, portfolioItem.customCode) &&
        Objects.equals(this.customCredit, portfolioItem.customCredit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, siren, customCode, customCredit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortfolioItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    siren: ").append(toIndentedString(siren)).append("\n");
    sb.append("    customCode: ").append(toIndentedString(customCode)).append("\n");
    sb.append("    customCredit: ").append(toIndentedString(customCredit)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

