package com.codewithhansraj.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithhansraj.blog.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer> {

}
