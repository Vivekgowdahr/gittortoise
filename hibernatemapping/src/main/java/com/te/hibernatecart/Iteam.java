/**
 * 
 */
package com.te.hibernatecart;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Iteam {

@Id
	private int iteamno;
	
	private double priceCart;
	
	@ManyToOne
	private Cart cart;
	
	public int getIteamno() {
		return iteamno;
	}
	public void setIteamno(int iteamno) {
		this.iteamno = iteamno;
	}
	public double getPriceCart() {
		return priceCart;
	}
	public void setPriceCart(double priceCart) {
		this.priceCart = priceCart;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	@Override
	public String toString() {
		return "Iteam [iteamno=" + iteamno + ", priceCart=" + priceCart + ", cart=" + cart + "]";
	}
	
	
}
