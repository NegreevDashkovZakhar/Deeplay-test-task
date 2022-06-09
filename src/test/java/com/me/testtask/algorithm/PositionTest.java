package com.me.testtask.algorithm;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PositionTest {
    private static final int DEFAULT_HORIZONTAL_POSITION = 1;
    private static final int DEFAULT_VERTICAL_POSITION = 2;
    private Position position;

    @BeforeEach
    void setUp() {
        position = new Position(DEFAULT_HORIZONTAL_POSITION, DEFAULT_VERTICAL_POSITION);
    }

    @Test
    public void testEquals() {
        Position argument = new Position(DEFAULT_HORIZONTAL_POSITION, DEFAULT_VERTICAL_POSITION);
        boolean expected = true;
        boolean actual = position.equals(argument);
        assertEquals(expected, actual);
    }

    @Test
    public void testNotEquals() {
        Position argument = new Position(DEFAULT_HORIZONTAL_POSITION + 1, DEFAULT_VERTICAL_POSITION);
        boolean expected = false;
        boolean actual = position.equals(argument);
        assertEquals(expected, actual);
    }

    @Test
    public void testMoveUp() {
        int expectedY = DEFAULT_VERTICAL_POSITION - 1;
        position.moveUp();
        int actualX = position.getX();
        int actualY = position.getY();
        assertEquals(DEFAULT_HORIZONTAL_POSITION, actualX);
        assertEquals(expectedY, actualY);
    }

    @Test
    public void testMoveDown() {
        int expectedY = DEFAULT_VERTICAL_POSITION + 1;
        position.moveDown();
        int actualX = position.getX();
        int actualY = position.getY();
        assertEquals(DEFAULT_HORIZONTAL_POSITION, actualX);
        assertEquals(expectedY, actualY);
    }

    @Test
    public void testMoveLeft() {
        int expectedX = DEFAULT_HORIZONTAL_POSITION - 1;
        position.moveLeft();
        int actualX = position.getX();
        int actualY = position.getY();
        assertEquals(expectedX, actualX);
        assertEquals(DEFAULT_VERTICAL_POSITION, actualY);
    }

    @Test
    public void testMoveRight() {
        int expectedX = DEFAULT_HORIZONTAL_POSITION + 1;
        position.moveRight();
        int actualX = position.getX();
        int actualY = position.getY();
        assertEquals(expectedX, actualX);
        assertEquals(DEFAULT_VERTICAL_POSITION, actualY);
    }
}