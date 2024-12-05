package com.studentdetails.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentdetails.app.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity,Integer>{
	

}
