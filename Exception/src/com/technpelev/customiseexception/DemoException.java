package com.technpelev.customiseexception;

public class DemoException {
	public static void main(String[] args) throws Exception {
		int i = 5;
		if (i < 10) {
			throw new Exception();
		}
	}
}