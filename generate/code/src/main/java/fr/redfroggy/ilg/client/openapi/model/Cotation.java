package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Cotation
 */

public class Cotation   {
  @JsonProperty("codeIsin")
  private String codeIsin;

  @JsonProperty("placeCotation")
  private String placeCotation;

  @JsonProperty("indices")
  @Valid
  private List<String> indices = null;

  public Cotation codeIsin(String codeIsin) {
    this.codeIsin = codeIsin;
    return this;
  }

  /**
   * ISIN Code of a company
   * @return codeIsin
  */
  @ApiModelProperty(example = "FR0000120271", value = "ISIN Code of a company")


  public String getCodeIsin() {
    return codeIsin;
  }

  public void setCodeIsin(String codeIsin) {
    this.codeIsin = codeIsin;
  }

  public Cotation placeCotation(String placeCotation) {
    this.placeCotation = placeCotation;
    return this;
  }

  /**
   * Exchange Market
   * @return placeCotation
  */
  @ApiModelProperty(example = "Euronext Paris, Brussels", value = "Exchange Market")


  public String getPlaceCotation() {
    return placeCotation;
  }

  public void setPlaceCotation(String placeCotation) {
    this.placeCotation = placeCotation;
  }

  public Cotation indices(List<String> indices) {
    this.indices = indices;
    return this;
  }

  public Cotation addIndicesItem(String indicesItem) {
    if (this.indices == null) {
      this.indices = new ArrayList<>();
    }
    this.indices.add(indicesItem);
    return this;
  }

  /**
   * Stock market index names
   * @return indices
  */
  @ApiModelProperty(value = "Stock market index names")


  public List<String> getIndices() {
    return indices;
  }

  public void setIndices(List<String> indices) {
    this.indices = indices;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cotation cotation = (Cotation) o;
    return Objects.equals(this.codeIsin, cotation.codeIsin) &&
        Objects.equals(this.placeCotation, cotation.placeCotation) &&
        Objects.equals(this.indices, cotation.indices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codeIsin, placeCotation, indices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cotation {\n");
    
    sb.append("    codeIsin: ").append(toIndentedString(codeIsin)).append("\n");
    sb.append("    placeCotation: ").append(toIndentedString(placeCotation)).append("\n");
    sb.append("    indices: ").append(toIndentedString(indices)).append("\n");
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

