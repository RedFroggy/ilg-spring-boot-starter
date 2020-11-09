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
 * Identity6
 */

public class Identity6   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("registrationId")
  private String registrationId;

  @JsonProperty("name")
  private String name;

  public Identity6 id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Company Identifier
   * @return id
  */
  @ApiModelProperty(example = "0123456789", value = "Company Identifier")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Identity6 registrationId(String registrationId) {
    this.registrationId = registrationId;
    return this;
  }

  /**
   * Fiscal Registration Number
   * @return registrationId
  */
  @ApiModelProperty(example = "0123456789", value = "Fiscal Registration Number")


  public String getRegistrationId() {
    return registrationId;
  }

  public void setRegistrationId(String registrationId) {
    this.registrationId = registrationId;
  }

  public Identity6 name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Company name
   * @return name
  */
  @ApiModelProperty(example = "Great Company", value = "Company name")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Identity6 identity6 = (Identity6) o;
    return Objects.equals(this.id, identity6.id) &&
        Objects.equals(this.registrationId, identity6.registrationId) &&
        Objects.equals(this.name, identity6.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, registrationId, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Identity6 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    registrationId: ").append(toIndentedString(registrationId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

