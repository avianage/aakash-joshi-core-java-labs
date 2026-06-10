package com.aakash.lab6.ex6;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lab6Ex6 {

	public static List<Integer> votersList(Map<Integer, LocalDate> dobMap) {

		List<Integer> voters = new ArrayList<>();
		LocalDate today = LocalDate.now();

		for (Map.Entry<Integer, LocalDate> entry : dobMap.entrySet()) {

			int id = entry.getKey();
			LocalDate dob = entry.getValue();

			int age = Period.between(dob, today).getYears();

			if (age > 18) {
				voters.add(id);
			}
		}

		return voters;
	}

	public static void main(String[] args) {

		Map<Integer, LocalDate> people = new HashMap<>();

		people.put(101, LocalDate.of(2000, 5, 10));
		people.put(102, LocalDate.of(2010, 8, 15));
		people.put(103, LocalDate.of(1995, 1, 20));
		people.put(104, LocalDate.of(2008, 12, 5));

		List<Integer> result = Lab6Ex6.votersList(people);

		System.out.println("Eligible Voters: " + result);
	}
}