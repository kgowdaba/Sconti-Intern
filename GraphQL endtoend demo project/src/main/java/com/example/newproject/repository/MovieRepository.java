package com.example.newproject.repository;

import com.example.newproject.model.Movie;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import java.util.List;
import java.util.Optional;

public interface MovieRepository extends Neo4jRepository<Movie,Long> {
    @Query("match(m:Movie) return m")
    List<Movie>findAll();

    @Query("match(m:Movie) where id(m)=$id return m")
    Optional<Movie> findById(Long id);

   @Query("create(m:Movie{title:$title,languages:$languages}) return m")
    Movie savemovie(String title,String languages);

    @Query("update (m:Movie{title:$title) return m")
    Movie save(String title);

    @Query("match(m:Movie) return true")
    Movie deleteMovie(Integer id, String title);



}
