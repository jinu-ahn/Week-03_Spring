package com.sparta.spring_week03_homework.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity
public class Blog extends Timestamped {

    @GeneratedValue (strategy = GenerationType.AUTO)
    @Id
    private Long id;
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    @JsonIgnore
    private String comment;


    @Column(nullable = false)
    @JsonIgnore
    private String password;

    @JsonIgnore
    private String check_password;


    public Blog(BlogRequestDto requestDto){
        this.name = requestDto.getName();
        this.title = requestDto.getTitle();
        this.comment = requestDto.getComment();
        this.password = requestDto.getPassword();
    }
    public void update(BlogRequestDto requestDto){
        if(requestDto.getName().equals("") && requestDto.getTitle().equals(""))
            this.comment = requestDto.getComment();
        else if(requestDto.getName().equals("") && requestDto.getComment().equals(""))
            this.title = requestDto.getTitle();
        else if(requestDto.getTitle().equals("") && requestDto.getComment().equals(""))
            this.name = requestDto.getName();
        else if(requestDto.getName().equals("")){
            this.title = requestDto.getTitle();
            this.comment = requestDto.getComment();
        }
        else if(requestDto.getTitle().equals("")){
            this.name = requestDto.getName();
            this.comment = requestDto.getComment();
        }
        else if(requestDto.getComment().equals("")){
            this.name = requestDto.getName();
            this.title = requestDto.getTitle();
        }
        else{
            this.name = requestDto.getName();
            this.title = requestDto.getTitle();
            this.comment = requestDto.getComment();
        }
    }


    public Object Checkpassword(PasswordRequestDto requestDto){
        this.check_password = requestDto.getPassword();
        return check_password;
    }




}
