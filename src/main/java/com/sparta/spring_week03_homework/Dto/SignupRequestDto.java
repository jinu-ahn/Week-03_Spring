package com.sparta.spring_week03_homework.Dto;


import lombok.Getter;

@Getter
public class SignupRequestDto {
    private String username;
    private String password;
    private String passwordConfirm;
}
