package com.aakash.lab1.ex5;

import java.util.Scanner;

public class Lab1Ex5 {
	static int calculateSum(int n) {
		int output = 0;
		for (int i = 2; i <=n; i++) {
			if ((i % 3 == 0) || (i % 5 == 0)) {
				output +=i;
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("\nCalculate the sum of the first n natural numbers that are divisible by 3 or 5.");
		System.out.println("\nEnter Number: ");
		int n = sc.nextInt();
		System.out.println(calculateSum(n));
		sc.close();
		
	}
}
