package com.me.testtask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class SolutionTest {
    @Test
    public void testNormalHuman() {
        String map = "STWSWTPPTPTTPWPP";
        String creatureName = "Human";
        int expected = 10;
        int actual = Solution.getResult(map, creatureName);
        assertEquals(expected, actual);
    }

    @Test
    public void testUnknownCreature() {
        String map = "STWSWTPPTPTTPWPP";
        String creatureName = "-_-_-_Crazy Fast Chupacabra_-_-_-";
        try {
            Solution.getResult(map, creatureName);
            fail();
        } catch (IllegalArgumentException ignored) {

        }
    }

    @Test
    public void testIncompleteMap() {
        String map = "STWSWT";
        String creatureName = "Human";
        try {
            Solution.getResult(map, creatureName);
            fail();
        } catch (IllegalArgumentException ignored) {

        }
    }

    @Test
    public void testUnknownLocationType() {
        String map = "SOWSOOPPTPTTPWPP";
        String creatureName = "Human";
        try {
            Solution.getResult(map, creatureName);
            fail();
        } catch (IllegalArgumentException ignored) {

        }
    }

    @Test
    public void testCreatureFromFile() {
        String map = "STWSWTPPTPTTPWPP";
        String creatureName = "Woodman";
        int expected = 12;
        int actual = Solution.getResult(map, creatureName);
        assertEquals(expected, actual);
    }

    @Test
    public void testHiddenPathFinding() {
        /*
        1115
        5535
        1555
        1111
         */
        String map = "PPPSSSTSPSSSPPPP";
        String creatureName = "Human";
        int expected = 10;
        int actual = Solution.getResult(map, creatureName);
        assertEquals(expected, actual);
    }

}