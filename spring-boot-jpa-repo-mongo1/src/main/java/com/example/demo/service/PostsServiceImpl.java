package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Posts;
import com.example.demo.repository.PostsRepository;
@Service
public class PostsServiceImpl implements PostsService {
	
	@Autowired
	private PostsRepository postsRepository;

	@Override
	public List<Posts> getAllPosts() {
		// TODO Auto-generated method stub
		return postsRepository.findAll();
	}

}
