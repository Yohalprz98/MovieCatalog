package com.peliculas.java.views;
import com.peliculas.java.models.*;

import javax.swing.*;

public class UIMovies {
    public static void userInterface(){
        IMovieCatalog movies = new ImplementationMovieCatalog();
        Movie movie;

        CLOSE:
        while (true){

            String option = JOptionPane.showInputDialog(
                    null,
                    "1 - Insert movie\n" +
                            "2 - List movies\n" +
                            "3 - Search movie\n" +
                            "4 - Exit",
                    "Enter an option",
                    3
            );

            switch(option){
                case "1":
                    String movieName = JOptionPane.showInputDialog(
                            null,
                            "Enter the name of the movie",
                            "Input",
                            3
                    );
                    movie = new Movie(movieName);
                    movies.insertMovie(movie);
                    break;
                case "2":
                    movies.listMovies();
                    break;
                case "3":
                    movieName = JOptionPane.showInputDialog(
                            null,
                            "Enter the name of the movie",
                            "Enter",
                            3
                    );
                    movies.searchMovie(movieName);
                    break;
                case "4":
                    break CLOSE;
                default:
                    JOptionPane.showMessageDialog(
                            null,
                            "WRONG OPTION\n" +
                                    "Please enter an option again\n" +
                                    "Options are from 1 to 4",
                            "ERROR",
                            JOptionPane.ERROR_MESSAGE
                            );

            }
        }
    }
}
