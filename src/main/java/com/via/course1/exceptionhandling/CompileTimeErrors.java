/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2023. All Rights Reserved.
 * 
 */
package com.via.course1.exceptionhandling;

/**
 * 
 * @author via
 * 
 * @date 16 Jan 2023
 */
public class CompileTimeErrors {

    public static void main(String[] args) {

        CompileTimeErrors obj = new CompileTimeErrors();
        obj.myMethod();
    }

    public void myMethod() {
        System.out.println("Welcome to Java Programming");
    }
}
