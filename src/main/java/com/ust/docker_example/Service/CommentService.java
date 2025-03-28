package com.ust.docker_example.Service;

import com.ust.docker_example.Model.Comments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CommentService{
    private final String API_URL = "https://jsonplaceholder.typicode.com/comments";

    @Autowired
    private RestTemplate restTemplate;

    public List<Comments> getComments() {
        return List.of(restTemplate.getForObject(API_URL, Comments[].class));
    }
}
