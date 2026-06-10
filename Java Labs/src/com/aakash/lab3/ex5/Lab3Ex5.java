package com.aakash.lab3.ex5;

import java.util.Scanner;

public class Lab3Ex5 {
    public static void main(String[] args) {
        int characterCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your text (Type an empty line and press Enter to finish):");

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            
            if (line.isEmpty()) {
                break;
            }

            lineCount++;
            characterCount += line.length();

            String trimmedLine = line.trim();
            if (!trimmedLine.isEmpty()) {
                String[] words = trimmedLine.split("\\s+");
                wordCount += words.length;
            }
        }

        scanner.close();

        System.out.println("\nText Analysis");
        System.out.println("Total Lines      : " + lineCount);
        System.out.println("Total Words      : " + wordCount);
        System.out.println("Total Characters : " + characterCount);
    }
}
