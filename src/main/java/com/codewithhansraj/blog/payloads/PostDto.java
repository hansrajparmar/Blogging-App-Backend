package com.codewithhansraj.blog.payloads;

import java.util.Date;

import com.codewithhansraj.blog.entities.Category;
import com.codewithhansraj.blog.entities.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PostDto {
	
	
	private String title;
	
	private String content;
	
	private String imageName;
	
	private Date addDate;
	
	private CategoryDto category;
	
	private UserDto user;
	

}
