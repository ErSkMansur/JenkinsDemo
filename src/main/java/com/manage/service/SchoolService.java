package com.manage.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.manage.entity.SchoolDto;
import com.manage.exception.RecordNotFoundException;

@Service
public interface SchoolService {
	
public SchoolDto save(SchoolDto dto) throws RecordNotFoundException;

public List<SchoolDto> getAllSchool();

public void updateSchool(SchoolDto dto);

public void deleteSchool(long dto);

public SchoolDto getSchoolDetails(long id);

}
