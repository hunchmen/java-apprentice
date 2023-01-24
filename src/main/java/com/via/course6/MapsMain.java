/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2023. All Rights Reserved.
 * 
 */
package com.via.course6;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author via
 * 
 * @date 23 Jan 2023
 */
public class MapsMain {

    public static void main(String[] args) {

        Map<Integer, String> actorsMap = new HashMap<Integer, String>();

        System.out.println("Actors map empty?: " + actorsMap.isEmpty());
        System.out.println("Actors map size: " + actorsMap.size());

        System.out.println();

        actorsMap.put(1001, "Tom Hanks");
        actorsMap.put(1002, "Will Smith");
        actorsMap.put(1003, "Bruce Willis");
        actorsMap.put(1004, "Cris Evans");
        actorsMap.put(1005, "Brad Pitt");

        System.out.println("Actors map empty?: " + actorsMap.isEmpty());
        System.out.println("Actors map size: " + actorsMap.size());

        System.out.println("String representation of map: " + actorsMap);
        System.out.println();

        System.out.println("*****Map hierarchy");
        System.out.println("hashMap instanceof HashMap: "
                + (actorsMap instanceof HashMap));
        System.out.println(
                "hashMap instanceof Map: " + (actorsMap instanceof Map));

    }
}
