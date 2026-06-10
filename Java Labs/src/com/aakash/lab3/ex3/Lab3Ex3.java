package com.aakash.lab3.ex3;

import java.util.Scanner;

public class Lab3Ex3 {
	
	static String alterString(String input) {
		char[] charArray = input.toCharArray();
		
		for(int i = 0; i < charArray.length; i++) {
			char c = charArray[i];
			if ((c == 'a') || (c == 'e') || (c == 'i') ||(c == 'o') || (c == 'u')|| (c == 'A') || (c == 'E') || (c == 'I')|| (c == 'O') || (c == 'U')) {
				continue;
			}
			else if (c == 'z') {
				charArray[i] = 'a';
			}
			else if (c == 'Z') {
				charArray[i] = 'A';
			}
			else {
				charArray[i] = (char)((int)(c) +1);
			}
		}
		
		input = input + " -> ";
		
		for (char c: charArray) {
			input += c;
		}
		
		return input;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Create a method that accepts a String and replaces all consonants with the next alphabet in the sequence.");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String: ");
		String input = sc.next();
		
		System.out.println(alterString(input));
		
		
		sc.close();
	}
}
