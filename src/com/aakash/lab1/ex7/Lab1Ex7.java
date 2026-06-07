package com.aakash.lab1.ex7;

import java.util.Scanner;

public class Lab1Ex7 {
	static boolean checkNumber(int n) {
		while (n > 0) {
			int a = n % 10;
			n = n / 10;
			
			int b = n % 10;
			if (b > a) {
				return false;
			}
			else {
				a = b;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nCreate a method to check if a number is an increasing number.");
		System.out.println("\nEnter Number: ");
		int n = sc.nextInt();
		
		System.out.println(checkNumber(n));
		sc.close();
	}
}
