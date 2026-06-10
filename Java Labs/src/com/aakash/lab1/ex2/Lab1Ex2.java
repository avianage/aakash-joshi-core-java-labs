package com.aakash.lab1.ex2;

import java.util.Scanner;

public class Lab1Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nWrite a Java program that simulates a traffic light. The program lets the user select one of three lights — red, yellow, or green — using integer inputs. On entering the choice, an appropriate message (\"stop\", \"ready\", or \"go\") should appear in the console.");
		System.out.println("\nWelcome! \nChoose displayed traffic light!");
		System.out.println("Red(1) \nYellow(2) \nGreen(3)");
		System.out.println("\nChoose: ");
		
		int input = sc.nextInt();
		
		switch (input) {
		case 1:
			System.out.println("\n STOP!!");
			break;
		case 2:
			System.out.println("\n READY");
			break;
		case 3:
			System.out.println("\n Go");
			break;
		default:
			System.out.println("\n Choose Proper Input!");
		}
		
		sc.close();	
		
	}
}	
