/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2023. All Rights Reserved.
 * 
 */
package com.via.course6.maps;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author via
 * 
 * @date 24 Jan 2023
 */
public class CustomObjectsOnMaps {

    public static void main(String[] args) {

        Map<Movie, Float> moviesMap = new HashMap<>();

        System.out.println("**** Values can be custom objects");

        moviesMap.put(new Movie("Titanic", "Leonardo DiCaprio"), 8.8f);
        moviesMap.put(new Movie("Back to the Future", "Michael J Fox"), 8.3f);
        moviesMap.put(new Movie("The Godfather", "Al Pacino"), 9.3f);
        moviesMap.put(new Movie("Casablanca", "Humphrey Bogart"), 8.9f);

        for (Map.Entry<Movie, Float> entry : moviesMap.entrySet()) {
            System.out.format("Key: %s, Value: %.1f\n", entry.getKey(),
                    entry.getValue());

        }

        System.out.println();
    }
}
