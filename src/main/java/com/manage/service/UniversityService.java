package com.manage.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.manage.entity.UniversityDto;

@Service
public interface UniversityService {

	public List<UniversityDto> getAllUniversity(); 
	
	public UniversityDto saveUniversity(UniversityDto dto);
	
	public void UpdateUniversity(UniversityDto dto);
	
	public void deleteUniversity(Long id);
	
	public UniversityDto getUniversityDetail(Long id);
	
}
