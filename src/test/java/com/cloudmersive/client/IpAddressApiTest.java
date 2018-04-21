/*
 * validateapi
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
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
import com.cloudmersive.client.model.GeolocateResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IpAddressApi
 */
@Ignore
public class IpAddressApiTest {

    private final IpAddressApi api = new IpAddressApi();

    
    /**
     * Geolocate an IP address
     *
     * Identify an IP address Country, State/Provence, City, Zip/Postal Code, etc.  Useful for security and UX applications.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void iPAddressPostTest() throws ApiException {
        String value = null;
        GeolocateResponse response = api.iPAddressPost(value);

        // TODO: test validations
    }
    
}
