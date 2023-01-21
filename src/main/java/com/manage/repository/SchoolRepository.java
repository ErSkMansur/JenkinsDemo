package com.manage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manage.entity.SchoolDto;

@Repository
public interface SchoolRepository extends JpaRepository<SchoolDto, Long>  {

}
