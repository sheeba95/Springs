package com.addition;

public class MainAddition {

	public static void main(String[] args) {
		int a=10;
		int b=5;
		
		MathsAddition ma = new MathsAddition();
		int result = ma.addNumber(a,b);
		System.out.println(result);
	}

}
