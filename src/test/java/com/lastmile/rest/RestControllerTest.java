package com.lastmile.rest;

import com.lastmile.ConfigurationApp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by jan on 19/07/2016.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(ConfigurationApp.class)
@WebAppConfiguration
@IntegrationTest("server.port:8080")
public class RestControllerTest {

    private final static String HOST = "http://localhost:8080/ants";
    RestTemplate restTemplate = new RestTemplate();

    @Test
    public void getAntsRestTest() {


        ResponseEntity<Object[]> responseEntity = restTemplate.getForEntity(HOST, Object[].class);
        Object[] objects = responseEntity.getBody();

        assertNotNull(objects);
        assertTrue(objects.length > 0);
    }

    @Test
    public void postAntsDamageTest() {

        ResponseEntity<Object[]> responseEntity = restTemplate.getForEntity(HOST, Object[].class);
        Object[] objectsInit = responseEntity.getBody();

        HttpEntity<String> request = new HttpEntity<>("");

        restTemplate.postForObject(HOST, request, String.class);

        responseEntity = restTemplate.getForEntity(HOST, Object[].class);
        Object[] objectsEnd = responseEntity.getBody();


        assertNotEquals(objectsInit,objectsEnd );
    }

}
