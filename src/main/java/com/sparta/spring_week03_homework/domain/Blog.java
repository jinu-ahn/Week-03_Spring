package com.sparta.spring_week03_homework.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity
public class Blog {

    @GeneratedValue (strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String comment;


    @Column(nullable = false)
    @JsonIgnore
    private String password;

    public Blog(BlogRequestDto requestDto){
        this.name = requestDto.getName();
        this.title = requestDto.getTitle();
        this.comment = requestDto.getComment();
        this.password = requestDto.getPassword();
    }
    public void update(BlogRequestDto requestDto){
        this.name = requestDto.getName();
        this.title = requestDto.getTitle();
        this.comment = requestDto.getComment();
    }


    public void Checkpassword(PasswordRequestDto requestDto){
        this.password = requestDto.getPassword();
    }




}
