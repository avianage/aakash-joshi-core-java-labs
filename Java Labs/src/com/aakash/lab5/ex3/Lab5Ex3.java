package com.aakash.lab5.ex3;

public class Lab5Ex3 {
	public static void checkSalary(double salary) throws EmployeeException {
        if (salary < 3000) {
            // Throw the custom exception
            throw new EmployeeException("Error: Employee salary is below 3000! Current salary: " + salary);
        } else {
            System.out.println("Salary is valid: " + salary);
        }
    }

    public static void main(String[] args) {
        double salary1 = 2500.00;
        double salary2 = 5500.00;

        // Proper exception handling using try-catch
        try {
            System.out.println("--- Checking Employee 1 ---");
            checkSalary(salary1);
        } catch (EmployeeException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

        try {
            System.out.println("\n--- Checking Employee 2 ---");
            checkSalary(salary2);
        } catch (EmployeeException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }
}
