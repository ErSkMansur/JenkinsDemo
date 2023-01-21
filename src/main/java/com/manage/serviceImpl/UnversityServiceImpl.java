package com.manage.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manage.entity.UniversityDto;
import com.manage.repository.UniversityRepository;
import com.manage.service.UniversityService;

@Service
public class UnversityServiceImpl implements UniversityService {

	@Autowired
	private UniversityRepository universityRepo;

	@Override
	@Transactional
	public List<UniversityDto> getAllUniversity() {

		return universityRepo.findAll();
	}

	@Override
	@Transactional
	public UniversityDto saveUniversity(UniversityDto dto) {

		return universityRepo.save(dto);
	}

	@Override
	@Transactional
	public void UpdateUniversity(UniversityDto dto) {

		universityRepo.save(dto);
	}

	@Override
	@Transactional
	public void deleteUniversity(Long id) {
		universityRepo.deleteById(id);

	}

	@Override
	@Transactional
	public UniversityDto getUniversityDetail(Long id) {

		return universityRepo.findById(id).get();
	}

}
