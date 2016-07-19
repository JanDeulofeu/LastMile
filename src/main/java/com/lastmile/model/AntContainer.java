package com.lastmile.model;

import com.lastmile.model.impl.Queen;
import com.lastmile.model.impl.Soldier;
import com.lastmile.model.impl.Worker;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jan on 19/07/2016.
 */
@Component
public class AntContainer {

    private final static int COUNTER = 10;

    private List<Ant> ants = new ArrayList<>();

    public AntContainer() {

        initQueens();
        initWorkers();
        initSoldiers();
    }

    private void initQueens() {
        for (int i = 0; i < COUNTER; i++) {
            ants.add(new Queen());
        }
    }

    private void initWorkers() {
        for (int i = 0; i < COUNTER; i++) {
            ants.add(new Worker());
        }
    }

    private void initSoldiers() {

        for (int i = 0; i < COUNTER; i++) {
            ants.add(new Soldier());
        }
    }

    public List<Ant> getAnts() {
        return ants;
    }

}
