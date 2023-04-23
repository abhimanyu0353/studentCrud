package com.example.studentdata.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.studentdata.bean.*;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
