package com.udemy.exercice.services;

import com.udemy.exercice.entity.Movie;
import com.udemy.exercice.repository.MovieRepository;

import java.util.List;

public class MovieService {
    private MovieRepository movieRepository = new MovieRepository();

    public void register(Movie movie){
        movieRepository.save(movie);
    }

    public void registerAll(List<Movie> movies){
        movieRepository.saveAll(movies);
    }

    public List<Movie> getAll(){
        return movieRepository.getAll();
    }
}
