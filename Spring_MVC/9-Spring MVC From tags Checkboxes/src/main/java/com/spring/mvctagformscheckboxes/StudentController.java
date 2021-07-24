package com.spring.mvctagformscheckboxes;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
@RequestMapping("/student")
public class StudentController {

	Logger logger = Logger.getLogger(StudentController.class.getName());

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		// create a student object
		Student theStudent = new Student();
		
		// add student object to the model
		theModel.addAttribute("student", theStudent);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		
		// log the input data
		logger.log(Level.INFO,"theStudent: " + theStudent.getFirstName()
							+ " " + theStudent.getLastName()+" "+theStudent.getCountry()+" "+theStudent.getFavLang());
		
		return "student-confirmation";
	}
	
}









