package com.te.singleton;

public class User {
public static void main(String[] args) {
	WhatsApp u1 = WhatsApp.helper();
	System.out.println(u1);
	WhatsApp u2 = WhatsApp.helper();
	System.out.println(u2);

}
}
