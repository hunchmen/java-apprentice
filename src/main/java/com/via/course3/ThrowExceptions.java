/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2023. All Rights Reserved.
 * 
 */
package com.via.course3;

/**
 * 
 * @author via
 * 
 * @date 18 Jan 2023
 */
public class ThrowExceptions {

    public static void main(String[] args) {

        userRequest("v_hunchmen", "login");
    }


    public static void userRequest(String userId, String operation) {

        if (userId.startsWith("via_")) {
            System.out.println("The username checks out...");
        } else {
            throw new InvalidUsernameException(
                    "The username is not in the correct format");
        }

        System.out.printf("\nThe user %s has requested the %s operation.",
                userId, operation);
    }
}
