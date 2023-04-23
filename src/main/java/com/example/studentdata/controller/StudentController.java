package com.example.studentdata.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentdata.bean.Student;
import com.example.studentdata.service.StudentService;



@RestController
public class StudentController {
	@Autowired
	StudentService studentservice;
	
	@RequestMapping("/students")
	public List<Student> getAllStudent(){
		
		return studentservice.getAllStudent();
		
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/students")
	public void addStudentect(@RequestBody Student student) {
		studentservice.addStudent(student);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/students/{id}")
	public void updateStudent(@PathVariable int id,@RequestBody Student student) {
		studentservice.updateStudent(id, student);
		
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/students/{id}")

	public void deleteStudent(@PathVariable int id) {
		studentservice.deleteSubject(id);
	}

}
