package com.te.hibernatemapping;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Myclass {
public static void main(String[] args) {
	Girl girl = new Girl();
	girl.setGid(1);
	girl.setName("Ash");
	
	
	
	Boy boy = new Boy();
	boy.setBid(101);
	boy.setName("Abhisheake");
	boy.setBalance(2000);
	

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Vivek");
	EntityManager cm = emf.createEntityManager();
	EntityTransaction transaction = cm.getTransaction();
	transaction.begin();
	cm.persist(boy);
	cm.persist(girl);
	transaction.commit();
}
}

