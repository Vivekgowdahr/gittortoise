package com.TY.OOP;

public class CaliculatornInh {
	static String battery;
	int manualKey;
	int operation;
	

public CaliculatornInh(int manualkey, int operation) {
		super();
		this.manualKey = manualkey;
		this.operation = operation;
	}


@Override
public String toString() {
	return "CaliculatornInh [manualkey=" + manualKey + ", operation=" + operation + "]";
}

}
