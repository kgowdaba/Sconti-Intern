package com.example.searchshortformapi.repository;

import com.example.searchshortformapi.model.Sconticlg;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

import java.util.List;

public interface SconticlgRepository extends Neo4jRepository<Sconticlg,Long> {
    @Query("match(c:Sconticlg) where c.Collegename starts with $startsWith return c.Collegename")
    List<String> findByTextStartingWith(String startsWith);
    @Query("match(c:Sconticlg) where c.Collegename starts with $statingwith return c.Collegename")
    List<String>list(String statingwith);

    @Query("match(c:Sconticlg) where c.Shortform starts with $Shortform return c.Collegename")
    List<String>getcollege(String Shortform);
}
