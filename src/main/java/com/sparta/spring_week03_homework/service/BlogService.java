package com.sparta.spring_week03_homework.service;


import com.sparta.spring_week03_homework.domain.*;
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

    @Transactional
    public Boolean  check_pw(Long id, PasswordRequestDto pw_requestDto){
        BlogRequestDto requestDto = new BlogRequestDto();
        if(requestDto.getPassword().equals(pw_requestDto)) {
            return true;
        } else {
            blogRepository.findById(id).orElseThrow(
                    () -> new NullPointerException("해당 아이디가 존재하지 않습니다.")
            );
            return false;
        }


    }
    @Transactional
    public Get_IdRequestDto get_blog(Long id) {
        Blog blog = blogRepository.findById(id).orElseThrow(
                () -> new NullPointerException("해당 아이디가 존재하지 않습니다.")
        );
        return new Get_IdRequestDto(blog);
    }
}
