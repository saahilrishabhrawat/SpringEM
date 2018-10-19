package com.optum.rxclaimnextgen.elg.controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.tomcat.util.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;


/**
 * Created by bkocinsk on 5/22/2018.
 */
@RestController
public class AuthController {
    private static final Logger LOG = LoggerFactory.getLogger(AuthController.class);
    private static final String OAUTH_TOKENURL = "https://ssoiamcorp-nonprod.uhg.com/as/";

    @GetMapping("/logininternal")
    @ResponseBody
    public String authenticateUserGet(@RequestParam("code") String code) {
        LOG.debug(">>>> in authenticateUserGet code=" + code);
        if (code == null || code.isEmpty()) {
            return "code is missing";
        }

        //request the access token
        String clientId = "Dev_Rxclaim_Modern";
        String clientSecret = "Rxclaim@123";
        String authString = clientId + ":" + clientSecret;
        byte[] authEncBytes = Base64.encodeBase64(authString.getBytes());
        String authStringEnc = new String(authEncBytes);

        HttpHeaders headers = new HttpHeaders();
        String authHeader = "Basic " + authStringEnc;
        headers.set("Authorization", authHeader);
        headers.setContentType(MediaType.valueOf("application/x-www-form-urlencoded"));

        HttpEntity entity = new HttpEntity(headers);

        String url = OAUTH_TOKENURL + "token.oauth2?grant_type=authorization_code&redirect_uri=http://rxclaimnextgensvc-rxclaimeligmoderndev.ocp-ctc-core-nonprod.optum.com/logininternal&code=" + code;
        LOG.debug(url);
        //executing the GET call
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, entity, String.class);

        //validate the access token
        ObjectMapper m = new ObjectMapper();
        String accessToken = null;
        String idToken = null;
        String decodedIdToken = null;
        try {
            JsonNode tree = m.readTree(response.getBody());
            accessToken = tree.path("access_token").textValue();
            LOG.debug("accessToken=" + accessToken);
            idToken = tree.path("id_token").textValue();
            LOG.debug("idToken=" + idToken);
            byte[] decodedValue = Base64.decodeBase64(idToken);
            decodedIdToken =  new String(decodedValue);
            LOG.debug("????????????????????????????????????");
            LOG.debug(decodedIdToken);
            LOG.debug("????????????????????????????????????");
        }
        catch(IOException e) {
            e.printStackTrace();
            LOG.error("Can't read json object");
        }
        String validateUrl = OAUTH_TOKENURL + "introspect.oauth2?grant_type=urn:pingidentity.com:oauth2:grant_type:validate_bearer&token=" + accessToken;
        LOG.debug(validateUrl);
        //executing the GET call
        restTemplate = new RestTemplate();
        HttpEntity<String> validateResponse = restTemplate.exchange(validateUrl, HttpMethod.POST, entity, String.class);

        LOG.debug(validateResponse.toString());

      
        ObjectMapper mapper = new ObjectMapper();
        String validatedToken = null;
       
        try {
            JsonNode tree = mapper.readTree(validateResponse.getBody());
            validatedToken = tree.path("pi.sri").textValue();
            if (validatedToken != null && !validatedToken.isEmpty()) {
                byte[] decodedValue = Base64.decodeBase64(validatedToken);
                String decodedToken =  new String(decodedValue);
                LOG.debug("????????????????????????????????????");
                LOG.debug(decodedToken);
                LOG.debug("????????????????????????????????????");
            }

        }
        catch(IOException e) {
            e.printStackTrace();
            LOG.error("Can't read json object");
        }

        //return validateResponse.getBody();
        return decodedIdToken;
    }

    @PostMapping("/logininternal")
    @ResponseBody
    public Object authenticateUserPost(@RequestBody String loginPayload) {
        LOG.debug(">>>> in authenticateUserPost");
        LOG.debug(loginPayload);
        return loginPayload;
    }
}
