package vargas.angel.movieDatabase.services;

import org.springframework.stereotype.Service;
import vargas.angel.movieDatabase.models.Movie;
import vargas.angel.movieDatabase.repository.MovieRepository;


import java.util.List;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie saveMovie(Movie movie) {
        return this.movieRepository.save(movie);
    }

    public Movie findByName(String name) {
        return this.movieRepository.findByName(name);
    }

    public List<Movie> findAll() {
        return this.movieRepository.findAll();
    }
}