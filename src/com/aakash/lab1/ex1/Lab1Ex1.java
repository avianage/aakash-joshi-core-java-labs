package com.aakash.lab1.ex1;

import java.util.Scanner;

public class Lab1Ex1 {
	int num;
		
	public int sum() {
		int output = 0;
		while (num > 0) {
			int temp = num % 10;
			output += (temp * temp * temp);
			num = num / 10;
		}
		return output;
	}
	
	public static void main(String[] args) {
		Lab1Ex1 obj = new Lab1Ex1();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\nCreate a method to find the sum of the cubes of the digits of an n-digit number.");
		System.out.println("\n Enter Number: ");
		int n = sc.nextInt();
		obj.num = n;
		
		System.out.println(obj.sum());
		
		sc.close();
	}
}
