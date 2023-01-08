package com.pc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class PostAndCommentApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostAndCommentApplication.class, args);
		System.out.println("Post and Comment Application is Running....");
	
	}
	
}
