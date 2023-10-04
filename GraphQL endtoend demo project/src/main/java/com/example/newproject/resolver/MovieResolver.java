package com.example.newproject.resolver;

import com.example.newproject.model.Movie;
import com.example.newproject.repository.MovieRepository;
import graphql.kickstart.tools.GraphQLMutationResolver;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class MovieResolver implements GraphQLQueryResolver, GraphQLMutationResolver {
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }
    public Movie getMovie(Long id) {
        return movieRepository.findById(id).orElse(null);
    }

    public Movie createMovie(String title, String languages) {

        return movieRepository.savemovie(title,languages);
    }

    public Movie updateMovie(Long id, String title, String language) {
        Optional<Movie> optionalMovie = movieRepository.findById(id);
        if (optionalMovie.isPresent()) {
            Movie movie = optionalMovie.get();
            if (title != null) {
                movie.setTitle(title);
            }


            return movieRepository.save(movie);
        }
        return null;
    }
    public Boolean deleteMovie(Long id) {
        movieRepository.deleteById(id);
        return true;
    }



}
