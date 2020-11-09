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
 * Role
 */

public class Role   {
  @JsonProperty("type")
  private String type;

  @JsonProperty("description")
  private String description;

  public Role type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Role type
   * @return type
  */
  @ApiModelProperty(example = "PR", value = "Role type")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Role description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Role description
   * @return description
  */
  @ApiModelProperty(example = "Principal", value = "Role description")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Role role = (Role) o;
    return Objects.equals(this.type, role.type) &&
        Objects.equals(this.description, role.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Role {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

