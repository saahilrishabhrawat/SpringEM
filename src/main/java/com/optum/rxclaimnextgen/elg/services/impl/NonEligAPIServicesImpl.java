package com.optum.rxclaimnextgen.elg.services.impl;

import java.util.Collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.optum.rxclaimnextgen.elg.services.NonEligAPIServices;

@Service
public class NonEligAPIServicesImpl implements NonEligAPIServices  {

	private static final Logger LOG = LoggerFactory.getLogger(NonEligAPIServicesImpl.class);

	/* ***************** Non-eligibility database service urls **********/
	@Value("${bk1.baseurl}")
	private String bk1BaseUrl;

	@Value("${bk2.baseurl}")
	private String bk2BaseUrl;

	@Value("${d1-qa.baseurl}")
	private String d1qaBaseUrl;

	/**
	 * This calls the non-eligibility data "microservice"
	 * 
	 * @param platformId - platform id
	 * @param api        - api and params for the service you want to call
	 * @return string containing JSON payload
	 */
	public String callNonEligDataService(String platformId, String api) throws Exception {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);

		String endpointUrl;

		switch (platformId.toUpperCase()) {
		case "BK1": {
			endpointUrl = bk1BaseUrl + api;
			break;
		}
		case "BK2": {
			endpointUrl = bk2BaseUrl + api;
			break;
		}
		case "D1-QA": {
			endpointUrl = d1qaBaseUrl + api;
			break;
		}
		default:
			throw new RuntimeException("Invalid platform specified to calling service: " + platformId);
		}
		LOG.debug("?????????????????endpointUrl=" + endpointUrl);
		// Call database service with a GET request
		ResponseEntity response = null;
		String results = null;
		try {
			response = restTemplate.getForEntity(endpointUrl, String.class);
			results = (String) response.getBody();
		} catch (RestClientException e) {
			if (response == null || response.getStatusCode().is4xxClientError()) {
				// if they get a 404, then the data is not found, so just send back a null
				return null;
			}
		}
		LOG.debug(">>> result=" + results);
		return results;

	}

}
