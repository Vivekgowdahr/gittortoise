package com.te.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
       Team player1 = new Team();
       player1.setId(1);
       player1.setName("Virat");
       player1.setSalary(20000);
       player1.setDesignation("Caption");
       
       Team player2 = new Team();
       player2.setId(2);
       player2.setName("Rahul");
       player2.setSalary(20000);
       player2.setDesignation("viceCaption");
       
       Team player3 = new Team();
       player3.setId(3);
       player3.setName("Rahul");
       player3.setSalary(20000);
       player3.setDesignation("viceCaption");
       
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("Team");
       EntityManager createEntityManager = emf.createEntityManager();
       EntityTransaction transaction = createEntityManager.getTransaction();
       transaction.begin();
       createEntityManager.persist(player1);
       createEntityManager.persist(player2);
       transaction.commit();
    }
}
