package com.sparta.spring_week03_homework.security;

import com.sparta.spring_week03_homework.security.jwt.JwtTokenUtils;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormLoginSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {
    public static final String TOKEN_TYPE = "BEARER ";

    @Override
    public void onAuthenticationSuccess(final HttpServletRequest request, final HttpServletResponse response,
                                        final Authentication authentication) {
        final UserDetailsImpl userDetails = ((UserDetailsImpl) authentication.getPrincipal());
        // Token 생성
        final String access_token = JwtTokenUtils.access_Token(userDetails);
        final String refresh_token = JwtTokenUtils.refresh_Token(userDetails);
        response.addHeader("Access_Token", TOKEN_TYPE + access_token);
        response.addHeader("Refresh_Token", TOKEN_TYPE + refresh_token);
    }

}
