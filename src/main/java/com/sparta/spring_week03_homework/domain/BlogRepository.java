package com.sparta.spring_week03_homework.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BlogRepository extends JpaRepository<Blog,Long> {
    List<Blog> findAllByOrderByModifiedAtDesc();
}
