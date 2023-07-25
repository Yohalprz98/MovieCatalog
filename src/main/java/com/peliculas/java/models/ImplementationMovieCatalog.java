package com.peliculas.java.models;

import javax.swing.*;
import java.util.ArrayList;

public class ImplementationMovieCatalog implements IMovieCatalog {

    private final ArrayList <String> movieList;

    public ImplementationMovieCatalog() {
        this.movieList = new ArrayList<>();
    }

    @Override
    public void insertMovie(Movie movieName) {
        this.movieList.add(movieName.toString());
    }

    @Override
    public void listMovies() {
        JOptionPane.showMessageDialog(
                null,
                this.movieList,
                "MOVIE LIST",
                JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void searchMovie(String movieName) {
        String result = null;
        for(var movie: movieList){
            if(movie.equals(movieName)){
                result = movie;
                JOptionPane.showMessageDialog(
                        null,
                        "Result found: " + result,
                        "SEARCH MOVIE",
                        JOptionPane.QUESTION_MESSAGE);
                break;
            }
        }
        if(result == null){
            JOptionPane.showMessageDialog(
                    null,
                    "The movie " + movieName + " was not found.",
                    "SEARCH MOVIE",
                    JOptionPane.WARNING_MESSAGE);

        }
    }
}
