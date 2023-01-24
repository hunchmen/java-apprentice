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
public class Main {

    public static void main(String[] args) {

        Product phone = new Product("iPhone", "Electronics");
        Product tv = new Product("Samsung", "Electronics");
        Product shoes = new Product("Nike", "Footwear");
        Product printer = new Product("Epson", "Computer Accessories");

        Set<Product> productSet = new HashSet<Product>();

        productSet.add(phone);
        productSet.add(tv);
        productSet.add(shoes);
        productSet.add(printer);

        System.out.println(productSet);
        System.out.println();

        System.out.println("*** add another iPhone with the same parameters");

        Product anotherPhone = new Product("iPhone", "Electronics");
        productSet.add(anotherPhone);

        System.out.println(productSet);
        System.out.println();

    }
}
