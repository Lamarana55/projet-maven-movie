package com.udemy.exercice.repository;

import com.udemy.exercice.entity.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository {

    List<Movie> movies = new ArrayList<>();

    public void save(Movie movie){
        movies.add(movie);
        System.out.println("The movie " + movie.getTitle() + " has been added...!!!");
    }

    public void saveAll(List<Movie> movies){

    }
}
