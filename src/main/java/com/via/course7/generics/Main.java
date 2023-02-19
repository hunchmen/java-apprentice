/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2023. All Rights Reserved.
 * 
 */
package com.via.course7.generics;

import java.util.Calendar;

/**
 * 
 * @author via
 * 
 * @date 19 Feb 2023
 */
public class Main {

    public static void main(String[] args) {

        Repository<Integer> fifteen = new Repository<Integer>(15);
        // fifteen.value = 15;

        System.out.println("\nInteger repository: " + fifteen.value);
        System.out.println("Integer repository holds an integer class type: "
                + fifteen.value.getClass());

        Repository<Double> tenPOintOne = new Repository<Double>(10.1);
        // tenPOintOne.value = 10.1;

        System.out.println("\nInteger repository: " + tenPOintOne.value);
        System.out.println("Integer repository holds an integer class type: "
                + tenPOintOne.value.getClass());

        System.out.println("******* Generic class with custom type");

        Car honda = new Car("Honda", "Civic", 21000);

        Repository<Car> carRepository = new Repository<Car>(honda);
        System.out.println(carRepository);


    }

}
