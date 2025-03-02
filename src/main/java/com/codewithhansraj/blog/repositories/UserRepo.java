package com.codewithhansraj.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithhansraj.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
