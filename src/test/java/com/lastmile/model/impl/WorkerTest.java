package com.lastmile.model.impl;

import com.lastmile.model.Ant;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jan on 19/07/2016.
 */
public class WorkerTest {

    private Ant worker_1;
    private Ant worker_2;

    @Before
    public void init() {

        worker_1 = new Worker();
        worker_2 = new Worker();

        assertEquals(new Double(100d), worker_1.getAntStatus());
        assertEquals(new Double(100d), worker_1.getAntStatus());
    }

    @Test
    public void checkWorkerIsALiveTest() {

        worker_1.damage(50);
        assertEquals(new Double(50), worker_1.getAntStatus());
        assertFalse(worker_1.isAntDead());

        worker_2.damage(20);
        assertEquals(new Double(80), worker_2.getAntStatus());
        assertFalse(worker_2.isAntDead());

    }

    @Test
    public void checkWorkerIsNotAliveTest() {


        worker_1.damage(51);
        assertEquals(new Double(49), worker_1.getAntStatus());
        assertTrue(worker_1.isAntDead());


        worker_2.damage(51);
        assertEquals(new Double(49), worker_2.getAntStatus());
        assertTrue(worker_2.isAntDead());
    }



    @Test
    public void checkWorkerHealthStatusTest() {

        worker_1.damage(100);
        assertEquals(new Double(0), worker_1.getAntStatus());


        worker_1.damage(10);
        assertEquals(new Double(0), worker_1.getAntStatus());
    }

}