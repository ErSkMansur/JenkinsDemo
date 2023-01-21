package com.manage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manage.entity.SchoolDto;
import com.manage.exception.RecordNotFoundException;
import com.manage.service.SchoolService;
import com.manage.service.UniversityService;

@RestController
@RequestMapping(value = "/school")
public class SchoolController {
	@Autowired
	private SchoolService schoolService;
	@Autowired
	private UniversityService uniService;

	@PostMapping(value = "/save")
	public ResponseEntity<SchoolDto> save(SchoolDto dto) throws RecordNotFoundException{
		
		return new ResponseEntity<>(schoolService.save(dto),HttpStatus.CREATED);
		
	}
}
