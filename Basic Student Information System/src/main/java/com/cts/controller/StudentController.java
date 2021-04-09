package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.entities.Student;
import com.cts.service.StudentService;

@Controller
@RequestMapping("/")
public class StudentController {

	//Inject dependency implicitly
	@Autowired
	private StudentService studService;

	/*Map the home page and display it*/
	@RequestMapping("/")  											
	public String displayHome() {
		return "view/home";  										
	}

	/*Map the Student List page and display all the students*/
	@RequestMapping("/studentlist")								
	public String studentlist(Model model) {
		List<Student> student = studService.findAll();				
		model.addAttribute("student", student);						
		return "view/studentList";									
	}

	/*Map the New Student Form page and add supplied attributes to the model*/
	@RequestMapping("/new")													
	public String addStudent(Model model) {
		Student student = new Student();							
		model.addAttribute("student", student);						
		return "view/newstudent";									
	}

	/*Saves the student*/
	@PostMapping("/save")
	public String saveStudent(Student student, Model model) {
		studService.save(student);
		return "redirect:/studentlist";
	}
	 /*Deletes the student by using roll number as id*/
	@PostMapping("/delete/{id}")
	public String deleteUndelCar(Model model, Student student, @PathVariable("id") long rollno) {
		studService.deleteById(rollno);
		return "redirect:/studentlist";
	}
	
	/*Map the Edit Student Form page where the details are fetched by using roll number as id*/
	@RequestMapping("/edit/{id}")
	public String editStudent(@PathVariable("id") long rollno, Model model) {
		Student student = studService.findById(rollno);
		model.addAttribute("student", student);
		return "view/editstudent";
	}
}
