/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2023. All Rights Reserved.
 * 
 */
package com.via.course6.maps.lru.cache;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * 
 * @author via
 * 
 * @date 24 Jan 2023
 */
public class MainComparatorMaps {

    public static void main(String[] args) {

        Comparator<Integer> descendingComparator = new Comparator<Integer>() {

            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2) * -1;
            }
        };

        SortedMap<Integer, String> treeMap =
                new TreeMap<>(descendingComparator);

        treeMap.put(1202, "Titanic");
        treeMap.put(1203, "Jaws");
        treeMap.put(1501, "Back to the Future");
        treeMap.put(1884, "The Godfather");
        treeMap.put(6929, "Saving Private Ryan");

        System.out.println("entries in the reverse order: ");

        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry);

        }
    }
}
