package com.me.testtask.creatures;

import java.util.Map;

/**
 * Class representing creature that was not hard coded as class
 */
public class CustomCreature implements ICreature {
    private final String name;
    private final Map<Character, Integer> walkingTimeMap;

    /**
     * Constructor setting name and walking costs for the creature
     *
     * @param name           name of the creature
     * @param walkingTimeMap map with costs of traveling int different locations
     */
    public CustomCreature(String name, Map<Character, Integer> walkingTimeMap) {
        this.name = name;
        this.walkingTimeMap = walkingTimeMap;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Map<Character, Integer> getWalkingTimeMap() {
        return walkingTimeMap;
    }
}
