package com.lastmile.model.impl;

import com.lastmile.model.Ant;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jan on 19/07/2016.
 */
public class SoldierTest {

    private Ant soldier;

    @Before
    public void init() {

        soldier = new Soldier();

        assertEquals(new Double(100d), soldier.getAntStatus());
    }

    @Test
    public void checkSoldierIsALiveTest() {

        soldier.damage(34);
        assertEquals(new Double(66), soldier.getAntStatus());
        assertFalse(soldier.isAntDead());

    }

    @Test
    public void checSoldierIsNotAliveTest() {


        soldier.damage(35);
        assertEquals(new Double(65), soldier.getAntStatus());
        assertTrue(soldier.isAntDead());

    }



    @Test
    public void checkSoldierHealthStatusTest() {

        soldier.damage(100);
        assertEquals(new Double(0), soldier.getAntStatus());

        soldier.damage(10);
        assertEquals(new Double(0), soldier.getAntStatus());

    }

}