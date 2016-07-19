package com.lastmile.controller;

import com.lastmile.model.Ant;
import com.lastmile.model.AntContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

/**
 * Created by jan on 19/07/2016.
 */
@RestController
@EnableAutoConfiguration
public class RestControllerApp {

    private Random random = new Random();

    @Autowired
    private AntContainer antContainer;


    @RequestMapping(value = "/ants", method = RequestMethod.GET)
    public List<Ant> getAnts()
    {
        return antContainer.getAnts();
    }

    @RequestMapping(value = "/ants", method = RequestMethod.POST)
    public void damageAnts()
    {

        for(final Ant ant : antContainer.getAnts())
        {
            ant.damage(random.nextInt(80));
        }
    }

}


