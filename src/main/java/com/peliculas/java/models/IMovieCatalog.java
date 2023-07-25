package com.peliculas.java.models;

public interface IMovieCatalog {
    void insertMovie(Movie movieName);
    void listMovies();
    void searchMovie(String movieName);
}
