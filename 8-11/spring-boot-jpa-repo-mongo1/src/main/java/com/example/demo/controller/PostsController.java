package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Posts;
import com.example.demo.service.PostsService;

@RestController
@RequestMapping("/api")
public class PostsController {
	
	private PostsService postService;

	
	public PostsController(PostsService postService) {
		super();
		this.postService = postService;
	}
	
	@RequestMapping("/posts")
	public List<Posts> getaAllPosts(){
		return postService.getAllPosts();
		
	}
	

}

