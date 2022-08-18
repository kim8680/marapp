package com.employeedept.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.employeedept.entities.Employee;
import com.employeedept.services.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@RequestMapping("/firstpage")
	public String viewEmppage() {
		return "emp_registration";
	}
	
	@RequestMapping("/saveemployee")
	public String saveEmppage(@ModelAttribute("object")Employee emp,ModelMap model) {
		service.saveemployee(emp);
		model.addAttribute("msg", "record saved!!");
		return "emp_registration";
	}
}
