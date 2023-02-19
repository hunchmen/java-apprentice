/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2023. All Rights Reserved.
 * 
 */
package com.via.course7.generics;

/**
 * 
 * @author via
 * 
 * @date 19 Feb 2023
 */
public class Car {

    public String make;
    public String model;
    public int price;

    public Car(String make, String model, int price) {
        this.make = make;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Car [make=%s, model=%s, price=%s]", make, model,
                price);
    }


}
