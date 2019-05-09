package com.cg.onetoone.app;
import javax.persistence.*;

import com.cg.onetoone.entities.Address;
import com.cg.onetoone.entities.Student;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory fact = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = fact.createEntityManager();
		
		Address address = new Address();
		address.setAddressId(10001);
		address.setCity("Chennai");
		address.setState("Tamilnadu");
		address.setZipcode("600130");
		address.setStreet("Old Mahabalipuram Road");
		
		Student st = new Student();
		st.setAddress(address);
		st.setName("Hemanth");
		st.setStudentId(11011);
		
		EntityTransaction tn = em.getTransaction();
		
		try {
			tn.begin();
			em.persist(st); // No need of em.persist(address)
			tn.commit();
		}catch(Exception ex) {
			ex.printStackTrace();
			if(tn!=null) {
				tn.rollback();
			}
		}



	}

}
