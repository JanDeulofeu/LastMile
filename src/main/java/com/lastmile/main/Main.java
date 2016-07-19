package com.lastmile.main;

import com.lastmile.controller.RestControllerApp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/**
 * Created by jan on 19/07/2016.
 */
@EnableAutoConfiguration
public class Main {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(RestControllerApp.class, args);
    }
}
