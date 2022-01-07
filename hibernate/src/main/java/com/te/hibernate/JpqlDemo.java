package com.te.hibernate;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JpqlDemo {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Team");
	EntityManager cm = emf.createEntityManager();
	String Quary="from Team";
	Query createQuery = cm.createQuery(Quary);
	List<Team> resultList = createQuery.getResultList();
	for (Team team : resultList) {
		System.out.println(team);
		
		
		
	}
}
}
