package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Address5;
import fr.redfroggy.ilg.client.openapi.model.Term;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Executive4
 */

public class Executive4   {
  @JsonProperty("exec_id")
  private Integer execId;

  @JsonProperty("civilite")
  private String civilite;

  @JsonProperty("name")
  private String name;

  @JsonProperty("firstname")
  private String firstname;

  @JsonProperty("maidenName")
  private String maidenName;

  @JsonProperty("siren")
  private String siren;

  @JsonProperty("address")
  private Address5 address;

  @JsonProperty("birthday")
  private LocalDate birthday;

  @JsonProperty("birthPlace")
  private Address5 birthPlace;

  @JsonProperty("nationalityCode")
  private String nationalityCode;

  @JsonProperty("terms")
  @Valid
  private List<Term> terms = null;

  public Executive4 execId(Integer execId) {
    this.execId = execId;
    return this;
  }

  /**
   * Executive Identifier
   * @return execId
  */
  @ApiModelProperty(example = "1", value = "Executive Identifier")


  public Integer getExecId() {
    return execId;
  }

  public void setExecId(Integer execId) {
    this.execId = execId;
  }

  public Executive4 civilite(String civilite) {
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

  public Executive4 name(String name) {
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

  public Executive4 firstname(String firstname) {
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

  public Executive4 maidenName(String maidenName) {
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

  public Executive4 siren(String siren) {
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

  public Executive4 address(Address5 address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @ApiModelProperty(value = "")

  @Valid

  public Address5 getAddress() {
    return address;
  }

  public void setAddress(Address5 address) {
    this.address = address;
  }

  public Executive4 birthday(LocalDate birthday) {
    this.birthday = birthday;
    return this;
  }

  /**
   * Executive birthday, only available for a person
   * @return birthday
  */
  @ApiModelProperty(value = "Executive birthday, only available for a person")

  @Valid

  public LocalDate getBirthday() {
    return birthday;
  }

  public void setBirthday(LocalDate birthday) {
    this.birthday = birthday;
  }

  public Executive4 birthPlace(Address5 birthPlace) {
    this.birthPlace = birthPlace;
    return this;
  }

  /**
   * Get birthPlace
   * @return birthPlace
  */
  @ApiModelProperty(value = "")

  @Valid

  public Address5 getBirthPlace() {
    return birthPlace;
  }

  public void setBirthPlace(Address5 birthPlace) {
    this.birthPlace = birthPlace;
  }

  public Executive4 nationalityCode(String nationalityCode) {
    this.nationalityCode = nationalityCode;
    return this;
  }

  /**
   * Executive nationality code (ISO 3166-2)
   * @return nationalityCode
  */
  @ApiModelProperty(example = "FR", value = "Executive nationality code (ISO 3166-2)")


  public String getNationalityCode() {
    return nationalityCode;
  }

  public void setNationalityCode(String nationalityCode) {
    this.nationalityCode = nationalityCode;
  }

  public Executive4 terms(List<Term> terms) {
    this.terms = terms;
    return this;
  }

  public Executive4 addTermsItem(Term termsItem) {
    if (this.terms == null) {
      this.terms = new ArrayList<>();
    }
    this.terms.add(termsItem);
    return this;
  }

  /**
   * List of terms
   * @return terms
  */
  @ApiModelProperty(value = "List of terms")

  @Valid

  public List<Term> getTerms() {
    return terms;
  }

  public void setTerms(List<Term> terms) {
    this.terms = terms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Executive4 executive4 = (Executive4) o;
    return Objects.equals(this.execId, executive4.execId) &&
        Objects.equals(this.civilite, executive4.civilite) &&
        Objects.equals(this.name, executive4.name) &&
        Objects.equals(this.firstname, executive4.firstname) &&
        Objects.equals(this.maidenName, executive4.maidenName) &&
        Objects.equals(this.siren, executive4.siren) &&
        Objects.equals(this.address, executive4.address) &&
        Objects.equals(this.birthday, executive4.birthday) &&
        Objects.equals(this.birthPlace, executive4.birthPlace) &&
        Objects.equals(this.nationalityCode, executive4.nationalityCode) &&
        Objects.equals(this.terms, executive4.terms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(execId, civilite, name, firstname, maidenName, siren, address, birthday, birthPlace, nationalityCode, terms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Executive4 {\n");
    
    sb.append("    execId: ").append(toIndentedString(execId)).append("\n");
    sb.append("    civilite: ").append(toIndentedString(civilite)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    maidenName: ").append(toIndentedString(maidenName)).append("\n");
    sb.append("    siren: ").append(toIndentedString(siren)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
    sb.append("    birthPlace: ").append(toIndentedString(birthPlace)).append("\n");
    sb.append("    nationalityCode: ").append(toIndentedString(nationalityCode)).append("\n");
    sb.append("    terms: ").append(toIndentedString(terms)).append("\n");
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

