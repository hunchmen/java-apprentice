/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2023. All Rights Reserved.
 * 
 */
package com.via.course5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 
 * @author via
 * 
 * @date 22 Jan 2023
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<String> stringArrayList = new ArrayList<String>();

        System.out.println("ArrayList class: " + stringArrayList.getClass());

        System.out.println();

        System.out.println("ArrayList instanceof List: "
                + (stringArrayList instanceof List));

        System.out.println("ArrayList instance of Collection: "
                + (stringArrayList instanceof Collection));

        System.out.println("ArrayList instanceof Iterable: "
                + (stringArrayList instanceof Iterable));
    }
}
