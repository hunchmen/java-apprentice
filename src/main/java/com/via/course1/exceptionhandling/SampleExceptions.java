/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2023. All Rights Reserved.
 * 
 */
package com.via.course1.exceptionhandling;

import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 * 
 * @author via
 * 
 * @date 16 Jan 2023
 */
public class SampleExceptions {

    public static void main(String[] args) {

        System.out.println("Contents of the file:\n:");

        FileInputStream myfile = null;

        try {
            myfile = new FileInputStream("samples.txt");
            DataInputStream readFile = new DataInputStream(myfile);

            while (true) {
                System.out.println(readFile.readUTF());
            }
        } catch (Exception e) {
            System.out.println("An exception has been thrown");
            e.printStackTrace();
        }
    }
}
