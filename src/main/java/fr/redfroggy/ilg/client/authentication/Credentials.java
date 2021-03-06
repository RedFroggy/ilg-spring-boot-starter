/*
 * Webservices API
 * Endpoints documentation and sandbox
 *
 * OpenAPI spec version: 2.0.8
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package fr.redfroggy.ilg.client.authentication;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Credentials
 */
public class Credentials {

  private final String username;

  private final String password;

  public Credentials(@JsonProperty("_username") String username,
                     @JsonProperty("_password") String password) {
    this.username = username;
    this.password = password;
  }

   /**
   * Get username
   * @return username
  **/
   @JsonProperty("_username")
  public String getUsername() {
    return username;
  }

   /**
   * Get password
   * @return password
  **/
   @JsonProperty("_password")
  public String getPassword() {
    return password;
  }

}

