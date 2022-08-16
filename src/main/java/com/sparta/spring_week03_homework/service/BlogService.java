package com.sparta.spring_week03_homework.service;


import com.sparta.spring_week03_homework.domain.Blog;
import com.sparta.spring_week03_homework.domain.BlogRepository;
import com.sparta.spring_week03_homework.domain.BlogRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class BlogService {
    private final BlogRepository blogRepository;

    @Transactional
    public Long update(Long id, BlogRequestDto requestDto) {
        Blog blog = blogRepository.findById(id).orElseThrow(
                () -> new NullPointerException("아이디가 없습니다.")
        );
        blog.update(requestDto);
        return id;
    }
}
