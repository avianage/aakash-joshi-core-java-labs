package com.aakash.lab9.ex2;

import java.util.Scanner;

public class JobSeekerValidation {

    public static boolean validateUsername(String username) {
        if (username == null) {
            return false;
        }

        String suffix = "_job";

        if (!username.endsWith(suffix)) {
            return false;
        }

        int suffixIndex = username.lastIndexOf(suffix);
        String leftPart = username.substring(0, suffixIndex);

        return leftPart.length() >= 8;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Jobseeker Registration Validation ---");
        System.out.print("Enter proposed username: ");
        String username = scanner.nextLine();

        boolean isValid = validateUsername(username);
        
        System.out.println("Validation Result: " + isValid);

        scanner.close();
    }
}
