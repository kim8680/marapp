package com.employeedept.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.employeedept.entities.Department;
import com.employeedept.services.DepartmentService;

@Controller
public class DepartmentController {
	
	@Autowired
	private DepartmentService service;
	
	@RequestMapping("/openpage")
	public String viewDeptpage() {
		return "dept_registration";
	}
	
	@RequestMapping("/deptpage")
	public String saveDeptpage(@ModelAttribute Department dept) {
		service.savedept(dept);
		return "dept_registration";
	}
	
}
