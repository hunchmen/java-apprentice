/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2023. All Rights Reserved.
 * 
 */
package com.via.course6.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 
 * @author via
 * 
 * @date 23 Jan 2023
 */
public class ViewsOnMaps {

    public static void main(String[] args) {

        Map<Integer, String> moviesMap = new HashMap<Integer, String>();

        moviesMap.put(1202, "Titanic");
        moviesMap.put(1203, "Jaws");
        moviesMap.put(1501, "Back to the Future");
        moviesMap.put(1884, "The Godfather");
        moviesMap.put(2932, "Casablanca");
        moviesMap.put(6929, "Titanic");

        // NOTE: Java Map implementations returns the same collection object each
        // time when we access the collection view of a map
        Set<Map.Entry<Integer, String>> entrySet = moviesMap.entrySet();

        for (Map.Entry<Integer, String> entry : entrySet) {
            System.out.format("Key: %d, Value: %s\n", entry.getKey(),
                    entry.getValue());
        }

        for (Map.Entry<Integer, String> entry : entrySet) {
            if (entry.getKey() == 1884) {
                entry.setValue("The Godfather II");
            }
        }

        System.out.println("\nSet view of the entries (updated): " + entrySet);

        Set<Integer> keySet = moviesMap.keySet();

        System.out.println(
                "\nSet view of keys (will not have duplicates):" + keySet);

        for (Integer key : keySet) {
            System.out.println(key + " - " + moviesMap.get(key));
        }

        Collection<String> values = moviesMap.values();

        System.out.println(
                "\nCollection view of values (may contain duplicates): "
                        + values);
    }
}
