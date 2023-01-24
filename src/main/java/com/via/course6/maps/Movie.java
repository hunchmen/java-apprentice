/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2023. All Rights Reserved.
 * 
 */
package com.via.course6.maps;

import java.util.Objects;

/**
 * 
 * @author via
 * 
 * @date 24 Jan 2023
 */
public class Movie {

    private String name;
    private String actor;

    public Movie(String name, String actor) {
        this.name = name;
        this.actor = actor;
    }

    public String getName() {
        return this.name;
    }

    public String getActor() {
        return this.actor;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "{" + name + ", " + actor + "}";
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, actor);
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Movie)) {
            return false;
        }

        Movie otherMovie = (Movie) obj;

        if (otherMovie.name.equals(this.name)
                && otherMovie.actor.equals(this.actor)) {
            return true;
        }

        return false;

    }

}
