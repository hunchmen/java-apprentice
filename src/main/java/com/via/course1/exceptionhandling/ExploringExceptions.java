/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2023. All Rights Reserved.
 * 
 */
package com.via.course1.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * 
 * @author via
 * 
 * @date 16 Jan 2023
 */
public class ExploringExceptions {

    public static void main(String[] args) {

        // int numerator = 100;
        // int denominator = 5;
        //
        // while (denominator >= 0) {
        // int result = numerator / denominator;
        //
        // System.out.println(result);
        //
        // denominator--;
        // }

        try {
            FileReader file = new FileReader("sample.txt");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("\nCaught the exceptions");
        }

        System.out.println("The code was executed");
    }
}
