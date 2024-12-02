package com.nt.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.Binding.Student;
import com.nt.Entity.StudentEntity;
import com.nt.Repository.StundentRepositary;

@Controller
public class StudentController {

	@Autowired
	private StundentRepositary studentrepo;

	@GetMapping("/")
	public String loadForm(Model model) {

		loadModel(model);

		return "index";
	}

	private void loadModel(Model model) {
		List<String> coursesList = new ArrayList<String>();
		coursesList.add("Java");
		coursesList.add("Python");
		coursesList.add("AWS");
		coursesList.add("C++");

		List<String> timingsList = new ArrayList<String>();
		timingsList.add("Morning");
		timingsList.add("Afternoon");
		timingsList.add("Evening");

		model.addAttribute("timings", timingsList);
		model.addAttribute("courses", coursesList);

		Student s1 = new Student();
		model.addAttribute("students", s1);

	}

	@PostMapping("/save")
	public String handleSubmit(Student s, Model model) {
		System.out.println(s);
		
		StudentEntity entity=new StudentEntity();
		
		BeanUtils.copyProperties(s, entity);
		
		entity.setTimings(Arrays.toString(s.getTimings()));
		
		studentrepo.save(entity);

		loadModel(model);
		model.addAttribute("msg", "Student saved");
		return "index";
	}
	
	@GetMapping("/viewStudents")
	public String getstudentsData(Model model) {
		
		List<StudentEntity> studentList= studentrepo.findAll();
		model.addAttribute("students", studentList);
		
		return "data";
	}

}
