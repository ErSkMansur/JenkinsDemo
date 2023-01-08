package com.pc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pc.entity.Post;
import com.pc.repo.PostRepo;

@Service
public class PostService {

	@Autowired
	private PostRepo  postRepo;
	
	public Post save(Post post) {
		return postRepo.save(post);
	}
	
}
