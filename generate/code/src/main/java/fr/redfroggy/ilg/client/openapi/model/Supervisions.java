package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Supervision;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Supervisions
 */

public class Supervisions   {
  @JsonProperty("supervisions")
  @Valid
  private List<Supervision> supervisions = null;

  @JsonProperty("count")
  private Integer count;

  public Supervisions supervisions(List<Supervision> supervisions) {
    this.supervisions = supervisions;
    return this;
  }

  public Supervisions addSupervisionsItem(Supervision supervisionsItem) {
    if (this.supervisions == null) {
      this.supervisions = new ArrayList<>();
    }
    this.supervisions.add(supervisionsItem);
    return this;
  }

  /**
   * List of Supervision
   * @return supervisions
  */
  @ApiModelProperty(value = "List of Supervision")

  @Valid

  public List<Supervision> getSupervisions() {
    return supervisions;
  }

  public void setSupervisions(List<Supervision> supervisions) {
    this.supervisions = supervisions;
  }

  public Supervisions count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Number of supervision
   * @return count
  */
  @ApiModelProperty(example = "2", value = "Number of supervision")


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
    Supervisions supervisions = (Supervisions) o;
    return Objects.equals(this.supervisions, supervisions.supervisions) &&
        Objects.equals(this.count, supervisions.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supervisions, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Supervisions {\n");
    
    sb.append("    supervisions: ").append(toIndentedString(supervisions)).append("\n");
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

