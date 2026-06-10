package com.aakash.lab8.ex1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileProgram {
    public static void main(String[] args) {
        String sourcePath = "source.txt";
        String targetPath = "target.txt";

        // Create a dummy source file with sample data for demonstration if it doesn't exist
        File sourceFile = new File(sourcePath);
        if (!sourceFile.exists()) {
            try (FileWriter writer = new FileWriter(sourceFile)) {
                writer.write("ABCDEFGHIJKLMNOPQRSTUVWXYZ123456"); // 32 characters long text
                System.out.println("Created a sample source.txt file with 32 characters.");
            } catch (IOException e) {
                System.err.println("Could not create sample file: " + e.getMessage());
                return;
            }
        }

        try {
            // Instantiate stream objects
            FileInputStream fis = new FileInputStream(sourcePath);
            FileOutputStream fos = new FileOutputStream(targetPath);

            // Create and start the custom background thread
            CopyDataThread copyThread = new CopyDataThread(fis, fos);
            System.out.println("Starting file copy operation via background thread...");
            copyThread.start();

        } catch (IOException e) {
            System.err.println("Initialization Error: " + e.getMessage());
        }
    }
}
