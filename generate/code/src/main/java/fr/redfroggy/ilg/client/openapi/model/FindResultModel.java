package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Company3;
import fr.redfroggy.ilg.client.openapi.model.Site3;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FindResultModel
 */

public class FindResultModel   {
  @JsonProperty("company")
  private Company3 company;

  @JsonProperty("site")
  private Site3 site;

  public FindResultModel company(Company3 company) {
    this.company = company;
    return this;
  }

  /**
   * Get company
   * @return company
  */
  @ApiModelProperty(value = "")

  @Valid

  public Company3 getCompany() {
    return company;
  }

  public void setCompany(Company3 company) {
    this.company = company;
  }

  public FindResultModel site(Site3 site) {
    this.site = site;
    return this;
  }

  /**
   * Get site
   * @return site
  */
  @ApiModelProperty(value = "")

  @Valid

  public Site3 getSite() {
    return site;
  }

  public void setSite(Site3 site) {
    this.site = site;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FindResultModel findResultModel = (FindResultModel) o;
    return Objects.equals(this.company, findResultModel.company) &&
        Objects.equals(this.site, findResultModel.site);
  }

  @Override
  public int hashCode() {
    return Objects.hash(company, site);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FindResultModel {\n");
    
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
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

