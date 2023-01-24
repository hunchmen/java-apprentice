/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2023. All Rights Reserved.
 * 
 */
package com.via.course6;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author via
 * 
 * @date 23 Jan 2023
 */
public class MainSets {

    public static void main(String[] args) {

        HashSet<String> carSet = new HashSet<String>();

        carSet.add("Volvo");
        carSet.add("BMW");
        carSet.add("Ford");
        carSet.add("Mazda");

        System.out.println("Cars set: " + carSet);
        System.out.println();

        // Sets dont accept duplicates
        Set<String> bikeSet = new HashSet<String>();

        bikeSet.add("Yamaha");
        bikeSet.add("Suzuki");
        bikeSet.add("Honda");
        bikeSet.add("BMW");

        System.out.println("Bike set original contents: " + bikeSet);
        System.out.println();

        System.out.println("*********** Union operation");
        System.out.println("Bike set original contents: " + bikeSet);
        System.out.println("Cars set original contents: " + carSet);

        carSet.addAll(bikeSet);

        System.out.println("carSet union bikeSet: " + carSet);
        System.out.println();

        System.out.println("*********** Intersection operation");
        System.out.println("Car set of original contents: " + carSet);
        System.out.println("Bike set original contents: " + bikeSet);

        carSet.retainAll(bikeSet);

        System.out.println("carSet intersection bikeSet: " + carSet);
        System.out.println();

        System.out.println("*********** Difference operation");
        System.out.println("Car set of original contents: " + carSet);
        System.out.println("Bike set original contents: " + bikeSet);

        carSet.removeAll(bikeSet);

        System.out.println("carSet difference bikeSet: " + carSet);
        System.out.println();
    }
}
