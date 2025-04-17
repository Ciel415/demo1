package com.example.demo.controller;

import com.example.demo.dto.ResponseDto;
import com.example.demo.service.PostService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Post")

public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

@GetMapping
    public ResponseDto getPost() {
    postService.sex();
}
}
