package com.ust.docker_example.Controller;

import com.ust.docker_example.Model.Comments;
import com.ust.docker_example.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// Controller
@RestController
@RequestMapping("/api/comments")
class CommentController {
    @Autowired
    private CommentService commentService;

    @GetMapping
    public List<Comments> getAllComments() {
        return commentService.getComments();
    }
}