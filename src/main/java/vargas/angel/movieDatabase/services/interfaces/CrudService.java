package vargas.angel.movieDatabase.services.interfaces;

import vargas.angel.movieDatabase.models.Movie;

import java.util.List;
import java.util.Optional;

public interface CrudService {
    Movie save(Movie movie);
    Optional<Movie> findById(String id);
    List<Movie> findAll();
    Movie update(Movie movie);
    void delete(String id);
}
