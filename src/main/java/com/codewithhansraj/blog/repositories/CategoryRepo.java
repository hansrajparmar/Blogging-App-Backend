package com.codewithhansraj.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithhansraj.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
