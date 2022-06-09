package com.me.testtask.algorithm;

import com.me.testtask.algorithm.exception.UnknownFieldNameException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Class finding the closest path from top left corner of the map to bottom right.
 * Uses A* algorithm
 */
public class PathFindingAlgorithm {
    private static final Position END_POSITION = new Position(3, 3);
    private List<VisitedPosition> currentPositions;
    private List<Position> usedPositions;
    private final Map<Character, Integer> walkingTimeMap;
    private final String[] map;

    /**
     * Constructor setting arguments for path finding algorithm to use
     *
     * @param map            map where the path should be found
     * @param walkingTimeMap map with cost of movement on any position on the map
     */
    public PathFindingAlgorithm(String[] map, Map<Character, Integer> walkingTimeMap) {
        this.walkingTimeMap = walkingTimeMap;
        this.map = map;
    }

    /**
     * Method calculating smallest path from top left corner to bottom right using A* algorithm
     *
     * @return the cost of moving from top left corner to bottom right corner of the map
     */
    public int getPathLength() throws UnknownFieldNameException {
        //already visited positions
        this.usedPositions = new ArrayList<>();
        //positions that are used to expand search span. Hold cost spent from the top left corner
        this.currentPositions = new ArrayList<>();
        currentPositions.add(new VisitedPosition(0, 0, 0));
        int result;
        while (true) {
            VisitedPosition bestVisited = getBestVisitedDot(currentPositions);
            Position bestVisitedPosition = bestVisited.getPosition();
            if (isFinish(bestVisitedPosition)) {
                result = bestVisited.getDistance();
                break;
            }
            currentPositions.remove(bestVisited);
            usedPositions.add(bestVisitedPosition);

            int bestDotDistance = bestVisited.getDistance();
            int bestDotX = bestVisited.getX();
            int bestDotY = bestVisited.getY();

            if (bestDotX > 0) {
                //add position to left
                Position newPositionPosition = bestVisitedPosition.clone();
                newPositionPosition.moveLeft();
                tryAddNewDot(newPositionPosition, bestDotDistance);
            }
            if (bestDotX < 3) {
                //add position to right
                Position newPositionPosition = bestVisitedPosition.clone();
                newPositionPosition.moveRight();
                tryAddNewDot(newPositionPosition, bestDotDistance);
            }
            if (bestDotY > 0) {
                //add position to top
                Position newPositionPosition = bestVisitedPosition.clone();
                newPositionPosition.moveUp();
                tryAddNewDot(newPositionPosition, bestDotDistance);
            }
            if (bestDotY < 3) {
                //add position to bottom
                Position newPositionPosition = bestVisitedPosition.clone();
                newPositionPosition.moveDown();
                tryAddNewDot(newPositionPosition, bestDotDistance);
            }
        }
        return result;
    }

    private VisitedPosition getBestVisitedDot(List<VisitedPosition> visitedPositions) {
        int bestDotIndex = 0;
        int bestDotDistance = visitedPositions.get(0).getDistance();
        int currentDotsCount = visitedPositions.size();
        for (int i = 0; i < currentDotsCount; i++) {
            int dotDistance = visitedPositions.get(i).getDistance();
            if (dotDistance < bestDotDistance) {
                bestDotDistance = dotDistance;
                bestDotIndex = i;
            }
        }
        return visitedPositions.get(bestDotIndex);
    }

    private boolean isFinish(Position position) {
        return END_POSITION.equals(position);
    }

    private void tryAddNewDot(Position position, int lastDotDistance) throws UnknownFieldNameException {
        if (!usedPositions.contains(position)) {
            try {
                int newDotDistance = lastDotDistance + walkingTimeMap.get(map[position.getY()].charAt(position.getX()));
                currentPositions.add(new VisitedPosition(position, newDotDistance));
            } catch (Exception e) {
                throw new UnknownFieldNameException();
            }
        }
    }
}
