package com.techno.set_assig;

import javax.swing.text.Position;

public class Team {
	
	int num;
	String name;
	int age;
	String position;
	static int count; 
	int count1;

	public void verify(int count1) {
		if (count1 > 11) {
	throw new NotEligible("can't add players");
}
		
		
	}

	public Team(int num,String name, int age ,String Position ) {
		super();
		count++;
		this.num = num;
		this.name = name;
		this.age = age;
		this.position=position;
		this.verify(count);
		//this.count1 = count1;
	}

	@Override
	public String toString() {
		return "Team [num=" + num + ", name=" + name + ", age=" + age + ", position=" + position + ", count1=" + count1
				+ "]";
	}

	
	
	
}
