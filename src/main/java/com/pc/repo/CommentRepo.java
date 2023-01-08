package com.pc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pc.entity.Comments;

@Repository
public interface  CommentRepo extends JpaRepository<Comments, Long> {

}
