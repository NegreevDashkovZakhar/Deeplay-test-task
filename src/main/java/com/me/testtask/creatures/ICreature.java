package com.me.testtask.creatures;

import java.util.Map;

/**
 * Interface representing creature walking on the map.
 * Knows about its traveling speed in every location type
 */
public interface ICreature {
    /**
     * Method getting name/race of the creature
     *
     * @return name/race of the creature
     */
    String getName();

    /**
     * Method getting map of costs of travel and types of locations
     *
     * @return map of costs of travel and types of locations
     */
    Map<Character, Integer> getWalkingTimeMap();
}
