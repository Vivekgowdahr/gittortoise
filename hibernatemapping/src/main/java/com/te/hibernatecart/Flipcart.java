package com.te.hibernatecart;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Flipcart {
public static void main(String[] args) {
	Iteam iteam = new Iteam();
	iteam.setIteamno(1);
	
	Cart cart = new Cart();
	cart.setId(101);
	cart.setName("Nike");
	cart.setCost(2500);
	iteam.setPriceCart(2560);

	Iteam iteam2 = new Iteam();
	iteam2.setIteamno(2);
	cart.setName("Puma");
	cart.setCost(2680);
	iteam2.setPriceCart(2750);
	
	Iteam iteam3 = new Iteam();
	iteam3.setIteamno(3);
	cart.setName("Wrong");
	cart.setCost(2600);
	iteam3.setPriceCart(2650);
	
	List<Iteam> aslist=Arrays.asList(iteam,iteam,iteam3);
	
	cart.setIteam(aslist);
	iteam.setCart(cart);
	iteam2.setCart(cart);
	iteam3.setCart(cart);
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Vivek");
	EntityManager cem = emf.createEntityManager();
	EntityTransaction transaction = cem.getTransaction();
	transaction.begin();
	cem.persist(cart);
	cem.persist(iteam);
	cem.persist(iteam2);
	cem.persist(iteam3);
	transaction.commit();
	
}
}
