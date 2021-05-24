package com.udemy.exercice;

import com.udemy.exercice.entity.Movie;
import com.udemy.exercice.services.MovieService;

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
        Movie movie = new Movie();
        MovieService movieService = new MovieService();

        System.out.println("What is a title ?");
        Scanner scanner = new Scanner(System.in);
        movie.setTitle(scanner.nextLine());
        System.out.println("What is a genre ?");
        movie.setGenre(scanner.nextLine());

        movieService.register(movie);

    }
}
