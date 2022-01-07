package com.te.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class AllInOneJpqlHyber {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Team");
		EntityManager em = emf.createEntityManager();
		
		
		//to get all Data from the table//
//		String quary = "from Team";
//		Query createQuery = em.createQuery(quary);
//		List<Team> resultList = createQuery.getResultList();// Will get every data from the table
//		for (Team team : resultList) {
//			System.out.println(team);}
		
		//to get single data from the table//
		
			String quary2="from Team where id=5";
			Query createQuery2 = em.createQuery(quary2);
			Object singleResult2 = createQuery2.getSingleResult();// to get single element from the DB
			System.out.println(singleResult2);
		
		
		// to get single data with the condition//
//			
//			String quary3="select max(salary) from Team";
//			Query createQuery3 = em.createQuery(quary3);
//			Object singleResult3 = createQuery3.getSingleResult();
//			System.out.println(singleResult3);
			
			
//			// update the database
//			EntityTransaction transaction = em.getTransaction();
//			String quary4="update Team set salary=2000  where id=4";
//			transaction.begin();
//			Query createQuery4 = em.createQuery(quary4);
//			int executeUpdate = createQuery4.executeUpdate();
//			transaction.commit();
			
			
			
//			//deleting the data from the table
//		String quary5="delete from Team where id=6";
//		EntityTransaction transaction = em.getTransaction();
//		transaction.begin();
//		Query createQuery5 = em.createQuery(quary5);
//		int executeUpdate = createQuery5.executeUpdate();
//		transaction.commit();
//		
		
		}
	}