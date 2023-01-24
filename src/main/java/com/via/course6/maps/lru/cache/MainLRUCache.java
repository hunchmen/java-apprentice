/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2023. All Rights Reserved.
 * 
 */
package com.via.course6.maps.lru.cache;

import java.util.Map;

/**
 * 
 * @author via
 * 
 * @date 24 Jan 2023
 */
public class MainLRUCache {

    public static void main(String[] args) {

        Map<Integer, String> lruCache = new LRUCache();

        lruCache.put(1202, "Titanic");
        lruCache.put(1203, "Jaws");
        lruCache.put(1501, "Back to the Future");
        lruCache.put(1884, "The Godfather");
        lruCache.put(6929, "Saving Private Ryan");

        System.out.println("Added exactly 5 entrie\n");

        for (Map.Entry<Integer, String> entry : lruCache.entrySet()) {
            System.out.println(entry);
        }

        lruCache.put(3000, "The Parasite");
        lruCache.put(4000, "It's a Beautiful Life");

        System.out.println(
                "\nOnly the 5 most recently accessed entries will be preserved\n");

        for (Map.Entry<Integer, String> entry : lruCache.entrySet()) {
            System.out.println(entry);

        }
    }
}
