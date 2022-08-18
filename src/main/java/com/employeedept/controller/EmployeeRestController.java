package com.employeedept.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeedept.entities.Employee;
import com.employeedept.services.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController {
	
	@Autowired
	private EmployeeService serv;
	
	@PostMapping("/userpage")
	public void getAllemployee(@RequestBody Employee emp) {
		serv.saveemployee(emp);
	}
}
