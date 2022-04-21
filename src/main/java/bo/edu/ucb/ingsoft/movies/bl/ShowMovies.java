package bo.edu.ucb.ingsoft.movies.bl;

import bo.edu.ucb.ingsoft.movies.dto.MovieList;
import java.util.ArrayList;
import java.util.List;

public class ShowMovies {

    public ShowMovies() {
    }

    public List<MovieList> findmovies(Long chatId) {
        List<MovieList> result = new ArrayList<>();
        result.add(new MovieList("Star Wars"));
        result.add(new MovieList("Mad Max"));
        result.add(new MovieList("El Padrino"));
        result.add(new MovieList("Scarface"));
        return result;
    }
}

