package com.sparta.spring_week03_homework.domain;

import lombok.Builder;
import lombok.Getter;

import javax.swing.*;

@Getter
public class Get_IdRequestDto {
    String createdAt;
    String modifiedAt;
    Long id;
    String name;
    String title;
    String comment;
    
    @Builder
    public Get_IdRequestDto (Blog blog){
        this.createdAt= String.valueOf(blog.getCreatedAt());
        this.modifiedAt = String.valueOf(blog.getModifiedAt());
        this.id = blog.getId();
        this.name = blog.getName();
        this.title = blog.getTitle();
        this.comment = blog.getComment();
    }
}
