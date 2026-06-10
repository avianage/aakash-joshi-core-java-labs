package com.aakash.lab9.ex1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDataRunnable implements Runnable {
    private FileInputStream sourceStream;
    private FileOutputStream targetStream;

    public CopyDataRunnable(FileInputStream sourceStream, FileOutputStream targetStream) {
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
                    Thread.sleep(5000);
                }
            }

            if (characterCount % 10 != 0) {
                System.out.println((characterCount % 10) + " remaining characters are copied");
            }
            System.out.println("File copy completed.");

        } catch (IOException | InterruptedException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            try {
                if (sourceStream != null) sourceStream.close();
                if (targetStream != null) targetStream.close();
            } catch (IOException e) {
                System.err.println("Stream close error: " + e.getMessage());
            }
        }
    }
}
