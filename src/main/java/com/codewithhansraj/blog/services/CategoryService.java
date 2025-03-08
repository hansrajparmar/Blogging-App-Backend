package com.codewithhansraj.blog.services;

import java.util.List;

import com.codewithhansraj.blog.payloads.CategoryDto;

public interface CategoryService {

	
	//create
	public CategoryDto createCategory(CategoryDto categoryDto);
	
	//update
	//public.likhne.ki.zrurt.nhi.hai.interface.byDefault.public.hotahai..
	CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);
	
	//delete
	public void  deleteCategory(Integer categoryId);
	
	//get
	public CategoryDto getCategory(Integer categoryId);
	
	//getAll
	List<CategoryDto> getCategories();
	
	
}
