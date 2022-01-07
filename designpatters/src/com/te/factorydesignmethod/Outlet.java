package com.te.factorydesignmethod;

public class Outlet {

	Company company;
	
	public void outlet(String sc) {
		if (sc.equalsIgnoreCase("Wrong")) {
			company=new Wrong();
//			company.tShirt();
//			company.Shoes();
//			company.jeans();
		}
		
		if (sc.equalsIgnoreCase("Nike")) {
			company=new Nike();
//			company.tShirt();
//			company.Shoes();
//			company.jeans();
		}
		
		if (sc.equalsIgnoreCase("Puma")) {
			company=new Puma();
//			company.tShirt();
//			company.Shoes();
//			company.jeans();
		}
	}
	
}
