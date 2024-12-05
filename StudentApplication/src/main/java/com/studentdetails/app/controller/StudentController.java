package com.studentdetails.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.studentdetails.app.entity.StudentEntity;
import com.studentdetails.app.repository.StudentRepository;

@RestController
public class StudentController {
	
	@Autowired
	StudentRepository studentRepository;
	//API to get all students
	//localhost:9091/students
	@GetMapping("/students")
	public List<StudentEntity> getAllStudents(){
		List<StudentEntity> student = studentRepository.findAll();
		return student;
	}
	
	//localhost:9091/students
		@GetMapping("/students/{id}")
		public StudentEntity getStudentById(@PathVariable int id){
			StudentEntity student_id = studentRepository.findById(id).get();
			return student_id;
		}

		@PostMapping("/students/add")
		@ResponseStatus(code =  HttpStatus.CREATED)
		public ResponseEntity<String> createStudent(@RequestBody StudentEntity student) {
		    studentRepository.save(student); // Save the student
		    return ResponseEntity.ok("User Added Successfully"); // Return the response with status 200 OK
		}
		
		@PutMapping("/student/update/{id}")
		public StudentEntity updateStudentByID(@PathVariable int id){
			StudentEntity student_update = studentRepository.findById(id).get();
			student_update.setName("Balaji");
			student_update.setBranch("Boom Boom");
		    studentRepository.save(student_update); // Save the student
		   // return ResponseEntity.ok("User Added Successfully"); // Return the response with status 200 OK

			return student_update;
			
		}
		
		
		@DeleteMapping("/student/delete/{id}")
		public void deleteStudent(@PathVariable int id){
			StudentEntity student_delete = studentRepository.findById(id).get();
			studentRepository.delete(student_delete);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
