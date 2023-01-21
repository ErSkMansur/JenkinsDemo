package com.manage.utility;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.manage.exception.RecordNotFoundException;

@ControllerAdvice
public class ControllerExceptionHandler {

	@ExceptionHandler(RecordNotFoundException.class)
	public ResponseEntity<?> recordNotFoundExceptionMethod(RecordNotFoundException recordNotFoundException) {
//Linked HAshMap use For Retrive in order 
		Map<String, Object> map = new LinkedHashMap<>();
		map.put("error", "Not Found");
		map.put("timestamp",LocalDateTime.now());
		map.put("details", recordNotFoundException.getMessage());

		return new ResponseEntity<>(map, HttpStatus.NOT_FOUND);
	}
}
