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
public class IntegerRepository {

    private Integer value;

    /**
     * 
     */
    public IntegerRepository(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("Integer Repository contains: %d", value);
    }
}
