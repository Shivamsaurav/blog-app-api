package com.api.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.blog.models.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer>{

}
