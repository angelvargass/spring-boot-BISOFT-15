package vargas.angel.movieDatabase.controllers;

import org.springframework.web.bind.annotation.*;
import vargas.angel.movieDatabase.models.Movie;
import vargas.angel.movieDatabase.services.implementations.MovieService;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MoviesController {

    private final MovieService movieService;

    public MoviesController(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping("/save")
    public Movie saveMovie(@RequestBody Movie movie) {
        return this.movieService.save(movie);
    }

    @GetMapping("/get-all")
    public List<Movie> getAll() {
        return this.movieService.findAll();
    }

    @GetMapping("/get-by-name/{name}")
    public Movie getByName(@PathVariable String name) {
        return this.movieService.findByName(name);
    }

    @PutMapping("/update")
    public Movie updateMovie(@RequestBody Movie movie) {
        return this.movieService.update(movie);
    }
}
