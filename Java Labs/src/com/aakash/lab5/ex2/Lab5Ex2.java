import java.util.Scanner;

// Step 1: Create a user-defined exception
class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

public class EmployeeValidator {

    // Step 2: Method to validate the name
    public static void validateName(String firstName, String lastName) throws InvalidNameException {
        if (firstName == null || firstName.trim().isEmpty()) {
            throw new InvalidNameException("First name cannot be blank or null.");
        }
        if (lastName == null || lastName.trim().isEmpty()) {
            throw new InvalidNameException("Last name cannot be blank or null.");
        }
        System.out.println("Name validated successfully: " + firstName + " " + lastName);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String fName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lName = scanner.nextLine();

        // Step 3: Handle the exception using try-catch
        try {
            validateName(fName, lName);
        } catch (InvalidNameException e) {
            System.err.println("Validation Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
