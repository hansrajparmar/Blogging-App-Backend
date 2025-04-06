package com.codewithhansraj.blog.payloads;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.codewithhansraj.blog.entities.Category;
import com.codewithhansraj.blog.entities.Comment;
import com.codewithhansraj.blog.entities.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PostDto {
	
	private Integer postId;
	
	private String title;
	
	private String content;
	
	private String imageName;
	
	private Date addDate;
	
	private CategoryDto category;
	
	private UserDto user;
	
	private Set<CommentDto> comments=new HashSet<>();
	
	

}
