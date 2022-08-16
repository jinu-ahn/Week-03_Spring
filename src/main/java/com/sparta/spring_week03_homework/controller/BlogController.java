package com.sparta.spring_week03_homework.controller;

import com.sparta.spring_week03_homework.domain.Blog;
import com.sparta.spring_week03_homework.domain.BlogRepository;
import com.sparta.spring_week03_homework.domain.BlogRequestDto;
import com.sparta.spring_week03_homework.service.BlogService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
public class BlogController {
    private final BlogRepository blogRepository;
    private final BlogService blogService;

    @GetMapping("api/blogs")
    public List<Blog> getblog(){
        return blogRepository.findAll();
    }
    @GetMapping("api/blogs/{id}")
    public List<Blog> getblog_id(@PathVariable Long id) {
        return blogRepository.findById(id);
    }
}