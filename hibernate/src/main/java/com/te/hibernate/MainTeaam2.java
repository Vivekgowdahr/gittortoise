package com.te.hibernate;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jboss.jandex.Main;

public class MainTeaam2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of player you need");
	int num=sc.nextInt();
	Team player = new Team();
	for (int i = 0; i < num; i++) {
		System.out.println("enter the Id of th Player");
		int id=sc.nextInt();
		player.setId(id);
		System.out.println("Enter the name of the player");
		String name=sc.next();
		player.setName(name);
		System.out.println("Enter the salary of the player");
		double salary=sc.nextDouble();
		player.setSalary(salary);
		System.out.println("Enter the designation of the player");
		String designation=sc.next();
		player.setDesignation(designation);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Team");
	       EntityManager createEntityManager = emf.createEntityManager();
	       EntityTransaction transaction = createEntityManager.getTransaction();
	       transaction.begin();
	       createEntityManager.persist(player);
	       transaction.commit();
		
	}
}
}
