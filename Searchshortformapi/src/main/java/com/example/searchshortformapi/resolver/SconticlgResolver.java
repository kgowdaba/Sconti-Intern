package com.example.searchshortformapi.resolver;

import com.example.searchshortformapi.repository.SconticlgRepository;
import graphql.kickstart.tools.GraphQLMutationResolver;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class SconticlgResolver implements GraphQLQueryResolver, GraphQLMutationResolver {
    @Autowired
    private SconticlgRepository sconticlgRepository;
    public List<String> searchWords(String startsWith)
    {
        return sconticlgRepository.findByTextStartingWith(startsWith);
    }
    public List<String> searchword(String statingwith)
    {

        return sconticlgRepository.list(statingwith);
    }
    public List<String> getfullform(String Shortform) {

        return sconticlgRepository.getcollege(Shortform);
    }
}
