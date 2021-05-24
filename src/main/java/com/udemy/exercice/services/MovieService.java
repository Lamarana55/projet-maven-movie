package com.udemy.exercice.services;

import com.udemy.exercice.entity.Movie;
import com.udemy.exercice.repository.MovieRepository;

public class MovieService {
    private MovieRepository movieRepository = new MovieRepository();

    public void register(Movie movie){
        movieRepository.create(movie);
    }
}
