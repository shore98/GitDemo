package com.cts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dao.StudentRepository;
import com.cts.entities.Student;

@Service			//marks service layer which contains logic
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studRepo;
	
	//Gets all student
	@Override
	public List<Student> findAll(){
		return studRepo.findAll();
	}
	
	//Saves student
	@Override
	public void save (Student student) {
		studRepo.save(student);
	}
	
	//Deletes student
	@Override
	public void deleteById(long rollno) {
		studRepo.deleteById(rollno);
	}
	
	//Gets student by id (roll number)
	public Student findById(long rollno) {
		Optional<Student> result = studRepo.findById(rollno);
		return result.get();
	}
}
