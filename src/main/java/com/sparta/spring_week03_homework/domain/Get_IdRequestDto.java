package com.sparta.spring_week03_homework.domain;

import lombok.Builder;
import lombok.Getter;

<<<<<<< HEAD
@Getter
public class Get_IdRequestDto {
    String createdAt;
=======
import javax.swing.*;

@Getter
public class Get_IdRequestDto {
    String createdAt;
    String modifiedAt;
    Long id;
>>>>>>> af0327ee93a2f3e6e41bc87e0b32ff97e3259b1b
    String name;
    String title;
    String comment;
    
    @Builder
    public Get_IdRequestDto (Blog blog){
        this.createdAt= String.valueOf(blog.getCreatedAt());
<<<<<<< HEAD
=======
        this.modifiedAt = String.valueOf(blog.getModifiedAt());
        this.id = blog.getId();
>>>>>>> af0327ee93a2f3e6e41bc87e0b32ff97e3259b1b
        this.name = blog.getName();
        this.title = blog.getTitle();
        this.comment = blog.getComment();
    }
}
