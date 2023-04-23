package com.example.studentdata.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentdata.bean.Student;
import com.example.studentdata.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository studentrepo;
//retreiving
public List<Student> getAllStudent(){
	
	List<Student> students=new ArrayList<>();
     studentrepo.findAll().forEach(students::add);
     return students;
		
	}
//adding 
public void addStudent(Student student) {
	studentrepo.save(student);
	
}
//updating
//save method can be used to add or update data in databse
public void updateStudent(int id, Student student) {
	studentrepo.save(student);	
}
public void deleteSubject(int id) {
	studentrepo.deleteById(id);
	
}

}
