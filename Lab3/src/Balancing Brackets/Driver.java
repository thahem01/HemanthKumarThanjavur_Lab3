package com.gl.services;

public class Driver {

public static void main(String[] args) {

		//Balanced Brackets String expr//
		String expr = "([[{}]])";
		
		//Not Balanced Brackets String expr//
		//String expr = "([{}]]))";

		if (BalancingBrackets.areBracketsBalanced(expr))
			System.out.println("The entered String has Balanced Brackets");
		else
			System.out.println("The entered String do not contain Balanced Brackets");
	}
}
