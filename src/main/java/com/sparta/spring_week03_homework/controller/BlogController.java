package com.sparta.spring_week03_homework.controller;

import com.sparta.spring_week03_homework.domain.*;
import com.sparta.spring_week03_homework.service.BlogService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
public class BlogController {
    private final BlogRepository blogRepository;
    private final BlogService blogService;
    private ResponseDto responseDto;



    @GetMapping("api/blogs")
    public List<Blog> getblog() {
        return blogRepository.findAllByOrderByCreatedAtDesc();
    }
    @GetMapping("api/blogs/{id}")
    public Get_IdRequestDto getblog_id (@PathVariable Long id){
        return blogService.get_blog(id);

    }

    @GetMapping("api/blogs/{id}")
    public Get_IdRequestDto getblog_id(@PathVariable Long id) {
        return blogService.get_blog(id);
    }

    @PostMapping("api/blogs")
    public Blog createblog(@RequestBody BlogRequestDto requestDto) {
        Blog blog = new Blog(requestDto);
        return blogRepository.save(blog);
    }

    @PostMapping("api/blogs/{id}")
    public String pwcheck_blog(@PathVariable Long id, @RequestBody PasswordRequestDto requestDto) {
        return blogService.check_pw(id, requestDto);
    }

    @PatchMapping("api/blogs/{id}")
    public String update(@PathVariable Long id, @RequestBody BlogRequestDto requestDto) {
        return blogService.update(id, requestDto);
    }

    @DeleteMapping("api/blogs/{id}")
    public String deleteblog(@PathVariable Long id) {
        blogRepository.deleteById(id);
        return id + "번 게시물이 삭제되었습니다.";
    }
}

