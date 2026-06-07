package com.aakash.lab5.ex1;

class InvalidAgeException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidAgeException(String message) {
        super(message);
    }
}

public class Lab5Ex1 {
	public static void validateAge(int age) throws InvalidAgeException {
        if (age <= 15) {
            throw new InvalidAgeException("Validation Error: Age must be strictly above 15.");
        } else {
            System.out.println("Success: Age " + age + " is valid.");
        }
    }

    public static void main(String[] args) {
        // 3. Test the validation in a try-catch block
        try {
            validateAge(14); // This will throw the custom exception
        } catch (InvalidAgeException e) {
            System.out.println("Caught the Exception: " + e.getMessage());
        }
        
        try {
            validateAge(20); // This will pass successfully
        } catch (InvalidAgeException e) {
            System.out.println("Caught the Exception: " + e.getMessage());
        }
    }
}
