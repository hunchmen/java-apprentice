/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2023. All Rights Reserved.
 * 
 */
package com.via.course6.maps.lru.cache;

import java.util.LinkedHashMap;

/**
 * 
 * @author via
 * 
 * @date 24 Jan 2023
 */
public class LRUCache extends LinkedHashMap<Integer, String> {

    private static final long serialVersionUID = 1L;

    private static final int MAX_ENTRIES = 5;


    public LRUCache() {
        super(16, 0.75f, true);
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.util.LinkedHashMap#removeEldestEntry(java.util.Map.Entry)
     */
    @Override
    protected boolean removeEldestEntry(
            java.util.Map.Entry<Integer, String> eldest) {
        return size() > MAX_ENTRIES;
    }
}
