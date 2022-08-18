package com.employeedept.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeedept.entities.Department;
import com.employeedept.services.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentRestController {
	
	@Autowired
	private DepartmentService dept;
	
	@PostMapping("/adminpage")
	public void savedepartment(@RequestBody Department depa) {
		dept.savedept(depa);
	}
	
}
