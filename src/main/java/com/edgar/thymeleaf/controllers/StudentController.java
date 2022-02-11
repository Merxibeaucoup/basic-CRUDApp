package com.edgar.thymeleaf.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.edgar.thymeleaf.models.Student;
import com.edgar.thymeleaf.services.StudentServices;

@Controller
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentServices serv;

	@RequestMapping("/getAll")
	public String getAll(Model model) {
		List<Student> listStudent = serv.getAll();
		model.addAttribute("listStudent", listStudent);

		String username = "edgar";
		model.addAttribute("username", username);

		return "students";

	}

	@RequestMapping("/getOne")
	@ResponseBody
	public Student getOne(Integer id) {
		return serv.getOne(id);

	}

	@PostMapping("/addNew")
	public String addNew(Student student) {
		serv.addNew(student);
		return "redirect:/students/getAll";

	}

	@RequestMapping(value = "/update", method = { RequestMethod.PUT, RequestMethod.GET })
	public String update(Student student) {
		serv.update(student);
		return "redirect:/students/getAll";
	}

	@RequestMapping(value = "/delete", method = { RequestMethod.DELETE, RequestMethod.GET })
	public String delete(Integer id) {
		serv.delete(id);
		return "redirect:/students/getAll";
	}
	
	
	

	
	
	
	
}
