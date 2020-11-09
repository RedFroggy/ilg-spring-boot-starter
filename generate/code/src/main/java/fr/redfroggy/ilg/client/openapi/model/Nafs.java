package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.CodeLabelPair4;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Nafs
 */

public class Nafs   {
  @JsonProperty("nafs")
  @Valid
  private List<CodeLabelPair4> nafs = null;

  @JsonProperty("count")
  private Integer count;

  public Nafs nafs(List<CodeLabelPair4> nafs) {
    this.nafs = nafs;
    return this;
  }

  public Nafs addNafsItem(CodeLabelPair4 nafsItem) {
    if (this.nafs == null) {
      this.nafs = new ArrayList<>();
    }
    this.nafs.add(nafsItem);
    return this;
  }

  /**
   * List of activity code
   * @return nafs
  */
  @ApiModelProperty(value = "List of activity code")

  @Valid

  public List<CodeLabelPair4> getNafs() {
    return nafs;
  }

  public void setNafs(List<CodeLabelPair4> nafs) {
    this.nafs = nafs;
  }

  public Nafs count(Integer count) {
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
    Nafs nafs = (Nafs) o;
    return Objects.equals(this.nafs, nafs.nafs) &&
        Objects.equals(this.count, nafs.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nafs, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Nafs {\n");
    
    sb.append("    nafs: ").append(toIndentedString(nafs)).append("\n");
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

