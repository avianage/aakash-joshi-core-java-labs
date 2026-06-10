package com.aakash.lab2.ex2;

import java.util.Arrays;
import java.util.Scanner;

public class Lab2Ex2 {
	
	static String[] sortStrings(String[] arr, int n) {
		int m;
		if (n%2 == 0) {
			m = n/2;
		} else {
			m = (n/2) + 1;
		}
		
		for (int i = 0; i <m; i++) {
			String temp = arr[i];
			arr[i] = temp.toUpperCase();
		}
		for (int i = m; i<n; i++) {
			String temp = arr[i];
			arr[i] = temp.toLowerCase();
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		System.out.println("Create a method that accepts an array of String objects, sorts them alphabetically, converts the left half to UPPERCASE and the right half to lowercase, and returns the resulting array.");
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of strings: ");
		int n = sc.nextInt();
		
		String arr[] = new String[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("\nEnter String "+ (i+1)+ ": ");
			arr[i] = sc.next();
		}
		
		Arrays.sort(arr);
		
		String[] output = sortStrings(arr, n);
		
		for (String a: output) {
			System.out.println(a);
		}
		
		sc.close();
	}
}
