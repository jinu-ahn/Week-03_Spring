package com.sparta.spring_week03_homework.service;

import com.sparta.spring_week03_homework.Dto.SignupRequestDto;
import com.sparta.spring_week03_homework.Repository.UserRepository;
import com.sparta.spring_week03_homework.domain.Users;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.regex.Pattern;

@Service
@RequiredArgsConstructor
public class UserService {

    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;

    public Users registerUser(SignupRequestDto requestDto) {
        String username = requestDto.getUsername();
        String password = requestDto.getPassword();
        String passwordConfirm = requestDto.getPasswordConfirm();

        // 비밀번호 일치 확인
        if (!passwordConfirm.equals(password)) {
            throw new IllegalArgumentException("비밀번호를 다시 확인 해주세요.");
        }
        // 회원 ID 중복 확인
        Optional<Users> found = userRepository.findByUsername(username);
        if (found.isPresent()) {
            throw new IllegalArgumentException("중복된 사용자 ID 가 존재합니다.");
        }
        // ID, PW 구성 조건 확인
        String idPattern = "^[a-zA-Z0-9]{4,12}$";
        String pwPattern = "^[a-z0-9]{4,32}$";

        if (!Pattern.matches(idPattern, username) || !Pattern.matches(pwPattern, password)) {
            throw new IllegalArgumentException("형식이 일치하지 않습니다.");
        }

        // 비밀번호 암호화
        password = passwordEncoder.encode(requestDto.getPassword());

        Users user = new Users(username, password);
        return userRepository.save(user);
    }
}
