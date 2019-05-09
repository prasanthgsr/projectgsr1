package com.cg.onetoone.entities;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="student")
public class Student implements Serializable {
	
	@Id 
	private Integer studentId;
	private String name;
	
	//Every time a new Student is created,
	//Create Address as well!
	@OneToOne(cascade=CascadeType.PERSIST)
	//Reference to FORIENG KEY
	@JoinColumn(name="address_id")
	private Address address;

	
public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

public Student() {
	// TODO Auto-generated constructor stub
}

public Integer getStudentId() {
	return studentId;
}

public void setStudentId(Integer studentId) {
	this.studentId = studentId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Student(Integer studentId, String name) {
	super();
	this.studentId = studentId;
	this.name = name;
}




}
