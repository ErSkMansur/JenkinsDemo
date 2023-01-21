package com.manage.dto;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class SchoolEntity {


	private Long id;

	
	private String Sclname;

	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getSclname() {
		return Sclname;
	}


	public void setSclname(String sclname) {
		Sclname = sclname;
	}


	public String getSclAddress() {
		return SclAddress;
	}


	public void setSclAddress(String sclAddress) {
		SclAddress = sclAddress;
	}


	private String SclAddress;
}
