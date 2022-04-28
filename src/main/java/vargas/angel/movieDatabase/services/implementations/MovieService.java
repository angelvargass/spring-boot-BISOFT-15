package vargas.angel.movieDatabase.services.implementations;

import org.springframework.stereotype.Service;
import vargas.angel.movieDatabase.models.Movie;
import vargas.angel.movieDatabase.repository.MovieRepository;
import vargas.angel.movieDatabase.services.interfaces.CrudService;


import java.util.List;
import java.util.Optional;

@Service
public class MovieService implements CrudService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public Movie save(Movie movie) {
        return this.movieRepository.save(movie);
    }

    @Override
    public Optional<Movie> findById(String id) {
        return this.movieRepository.findById(id);
    }

    public List<Movie> findAll() {
        return this.movieRepository.findAll();
    }

    @Override
    public Movie update(Movie movie) {
        return this.movieRepository.save(movie);
    }

    @Override
    public void delete(String id) {
        this.movieRepository.deleteById(id);
    }

    public Movie findByName(String name) {
        return this.movieRepository.findByName(name);
    }
}