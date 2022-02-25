package vargas.angel.movieDatabase.repository;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import org.springframework.stereotype.Repository;
import vargas.angel.movieDatabase.models.Movie;

import java.util.List;

@Repository
public interface MovieRepository extends CosmosRepository<Movie, String> {
    Movie findByName(String name);
    List<Movie> findAll();
}