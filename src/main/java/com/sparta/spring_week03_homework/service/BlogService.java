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
    public String update(Long id, BlogRequestDto requestDto) {
        Blog blog = blogRepository.findById(id).orElseThrow(
                () -> new NullPointerException("아이디가 없습니다.")
        );
        blog.update(requestDto);
        return "수정되었습니다.";
    }

    @Transactional
    public Get_IdRequestDto get_blog(Long id) {
        Blog blog = blogRepository.findById(id).orElseThrow(
                () -> new NullPointerException("해당 아이디가 존재하지 않습니다.")
        );
        return new Get_IdRequestDto(blog);
    }

    @Transactional
    public String  check_pw(Long id, PasswordRequestDto pw_requestDto){
        Blog blog = blogRepository.findById(id).orElseThrow(
                () -> new NullPointerException("해당 아이디가 존재하지 않습니다.")
        );
        if(blog.getPassword().equals(blog.Checkpassword(pw_requestDto)))
            return "비밀번호가 일치합니다.";
        else
            return "비밀번호가 일치하지 않습니다.";

    }


}
