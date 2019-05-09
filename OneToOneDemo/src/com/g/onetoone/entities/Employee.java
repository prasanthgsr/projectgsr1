package com.g.onetoone.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity @Table(name="employees")
public class Employee implements Serializable{

	@Id
	@Column(name="empId")
	private String empId;
	
	@Column(name="desg",length=30)
	private String desg;

	@Column(name="salary",precision=10, scale=2)
	private Double salary;
	@OneToOne private EmployeeDetail details;
	
	public EmployeeDetail getDetails() {
		return details;
	}

	public void setDetails(EmployeeDetail details) {
		this.details = details;
	}

	public String getEmpId() {
		
		return empId;
	}
	
	public Employee() {
		super();
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}
	
	
}
