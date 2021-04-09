package com.cts.service;

import java.util.List;

import com.cts.entities.Student;

/*Service Interface allows loose coupling between controller and service layer*/

public interface StudentService {

	public List<Student> findAll();
	public void save (Student student);
	public void deleteById(long rollno);
	public Student findById(long rollno);
}
