package com.jsp.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {

	public static void main(String[] args) {
		
		//postman persistence
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("swastik");	
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		//Create a entity 1obj. employee
		Employee employee = new Employee();
		//employee.setId(1);
		employee.setName("x");
		employee.setEmail("fdf4xyw@mail.com");
		employee.setCno(35329868);
		
		entityTransaction.begin();
		entityManager.persist(employee);
         entityTransaction.commit();		
		
		
		
	}

}
