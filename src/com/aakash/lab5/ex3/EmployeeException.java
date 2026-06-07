package com.aakash.lab5.ex3;

public class EmployeeException extends Exception {
    
    // Default constructor
    public EmployeeException() {
        super();
    }

    // Constructor that accepts a custom error message
    public EmployeeException(String message) {
        super(message);
    }
}