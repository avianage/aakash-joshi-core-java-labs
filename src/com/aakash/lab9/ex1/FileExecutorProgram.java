package com.aakash.lab9.ex1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FileExecutorProgram {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        try {
            FileInputStream fis = new FileInputStream("source.txt");
            FileOutputStream fos = new FileOutputStream("target.txt");

            CopyDataRunnable task = new CopyDataRunnable(fis, fos);
            executor.submit(task);

        } catch (IOException e) {
            System.err.println("Init error: " + e.getMessage());
        } finally {
            executor.shutdown();
        }
    }
}
