package com.pc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pc.entity.Post;
import com.pc.service.PostService;

@RestController
@RequestMapping(name="/post")
public class PostCtl {
	@Autowired
	private PostService postService;
	
	@PostMapping(name="/save")
	public ResponseEntity<Post> savePost(@RequestBody Post post){
		return new ResponseEntity<>(postService.save(post),HttpStatus.CREATED);
	}
}
