/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2023. All Rights Reserved.
 * 
 */
package com.via.course6.maps.lru.cache;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 
 * @author via
 * 
 * @date 24 Jan 2023
 */
public class Main {

    public static void main(String[] args) {

        Map<Integer, String> linkedHashMap =
                new LinkedHashMap<>(16, 0.75f, true);

        linkedHashMap.put(1784, "The Godfather");
        linkedHashMap.put(1202, "Titanic");
        linkedHashMap.put(1503, "Jaws");
        linkedHashMap.put(1501, "Saving Private Ryan");

        System.out.println(
                "Insertion order since no entry has been accessed yet\n");

        for (Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println(entry);
        }

        linkedHashMap.get(1202);

        System.out.println("\nAccess order of entries (accessed Titanic) \n");

        for (Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println(entry);
        }

        linkedHashMap.get(1501);

        System.out.println(
                "\nAccess order of entries (accessed Saving Private Ryan) \n");

        for (Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println(entry);
        }
    }
}
