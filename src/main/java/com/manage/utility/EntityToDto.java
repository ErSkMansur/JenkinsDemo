package com.manage.utility;

import com.manage.dto.SchoolEntity;
import com.manage.dto.UniversityEntity;
import com.manage.entity.SchoolDto;
import com.manage.entity.UniversityDto;

public class EntityToDto {
	
	public UniversityDto convertToUnivercityDto(UniversityEntity entity) {
		UniversityDto dto =new UniversityDto();
		dto.setId(entity.getId());
		dto.setName(entity.getName());
		dto.setAddress(entity.getAddress());
		return dto;
		
	}
	
	public SchoolDto converttoSchoolDto(SchoolEntity entity) {
		SchoolDto dto=new SchoolDto();
	
		return null;
		
	}
}
