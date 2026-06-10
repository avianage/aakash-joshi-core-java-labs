package com.aakash.lab1.ex4;

import java.util.Scanner;

public class Lab1Ex4 {
	
	static void outputPrime(int n) {
		System.out.println(2);
		for (int i = 3; i <= n; i++) {
			for (int j = 2; j <= i;j++) {
				if ((i % j == 0) && (i == j)) {
					System.out.println(i);
				} else if (i % j == 0) {
					break;
				} else {
					continue;
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nWrite a Java program that prompts the user for an integer and then prints all prime numbers up to that integer.");
		
		System.out.println("\nEnter number: ");
		int n = sc.nextInt();
		
		outputPrime(n);
		
		sc.close();
	}
}
