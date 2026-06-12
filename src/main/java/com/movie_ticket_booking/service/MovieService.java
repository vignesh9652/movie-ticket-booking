package com.movie_ticket_booking.service;

import com.movie_ticket_booking.entity.Movie;
import com.movie_ticket_booking.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieService {


    private final MovieRepository repository;

    public Movie saveMovie(Movie movie) {

        return repository.save(movie);
    }

    public List<Movie> getAllMovies(){
        return repository.findAll();
    }

    public Movie getMovieById(Long id){

        return repository.getById(id);
    }
}
