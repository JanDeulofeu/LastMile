package com.lastmile.model.impl;

import com.lastmile.model.Ant;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jan on 19/07/2016.
 */
public class WorkerTest {

    private Ant worker;

    @Before
    public void init() {

        worker = new Worker();

        assertEquals(new Double(100d), worker.getAntStatus());
    }

    @Test
    public void checkWorkerIsALiveTest() {

        worker.damage(50);
        assertEquals(new Double(50), worker.getAntStatus());
        assertFalse(worker.isAntDead());

    }

    @Test
    public void checkWorkerIsNotAliveTest() {


        worker.damage(51);
        assertEquals(new Double(49), worker.getAntStatus());
        assertTrue(worker.isAntDead());
    }



    @Test
    public void checkWorkerHealthStatusTest() {

        worker.damage(100);
        assertEquals(new Double(0), worker.getAntStatus());

        worker.damage(10);
        assertEquals(new Double(0), worker.getAntStatus());

    }

}