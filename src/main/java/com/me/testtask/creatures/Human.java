package com.me.testtask.creatures;

import java.util.HashMap;
import java.util.Map;

/**
 * Class representing human creature with pre-written movement costs
 */
public class Human implements ICreature {
    private static final String NAME = "Human";
    private final Map<Character, Integer> walkingTimeMap;

    /**
     * Constructor initializing creature with pre-written movement costs
     */
    public Human() {
        this.walkingTimeMap = new HashMap<>();
        walkingTimeMap.put('S', 5);
        walkingTimeMap.put('W', 2);
        walkingTimeMap.put('T', 3);
        walkingTimeMap.put('P', 1);
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public Map<Character, Integer> getWalkingTimeMap() {
        return walkingTimeMap;
    }
}
