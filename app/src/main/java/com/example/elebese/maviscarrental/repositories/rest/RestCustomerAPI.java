package com.example.elebese.maviscarrental.repositories.rest;


import com.example.elebese.maviscarrental.model.Customer;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


/**
 * Created by elebese on 2015/09/25.
 */
public class RestCustomerAPI implements com.example.elebese.maviscarrental.repositories.RestCustomerAPI{
    final String BASE_URL="http://carrental-ephraim.rhcloud.com";
    final HttpHeaders requestHeaders = RestMethods.getHeaders();
    final RestTemplate restTemplate = RestMethods.getRestTemplate();

    @Override
    public String addCustomer(Customer entity) {
        final String url = BASE_URL+"customers/";
        HttpEntity<Customer> requestEntity = new HttpEntity<Customer>(entity, requestHeaders);
        try {
            ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class);
            String result = responseEntity.getBody();
            return result;
        }catch (Exception e)
        {
            return "Exists";
        }
    }

}
