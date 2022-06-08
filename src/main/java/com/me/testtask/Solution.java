package com.me.testtask;

import com.me.testtask.algorithm.PathFindingAlgorithm;
import com.me.testtask.creatures.Human;
import com.me.testtask.creatures.ICreature;

import java.util.HashMap;
import java.util.Map;

/**
 * Class responsible for whole task
 */
public class Solution {
    /**
     * Method calculating closest path from top left corner of given map to bottom right corner
     *
     * @param map          string representing 4x4 grid where the path should be found. Must contain 16 symbols
     * @param creatureName string representing creature name walking the path
     * @return minimal cost of moving specified creature from top left corner to bottom right corner of the specified
     * grid
     */
    public static int getResult(final String map, final String creatureName) {
        String[] squareMap = new String[4];
        for (int i = 0; i < squareMap.length; i++) {
            squareMap[i] = map.substring(i * 4, i * 4 + 4);
            System.out.println(squareMap[i]);
        }

        Map<String, ICreature> creatureMap = new HashMap<>();
        creatureMap.put("Human", new Human());
        ICreature creature = creatureMap.get(creatureName);
        Map<Character, Integer> walkingTimeMap = creature.getWalkingTimeMap();
        PathFindingAlgorithm algorithm = new PathFindingAlgorithm(squareMap, walkingTimeMap);
        return algorithm.getPathLength();
    }
}
