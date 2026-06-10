package com.aakash.lab3.ex4;

import java.util.Scanner;

public class Lab3Ex4 {
	static int modifyNumber(int num) {
		String numString = String.valueOf(num);
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i<numString.length() -1; i++) {
			char charF = numString.charAt(i);
			char charS = numString.charAt(i+1);
		
			int d1 = Character.getNumericValue(charF);
			int d2 = Character.getNumericValue(charS);
			
			int diff = Math.abs(d1 - d2);
			
			sb.append(diff);
		}
		
		sb.append(numString.charAt(numString.length() - 1));
		
		return Integer.parseInt(sb.toString());
	}
	
	public static void main(String[] args) {
		System.out.println("Create a method that accepts a number and modifies it so that each digit of the new number is the absolute difference between two consecutive digits of the original. The units-place digit remains as-is.");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		
		 System.out.println("Input:  " + num);
		System.out.println("Output: "+modifyNumber(num));
	
	}
}
