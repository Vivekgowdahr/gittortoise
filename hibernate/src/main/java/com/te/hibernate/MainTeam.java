package com.te.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainTeam {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Team");
	EntityManager em= emf.createEntityManager();
	Team player = em.find(Team.class, 1);
	System.out.println(player);
	
	
}
}
