package com.sparta.spring_week03_homework.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BlogRepository extends JpaRepository<Blog,Long> {
<<<<<<< HEAD
    List<Blog> findAllByOrderByCreatedAtDesc();
=======
    List<Blog> findAllByOrderByModifiedAtDesc();
>>>>>>> af0327ee93a2f3e6e41bc87e0b32ff97e3259b1b
}
