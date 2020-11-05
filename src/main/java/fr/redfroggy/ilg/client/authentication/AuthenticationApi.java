package fr.redfroggy.ilg.client.authentication;


import fr.redfroggy.ilg.client.IlgApi;
import javax.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

public interface AuthenticationApi extends IlgApi {

    /**
     * POST /login_check : Authenticate user and retrieve a token valid for 15 min, working with Content-Type multipart/form-data and x-www-form-urlencoded
     *
     * @param username Your login (required)
     * @param password Your password (required)
     * @return  (status code 200)
     *         or Bad credentials (status code 401)
     */
    @PostMapping(value = "/login_check",
        produces = "*/*",
        consumes = "multipart/form-data")
    ResponseEntity<AuthenticationJwt> loginCheck(
            @RequestParam(value = "_username") String username,
            @RequestParam(value = "_password") String password);

    /**
     * POST /login_json : Authenticate user and retrieve a token valid for 15 min, working with Content-Type application/json
     *
     * @param credentials  (optional)
     * @return  (status code 200)
     *         or Bad credentials (status code 401)
     */
    @PostMapping(value = "/login_json",
        produces = "*/*", 
        consumes = "application/json")
    ResponseEntity<AuthenticationJwt> login(@Valid @RequestBody(required = false) Credentials credentials);


    /**
     * POST /refresh : Renew token, working with Content-Type multipart/form-data and x-www-form-urlencoded
     * Give you another token/refresh_token couple, this endpoint needs an authentication token
     *
     * @param authorization Bearer {Expired JWT} (required)
     * @param refreshToken Your refresh token (required)
     * @return  (status code 200)
     *         or Bad credentials (status code 401)
     */
    @PostMapping(value = "/refresh",
        produces = "*/*", 
        consumes = "multipart/form-data")
    ResponseEntity<AuthenticationJwt> refresh(
            @RequestHeader(value = "Authorization") String authorization,
            @RequestParam(value = "refresh_token") String refreshToken);

}
