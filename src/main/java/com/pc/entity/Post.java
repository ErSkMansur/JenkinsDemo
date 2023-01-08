package com.pc.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Post extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String title;
	@Column
	private String discription;

	public Post(long id, String title, String discription) {
		super();
		this.id = id;
		this.title = title;
		this.discription = discription;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", title=" + title + ", discription=" + discription + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDiscription() {
		return discription;
	}

	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

}
