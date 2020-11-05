package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Site4;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SiteSearch
 */

public class SiteSearch   {
  @JsonProperty("sites")
  @Valid
  private List<Site4> sites = null;

  @JsonProperty("count")
  private Integer count;

  @JsonProperty("found")
  private Integer found;

  public SiteSearch sites(List<Site4> sites) {
    this.sites = sites;
    return this;
  }

  public SiteSearch addSitesItem(Site4 sitesItem) {
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

  public List<Site4> getSites() {
    return sites;
  }

  public void setSites(List<Site4> sites) {
    this.sites = sites;
  }

  public SiteSearch count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   * @return count
  */
  @ApiModelProperty(value = "")


  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public SiteSearch found(Integer found) {
    this.found = found;
    return this;
  }

  /**
   * Get found
   * @return found
  */
  @ApiModelProperty(value = "")


  public Integer getFound() {
    return found;
  }

  public void setFound(Integer found) {
    this.found = found;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SiteSearch siteSearch = (SiteSearch) o;
    return Objects.equals(this.sites, siteSearch.sites) &&
        Objects.equals(this.count, siteSearch.count) &&
        Objects.equals(this.found, siteSearch.found);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sites, count, found);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SiteSearch {\n");
    
    sb.append("    sites: ").append(toIndentedString(sites)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    found: ").append(toIndentedString(found)).append("\n");
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

