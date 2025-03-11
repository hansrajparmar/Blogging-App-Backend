package com.codewithhansraj.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithhansraj.blog.entities.Category;
import com.codewithhansraj.blog.entities.Post;
import com.codewithhansraj.blog.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer> {

	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);
	
}
