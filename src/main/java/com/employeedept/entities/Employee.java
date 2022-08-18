package com.employeedept.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id",length=5,unique=true,nullable=false)
	private long empid;
	
	@Column(name="name",length=30,nullable=false)
	private String name;
	
	@OneToMany(mappedBy = "employee", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
	private Set<Department> dep;
	

	public Employee(long empid, String name, Set<Department> dep) {
		super();
		this.empid = empid;
		this.name = name;
		this.dep = dep;
	}

	public long getEmpid() {
		return empid;
	}

	public void setEmpid(long empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Department> getDep() {
		return dep;
	}

	public void setDep(Set<Department> dep) {
		this.dep = dep;
	}
	
	
}
