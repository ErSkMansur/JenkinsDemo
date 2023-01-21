package com.manage.serviceImpl;

import java.util.List;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manage.entity.SchoolDto;
import com.manage.entity.UniversityDto;
import com.manage.exception.RecordNotFoundException;
import com.manage.repository.SchoolRepository;
import com.manage.repository.UniversityRepository;
import com.manage.service.SchoolService;
import com.manage.service.UniversityService;

@Service
public class SchoolServiceImpl implements SchoolService {

	@Autowired
	private SchoolRepository schoolRepository;

	@Autowired
	private UniversityRepository universityRepo;

	@Autowired
	private UniversityService universityService;

	@Override
	@Transactional
	public SchoolDto save(SchoolDto dto) throws RecordNotFoundException {
		SchoolDto newSchool = new SchoolDto();
		UniversityDto udto = new UniversityDto();

	Optional<UniversityDto> opt=universityRepo.findById(dto.getId());
	if(opt.isPresent()) {
		
	}
	else {
		System.out.println("List is Null");
	}

		return schoolRepository.save(dto);
	}

	@Override
	@Transactional
	public List<SchoolDto> getAllSchool() {

		return schoolRepository.findAll();
	}

	@Override
	@Transactional
	public void updateSchool(SchoolDto dto) {
		schoolRepository.save(dto);
	}

	@Override
	@Transactional
	public void deleteSchool(long id) {
		schoolRepository.deleteById(id);

	}

	@Override
	@Transactional
	public SchoolDto getSchoolDetails(long id) {
		return schoolRepository.findById(id).get();
	}

}
