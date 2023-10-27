package com.example.search.resolver;

import com.example.search.model.College;
import com.example.search.repository.CollegeRepository;
import graphql.kickstart.tools.GraphQLMutationResolver;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@RequiredArgsConstructor
public class CollegeResolver implements GraphQLQueryResolver, GraphQLMutationResolver {
    @Autowired
    private CollegeRepository collegeRepository;
    public List<String> searchWords(String startsWith) {
        return collegeRepository.findByTextStartingWith(startsWith);
    }
}
