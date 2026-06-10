package com.aakash.lab1.ex6;

import java.util.Scanner;

public class Lab1Ex6 {
	static int calculateDifference(int n) {
		return (n * (n+1) * (2*n + 1)/6) - (n*(n+1)/2)*(n*(n+1)/2);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nCreate a class with a method to find the difference between the sum of squares and the square of the sum of the first n natural numbers.");
		System.out.println("\n Enter Number: ");
		int n = sc.nextInt();
		
		System.out.println(calculateDifference(n));
		
	}
}
