package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Site5;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Sites
 */

public class Sites   {
  @JsonProperty("sites")
  @Valid
  private List<Site5> sites = null;

  public Sites sites(List<Site5> sites) {
    this.sites = sites;
    return this;
  }

  public Sites addSitesItem(Site5 sitesItem) {
    if (this.sites == null) {
      this.sites = new ArrayList<>();
    }
    this.sites.add(sitesItem);
    return this;
  }

  /**
   * 
   * @return sites
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Site5> getSites() {
    return sites;
  }

  public void setSites(List<Site5> sites) {
    this.sites = sites;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sites sites = (Sites) o;
    return Objects.equals(this.sites, sites.sites);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sites);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sites {\n");
    
    sb.append("    sites: ").append(toIndentedString(sites)).append("\n");
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

