package com.g.onetoone.app;

import java.sql.Date;
import java.time.LocalDate;
import java.util.*;
import javax.persistence.*;

import com.g.onetoone.entities.Employee;
import com.g.onetoone.entities.EmployeeDetail;


public class Main1 {

 public static void main(String[] args) {

 EntityManagerFactory fact=Persistence.createEntityManagerFactory("JPA-PU");
 EntityManager em=fact.createEntityManager();
 
 Employee emp=new Employee();
 emp.setEmpId("E101");
 emp.setSalary(23000D);
 emp.setDesg("Developer");



 EmployeeDetail det=new EmployeeDetail();
 det.setEmpId("E101");
 det.setFirstName("Kavya");
 det.setLastName("Ande");
 det.setEmail("ande.kavya6@gmail.com");
 det.setDateOfBirth(Date.valueOf(LocalDate.of(1999, 3, 15)));
 
 emp.setDetails(det);
 em.getTransaction().begin();
 em.persist(det);
 em.persist(emp);
 em.getTransaction().commit();
 System.out.println("Record saved");
 em.close();

 }



}

