package com.aakash.lab6.ex3;

import java.util.HashMap;
import java.util.Map;

public class SquareMap {

	public static Map<Integer, Integer> getSquares(int[] arr) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int num : arr) {
			map.put(num, num * num);
		}

		return map;
	}

	public static void main(String[] args) {

		int[] arr = { 2, 3, 4, 5 };

		Map<Integer, Integer> result = SquareMap.getSquares(arr);

		System.out.println(result);
	}
}