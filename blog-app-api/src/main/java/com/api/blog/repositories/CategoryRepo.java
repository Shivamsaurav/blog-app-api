package com.api.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.blog.models.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
