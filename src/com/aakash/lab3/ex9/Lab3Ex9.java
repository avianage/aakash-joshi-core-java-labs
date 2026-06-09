package com.aakash.lab3.ex9;

import java.util.Scanner;

public class Lab3Ex9 {
	
	static String getRelative(String input) {
		
		
		
		return input;
	}
	
	public static void main(String[] args) {
		System.out.println(" Create a method that accepts a date and prints the duration in days, months, and years relative to the current system date.");

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Date (DD/MM/YYYY): ");
		String input = sc.next();
		
		System.out.println("Relative Time till given date: " + getRelative(input));
	}
	
}
