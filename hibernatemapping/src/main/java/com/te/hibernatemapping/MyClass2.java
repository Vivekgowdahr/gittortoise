package com.te.hibernatemapping;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MyClass2 {// this class is used to get one to many mapping
public static void main(String[] args) {
	Girl girl = new Girl();
	girl.setGid(420);
	girl.setName("Ash");
	
	
	Boy boy1 = new Boy();
	boy1.setBid(101);
	boy1.setName("Salman");
	boy1.setBalance(100);
	
	
	Boy boy2= new Boy();
	boy2.setBid(102);
	boy2.setName("Vivek Oberai");
	boy2.setBalance(1200);
	
	Boy boy3= new Boy();
	boy3.setBid(103);
	boy3.setName("Abhisheake");
	boy3.setBalance(2000);
	
	
	List<Boy> List =Arrays.asList(boy1,boy2,boy3);
	girl.getBoys();
	boy1.setGirl(girl);
	boy2.setGirl(girl);
	boy3.setGirl(girl);

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Vivek");
	EntityManager cm = emf.createEntityManager();
	EntityTransaction transaction = cm.getTransaction();
	transaction.begin();
	cm.persist(boy1);
	cm.persist(boy2);
	cm.persist(boy3);
	cm.persist(girl);
	transaction.commit();
}
}