package fr.redfroggy.ilg.client.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.redfroggy.ilg.client.openapi.model.Identity2;
import fr.redfroggy.ilg.client.openapi.model.Score2;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Company2
 */

public class Company2   {
  @JsonProperty("identity")
  private Identity2 identity;

  @JsonProperty("score")
  private Score2 score;

  public Company2 identity(Identity2 identity) {
    this.identity = identity;
    return this;
  }

  /**
   * Get identity
   * @return identity
  */
  @ApiModelProperty(value = "")

  @Valid

  public Identity2 getIdentity() {
    return identity;
  }

  public void setIdentity(Identity2 identity) {
    this.identity = identity;
  }

  public Company2 score(Score2 score) {
    this.score = score;
    return this;
  }

  /**
   * Get score
   * @return score
  */
  @ApiModelProperty(value = "")

  @Valid

  public Score2 getScore() {
    return score;
  }

  public void setScore(Score2 score) {
    this.score = score;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Company2 company2 = (Company2) o;
    return Objects.equals(this.identity, company2.identity) &&
        Objects.equals(this.score, company2.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identity, score);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Company2 {\n");
    
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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

