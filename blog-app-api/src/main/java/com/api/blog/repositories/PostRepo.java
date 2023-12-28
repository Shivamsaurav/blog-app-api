package com.api.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.blog.models.Category;
import com.api.blog.models.Post;
import com.api.blog.models.User;

public interface PostRepo extends JpaRepository<Post, Integer>{

	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);
	
	List<Post> findByTitleContaining(String title);
}
