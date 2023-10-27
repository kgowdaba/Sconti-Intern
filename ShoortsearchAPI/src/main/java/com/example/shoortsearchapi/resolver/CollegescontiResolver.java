package com.example.shoortsearchapi.resolver;

import com.example.shoortsearchapi.repository.CollegescontiRepository;
import graphql.kickstart.tools.GraphQLMutationResolver;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class CollegescontiResolver implements GraphQLQueryResolver, GraphQLMutationResolver {
    @Autowired
    private CollegescontiRepository collegescontiRepository;
    public List<String>getFullForm(String Shoortform)
    {
        return collegescontiRepository.FullForm(Shoortform);
    }
}
