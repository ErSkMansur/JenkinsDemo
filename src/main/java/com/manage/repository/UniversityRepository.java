package com.manage.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.manage.entity.UniversityDto;

public interface UniversityRepository extends JpaRepository<UniversityDto, Long> {
  
	@Query(value="select * from university u where u.name=:uname",nativeQuery = true)
	public UniversityDto findByName(@Param (value = "uname") String name);
}
