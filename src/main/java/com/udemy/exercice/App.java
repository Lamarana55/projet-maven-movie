package com.udemy.exercice;

import com.udemy.exercice.entity.Movie;
import com.udemy.exercice.services.MovieService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Long size = 0L;
        List<Movie> movies = new ArrayList<>();
        MovieService movieService = new MovieService();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the size ?");
        size = Long.valueOf(scanner.nextLine());
        while (size > 0){
            Movie movie = new Movie();
            System.out.println("What is a title ?");
            movie.setTitle(scanner.nextLine());
            System.out.println("What is a genre ?");
            movie.setGenre(scanner.nextLine());
            movies.add(movie);
            size--;
        }

        movieService.registerAll(movies);
        getAllMovies(movies);
    }

    public  static void getAllMovies(List<Movie> movies){
        for (int i=0; i < movies.size(); i++) {
            System.out.println((i + 1) + " Title: " + movies.get(i).getTitle() + "| Genre: " + movies.get(i).getGenre());
        }
    }
}
