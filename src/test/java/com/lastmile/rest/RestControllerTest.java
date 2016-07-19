package com.lastmile.rest;

import com.lastmile.ConfigurationApp;
import com.lastmile.model.Ant;
import com.sun.tools.javac.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

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
    public void getAntsRestTest()
    {

        List<Ant> ants = (List)restTemplate.getForObject(HOST,List.class);

        System.out.println(ants);
    }
}
