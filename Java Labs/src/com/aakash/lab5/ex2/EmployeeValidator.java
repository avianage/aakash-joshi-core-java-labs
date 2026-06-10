package com.aakash.lab5.ex2;

import java.util.Scanner;

// 1. User-defined exception class
class InvalidNameException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
    public InvalidNameException(String message) {
        super(message);
    }
}

// 2. Employee class containing the validation logic
class Employee {
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) throws InvalidNameException {
        // Check for null, empty strings, or strings containing only whitespace
        if (firstName == null || firstName.isBlank() || lastName == null || lastName.isBlank()) {
            throw new InvalidNameException("Error: Both First Name and Last Name must contain valid characters and cannot be blank.");
        }
        
        this.firstName = firstName.trim();
        this.lastName = lastName.trim();
    }

    public void displayEmployeeDetails() {
        System.out.println("\n=================================");
        System.out.println("  Employee Registration Success  ");
        System.out.println("=================================");
        System.out.println("Full Name: " + firstName + " " + lastName);
        System.out.println("=================================");
    }
}

// 3. Main driver class to execute and test the program
public class EmployeeValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Employee Registration System ---");
        
        // Prompt user for input
        System.out.print("Enter First Name: ");
        String fName = scanner.nextLine();
        
        System.out.print("Enter Last Name: ");
        String lName = scanner.nextLine();
        
        // Try block to attempt object creation and catch potential validation errors
        try {
            Employee emp = new Employee(fName, lName);
            emp.displayEmployeeDetails();
        } catch (InvalidNameException e) {
            // Gracefully catch and display the user-defined exception message
            System.err.println("\n[Exception Caught] -> " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("\nProgram execution finished.");
        }
    }
}