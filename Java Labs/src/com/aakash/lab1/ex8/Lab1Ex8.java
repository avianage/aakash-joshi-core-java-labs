package com.aakash.lab1.ex8;

import java.util.Scanner;

public class Lab1Ex8 {
	static boolean checkNumber(int n) {
		if (n == 2) {
			return true;
		}
		if (n % 2 == 0) {
			return checkNumber(n/2);
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println("\nCreate a method to check if a number is a power of two.");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter Number: ");
		int n = sc.nextInt();
		
		System.out.println(checkNumber(n));
		sc.close();
	}
}
