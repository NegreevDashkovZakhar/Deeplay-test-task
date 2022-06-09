package com.me.testtask.creatures;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Class loading creatures from file
 */
public class CreatureLoader {
    /**
     * Method loading list of creatures from specified file
     *
     * @param fileName specified file name
     * @return map of creatures from specified file with their names
     * @throws FileNotFoundException when could not find specified file
     */
    public static Map<String, ICreature> loadCreatures(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        Map<String, ICreature> creatures = new HashMap<>();
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            String name = parts[0];
            Map<Character, Integer> walkingTimeMap = new HashMap<>();
            for (int i = 1; i < parts.length; i++) {
                String[] entryParts = parts[i].split(":");
                char key = entryParts[0].charAt(0);
                int value = Integer.parseInt(entryParts[1]);
                walkingTimeMap.put(key, value);
            }
            creatures.put(name, new CustomCreature(name, walkingTimeMap));
        }
        return creatures;
    }
}
