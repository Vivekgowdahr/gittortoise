package com.te.singleton;

public class WhatsApp {
	private static WhatsApp whatsapp;// we will make it privatebcs we should restrict the use to use only one object

//	private WhatsApp() {
//	}

	static WhatsApp helper() {
		if (whatsapp == null) {// to return the objet which is created and it should not return any new object
			whatsapp = new WhatsApp();
			return whatsapp;
		}
		return whatsapp;

	}
}
