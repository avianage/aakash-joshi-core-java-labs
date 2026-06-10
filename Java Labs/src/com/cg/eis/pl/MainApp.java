package com.cg.eis.pl;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.EmployeeServiceImpl;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        EmployeeService service = new EmployeeServiceImpl();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Employee Medical Insurance System ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees by Insurance Scheme");
            System.out.println("3. Delete Employee");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); 
                    
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    
                    System.out.print("Enter Salary: ");
                    double salary = scanner.nextDouble();
                    scanner.nextLine(); 
                    
                    System.out.print("Enter Designation (System Associate/Programmer/Manager/Clerk): ");
                    String designation = scanner.nextLine();

                    Employee emp = new Employee(id, name, salary, designation);
                    service.addEmployee(emp);
                    System.out.println("Employee Added Successfully!");
                    break;

                case 2:
                    scanner.nextLine();
                    System.out.print("Enter Insurance Scheme to search (Scheme A/Scheme B/Scheme C/No Scheme): ");
                    String scheme = scanner.nextLine();
                    System.out.println("\nEmployees under " + scheme + ":");
                    service.displayEmployeesByScheme(scheme);
                    break;

                case 3:
                    System.out.print("Enter Employee ID to delete: ");
                    int deleteId = scanner.nextInt();
                    if (service.deleteEmployee(deleteId)) {
                        System.out.println("Employee profile deleted successfully.");
                    } else {
                        System.out.println("Employee ID not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting application.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
