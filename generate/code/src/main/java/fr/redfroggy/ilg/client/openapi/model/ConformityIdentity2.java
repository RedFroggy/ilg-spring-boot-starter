package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Address13;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ConformityIdentity2
 */

public class ConformityIdentity2   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("title")
  private String title;

  @JsonProperty("birthday")
  private LocalDate birthday;

  @JsonProperty("nationality")
  private String nationality;

  @JsonProperty("address")
  private Address13 address;

  @JsonProperty("position")
  private String position;

  @JsonProperty("quality")
  private String quality;

  @JsonProperty("share")
  private Float share;

  @JsonProperty("siren")
  private String siren;

  @JsonProperty("type")
  private String type;

  public ConformityIdentity2 id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Siren or LFI Entity ID or Exec Id
   * @return id
  */
  @ApiModelProperty(example = "1", value = "Siren or LFI Entity ID or Exec Id")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ConformityIdentity2 name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Full name of executives / shareholders / ubo OR company name
   * @return name
  */
  @ApiModelProperty(example = "M Jean PIERRE / Padaccor", value = "Full name of executives / shareholders / ubo OR company name")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ConformityIdentity2 firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * First name of executives
   * @return firstName
  */
  @ApiModelProperty(example = "Jean", value = "First name of executives")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public ConformityIdentity2 lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Last name of executives
   * @return lastName
  */
  @ApiModelProperty(example = "PIERRE", value = "Last name of executives")


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public ConformityIdentity2 title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of executives
   * @return title
  */
  @ApiModelProperty(example = "M/Mme", value = "Title of executives")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ConformityIdentity2 birthday(LocalDate birthday) {
    this.birthday = birthday;
    return this;
  }

  /**
   * Date of birth
   * @return birthday
  */
  @ApiModelProperty(example = "Thu Jan 01 00:00:00 GMT 1970", value = "Date of birth")

  @Valid

  public LocalDate getBirthday() {
    return birthday;
  }

  public void setBirthday(LocalDate birthday) {
    this.birthday = birthday;
  }

  public ConformityIdentity2 nationality(String nationality) {
    this.nationality = nationality;
    return this;
  }

  /**
   * Nationality
   * @return nationality
  */
  @ApiModelProperty(example = "FR", value = "Nationality")


  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public ConformityIdentity2 address(Address13 address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @ApiModelProperty(value = "")

  @Valid

  public Address13 getAddress() {
    return address;
  }

  public void setAddress(Address13 address) {
    this.address = address;
  }

  public ConformityIdentity2 position(String position) {
    this.position = position;
    return this;
  }

  /**
   * Executive's position
   * @return position
  */
  @ApiModelProperty(example = "Gérant", value = "Executive's position")


  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public ConformityIdentity2 quality(String quality) {
    this.quality = quality;
    return this;
  }

  /**
   * Ubo's position
   * @return quality
  */
  @ApiModelProperty(example = "Représentant légal / Actionnaire", value = "Ubo's position")


  public String getQuality() {
    return quality;
  }

  public void setQuality(String quality) {
    this.quality = quality;
  }

  public ConformityIdentity2 share(Float share) {
    this.share = share;
    return this;
  }

  /**
   * Share
   * @return share
  */
  @ApiModelProperty(example = "29.99", value = "Share")


  public Float getShare() {
    return share;
  }

  public void setShare(Float share) {
    this.share = share;
  }

  public ConformityIdentity2 siren(String siren) {
    this.siren = siren;
    return this;
  }

  /**
   * Company registration number
   * @return siren
  */
  @ApiModelProperty(example = "602036444", value = "Company registration number")


  public String getSiren() {
    return siren;
  }

  public void setSiren(String siren) {
    this.siren = siren;
  }

  public ConformityIdentity2 type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Person Type
   * @return type
  */
  @ApiModelProperty(example = "business/individual", value = "Person Type")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConformityIdentity2 conformityIdentity2 = (ConformityIdentity2) o;
    return Objects.equals(this.id, conformityIdentity2.id) &&
        Objects.equals(this.name, conformityIdentity2.name) &&
        Objects.equals(this.firstName, conformityIdentity2.firstName) &&
        Objects.equals(this.lastName, conformityIdentity2.lastName) &&
        Objects.equals(this.title, conformityIdentity2.title) &&
        Objects.equals(this.birthday, conformityIdentity2.birthday) &&
        Objects.equals(this.nationality, conformityIdentity2.nationality) &&
        Objects.equals(this.address, conformityIdentity2.address) &&
        Objects.equals(this.position, conformityIdentity2.position) &&
        Objects.equals(this.quality, conformityIdentity2.quality) &&
        Objects.equals(this.share, conformityIdentity2.share) &&
        Objects.equals(this.siren, conformityIdentity2.siren) &&
        Objects.equals(this.type, conformityIdentity2.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, firstName, lastName, title, birthday, nationality, address, position, quality, share, siren, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConformityIdentity2 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    share: ").append(toIndentedString(share)).append("\n");
    sb.append("    siren: ").append(toIndentedString(siren)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

