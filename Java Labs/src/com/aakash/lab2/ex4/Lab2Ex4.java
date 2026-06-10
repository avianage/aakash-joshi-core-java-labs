package com.aakash.lab2.ex4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Lab2Ex4 {
	
	static int[] modifyArray(int[] arr) {
		
		return Arrays.stream(arr)
				.distinct()	//remove duplicate
				.boxed()		//box int to Integer
				.sorted(Comparator.reverseOrder()) //sort desc
				.mapToInt(Integer::intValue) //unbox to int
				.toArray(); // convert to arr

	}
	
	
	public static void main(String[] args) {
		System.out.println("Create a method that accepts an integer array, removes all duplicates, and returns the resulting array in descending order.");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter number of integers: ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for (int i =0; i<n;i++) {
			System.out.println("\nEnter number "+ (i + 1)+ ": ");
			arr[i] = sc.nextInt();
		}
		
	
	}
}
