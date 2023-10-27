package com.example.shoortsearchapi.repository;

import com.example.shoortsearchapi.model.Collegesconti;;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

import java.util.List;

public interface CollegescontiRepository extends Neo4jRepository<Collegesconti, Long> {
    @Query("match(c:Collegesconti) where c.ShoortForm='B I T' return c.CollegeName")
    List<String>FullForm(String Shoortform);
}
