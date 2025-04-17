package com.example.demo.service;

import com.example.demo.dto.ResponseDto;
import com.example.demo.repository.PostRepository;
import org.springframework.stereotype.Service;

@Service

public class PostService {
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public ResponseDto sex() {
        postRepository.findAll();
    }
}