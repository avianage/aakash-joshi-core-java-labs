package com.aakash.lab3.ex2;

import java.util.Scanner;

public class Lab3Ex2 {
	
	static String getImage(String input) {
		
		String temp = input;
		StringBuffer rtemp = new StringBuffer(temp);
		
		rtemp.reverse();
		
		input = input + " | " + rtemp.toString();
		return input;
	}
	
	public static void main(String[] args) {
		System.out.println("Create a class with a method that generates the mirror image of a String, returning both strings separated by a pipe (|) symbol.");
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter String: ");
		String input = sc.next();
		
		System.out.println(getImage(input));
		
		sc.close();
	}
}
