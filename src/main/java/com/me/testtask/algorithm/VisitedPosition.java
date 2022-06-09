package com.me.testtask.algorithm;

/**
 * Class representing position on a 2d plane with specified distance from the beginning point.
 * Used in A* path finding algorithm.
 */
public class VisitedPosition {
    private final Position position;
    private final int distance;

    /**
     * Constructor initializing position from horizontal and vertical positions
     *
     * @param x        horizontal position
     * @param y        vertical position
     * @param distance distance from the beginning point
     */
    public VisitedPosition(int x, int y, int distance) {
        this.position = new Position(x, y);
        this.distance = distance;
    }

    /**
     * Constructor setting position as given. Does not copy it.
     *
     * @param position defined position
     * @param distance distance from the beginning point
     */
    public VisitedPosition(Position position, int distance) {
        this.position = position;
        this.distance = distance;
    }

    public int getX() {
        return position.getX();
    }

    public int getY() {
        return position.getY();
    }

    public int getDistance() {
        return distance;
    }

    public Position getPosition() {
        return position;
    }
}
