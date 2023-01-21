package com.manage.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manage.entity.UniversityDto;
import com.manage.exception.DuplicateRecordException;
import com.manage.exception.RecordNotFoundException;
import com.manage.repository.UniversityRepository;
import com.manage.service.UniversityService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RequestMapping(value = "/University")
@RestController
public class UnivercityContoller {

	@Autowired
	private UniversityService universityService;

	@Autowired
	private UniversityRepository universityRepo;

	@GetMapping("/getAllUniversity")
	public ResponseEntity<?> getUniversityList() throws RecordNotFoundException {
		if (!universityService.getAllUniversity().isEmpty()) {
			return new ResponseEntity<>(universityService.getAllUniversity(), HttpStatus.OK);
		} else {
			throw new RecordNotFoundException("Univercitu List is Empty");
		}

	}

	@PostMapping("/save")
	public ResponseEntity<UniversityDto> save(UniversityDto dto) throws DuplicateRecordException {
		UniversityDto opt= universityRepo.findByName(dto.getName());
 		if (opt.equals(dto.getName())) {
 			throw new DuplicateRecordException("UniverCity Is AlReady Exist");
		
		} else {
			
			return new ResponseEntity<>(universityService.saveUniversity(dto), HttpStatus.OK);
		}
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<?> update(@RequestBody UniversityDto dto) throws RecordNotFoundException{
		if(universityRepo.existsById(dto.getId())) {
			universityService.UpdateUniversity(dto);
			return new ResponseEntity<>("University of id="+dto.getId()+"has Updated",
					HttpStatus.ACCEPTED);
		}
		else {
			throw new RecordNotFoundException("id "+dto.getId()+"is Not found");
		}
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") long id) throws RecordNotFoundException{
		Optional<UniversityDto> opt=universityRepo.findById(id);
		if(opt.isPresent()) {
			universityService.deleteUniversity(id);
			return new ResponseEntity<>("id="+id+"deleted",HttpStatus.OK);
		}
		else {
			throw new RecordNotFoundException("id="+id+"not Exist");
		}
		
	}
}
