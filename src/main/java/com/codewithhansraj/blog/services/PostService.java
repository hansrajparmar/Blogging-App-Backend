package com.codewithhansraj.blog.services;

import java.util.List;

import com.codewithhansraj.blog.entities.Post;
import com.codewithhansraj.blog.payloads.PostDto;

public interface PostService {

	
	//create
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
	
	//update
	PostDto updatePost(PostDto postDto, Integer postId);
	
	//delete
	void deletePost(Integer postId);
	
	//get All Posts
	List<PostDto> getAllPost();
	
	//get single post
	PostDto getPostById(Integer postId);
	
	//get all post by category
	List<PostDto> getPostsByCategory(Integer categoryId);
	
	//get all posts by user
	List<PostDto> getPostsByUser(Integer userId);
	
	//search posts
	List<Post> searchPosts(String keyword);
	
}
