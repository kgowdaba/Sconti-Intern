package com.example.search.repository;

import com.example.search.model.College;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

import java.util.List;

public interface CollegeRepository extends Neo4jRepository<College, Long> {
    @Query("match(c:College) where c.Name starts with 'A' return c.Name")
    List<String> findByTextStartingWith(String startsWith);

}
