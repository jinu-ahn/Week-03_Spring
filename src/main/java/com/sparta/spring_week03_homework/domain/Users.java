package com.sparta.spring_week03_homework.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sparta.spring_week03_homework.Dto.SignupRequestDto;
import com.sparta.spring_week03_homework.Dto.UserRequestDto;
import com.sparta.spring_week03_homework.util.Timestamped;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Users extends Timestamped {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    Long user_id;

    @Column(nullable = false , unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    @JsonIgnore
    private String passwordConfirm;


    public Users(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
