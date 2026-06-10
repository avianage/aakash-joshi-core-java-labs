package com.aakash.lab6.ex5;

import java.util.ArrayList;
import java.util.Collections;

public class Lab6Ex5 {

	public static int getSecondSmallest(int[] arr) {

		ArrayList<Integer> list = new ArrayList<>();

		for (int num : arr) {
			list.add(num);
		}

		Collections.sort(list);

		int smallest = list.get(0);

		for (int i = 1; i < list.size(); i++) {
			if (list.get(i) > smallest) {
				return list.get(i);
			}
		}

		throw new IllegalArgumentException("No second smallest element found");
	}

	public static void main(String[] args) {

		int[] arr = { 5, 1, 3, 2 };

		int result = Lab6Ex5.getSecondSmallest(arr);

		System.out.println("Second smallest: " + result);
	}
}