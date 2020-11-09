package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.ActivityModel3;
import fr.redfroggy.ilg.client.openapi.model.LegalFormModel3;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Identity4
 */

public class Identity4   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("registrationId")
  private String registrationId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("legalForm")
  private LegalFormModel3 legalForm;

  @JsonProperty("activity")
  private ActivityModel3 activity;

  public Identity4 id(String id) {
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

  public Identity4 registrationId(String registrationId) {
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

  public Identity4 name(String name) {
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

  public Identity4 legalForm(LegalFormModel3 legalForm) {
    this.legalForm = legalForm;
    return this;
  }

  /**
   * Get legalForm
   * @return legalForm
  */
  @ApiModelProperty(value = "")

  @Valid

  public LegalFormModel3 getLegalForm() {
    return legalForm;
  }

  public void setLegalForm(LegalFormModel3 legalForm) {
    this.legalForm = legalForm;
  }

  public Identity4 activity(ActivityModel3 activity) {
    this.activity = activity;
    return this;
  }

  /**
   * Get activity
   * @return activity
  */
  @ApiModelProperty(value = "")

  @Valid

  public ActivityModel3 getActivity() {
    return activity;
  }

  public void setActivity(ActivityModel3 activity) {
    this.activity = activity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Identity4 identity4 = (Identity4) o;
    return Objects.equals(this.id, identity4.id) &&
        Objects.equals(this.registrationId, identity4.registrationId) &&
        Objects.equals(this.name, identity4.name) &&
        Objects.equals(this.legalForm, identity4.legalForm) &&
        Objects.equals(this.activity, identity4.activity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, registrationId, name, legalForm, activity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Identity4 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    registrationId: ").append(toIndentedString(registrationId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    legalForm: ").append(toIndentedString(legalForm)).append("\n");
    sb.append("    activity: ").append(toIndentedString(activity)).append("\n");
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

