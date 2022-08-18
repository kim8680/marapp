package com.employeedept.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeedept.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
