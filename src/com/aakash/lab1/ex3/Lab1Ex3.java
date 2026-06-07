package com.aakash.lab1.ex3;

public class Lab1Ex3 {
	static int recursive(int n) {
		if (n == 1) {
			return 1;
		}
		else if (n == 2) {
			return 1;
		}
		else {
			int output = recursive(n - 1) + recursive(n - 2);
			return output;
		}
		
	}
	
	static int nonRecursive(int n) {
		int a = 1;
		int b = 1;
		
		for (int i = 3; i <=n; i++) {
			int output = a + b;
			a = b;
			b = output;
		}
		return b;
	}
	
	public static void main(String[] args) {
		int n = 10;
		
		System.out.println("\nThe Fibonacci sequence is defined by the following rule: the first 2 values are 1, 1; every subsequent value is the sum of the 2 preceding values. Write a Java program that uses both recursive and non-recursive functions to print the nth value of the Fibonacci sequence.");

		System.out.println("\n Recursive Output:" + recursive(n)); 
		System.out.println("\n Non - Recursive Output:" + nonRecursive(n));
	}
}
