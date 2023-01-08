package com.pc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pc.entity.Comments;
import com.pc.repo.CommentRepo;

@Service
public class CommentService {
	@Autowired
	private CommentRepo commentRepo;
	
	public Comments save(Comments comments) {
		return commentRepo.save(comments);
	}
	
	public List<Comments> getAllComments(){
		return commentRepo.findAll();
	}
	
	public Comments findById(long id) throws Exception {
		return commentRepo.findById(id).
				orElseThrow(()->new Exception("Record is not Found.."));
	}
}
