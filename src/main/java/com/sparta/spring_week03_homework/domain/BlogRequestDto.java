package com.sparta.spring_week03_homework.domain;


import lombok.Getter;

@Getter
public class BlogRequestDto {
    private String name="";
    private String title="";
    private String comment="";
    private String password="";
}
