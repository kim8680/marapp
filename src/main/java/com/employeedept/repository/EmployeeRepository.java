package com.employeedept.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeedept.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
