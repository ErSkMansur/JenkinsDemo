package com.pc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pc.entity.Post;

@Repository
public interface PostRepo extends JpaRepository<Post, Long>{

}
