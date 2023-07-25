package com.peliculas.java.models;

import java.io.Serializable;
import java.util.Objects;

public class Movie implements Serializable {
    private String name;

    public Movie() {
    }

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movie movie)) return false;
        return getName().equals(movie.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
