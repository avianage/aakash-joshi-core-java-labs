package com.aakash.lab2.ex1;

import java.util.Scanner;

public class Lab2Ex1 {
	
	static int getSecondSmallest(int[] array, int n) {
		if (n <= 1) {
			return -1;
		}
		else if (n == 2) {
			if (array[0] > array[1]) {
				return array[0];
			}
			else {
				return array[1];
			}
		} else {
			int a = array[0];
			int b = array[1];
			
			if (a > b) {
				array[0] = b;
				array[1] = a;
			}
			else {
				array[0] = a;
				array[1] = b;
			}
			
			for (int i = 2; i < n;i++) {
				if (array[i] >= array[1]) {
					continue;
				}
				else {
					int x = array[0];
					int y = array[1];
					int z = array[i];
					
					if (x >= z) {
						array[1] = x;
						array[0] = z;
						array[i] = y;
					}
					else {
						array[1] = z;
					}
					
				}
			}
		}
		
		return array[1];
	}
	
	public static void main(String[] args) {
		System.out.println("\nCreate a method that accepts an array of integers and returns the second smallest element.");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter Number of Elements in the Array: ");
		int n = sc.nextInt();
		
		int arr[] = new int[5];
		for (int i=0; i<n;i++) {
			System.out.println("\nEnter number "+ (i+1) +" :");
			int temp = sc.nextInt();
			arr[i] = temp;
		}
		
		System.out.println("\n ");
		
		System.out.println("\nThe Second Smallest Number in the Array is "+ getSecondSmallest(arr, n));
		
		sc.close();
	
	}
}
