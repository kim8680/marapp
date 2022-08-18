package com.employeedept.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeedept.entities.Department;
import com.employeedept.repository.DepartmentRepository;
@Service
public class DepartmentServiceimpl implements DepartmentService {
	@Autowired
	private DepartmentRepository repo;

	@Override
	public void savedept(Department dept) {
		repo.save(dept);
	}

}
