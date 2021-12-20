package com.te.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;


@TestInstance(Lifecycle.PER_CLASS)
class CaliculatorTest {
	
	Caliculator caliculator;
	@AfterAll
	public void afterAll() {
	System.out.println("After all");	
	}
	

	@BeforeEach // before all the method it will get displaid
	void init() {
		caliculator = new Caliculator();// we can use this ,insted of creating new object in all the methos
		System.out.println("New instance method");
	}

	@Test
	void add() {
		Caliculator caliculator = new Caliculator();
		assertEquals(4, caliculator.add(2, 2));
	}

	@Test // if we want to exicute we shou;d write test
	//@Disabled // if we want to stop the exicution of the program tn we should use this
	@DisplayName("sub") // it changes the display name
	void sub() {
		Caliculator caliculator = new Caliculator();
		assertEquals(4, caliculator.sub(6, 2));
	}

	@AfterEach // it will exicuted after all the method exicution
	void afterAllOperation() {
		System.out.println("process completed");
	}

	@Test
	@DisplayName("Dividing it")
	void divide() {
	//	Caliculator caliculator = new Caliculator();
	//	assertEquals(0, caliculator.divide(1, 0));
		assertThrows(ArithmeticException.class,()->caliculator.divide(1, 0));
	}

	@Test
	void areaOfCircle() {
		Caliculator caliculator = new Caliculator();// we should use tz for all so we have one more method
		assertEquals(314.159265358979323846, caliculator.areaOfCircle(10));
	}
	@BeforeAll
	static public void beforeall() {
		System.out.println("before all");
	
	}

}
