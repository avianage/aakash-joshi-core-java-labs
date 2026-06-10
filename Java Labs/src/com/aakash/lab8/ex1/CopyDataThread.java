package com.aakash.lab8.ex1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDataThread extends Thread {
    private FileInputStream sourceStream;
    private FileOutputStream targetStream;

    public CopyDataThread(FileInputStream sourceStream, FileOutputStream targetStream) {
        this.sourceStream = sourceStream;
        this.targetStream = targetStream;
    }

    @Override
    public void run() {
        try {
            int byteData;
            int characterCount = 0;

            while ((byteData = sourceStream.read()) != -1) {
                targetStream.write(byteData);
                characterCount++;

                if (characterCount % 10 == 0) {
                    System.out.println("10 characters are copied");
                    Thread.sleep(5000); // 5-second delay
                }
            }

            // Print status for any remaining characters less than 10 at the end
            if (characterCount % 10 != 0) {
                System.out.println((characterCount % 10) + " remaining characters are copied");
            }
            
            System.out.println("File copy operation completed successfully.");

        } catch (IOException e) {
            System.err.println("File Error: " + e.getMessage());
        } catch (InterruptedException e) {
            System.err.println("Thread interrupted: " + e.getMessage());
        } finally {
            // Clean up and close resources safely
            try {
                if (sourceStream != null) sourceStream.close();
                if (targetStream != null) targetStream.close();
            } catch (IOException e) {
                System.err.println("Error closing streams: " + e.getMessage());
            }
        }
    }
}
