package com.mentorassignment.student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studRepo;
	
	public List<Student> listAll(){
		return (List<Student>) studRepo.findAll();
	}
	public void save(Student student) {
		studRepo.save(student);
	}
	public Student get(long rollno) {
		Optional<Student> result = studRepo.findById(rollno);
		return result.get();
	}
	public void delete (long rollno) {
		studRepo.deleteById(rollno);
	}
}
