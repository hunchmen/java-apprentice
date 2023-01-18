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
public class InvalidUsernameException extends RuntimeException {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public InvalidUsernameException(String errorMessage) {
        super(errorMessage);
        this.initCause(
                new RuntimeException("The username must begin with via_"));
    }
}
