package com.te.hibernate;

import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainTeam3 {
	public static final Logger LOGGER=Logger.getLogger(MainTeam3.class.getName());
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Team");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();

    //Deleting thr data
		Team vk = em.find(Team.class, 1);
		
		transaction.begin();
		em.remove(vk);
		transaction.commit();
		LOGGER.config("HI MY NAME ");
//		
		
		//Updating the data
		
//		Team kl=em.find(Team.class, 2);
//		if (kl!=null) {
//			kl.setDesignation("caption");
//			transaction.begin();
//			transaction.commit();
//			System.out.println("update");
//		}
//		

	}
}
