/*
 * validateapi
 * The validation APIs help you validate data. Check if an E-mail address is real. Check if a domain is real. Check up on an IP address, and even where it is located. All this and much more is available in the validation API.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.cloudmersive.client;

import com.cloudmersive.client.invoker.ApiException;
import com.cloudmersive.client.model.CheckResponse;
import com.cloudmersive.client.model.ValidateUrlRequestFull;
import com.cloudmersive.client.model.ValidateUrlRequestSyntaxOnly;
import com.cloudmersive.client.model.ValidateUrlResponseFull;
import com.cloudmersive.client.model.ValidateUrlResponseSyntaxOnly;
import com.cloudmersive.client.model.WhoisResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DomainApi
 */
@Ignore
public class DomainApiTest {

    private final DomainApi api = new DomainApi();

    
    /**
     * Validate a domain name
     *
     * Check whether a domain name is valid or not.  API performs a live validation by contacting DNS services to validate the existence of the domain name.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void domainCheckTest() throws ApiException {
        String domain = null;
        CheckResponse response = api.domainCheck(domain);

        // TODO: test validations
    }
    
    /**
     * Get WHOIS information for a domain
     *
     * Validate whether a domain name exists, and also return the full WHOIS record for that domain name.  WHOIS records include all the registration details of the domain name, such as information about the domain&#39;s owners.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void domainPostTest() throws ApiException {
        String domain = null;
        WhoisResponse response = api.domainPost(domain);

        // TODO: test validations
    }
    
    /**
     * Validate a URL fully
     *
     * Validate whether a URL is syntactically valid (does not check endpoint for validity), whether it exists, and whether the endpoint is up and passes virus scan checks.  Accepts various types of input and produces a well-formed URL as output.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void domainUrlFullTest() throws ApiException {
        ValidateUrlRequestFull request = null;
        ValidateUrlResponseFull response = api.domainUrlFull(request);

        // TODO: test validations
    }
    
    /**
     * Validate a URL syntactically
     *
     * Validate whether a URL is syntactically valid (does not check endpoint for validity).  Accepts various types of input and produces a well-formed URL as output.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void domainUrlSyntaxOnlyTest() throws ApiException {
        ValidateUrlRequestSyntaxOnly request = null;
        ValidateUrlResponseSyntaxOnly response = api.domainUrlSyntaxOnly(request);

        // TODO: test validations
    }
    
}
