package com.aakash.lab2.ex3;

import java.util.Arrays;
import java.util.Scanner;

public class Lab2Ex3 {
	
	static int[] getSorted(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			String num = String.valueOf(arr[i]);
			String rev = new StringBuilder(num).reverse().toString();
			arr[i] = Integer.parseInt(rev);
			
		}
		
		Arrays.sort(arr);
		
		return arr;
	}
	
	public static void main(String[] args) {
		System.out.println("Create a method that accepts an integer array, reverses the digits of each number in the array, and returns the resulting array in sorted order.");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter number of integers: ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for (int i =0; i<n;i++) {
			System.out.println("\nEnter number "+ (i + 1)+ ": ");
			arr[i] = sc.nextInt();
		}
		
		int[] output = getSorted(arr, n);
		
		for (int a: output) {
			System.out.println(a);
		}
	
	}
}
