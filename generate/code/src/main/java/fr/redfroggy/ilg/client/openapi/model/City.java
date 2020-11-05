package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.CodeLabelPair2;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * City
 */

public class City   {
  @JsonProperty("cities")
  @Valid
  private List<CodeLabelPair2> cities = null;

  @JsonProperty("count")
  private Integer count;

  public City cities(List<CodeLabelPair2> cities) {
    this.cities = cities;
    return this;
  }

  public City addCitiesItem(CodeLabelPair2 citiesItem) {
    if (this.cities == null) {
      this.cities = new ArrayList<>();
    }
    this.cities.add(citiesItem);
    return this;
  }

  /**
   * List of activity code
   * @return cities
  */
  @ApiModelProperty(value = "List of activity code")

  @Valid

  public List<CodeLabelPair2> getCities() {
    return cities;
  }

  public void setCities(List<CodeLabelPair2> cities) {
    this.cities = cities;
  }

  public City count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   * @return count
  */
  @ApiModelProperty(value = "")


  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    City city = (City) o;
    return Objects.equals(this.cities, city.cities) &&
        Objects.equals(this.count, city.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cities, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class City {\n");
    
    sb.append("    cities: ").append(toIndentedString(cities)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

