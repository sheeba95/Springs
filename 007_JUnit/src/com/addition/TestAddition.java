package com.addition;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddition {

	@Test
	public void addNumber() {
		System.out.println("number addition unit test!!!");
		MathsAddition ma = new MathsAddition();
		int c=6;
		int d = 5;
		int actualValue = ma.addNumber(c, d);
		int expectedValue = 11;
		
		assertEquals(expectedValue, actualValue);
		
	}
	@Test(timeout = 10)
	public void testGenerateRandomNumber() {
		double randomNumber[] = new double[100000];
		for(int i = 0; i<100000; i++) {
			randomNumber[i]=Math.random() + 1;
		}
	}
}
