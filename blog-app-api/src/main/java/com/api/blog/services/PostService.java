package com.api.blog.services;

import java.util.List;

import com.api.blog.payloads.PostDto;
import com.api.blog.payloads.PostResponse;

public interface PostService {

	// create
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
	
	// update
	PostDto updatePost(PostDto postDto, Integer postId);
	
	// delete
	void deletePost(Integer postId);
	
	// get All Post
	PostResponse getAllPost(Integer pageNumber, Integer pageSize, String sortBy, String sortDir);
	
	// get Single Post
	PostDto getPostById(Integer postId);
	
	// get all post by category
	List<PostDto> getPostsByCategory(Integer categoryId);
	
	// get all post by User
	List<PostDto> getPostsByUser(Integer userId);
	
	// Search Post get all post by category
	List<PostDto> searchPosts(String keyword);
}
