package com.employeedept.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeedept.entities.Employee;
import com.employeedept.repository.EmployeeRepository;

@Service
public class EmployeeServiceimpl implements EmployeeService {
	@Autowired
	private EmployeeRepository repo;

	@Override
	public void saveemployee(Employee emp) {
		repo.save(emp);
	}

}
