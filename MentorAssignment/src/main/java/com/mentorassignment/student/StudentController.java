package com.mentorassignment.student;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

	@Autowired
	private StudentService studService;
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("/studentlist")
	public ModelAndView studentlist() {
		ModelAndView mav = new ModelAndView("studentlist");
		
		List<Student> listStudent = studService.listAll();
		
		mav.addObject("listStudent", listStudent);
		
		return mav;
	}
	
	@RequestMapping("/new")
	public String newStudentForm (Map<String, Object> model) {
		model.put("student", new Student());
		
		return "new_student";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveStudent(@ModelAttribute("student") Student student) {
		studService.save(student);
		
		return "redirect:/studentlist";
	}
	
	@RequestMapping("/edit")
	public ModelAndView editStudentForm(@RequestParam long rollno) {
		ModelAndView mav = new ModelAndView("edit_student");
		Student student = studService.get(rollno);
		mav.addObject("student", student);
		
		return mav;
	}
	
	@RequestMapping("/delete")
	public String deleteStudent(@RequestParam long rollno) {
		studService.delete(rollno);
		
		return "redirect:/studentlist";
	}
}
