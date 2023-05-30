package Servlet_login_validation.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Servlet_login_validation.dto.Employeedta;

public class Employeedao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void create(Employeedta d1){
		entityTransaction.begin();
		entityManager.persist(d1);
		entityTransaction.commit();
	}
 
	public Employeedta login(String email) {
		Employeedta e1=entityManager.find(Employeedta.class, email);
		return e1;
	}
	
	

}
