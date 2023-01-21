package com.manage.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "School")
public class SchoolDto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonIgnore
	private Long id;

	@Column
	private String Sclname;

	@Column
	private String SclAddress;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="Univercity_fk" ,referencedColumnName = "id")
	private UniversityDto universityDto;

	
	public UniversityDto getUniversityDto() {
		return universityDto;
	}

	public void setUniversityDto(UniversityDto universityDto) {
		this.universityDto = universityDto;
	}

	
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
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



}
