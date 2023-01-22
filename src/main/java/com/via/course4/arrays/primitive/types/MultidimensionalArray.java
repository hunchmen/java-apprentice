/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2023. All Rights Reserved.
 * 
 */
package com.via.course4.arrays.primitive.types;

import java.util.Arrays;

/**
 * 
 * @author via
 * 
 * @date 21 Jan 2023
 */
public class MultidimensionalArray {

    public static void main(String[] args) {

        int[][] multidimensionalArray = new int[3][3];

        System.out.println(Arrays.toString(multidimensionalArray));

        for (int[] intArray : multidimensionalArray) {
            System.out.println(Arrays.toString(intArray));
        }
    }
}
