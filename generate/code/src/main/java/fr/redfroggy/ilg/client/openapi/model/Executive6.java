package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.ExecutiveFonction9;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Executive6
 */

public class Executive6   {
  @JsonProperty("civilite")
  private String civilite;

  @JsonProperty("name")
  private String name;

  @JsonProperty("firstname")
  private String firstname;

  @JsonProperty("type")
  private String type;

  @JsonProperty("maidenName")
  private String maidenName;

  @JsonProperty("siren")
  private String siren;

  @JsonProperty("fonction")
  private ExecutiveFonction9 fonction;

  public Executive6 civilite(String civilite) {
    this.civilite = civilite;
    return this;
  }

  /**
   * Executive title
   * @return civilite
  */
  @ApiModelProperty(example = "M", value = "Executive title")


  public String getCivilite() {
    return civilite;
  }

  public void setCivilite(String civilite) {
    this.civilite = civilite;
  }

  public Executive6 name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Executive Lastname
   * @return name
  */
  @ApiModelProperty(example = "Doe", value = "Executive Lastname")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Executive6 firstname(String firstname) {
    this.firstname = firstname;
    return this;
  }

  /**
   * Executive Firstname
   * @return firstname
  */
  @ApiModelProperty(example = "Jane", value = "Executive Firstname")


  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public Executive6 type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Executive type can be 'person', 'company' or 'family' (equivalent to person)
   * @return type
  */
  @ApiModelProperty(example = "person", value = "Executive type can be 'person', 'company' or 'family' (equivalent to person)")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Executive6 maidenName(String maidenName) {
    this.maidenName = maidenName;
    return this;
  }

  /**
   * Executive maiden name if available
   * @return maidenName
  */
  @ApiModelProperty(example = "Smith", value = "Executive maiden name if available")


  public String getMaidenName() {
    return maidenName;
  }

  public void setMaidenName(String maidenName) {
    this.maidenName = maidenName;
  }

  public Executive6 siren(String siren) {
    this.siren = siren;
    return this;
  }

  /**
   * Company Identifier if Executive is also a company, only available in France
   * @return siren
  */
  @ApiModelProperty(example = "0123456789", value = "Company Identifier if Executive is also a company, only available in France")


  public String getSiren() {
    return siren;
  }

  public void setSiren(String siren) {
    this.siren = siren;
  }

  public Executive6 fonction(ExecutiveFonction9 fonction) {
    this.fonction = fonction;
    return this;
  }

  /**
   * Get fonction
   * @return fonction
  */
  @ApiModelProperty(value = "")

  @Valid

  public ExecutiveFonction9 getFonction() {
    return fonction;
  }

  public void setFonction(ExecutiveFonction9 fonction) {
    this.fonction = fonction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Executive6 executive6 = (Executive6) o;
    return Objects.equals(this.civilite, executive6.civilite) &&
        Objects.equals(this.name, executive6.name) &&
        Objects.equals(this.firstname, executive6.firstname) &&
        Objects.equals(this.type, executive6.type) &&
        Objects.equals(this.maidenName, executive6.maidenName) &&
        Objects.equals(this.siren, executive6.siren) &&
        Objects.equals(this.fonction, executive6.fonction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(civilite, name, firstname, type, maidenName, siren, fonction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Executive6 {\n");
    
    sb.append("    civilite: ").append(toIndentedString(civilite)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    maidenName: ").append(toIndentedString(maidenName)).append("\n");
    sb.append("    siren: ").append(toIndentedString(siren)).append("\n");
    sb.append("    fonction: ").append(toIndentedString(fonction)).append("\n");
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

