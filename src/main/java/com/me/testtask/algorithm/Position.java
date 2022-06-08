package com.me.testtask.algorithm;

import java.util.Objects;

/**
 * Class representing position on a 2d plane
 */
public class Position implements Cloneable {
    private int x;
    private int y;

    /**
     * Constructor initializing position from horizontal and vertical positions
     *
     * @param x horizontal position
     * @param y vertical position
     */
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return x == position.x && y == position.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public Position clone() {
        try {
            Position clone = (Position) super.clone();
            clone.x = this.x;
            clone.y = this.y;
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    /**
     * Method moving decrementing vertical position
     */
    public void moveUp() {
        y--;
    }

    /**
     * Method incrementing vertical position
     */
    public void moveDown() {
        y++;
    }

    /**
     * Method decrementing horizontal position
     */
    public void moveLeft() {
        x--;
    }

    /**
     * Method incrementing horizontal position
     */
    public void moveRight() {
        x++;
    }
}
