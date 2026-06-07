package com.aakash.lab3.ex1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Lab3Ex1 {
	public static void main(String[] args) {
		System.out.println("Write a Java program that reads a line of integers and displays each integer along with the sum of all integers. Use the StringTokenizer class.");
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter a line of integers seperated by spaces: ");
		String input = sc.nextLine();
		
		StringTokenizer tokenize= new StringTokenizer(input);
		
		int sum = 0;
		
		while (tokenize.hasMoreTokens()) {
			
			String token = tokenize.nextToken();
			
			try {
				int num = Integer.parseInt(token);
				sum += num;
			}
			catch (NumberFormatException e){
				System.out.println("Invalid integer skipped: '" + token + "'");
			}
			
		}
		
		System.out.println("\nSum of all integers: " + sum);
		
		sc.close();
		
	}
}
