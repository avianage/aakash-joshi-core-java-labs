package com.aakash.lab6.ex4;

import java.util.HashMap;
import java.util.Map;

public class Lab6Ex4 {

	public static HashMap<Integer, String> getStudents(HashMap<Integer, Integer> marksMap) {

		HashMap<Integer, String> result = new HashMap<>();

		for (Map.Entry<Integer, Integer> entry : marksMap.entrySet()) {

			int regNo = entry.getKey();
			int marks = entry.getValue();

			if (marks >= 90) {
				result.put(regNo, "Gold");
			} else if (marks >= 80) {
				result.put(regNo, "Silver");
			} else if (marks >= 70) {
				result.put(regNo, "Bronze");
			}
		}

		return result;
	}

	public static void main(String[] args) {

		HashMap<Integer, Integer> students = new HashMap<>();

		students.put(101, 95);
		students.put(102, 82);
		students.put(103, 74);
		students.put(104, 65);
		students.put(105, 97);

		HashMap<Integer, String> medals = Lab6Ex4.getStudents(students);

		System.out.println(medals);
	}
}