package com.api.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.blog.models.User;

public interface UserRepo extends JpaRepository<User, Integer>{

	
}
