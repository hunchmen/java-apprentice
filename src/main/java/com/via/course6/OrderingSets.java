/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2023. All Rights Reserved.
 * 
 */
package com.via.course6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * @author via
 * 
 * @date 23 Jan 2023
 */
public class OrderingSets {

    public static void main(String[] args) {
        String[] carsArray =
                new String[] {"Volvo", "BMW", "Honda", "Audi", "Mercedes"};

        Set<String> hashSet = new HashSet<String>(Arrays.asList(carsArray));
        Set<String> linkedHashSet =
                new LinkedHashSet<String>(Arrays.asList(carsArray));
        Set<String> treeSet = new TreeSet<String>(Arrays.asList(carsArray));

        System.out.println("Order of car names in a HashSet (random order)");

        for (String name : hashSet) {
            System.out.println(name);
        }

        System.out.println(
                "\nOrder of car names in a LinkedHashSet (insertion order)");

        for (String name : linkedHashSet) {
            System.out.println(name);
        }

        System.out.println("\nOrder of car names in a TreeSet (natural order)");

        for (String name : treeSet) {
            System.out.println(name);
        }
    }
}
