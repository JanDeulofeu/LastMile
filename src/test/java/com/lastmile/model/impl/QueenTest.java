package com.lastmile.model.impl;

import com.lastmile.model.Ant;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jan on 19/07/2016.
 */
public class QueenTest {

    private Ant queen;

    @Before
    public void init() {

        queen = new Queen();

        assertEquals(new Double(100d), queen.getAntStatus());
    }

    @Test
    public void checkQueenIsALiveTest() {

        queen.damage(80);
        assertEquals(new Double(20), queen.getAntStatus());
        assertFalse(queen.isAntDead());

    }

    @Test
    public void checkQueenIsNotAliveTest() {


        queen.damage(81);
        assertEquals(new Double(19), queen.getAntStatus());
        assertTrue(queen.isAntDead());

    }



    @Test
    public void checkQueenHealthStatusTest() {

        queen.damage(100);
        assertEquals(new Double(0), queen.getAntStatus());

        queen.damage(10);
        assertEquals(new Double(0), queen.getAntStatus());

    }

}