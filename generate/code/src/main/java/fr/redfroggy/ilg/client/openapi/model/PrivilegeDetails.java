package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.PrivilegeDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PrivilegeDetails
 */

public class PrivilegeDetails   {
  @JsonProperty("privilegeDetails")
  @Valid
  private List<PrivilegeDetail> privilegeDetails = null;

  @JsonProperty("count")
  private Integer count;

  public PrivilegeDetails privilegeDetails(List<PrivilegeDetail> privilegeDetails) {
    this.privilegeDetails = privilegeDetails;
    return this;
  }

  public PrivilegeDetails addPrivilegeDetailsItem(PrivilegeDetail privilegeDetailsItem) {
    if (this.privilegeDetails == null) {
      this.privilegeDetails = new ArrayList<>();
    }
    this.privilegeDetails.add(privilegeDetailsItem);
    return this;
  }

  /**
   * List of privilege details
   * @return privilegeDetails
  */
  @ApiModelProperty(value = "List of privilege details")

  @Valid

  public List<PrivilegeDetail> getPrivilegeDetails() {
    return privilegeDetails;
  }

  public void setPrivilegeDetails(List<PrivilegeDetail> privilegeDetails) {
    this.privilegeDetails = privilegeDetails;
  }

  public PrivilegeDetails count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Number of elements
   * @return count
  */
  @ApiModelProperty(example = "1", value = "Number of elements")


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
    PrivilegeDetails privilegeDetails = (PrivilegeDetails) o;
    return Objects.equals(this.privilegeDetails, privilegeDetails.privilegeDetails) &&
        Objects.equals(this.count, privilegeDetails.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privilegeDetails, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrivilegeDetails {\n");
    
    sb.append("    privilegeDetails: ").append(toIndentedString(privilegeDetails)).append("\n");
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

