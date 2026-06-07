package com.aakash.lab3.ex8;

import java.util.Scanner;

public class Lab3Ex8 {
	
	static boolean checkPositive(String input) {
		
		char[] charArray = input.toCharArray();
		
		for (int i = 0; i<charArray.length-1; i++) {
			char c1 = charArray[i];
			char c2 = charArray[i+1];
			
			int diff = (int)(c2) - (int)(c1);
			
			if (diff <= 0) {
				return false;
			}
			else {
				continue;
			}
			
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(" Create a method that accepts a String and checks if it is a positive string. A string is positive if each character comes after the previous character in alphabetical order (left to right). Return true if the string is positive.");
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		
		System.out.println("Positive String: " + checkPositive(input));
	}
}
