package com.aakash.lab6.ex7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab6Ex7 {

	public static int[] getSorted(int[] arr) {

		List<Integer> list = new ArrayList<>();

		for (int num : arr) {
			StringBuilder sb = new StringBuilder(String.valueOf(num));
			int reversed = Integer.parseInt(sb.reverse().toString());
			list.add(reversed);
		}

		Collections.sort(list);

		int[] result = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			result[i] = list.get(i);
		}

		return result;
	}

	public static void main(String[] args) {

		int[] arr = { 123, 456, 124, 92 };

		int[] result = getSorted(arr);

		for (int num : result) {
			System.out.print(num + " ");
		}
	}
}